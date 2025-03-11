import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;
    
    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new ArrayList<>();
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }
    
    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> livrosPorGenero = new ArrayList<>();
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                livrosPorGenero.add(livro);
            }
        }
        return livrosPorGenero;
    }
    
    public void adicionarLivro(Livro livro) {
        obrasPublicadas.add(livro);
    }
}
