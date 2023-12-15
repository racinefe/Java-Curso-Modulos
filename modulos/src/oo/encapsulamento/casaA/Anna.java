package oo.encapsulamento.casaA;

public class Anna {
	
	@SuppressWarnings("unused")
	private String segredo = "Visibilidade privada [ só pode ser vista dentro da propia classe ]";
	String costumes = "Visibilidade default ou pacote [ pode ser vista por todos dentro do mesmo pacote ]";
	protected String formaDeFalar = "Visibilidade Protected [ pode ser vista dentro do mesmo pacote ou por Herança ]";
	public String todosSabem = "Visibilidade Publica [ pode ser acessada por todos ]";
}
