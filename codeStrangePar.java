import java.util.Scanner;

public class codeStrangePar {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int cases= scanner.nextInt();
            for (int i = 0; i <cases ; i++) {
                int n= scanner.nextInt();
                int x= scanner.nextInt();
                int[] nums=new int[n];
                for (int j = 0; j <nums.length ; j++) {
                    nums[j]= scanner.nextInt();
                }
                System.out.println(solve(nums,x));
            }
        }
        public static String solve(int[] nums,int x){
            long min=0;
            long max=0;
            long sum=0;
            long temp=0;
            String ans="";
            for (int i = 0; i < nums.length ; i++) {
                sum+=nums[i];
                if(nums[i]%x==0){
                    temp=nums[i]/x;
                }else {
                    temp=(nums[i]/x)+1;
                }
                max+=temp;
            }
            if(sum%x==0){
                min+=sum/x;
            }else {
                min=(sum/x)+1;
            }
            return min+" "+max;
        }
    }

