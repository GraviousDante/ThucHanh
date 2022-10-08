package Thuc_hanh;

// Bai 2
public class Flight {
    public int number;
    public String destination;

    public Flight() {
        this.number = 0;
        this.destination = null;
    }

    public Flight(int number, String destination) {
        if (number > 0) this.number = number;
        else this.number = 0;
        this.destination = destination;
    }

    public void display() {
        System.out.println(this.number+", "+this.destination);
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber(){
        return number;
    }
}
