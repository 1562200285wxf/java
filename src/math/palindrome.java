package math;

public class palindrome {

    public static void main(String[] args) {
        System.out.println(maxArea1(new int[]{1,8,6,2,5,4,8,3,7}));

    }


    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        //保存最大长度和对应的起始位置
        int[] range = new int[2];
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            i = findLongest(range, str, i);
        }
        return s.substring(range[0], range[1] + 1);
    }

    //比之之前的就是把相同的字符串看成一个整体然后记录前后的下标
    public static int findLongest(int[] range,char[] chars,int low) {
        int high = low;
        while (high<chars.length-1 && chars[high+1] == chars[low]){
            high ++;
        }
        int anys = high;
        //low 或者high不得超过左右边的边界  从相同字符的左右发散查找回文串
        while (low >0 && high<chars.length-1 && chars[low-1] == chars[high+1]){
            low -- ;
            high ++;
        }
        if(high-low>range[1]-range[0]){
            range[1] = high;
            range[0] = low;
        }
        return anys;
    }



    //判断数值是否是回文串
    public static boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int lenth = chars.length;
            for (int i = 0; i <lenth/2 ; i++) {
                if(chars[i] != chars[lenth-1-i])
                    return false;
        }
        return true;
    }

    public static  int maxArea1(int[] height){
        int max = 0;
        for (int i = 0; i <height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int area = 0;
                int min = height[i];
                if(height[i]>height[j])
                    min = height[j];
                area = (j-i)*min;
                if(area>max)
                    max = area;
            }
        }
        return max;
    }

}
