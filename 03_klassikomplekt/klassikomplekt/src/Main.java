public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double data1 = 66.22;
        double data2 = 20.38;
        double data3 = 13.40;
        double data4 = 79.92;
        int modifier = 5;
        System.out.println(imReallyJustWritingThingsNowHuh(data1, data2, data3, data4, modifier));
        System.out.println(iAddedTheseLines());
        System.out.println(mightAsWellUseAllFunctions(data1, data2, data3, data4, modifier));

    }
    public static double imReallyJustWritingThingsNowHuh(double data1, double data2, double data3, double data4, int modifier){
        NotVeryImportantInformation notVeryImportantInformation = new NotVeryImportantInformation(data1, data2);
        VeryImportantInformation veryImportantInformation = new VeryImportantInformation(data3, data4, modifier);
        double losingTrackOfTheCalculations = notVeryImportantInformation.iDontKnow() * veryImportantInformation.thisIsUnnecessary();
        return losingTrackOfTheCalculations;
    }
    public static String iAddedTheseLines(){
        NotVeryImportantInformation notVeryImportantInformation = new NotVeryImportantInformation(1, 1);
        VeryImportantInformation veryImportantInformation = new VeryImportantInformation(1, 1, 1);
        return veryImportantInformation.functionWithString() + " " + notVeryImportantInformation.obligatoryUseOfString();
    }
    public static double mightAsWellUseAllFunctions(double data1, double data2, double data3, double data4, int modifier){
        NotVeryImportantInformation notVeryImportantInformation = new NotVeryImportantInformation(data1, data2);
        VeryImportantInformation veryImportantInformation = new VeryImportantInformation(data3, data4, modifier);
        return notVeryImportantInformation.calculateUnclearResults() * veryImportantInformation.iAddedAnInteger();
    }
}