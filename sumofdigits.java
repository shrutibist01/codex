public class sum {
        public static void main(String[] args){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            
            System.out.println("Enter a Number:");
            int number = scanner.nextInt();
    
            int digits;
            int sum = 0;
    
            while(number > 0){
                digits = number % 10;
                sum += digits;
                number /= 10;
            }
            
            System.out.println("Sum of Digits: " + sum);
            scanner.close();
        }   
    }
