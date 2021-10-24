package OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String id;
    String sinifi;
    double avarage;
    boolean isPass;

    Student(String name, String id, String sinifi, Course c1, Course c2, Course c3) {
        this.name = name;
        this.id = id;
        this.sinifi = sinifi;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkSozluNote(int sozlu1, int sozlu2, int sozlu3) {
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozlu = sozlu1;
        }

        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.sozlu = sozlu2;
        }

        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.c3.sozlu = sozlu3;
        }
    }
    void calculateTotalNote(){
        this.c1.totalNote = this.c1.note*0.8+ this.c1.sozlu*0.2;
        this.c2.totalNote = this.c2.note*0.7+ this.c1.sozlu*0.3;
        this.c3.totalNote = this.c3.note*0.7+ this.c1.sozlu*0.3;
    }

    void isPass() {
        calculateTotalNote();
        this.avarage = (this.c1.totalNote+ this.c2.totalNote+ this.c3.totalNote) / 3.0;
        System.out.println("Ortalamanız: " + this.avarage);
        if (this.avarage>60){
            System.out.println("Hadi yine yırttınız");
        }
        else{
            System.out.println("Sanayi yolu gözüktü");
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Ortalama Notu\t\t:" + this.c1.totalNote);
        System.out.println(this.c2.name + " Ortalama Notu\t\t:" + this.c2.totalNote);
        System.out.println(this.c3.name + " Ortalama Notu\t:" + this.c3.totalNote);
    }

}
