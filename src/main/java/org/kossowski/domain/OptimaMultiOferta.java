package org.kossowski.domain;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import org.kossowski.optima.dec.Offer;

//@Entity
//@Table( name="optima_multi_oferta")
//@SequenceGenerator( name="optimaMultiOfertaSequence", sequenceName = "optima_multi_oferta_seq" )
@Embeddable
public class OptimaMultiOferta {
	
	//@Id @GeneratedValue( strategy=GenerationType.SEQUENCE, generator="optimaMultiOfertaSequence" )
	//private Long id;
	
	private String product;
	private String productType;
	private String offerType;
	private String status;
	private BigDecimal amount;
	private Integer instalments;
	private BigDecimal installmentAmount;
	private Integer reasonId;
	private Boolean selected = false;
	
	
	
	public OptimaMultiOferta() {
		
	}
	
	public OptimaMultiOferta( Offer o ) {
		this.product = o.getProduct();
		this.productType = o.getProductType();
		this.offerType = o.getOfferType();
		this.status = o.getStatus();
		this.amount = o.getAmount();
		this.instalments = o.getInstalments();
		this.installmentAmount = o.getInstallmentAmount();
		
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getInstalments() {
		return instalments;
	}

	public void setInstalments(Integer instalments) {
		this.instalments = instalments;
	}

	public BigDecimal getInstallmentAmount() {
		return installmentAmount;
	}

	public void setInstallmentAmount(BigDecimal installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public Integer getReasonId() {
		return reasonId;
	}

	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	
}
