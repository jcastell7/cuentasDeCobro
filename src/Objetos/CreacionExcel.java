package Objetos;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreacionExcel {

    private JFileChooser escoger;
    Window w;
    int status;
    Modulo modulo;
    Docente docente;
    public CreacionExcel() {
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void abrirDirectorio() {
        escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_ONLY);
        w = new Window(null);
        CopiarArchivo();
    }

    public static void cp(String archivoOrigen, String archivoDestino) throws IOException {
        FileInputStream copiarDesde = null;
        FileOutputStream copiarA = null;

        try {
            copiarDesde = new FileInputStream(archivoOrigen);
            copiarA = new FileOutputStream(archivoDestino);
            byte[] buffer = new byte[4096];
            int lecturaBytes;

            while ((lecturaBytes = copiarDesde.read(buffer)) != -1) {
                copiarA.write(buffer, 0, lecturaBytes);
            }
            System.out.println("El archivo se ha copiado correctamente.");
        } finally {
            if (copiarDesde != null) {
                try {
                    copiarDesde.close();
                } catch (IOException IOE) {
                    System.out.println(IOE.getMessage());
                }
            }
            if (copiarA != null) {
                try {
                    copiarA.close();
                } catch (IOException IOE) {
                    System.out.println(IOE.getMessage());
                }
            }
        }
    }

    public void CopiarArchivo() {
        status = escoger.showOpenDialog(null);
        if (status == escoger.APPROVE_OPTION) {
            try {
                String ruta = "src/Archivos/cuentaOriginal.xlsx";
                String rutaFinal = "";
                rutaFinal = escoger.getSelectedFile().getAbsolutePath();
                cp(ruta, rutaFinal+ ".xlsx");
                modificarExcel(rutaFinal + ".xlsx");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
            }
        } else {
            w.dispose();
        }
    }
public void llenarTablas(XSSFSheet my_worksheet){
                    int longitud = modulo.getDiasYHoras().size();
        if (longitud > 4) {
            for (int i = 0; i < 4; i++) {
                DiasHoras horas = modulo.getDiasYHoras().get(i);
                my_worksheet.getRow(i+33).getCell(5).setCellValue(horas.fecha());
                my_worksheet.getRow(i+33).getCell(7).setCellValue(horas.getHoras());
            }
            for (int i = 4; i < longitud; i++) {
                DiasHoras horas = modulo.getDiasYHoras().get(i);
                my_worksheet.getRow(i+29).getCell(12).setCellValue(horas.fecha());
                my_worksheet.getRow(i+29).getCell(16).setCellValue(horas.getHoras());
                
            }
        } else {
            for (int i = 0; i <longitud; i++) {
                DiasHoras horas = modulo.getDiasYHoras().get(i);
                my_worksheet.getRow(i+33).getCell(5).setCellValue(horas.fecha());
                my_worksheet.getRow(i+33).getCell(7).setCellValue(horas.getHoras());
            }
        }
}
    public void modificarExcel(String ruta) {
        try {
            FileInputStream archivo = new FileInputStream(new File(ruta));
            XSSFWorkbook cuentaCobro = new XSSFWorkbook(archivo);
            XSSFSheet my_worksheet = cuentaCobro.getSheetAt(0);
            my_worksheet.getRow(5).getCell(16).setCellValue(modulo.fecha().toUpperCase());
            my_worksheet.getRow(12).getCell(7).setCellValue(docente.getDocente().toUpperCase());
            my_worksheet.getRow(14).getCell(7).setCellValue(docente.getID());
            my_worksheet.getRow(16).getCell(7).setCellValue(modulo.getCorreoCoordinador());
            my_worksheet.getRow(18).getCell(7).setCellValue(modulo.getPrograma().toUpperCase());
            my_worksheet.getRow(20).getCell(7).setCellValue(docente.getCuentaBancaria());
            my_worksheet.getRow(22).getCell(3).setCellValue(modulo.getNumeroDeImputacion().toUpperCase());
            my_worksheet.getRow(25).getCell(3).setCellValue(modulo.concepto().toUpperCase());
            my_worksheet.getRow(30).getCell(5).setCellValue(modulo.getModulo().toUpperCase());
            llenarTablas(my_worksheet);
            my_worksheet.getRow(38).getCell(7).setCellValue(modulo.totalHoras());
            my_worksheet.getRow(38).getCell(16).setCellValue(modulo.getValorHora());
            my_worksheet.getRow(40).getCell(11).setCellValue((modulo.totalHoras() * modulo.getValorHora()));
            my_worksheet.getRow(41).getCell(11).setCellValue(modulo.getTransporteInt());
            my_worksheet.getRow(42).getCell(11).setCellValue(((modulo.totalHoras() * modulo.getValorHora()) + modulo.getTransporteInt()));
            String a = ConversionNumerosLetras.convertNumberToLetter((modulo.totalHoras() * modulo.getValorHora()) + modulo.getTransporteInt());
            my_worksheet.getRow(51).getCell(6).setCellValue(a.substring(2, a.length()));
            my_worksheet.getRow(54).getCell(2).setCellValue(modulo.getObservaciones());
            my_worksheet.getRow(61).getCell(9).setCellValue(modulo.getNombreCoordinador());
            archivo.close();
            FileOutputStream output_file = new FileOutputStream(new File(ruta));
            cuentaCobro.write(output_file);
            output_file.close();
        } catch (Exception e) {
            Logger.getLogger(CreacionExcel.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
