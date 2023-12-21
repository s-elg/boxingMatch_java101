package BoxingMatchAssignment;

public class Main {
    public static void main(String[] args) {
        Fighter jeff = new Fighter("jeff" , 24, 95, 102, 20);
        Fighter jack = new Fighter("jack", 15,115,87,25);

        Match match = new Match(jeff, jack, 115, 85);
        match.run();
    }

}
