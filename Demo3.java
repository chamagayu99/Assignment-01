public class Demo3 {

    public static void main(String[] args) {
    
        int areaCode = 123;
        int value1 = 456;
        int value2 = 7890;
        String setColor= "\033[32;1m";
        String reset= "\033[32;0m";

        System.out.printf("telephone number in the standard American format:%s(%s)%s %s-%s \n",setColor,areaCode,reset,value1,value2);
        
    }
    
}
