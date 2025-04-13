public class Entrada{
    //Declarar atributos
    String evento;
    double precio;

    //Crear el constructor
    public Entrada(String nombre, double precio) {
        this.evento= nombre;
        this.precio= precio;
    }

    //Metodoque muestrala info del producot en comsola
    public void mostrarInformacion(){
    System.out.println("Entrada" + evento + "-Precio; $" + precio);
    }

}