public class objeto{
	public int id;
	public string mensagem;
	public date dataEnvio;
		
	}

public class Fila {

  private List<Object> objetos = new LinkedList<Object>();

  public void insere(int id, string mensagem, date dataEnvio) {
    this.objetos.id.add(id);
    this.objetos.mensagem.add(mensagem);
    this.objetos.dataEnvio.add(dataEnvio);
  }

  public Object remove() {
    return this.objetos.remove(0);
  } 
}
