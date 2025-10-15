import java.util.*;

public class ListaEstudantes {
    private List<Estudante> estudantes = new ArrayList<>();

    public void adicionarEstudante(Estudante e) {
        estudantes.add(e);
    }

    public void removerEstudantePorId(int id) {
        estudantes.removeIf(e -> e.getId() == id);
    }

    public Estudante obterEstudantePorIndice(int indice) {
        return estudantes.get(indice);
    }

    public List<Estudante> buscarEstudantesPorNome(String substring) {
        List<Estudante> resultado = new ArrayList<>();
        for (Estudante e : estudantes) {
            if (e.getNome().toLowerCase().contains(substring.toLowerCase())) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public void ordenarEstudantesPorNome() {
        estudantes.sort(Comparator.comparing(Estudante::getNome));
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
}