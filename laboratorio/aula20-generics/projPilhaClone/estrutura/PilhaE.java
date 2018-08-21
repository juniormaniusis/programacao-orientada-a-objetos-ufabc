package estrutura;

import objetos.Eletronico;

public class PilhaE implements Cloneable {

	private int topo;
	private Eletronico[] itens;
	
	public PilhaE(int tamanhoMax) {
		this.itens = new Eletronico[tamanhoMax];
		this.topo = -1;
	}
	
	public void empilha(Eletronico novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);
		
		itens[++topo] = novoItem;
	}
	
	public Eletronico desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();
		
		Eletronico item = itens[topo];
		itens[topo--] = null;
		return item;
	}
	
	int getTopo() {
		return this.topo;
	}
	
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}
	
	@Override
	public PilhaE clone() throws CloneNotSupportedException {
		PilhaE novaPilha = (PilhaE) super.clone();
		//foi criado uma cópia rasa desta pilha, mas note que existe ponteiros apontando para outro objeto
		//entao devemos criar cópias destes objetos tambem
		novaPilha.itens = this.itens.clone();
		//agora temos uma cópia rasa do vetor
		//para ter uma cópia profunda, devemos copiar todos os elementos deste vetor
		for (int i = 0; i < this.itens.length; i++) {
			if (this.itens[i] != null) {
				novaPilha.itens[i] = this.itens[i].clone(); //clona todos elementos não nulos..
			}
		}
		return novaPilha;
	}
	
	
	
	
	
}
