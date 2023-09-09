public class spynum {
        public static void main(String[] args){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Enter a Number: ");
            int number = scanner.nextInt();
            int sum_of_digits = 0;
            int product_of_digits = 1;
            int temp = number;
    
            while(number > 0){
                int digit = number % 10;
                sum_of_digits += digit;
                product_of_digits *= digit;
                number /= 10;
            }
            if(sum_of_digits == product_of_digits)
                System.out.println(temp + " is Spy Number");   
            else
                System.out.println(temp + " is Not a Spy Number");
            scanner.close();
            }  
    }
