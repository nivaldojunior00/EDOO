public class Pilha {	    
    public Object[] pilha;
    public int posicaoPilha;
    public string operacao;
    public string descricao;
    public method ref;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[100];
    }
    
public boolean pilhaVazia() {
	if (this.posicaoPilha == -1) {
		return true; 
	}
	return false;
}

public void empilhar(Object valor, string operacao, string descricao, method ref) {        
	if (this. posicaoPilha < this.pilha.length - 1) { 	
		this.pilha.object[++posicaoPilha] = valor;
		this.pilha.operacao[++posicaoPilha] = operacao;
		this.pilha.descricao[++posicaoPilha] = descricao;
		this.pilha.ref[++posicaoPilha] = ref;
	}
}

public int tamanho() {
	if (this.pilhaVazia()) {
		return 0; 
	}
	return this.posicaoPilha + 1;	
}

public Object desempilhar() {        
	if (pilhaVazia()) {
		return null;
	}
	return this.pilha[this.posicaoPilha--];
}
