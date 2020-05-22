import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.*;
import java.util.*;
import java.time.*;
    public class TestClass {
static int numberEggs;// instance variable
        private static final ArrayList<String> values = new ArrayList<>();
        float notAtEnd = 1_000.00f;
         static int o = 1;
        //static int numberEggs=10;

        public static void setnumg(int u) {
            u = 9 + u;
            o = o + u;
            System.out.println("u is:" + u);
            System.out.println("o is:" + o);
        }
        public static void speak(StringBuilder sf) {
            sf.append("Webby");
        }

        public static void main(String[] args) {
            int numberEggs = 99;
            int[] numbers = {
                    951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                    615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                    386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                    399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                    815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                    958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                    743, 527};
           StringBuilder name = new StringBuilder();
            speak(name);
            System.out.println(name);

            String rev = "Mallu";
            String input="teeter";
            values.add("changed");
            values.add("changedagain");
            System.out.println("arraylist:" +values);
            TestClass mother = new TestClass();
            mother.numberEggs = 1;    // set variable
            System.out.println(mother.numberEggs);  // read variable
            TestClass mother1 = new TestClass();
            TestClass mother2=mother1;
            System.out.println("mother.numbrer of eggs(before 5..shld be 1)=" +mother.numberEggs);  // read variable
            mother1.numberEggs = 5;    // set variable
            System.out.println("mother.numbrer of eggs=" +mother.numberEggs);  // read variable
            System.out.println("mother1.numberEggs" +mother1.numberEggs);  // read variable
            System.out.println("mother2.numberEggs" +mother2.numberEggs);  // read variable
            System.out.println("run-local variable 99 =" + numberEggs);  // read variable
            System.out.println(Integer.MAX_VALUE);
            setnumg(4);
            setnumg(4);
            StringBuilder sb = new StringBuilder().append(1).append('c');
            sb.append("-").append(true);
            System.out.println(sb);
            //Arrays. sort(numbers);
            StringBuilder sb1 = new StringBuilder(rev);
            sb1.reverse();
            System.out.println(sb1);
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder() ;
            String x = "Hello World";
            String z = " Hello World";
            LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
            LocalDate date2 = LocalDate.of(2020,5,19);
            LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
            LocalTime time = LocalTime.of(11, 12, 34);
            LocalDateTime dateTime = LocalDateTime.of(date, time);
            DateTimeFormatter shortF = DateTimeFormatter
                    .ofLocalizedDate(FormatStyle.SHORT);
            DateTimeFormatter mediumF = DateTimeFormatter
                    .ofLocalizedDateTime(FormatStyle.MEDIUM);
            System.out.println(shortF.format(dateTime));     // 1/20/20 11:12 AM
            System.out.println(mediumF.format(dateTime));     // Jan 20, 2020 11:12:34 AM

            System.out.println(sb3.equals(sb4));
            System.out.println(x.equals(z.trim())); // false
            //char[] letters =k;
                        for (int values : numbers) {
                if (values % 2 == 0)
                    System.out.print("," + values);
                if (values == 237)
                    break;
            }
            System.out.println("");
            LocalDate date3 = LocalDate.now();
            LocalDate date4 = LocalDate.of(2020,1,1);
            LocalDate date5= LocalDate.parse("2020-01-01");
            DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
           // System.out.println(date5.format(f));
            LocalDate date6=LocalDate.parse("22 Jan 2020",df);
            LocalDateTime datetime1=LocalDateTime.of(2020, 1, 1, 1, 1);
            //DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
            char[] temparray = rev.toCharArray();
            for (int t = temparray.length-1; t>=0;t--)
                        {
                System.out.print(temparray[t]);
                System.out.print("");
            }
            for(char i :input.toCharArray()){
                if(input.indexOf(i)==input.lastIndexOf(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }


