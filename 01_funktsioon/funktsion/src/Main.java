public class Main {
    public static void main(String[] args) {
        int randX = (int) (Math.random()*100);
        int randY = (int) (Math.random()*100);
        int randZ = (int) (Math.random()*100);
        double what = doMath(randX,randY,randZ);
        System.out.println(what);
        beFunny();
        printCat();
    }
    //ma tean et funktsioonid peaksid midagi asjalikku tegema aga mulle ei tule ühtegi ideed mis see võiks olla
    private static int doMath(int x, int y, int z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x * y - 3 * z;
    }
    private static void beFunny(){
        System.out.println("cant. lul");
    }
    private static void printCat(){
        System.out.print("Art by Joan Stark\n" +
                "      \\    /\\\n" +
                "       )  ( ')\n" +
                "      (  /  )\n" +
                "jgs    \\(__)|");
        //looja nime jätsin teadlikult sisse
    }
}


