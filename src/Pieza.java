public abstract class Pieza {
    protected String movimiento;
    protected String velocidad;
    protected String color;
    protected String caracter;

    public Pieza(String movimiento, String velocidad, String color, String caracter) {
        this.movimiento = movimiento;
        this.velocidad = velocidad;
        this.color = color;
        this.caracter = caracter;
    }

    public void setMovimiento(String nuevo_movimiento) {
        this.movimiento = nuevo_movimiento;
    }

    public void setVelocidad(String nuevo_velocidad) {
        this.velocidad = nuevo_velocidad;
    }

    public void setColor(String nuevo_color) {
        this.color = nuevo_color;
    }

    public void setCaracter(String nuevo_caracter) {
        this.caracter = nuevo_caracter;
    }

    public String getMovimiento() {
        return this.movimiento;
    }

    public String getVelocidad() {
        return this.velocidad;
    }

    public String getColor() {
        return this.color;
    }

    public String getCaracter() {
        return this.caracter;
    }

    public abstract String mover();

}
