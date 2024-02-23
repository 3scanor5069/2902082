package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import org.ficha2902082.maven.parking.cristian.entities.Registro;
public class Main {
    public static void main(String[] args) {
        //crear dos cupos:
        //clase -> nombde objeto -> = 
      Cupo cupito12 = new Cupo();
      cupito12.ancho = 1.0;
      cupito12.largo = 2.0;
      cupito12.letra = 'A';

      Cupo cupitat = new Cupo('B', 1.0,2.1 );
     Carro cariro = new Carro("AS 1353", TipoVehiculo.TAXI);
     Carro casrar = new Carro();
     casrar.placa = "ASXA 321";
     casrar.tipoVehiculo = TipoVehiculo.CAMIONETA;

     Cliente clis = new Cliente("Esteban", "Espinosa", TipoDocumento.CC, 2120210L, 31440069L);
     Cliente lie = new Cliente("eduardo", "mnrique", TipoDocumento.CC, 878197L, 322647672L);
     // vincular carros al cliente
     clis.addCar(casrar);
 
     clis.addCar("fuyyfd", TipoVehiculo.BUS);
     // vincular carros al cliente2
     lie.addCar(cariro
     );

     List<Registro> misRegistros = new ArrayList<>();

     //instanciar dos registros

    Registro registro1 = new Registro
    (LocalDate.of( 2024, Month.JANUARY, 16),
     LocalTime.of(15, 30, 42) ,
     LocalDate.of(2024,Month.AUGUST, 20),
     LocalTime.of(5, 32, 54),
     642.00, 
     clis.misCarros.get(0),
     cupitat
    );
//
   // Registro registro28 = new Registro(
  //      LocalDate.of(3005, Month.APRIL, 10),
    //     LocalTime.of(20, 7, 200),
      //    LocalDate.of(8000, 10, 14), 
      //    LocalTime.of(1, 47, 512),
       //    50000.00,
        //    lie.misCarros.get(1),
        //     cariro);

             misRegistros.add(registro1);

             for(Registro r : misRegistros)
             System.out.println("Placa:" + r.carro.placa + "/" + "Cupo:" + r.cupo.letra + "/") ;
                
           
}
}