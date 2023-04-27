public class VeiculosImportados implements AgregadorDeVeiculos {

	protected Veiculos[] veiculosImportados;

	public VeiculosImportados() {
		veiculosImportados = new Veiculos[5];
		veiculosImportados[0] = new Veiculos("BMW",3.0);
		veiculosImportados[1] = new Veiculos("MERCEDES",2.5);
		veiculosImportados[2] = new Veiculos("PORSCHE",4.0);
		veiculosImportados[3] = new Veiculos("AUDI",2.8);
		veiculosImportados[4] = new Veiculos("JAGUAR",1.8);
	}

	@Override
	public InterfaceIterator criarIterator() {
		return new ListaVeiculos(veiculosImportados);
	}
}