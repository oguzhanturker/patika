package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }


    public String toString(){
        return "Adı : "+this.name+"\nMaaşı : "+this.salary+"\nÇalışma Saati : "+this.workHours+"\nBaşlangıç Yılı :"
                +this.hireYear+"\nVergi : "+this.tax()+"\nBonus : "+this.bonus()+"\nMaaş Artışı : "+this.raiseSalary()
                +"\nVergi ve Bonuslar ile Birlikte Maaş : "+(this.salary+this.bonus()-this.tax())+
                "\nToplam Maaş : "+(this.salary+this.raiseSalary());
    }
}
