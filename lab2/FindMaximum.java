public class FindMaximum {
    public static void main(String[] args){
        if (args.length == 2){
            int val1 = Integer.parseInt(args[0]);
            int val2 = Integer.parseInt(args[1]);
            boolean cond = val1 >= val2;
            int result = cond ? val1 : val2;
            System.out.println(result);
            }
        }
}

