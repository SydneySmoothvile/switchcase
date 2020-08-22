package controlswitch;

public class ControlSwitch {

    public static void main(String[] args) {
        char grade = 'A';
        
        switch(grade){
            case 'A' :
                System.out.println("Excellent Result");
                break;
            case 'B':
                System.out.println("Fair");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("pass");
                break;
            case 'F':
                System.out.println("Try again");
                break;
            default:
                System.out.println("you entered an invalid grade");
        }
        System.out.println("Your grade is " +grade);
        }
    }
    

