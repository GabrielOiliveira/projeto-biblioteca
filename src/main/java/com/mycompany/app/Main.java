import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        
        try {
            Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + dataRetirada);
        System.out.println("Data de Devolucao: " + dataDevolucao);
    }
}
