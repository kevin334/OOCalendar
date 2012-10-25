public class NextDate {

        public static void main(String[] args) {
        	    int d=28, m=2, y=2010;
                Date date = new Date(m, d, y);
                date.increment();
                System.out.println(date);
        }
}