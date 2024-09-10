import java.math.BigDecimal;

public class CuentaCorriente extends Cuenta{
    private Double limiteSobreGiro;
    public CuentaCorriente(String titular, BigDecimal saldo, Double limiteSobreGiro) {
        super(titular, saldo);
        this.limiteSobreGiro = limiteSobreGiro;
    }
    public void retirar(BigDecimal monto) {
        if (saldo.subtract(monto).compareTo(new BigDecimal(0)) == -1) {
            BigDecimal saldoNegativo = saldo.subtract(monto);
            if (saldoNegativo.compareTo(new BigDecimal(-limiteSobreGiro)) == -1) {
                System.out.println("No se puede retirar el monto, excede el límite de sobregiro");
            } else {
                saldo = saldo.subtract(monto);
            }
        } else {
            saldo = saldo.subtract(monto);
        }
    }
}
