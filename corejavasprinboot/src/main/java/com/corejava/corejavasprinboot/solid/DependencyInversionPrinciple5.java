package com.corejava.corejavasprinboot.solid;

/**
 *DIP states that high-level modules should not depend on low-level modules; both should depend on abstractions.
 */
//violates DSP
 class MySQLDatabase{
     void connect(){
         System.out.println("Connecting to MYSQL");
     }
}
class  Application{
     private MySQLDatabase database=new MySQLDatabase();
     void start(){
         database.connect();
     }
}
///  follows DIP

interface  Database{
    void connect();
}
class MySqlDatabase implements  Database{

    @Override
    public void connect() {
        System.out.println("Connecting to MYSQL");
    }
}
class Application1 {
    private Database database;
    Application1(Database database){
        this.database=database;
    }
    void  start(){
        database.connect();
    }
}
public class DependencyInversionPrinciple5 {
    public static void main(String[] args) {
        Database database=new MySqlDatabase();
        Application1 application1=new Application1(database);
        application1.start();
    }

}
