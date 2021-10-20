import java.util.Scanner;
public class DistinctNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int[] incidence = new int[10];
        int uniqueLen = 0, counter = 0;
        for (int i = 0; i < nums.length; i++){
            System.out.print("Enter an integer: ");
            nums[i] = input.nextInt();
        }

        for (int i = 0; i < nums.length; i++){
            for (int j = i; j >= 0; j--){
                if (nums[j] == nums[i])
                    incidence[j]++;
            }
        }

        for (int i = 0; i < nums.length; i++){
            if (incidence[i] == 1)
                uniqueLen++;
        }

        int[] uniqueNums = new int[uniqueLen];

        for (int i = 0; i < incidence.length; i++){
            if (incidence[i] == 1){
                uniqueNums[counter] = nums[i];
                counter++;
            }
        }

        System.out.print("Distinct numbers you entered were: ");
        for (int uniqueNum : uniqueNums) {
            System.out.print(uniqueNum + " ");
        }
    }
}
