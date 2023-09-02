import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+ this.firstName+' '+this.lastName);
        this.department = setDepartment();
        System.out.println("Your department is: " + this.department);
    }
    private String setDepartment(){
        System.out.println("Department CODE: \n Sales : 01 \n Development: 02 \n Accounting: 03");
        System.out.print("Your department code is: ");
        Scanner departmentInfo = new Scanner(System.in);
        int departmentCode = departmentInfo.nextInt();
        if (departmentCode == 01) {return "Sales";} 
        else if (departmentCode == 02){return "Development";}
        else if (departmentCode == 03){return "Accounting";}
        else  { return "Wrong Code";}
    }
}
