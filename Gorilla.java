public class Gorilla {
   public static int count;

   public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }
    public void announceBabies() {
        Gorilla gr = new Gorilla();
              addGorilla();
              gr.babyGorilla();
           }
    public static void announceBabiesToEveryone() {
             addGorilla();
             Gorilla gr = new Gorilla();
           gr.babyGorilla();     // DOES NOT COMPILE
           }
   public int total;
//   public static average = total/count;  // DOES NOT COMPILE
 }