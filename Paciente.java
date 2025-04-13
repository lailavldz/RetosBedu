public class Paciente {
    //Crear los atributos
    String nombre;
    int edad;
    String exp;

    //se hace un constructor vacío
    public void mostrarInformacion(){
        System.out.println("Datos del paciente");
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Expediente:" + exp);

    }
}