public class Demo6TaskB {
    public static void main(String[] args) {

        String name1="Alice";
        String name2="Bob";

        String name="NAME";
        String age="AGE";

        int age1=24;
        int age2=30;

        String blue= "\033[34;1m";
        String pink= "\033[35;2m";
        String reset= "\033[32;0m";


        String string1="+-----------------+-----+";

        System.out.printf("%s\n| %9$s%-16s%10$s|%9$s%4s%10$s |\n%1$s\n| %-16s|%8$s%4s%10$s |\n| %-16s%10$s|%8$s%4s%10$s |\n%1$s\n",string1,name,age,name1,age1,name2,age2,pink,blue,reset);
    }
    
}
