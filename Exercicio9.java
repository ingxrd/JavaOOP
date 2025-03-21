
import java.util.Arrays;
import java.util.Scanner;




class Aluno {
/*  Escreva uma classe para representar um Aluno. 
 * Adicione atributos relacionados às características de um Aluno, como nome,matricula, 
 * curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. 
 * */
    String nome; 
    int matricula;
    String cursoMatricula;
    String[] disciplinas =  new String[3];
    double[] notas = new double[3];

    public Aluno(String nome, int matricula, String cursoMatricula, String disciplinas[], double notas[]) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursoMatricula = cursoMatricula;
        this.disciplinas = Arrays.copyOf(disciplinas, disciplinas.length);
        this.notas = Arrays.copyOf(notas, notas.length);
    }
 

    void informacoesAluno(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 3 disciplinas e suas consecutivas notas");
        for (int i = 0; i < 3; i++){
            System.out.println("Disciplina " + (i+1) + ": ");
            disciplinas[i] = scanner.nextLine();
            System.out.println("Nota para " + disciplinas[i] + " : ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Disciplinas e notas: ");
        for (int i = 0; i < 3; i++){
            System.out.println("Disciplinas: " + disciplinas[i] + " Notas: "+  notas[i]);
        }
    }

    void verificarAprovacao(){
        for (int i = 0; i < 3; i++){
            if (notas[i] > 7){
                System.out.println("Aluno aprovado em" + disciplinas[i]);
            } else {
                System.out.println("Aluno reprovado em: " + disciplinas[i]);
            }
        }
    }
}





/*
 * Exercício 03 - Desenvolva um método para verificar se o 
 * aluno está aprovado(nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, 
 * 
 * que pede as informações do aluno ao usuário e ao final informal o nome das disciplinas mostra as notas e mostra se o aluno foi 
 * aprovado ou não.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Matricula");
        int matricula = scanner.nextInt();
         scanner.nextLine();
         System.out.print("Curso: " );
         scanner.nextLine();

         Aluno aluno1 = new Aluno(nome, matricula, nome, args, null);

         aluno1.informacoesAluno();
         aluno1.verificarAprovacao();
         scanner.close();   

    
        
    }

}