package csYa_ronny;

public class Main {
    public static void main(String[] args) {
        int[] values = {45, 35, -67, -45, 20, -1, 45};
        int result = func(values);
        System.out.println(result);
    }

    public static int func(int[] nums) {
        int positives=0, negetives=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0)
                negetives++;
            else
                positives++;
        }
        if(positives>negetives){
            int[] arrPost= removeNeg(nums, positives);
            return arrPost.length;
        }else if(negetives>positives){
            int[] arrNeg = removePos(nums, negetives);
            return arrNeg.length;
        }
        else{
            int[] equals = equalsArr(nums);
            return equals.length;
        }
    }

    private static int[] equalsArr(int[] nums) {
        int[] equalsArr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=0){
                equalsArr[index] = nums[i];
                index++;
            }
        }//copied all postives
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                equalsArr[index] = nums[i];
                index++;
            }
        }
        return equalsArr;
    }

    private static int[] removePos(int[] nums, int negetives) {
        int[] negetArr = new int[negetives];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                negetArr[index] = nums[i];
                index++;
            }
        }
        return negetArr;
    }


    public static int[] removeNeg(int[] nums, int positives) {
        int[] postivesArr = new int[positives];
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>=0){
                postivesArr[index]= nums[i];
                index++;
            }
        }
        return postivesArr;
    }
}