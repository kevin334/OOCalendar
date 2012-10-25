public class Day extends CalendarUnit {
        
        private Month month;
        
        public Day(int day, Month month) {
                setDay(day, month);
        }
        
        public void setDay(int day, Month month) {
                if(day < 1 || day > month.getMonthSize())
                        throw new IllegalArgumentException("invalid input day of " + day);
                
                setCurrentPos(day);
                this.month = month;
        }
        
        public int getDay() {
                return currentPos;
        }
        
        public boolean increment() {
                return ++currentPos <= month.getMonthSize();
        }
        
        public String toString() {
                return "" + getDay();
        }
}