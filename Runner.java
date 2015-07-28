import java.util.Scanner;

public class Runner{

    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try{
            Calculate calc = new Calculate();
            String exit = "no";
            while(!exit.equals("yes")){
                System.out.println("Enter the first arg: ");
                String first = reader.next();
                System.out.println("Enter the second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result: "+calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes\no ");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}