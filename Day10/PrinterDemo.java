package Day10;
/* Loosely Coupled Printer Design */

interface Printer {
    void print();
}

class InkjetPrinter implements Printer {
    public void print() {
        System.out.println("Inkjet Printing");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Laser Printing");
    }
}

class Computer {
    Printer printer;

    Computer(Printer printer) {
        this.printer = printer;
    }

    void startPrint() {
        printer.print();
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        Computer c1 = new Computer(new InkjetPrinter());
        c1.startPrint();

        Computer c2 = new Computer(new LaserPrinter());
        c2.startPrint();
    }
}
