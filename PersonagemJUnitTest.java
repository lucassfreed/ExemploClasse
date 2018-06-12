import static org.junit.Assert.*;

import org.junit.Test;

public class PersonagemJUnitTest {

	@Test
	public void testeDefinirEObterNome() {
		Personagem sakura = new Personagem();
		sakura.setNome("Sakura");
		assertEquals("Sakura", sakura.getName());
		sakura.setNome("Sakura Haruno");
		assertEquals("Sakura Haruno", sakura.getName());
	}
	
	@Test
	public void testeDefinirEObterIdade() {
		Personagem choji = new Personagem();
		choji.setNome("Choji");
		choji.setIdade((byte)17);
		assertEquals(17, choji.getIdade());
	}
	
	@Test
	public void testeDefinirEObterSexo() {
		Personagem zabuza = new Personagem();
		zabuza.setSexo('m');
		assertEquals('m', zabuza.getSexo());
	}
	
	@Test
	public void testeDefinirEObterNivelChakra() {
		Personagem deidara = new Personagem();
		deidara.setNivelChakra(500);
		assertEquals(500, deidara.getNivelChakra());
	}
	
	@Test
	public void testeDefinirEObterAldeia() {
		Personagem rockLee = new Personagem();
		rockLee.setAldeia("Folha");
		assertEquals("Folha", rockLee.getAldeia());
	}
	
	@Test
	public void testeDefinirEObterCla() {
		Personagem hinata = new Personagem();
		hinata.setCla("Hyuuga");
		assertEquals("Hyuuga", hinata.getCla());
	}
	
	@Test
	public void testeDefinirEObterIdadeMental() {
		Personagem jiraya = new Personagem();
		jiraya.setIdadeMental((byte) -10);
		assertEquals(-10, jiraya.getIdadeMental());
	}

}
