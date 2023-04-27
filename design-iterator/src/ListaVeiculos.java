public class ListaVeiculos implements InterfaceIterator {
	protected Veiculos[] lista;
	protected int contador;

	public ListaVeiculos(Veiculos[] lista) {
		this.lista = lista;
	}

	@Override
	public void first() {
		contador = 0;
	}

	@Override
	public void next() {
		contador++;
	}

	@Override
	public boolean isDone() {
		return contador == lista.length;
	}

	@Override
	public Veiculos currentItem() {
		if (isDone()) {
			contador = lista.length - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista[contador];
	}
}
