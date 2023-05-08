

public class ExecutarTarefa implements Comando {
	
	Tarefa tarefaNova;
	
	public ExecutarTarefa(Tarefa tarefa) {
		this.tarefaNova = tarefa;
	}

	@Override
	public void executar() {
		this.tarefaNova.realizar();
	}

}
