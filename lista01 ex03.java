public class Celula {
	public Celula prox;
	public int dado;
	}
	
public class ListaLigada{
	public Celula primeira;
	public Celula ultima;
	public int nelementos;
	
	public void addInicio(int dado){
		this.primeira = dado
		
		if(this.nelementos == 0){
			this.ultima = this.primeira;
			}
		this.nelementos++;		
		}
		
	public void addFim(int dado){
		if (this.nelementos == 0){
			this.addInicio(dado);			
			}else{
				Celula nova = new Celula(dado);
				this.ultima.prox(nova);
				this.ultima = nova;
				this.nelementos++;
				}		
		}
		
	public void addXposicao(int pocicao, int dado){
		if(posicao == 0){
			this.addInicio(dado);
			}else if(posicao == this.nelementos){
				this.addFim(dado);
				}else{
					Celula anterior = this.pegaCelula(posicao -1);
					Celula nova = new Celula(anterior.prox(), dado);
					anterior.prox(nova);
					this.nelementos++;
					}
		}
	}


	
