public class Animals {
    private int age;

    public int getAge() {
        System.out.println("getage:"+age);
        return age;

    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("setage-Animal:" +age);
    }

}

class Lion extends Animals {
    private  void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }
        public static void main (String[] args)
        {
            Animals a=new Animals();
            Lion l =new Lion();
            a.setAge(4);
            a.getAge();
            l.setAge(8);
            l.roar();
            System.out.println("getAge:" +a.getAge());
            System.out.println("getAge:" +l.getAge());
        }
    }


