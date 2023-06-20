public class NotVeryImportantInformation {
    String unnecessaryStuff;
    double irrelevantData;
    double poorCoding;
    double resultResults;
    double desperation;
    public NotVeryImportantInformation(double data1, double data2){
        this.unnecessaryStuff = "im very bad at improvising things, which extends to making snippets of code that have no clear direction";
        this.irrelevantData = data1;
        this.poorCoding = data2;

    }
    public double calculateUnclearResults(){
        if(irrelevantData < poorCoding){
            this.resultResults = poorCoding / irrelevantData * 100;
        } else {
            this.resultResults = irrelevantData / poorCoding * 100;
        }
        return this.resultResults;
    }
    public double iDontKnow(){
        this.desperation = irrelevantData + poorCoding;
        return desperation;
    }
    public String obligatoryUseOfString(){
        return (this.unnecessaryStuff);
    }
}
