package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.kossowski.optima.enums.ZrodloInformacjiEnum;



@Entity
@Table( name = "wnioski" )
public class Wniosek {

	//public static Integer RODZAJ_WNIOSKU = 3;
	public static Integer BANK_OPTIMA = Bank.OPTIMA;
	public static Integer RODZ_WN_GOTOWKA = 3;
	public static Integer RODZ_WNIOSKODAWCY = 1;
	
	// pole odpowiada polu bpf-id w AppOptima
	@Id 
	@GeneratedValue( strategy = GenerationType.SEQUENCE,  generator = "inna_seq" )
	@SequenceGenerator( name = "inna_seq", sequenceName = "wnioski_id_seq" )
	private Integer id = null;
	
	@Column( name ="optima_typ" )
	private String optimaTyp;
	
	@Column( name = "optima_rodzaj" )
	private String optimaRodzaj;
	
	@ManyToOne
	@JoinColumn( name = "status_wniosku")
	private StatusWniosku statusWniosku = null;
	
	@Column( name = "timestamp" )
	@Temporal( TemporalType.TIMESTAMP)
	private Date dataWniosku;
	
	
	@ElementCollection( fetch = FetchType.EAGER )
	@CollectionTable( name = "optima_multi_oferty", joinColumns = @JoinColumn( name = "wniosek_id" ) )
	private List<OptimaMultiOferta> multiOferty = new ArrayList<OptimaMultiOferta>();

	@Column( name = "wnioskodawca")
	private Integer wnioskodawcaId;
	
	@Column( name = "bank")
	private Integer bank = BANK_OPTIMA;
	
	@Column( name = "handlowiec") 
	private Integer handlowiec;
	
	@Column( name = "rodzaj_wniosku")
	private Integer rodzajWniosku = RODZ_WN_GOTOWKA;
	
	@Column( name = "optima_data_podpisania")
	@Temporal( TemporalType.DATE )
	private Date dataPodpisania;
	
	@Column( name = "optima_miejsce_podpisania")
	private String miejscePodpisania;
	
	@Column( name = "kwota_kredytu")
	private BigDecimal kwotaKredytu;
	
	@Column( name = "ilosc_rat")
	private Integer iloscRat;
	
	@Column( name = "optima_kto_podpisal")
	private String ktoPodpisal;
	
	@Column( name = "optima_zrodlo_informacji")
	@Enumerated( EnumType.STRING )
	private ZrodloInformacjiEnum zdrodloInformacji;
	
	
	//TODO: sprawdzić
	//przeniosiono do Wnioskodawcy - ale nie wiem czy słusznie
	//@Column( name = "optima_skan_dowodu" )
	//private Boolean skanDodowu;
	
	
	public Integer getId() {
		return id;
	}
	
	public int getStatus() {
		return statusWniosku.getId();
	}

	public StatusWniosku getStatusWniosku() {
		return statusWniosku;
	}

	public void setStatusWniosku(StatusWniosku statusWniosku) {
		this.statusWniosku = statusWniosku;
	}

	public List<OptimaMultiOferta> getMultiOferty() {
		return multiOferty;
	}

	public void setMultiOferty(List<OptimaMultiOferta> multiOferty) {
		this.multiOferty = multiOferty;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	
	
	
	public Date getDataPodpisania() {
		return dataPodpisania;
	}

	public void setDataPodpisania(Date dataPodpisania) {
		this.dataPodpisania = dataPodpisania;
	}

	public String getMiejscePodpisania() {
		return miejscePodpisania;
	}

	public void setMiejscePodpisania(String miejscePodpisania) {
		this.miejscePodpisania = miejscePodpisania;
	}

	public Integer getWnioskodawcaId() {
		return wnioskodawcaId;
	}

	public void setWnioskodawcaId(Integer wnioskodawcaId) {
		this.wnioskodawcaId = wnioskodawcaId;
	}

	
	
	
	public BigDecimal getKwotaKredytu() {
		return kwotaKredytu;
	}

	public void setKwotaKredytu(BigDecimal kwotaKredytu) {
		this.kwotaKredytu = kwotaKredytu;
	}

	public Integer getIloscRat() {
		return iloscRat;
	}

	public void setIloscRat(Integer iloscRat) {
		this.iloscRat = iloscRat;
	}

	
	
	
	public Date getDataWniosku() {
		return dataWniosku;
	}

	public void setDataWniosku(Date dataWniosku) {
		this.dataWniosku = dataWniosku;
	}
	
	
	

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

	public Integer getHandlowiec() {
		return handlowiec;
	}

	public void setHandlowiec(Integer handlowiec) {
		this.handlowiec = handlowiec;
	}

	public Integer getRodzajWniosku() {
		return rodzajWniosku;
	}

	public void setRodzajWniosku(Integer rodzajWniosku) {
		this.rodzajWniosku = rodzajWniosku;
	}
	
	
	

	public String getOptimaTyp() {
		return optimaTyp;
	}

	public void setOptimaTyp(String optimaTyp) {
		this.optimaTyp = optimaTyp;
	}

	public String getOptimaRodzaj() {
		return optimaRodzaj;
	}

	public void setOptimaRodzaj(String optimaRodzaj) {
		this.optimaRodzaj = optimaRodzaj;
	}

	
	

	public String getKtoPodpisal() {
		return ktoPodpisal;
	}

	public void setKtoPodpisal(String ktoPodpisal) {
		this.ktoPodpisal = ktoPodpisal;
	}

	
	
	
	public ZrodloInformacjiEnum getZdrodloInformacji() {
		return zdrodloInformacji;
	}

	public void setZdrodloInformacji(ZrodloInformacjiEnum zdrodloInformacji) {
		this.zdrodloInformacji = zdrodloInformacji;
	}

	
	//------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wniosek other = (Wniosek) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wniosek [id=" + id + ", statusWniosku=" + statusWniosku + ", multiOferty=" + multiOferty
				+ ", wnioskodawcaId=" + wnioskodawcaId + ", kwotaKredytu=" + kwotaKredytu + ", iloscRat=" + iloscRat
				+ "]";
	}

	
	
	
	
	
}
