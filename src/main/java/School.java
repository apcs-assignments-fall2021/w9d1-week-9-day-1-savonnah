public class School {
    // Instance variables
    private int grade;
    private int schoolID;
    private String preferredName;
    private int balance;


    public School (int g, int s, int b, String p){
        grade = g;
        schoolID = s;
        preferredName = p;
        balance = b;
    }


    public void deposit (int input){ this.balance = balance + input; }

    public void withdraw (int input){ this.balance = balance - input; }

    public int getBalance (){ return balance; }

    public void setPreferredName (String name){
        this.preferredName = name;
    }

    public void setGrade (int num) {this.grade = num;}

    public int getgrade (){
        return grade;
    }

    public int getSchoolID(){
        return (14312938);
    }

    @Override
    public String toString() {return "Student " +  this.schoolID + " is in " + this.grade +"th grade";}


}