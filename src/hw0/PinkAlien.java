package hw0;

public class PinkAlien extends SpaceAlien implements ZapsWithSlime{
    
    private String name;
    private int numEyes;
    private String color;

    public PinkAlien(String iniName, int iniNumEyes, String homePlanet, double distanceFromEarth){
        super(homePlanet, distanceFromEarth);
        name = iniName;
        numEyes = iniNumEyes;
        color = "Pink";
    }

    public int getNumEyes(){
        return numEyes;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void doGreeting(){
        super.doGreeting();
        System.out.println("My name is " + name + ", I have " + numEyes + " eyes, and my color is " + color); 
    }

    @Override
    public String doSlimeZap(int numHumans) {
        if (numHumans <= 0){
            return "NO TARGET!";
        }
        else if (numHumans == 1){
            return "eeehy";
        }
        else{
            return "EEEEEEHHHHHHHYYYYYY";
        }
    }

    @Override
    public String slimeWholeEarth() {
        return "PWWUHHHHHHHHHH";
    }
    
    public static void main(String[] args) {
        PinkAlien pa = new PinkAlien("Mina", 1, "Noli", 2783);
        pa.doGreeting();
        String[] actions = {
        pa.doSlimeZap(4),
        pa.doSlimeZap(1),
        pa.doSlimeZap(0),
        pa.doSlimeZap(-1),
        pa.slimeWholeEarth(),
        };

        for (String action : actions){
            System.out.println(action);
        }
    }
}
