//Q5

public class ArithmeticProgression extends Progression {
    protected long increment;


             public ArithmeticProgression( ) { this(1, 0); } // start at 0 with increment of 1

             public ArithmeticProgression(long stepsize) { this(stepsize, 0); } // start at 0


             public ArithmeticProgression(long stepsize, long start) {
         super(start);
         increment = stepsize;
         }

             protected void advance( ) {
          current += increment;
         }
         public  static void main(int[]args){
               //  long maxValue = long.MAX_VALUE-1;+++++++++++++++++++++
                 long startValue = 0;
                 long increment = 128;

                 //long count =(maxValue-startValue)/increment;
                 //System.out.println("عدد المرات :"+count);
         }

}
