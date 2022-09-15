import java.util.Scanner;


public class number1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean hasFive = false;
        while (true){
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            }
            while(x>0){
                int d = x%10;
                if (d==5){
                    hasFive = true;
                }
                x/=10;
            }
        
        }
        if (hasFive){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
    
}