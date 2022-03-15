public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean hasAttacked;
    public Dog(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        hasBeenWalked = false;
        hasAttacked = false;
    }

    public void walk(){
        System.out.println("I have been walked!");
        hasBeenWalked = true;
    }

    public boolean isHasBeenWalked(){
        return hasBeenWalked;
    }

    public void attack(){
        System.out.println("I have attacked someone today!");
        hasAttacked = true;
    }

    public boolean isHasAttacked(){
        return hasAttacked;
    }
}
