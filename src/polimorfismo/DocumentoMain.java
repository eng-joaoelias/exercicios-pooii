package polimorfismo;

import java.util.ArrayList;

public class DocumentoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documento relatorio = new Relatorio();
		Documento carta = new Carta();
		Documento contrato = new Contrato();
		
		ArrayList<Documento> docs = new ArrayList<Documento>();
		
		docs.add(relatorio);
		docs.add(carta);
		docs.add(contrato);
		
		for (Documento documento : docs) {
			documento.imprimir();
		}
	}

}
