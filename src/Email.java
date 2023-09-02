import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company = "ABC";
    private String password;
    private String email;
    private String status = "check";
    private int emailCapacity = 500;
    private String alernativetEmail;
   
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email have been create.");
        System.out.println("For "+ this.firstName+" "+ this.lastName+" From Company "+ this.company);
        this.department = setDepartment();
        System.out.println("Your department is: " + this.department);
        System.out.println("We will generate password ...");
        this.password = generatePassword(8);
        System.out.println("Your password is: "+ this.password);
        this.email = this.firstName+"."+this.lastName+"@"+this.department+"."+this.company+".com";
        System.out.println("Your Email is: "+ this.email.toLowerCase());
    }
    private String setDepartment(){
        System.out.println("Department CODE: \n Sales : 01 \n Development: 02 \n Accounting: 03");
        while (this.status == "check"){
            System.out.print("Your department code is: ");
            Scanner departmentInfo = new Scanner(System.in);
            int departmentCode = departmentInfo.nextInt();
            if (departmentCode == 01) {
                this.status = "pass";
                this.department =  "Sales";
            } 
            else if (departmentCode == 02){
                this.status = "pass";
                this.department = "Development";
            }
            else if (departmentCode == 03){
                this.status = "pass";
                this.department ="Accounting";
            }
            else  {
                System.err.println("The department code is wrong, please type again.");
            }
        }
        return this.department;
        
    }

    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ)0123456789!@#$%";
        char[] password = new char[length];
        for (int i =0; i<length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);  
    }

    public void setEmailCapacity(int capacity){
        this.emailCapacity = capacity;
        System.out.println("Email Capacity: "+ this.emailCapacity);
    }
    
    public void setAlternativeEmail(String altEmail){
        this.alernativetEmail = altEmail;
        System.out.println("Alternative Email: "+ this.alernativetEmail);
    }

    public void changePassword(String password){
        this.password = password;
        System.out.println("Your new password is "+ this.password);
    }

    public int getEmailCapacity(){
        return emailCapacity;
    }

    public String getAlernativetEmail(){
        return alernativetEmail;
    }

    public String getPassword(){
        return password;
    }
}
