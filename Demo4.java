public class Demo4 {
    
    public static void main(String[] args) {
    
        int day=28;
        int month=12;
        int year=2023;
        int hour=23;
        int minute=59;
        int second=59;
        String setColor1= "\033[31;1m";
        String setColor2= "\033[32;1m";
        String setColor3= "\033[33;1m";
        String setColor4= "\033[34;1m";
        String setColor5= "\033[35;1m";
        String setColor6= "\033[36;1m";
        String reset= "\033[32;0m";
        

        System.out.printf("date-time: %s%s%13$s/%s%s%13$s/%s%s%13$s %s%s%13$s:%s%s%13$s:%s%s%13$s \n",setColor1,month,setColor2,day,setColor3,year,setColor4,hour,setColor5,minute,setColor6,second,reset);



    }

}
