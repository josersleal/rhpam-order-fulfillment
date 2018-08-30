package org.acme.order_fulfillment;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "product_order")
public class ProductOrder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PRODUCTORDER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "PRODUCTORDER_ID_SEQ", name = "PRODUCTORDER_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Product Name")
	private java.lang.String productName;

	@org.kie.api.definition.type.Label("Is in Stock")
	private java.lang.Boolean inStock;

	@org.kie.api.definition.type.Label("requestDate")
	private java.util.Date requestDate;

	@org.kie.api.definition.type.Label("Is Late Delivery")
	private java.lang.Boolean lateDelivery;

	@org.kie.api.definition.type.Label("Is Undeliverable")
	private java.lang.Boolean undeliverable;

	@org.kie.api.definition.type.Label(value = "Supplier Delivery Days")
	private java.lang.Integer supplierDeliveryDays;

	public ProductOrder() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getProductName() {
		return this.productName;
	}

	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}

	public java.lang.Boolean getInStock() {
		return this.inStock;
	}

	public void setInStock(java.lang.Boolean inStock) {
		this.inStock = inStock;
	}

	public java.util.Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(java.util.Date requestDate) {
		this.requestDate = requestDate;
	}

	public java.lang.Boolean getLateDelivery() {
		return this.lateDelivery;
	}

	public void setLateDelivery(java.lang.Boolean lateDelivery) {
		this.lateDelivery = lateDelivery;
	}

	public java.lang.Boolean getUndeliverable() {
		return this.undeliverable;
	}

	public void setUndeliverable(java.lang.Boolean undeliverable) {
		this.undeliverable = undeliverable;
	}

	public java.lang.Integer getSupplierDeliveryDays() {
		return this.supplierDeliveryDays;
	}

	public void setSupplierDeliveryDays(java.lang.Integer supplierDeliveryDays) {
		this.supplierDeliveryDays = supplierDeliveryDays;
	}

	public ProductOrder(java.lang.Long id, java.lang.String productName,
			java.lang.Boolean inStock, java.util.Date requestDate,
			java.lang.Boolean lateDelivery, java.lang.Boolean undeliverable,
			java.lang.Integer supplierDeliveryDays) {
		this.id = id;
		this.productName = productName;
		this.inStock = inStock;
		this.requestDate = requestDate;
		this.lateDelivery = lateDelivery;
		this.undeliverable = undeliverable;
		this.supplierDeliveryDays = supplierDeliveryDays;
	}

}