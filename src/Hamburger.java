

public class Hamburger
{




    public String[] Condiments = new String [6];

    public int CondimentCount;

    boolean addCondiments = true;



    public void setCondiments(String condiments)
    {
        this.Condiments[6] = condiments;
    }

    public String getCondiments()
    {
        return Condiments[6];
    }


    public int getCondimentCount()
    {


        return CondimentCount;
    }




    public boolean isAddCondiments()
    {
        return addCondiments;
    }

    public void setAddCondiments(boolean addCondiments) // adding the condiments
    {
        this.addCondiments = addCondiments;
    }

    public void display() // display the condiments

    {
        System.out.println("BURGER WITH: ");

    }


}
