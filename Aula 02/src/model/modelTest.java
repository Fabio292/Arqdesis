package model;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class modelTest {

	@Test
	public void test() {
		Conjunto conj = new Conjunto();
		conj.setNomeConjunto("aa");
		Assert.assertEquals("aa", conj.getNomeConjunto());
		conj.setCnpj(1);
		Assert.assertEquals(1, conj.getCnpj());
		conj.setIdConjunto(2);
		Assert.assertEquals(2, conj.getIdConjunto());
		conj.setTemperatura(120);
		Assert.assertEquals(120, conj.getTemperatura());
		
		Empresa empresa = new Empresa();
		empresa.setCnpj(5);
		empresa.setHorArCond("20:20");
		empresa.setHorFunc("15:15");
		empresa.setRazao("abc");
		empresa.setTempPadrao(15);
		Assert.assertEquals(5, empresa.getCnpj());
		Assert.assertEquals("20:20", empresa.getHorArCond());
		Assert.assertEquals("15:15", empresa.getHorFunc());
		Assert.assertEquals("abc", empresa.getRazao());
		Assert.assertEquals(15, empresa.getTempPadr());
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCnpj(123);
		funcionario.setCpf(123);
		funcionario.setDataNascimento("30/11/1993");
		funcionario.setEmail("aa@usjt.br");
		funcionario.setHorarioEntrada("07:00");
		funcionario.setHorarioSaida(":16:00");
		funcionario.setLogin("aaa");
		funcionario.setNome("Rafael");
		funcionario.setSenha("123");
		
		Assert.assertEquals(123, funcionario.getCnpj());
		Assert.assertEquals(123, funcionario.getCpf());
		Assert.assertEquals("30/11/1993", funcionario.getDataNascimento());
		Assert.assertEquals("aa@usjt.br", funcionario.getEmail());
		Assert.assertEquals("07:00", funcionario.getHorarioEntrada());
		Assert.assertEquals(":16:00", funcionario.getHorarioSaida());
		Assert.assertEquals("aaa", funcionario.getLogin());
		Assert.assertEquals("Rafael", funcionario.getNome());
		Assert.assertEquals("123", funcionario.getSenha());
		
		Usuario usuario = new Usuario();
		usuario.setCpf(123);
		usuario.setDataNascimento("01/01/1994");
		usuario.setEmail("bb@usjt.br");
		usuario.setLogin("aaa");
		usuario.setNome("Victor");
		usuario.setPerfil("a");
		usuario.setSenha("123");
		
	
		Assert.assertEquals(123, usuario.getCpf());
		Assert.assertEquals("01/01/1994", usuario.getDataNascimento());
		Assert.assertEquals("bb@usjt.br", usuario.getEmail());
		Assert.assertEquals("aaa", usuario.getLogin());
		Assert.assertEquals("Victor", usuario.getNome());
		Assert.assertEquals("a", usuario.getPerfil());
		Assert.assertEquals("123", usuario.getSenha());
	}

}
