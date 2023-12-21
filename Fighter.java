package BoxingMatchAssignment;

class Fighter {
    //nitelikler

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge <= 100 && dodge >= 0) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " -> " + foe.name + " " + this.damage + " kadar vurdu");
        if(foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100; //0'dan 100'e kadar rastgele sayı üretiyoruz burada
        return randomNumber <= this.dodge;
    }
}
