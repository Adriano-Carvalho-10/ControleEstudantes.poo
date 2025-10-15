public class Disciplina implements Comparable<Disciplina> {
    private String codigo;
    private String nome;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina d = (Disciplina) o;
        return codigo.equalsIgnoreCase(d.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.toLowerCase().hashCode();
    }

    @Override
    public int compareTo(Disciplina o) {
        return this.nome.compareToIgnoreCase(o.nome);
    }

    @Override
    public String toString() {
        return codigo + " - " + nome;
    }
}