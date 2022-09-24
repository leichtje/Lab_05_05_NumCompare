public class NumCompare {
    public static void main(String[] args) {

        double inputA;
        double inputB;
        double calculatedInput;


        System.out.println("What is the first input?");
        inputA=16;
        System.out.println("Your first input is: "+inputA);
        System.out.println("What is the second input?");
        inputB=14;
        System.out.println("Your second input is: "+inputB);

        calculatedInput=inputA - inputB;
        
        if (calculatedInput==0){
            System.out.println("Your numbers are equal");
        } else if (calculatedInput!=0) {
            if (inputA > inputB) {
                System.out.println("The first input is larger than the second");
            } else if (inputA < inputB) {
                System.out.println("The second input is larger than the first");
            }
        }
        else{
            System.out.println("You did not input a valid set of integers,Please input a valid set of integers an try again");
        }
    }
}
