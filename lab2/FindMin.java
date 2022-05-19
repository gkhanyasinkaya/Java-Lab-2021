public class FindMin {
    public static void main(String[] args){
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        int val3 = Integer.parseInt(args[2]);

        int min = val1 <= val2 ? val1 : val2;
        min = min <= val3 ? min : val3;

        System.out.println("minimum = "+ min);


    }
}
