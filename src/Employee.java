public class Employee {
    String name;
    int id;
    boolean attendence= false;
    int NormalWorkDay=8;
    int SalaryPerHour=20;
    double dailySalary=0;

    public void attendance(boolean a){
        if(a){
            attendence = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
    public void CalculateWage(){
        if(attendence){
            dailySalary=NormalWorkDay*SalaryPerHour;
            System.out.println(dailySalary);
        }else{
            dailySalary=0;
            System.out.println(dailySalary);
        }
    }

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }



}
