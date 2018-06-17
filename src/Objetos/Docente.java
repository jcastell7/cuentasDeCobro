package Objetos;

import java.util.ArrayList;
import java.util.Calendar;


public class Docente {
private String docente;
private String ID;
private String correo;
private String cuentaBancaria;
private String modulo;
private Calendar [][]diasYHoras;
private int valorHora;
private String programa;
private String promocion;
private String grupo;
private int semestre;
private String asignatura;
private String coordinador;

    public Docente(String docente, String ID, String correo, String cuentaBancaria, String modulo, Calendar[][] diasYHoras, int valorHora, String programa, String promocion, String grupo, int semestre, String asignatura, String coordinador) {
        this.docente = docente;
        this.ID = ID;
        this.correo = correo;
        this.cuentaBancaria = cuentaBancaria;
        this.modulo = modulo;
        this.diasYHoras = diasYHoras;
        this.valorHora = valorHora;
        this.programa = programa;
        this.promocion = promocion;
        this.grupo = grupo;
        this.semestre = semestre;
        this.asignatura = asignatura;
        this.coordinador = coordinador;
    }

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public Calendar[][] getDiasYHoras() {
        return diasYHoras;
    }

    public void setDiasYHoras(Calendar[][] diasYHoras) {
        this.diasYHoras = diasYHoras;
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

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
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

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }





}
