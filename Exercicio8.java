
class ContaCorrente{
//          *  Exercício 02 - Cria uma classe para representar uma conta corrente que possui um número,um saldo, um status,  
// um status que informa se ela é especial ou não, um limite. 
        int numeroConta;
        String nome;
        String banco;
        double saldo;
        double saque;
        boolean tipoContaEspecial;
        double limite;  

        // vou usar o construtor pra poder instanciar

        public ContaCorrente(int numeroConta, String nome, String banco, double Saldo, boolean tipoContaEspecial, double limite){
            this.numeroConta = numeroConta;
            this.nome = nome;
            this.banco = banco;
            this.saldo = saldo;
            this.tipoContaEspecial = tipoContaEspecial;
            this.limite = tipoContaEspecial ? limite : 0;
        }

        /*
         * Desenvolva métodos para realizar saque(verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e 
         * verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.
         */

        void realizarSaque (double valor) {
            if (valor < 0) {
                System.out.println("Por favor, insira um valor válido, maior que 0");
                return;
            }

            double saldoDisponivel = saldo + (tipoContaEspecial ? limite : 0); // conta especial = limite especial, cheque especial. 

            if (valor < saldoDisponivel){
                saldo = saldo - valor; 
                System.out.println("Saque realizado com sucesso! O seu novo saldo: " + saldo);
            } else {
                System.out.println("Valor requisitado é maior do que o saldo disponível. ");
                System.err.println("Saldo: " + saldo);
            }
        }

        void realizarDeposito(double valorDeposito) {
            if (valorDeposito > 0){
                saldo = saldo + valorDeposito;
                System.out.println("Deposito realizado com sucesso. Seu novo saldo é de: " + saldo);
            } else {
                System.out.println("Insira um valor válido positivo para realizar o deposito. ");
            }
        }

        void consultarSaldo() {
            System.out.println("Saldo: " + saldo);
        }
    }


public class Exercicio8 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1234, "Ingrid Munhoz", "Nubank", 13435.98, false, 0);
        conta1.consultarSaldo();
        conta1.realizarDeposito(150);
        conta1.realizarSaque(34);


    }
}
