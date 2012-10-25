

public abstract class CalendarUnit {
        
        protected int currentPos = 0;
        
        public void setCurrentPos(int currentPos) {
                this.currentPos = currentPos;
        }
        
        public abstract boolean increment();
}