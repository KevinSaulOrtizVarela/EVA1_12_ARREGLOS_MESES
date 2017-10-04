import java.util.Scanner;
/**
 *
 * @author 16550549
 */
public class Principal {
    public static void main(String[] args) {
        //SE CREA UN ARREGLO CON LA INFORMACION DE LOS MESES DEL AÑO
        String asMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        //DIAS
        //SE GENERA UN ARREGLO CON LOS DIFERENTES DIAS POR MES AL AÑO
        int aiDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // SOLICITAR EL MES AL USUARIO:
        
        int iMes;
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("NUMERO DE MES (1 - 12): ");
        iMes = sCaptu.nextInt();
        //SE IMPRIME EL MES Y EL DIA QUE SELECCIONO EL UAURIO
        System.out.println("El mes es " + asMeses[iMes - 1]
                + " y tiene  " + aiDias[iMes - 1] + " dias");
    }
}
