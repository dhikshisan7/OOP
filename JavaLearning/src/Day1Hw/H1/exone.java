package Day1Hw.H1;

public class exone {
        public static void main(String[] args){
            if (args.length != 2) {
                System.out.println("Please enter two arguments.");
                return;
            }
            String company = args[0];
            String city = args[1];
            System.out.println(company + " Technologies " + city);
        }
    }
