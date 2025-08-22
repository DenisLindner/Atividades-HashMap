import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Map<String, Double> notasFinais = new HashMap<>();
    static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("=== MENU ===\n1 - Adicionar ou Atualizar\n2 - Exibir Relatório\n3 - Calcular Média Geral\n4 - Exportar Relatório CSV\n5 - Sair do Sistema\nEscolha:");
            int opcao = SC.nextInt();
            switch (opcao){
                case 1 -> adicionarOuAtualizarNota();
                case 2 -> exibirRelatorio();
                case 3 -> calcularMediaGeral();
                case 4 -> exportarRelatorioCSV();
                case 5 -> {
                    System.out.println("Saindo do Sistema...");
                    SC.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção Inválida!");
            }
        }
    }

    public static void adicionarOuAtualizarNota(){
        SC.nextLine();
        System.out.println("Insira o nome do Aluno:");
        String nome = SC.nextLine().toUpperCase().trim();

        double nota;
        do {
            System.out.println("Insira a Nota do Aluno:");
            nota = SC.nextDouble();
            if (nota < 0 || nota > 10){
                System.out.println("Nota Inválida(0 - 10)!");
            }
        } while (nota < 0 || nota > 10);

        notasFinais.put(nome, nota);
        System.out.println("Concluido com Sucesso!");
    }

    public static void exibirRelatorio(){
        if (notasFinais.isEmpty()){
            System.out.println("Nenhum Aluno Cadastrado!");
            return;
        }

        List<Map.Entry<String , Double>> valores = relatorioDescresente();

        System.out.println("Alunos:");
        for(Map.Entry<String, Double> valor : valores){
            System.out.println("NOME: "+valor.getKey());
            System.out.println("NOTA: "+valor.getValue()+"\n");
        }
    }

    public static void calcularMediaGeral(){
        if (notasFinais.isEmpty()){
            System.out.println("Nenhum Aluno Cadastrado!");
            return;
        }

        double soma = 0;
        for(Map.Entry<String, Double> valor : notasFinais.entrySet()){
            soma += valor.getValue();
        }

        System.out.printf("\nA média Geral da Turma é: %.2f%n", (soma/notasFinais.size()));
    }

    public static void exportarRelatorioCSV(){
        if (notasFinais.isEmpty()){
            System.out.println("Nenhum Aluno Cadastrado!");
            return;
        }

        String filePath = "relatorio.csv";

        try (PrintWriter write = new PrintWriter(filePath)){
            write.println("Nome,Nota");

            List<Map.Entry<String, Double>> valores = relatorioDescresente();
            for (Map.Entry<String, Double> valor : valores){
                write.println(valor.getKey()+","+valor.getValue());
            }
            System.out.println("Arquivo Exportado com Sucesso!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Map.Entry<String, Double>> relatorioDescresente(){
        List<Map.Entry<String , Double>> valores = new ArrayList<>(notasFinais.entrySet());

        valores.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        return valores;
    }
}