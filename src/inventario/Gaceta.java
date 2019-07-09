/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.Date;

/**
 *
 * @author Richie
 */
public class Gaceta {

    private int id;
    private int numeroGaceta;
    private int paginasEjemplar;
    private String tipo;
    private Date fechaEjemplar;
    private String archivoDigital;
    private int numeroTomo;
    private Date fechaRecepcion;
    private String persona;
    private int numeroEjemplares;
    private int ejemplaresHemeroteca;
    private int entregadaDirector;
    private int entregadaHemeroteca;
    private int entregadaRuta;
    private int entregadaModulo;
    private int entregadaSuscripciones;

    public Gaceta(int id, int numeroGaceta, int paginasEjemplar, String tipo, Date fechaEjemplar, String archivoDigital, int numeroTomo, Date fechaRecepcion, String persona, int numeroEjemplares, int ejemplaresHemeroteca, int entregadaDirector, int entregadaHemeroteca, int entregadaRuta, int entregadaModulo, int entregadaSuscripciones) {
        this.id = id;
        this.numeroGaceta = numeroGaceta;
        this.paginasEjemplar = paginasEjemplar;
        this.tipo = tipo;
        this.fechaEjemplar = fechaEjemplar;
        this.archivoDigital = archivoDigital;
        this.numeroTomo = numeroTomo;
        this.fechaRecepcion = fechaRecepcion;
        this.persona = persona;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresHemeroteca = ejemplaresHemeroteca;
        this.entregadaDirector = entregadaDirector;
        this.entregadaHemeroteca = entregadaHemeroteca;
        this.entregadaRuta = entregadaRuta;
        this.entregadaModulo = entregadaModulo;
        this.entregadaSuscripciones = entregadaSuscripciones;
    }

    public Gaceta() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroGaceta() {
        return numeroGaceta;
    }

    public void setNumeroGaceta(int numeroGaceta) {
        this.numeroGaceta = numeroGaceta;
    }

    public int getPaginasEjemplar() {
        return paginasEjemplar;
    }

    public void setPaginasEjemplar(int paginasEjemplar) {
        this.paginasEjemplar = paginasEjemplar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaEjemplar() {
        return fechaEjemplar;
    }

    public void setFechaEjemplar(Date fechaEjemplar) {
        this.fechaEjemplar = fechaEjemplar;
    }

    public String getArchivoDigital() {
        return archivoDigital;
    }

    public void setArchivoDigital(String archivoDigital) {
        this.archivoDigital = archivoDigital;
    }

    public int getNumeroTomo() {
        return numeroTomo;
    }

    public void setNumeroTomo(int numeroTomo) {
        this.numeroTomo = numeroTomo;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getEjemplaresHemeroteca() {
        return ejemplaresHemeroteca;
    }

    public void setEjemplaresHemeroteca(int ejemplaresHemeroteca) {
        this.ejemplaresHemeroteca = ejemplaresHemeroteca;
    }

    public int getEntregadaDirector() {
        return entregadaDirector;
    }

    public void setEntregadaDirector(int entregadaDirector) {
        this.entregadaDirector = entregadaDirector;
    }

    public int getEntregadaHemeroteca() {
        return entregadaHemeroteca;
    }

    public void setEntregadaHemeroteca(int entregadaHemeroteca) {
        this.entregadaHemeroteca = entregadaHemeroteca;
    }

    public int getEntregadaRuta() {
        return entregadaRuta;
    }

    public void setEntregadaRuta(int entregadaRuta) {
        this.entregadaRuta = entregadaRuta;
    }

    public int getEntregadaModulo() {
        return entregadaModulo;
    }

    public void setEntregadaModulo(int entregadaModulo) {
        this.entregadaModulo = entregadaModulo;
    }

    public int getEntregadaSuscripciones() {
        return entregadaSuscripciones;
    }

    public void setEntregadaSuscripciones(int entregadaSuscripciones) {
        this.entregadaSuscripciones = entregadaSuscripciones;
    }
}
