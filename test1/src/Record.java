public class Record {
    record Point(double x, double y) {
        @Override
        public double x() {
            return x;
        }

        @Override
        public double y() {
            return y;
        }

        public static Point ORIGIN = new Point(0, 0);
        public static double distance(Point p, Point q) {
            return Math.hypot(p.x() - q.x(), p.y() - q.y());
        }
    }

    public static void main(String[] args) {
        var p = new Point(3,4);
        System.out.println(p.x() + " " + p.y());
    }
}
