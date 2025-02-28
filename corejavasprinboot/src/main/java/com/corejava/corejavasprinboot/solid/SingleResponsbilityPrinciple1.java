package com.corejava.corejavasprinboot.solid;

/**
 * SRP states that a class should have only one reason to change,
 * meaning it should have only one responsibility.
 */

class  Report {
    public String generateReport() {
        return "Report data";
    }

    public void saveFile(String data) {
        System.out.println("Saving to report a file ");
    }
}
// this is following SRP
class  ReportGenerator{
    public String generateReport(){
        return "Report Data";
    }
}
class ReportSaver{
    public void saveReport(String data){
        System.out.println("Saving report to file ");
    }
}
public class SingleResponsbilityPrinciple1 {



}
