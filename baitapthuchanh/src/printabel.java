public interface printable {
    public void print();
}

class A6 implements printable {

    public void print() {
        System.out.println(" hello");
    }

    public static void main(String[] args) {
        A6 bc = new A6();
        bc.print();
    }

}
