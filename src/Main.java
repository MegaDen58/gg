public class Main {
    public static void main(String[] args) {
        boolean result = true;
        Animals chicken = new Animals("Курица");
        Animals egg = new Animals("Яйцо");
        egg.start();
        chicken.start();
        try{
        egg.join();
        if (chicken.isAlive()) {
            System.out.println("Победила курица!");
        } else {
            System.out.println("Победило яйцо!");
        }
    }
        catch (Exception ex){

        }
    }
}
class Animals extends Thread{
    String animalName;

    Animals(String name){
        animalName = name;
    }

    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println(animalName);
        }
    }
}