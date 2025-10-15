import java.util.*;

public class CadastroDisciplinas {
    private Set<Disciplina> disciplinas = new LinkedHashSet<>();

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public boolean verificarDisciplina(String codigo) {
        return disciplinas.stream().anyMatch(d -> d.getCodigo().equalsIgnoreCase(codigo));
    }

    public void removerDisciplina(String codigo) {
        disciplinas.removeIf(d -> d.getCodigo().equalsIgnoreCase(codigo));
    }

    public Set<Disciplina> obterTodasDisciplinas() {
        return disciplinas;
    }
}
