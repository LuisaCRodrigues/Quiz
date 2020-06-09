enum Categorias {
	VARIEDADES(1), CIENCIAETECNOLOGIA(2), ESPORTEELAZER(3), MUNDO(4), ENTRETENIMENTO(5);

	private final int valor;

	Categorias(int valorOpcao) {
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
}