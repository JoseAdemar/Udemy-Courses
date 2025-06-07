import java.util.Arrays;
import java.util.List;

public class ProdutoCartesianoMain {
    public static void main(String[] args) {
        List<String> alunos = Arrays.asList("Ana", "Bruno");
        List<String> cursos = Arrays.asList("Física", "História");

        for (String aluno : alunos) {
            for (String curso : cursos) {
                System.out.println(aluno + " - " + curso);
            }
        }
    }
}
