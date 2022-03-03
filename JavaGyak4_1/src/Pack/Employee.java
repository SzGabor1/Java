package Pack;

public class Employee {
    private String name;
    private int payment;

    public void setName(String Name) {
        this.name = Name;
    }

    public void setPayment(int Payment) {
        this.payment = Payment;
    }

    //- van egy metódusa, amely egy paraméterként kapott értékkel megnöveli a fizetést;
    public void increasePayment(int amount) {
        this.payment += amount;
    }

    // - adjon vissza igazat, ha a fizetés a paraméterként megadott határok közé esik, és hamisat ha nem;
    public boolean isPaymentInRange(int min, int max) {
        if (payment < max && payment > min) {
            return true;
        } else {
            return false;
        }
    }

    //- adja vissza a fizetendő adó értéket, ha az adókulcs 16% ;

    public double tax() {
        int key = 16;
        double amount;

        amount = payment * (key / 100.0);

        return amount;
    }

    //- adjon vissza igazat, ha a fizetés nagyobb, mint egy paraméterként megadott másik alkalmazotté
    public boolean greaterThanOtherEmployee(Employee emp) {
        if (payment < emp.payment) {
            return true;
        } else {
            return false;
        }
    }

    // - van egy metódusa, amely egy String-be összefűzi a nevet és a fizetést és ezt adja vissza.
    @Override
    public String toString() {
        return "Employee: [" + name + ", Payment: " + payment + "]";
    }

    public String getName() {
        return name;
    }

    public int getPayment() {
        return payment;
    }


}
