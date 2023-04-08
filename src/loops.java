public class loops {
    public static void main(String[] args) {


    /*
    Syntax of for loops:
    for (initialization; condition; increment/decrement)
    {
    //body
    }
     */
//Q; print number 1 to 5
//        for (int i=1; i<=5; i++)
//        {
//            System.out.println(i);
//        }

        /*While loop syntax;
         declearation and initialization
         while(condition){
         //body
         increment/decrement;
         }

*/
//Q; print number 1 to 5

//        int i=1;
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }


        /*
        Syntax of do while loop;

        declearation and initaialization
        do{
        body
        increment/decrement;
        }
        while(conddion);
         */
    int n=1;
    do {
        System.out.println(n);
        n++;
    }
while (n<=5);
    }
}