package org.ficha2902082.maven.parking.cristian.entities;

public class Cupo {

    public char letra;
    public double largo;
    public double  ancho;

    //es un metdo especial en una enidad :
    //-se ejecuta auto cuando se crea(instanciar) un objeto 
    //sirve para INICIALIZAR(dar valores iniiales) el objeto
    //constructor por efecto

    public Cupo() {
    }

    //constructor con parametros

    public Cupo(char letra, double largo, double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }




}
