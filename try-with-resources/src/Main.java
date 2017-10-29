public class Main {
    public static void main(String[] args) {
        Connection c = new Connection();
//        It's not possible to redeclare the variable - it has to be effectively final
//        c = new Connection();
        try (c) {
            System.out.println("Inside!");
        }

    }

    static class Connection implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("closing!");
        }
    }
}
