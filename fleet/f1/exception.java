package f1;

class MyException extends Exception {
    void MyException() {
        super("Vehicle Not found");
    }
}
class Unavilable extends Exception {
    MyException() {
        super("Vehicle unavilable");
    }
}

class Invalidtime extends Exception {
    MyException() {
        super("Invalid renal period");
    }
}

