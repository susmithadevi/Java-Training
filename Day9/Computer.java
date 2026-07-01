package Day9;
/*Composition (Computer and CPU) */

class CPU {

    void process() {
        System.out.println("CPU Processing");
    }
}

class Computer {

    CPU c = new CPU();

    void work() {
        System.out.println("Computer Working");
        c.process();
    }

    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.work();
    }
}
