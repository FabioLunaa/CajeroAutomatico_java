package cajero_automatico;
import java.util.Scanner;
public abstract class ClasePrincipal {

    Scanner entrada = new Scanner(System.in);

    protected int transacción, retiro, deposito;//declaro variables globales.
    private static int saldo;//variable global static

    public void Opciones() {
        int seleccion = 0;//variables locales inicializadas
        int bandera = 0;

        do {//el metodo do-while me ayuda a la seleccion q haga el usuario 
            do {
                System.out.println("    ---  Elija una opcion  --- ");
                System.out.println("");
                System.out.println("1.      Consulta de saldo");
                System.out.println("2.      Deposito de efectivo");
                System.out.println("3.      Retiro de efectivo");
                System.out.println("4.      Salir");
            //pongo seleccion ya q es el q me ayuda a saber q selecciona el Usuario.    
                seleccion = entrada.nextInt();
           //con estructura condcional sabemos q tenemos para seleccionar
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("--------------------------------------");
                    System.out.println("La opcion no existe, Porfavor seleccione otra opción");
                    System.out.println("--------------------------------------");

                }
           //while nos dice q mientras no sucesa esto no sale de la estructura
            } while (bandera == 0);
       // este if corresponde a un nuevo do-while q es el ultimo q ahora aparece.
            if (seleccion == 1) {
        //invocamos la clase principal y a la clase q queremos
             ClasePrincipal mensajero = new ConsultaDeSaldo();
        //llamamos a este metodo para q realice lo q esta dentro de esa clase.
             mensajero.Transacciones();
             
            } else if (seleccion == 2) {
       //invocamos la clase principal y a la clase q queremos
                ClasePrincipal mensajero = new DepositarEfectivo();
       //llamamos a este metodo para q realice lo q esta dentro de esa clase.
                mensajero.Transacciones();

            } else if (seleccion == 3) {
                ClasePrincipal mensajero = new RetirarEfectivo();
                mensajero.Transacciones();

            } else if (seleccion == 4) {
                System.out.println("¡Gracias! vuelva pronto.");
     //esta bandera nos dice q termina el ciclo ya q no se eligió otra opcion           
                bandera = 2;
            }
        } while (bandera != 2);//este es del ultimo do-while al darse bander=2, acá termina el programa
    }
    public void Retiros(){//aquí inicamos los metodos q conectaran con las difer. clases.
        retiro = entrada.nextInt();
    }
    public void Depositos(){
        deposito = entrada.nextInt();
    }
    public abstract void Transacciones();
        
//los metodos setter y getter ayudan a que las demas clases obtengan las variables q son private.
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int aSaldo) {
        saldo = aSaldo;
    }
}

