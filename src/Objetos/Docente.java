package Objetos;

public class Docente {

    //nombre del docente
    private String docente;
    //cedula del docente
    private String ID;
    //cuenta bancaria del docente
    private String cuentaBancaria;

    //modificadores de la informacion del objeto
    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
