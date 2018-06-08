
public class Personagem {
	
	private String nome, cla, aldeia;
	private long nivelChakra;
	
	// Permitir guardar a informação
	public void setNome(String nome) {
		if (nome.trim().equals("")) {
			throw new 
			IllegalArgumentException("Nome não pode ser vázio!");
		}
		if (nome.trim().length() < 3) {
			throw new 
			IllegalArgumentException("O nome tem que conter no mínimo 3 caracteres");
		}
	}
	
	public String getName() {
		return nome;
	}
	

}
