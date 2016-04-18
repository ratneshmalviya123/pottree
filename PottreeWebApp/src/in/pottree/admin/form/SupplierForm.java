/**
 * 
 */
package in.pottree.admin.form;

/**
 * @author tenz
 * 
 */
public class SupplierForm {

	private String supplierId;

	private String name;

	private String tinNumber;

	private String registrationNumber;

	private boolean supplierEnabled;

	private String city;

	private String state;

	/**
	 * @return the supplierId
	 */
	public String getSupplierId() {
		return supplierId;
	}

	/**
	 * @param supplierId
	 *            the supplierId to set
	 */
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the tinNumber
	 */
	public String getTinNumber() {
		return tinNumber;
	}

	/**
	 * @param tinNumber
	 *            the tinNumber to set
	 */
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber
	 *            the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the supplierEnabled
	 */
	public boolean isSupplierEnabled() {
		return supplierEnabled;
	}

	/**
	 * @param supplierEnabled
	 *            the supplierEnabled to set
	 */
	public void setSupplierEnabled(boolean supplierEnabled) {
		this.supplierEnabled = supplierEnabled;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
