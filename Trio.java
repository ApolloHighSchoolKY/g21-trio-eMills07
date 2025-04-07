//Write your answer here
public class Trio //implements MenuItem
{
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    
    //public Trio(Sandwich sandwich, Salad salad, Drink drink)
    //{
        //this.sandwich = sandwich;
        //this.salad = salad;
        //this.drink = drink;
    //}

    String getName()
    {
        return sandwich.getName + "/" + salad.getName + "/" + drink.getName;
    }
    Double getPrice()
    {
        if(sandwich.getPrice() > salad.getPrice() && sandwich.getPrice() > drink.getPrice())
            if(salad.getPrice() > drink.getPrice())
                return sandwich.getPrice() + salad.getPrice();
            else 
                return sandwich.getPrice() + drink.getPrice();
        else
            return salad.getPrice() + drink.getPrice();
    }
    
}