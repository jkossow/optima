package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.kossowski.optima.enums.DecyzjaDotyczy;

@Entity
@Table( name = "path2")
public class Path2 extends Path implements Cloneable {

		@Id 
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column( name = "id_wniosku" )
		private Integer idWniosku;
		
		@Column( name = "id_wnioskodawcy" )
		private Integer idWnioskodawcy;
		
		
		//pola do usunięcia
		@Column( name = "dochod", columnDefinition="text")
		private BigDecimal dochod;

		@Column( name = "decyzja_start")
		@Temporal( TemporalType.DATE)
		private Date okresOd;
		
		@Column( name = "decyzja_end" )
		@Temporal( TemporalType.DATE )
		private Date okresDo;
		

		
		
		// dla rmua
		
		@Column( name = "optima_czy_zeskanowany" )
		private Boolean czyZeskanowany;
		
		@Column( name = "optima_podstawa_wymiaru_skladki")
		private BigDecimal podstawaWymiaruSkladki;
		
		@Column( name= "optima_za_miesiac")
		@Temporal( TemporalType.DATE )
		private Date zaMiesiac;
		
		// zaswiadczenie Zus
		
		@Column( name= "optima_znak" )
		private String znak;
		
		@Column( name = "optima_kwota_brutto")
		private BigDecimal kwotaBrutto;
		
		@Column( name = "optima_kwotaNetto")
		private BigDecimal kwotaNetto;
		
		@Column( name = "optima_przysluguje_do")
		@Temporal( TemporalType.DATE )
		private Date przyslugujeDo;
		
		@Column( name = "optima_renta_rodzinna")
		private Boolean rentaRodzinna;
		
		@Column( name = "optima_renta_rodzinna_na_osob" )
		private Integer rentaRodzinnaNaOsob;
		
		@Column( name = "optima_decyzja_dotyczy")
		@Enumerated( EnumType.STRING )
		private DecyzjaDotyczy decyzjaDotyczy;
		
		// data wystawienia zaswiadczenia
		@Column( name = "optima_data")
		@Temporal( TemporalType.DATE )
		private Date data;
		
		//odcinek
		
		@Column( name = "optima_nazwa_instytucji" )
		private String nazwaInstytucji;
		
		
		//decyzja
		
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public BigDecimal getDochod() {
			return dochod;
		}

		public void setDochod(BigDecimal dochod) {
			this.dochod = dochod;
		}
		
		public boolean idBezterminowo() {
			return okresDo == null;
		}

		public Date getOkresOd() {
			return okresOd;
		}

		public void setOkresOd(Date okresOd) {
			this.okresOd = okresOd;
		}

		public Date getOkresDo() {
			return okresDo;
		}

		public void setOkresDo(Date okresDo) {
			this.okresDo = okresDo;
		}

		public Integer getIdWniosku() {
			return idWniosku;
		}

		public void setIdWniosku(Integer idWniosku) {
			this.idWniosku = idWniosku;
		}

		public Integer getIdWnioskodawcy() {
			return idWnioskodawcy;
		}

		public void setIdWnioskodawcy(Integer idWnioskodawcy) {
			this.idWnioskodawcy = idWnioskodawcy;
		}

		public Boolean getCzyZeskanowany() {
			return czyZeskanowany;
		}

		public void setCzyZeskanowany(Boolean czyZeskanowany) {
			this.czyZeskanowany = czyZeskanowany;
		}

		public BigDecimal getPodstawaWymiaruSkladki() {
			return podstawaWymiaruSkladki;
		}

		public void setPodstawaWymiaruSkladki(BigDecimal podstawaWymiaruSkladki) {
			this.podstawaWymiaruSkladki = podstawaWymiaruSkladki;
		}

		public Date getZaMiesiac() {
			return zaMiesiac;
		}

		public void setZaMiesiac(Date zaMiesiac) {
			this.zaMiesiac = zaMiesiac;
		}

		public String getZnak() {
			return znak;
		}

		public void setZnak(String znak) {
			this.znak = znak;
		}

		public BigDecimal getKwotaBrutto() {
			return kwotaBrutto;
		}

		public void setKwotaBrutto(BigDecimal kwotaBrutto) {
			this.kwotaBrutto = kwotaBrutto;
		}

		public BigDecimal getKwotaNetto() {
			return kwotaNetto;
		}

		public void setKwotaNetto(BigDecimal kwotaNetto) {
			this.kwotaNetto = kwotaNetto;
		}

		public Date getPrzyslugujeDo() {
			return przyslugujeDo;
		}

		public void setPrzyslugujeDo(Date przyslugujeDo) {
			this.przyslugujeDo = przyslugujeDo;
		}

		public Boolean getRentaRodzinna() {
			return rentaRodzinna;
		}

		public void setRentaRodzinna(Boolean rentaRodzinna) {
			this.rentaRodzinna = rentaRodzinna;
		}

		public Integer getRentaRodzinnaNaOsob() {
			return rentaRodzinnaNaOsob;
		}

		public void setRentaRodzinnaNaOsob(Integer rentaRodzinnaNaOsob) {
			this.rentaRodzinnaNaOsob = rentaRodzinnaNaOsob;
		}

		public DecyzjaDotyczy getDecyzjaDotyczy() {
			return decyzjaDotyczy;
		}

		public void setDecyzjaDotyczy(DecyzjaDotyczy decyzjaDotyczy) {
			this.decyzjaDotyczy = decyzjaDotyczy;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public String getNazwaInstytucji() {
			return nazwaInstytucji;
		}

		public void setNazwaInstytucji(String nazwaInstytucji) {
			this.nazwaInstytucji = nazwaInstytucji;
		}

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
			Path2 other = (Path2) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Path2 [id=" + id + ", idWniosku=" + idWniosku + ", idWnioskodawcy=" + idWnioskodawcy + ", dochod="
					+ dochod + ", okresOd=" + okresOd + ", okresDo=" + okresDo + ", czyZeskanowany=" + czyZeskanowany
					+ ", podstawaWymiaruSkladki=" + podstawaWymiaruSkladki + ", zaMiesiac=" + zaMiesiac + ", znak="
					+ znak + ", kwotaBrutto=" + kwotaBrutto + ", kwotaNetto=" + kwotaNetto + ", przyslugujeDo="
					+ przyslugujeDo + ", rentaRodzinna=" + rentaRodzinna + ", rentaRodzinnaNaOsob="
					+ rentaRodzinnaNaOsob + ", decyzjaDotyczy=" + decyzjaDotyczy + ", data=" + data
					+ ", nazwaInstytucji=" + nazwaInstytucji + "]";
		}
		
		
		
		
}
