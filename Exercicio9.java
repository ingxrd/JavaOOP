import java.util.Arrays;
import java.util.Scanner;

class Aluno {
    String nome;
    int matricula;
    String cursoMatricula;
    String[] disciplinas = new String[3];
    double[] notas = new double[3];

    public Aluno(String nome, int matricula, String cursoMatricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursoMatricula = cursoMatricula;
    }

    void informacoesAluno(Scanner scanner) {
        System.out.println("Digite 3 disciplinas e suas respectivas notas:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Disciplina " + (i + 1) + ": ");
            disciplinas[i] = scanner.nextLine();
            System.out.print("Nota para " + disciplinas[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir quebra de linha
        }

        System.out.println("\nDisciplinas e notas:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Disciplina: " + disciplinas[i] + " | Nota: " + notas[i]);
        }
    }

    void verificarAprovacao() {
        for (int i = 0; i < 3; i++) {
            if (notas[i] >= 7) {
                System.out.println("Aluno aprovado em " + disciplinas[i]);
            } else {
                System.out.println("Aluno reprovado em " + disciplinas[i]);
            }
        }
    }
}

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        Aluno aluno1 = new Aluno(nome, matricula, curso);
        
        aluno1.informacoesAluno(scanner);
        aluno1.verificarAprovacao();

        scanner.close();
    }
}
