public class FindGrade {
    public static void main(String[] args){
        int grade = Integer.parseInt(args[0]);
        if (grade > 100 || grade < 0){
            System.out.println("Please enter a valid grade!");
        }else if (grade >= 90){
            System.out.println("Your letter grade is: A");
        }else if (grade >= 80){
            System.out.println("Your letter grade is: B");
        }else if (grade >=70){
            System.out.println("Your letter grade is: C");
        }else if (grade >=60){
            System.out.println("Your letter grade is: D");
        }else{
            System.out.println("Your letter grade is: F");
        }
    }
}
