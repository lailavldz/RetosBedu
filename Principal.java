import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        //Se crea el scanner
        Scanner sc = new Scanner(System.in);

        //Se crea el objeto
        Paciente paciente1= new Paciente();

        //Pedirle los datos del paciente
        System.out.print("Ingresa el nombre del paciente: ");
        paciente1.nombre=sc.nextLine();

        System.out.print("ingesa la edad del paciente:");
        paciente1.edad=sc.nextInt();
        //nextint no limpia buffer, o sea que este comando no limpia el buffer y se queda con muchísima información
        sc.nextLine();

        System.out.print("ingresa el expediente del paciente:");
        paciente1.exp=sc.nextLine();

        sc.close();

        paciente1.mostrarInformacion();


    }
}