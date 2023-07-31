public class Demo6_Task_A{

    public static void main(String[] args) {

        int value1=5;
        int value2=0;
        String string="%";

        String setColor1= "\033[41;2m";
        String setColor2= "\033[42;2m";
        String reset= "\033[32;0m";

        System.out.printf("%s[      %s%s%s%s      ]%s \n",setColor1,value1,setColor2,value2,string,reset);
    }

    
}
