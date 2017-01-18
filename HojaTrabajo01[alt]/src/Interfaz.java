import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		iRadio radio = new Radio();
		radio.estado();
		
		while(1==1){
			System.out.println(radio.getEmisora());
			if(radio.getFrecuencia() == true){
				System.out.println("FM");
			}else{
				System.out.println("AM");
			}
			System.out.println("seleccione que hacer:");
			System.out.println("1-cambiar am/fm");
			System.out.println("2-subir");
			System.out.println("3-bajar");
			System.out.println("4-apagar");
			System.out.println("5-guardar");
			System.out.println("6-seleccionar");
			int resp = scanner.nextInt();
			if(resp == 1){
				radio.frecuencia();
			}else if(resp == 2){
				radio.cambiar(true);
			}else if(resp == 3){
				radio.cambiar(false);
			}else if(resp == 4){
				radio.estado();
				break;
			}else if(resp == 5){
				System.out.println("Ingrese la posicion 1-12:");
				resp = scanner.nextInt();
				radio.guardar(resp);
			}else if(resp == 6){
				System.out.println("Ingrese la posicion 1-12:");
				resp = scanner.nextInt();
				radio.seleccionar(resp);
			}
		}

	}

}
