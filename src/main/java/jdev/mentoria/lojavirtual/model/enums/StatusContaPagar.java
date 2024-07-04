package jdev.mentoria.lojavirtual.model.enums;

public enum StatusContaPagar {

	COBRANCA("Pagar"),
	VENCIDA("Vencida"),
	ABERTA("Aberta"),
	QUITADA("Quitada"),
	NEGOCIADA("Renegociada");
	

	// Preciso sempre de uma descricao
	private String descricao;

	// Preciso sempre de um Construtor, passo o parâmetro e aponto para a descricao
	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}

	// Preciso do Get descricao
	public String getDescricao() {
		return descricao;
	}

	/*
	 * Preciso de sobrescrever (duas vezes) internamente na memória, To String para
	 * Mostrar na Tela como o SQL armazenará o dado, e retorno tanto faz, pode ser
	 * return this.getDescricao() ou return this.descricao; ESSE é o PADRÃO.
	 */

	@Override
	public String toString() {

		return this.descricao;
	}

}
