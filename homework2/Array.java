public class Array {
    public static void main(int[]args){

        try {
            int[] array = new int[5];
            int index=10;
            int value = array[index];
            //System.out.println(value);

        }catch(e exception){
           //System.out.println( "Don't try buffer overflow attacks in java!");
        }
    }
}

// انشئت مصفوفه بحجم 5 ثم يحاول الوصول الى عنصر في index10 وهو خارج
//الحدود المسموح للمصفوفه واذا حدث استثاء راح يطبع لي الرساله
