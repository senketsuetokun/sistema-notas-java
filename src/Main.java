import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        double somaMedias = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {

            System.out.println("\n--- Aluno " + i + " ---");

            System.out.print("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            // Média das duas notas
            double media = (nota1 + nota2) / 2;

            // Exemplo: média final igual à média das notas
            double mediaFinal = media;

            // Soma para calcular a média completa da turma
            somaMedias += mediaFinal;

            // Situação do aluno
            String situacao;

            if (mediaFinal >= 7) {
                situacao = "APROVADO";
            } else {
                situacao = "REPROVADO";
            }

            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Média final: " + mediaFinal);
            System.out.println("Situação: " + situacao);
        }

        // Média geral da turma
        double mediaTurma = somaMedias / quantidadeAlunos;

        System.out.println("\n==============================");
        System.out.println("MÉDIA COMPLETA DA TURMA: " + mediaTurma);
        System.out.println("==============================");

        scanner.close();
    }
}


Regra usada: média final ≥ 7 → Aprovado; abaixo de 7 → Reprovado.

void main() {
}