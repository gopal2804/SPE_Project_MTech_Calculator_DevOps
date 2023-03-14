import java.lang.Math;
import java.util.Scanner;
public class Calculator {

    float ans;
    float x, y;
    public float square_root(float x){
        if(x < 0){
            return -1f;
        }
        double temp = Math.sqrt(x);
        return (float) temp;
    }

    public int factorial(int x){
        if(x < 0){
            return -1;
        }
        int ans = 1;
        for(int i = 1; i <= x; i++){
            ans = ans * i;
        }
        return ans;
    }

    public float nat_log(float x){
        if(x < 0){
            return -1;
        }
        float temp = (float) Math.log(x);
        return temp;
    }

    public float power(float x, float y){
        float temp = (float) Math.pow(x,y);
        return temp;
    }

    public float evaluate(int op, float x, float y){
        switch(op)
        {
            case(1):
                ans = square_root(x);
                break;
            case(2):
                ans = factorial((int)x);
                break;
            case(3):
                ans = nat_log(x);
                break;
            case(4):
                ans = power(x,y);
                break;
            default:
                System.out.println("wrong option selected");
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Choose operation \n"+
                "1. Square Root \n"+
                "2. Factorial  \n"+
                "3. Natural Log  \n"+
                "4. Power  \n"+
                "Enter your choice : ");

        int op = scan.nextInt();
        float x = 0;
        float y = 0;

        if (op == 1 || op == 2 || op == 3 ){
            System.out.print("Enter operand x: ");
            x = scan.nextFloat();
        }
        else if (op == 4 ){
            System.out.print("Enter operands x y: ");
            x = scan.nextFloat();
            y = scan.nextFloat();
        }

        Calculator mycalc = new Calculator();
        System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));

    }
}