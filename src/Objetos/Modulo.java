package Objetos;

import java.util.ArrayList;
import java.util.Calendar;

public class Modulo {

    //objeto Docente
    private Docente docente;
    //nombre del modulo
    private String modulo;
    //array de DiasHoras donde estan guardadas las fechas y las horas dictadas por el docente
    private ArrayList<DiasHoras> diasYHoras;
    //valor de la hora catedra
    private int valorHora;
    //nombre del programa 
    private String programa;
    //grupo del modulo que se dicto
    private String grupo;
    //semestre del grupo, no es informacion primordial pero se puede agregar para una futura version
    private int semestre;
    //concepto de la cuenta de cobro
    private String concepto;
    //nombre del coordinador del programa, no es informacion primordial pero se puede agregar para una futura version
    private String coordinador;
    //fecha de escritura del formato
    private Calendar fechaCreacion;
    //correo del coordinador del programa
    private String correoCoordinador;
    //nombre del coordinador del programa
    private String nombreCoordinador;
    //numero de imputacion de la cuenta
    private String numeroDeImputacion;
    //valor del transporte interno
    private int transporteInt;
    //observaciones a la cuenta de cobro
    private String Observaciones;

    public Modulo() {
        //al crear un objeto Modulo nuevo se inicializa un nuevo array de diasYHoras
        diasYHoras = new ArrayList();
    }

    //modificadores de la informacion del objeto
    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public ArrayList<DiasHoras> getDiasYHoras() {
        return diasYHoras;
    }

    public int getTransporteInt() {
        return transporteInt;
    }

    public void setTransporteInt(int transporteInt) {
        this.transporteInt = transporteInt;
    }

    public String getNumeroDeImputacion() {
        return numeroDeImputacion;
    }

    public void setNumeroDeImputacion(String numeroDeImputacion) {
        this.numeroDeImputacion = numeroDeImputacion;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getCorreoCoordinador() {
        return correoCoordinador;
    }

    public void setCorreoCoordinador(String correoCoordinador) {
        this.correoCoordinador = correoCoordinador;
    }

    public String getNombreCoordinador() {
        return nombreCoordinador;
    }

    public void setNombreCoordinador(String nombreCoordinador) {
        this.nombreCoordinador = nombreCoordinador;
    }
    

    //devuelve la cantidad de horas almacenadas en el array de diasYHoras
    public int totalHoras() {
        int total = 0;
        diasYHoras.size();
        for (int i = 0; i < diasYHoras.size(); i++) {
            DiasHoras diasHoras = diasYHoras.get(i);
            total += diasHoras.getHoras();
        }
        return total;
    }

    //se recibe la fecha y la hora y se crea un nuevo objeto DiasHoras para agregarlo al final del array
    public void AgregarFechaHora(Calendar fecha, int horas) {
        this.diasYHoras.add(new DiasHoras(fecha, horas));
    }
    
    public String concepto(){
    String s;
    s=totalHoras()+" HORAS DICTADAS EN LA ASIGNATURA "+'"'+getModulo().toUpperCase()
            +'"'+" DEL PROGRAMA DE "+getPrograma().toUpperCase()+" GRUPO "+getGrupo().toUpperCase();
    return s;
    }
    public String fecha(){
    Calendar fecha=getFechaCreacion();
    String mes=ConversionNumerosLetras.mesALetras((fecha.get(Calendar.MONTH)+1));
    String res=(fecha.get(Calendar.DAY_OF_MONTH)+"/")+(mes+"/")+(fecha.get(Calendar.YEAR));
    return res;
    }
}
