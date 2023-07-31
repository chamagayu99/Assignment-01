public class Demo5 {
    
    public static void main(String[] args) {

        int value1=978;
        int value2=3;
        int value3=16;
        int value4=1484100;
        String setColor1= "\033[31;1m";
        String setColor2= "\033[32;1m";
        String setColor3= "\033[33;1m";
        String setColor4= "\033[34;1m";
        String reset= "\033[32;0m";

        System.out.printf("ISBN number in the standard format: %s%s%9$s-%s%s%9$s-%s%s%9$s-%s%s%9$s \n",setColor1,value1,setColor2,value2,setColor3,value3,setColor4,value4,reset);

        
    }

}
