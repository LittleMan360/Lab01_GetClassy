public class Product
{
    //Variables
    private String ID;
    private String name;
    private String description;
    private double cost;

    //Constructor
    public Product(String ID, String name, String description, double cost)
    {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    //Getters and Setters and ToString Methods

    //lets user get name
    public String getName()
    {
        return name;
    }

    //lets user set name
    public void setName(String name)
    {
        this.name = name;
    }

    //lets user get description
    public String getDescription()
    {
        return description;
    }

    //lets user set description
    public void setDescription(String description)
    {
        this.description = description;
    }

    //lets user get id
    public String getID()
    {
        return ID;
    }

    //lets user get cost
    public double getCost()
    {
        return cost;
    }


    //lets user set cost
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }

    //Method toCSVRecordMethod
    public String toCSVRecordMethod()
    {
        return this.ID + ", " + this.name + ", " + this.description + ", " + cost;
    }
}
