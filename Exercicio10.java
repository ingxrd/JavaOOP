
/*
 * 5️⃣ Time de Futebol
 *
 * Crie uma classe `Jogador` com os atributos:
 * - `nome`
 * - `posicao`
 * - `numeroCamisa`
 *
 * Crie uma classe `Time` que contém um array de `Jogador` e os métodos:
 * ✔️ `adicionarJogador(Jogador jogador)` → Adiciona um jogador ao time.
 * ✔️ `listarJogadores()` → Exibe os jogadores cadastrados.
 * ✔️ `buscarPorPosicao(String posicao)` → Retorna os jogadores que jogam na mesma posição.
 *
 * No `main()`, crie um `Time`, cadastre jogadores e permita buscar jogadores por posição.
 */



 class Jogador{
     String nome;
     String posicao;
     int numeroCamisa;


     public Jogador(String nome, String posicao, int numeroCamisa){
        this.nome = nome;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
     }
 }

 class Time{
    String[] time = new String[11];
 }


 public class Exercicio10{
    public static void main(String[] args) {
        
    }

 }
