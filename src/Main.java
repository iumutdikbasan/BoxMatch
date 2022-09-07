public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Ali",15,90,90,50);
        Fighter f2 = new Fighter("Rocky",10,115,95,35);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
