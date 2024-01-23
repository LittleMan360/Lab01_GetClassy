import java.util.Calendar;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }



    //lets user enter id
    public String getID()
    {
        return ID;
    }
    //lets user set id
    public void setID(String ID)
    {
        this.ID = ID;
    }
    //lets user get first name
    public String getFirstName()
    {
        return firstName;
    }
    //lets user set first name
    /*
    *I know first name usually doesn't change but still kept in
    */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //lets user get last name
    public String getLastName()
    {
        return lastName;
    }
    //lets user set last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    //lets user get title
    public String getTitle()
    {
        return title;
    }
    //lets user set title
    public void setTitle(String title)
    {
        this.title = title;
    }

    //gets year of birth
    public int getYOB()
    {
        return YOB;
    }

    //lets user set year of birth
    public void setYOB(int YOB)
    {

        this.YOB = YOB;
    }

    //gets the full name from first and last name
    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }

    //get their formal name title and full name
    public String formalName()
    {
        return this.title + " " + getFullName();
    }

    //get the current age of the person in question
    public static int getAge(int year)
    {
        int date = Calendar.getInstance().get(Calendar.YEAR);
        int age = date - year;
        return age;
    }


    //returns the file to csv file
    public String toCSVRecordMethod()
    {
        return  this.ID + ", " + this.firstName + "," + this.lastName + "," + YOB;
    }
}
