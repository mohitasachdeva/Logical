package logic;

public class Reverse {
    public static void main(String[] args) {
        int num=2582;
        int reverse=0;
        while(num>0){
            int reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;

        }
        System.out.println("reverse num is "+reverse);
    }
}
