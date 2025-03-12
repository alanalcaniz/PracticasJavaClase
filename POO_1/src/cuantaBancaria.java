public class cuantaBancaria {
    private String titular;
    private int saldo=0;

    public cuantaBancaria(String titular,int saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //---------------
    public String mostrarInfo(){
        return "Nombre: "+titular+", Saldo: "+saldo;
    }

    public void ingresarSaldo(int addSaldo){
        saldo=saldo+addSaldo;
    }

    public void retirarSaldo(int restSaldo){
        saldo=saldo-restSaldo;
    }
}
