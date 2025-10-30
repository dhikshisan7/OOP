package Day1Hw.H4;

public class exfour {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        System.out.println("Given num is "+num);
        if(num == 0){
                System.out.println("Given num is ZERO");
        } else if (num>0){
            System.out.println("Given num is POSITIVE");
        } else{
            System.out.println("Given num is NEGATIVE");
        }
    }
}
