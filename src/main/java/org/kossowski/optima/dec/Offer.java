package org.kossowski.optima.dec;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="offer")
@XmlAccessorType( XmlAccessType.FIELD )
public class Offer {

	@XmlElement( name="product" )
	private String product;
	
	@XmlElement( name="productType" )
	private String productType;
	
	@XmlElement( name="offerType" )
	private String offerType;
	
	@XmlElement( name="status" )
	private String status;
	
	@XmlElement( name = "amount")
	private BigDecimal amount;
	
	@XmlElement( name= "instalments")
	private int instalments;
	
	@XmlElement( name="installmentAmount" )
	private BigDecimal installmentAmount;
	
	@XmlElement( name = "reason" )
	private Reason reason;
	 
	
	// nowe pola
	
	@XmlElement( name = "type" )
	private int type;
	
	@XmlElement( name = "docsFile" )
	private String docsFile;
	
	@XmlElement( name="LoanId" )
	private String loanId;
	
	@XmlElement( name = "smsCode")
	private String smsCode;
	
	@XmlElement( name="PrimaryLoanID" )
	private String primaryLoadId;
	
	@XmlElement( name="BankAccountNumber" )
	private String bankAccountNumber;
	
	@XmlElement( name="InstallmentAmount" )
	private BigDecimal installmentAmount1;
	
	
	
	@XmlElement( name = "amountToCLose" )
	private BigDecimal amountToClose;
	
	
	public Offer() {
		super();
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


	public int getInstalments() {
		return instalments;
	}


	public void setInstalments(int instalments) {
		this.instalments = instalments;
	}


	public BigDecimal getInstallmentAmount() {
		return installmentAmount;
	}


	public void setInstallmentAmount(BigDecimal installmentAmount) {
		this.installmentAmount = installmentAmount;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getDocsFile() {
		return docsFile;
	}


	public void setDocsFile(String docsFile) {
		this.docsFile = docsFile;
	}


	public String getLoanId() {
		return loanId;
	}


	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}


	public String getSmsCode() {
		return smsCode;
	}


	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}


	public String getPrimaryLoadId() {
		return primaryLoadId;
	}


	public void setPrimaryLoadId(String primaryLoadId) {
		this.primaryLoadId = primaryLoadId;
	}


	public String getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	public BigDecimal getInstallmentAmount1() {
		return installmentAmount1;
	}


	public void setInstallmentAmount1(BigDecimal installmentAmount1) {
		this.installmentAmount1 = installmentAmount1;
	}


	public BigDecimal getAmountToClose() {
		return amountToClose;
	}


	public void setAmountToClose(BigDecimal amountToClose) {
		this.amountToClose = amountToClose;
	}


	@Override
	public String toString() {
		return "Offer [product=" + product + ", productType=" + productType + ", offerType=" + offerType + ", status="
				+ status + ", amount=" + amount + ", instalments=" + instalments + ", installmentAmount="
				+ installmentAmount + ", reason=" + reason + ", type=" + type + ", docsFile=" + docsFile + ", loanId="
				+ loanId + ", smsCode=" + smsCode + ", primaryLoadId=" + primaryLoadId + ", bankAccountNumber="
				+ bankAccountNumber + ", installmentAmount1=" + installmentAmount1 + ", amountToClose=" + amountToClose
				+ "]";
	}


	
	
	
	
}
