public class NextDate {

        public static void main(String[] args) {
        	    int d=10, m=3, y=2013;
                Date date = new Date(m, d, y);
                date.increment();
                System.out.println(date);
        }
}