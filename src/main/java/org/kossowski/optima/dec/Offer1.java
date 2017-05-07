package org.kossowski.optima.dec;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD)

public class Offer1 {
	
	@XmlElement( name="amount" )
	private BigDecimal amount;
	
	@XmlElement( name = "instalments" )
	private int instalments;
	
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
	private BigDecimal installlmentAmount;
	
	@XmlElement( name = "amountToCLose" )
	private BigDecimal amountToClose;
		
}
