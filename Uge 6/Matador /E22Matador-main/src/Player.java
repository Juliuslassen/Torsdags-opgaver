import java.util.ArrayList;

public class Player {
    private String name;
    private BankAccount account;
    private int startPosition = 1;
    private int currentPosition = startPosition;
/*TODO: tilføj en liste til at holde på det spilleren har købt (jvf. Task 1.c)*/
    ArrayList<Property> properties = new ArrayList<>();


    public Player(String name, int amount) {
        this.name = name;
        account = new BankAccount(amount);
    }

    public void addPropertyValues(Property p){
        properties.add(p);
    }

    public ArrayList<Property> getProperties(){
        return properties;
    }

    public int getPropertyValues(){
        int sum= 0;
        for (Property p: properties){
            sum += p.cost;
        }
        return sum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return account.getBalance();
    }


    @Override
    public String toString() {
        return name +":"+ account;

    }
/*TODO: udvid metoden sådan at den tager en instans af type Property. Denne instans skal lægges i deeds */
    public void buy(int cost){
        //add deed to deeds
        this.account.doTransaction(-cost);
        // 1.d giver ingen fucking mening
        // addPropertyValues();
    }

    public int updatePos(int sum){

        currentPosition = currentPosition + sum;//52
        if(currentPosition >40){

          //  Field startField = board.getField(1);
          //  this.receive(startField);

            currentPosition -= 40;//currentPosition = currentPosition -40
        }
        return currentPosition;
    }

    public int getPosition() {
        return currentPosition;
    }


    public void pay(int amount) {
        this.account.doTransaction(-amount);
    }

    public void pay(int amount, Player p) {
        this.account.doTransaction(-amount);
        p.account.doTransaction(amount);
    }
    public void recieve(int amount){
        this.account.doTransaction(amount);
    }
}