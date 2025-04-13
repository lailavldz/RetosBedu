public class Principal {
    public static void main(String[] args) {
        //CRearun objeto de los productos con el constructor
        Entrada entrada1= new Entrada("Obra de teatro", 450);
        Entrada entrada2= new Entrada("SKZ", 3190);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Mostrar info del reto de record
        Record entrada3= new Record("Musical glee", 231.31);
        entrada3.mostrarInformacion();
    }
}
