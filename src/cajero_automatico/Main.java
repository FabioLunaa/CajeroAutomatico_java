package cajero_automatico;
public class Main {

    public static void main(String[] args) {
/*Aquí mandamos a llamar a ClasePrincipal y hacemos la instancia con ConsultaDeSaldo*/
        ClasePrincipal mensajeroconsulta = new ConsultaDeSaldo();
 //Le decimos al programa con cuanto saldo va a iniciar.
        mensajeroconsulta.setSaldo(500);
 //Aquí llamammos al metodo Opciones de la clase prinipal q tiene la logica principal del programa.
        mensajeroconsulta.Opciones();
    }
}
