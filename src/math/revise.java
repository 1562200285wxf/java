package math;

public class revise {
    public static void main(String[] args) {
        System.out.println(reverse(-1563847412));
    }

    //反转
    public static  int reverse(int x) {
        double min = -1L<<31;
        double max = 1l<<32-1;
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        char[] re = new char[chars.length];
        int length = chars.length;
        if(x<0){
            for (int i = 1; i <length ; i++) {
                re[length-i] = chars[i];
            }
            String sss = String.valueOf(re);
            Double ddd = Double.valueOf(sss);
            if(-ddd<min)
                return 0;
            else
            return -ddd.intValue();
        }
        if(x>0){
            for (int i = 0; i <length ; i++) {
                re[length-i-1] = chars[i];
            }
            String sss = String.valueOf(re);
            Double ddd = Double.valueOf(sss);
            if(ddd>max)
                return 0;
            else
                return ddd.intValue();
        }
        return 0;
    }
}
