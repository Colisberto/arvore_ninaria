package estruturaDeDados;

public class TesteArvore {

	public static void main(String[] args) {
	
		NoBB arvore = new NoBB(10);
		NoBB.montaArvore(arvore, null);
		
		NoBB n5 = new NoBB(5);
		NoBB.montaArvore(n5, arvore);
		
		NoBB n20 = new NoBB(20);
		NoBB.montaArvore(n20, arvore);
		
		NoBB n33 = new NoBB(33);
		NoBB.montaArvore(n33, arvore);
		
		NoBB n1 = new NoBB(1);
		NoBB.montaArvore(n1, arvore);
		
		NoBB n2 = new NoBB(2);
		NoBB.montaArvore(n2, arvore);
		
		NoBB n7 = new NoBB(7);
		NoBB.montaArvore(n7, arvore);
		
		NoBB n30 = new NoBB(30);
		NoBB.montaArvore(n30, arvore);
		
		// imprimindo a arvore
		
		System.out.println(" Pre - Ordem");
		NoBB.imprimePreOrdem(arvore);
		System.out.println("");
		
		System.out.println(" Em - Ordem");
		NoBB.imprimeEmOrdem(arvore);
		System.out.println("");
		
		System.out.println(" Pos - Ordem");
		NoBB.imprimePosOrdem(arvore);
		System.out.println("");
		
		NoBB.removerNo(arvore, 20);
		NoBB.removerNo(arvore, 7);
		
		// IMPRIMINDO APÓS REMOÇÃO
		System.out.println(" DEPOIS DA REMOÇÃO");
		System.out.println(" Pre - Ordem");
		NoBB.imprimePreOrdem(arvore);
		System.out.println("");
		
		System.out.println(" Em - Ordem");
		NoBB.imprimeEmOrdem(arvore);
		System.out.println("");
		
		System.out.println(" Pos - Ordem");
		NoBB.imprimePosOrdem(arvore);
		System.out.println("");
		
		
		System.out.println("ADICIONAR DEPOIS DA REMOÇÃO");
		
		NoBB n14 = new NoBB(14);
		NoBB.montaArvore(n14, arvore);
		
		System.out.println(" Pre - Ordem");
		NoBB.imprimePreOrdem(arvore);
		System.out.println("");
		
		System.out.println(" Em - Ordem");
		NoBB.imprimeEmOrdem(arvore);
		System.out.println("");
		
		System.out.println(" Pos - Ordem");
		NoBB.imprimePosOrdem(arvore);
		System.out.println("");
		
	}

}
