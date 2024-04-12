package April6;

public class DemoBooks {
    /*
    Create a Book class
1. author
2. Publication year
3. Genre
4. Name of book
5. price -- give a default price to the book

# create diff consts to pass

## create a method to print all the object values

Good to great
2023
Non fiction
Jim Collins

Rich Dad poor Dad
Non fiction
Robert Kiyoski
2014

     */

    String author,gender,book_name;
    int year;
    double price = 15.50;

    DemoBooks(String book_name,String author){
        this.book_name = book_name;
        this.author = author;
        System.out.println("Calling two parameterized constructor:  ");
        System.out.println("1. Book name: "+ this.book_name + " 2. Author name: "+ this.author);
    }
    DemoBooks(String book_name,String author,int year){
        this.book_name = book_name;
        this.author = author;
        this.year = year;
        System.out.println("Calling three parameterized constructor:  ");
        System.out.println("1. Book name: "+ this.book_name + " 2. Author name: "+ this.author +" 3. Publication_year: "+this.year);
    }

    DemoBooks(String book_name,String author,String gender,int year){
        this.book_name = book_name;
        this.author = author;
        this.gender = gender;
        this.year = year;
        System.out.println("Calling four parameterized constructor:  ");
        System.out.println("1. Book name: "+ this.book_name + " 2. Author name: "+ this.author +
                " 3. year: "+this.year+" 4. Publication_year: "+this.year);
    }

    DemoBooks(String book_name,String author,String gender,int year,double price){
        this.book_name = book_name;
        this.author = author;
        this.gender = gender;
        this.year = year;
        this.price = price;
        System.out.println("Calling all parameters into constructor:  ");
        System.out.println("1. Book name: "+ this.book_name + " 2. Author name: "+ this.author +
               "3. gender: "+this.gender+ " 4. year: "+this.year+" 5. Publication_year: "+this.year+" 6. Price: "+this.price);
    }
}
