public class wordNline {
        public static void main(String[] args){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
    
            System.out.println("Enter a Word: ");
            String Word = scanner.next();
            scanner.nextLine();
            
            System.out.println("Enter a Line: ");
            String Line = scanner.nextLine();
    
            System.out.print(Word + " " + Line);
            scanner.close();
        }
    }
