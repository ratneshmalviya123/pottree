/**
 * 
 */
package in.pottree.admin.form;

import java.io.Serializable;

/**
 * @author tenz
 * 
 */
public class DisplayLinkList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1435100641639340062L;

	private String link;

	private String linkDisplay;
	
	

	public DisplayLinkList(String link, String linkDisplay) {
		super();
		this.link = link;
		this.linkDisplay = linkDisplay;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the linkDisplay
	 */
	public String getLinkDisplay() {
		return linkDisplay;
	}

	/**
	 * @param linkDisplay
	 *            the linkDisplay to set
	 */
	public void setLinkDisplay(String linkDisplay) {
		this.linkDisplay = linkDisplay;
	}

}
