package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private List<Observer> observerCollection = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void registerObservers(Observer observer){
      observerCollection.add(observer);		
   }
   
   public void unregisterObservers(Observer observer) {
	   observerCollection.remove(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observerCollection) {
         observer.update();
      }
   } 	
}