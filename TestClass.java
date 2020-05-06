import java.util.*;
    public class TestClass {
        int numberEggs;// instance variable
        float notAtEnd = 1_000.00f;
        static int o = 1;

        public static void setnumg(int u) {
            u = 9 + u;
            o = o + u;
            System.out.println("u is:" + u);
            System.out.println("o is:" + o);
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
            String rev = "Mallu";
            String input="teeter";
            TestClass mother = new TestClass();
            mother.numberEggs = 1;    // set variable
            System.out.println(mother.numberEggs);  // read variable
            TestClass mother1 = new TestClass();
            mother1.numberEggs = 2;    // set variable
            System.out.println(mother.numberEggs);  // read variable
            System.out.println(mother1.numberEggs);  // read variable
            System.out.println("run" + numberEggs);  // read variable
            System.out.println(Integer.MAX_VALUE);
            setnumg(4);
            setnumg(4);
            //Arrays. sort(numbers);
            for (int values : numbers) {
                if (values % 2 == 0)
                    System.out.print("," + values);
                if (values == 237)
                    break;
            }
            System.out.println("");
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


