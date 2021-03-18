package workshop2;

public class Hotel {

    private String name;
    private int weekdayrate;
    private int weekendrate;



    public Hotel(String lakewood, int i, int i1) {
    }

    @Override
    public String toString() {
        return "Hotel [name=" + name + ", weekdayrate=" + weekdayrate + ", weekendrate=" + weekendrate + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getWeekdayrate() {
        return weekdayrate;


        public String getName() {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getWeekdayrate () {
            return weekdayrate;

            @Override
            public String toString () {
                return "Hotel [name=" + name + ", rate=" + rate + "]";
            }

            public void setRate ( int rate){
                this.rate = rate;

            }


            public int getWeekendrate () {
                return weekendrate;
            }



	public Hotel(String name, int weekdayrate, int weekendrate){
                super();
                this.name = name;
                this.weekdayrate = weekdayrate;
                this.weekendrate = weekendrate;
            }
        }
    }
}