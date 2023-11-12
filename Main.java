import Advertisement.FacebookAdvertisement;
import Advertisement.eMail;
import Advertisement.printAdvertisement;
import Animals.Cat;
import Animals.Dog;
import Bank.BancaTransilvania;

public class Main {
    public static void main(String[] args) {


        FacebookAdvertisement facebookAdvertisement = new FacebookAdvertisement();
        eMail eMail = new eMail();
        printAdvertisement printAdvertisement = new printAdvertisement();

        System.out.println("___________________________________________________________");

        facebookAdvertisement.advertiseMessage("Hello! This is a new message from Facebook App");
        eMail.advertiseMessage("Hello! this is a new eMail message");
        printAdvertisement.advertiseMessage("Hello! This is a new print message");

        System.out.println("___________________________________________________________");

        BancaTransilvania bancaTransilvania = new BancaTransilvania(9999);

        int soldCurent;

        soldCurent = bancaTransilvania.withdraw(2999);
        System.out.println("Sold curent: " + soldCurent);

        soldCurent = bancaTransilvania.deposit(599);
        System.out.println("Sold curent: " + soldCurent);

        System.out.println("___________________________________________________________");


        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog talking style: " + dog.talk());
        System.out.println("Dog eating style: " + dog.eat());
        System.out.println("Dog walking style: " + dog.walk());


        System.out.println("Cat walking style: " + cat.walk());
        System.out.println("Cat eating style: " + cat.eat());
        System.out.println("Cat talking style: " + cat.talk());


        System.out.println("___________________________________________________________");

        Student student1 = new Student("Sam", 9);
        Student student2 = new Student("George", 7);
        Student student3 = new Student("Christian", 6);
        Student student4 = new Student("Clara", 4);
        Student student5 = new Student("John", 9);

        System.out.println("The average students grade is : " + Student.getAverageGrade());



    }
}