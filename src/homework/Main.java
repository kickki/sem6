package homework;

import dip1.model.Report;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister();
        persister.save(user);
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(user);
    }
}