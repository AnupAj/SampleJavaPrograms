class Marsupial {
    public boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
    //hiding
    public static boolean ishide() {
        return false;
    }
    public static void hidegetMarsupialDescription() {
        System.out.println("hide-Marsupial walks on two legs: "+ishide());
    }
}
public class Kangaroo extends Marsupial {
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    //hide

    public static boolean ishide() {
        return true;
    }
    public static void hidegetKangarooDescription() {
        System.out.println("hide-KangarooMarsupial walks on two legs: "+ishide());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
        joey.hidegetMarsupialDescription();
        joey.hidegetKangarooDescription();
        Marsupial mar=new Marsupial();
        mar.getMarsupialDescription();
        mar.hidegetMarsupialDescription();

    }
}