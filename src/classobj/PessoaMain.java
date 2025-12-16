package classobj;

public class PessoaMain {

	public static void main(String[] args) {
		
		//Criaçao de 5 pessoas
		Pessoa p1 = new Pessoa("Edson Davi Figueiredo", 77);
		Pessoa p2 = new Pessoa("Enrico Thiago Severino Corte Real", 47);
		Pessoa p3 = new Pessoa("Heloise Esther Bernardes", 41);
		Pessoa p4 = new Pessoa("Silvana Liz Oliveira", 74);
		Pessoa p5 = new Pessoa("Yuri Anthony Heitor Gomes", 74);
		
		//Testando os métodos
		p5.setIdade(45);
		p2.setNome("Vinicius Manuel Sebastião Lopes");
		p4.setIdade(54);
		System.out.println("A idade de " + p3.getNome() + " é " + p3.getIdade());
		
		
	}

}
