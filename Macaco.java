
public class Macaco {

	public String nomeCientifico, corPelo, apelido, reino, filo, classe, ordem, familia, especie;
	public float altura, peso;
	public short idade;
	public char genero;
	
	@Override
	public String toString() {
		return "Idade do macaco 1: " + idade
				+ "\nNome científico do macaco 1: " + nomeCientifico
				+ "\nCor do pelo do macaco 1: " + corPelo
				+ "\nApelido do macaco 1: " + apelido
				+ "\nAltura do macaco 1: " + altura
				+ "\nPeso do macaco 1: " + peso
				+ "\nReino do macaco 1: " + reino
				+ "\nFilo do macaco 1: " + filo
				+ "\nClasse do macaco 1: " + classe
				+ "\nOrdem do macaco 1: " + ordem
				+ "\nFamília do macaco 1: " + familia
				+ "\nGênero do macaco 1: " + genero
				+ "\nEspécie do macaco 1: " + especie;
	}

}
