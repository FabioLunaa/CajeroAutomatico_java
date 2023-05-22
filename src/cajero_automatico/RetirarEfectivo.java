package cajero_automatico;
public class RetirarEfectivo extends ClasePrincipal {

    @Override
    public void Transacciones() {
        
        System.out.print("Cuanto deseas retirar: ");
        Retiros();
        if (retiro <= getSaldo()) {
            transacción = getSaldo();
            setSaldo(transacción - retiro);//Con metodo setSaldo hacemos la operatoria de retiro(resta)
            System.out.println("----------------------------------------");
            System.out.println   ("Retiraste: " + retiro); 
            System.out.println   ("Tu saldo actual es de: " + getSaldo());
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println  ("Supera el límite disponible");
            System.out.println("-----------------------------------------");
        }
    }
}
