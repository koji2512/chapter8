public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h1 =new Hero("ミナト");
        //h1.name = "ミナト";
        System.out.println(h1.hp);
        System.out.println(h1.name);
        h1.sword = s;

       /* Hero h2 = new Hero();
        h2.name = "アサカ";
        System.out.println(h2.hp);

        Wizard w = new Wizard();
        w.name = "スガワラ";
       System.out.println(w.hp);*/

        System.out.println("勇者"+h1.name+"を生み出しました！");
        System.out.println("現在の武器は"+h1.sword.name);

        Matango m1= new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';


        /*h.sit(5);
        h.slip();
        h.sit(25);
        h.run();

       h.slip();
        m1.run();
        m2.run();
        h.run();

       m1.attack();
        h1.attack();
        h1.slip();
        h1.slip();
        h1.sit(25);
        m1.run();
        h1.slip();
        h1.sleep();
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        /*m2.run();
        h1.run();*/

             /*   Hero h1;
                h1 = new Hero();
                h1.hp = 100;
                Hero h2 = h1;
                h2.hp = 200;
                System.out.println(h1.hp);*/
    }
}