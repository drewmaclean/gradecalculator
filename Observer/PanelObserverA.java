package Observer;

public class PanelObserverA extends Observer {

	public PanelObserverA(Subject subject){
	      this.subject = subject;
	      this.subject.registerObservers(this);
	   }
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
