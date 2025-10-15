import java.util.*;
import java.util.stream.Collectors;

public class HistoricoNotas {
    private Map<Integer, List<Matricula>> matriculas = new HashMap<>();

    public void adicionarMatricula(int idEstudante, String codigoDisciplina, double nota) {
        matriculas.computeIfAbsent(idEstudante, k -> new ArrayList<>())
                .add(new Matricula(codigoDisciplina, nota));
    }

    public List<Matricula> obterMatriculas(int idEstudante) {
        return matriculas.getOrDefault(idEstudante, new ArrayList<>());
    }

    public Optional<Double> obterNota(int idEstudante, String codigoDisciplina) {
        return matriculas.getOrDefault(idEstudante, new ArrayList<>())
                .stream()
                .filter(m -> m.getCodigoDisciplina().equalsIgnoreCase(codigoDisciplina))
                .map(Matricula::getNota)
                .findFirst();
    }

    public void removerMatricula(int idEstudante, String codigoDisciplina) {
        List<Matricula> lista = matriculas.get(idEstudante);
        if (lista != null) lista.removeIf(m -> m.getCodigoDisciplina().equalsIgnoreCase(codigoDisciplina));
    }

    public double mediaDoEstudante(int idEstudante) {
        List<Matricula> lista = matriculas.get(idEstudante);
        if (lista == null || lista.isEmpty()) return 0.0;
        return lista.stream().mapToDouble(Matricula::getNota).average().orElse(0.0);
    }

    public double mediaDaDisciplina(String codigoDisciplina) {
        List<Double> notas = matriculas.values().stream()
                .flatMap(List::stream)
                .filter(m -> m.getCodigoDisciplina().equalsIgnoreCase(codigoDisciplina))
                .map(Matricula::getNota)
                .collect(Collectors.toList());
        if (notas.isEmpty()) return 0.0;
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public List<Map.Entry<Integer, Double>> topNEstudantesPorMedia(int n) {
        return matriculas.keySet().stream()
                .map(id -> Map.entry(id, mediaDoEstudante(id)))
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(n)
                .collect(Collectors.toList());
    }
}
