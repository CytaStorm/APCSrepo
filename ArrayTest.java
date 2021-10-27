public class ArrayTest{
   public static void main(String[]args){
        int[] anArray = new int[11];
        int arrayVar = 100;
        String part2 = "part 2:";
        //Write the loop to initialize it
        for (int i = 0; i < anArray.length; i ++) {
          anArray[i] = arrayVar;
          arrayVar += 10;
        }
        System.out.println("part 1:" + anArray);
        //print the array variable
		String list = "";
        for (int i = 0; i < anArray.length; i ++) {
			list += anArray[i] ;
			list += " ";
        }
         System.out.print("part 2:\n" + list);
        //Write a loop to print it out (on one line)
   }
}
