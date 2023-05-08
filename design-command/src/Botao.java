

public class Botao {
	
	private Comando comando;
	
	public void setComando(Comando poComando) {
		this.comando = poComando;
	}
	
	public void pressionarBotao() {
		this.comando.executar();
	}

}
