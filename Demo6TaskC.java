public class Demo6TaskC {
    public static void main(String[] args) {

        String city="CITY";
        String state="STATE";
        String population="POPULATION";

        String city1I="Los";
        String city1II="Angeles";
        String city2I="New";
        String city2II="York";

        String green= "\033[32;2m";
        String pink= "\033[35;2m";
        String reset= "\033[32;0m";
        String whiteBold= "\033[37;1m";
        String white= "\033[37;1m";
        String ash= "\033[37;2m";

        String city1=String.format("%3$s%s%4$s %s",city1I,city1II,ash,reset);
        String city2=String.format("%s%s%s %s",green,city2I,reset,city2II);

        String state1="California";

        double pop1=3966936;
        double pop2=8336817;


        String line="+-----------------+------------+------------+";

        System.out.printf("%s\n",line);
        System.out.printf("| %4$s%-16s%5$s| %4$s%-11s%5$s|%4$s%11s%5$s |\n",city,state,population,whiteBold,reset);
        System.out.printf("%s\n",line);
        System.out.printf("| %-16s     | %-11s|%s%,11.0f%s |\n",city1,state1,pink,pop1,reset);
        System.out.printf("| %s        | %1$s   |%s%,11.0f%s |\n",city2,pink,pop2,reset);
        System.out.printf("%s\n",line);



        
        
    }
}
