package sg.com.kaplan.pdma.listviewexample;


public class Event {
   String name;
   String location;
   String datetime;

   public Event(String name, String location, String datetime) {
      this.name = name;
      this.location = location;
      this.datetime = datetime;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getDatetime() {
      return datetime;
   }

   public void setDatetime(String datetime) {
      this.datetime = datetime;
   }
}
