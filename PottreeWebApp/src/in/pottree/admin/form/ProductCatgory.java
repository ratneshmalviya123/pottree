package in.pottree.admin.form;

import java.util.List;

public class ProductCatgory {
	
	private String productCategoryCode;
	private String productCategory;
	private String parentCategory;
	private List<Category> categoryList;
	private boolean categoryEnabled;
	private String description;

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory
	 *            the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * @return the parentCategory
	 */
	public String getParentCategory() {
		return parentCategory;
	}

	/**
	 * @param parentCategory
	 *            the parentCategory to set
	 */
	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
	}

	/**
	 * @return the categoryList
	 */
	public List<Category> getCategoryList() {
		return categoryList;
	}

	/**
	 * @param categoryList
	 *            the categoryList to set
	 */
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	/**
	 * @return the categoryEnabled
	 */
	public boolean isCategoryEnabled() {
		return categoryEnabled;
	}

	/**
	 * @param categoryEnabled
	 *            the categoryEnabled to set
	 */
	public void setCategoryEnabled(boolean categoryEnabled) {
		this.categoryEnabled = categoryEnabled;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the productCategoryCode
	 */
	public String getProductCategoryCode() {
		return productCategoryCode;
	}

	/**
	 * @param productCategoryCode
	 *            the productCategoryCode to set
	 */
	public void setProductCategoryCode(String productCategoryCode) {
		this.productCategoryCode = productCategoryCode;
	}

}