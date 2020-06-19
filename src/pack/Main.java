package pack;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start1 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            arrayList.add(0, i);
        }
        long stop1 = System.nanoTime();
        System.out.println("Время выполнения операций вставки в начало" + "ArrayList =" + (stop1 - start1)/1e9 + "s");

        long start2 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.add(0, i);
        }

        long stop2 = System.nanoTime();
        System.out.println("Время выполнения операций вставки в начало" + "LinkedList =" + (stop2 - start2)/1e9 + "s");

        long start3 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            arrayList.get(i);
        }

        long stop3 = System.nanoTime();
        System.out.println("Время выполнения операций чтения каждого элемента" + "ArrayList =" + (stop3 - start3)/1e9 + "s");

        long start4 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.get(i);
        }

        long stop4 = System.nanoTime();
        System.out.println("Время выполнения операций чтения каждого эл-та" + "LinkedList =" + (stop4 - start4)/1e9 + "s");

        long start8 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            arrayList.set(i, i*2);
        }

        long stop8 = System.nanoTime();
        System.out.println("Время выполнения операций записи нового значения в каждый из 100000 эл-ов списка" + "ArrayList =" + (stop8 - start8)/1e9 + "s");

        long start9 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.set(i, i*2);
        }

        long stop9 = System.nanoTime();
        System.out.println("Время выполнения операций записи нового значения в каждый из 100000 эл-ов списка" + "LinkedList =" + (stop9 - start9)/1e9 + "s");

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        long start6 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            arrayList.remove(0);
        }

        long stop6 = System.nanoTime();
        System.out.println("Время выполнения операций удаления первого эл-та из списка" + "ArrayList =" + (stop6 - start6)/1e9 + "s");


        long start7 = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.remove(0);
        }

        long stop7 = System.nanoTime();
        System.out.println("Время выполнения операций удаления первого элемента из списка" + "LinkedList =" + (stop7 - start7)/1e9 + "s");

            ArrayList<Integer> arrayList1 = new ArrayList<>();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();

            for (int i = 0; i < 10; i++)
            {
                arrayList1.add(0,i);
                arrayList2.add(0,i);
                arrayList3.add(0,i+1);
        }
        System.out.println("Списки 'List1' и 'List2' равны:" + arrayList1.equals(arrayList2));
        System.out.println("Списки 'List1' и 'List3' равны:" + arrayList1.equals(arrayList3));



        ArrayList<User> userList = new ArrayList<User>();

        User user1 = new User("Dima", "nick1", 18);
        User user2 = new User("Pasha", "nick2", 24);
        User user3 = new User("Zhora", "nick3", 13);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println(userList);
        System.out.println("Сравнение одинаковых пользователей: " +
                new User("Dima", "nick1", 18).equals(
                        new User("Dima", "nick1", 18)));
        System.out.println("Сравнение первого и второго пользователя: " +
                user1.equals(
                        user2));

        System.out.println(userList.contains(new User("Pasha", "nick2", 24)));
        userList.remove(new User("Pasha", "nick2", 24));

        System.out.println(userList);

        ArrayList<User> userList1 = new ArrayList<User>();
        ArrayList<User> userList2 = new ArrayList<User>();
        ArrayList<User> userList3 = new ArrayList<User>();

        userList1.add(new User("Dima", "nick1", 18));
        userList2.add(new User("Dima", "nick1", 18));
        userList3.add(new User("Zhora", "nick3", 13));

        System.out.println("Сравнение первого и второго пользователя"+ userList1.equals(userList2));
        System.out.println("Сравнение первого и третьего пользователя"+ userList1.equals(userList3));


        HashSet<String> hash = new HashSet<>();
        hash.add("Коноверская");
        hash.add("Евсюкова");
        hash.add("Королович");
        hash.add("Ильге");
        hash.add("Гаевой");
        hash.add("Баришенский");
        hash.add("Мисирханов");
        hash.add("Огиенко");
        hash.add("Трегубов");
        hash.add("Топчий");
        hash.add("Овчаренко");
        hash.add("Калина");
        hash.add("Рогинский");
        hash.add("Вдовицкая");
        hash.add("Часовская");
        System.out.println("фамилии");
        hash.forEach(surname -> System.out.println(surname));
        System.out.println("Фамили, которые начинаются на согласные: ");
        for(String str: hash){
            boolean test = str.matches("^(?i:[АУОИЭЯЮЁЕ]).*");
            if(test)
            {
                ;
            }
            else
                {
                System.out.println(str);
            }
        }

        TreeSet<String> tree = new TreeSet<>();
        tree.add("Коноверская");
        tree.add("Евсюкова");
        tree.add("Королович");
        tree.add("Ильге");
        tree.add("Гаевой");
        tree.add("Баришенский");
        tree.add("Мисирханов");
        tree.add("Огиенко");
        tree.add("Трегубов");
        tree.add("Топчий");
        tree.add("Овчаренко");
        tree.add("Калина");
        tree.add("Рогинский");
        tree.add("Вдовицкая");
        tree.add("Часовская");

        System.out.println("Вывод первых 5 фамилий: ");


        Iterator<String> iterator = tree.iterator();
        int i=0;
        while(iterator.hasNext())
        {
            while (i<5)
            {
                String name = iterator.next();
                System.out.println(name);
                i++;
            }
            break;
        }
    }
}

