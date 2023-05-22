package cajero_automatico;
//con extends hacemos la herencia con la calse q queremos comunicarnos.
public class ConsultaDeSaldo extends ClasePrincipal {
    
//con @Override sobbreescribbimos un metodo(Transacciones)de otra clase y utilizamos su logica.
    @Override
    public void Transacciones (){
        System.out.println("--------------------------------------");
        //colocamos getSaldo xq es el q contendra el valor inicial de saldo.
        System.out.println("Su saldo actual es: " + getSaldo());
        System.out.println("--------------------------------------");
    }
}

