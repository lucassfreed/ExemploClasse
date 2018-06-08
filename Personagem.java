
public class Personagem {
	
	private String nome, cla, aldeia;
	private long nivelChakra;
	
	// Permitir guardar a informa��o
	public void setNome(String nome) {
		if (nome.trim().equals("")) {
			throw new 
			IllegalArgumentException("Nome n�o pode ser v�zio!");
		}
		if (nome.trim().length() < 3) {
			throw new 
			IllegalArgumentException("O nome tem que conter no m�nimo 3 caracteres");
		}
	}
	
	public String getName() {
		return nome;
	}
	

}
