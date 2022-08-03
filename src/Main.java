public class Main {
    public static void main(String[] args) {

MyList list = new MyList<>();
list.add (19);
list.add(17);
list.add(13);
list.add(3);
list.add(-3);
list.add(-13);
        for (int i = 0 ; i < list.arrayList.size() ; i++) {
            System.out.println(list.arrayList.get(i));
        }
        System.out.println("Max number: " + list.maximum());
        System.out.println("Max number: " + list.minimum());

    }
}

