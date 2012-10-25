
public class Date {
        
        private Day day;
        private Month month;
        private Year year;
        
        public Date(int month, int day, int year) {
                this.year = new Year(year);
                this.month = new Month(month, this.year);
                this.day = new Day(day, this.month);
        }
        
        public void increment() {
                if(!day.increment()) {
                        if(!month.increment()) {
                                year.increment();
                                month.setMonth(1, year);
                                day.setDay(1, month);
                        } else
                                day.setDay(1, month);
                }
        }
        
        public String toString() {
                return month + "/" + day + "/" + year;
        }
}