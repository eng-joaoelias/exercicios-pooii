package genericos;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<Integer> caixa = new Caixa<Integer>();
		caixa.setObjeto(512);
		Caixa<String> caixaDois = new Caixa<String>();
		caixaDois.setObjeto("Uma String");

	}

}
