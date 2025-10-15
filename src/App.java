public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero (de 5 cifras como máximo): "));
        
        int dig1;
        int dig2;
        int dig3;
        int dig4;
        int dig5;
        boolean cap = false;

        if (num < 10){
            cap = true;
        }

        if ((num >= 10) && (num < 100)){
            dig1 = num/10;
            dig2 = num % 10;
            if (dig1 == dig2){
                cap = true;
            }
        }

        if ((num >= 100) && (num < 1000)){
            dig1 = num/100;
            dig2 = (num/10) % 10;
            dig3 = num % 10;
            if (dig1 == dig3){
                cap = true;
            }
        }

        if ((num >= 1000) && (num < 10000)){
            dig1 = num/1000;
            dig2 = (num/100) % 10;
            dig3 = (num/10) % 10;
            dig4 = num % 10;
            if ((dig1 == dig3) && (dig2 == dig3)){
                cap = true;
            }
        }

        if ((num >= 10000) && (num < 100000)){
            dig1 = num/10000;
            dig2 = (num/1000) % 10;
            dig3 = (num/100) % 10;
            dig4 = (num/10) % 10;
            dig5 = num % 10;
            if ((dig1 == dig5) && (dig2 == dig4)){
                cap = true;
            }
        }

        if  (cap == true){
            System.out.println("El número introducido es capicua");
        } else {
            System.out.println("El número introducido no es capicua");
        }
    }
}
