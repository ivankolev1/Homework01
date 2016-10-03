import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Въведете карта: ");

	        int day = scanner.nextInt();

	        switch (day) {
	            case A:
	            	System.out.println("Валидна карта!");
	                break;
	            case 2:
	            	System.out.println("Валидна карта!");
	                break;
	            case 3:
	            	System.out.println("Валидна карта!");
	                break;
	            case 4:
	            	System.out.println("Валидна карта!");
	                break;
	            case 5:
	            	System.out.println("Валидна карта!");
	                break;
	            case 6:
	            	System.out.println("Валидна карта!");
	                break;
	            case 7:
	            	System.out.println("Валидна карта!");
	                break;
	            case 8:
	            	System.out.println("Валидна карта!");
	                break;
	            case 9:
	            	System.out.println("Валидна карта!");
	                break;
	            case 10:
	            	System.out.println("Валидна карта!");
	                break;
	            case J:
	            	System.out.println("Валидна карта!");
	                break;
	            case Q:
	            	System.out.println("Валидна карта!");
	                break;
	            case K:
	            	System.out.println("Валидна карта!");
	                break;
	            default:
	                System.out.println("Невалидна карта!");
	                break;
	        }
	        scanner.close();
	}

}
