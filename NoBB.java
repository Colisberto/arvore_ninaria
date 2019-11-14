package estruturaDeDados;

public class NoBB {
	
	private int valor;
	private NoBB esquerda;
	private NoBB direita;
	
	NoBB(int valor){
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}
	
	public static void montaArvore(NoBB novo, NoBB arvore) {
		
		if (arvore == null) {
			arvore = novo;
		}else {		
			if (novo.valor < arvore.valor) {
				if (arvore.esquerda == null) {
					arvore.esquerda = novo;
					// se a arvore não for nula aqui chama recursivamente o metodo para incluir a esquerda
				}else {
					montaArvore(novo, arvore.esquerda);
				}
			}else {
				if (arvore.direita == null) {
					arvore.direita = novo;
					// se a arvore não for nula aqui chama recursivamente o metodo para incluir a direita
				}else {
					montaArvore(novo, arvore.direita);
				}
					
			}
			
		}
	}
	
	public static boolean buscaNo(NoBB arvore, int valor) {
		// se metoto passar por todos nós e não encontar valor, vai retornar falso
		boolean ret = false;
		
		if (arvore == null) { // não achou o nó
			ret = false;
			
		}else if(arvore.valor == valor) { //achou nó na arvore
			ret = true;
			
		}else {
			if (arvore.valor > valor) {
				ret = buscaNo(arvore.esquerda, valor);
				
			}else {
				ret = buscaNo(arvore.direita, valor);
			}
		}
		return ret;
		
	}
	
	public static void removerNo(NoBB arvore, int valor) {
		if (arvore.valor == valor) {
			arvore = null;
			
		}else if (arvore.valor > valor) { // subarvore da esquerda
			if ((arvore.esquerda.valor == valor )) {
				removerNoDireita(arvore);
				
			}else {
				removerNo(arvore.esquerda, valor);
			}
		}else {
			if((arvore.direita.valor == valor)) {
				removerNoDireita(arvore);
			}else {
				removerNo(arvore.direita, valor);
			}
		}
		
	}
	
	public static int totalFilhos(NoBB no) {
		/* se retorna 0 não tem filhos| 1 filho na esquerda | 2 filhos a direira
		 *  | 3 tem os dois, filho a esquera e o a esquerda
		 */
		int total = 0;
		
		if(no.esquerda != null) {
			total += 1;
		}
		if(no.direita != null) {
			total += 2;
		}
		
		return total;
	}
	
	public static void removerSemFilhos(NoBB noPai, String subarvore) {
		if (subarvore.equals("E")) {
			noPai.esquerda = null;
		}else {
			noPai.direita = null;
		}
	}
	
	public static void removerUmFilhoDireita(NoBB noPai, String subarvore) {
		if(subarvore.equals("E")) {
			noPai.direita = noPai.direita.esquerda;
		}else {
			noPai.direita = noPai.direita.direita;
		}
	}
	
	public static void removerUmFilhoEsquerda(NoBB noPai, String subarvore) {
		if(subarvore.equals("E")) {
			noPai.direita = noPai.esquerda.esquerda;
		}else {
			noPai.direita = noPai.direita.direita;
		}
	}
	
	public static void removerNoDireita(NoBB noPai) {
		
		int filhos = 0;
		NoBB noRemover = null;
		noRemover = noPai.direita;
		filhos = totalFilhos(noRemover);
		if(filhos == 0) {
			removerSemFilhos(noPai, "D");
		}else if(filhos == 1) {
			removerUmFilhoDireita(noPai, "E");
		}else if(filhos == 2) {
			removerUmFilhoDireita(noPai, "D");
		}else if(filhos == 3) {
			//removerFilhosEsqDirei
		}
		
	}
	
	// método para imprimir o nó da árvore
	
		public static void  imprimePreOrdem(NoBB n) {
			System.out.print(n.valor + " ");
			
			/*recurssividade e teste logico para checar se o inicio do nó
			é diferente de nulo */
			
			if(n.esquerda != null) {
				imprimePreOrdem(n.esquerda);
			}
			
			if(n.direita != null) {
				imprimePreOrdem(n.direita);
			}
		}
		
		public static void  imprimeEmOrdem(NoBB n) {
			
			/*Metodo em ordem, percorre primeiro toda esquerda
			 * Depois imprime a raiz, depois ele percorre a direita*/
			
			if(n.esquerda != null) {
				imprimeEmOrdem(n.esquerda);
			}
			System.out.print(n.valor + " ");
			
			if(n.direita != null) {
				imprimeEmOrdem(n.direita);
			}
		}
		
	public static void  imprimePosOrdem(NoBB n) {
			
			/*Primeiro ele percorre a esquerda, depois percorre a direita
			 * depois imprime a raiz*/
			
			if(n.esquerda != null) {
				imprimePosOrdem(n.esquerda);
			}
			if(n.direita != null) {
				imprimePosOrdem(n.direita);
			}
			System.out.print(n.valor + " ");
		}
	

}
