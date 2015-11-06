package Observer;
public class PanelObserverC extends Observer {

	public PanelObserverC(Subject subject){
	      this.subject = subject;
	      this.subject.registerObservers(this);
	   }
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
