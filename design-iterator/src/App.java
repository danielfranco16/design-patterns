public class App {
    public static void main(String[] args) {
	

        int n=1; 
		AgregadorDeVeiculos carrosImportados = new VeiculosImportados();
		
        System.out.println("\nCarros Importados:");
		
        
        for (InterfaceIterator it = carrosImportados.criarIterator(); 
        !it.isDone(); it.next()) {
            System.out.print(n++);
            System.out.print(" - ");
			System.out.print(it.currentItem().nome );
            System.out.print(" - MOTOR: ");
            System.out.println(it.currentItem().motor);   
		}

	}
}
