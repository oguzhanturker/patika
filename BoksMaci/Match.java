package BoksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            if (math.random*100>=50){  //Kodluyoruz koduna ek kısımdır. Maça kimin önce başlayacağını belirtir.
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){ // İlk başlayan tek yumrukta knock-out yapmış mı diye isWin'i buraya da ekledim.
                }
            }
            while (this.f1.health > 0 && this.f2.health >0){
                System.out.println("=======YENİ ROUND=======");
                this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name+ " Sağlık : "+ this.f1.health);
                System.out.println(this.f2.name+ " Sağlık : "+ this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sıkletleri uygun değil");
        }
    }

    boolean isCheck() {
        return (this.minWeight <= this.f1.weight && this.f1.weight <= this.maxWeight) && (this.minWeight <= this.f2.weight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin(){
        if(this.f1.health==0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name+ " kazandı!");
            return true;
        }
        return false;
    }
}
