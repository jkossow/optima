package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.kossowski.optima.enums.OkresNaliczeniaKwotyBrutto;
import org.kossowski.optima.enums.TakNie;

@Entity
@Table( name = "path1")
public class Path1 extends Path {

		@Id 
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column( name = "id_wniosku" )
		private Integer idWniosku;
		
		@Column( name = "id_wnioskodawcy" )
		private Integer idWnioskodawcy;
		
		
		
		//pola do usunięcia
		@Column( name = "dochod", columnDefinition="text" )
		private BigDecimal dochod;

		
		@Column( name = "zatrudnienie_od")
		@Temporal( TemporalType.DATE)
		private Date okredOd;
		
		@Column( name = "zatrudnienie_do" )
		@Temporal( TemporalType.DATE)
		private Date okresDo;
		
		// koniec pól dp isunięcia

		//pola optimy
		
		//pasek
		@Column( name = "optima_czy_zeskanowany" )
		private Boolean czyZeskanowany;
		
		@Column( name = "optima_za_miesiac" )
		@Temporal( TemporalType.DATE)
		private Date zaMiesiac;
		
		@Column( name = "optima_dodatki_obciazenia" )
		private BigDecimal dodatkiObciazenia;
		
		@Column( name = "optima_podstawa_wymiaru_skladki" )
		private BigDecimal podstawaWymiaruSkladki;
		
		@Column( name = "optima_pozyczki" )
		private BigDecimal pozyczki;
		
		@Column( name = "optima_kwota_netto_po_potraceniach" )
		private BigDecimal kwotaNettoPoPotraceniach;
		
		
		//zaswiadczenie z pracy
		
		@Column( name = "optima_kwota_brutto" )
		private BigDecimal kwotaBrutto;
		
		@Column( name = "optima_kwota_netto" )
		private BigDecimal kwotaNetto;
		
		@Column( name = "optima_znak" )
		private String znak;
		
		@Column( name = "optima_data_wystawienia" )
		@Temporal( TemporalType.DATE)
		private Date dataWystawienia;
		
		@Column( name = "optima_umowa_o_prace" )
		@Embedded
		private UmowaOPraceFactorDB umowaOPrace = new UmowaOPraceFactorDB();
		
		@Column( name = "optima_okres_naliczenia_kwoty_brutto" )
		@Enumerated( EnumType.STRING )
		private OkresNaliczeniaKwotyBrutto okresNaliczeniaKwotyBrutto;
		
		@Column( name = "optima_obciazenie_komornicze" )
		@Enumerated( EnumType.STRING )
		private TakNie obciazenieKomornicze;
		
		@Column( name = "optima_alimenty" )
		@Enumerated( EnumType.STRING )
		private TakNie alimenty;
		
		@Column( name = "optima_wystawil" )
		private String wystawil;
		
		@Column( name = "optima_nazwa_pracodawcy" )
		private String nazwaPracodawcy;
		
		@Column( name = "optima_adres" )
		@Embedded
		private AdresFactorDB adres = new AdresFactorDB();

		//TODO: dodać boolean że komórka
		@Column( name = "optima_telefon" )
		private String telefon;
		
		@Column( name = "optima_nip" )
		private String nip;
		
		@Column( name = "optima_regon" )
		private String regon;
		
		@Column( name = "optima_zgoda_na_kontakt" )
		private Boolean zgodaNaKontakt;
		
		// wyciąg bankowy
		
		@Column( name = "optima_data" )
		@Temporal( TemporalType.DATE)
		private Date data;
		
		@Column( name = "optima_data_od" )
		@Temporal( TemporalType.DATE)
		private Date dataOd;
		
		@Column( name = "optima_data_do" )
		@Temporal( TemporalType.DATE)
		private Date dataDo;
		
		@Column( name = "optima_przelew" )
		@Embedded
		private PrzelewFactorDB przelew = new PrzelewFactorDB();
		
		
		//oświadczenie
		
		@Column( name = "optima_okres_wypowiedzenia" )
		private Boolean okresWypowiedzenia;
		
		@Column( name = "optima_urlop_wychowawczy" )
		private Boolean urlopWychowawczy;
		
		@Column( name = "optima_urlop_wychowawczy_data" )
		@Temporal( TemporalType.DATE)
		private Date urlopWychowawczyData;
		
		
		
		
		
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
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

		public BigDecimal getDochod() {
			return dochod;
		}

		public void setDochod(BigDecimal dochod) {
			this.dochod = dochod;
		}

		public Date getOkredOd() {
			return okredOd;
		}

		public void setOkredOd(Date okredOd) {
			this.okredOd = okredOd;
		}

		public Date getOkresDo() {
			return okresDo;
		}

		public void setOkresDo(Date okresDo) {
			this.okresDo = okresDo;
		}

		public Boolean getCzyZeskanowany() {
			return czyZeskanowany;
		}

		public void setCzyZeskanowany(Boolean czyZeskanowany) {
			this.czyZeskanowany = czyZeskanowany;
		}

		public Date getZaMiesiac() {
			return zaMiesiac;
		}

		public void setZaMiesiac(Date zaMiesiac) {
			this.zaMiesiac = zaMiesiac;
		}

		public BigDecimal getDodatkiObciazenia() {
			return dodatkiObciazenia;
		}

		public void setDodatkiObciazenia(BigDecimal dodatkiObciazenia) {
			this.dodatkiObciazenia = dodatkiObciazenia;
		}

		public BigDecimal getPodstawaWymiaruSkladki() {
			return podstawaWymiaruSkladki;
		}

		public void setPodstawaWymiaruSkladki(BigDecimal podstawaWymiaruSkladki) {
			this.podstawaWymiaruSkladki = podstawaWymiaruSkladki;
		}

		public BigDecimal getPozyczki() {
			return pozyczki;
		}

		public void setPozyczki(BigDecimal pozyczki) {
			this.pozyczki = pozyczki;
		}

		public BigDecimal getKwotaNettoPoPotraceniach() {
			return kwotaNettoPoPotraceniach;
		}

		public void setKwotaNettoPoPotraceniach(BigDecimal kwotaNettoPoPotraceniach) {
			this.kwotaNettoPoPotraceniach = kwotaNettoPoPotraceniach;
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

		public String getZnak() {
			return znak;
		}

		public void setZnak(String znak) {
			this.znak = znak;
		}

		public Date getDataWystawienia() {
			return dataWystawienia;
		}

		public void setDataWystawienia(Date dataWystawienia) {
			this.dataWystawienia = dataWystawienia;
		}

		public UmowaOPraceFactorDB getUmowaOPrace() {
			return umowaOPrace;
		}

		public void setUmowaOPrace(UmowaOPraceFactorDB umowaOPrace) {
			this.umowaOPrace = umowaOPrace;
		}

		public OkresNaliczeniaKwotyBrutto getOkresNaliczeniaKwotyBrutto() {
			return okresNaliczeniaKwotyBrutto;
		}

		public void setOkresNaliczeniaKwotyBrutto(OkresNaliczeniaKwotyBrutto okresNaliczeniaKwotyBrutto) {
			this.okresNaliczeniaKwotyBrutto = okresNaliczeniaKwotyBrutto;
		}

		public TakNie getObciazenieKomornicze() {
			return obciazenieKomornicze;
		}

		public void setObciazenieKomornicze(TakNie obciazenieKomornicze) {
			this.obciazenieKomornicze = obciazenieKomornicze;
		}

		public TakNie getAlimenty() {
			return alimenty;
		}

		public void setAlimenty(TakNie alimenty) {
			this.alimenty = alimenty;
		}

		public String getWystawil() {
			return wystawil;
		}

		public void setWystawil(String wystawil) {
			this.wystawil = wystawil;
		}

		public String getNazwaPracodawcy() {
			return nazwaPracodawcy;
		}

		public void setNazwaPracodawcy(String nazwaPracodawcy) {
			this.nazwaPracodawcy = nazwaPracodawcy;
		}

		public AdresFactorDB getAdres() {
			return adres;
		}

		public void setAdres(AdresFactorDB adres) {
			this.adres = adres;
		}

		public String getTelefon() {
			return telefon;
		}

		public void setTelefon(String telefon) {
			this.telefon = telefon;
		}

		public String getNip() {
			return nip;
		}

		public void setNip(String nip) {
			this.nip = nip;
		}

		public String getRegon() {
			return regon;
		}

		public void setRegon(String regon) {
			this.regon = regon;
		}

		public Boolean getZgodaNaKontakt() {
			return zgodaNaKontakt;
		}

		public void setZgodaNaKontakt(Boolean zgodaNaKontakt) {
			this.zgodaNaKontakt = zgodaNaKontakt;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Date getDataOd() {
			return dataOd;
		}

		public void setDataOd(Date dataOd) {
			this.dataOd = dataOd;
		}

		
		
		
		public Date getDataDo() {
			return dataDo;
		}

		public void setDataDo(Date dataDo) {
			this.dataDo = dataDo;
		}

		public PrzelewFactorDB getPrzelew() {
			return przelew;
		}

		public void setPrzelew(PrzelewFactorDB przelew) {
			this.przelew = przelew;
		}

		public Boolean getOkresWypowiedzenia() {
			return okresWypowiedzenia;
		}

		public void setOkresWypowiedzenia(Boolean okresWypowiedzenia) {
			this.okresWypowiedzenia = okresWypowiedzenia;
		}

		public Boolean getUrlopWychowawczy() {
			return urlopWychowawczy;
		}

		public void setUrlopWychowawczy(Boolean urlopWychowawczy) {
			this.urlopWychowawczy = urlopWychowawczy;
		}

		public Date getUrlopWychowawczyData() {
			return urlopWychowawczyData;
		}

		public void setUrlopWychowawczyData(Date urlopWychowawczyData) {
			this.urlopWychowawczyData = urlopWychowawczyData;
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
			Path1 other = (Path1) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Path1 [id=" + id + ", idWniosku=" + idWniosku + ", idWnioskodawcy=" + idWnioskodawcy + ", dochod="
					+ dochod + ", okredOd=" + okredOd + ", okresDo=" + okresDo + ", czyZeskanowany=" + czyZeskanowany
					+ ", zaMiesiac=" + zaMiesiac + ", dodatkiObciazenia=" + dodatkiObciazenia
					+ ", podstawaWymiaruSkladki=" + podstawaWymiaruSkladki + ", pozyczki=" + pozyczki
					+ ", kwotaNettoPoPotraceniach=" + kwotaNettoPoPotraceniach + ", kwotaBrutto=" + kwotaBrutto
					+ ", kwotaNetto=" + kwotaNetto + ", znak=" + znak + ", dataWystawienia=" + dataWystawienia
					+ ", umowaOPrace=" + umowaOPrace + ", okresNaliczeniaKwotyBrutto=" + okresNaliczeniaKwotyBrutto
					+ ", obciazenieKomornicze=" + obciazenieKomornicze + ", alimenty=" + alimenty + ", wystawil="
					+ wystawil + ", nazwaPracodawcy=" + nazwaPracodawcy + ", adres=" + adres + ", telefon=" + telefon
					+ ", nip=" + nip + ", regon=" + regon + ", zgodaNaKontakt=" + zgodaNaKontakt + ", data=" + data
					+ ", dataOd=" + dataOd + ", dataDo=" + dataDo + ", przelew=" + przelew + ", okresWypowiedzenia="
					+ okresWypowiedzenia + ", urlopWychowawczy=" + urlopWychowawczy + ", urlopWychowawczyData="
					+ urlopWychowawczyData + "]";
		}
		
		
		

}
