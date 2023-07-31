public class Demo6TaskD {

        public static void main(String[] args) {
    
            String item="ITEM";
            String quantity="QUANTITY";
            String price="PRICE";

            String item1="Apples";
            String item2="Oranges";

            String green= "\033[32;2m";
            String blue= "\033[34;2m";
            String pink= "\033[35;2m";
            String whiteBold= "\033[37;1m";
            String reset= "\033[32;0m";

            int quantity1=5;
            int quantity2=10;

            double price1=0.99;
            double price2=1.49;

            System.out.printf("+----------+----------+-------+\n");
            System.out.printf("| %4$s%-9s%5$s|%4$s%9s%5$s | %4$s%-6s%5$s|\n",item,quantity,price,whiteBold,reset);
            System.out.printf("+%s----------%s+----------+%1$s-------%2$s+\n",green,reset);
            System.out.printf("| %-9s|%4$s%9s%5$s | %7$s$%5$s%6$s%-5s%5$s|\n",item1,quantity1,price1,blue,reset,pink,green);
            System.out.printf("| %-9s|%4$s%9s%5$s | %7$s$%5$s%6$s%-5s%5$s|\n",item2,quantity2,price2,blue,reset,pink,green);    
            System.out.printf("+%s----------%s+----------+%1$s-------%2$s+\n",green,reset);
        }
    
}
