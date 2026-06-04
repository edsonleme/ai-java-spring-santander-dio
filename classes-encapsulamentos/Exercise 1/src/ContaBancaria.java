public class ContaBancaria {
    double numeroConta;
    double saldo;
    double depositoInicial;
    double limite;



    //criar conta
    public void criarConta(double depositoInicial) {
       this.depositoInicial = depositoInicial;

       if  (depositoInicial <= 500) {
           limite = 50;
       } else if (depositoInicial >= 500) {
           limite = depositoInicial * 2;
       }
    }


    // Consultar chequeEspecial
    public double consultarChequeEspecial(){
        var especial = getLimite();
        return especial;
    }


    //getters and setters
    public double getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getDepositoInicial(){
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial){
        this.depositoInicial = depositoInicial;
    }

    public double getLimite() {
        return limite;
    }

}
