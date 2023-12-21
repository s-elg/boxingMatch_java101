package BoxingMatchAssignment;

class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("########yeni round###############");
               for (int i = 1; i <= 3; i++) {
                   if (isFirstAttack()) {
                       this.f1.health = this.f2.hit(f1);
                       if (isWin()) {
                           break;
                       }
                   } else {
                       this.f2.health = this.f1.hit(f2);
                       if (isWin()) {
                           break;
                       }
                   }
                   System.out.println(this.f1.name + " sağlık: " + this.f1.health);
                   System.out.println(this.f2.name + " sağlık: " + this.f2.health);
               }
            }

        } else {
            System.out.println("sporcuların sikletleri uyuşmuyor!!");
        }

    }

    boolean isFirstAttack() {
        double randomNum = Math.random() * 100;
        return randomNum <= 50;
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandı!!!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandı!!!!");
            return true;
        }
        return false;
    }
}
