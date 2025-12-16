package classobj;

public class LivroMain {
	public static void main(String[] args) {
		// Criando 5 objetos da classe Livro
        System.out.println("Criando 5 objetos Livro:");
        
        Livro livro1 = new Livro("A Bússola de Ouro", "Philip Pullman", 376);
        Livro livro2 = new Livro("O Nome do Vento", "Patrick Rothfuss", 650);
        Livro livro3 = new Livro("1984", "George Orwell", 328);
        Livro livro4 = new Livro("Ensaio sobre a Cegueira", "José Saramago", 310);
        Livro livro5 = new Livro("Neuromancer", "William Gibson", 271);
        
        System.out.println("---");
        
        // Armazenando os livros em um array
        Livro[] estante = {livro1, livro2, livro3, livro4, livro5};
        
        // Testando os métodos getter para exibir as informações iniciais
        
        for (int i = 0; i < estante.length; i++) {
            Livro livro = estante[i];
            System.out.println("Livro " + (i + 1) + ":");
            System.out.println("  Título: " + livro.getTitulo());
            System.out.println("  Autor: " + livro.getAutor());
            System.out.println("  Páginas: " + livro.getNumPags());
            System.out.println("---");
        }
        
        // Testando os métodos setter: alterando o título e o número de páginas de um livro
        
        // Altera o título
        livro3.setTitulo("A Revolução dos Bichos");
        
        // Altera o número de páginas
        livro3.setNumPags(152);
        
        System.out.println("Novos dados do Livro 3 (usando getters para verificar):");
        System.out.println("  Novo Título: " + livro3.getTitulo());
        System.out.println("  Novo Autor: " + livro3.getAutor());
        System.out.println("  Novas Páginas: " + livro3.getNumPags());
        System.out.println("---");
        
        // Exemplo adicional: alterando o autor do Livro 5
        System.out.println("Alterando Autor do Livro 5: '" + livro5.getAutor() + "'");
        livro5.setAutor("Um Novo Autor");
        System.out.println("Novo Autor do Livro 5: " + livro5.getAutor());
	}
}
