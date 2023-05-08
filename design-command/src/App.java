public class App {
    public static void main(String[] args) {
		
        Botao button = new Botao();
		Tarefa tarefa = new Tarefa();
		Comando executarTarefa = new ExecutarTarefa(tarefa);


		button.setComando(executarTarefa);
		button.pressionarBotao();
	
	}
}
