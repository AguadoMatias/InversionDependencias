
public class App {
    public static void main(String[] args) throws Exception {
        mostrarPiezasBD();
    }

    public static void mostrarPiezasBD(){
		// Se declara como interfaz el objeto a utilizar para el acceso a los datos, y se instancia con el DAO correspondiente
		// En este punto es importante observar que podria tener mas de una implementacion (clase PiezaDAO) 
		iPiezaDAO iPieza = new PiezaDAO();
		iPieza.imprimirListadoPiezas();
	}
	
}
