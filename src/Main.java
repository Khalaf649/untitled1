import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Choose the number of parameters to pass to SUM:");
            System.out.println("1\n2");
        while (true) {

            int choice = myObj.nextInt();
            int sumRes = 0;
            switch (choice) {
                case 1:
                    System.out.println("Choose the data type of parameter to pass to SUM:");
                    System.out.println("1. int\n2. double");
                    int select = myObj.nextInt();
                    if (select == 1) {
                        System.out.println("Please enter an integer");
                        int input = myObj.nextInt();
                        sumRes = sum(1, input);

                    } else {
                        System.out.println("Please enter a float");
                        float input = myObj.nextFloat();
                        //   sumRes = sum(input);
                    }
                    break;
                case 2:
                    System.out.println("Choose the two integers to pass to SUM:");
                    int min = myObj.nextInt();
                    int max = myObj.nextInt();
                    if (max < min) {
                        int temp = max;
                        max = min;
                        min = temp;
                    }
                    // sumRes = sum(min, max);//what if max<min??
                    break;
                default:
                    System.out.println("Invalid choice\nPlease choose 1 or 2");//and???r we done?}
                    continue;
            }
            break;

        }
    }
    public static int sum(int min,int max)
    {
                                   // 3-5  =(1-5)-(1-2)
        return (max*(max+1)/2)-(min*(min-1)/2);
    }
}