package Objetos;

import java.util.Calendar;
import java.util.Date;

public class DiasHoras {

    //fecha de la clase
    public Calendar fecha;
    //horas dictadas en la clase
    public int horas;

    //constructor del objeto DiasHoras
    public DiasHoras(Calendar fecha, int horas) {
        this.fecha = fecha;
        this.horas = horas;
    }

    //modificadores de informacion del objeto
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String fecha(){
    String res="";
    Date dias=getFecha().getTime();
    res=(dias.getDate()+"/")+((dias.getMonth()+1)+"/")+(dias.getYear()+1900);
    return res;
    }
    
    


}
