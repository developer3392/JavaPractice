import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int valueInput;
        int count = 0;

        System.out.println("Enter starting number: ");
        valueInput = keyboard.nextInt();

        while(valueInput != 1){
            System.out.print(valueInput + " ");

            if(valueInput % 2 == 0){
                valueInput = valueInput / 2;
            }
            else if(valueInput % 2 != 0){
                valueInput = (valueInput * 3) + 1;
            }
            else{
                System.out.println("Error setting value to 1");
                valueInput = 1;
            }
            count++;

            if(count % 10 == 0) System.out.println("\n");
        }
        System.out.println(valueInput);

    }
}
