public class Spruce {

    public static void main(String[] args) {

        // Write code here

        //  This worked....
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("    *");


        /* Also Doesn't Like this Code
        System.out.print("\n" +
                "    *\n" +
                "   ***\n" +
                "  *****\n" +
                " *******\n" +
                "*********\n" +
                "    *\n" +
                "        ");
        */

        /* Grader Doesn't Like this code, IDK WHY
        System.out.printf(" \n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < 2*i + 1; k++){
                System.out.print("*");
            }


            System.out.printf(" \n");
        }

        System.out.printf("     * \n");

        */
    }

}
