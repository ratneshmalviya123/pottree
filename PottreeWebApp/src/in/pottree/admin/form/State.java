/**
 * 
 */
package in.pottree.admin.form;

/**
 * @author tenz
 * 
 */
public class State {

	private int id;

	private String state;

	public State(int id, String state) {
		super();
		this.id = id;
		this.state = state;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
