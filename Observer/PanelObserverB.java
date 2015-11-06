package Observer;

public class PanelObserverB extends Observer {

	public PanelObserverB(Subject subject){
	      this.subject = subject;
	      this.subject.registerObservers(this);
	   }
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
