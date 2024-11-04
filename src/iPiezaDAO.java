public interface iPiezaDAO {    

        public abstract void imprimirListadoPiezas();
        public abstract Pieza obtenerPiezaByID(int id);
        public abstract void insertarPieza();
        public abstract void actualizarPieza(Pieza piezaMod);
        public abstract void eliminarPieza(int id);
    
}
