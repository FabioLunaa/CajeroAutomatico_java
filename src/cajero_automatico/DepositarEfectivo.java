package cajero_automatico;
public class DepositarEfectivo extends ClasePrincipal {

    @Override
    public void Transacciones() {

        System.out.println("Cuánto deseas depositar: ");
    //En el metodo Deposito() y dentro de su variable declarada - deposito- se guarda lo q usuario responda.
        Depositos();
        
        if (deposito >= 1) {
            transacción = getSaldo();//Se guarda en transaccion el vlaor q tenga getSaldo()q es la variable saldo
            setSaldo(transacción + deposito);
            System.out.println("---------------------------------");
            System.out.println  ("Depositaste: " + deposito);
            System.out.println  ("Su saldo actual es: " + getSaldo());
            System.out.println("---------------------------------");

        } else {
            System.out.println("--------------------------------------------");
            System.out.println("Debes depositar un valor igual o mayor a 1");
            System.out.println("--------------------------------------------");
        }
    }
}
