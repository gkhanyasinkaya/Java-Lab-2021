public class GCDLoop {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + result);
    }
    private static int gcd(int num1,int num2){
        int remainder;
        do{
            remainder=num1%num2;
            if(remainder==0)
                return num2;
            num1=num2;
            num2=remainder;
        } while (remainder !=0);
            return num1;
        }
}

