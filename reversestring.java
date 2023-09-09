public class reversestring {
        public static void main(String[] args){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("String:");
            String input = scanner.nextLine();
            int length = input.length();
            String reversed = "";
    
            for(int i = length - 1; i >= 0; i--){
                reversed += input.charAt(i);
            }
            System.out.println("Reversed String: " + reversed);
            scanner.close();
        }
        
    }
