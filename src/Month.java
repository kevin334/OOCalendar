public class Month extends CalendarUnit {
        
        private final static int[] sizeIndex = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        private Year year;
        
        public Month(int current, Year year) {
                setMonth(current, year);
        }
        
        public void setMonth(int current, Year year) {
                if(current < 1 || current > 12)
                        throw new IllegalArgumentException("invalid month of " + current);
                
                setCurrentPos(current);
                this.year = year;
        }
        
        public int getMonth() {
                return currentPos;
        }
        
        public int getMonthSize() {
                if(currentPos == 2)
                        return year.isLeap() ? 29 : 28;
                else
                        return sizeIndex[currentPos - 1];
        }
        
        public boolean increment() {
                return ++currentPos <= 12;
        }
        
        public String toString() {
                return "" + getMonth();
        }
}