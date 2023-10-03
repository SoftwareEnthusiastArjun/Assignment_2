import java.io.*;
class Car
{
int id;
String make;
String model;
int year_of_manufacture;
String color;
int price;
String registration_number;
public Car(int id, String make, String model, int year_of_manufacture, String color, int price,
    String registration_number) {
    this.id = id;
    this.make = make;
    this.model = model;
    this.year_of_manufacture = year_of_manufacture;
    this.color = color;
    this.price = price;
    this.registration_number = registration_number;
}
}

class Main
{
    public static void main(String[] args){
        Car[] obj={
            new Car(1,"BMW","Sedan",1990,"white",5000,"TN75AF001"),
            new Car(2,"BMW","SUV",2021,"white",6000,"TN75AF002"),
            new Car(3,"TATA","HatchBack",2015,"black",4500,"TN75AF003"),
            new Car(4,"Maruthi","Sedan",1992,"red",5000,"TN75AF004"),
            new Car(5,"TATA","Sedan",2010,"blue",10000,"TN75AF005"),
            new Car(6,"Audi","Sedan",1990,"white",4000,"TN75AF006"),
            new Car(7,"Toyato","SUV",2010,"white",8000,"TN75AF007"),
            new Car(8,"Hundai","HatchBack",2000,"black",6000,"TN75AF008"),
            new Car(9,"Audi","Sedan",2010,"red",4000,"TN75AF009"),
            new Car(10,"TATA","Sedan",2017,"blue",9000,"TN75AF010"),
        };
        int current_year=2023;
        File abs_file=new File("");
        String abs_path=abs_file.getAbsolutePath();
        String List_of_Cars_of_a_given_Brand=abs_path+"\\List_of_Cars_of_a_given_Brand";
            

       try {
            System.out.println("Creating List of cars of a given brand TATA:");
            FileWriter pen=new FileWriter(List_of_Cars_of_a_given_Brand);
            pen.write("List of cars of a given brand TATA:");
            pen.write("\n------------------------------\n");
           
        for(Car i:obj)
        {
            String brand=i.make.toLowerCase();
            if(brand.equals("TATA".toLowerCase()))
            {
                //System.out.println("id: "+i.id+"\n make: "+i.make+"\n model: "+i.model+"\n year_of _manufactue: "+i.year_of_manufacture + "\n color:"+i.color+ "\n price:"+i.price+"\n Reg_Number: "+i.registration_number);   
                pen.write("id: "+i.id+"\n make: "+i.make+"\n model: "+i.model+"\n year_of _manufactue: "+i.year_of_manufacture + "\n color:"+i.color+ "\n price:"+i.price+"\n Reg_Number: "+i.registration_number+"\n");                                  
            }
        }  
         System.out.println("Created  List of cars of a given brand TATA");
         System.out.println("--------------------------------");
         pen.close();
       } catch (Exception e) {
        System.out.println("some error ocured in, List of cars of a given brand");        
       }

       String Cars_Used_for_MoreThan_10years = abs_path+"\\Cars_Used_for_MoreThan_10years";
       try {
         System.out.println("Creating List of cars that have been in use for more than 10 Years(Current year:2023):");
         //System.out.println("------------------------------");
         FileWriter pen=new FileWriter(Cars_Used_for_MoreThan_10years);
         pen.write("List of cars that have been in use for more than 10 Years(Current year:2023):\n");
         pen.write("------------------------------\n");

        for(Car i:obj)
        {
            int year=current_year-i.year_of_manufacture;
            if(year>10)
            {
                //System.out.println("id: "+i.id+"\n make: "+i.make+"\n model: "+i.model+"\n year_of _manufactue: "+i.year_of_manufacture + "\n color:"+i.color+ "\n price:"+i.price+"\n Reg_Number: "+i.registration_number);  
                pen.write("id: "+i.id+"\n make: "+i.make+"\n model: "+i.model+"\n year_of _manufactue: "+i.year_of_manufacture + "\n color:"+i.color+ "\n price:"+i.price+"\n Reg_Number: "+i.registration_number);                               
            }
        }  
        pen.close();
        System.out.println("Created List of cars that have been in use for more than 10 Years(Current year:2023):");
        System.out.println("--------------------------------");  
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println("error occured in List of cars that have been in use for more than 10 Years(Current year:2023)");
       }
       

        String Cars_of_Manufacture_above_Certain_Amount = abs_path+"\\Cars_of_Manufacture_above_Certain Ammout";
        int price=5000;
        try {
            System.out.println("Creating List of cars of manufacture year 2010, whose price is greater than 5000:");
            FileWriter pen=new FileWriter(Cars_of_Manufacture_above_Certain_Amount);
            pen.write("List of Cars of Manufacture whose price is greater than a Certain Ammout: \n");
            //System.out.println("------------------------------");
             pen.write("------------------------------\n");
            for(Car i:obj)
            {
                int n=i.year_of_manufacture;
                int p=i.price;
                if( (n == 2010) && (p>price))
                {
                    //System.out.println("id: "+i.id+"\n make: "+i.make+"\n model: "+i.model+"\n year_of _manufactue: "+i.year_of_manufacture + "\n color:"+i.color+ "\n price:"+i.price+"\n Reg_Number: "+i.registration_number);    
                    pen.write("id: "+i.id+"\n make: "+i.make+"\n model: "+i.model+"\n year_of _manufactue: "+i.year_of_manufacture + "\n color:"+i.color+ "\n price:"+i.price+"\n Reg_Number: "+i.registration_number);                                 
                }
            }  
            pen.close();
            System.out.println("Created List of cars of manufacture year 2010, whose price is greater than 5000");
            System.out.println("--------------------------------");   
        } catch (Exception e) {
            System.out.println("Error Occured in List of cars of manufacture year 2010, whose price is greater than 5000");
        }
        
    }
}