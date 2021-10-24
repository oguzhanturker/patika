package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "+112345678");
        Teacher t2 = new Teacher("Tesla", "FZK", "+23456");
        Teacher t3 = new Teacher("Morhan", "GEO", "+0200");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course geo = new Course("Geometri", "203", "GEO");
        geo.addTeacher(t3);

        Student s1 = new Student("Muhittin", "161718", "2", tarih, fizik, geo);
        s1.addBulkExamNote(100, 80, 75);
        s1.addBulkSozluNote(100,90,95);
        s1.isPass();
        s1.printNote();

    }
}
