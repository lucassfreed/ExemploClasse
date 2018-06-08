import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Pessoa lucas = new Pessoa();
		lucas.nome = "Lucas";
		lucas.idade = 16;
		lucas.peso = 94.0f;
		lucas.altura = 1.94f;
		lucas.sexo = 'm';
		lucas.cpf = "123.456.789.12";
		lucas.sobrenome = "Rodrigo";

		Pessoa carlos = new Pessoa();
		carlos.idade = 18;
		carlos.peso = 78;
		carlos.sexo = 'm';
		carlos.cpf = "987.654.321-98";
		carlos.nome = "Carlos";
		carlos.sobrenome = "Augusto";
		carlos.altura = 1.78f;
		
		Macaco macaco1 = new Macaco();
		macaco1.idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade do macaco 1"));
		macaco1.nomeCientifico = JOptionPane.showInputDialog("Informe o nome científico do macaco 1");
		macaco1.corPelo = JOptionPane.showInputDialog("Informe a cor do pelo do macaco 1");
		macaco1.apelido = JOptionPane.showInputDialog("Informe o apelido do macaco 1");
		macaco1.altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do macaco 1"));
		macaco1.peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso do macaco 1"));
		macaco1.reino = JOptionPane.showInputDialog("Informe o reino do macaco 1");
		macaco1.filo = JOptionPane.showInputDialog("Informe o filo do macaco 1");
		macaco1.classe = JOptionPane.showInputDialog("Informe a classe do macaco 1");
		macaco1.ordem = JOptionPane.showInputDialog("Informe a ordem do macaco 1");
		macaco1.familia = JOptionPane.showInputDialog("Informe a família do macaco 1");
		macaco1.genero = JOptionPane.showInputDialog("Informe o genero do macaco 1").toUpperCase().charAt(0);
		macaco1.especie = JOptionPane.showInputDialog("Informe a espécie do macaco 1");
		
		Macaco macaco2 = new Macaco();
		macaco2.idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade do macaco 2"));
		macaco2.nomeCientifico = JOptionPane.showInputDialog("Informe o nome científico do macaco 2");
		macaco2.corPelo = JOptionPane.showInputDialog("Informe a cor do pelo do macaco 2");
		macaco2.apelido = JOptionPane.showInputDialog("Informe o apelido do macaco 2");
		macaco2.altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do macaco 2"));
		macaco2.peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso do macaco 2"));
		macaco2.reino = JOptionPane.showInputDialog("Informe o reino do macaco 2");
		macaco2.filo = JOptionPane.showInputDialog("Informe o filo do macaco 2");
		macaco2.classe = JOptionPane.showInputDialog("Informe a classe do macaco 2");
		macaco2.ordem = JOptionPane.showInputDialog("Informe a ordem do macaco 2");
		macaco2.familia = JOptionPane.showInputDialog("Informe a família do macaco 2");
		macaco2.genero = JOptionPane.showInputDialog("Informe o genero do macaco 2").toUpperCase().charAt(0);
		macaco2.especie = JOptionPane.showInputDialog("Informe a espécie do macaco 2");
		
		Macaco macaco3 = new Macaco();
		macaco3.idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade do macaco 3"));
		macaco3.nomeCientifico = JOptionPane.showInputDialog("Informe o nome científico do macaco 3");
		macaco3.corPelo = JOptionPane.showInputDialog("Informe a cor do pelo do macaco 3");
		macaco3.apelido = JOptionPane.showInputDialog("Informe o apelido do macaco 3");
		macaco3.altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do macaco 3"));
		macaco3.peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso do macaco 3"));
		macaco3.reino = JOptionPane.showInputDialog("Informe o reino do macaco 3");
		macaco3.filo = JOptionPane.showInputDialog("Informe o filo do macaco 3");
		macaco3.classe = JOptionPane.showInputDialog("Informe a classe do macaco 3");
		macaco3.ordem = JOptionPane.showInputDialog("Informe a ordem do macaco 3");
		macaco3.familia = JOptionPane.showInputDialog("Informe a família do macaco 3");
		macaco3.genero = JOptionPane.showInputDialog("Informe o genero do macaco 3").toUpperCase().charAt(0);
		macaco3.especie = JOptionPane.showInputDialog("Informe a espécie do macaco 3");
		
		Macaco macaco4 = new Macaco();
		macaco4.idade = 10;
		macaco4.nomeCientifico = "Nasalis Larvatus";
		macaco4.corPelo = "Vermelho";
		macaco4.apelido = "Rogérin";
		macaco4.altura = 1.6f;
		macaco4.peso = 123f;
		macaco4.reino = "Master";
		macaco4.filo = "Cordados";
		macaco4.classe = "Mamíferos";
		macaco4.ordem = "Primatas";
		macaco4.familia = "Cercopithecidae";
		macaco4.genero = 'F';
		macaco4.especie = "Narigudo";
		
		Macaco macaco5 = new Macaco();
		macaco5.idade = 23;
		macaco5.nomeCientifico = "Leontopithecus rosalia";
		macaco5.corPelo = "Amarelo";
		macaco5.apelido = "JC";
		macaco5.altura = 3.10f;
		macaco5.peso = 180.40f;
		macaco5.reino = "Isolados";
		macaco5.filo = "Cordados";
		macaco5.classe = "Mamíferos";
		macaco5.ordem = "Primatas";
		macaco5.familia = "Callitrichidae";
		macaco5.genero = 'M';
		macaco5.especie = "Mico-leão-dourado";
		
		JOptionPane.showMessageDialog(null, lucas);
		JOptionPane.showMessageDialog(null, carlos);
		
		JOptionPane.showMessageDialog(null, macaco1);
		JOptionPane.showMessageDialog(null, macaco2);
		JOptionPane.showMessageDialog(null, macaco3);
		JOptionPane.showMessageDialog(null, macaco4);
		JOptionPane.showMessageDialog(null, macaco5);

		/*JOptionPane.showMessageDialog(null,
				"Nome: " + lucas.nome 
				+ "\nSobrenome: " + lucas.sobrenome 
				+ "\nIdade: " + lucas.idade 
				+ "\nPeso: " + lucas.peso 
				+ "\nAltura: " + lucas.altura 
				+ "\nSexo: " + lucas.sexo 
				+ "\nCPF: " + lucas.cpf
		);
		
		JOptionPane.showMessageDialog(null,
				"Nome: " + carlos.nome 
				+ "\nSobrenome: " + carlos.sobrenome 
				+ "\nIdade: " + carlos.idade 
				+ "\nPeso: " + carlos.peso 
				+ "\nAltura: " + carlos.altura 
				+ "\nSexo: " + carlos.sexo 
				+ "\nCPF: " + carlos.cpf
		);*/
		
		/*JOptionPane.showMessageDialog(null, 
				"Idade do macaco 1: " + macaco1.idade
				+ "\nNome científico do macaco 1: " + macaco1.nomeCientifico
				+ "\nCor do pelo do macaco 1: " + macaco1.corPelo
				+ "\nApelido do macaco 1: " + macaco1.apelido
				+ "\nAltura do macaco 1: " + macaco1.altura
				+ "\nPeso do macaco 1: " + macaco1.peso
				+ "\nReino do macaco 1: " + macaco1.reino
				+ "\nFilo do macaco 1: " + macaco1.filo
				+ "\nClasse do macaco 1: " + macaco1.classe
				+ "\nOrdem do macaco 1: " + macaco1.ordem
				+ "\nFamília do macaco 1: " + macaco1.familia
				+ "\nGênero do macaco 1: " + macaco1.genero
				+ "\nEspécie do macaco 1: " + macaco1.especie);
		
		JOptionPane.showMessageDialog(null, 
				"Idade do macaco 2: " + macaco2.idade
				+ "\nNome científico do macaco 2: " + macaco2.nomeCientifico
				+ "\nCor do pelo do macaco 2: " + macaco2.corPelo
				+ "\nApelido do macaco 2: " + macaco2.apelido
				+ "\nAltura do macaco 2: " + macaco2.altura
				+ "\nPeso do macaco 2: " + macaco2.peso
				+ "\nReino do macaco 2: " + macaco2.reino
				+ "\nFilo do macaco 2: " + macaco2.filo
				+ "\nClasse do macaco 2: " + macaco2.classe
				+ "\nOrdem do macaco 2: " + macaco2.ordem
				+ "\nFamília do macaco 2: " + macaco2.familia
				+ "\nGênero do macaco 2: " + macaco2.genero
				+ "\nEspécie do macaco 2: " + macaco2.especie);
		
		JOptionPane.showMessageDialog(null, 
				"Idade do macaco 3: " + macaco3.idade
				+ "\nNome científico do macaco 3: " + macaco3.nomeCientifico
				+ "\nCor do pelo do macaco 3: " + macaco3.corPelo
				+ "\nApelido do macaco 3: " + macaco3.apelido
				+ "\nAltura do macaco 3: " + macaco3.altura
				+ "\nPeso do macaco 3: " + macaco3.peso
				+ "\nReino do macaco 3: " + macaco3.reino
				+ "\nFilo do macaco 3: " + macaco3.filo
				+ "\nClasse do macaco 3: " + macaco3.classe
				+ "\nOrdem do macaco 3: " + macaco3.ordem
				+ "\nFamília do macaco 3: " + macaco3.familia
				+ "\nGênero do macaco 3: " + macaco3.genero
				+ "\nEspécie do macaco 3: " + macaco3.especie);
		
		JOptionPane.showMessageDialog(null, 
				"Idade do macaco 4: " + macaco4.idade
				+ "\nNome científico do macaco 4: " + macaco4.nomeCientifico
				+ "\nCor do pelo do macaco 4: " + macaco4.corPelo
				+ "\nApelido do macaco 4: " + macaco4.apelido
				+ "\nAltura do macaco 4: " + macaco4.altura
				+ "\nPeso do macaco 4: " + macaco4.peso
				+ "\nReino do macaco 4: " + macaco4.reino
				+ "\nFilo do macaco 4: " + macaco4.filo
				+ "\nClasse do macaco 4: " + macaco4.classe
				+ "\nOrdem do macaco 4: " + macaco4.ordem
				+ "\nFamília do macaco 4: " + macaco4.familia
				+ "\nGênero do macaco 4: " + macaco4.genero
				+ "\nEspécie do macaco 4: " + macaco4.especie);
		
		JOptionPane.showMessageDialog(null, 
				"Idade do macaco 5: " + macaco5.idade
				+ "\nNome científico do macaco 5: " + macaco5.nomeCientifico
				+ "\nCor do pelo do macaco 5: " + macaco5.corPelo
				+ "\nApelido do macaco 5: " + macaco5.apelido
				+ "\nAltura do macaco 5: " + macaco5.altura
				+ "\nPeso do macaco 5: " + macaco5.peso
				+ "\nReino do macaco 5: " + macaco5.reino
				+ "\nFilo do macaco 5: " + macaco5.filo
				+ "\nClasse do macaco 5: " + macaco5.classe
				+ "\nOrdem do macaco 5: " + macaco5.ordem
				+ "\nFamília do macaco 5: " + macaco5.familia
				+ "\nGênero do macaco 5: " + macaco5.genero
				+ "\nEspécie do macaco 5: " + macaco5.especie);*/
	}

}

