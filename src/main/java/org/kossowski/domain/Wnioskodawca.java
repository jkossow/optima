package org.kossowski.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.kossowski.optima.enums.Branza;
import org.kossowski.optima.enums.CzasPosiadaniaRachunkuBankowego;
import org.kossowski.optima.enums.CzasookresWyplaty;
import org.kossowski.optima.enums.DokumentTyp;
import org.kossowski.optima.enums.ZgodaNaKontaktSMS;

@Entity
@Table( name = "wnioskodawcy")
public class Wnioskodawca {
	
	public static Integer RODZ_WNIOSKODAWCY = 1;

	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "id" )
	private Integer id = null; 
	
	@Column( name = "nazwisko")
	private String nazwisko;
	
	@Column( name = "nazw_rodowe")
	private String nazwRodowe;
	
	@Column( name = "nazw_panienskie")
	private String nazwPanienskie;
	
	@Column( name = "imie" )
	private String imie;

	@Column( name = "pesel" )
	private String pesel;
	
	@Column( name = "miejsce_urodzenia")
	private String miejsceUrodzenia;
	
	@Column( name = "imie_ojca")
	private String imieOjca;
	
	@Column( name = "seria_nr_dowodu" )
	private String seriaNrDowodu;
	
	// stan cywilny tabela stan_cywilny
	@Column( name = "stan_cywilny" )
	private Integer stanCywilny;
	
	
	@Column( name = "ilosc_dzieci" )
	private Integer ileOsobWRodzinie;
	
	//meldunek
	@Embedded
	@AttributeOverrides( {
			@AttributeOverride( name = "ulica", column = @Column( name = "adres_zamel_ul")),
			@AttributeOverride( name = "nrDomu", column = @Column( name = "adres_zamel_ul_nr_1")),
			@AttributeOverride( name = "nrLokalu", column = @Column( name = "adres_zamel_ul_nr_2")),
			@AttributeOverride( name = "kodPocztowy", column = @Column( name = "adres_zamel_kod_poczt")),
			@AttributeOverride( name = "miejscowosc", column = @Column( name = "adres_zamel_miejscowosc")),
			@AttributeOverride( name = "meldunekCzasowy", column = @Column( name = "adres_zamel_meldunek_czasowy")),
			@AttributeOverride( name = "meldunekCzasowyDo", column = @Column( name = "adres_zamel_meldunek_czasowy_do")),
			
	} )
	private AdresZameldowaniaFactorDB adresZameldowania = new AdresZameldowaniaFactorDB();
	
	//korespondencja
	@Embedded
	@AttributeOverrides( {
		@AttributeOverride( name = "ulica", column = @Column( name = "adres_koresp_ul")),
		@AttributeOverride( name = "nrDomu", column = @Column( name = "adres_koresp_ul_nr_1")),
		@AttributeOverride( name = "nrLokalu", column = @Column( name = "adres_koresp_ul_nr_2")),
		@AttributeOverride( name = "kodPocztowy", column = @Column( name = "adres_koresp_kod_poczt")),
		@AttributeOverride( name = "miejscowosc", column = @Column( name = "adres_koresp_miejscowosc")),
		@AttributeOverride( name = "czasZamieszkaniaPodAdresem", column = @Column( name = "adres_koresp_czas_zamieszkania_pod_adresem"))
	} ) 
	private AdresZamieszkaniaFactorDB adresZamieszkania = new AdresZamieszkaniaFactorDB();
	
	
	@Embedded
	private DochodWydatekFactorDB dochod = new DochodWydatekFactorDB();
	
	@Enumerated( EnumType.STRING )
	@Column( name = "optima_rodzaj_dokumentu" )
	private DokumentTyp dokument;
	
	@Column( name = "telefon" )
	private String telefon;
	
	@Column( name = "tel_kom" )
	private String telKom;
	
	@Column( name = "email" )
	private String email;
	
	@Column( name = "ror" )
	private String rachunekBankowy;
	
	// forma wlasnosci mieszkania ref do tabeli forma_wlasnosci
	@Column( name = "forma_wlasnosci")
	private Integer formaWlasnosciMiezkania;
	
	//ref do tabeli rozdzielnosc_majatkowa
	@Column( name = "rozdzielnosc_majatkowa")
	private Integer rozdzielnoscMajatkowa;
	
	@Column( name = "imie_matki")
	private String imieMatki;
	
	//ref do tabeli telefon_rozliczenie - rodzaj tel stacj, komórka, prepaid
	@Column( name = " telefon_rozliczenie")
	private Integer telefonRozliczenie;
	
	@Column( name = "obywatelstwo")
	private String obywatelstwo;
	
	//ref do tabelli wyksztalcenie
	@Column( name = "wyksztalcenie",  columnDefinition="text")
	private Integer wyksztalcenie;
	
	
	@Column( name = "data_urodzenia")
	@Temporal( TemporalType.DATE )
	private Date dataUrodzenie;
	
	
	@Column( name = "rodzaj_wnioskodawcy")
	private Integer rodzajWnioskodawcy = RODZ_WNIOSKODAWCY;
	
	//nie wiem czy lepiej nie w tabeli wnioski
	@Column( name = "optima_skan_dowodu")
	private Boolean skanDowodu;
	
	@Column( name = "optima_dyskrecja")
	private Boolean dyskrecja;
	
	@Column( name = "optima_rachunek_za_media")
	private Boolean rachunekZaMedia;
	
	@Column( name = "optima_branza")
	@Enumerated( EnumType.STRING )
	private Branza branza;
	
	@Column( name = "optima_liczba_kart_kredytowych")
	private Integer liczbaKartKredytowych;

	@Column( name = "optima_klient_otrzymuje_wyplate")
	@Enumerated(EnumType.STRING)
	private CzasookresWyplaty czasookresWyplaty;
	
	@Column( name = "optima_zgoda_na_kontakt_sms")
	@Enumerated(EnumType.STRING)
	private ZgodaNaKontaktSMS zgodaNaKontaktSMS;
	
	@Column( name = "optima_nazwa_banku")
	private String nazwaBanku;
	
	@Column( name = "optima_zgoda_nadplata")
	private Boolean zgodaNaplata;
	
	@Column( name = "optima_czas_posiadania_rachunku_bankowego")
	@Enumerated(EnumType.STRING)
	private CzasPosiadaniaRachunkuBankowego czasPosiadaniaRachunkuBankowego;
	
	@Column( name = "optima_czy_posiada_samochod" )
	private Boolean samochod;
	
	@Column( name = "optima_oswiadczenie_warunki_obslugi")
	@Embedded
	private OswiadczenieWarunkiObslugiFactorDB oswiadczenieWarunkiObslugi;
	
	//wartości Integer oddzielone spacjami
	@Column( name = "optima_dni_odbioru_dochodu")
	private String dniOdbioruDochodu;

	
	
	public Wnioskodawca() {
		adresZameldowania = new AdresZameldowaniaFactorDB();
	};
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}
	
	
	

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getSeriaNrDowodu() {
		return seriaNrDowodu;
	}

	public void setSeriaNrDowodu(String seriaNrDowodu) {
		this.seriaNrDowodu = seriaNrDowodu;
	}
	
	public Integer getStanCywilny() {
		return stanCywilny;
	}

	public void setStanCywilny(Integer stanCywilny) {
		this.stanCywilny = stanCywilny;
	}
	
	
	public Integer getIleOsobWRodzinie() {
		return ileOsobWRodzinie;
	}

	public void setIleOsobWRodzinie(Integer ileOsobWRodzinie) {
		this.ileOsobWRodzinie = ileOsobWRodzinie;
	}
	
	
	

	

	public DochodWydatekFactorDB getDochod() {
		return dochod;
	}

	public void setDochod(DochodWydatekFactorDB dochod) {
		this.dochod = dochod;
	}

	public String getNazwRodowe() {
		return nazwRodowe;
	}

	public void setNazwRodowe(String nazwRodowe) {
		this.nazwRodowe = nazwRodowe;
	}

	public String getNazwPanienskie() {
		return nazwPanienskie;
	}

	public void setNazwPanienskie(String nazwPanienskie) {
		this.nazwPanienskie = nazwPanienskie;
	}

	public String getMiejsceUrodzenia() {
		return miejsceUrodzenia;
	}

	public void setMiejsceUrodzenia(String miejsceUrodzenia) {
		this.miejsceUrodzenia = miejsceUrodzenia;
	}

	public String getImieOjca() {
		return imieOjca;
	}

	public void setImieOjca(String imieOjca) {
		this.imieOjca = imieOjca;
	}

	

	

	public AdresZameldowaniaFactorDB getAdresZameldowania() {
		return adresZameldowania;
	}

	
	
	public void setAdresZameldowania(AdresZameldowaniaFactorDB adresZameldowania) {
		if( adresZameldowania == null )
			this.adresZameldowania = new AdresZameldowaniaFactorDB();
		else
			this.adresZameldowania = adresZameldowania;
	}

	public AdresZamieszkaniaFactorDB getAdresZamieszkania() {
		return adresZamieszkania;
	}

	public void setAdresZamieszkania(AdresZamieszkaniaFactorDB adresZamieszkania) {
		this.adresZamieszkania = adresZamieszkania;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getTelKom() {
		return telKom;
	}

	public void setTelKom(String telKom) {
		this.telKom = telKom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRachunekBankowy() {
		return rachunekBankowy;
	}

	public void setRachunekBankowy(String rachunekBankowy) {
		this.rachunekBankowy = rachunekBankowy;
	}

	public Integer getFormaWlasnosciMiezkania() {
		return formaWlasnosciMiezkania;
	}

	public void setFormaWlasnosciMiezkania(Integer formaWlasnosciMiezkania) {
		this.formaWlasnosciMiezkania = formaWlasnosciMiezkania;
	}

	public Integer getRozdzielnoscMajatkowa() {
		return rozdzielnoscMajatkowa;
	}

	public void setRozdzielnoscMajatkowa(Integer rozdzielnoscMajatkowa) {
		this.rozdzielnoscMajatkowa = rozdzielnoscMajatkowa;
	}

	public String getImieMatki() {
		return imieMatki;
	}

	public void setImieMatki(String imieMatki) {
		this.imieMatki = imieMatki;
	}

	public Integer getTelefonRozliczenie() {
		return telefonRozliczenie;
	}

	public void setTelefonRozliczenie(Integer telefonRozliczenie) {
		this.telefonRozliczenie = telefonRozliczenie;
	}

	public String getObywatelstwo() {
		return obywatelstwo;
	}

	public void setObywatelstwo(String obywatelstwo) {
		this.obywatelstwo = obywatelstwo;
	}

	public Integer getWyksztalcenie() {
		return wyksztalcenie;
	}

	public void setWyksztalcenie(Integer wyksztalcenie) {
		this.wyksztalcenie = wyksztalcenie;
	}

	public Date getDataUrodzenie() {
		return dataUrodzenie;
	}

	public void setDataUrodzenie(Date dataUrodzenie) {
		this.dataUrodzenie = dataUrodzenie;
	}

	public Integer getRodzajWnioskodawcy() {
		return rodzajWnioskodawcy;
	}

	public void setRodzajWnioskodawcy(Integer rodzajWnioskodawcy) {
		this.rodzajWnioskodawcy = rodzajWnioskodawcy;
	}

	
	
	
	public Boolean getSkanDowodu() {
		return skanDowodu;
	}

	public void setSkanDowodu(Boolean skanDowodu) {
		this.skanDowodu = skanDowodu;
	}

	
	
	
	
	
	
	public Integer getLiczbaKartKredytowych() {
		return liczbaKartKredytowych;
	}

	public void setLiczbaKartKredytowych(Integer liczbaKartKredytowych) {
		this.liczbaKartKredytowych = liczbaKartKredytowych;
	}

	public Branza getBranza() {
		return branza;
	}

	public void setBranza(Branza branza) {
		this.branza = branza;
	}

	public Boolean getRachunekZaMedia() {
		return rachunekZaMedia;
	}

	public void setRachunekZaMedia(Boolean rachunekZaMedia) {
		this.rachunekZaMedia = rachunekZaMedia;
	}

	public Boolean getDyskrecja() {
		return dyskrecja;
	}

	public void setDyskrecja(Boolean dyskrecja) {
		this.dyskrecja = dyskrecja;
	}

	
	public CzasookresWyplaty getCzasookresWyplaty() {
		return czasookresWyplaty;
	}

	public void setCzasookresWyplaty(CzasookresWyplaty czasookresWyplaty) {
		this.czasookresWyplaty = czasookresWyplaty;
	}
	
	
	

	public ZgodaNaKontaktSMS getZgodaNaKontaktSMS() {
		return zgodaNaKontaktSMS;
	}

	public void setZgodaNaKontaktSMS(ZgodaNaKontaktSMS zgodaNaKontaktSMS) {
		this.zgodaNaKontaktSMS = zgodaNaKontaktSMS;
	}

	
	
	
	
	public String getNazwaBanku() {
		return nazwaBanku;
	}

	public void setNazwaBanku(String nazwaBanku) {
		this.nazwaBanku = nazwaBanku;
	}
	
	
	

	public Boolean getZgodaNaplata() {
		return zgodaNaplata;
	}

	public void setZgodaNaplata(Boolean zgodaNaplata) {
		this.zgodaNaplata = zgodaNaplata;
	}
	
	
	
	

	public CzasPosiadaniaRachunkuBankowego getCzasPosiadaniaRachunkuBankowego() {
		return czasPosiadaniaRachunkuBankowego;
	}

	public void setCzasPosiadaniaRachunkuBankowego(CzasPosiadaniaRachunkuBankowego czasPosiadaniaRachunkuBankowego) {
		this.czasPosiadaniaRachunkuBankowego = czasPosiadaniaRachunkuBankowego;
	}

	
	
	
	public Boolean getSamochod() {
		return samochod;
	}

	public void setSamochod(Boolean samochod) {
		this.samochod = samochod;
	}

	
	
	
	
	
	public OswiadczenieWarunkiObslugiFactorDB getOswiadczenieWarunkiObslugi() {
		return oswiadczenieWarunkiObslugi;
	}

	public void setOswiadczenieWarunkiObslugi(OswiadczenieWarunkiObslugiFactorDB oswiadczenieWarunkiObslugi) {
		this.oswiadczenieWarunkiObslugi = oswiadczenieWarunkiObslugi;
	}

	public String getDniOdbioruDochodu() {
		return dniOdbioruDochodu;
	}

	public void setDniOdbioruDochodu(String dniOdbioruDochodu) {
		this.dniOdbioruDochodu = dniOdbioruDochodu;
	}

	
	
	
	public DokumentTyp getDokument() {
		return dokument;
	}

	public void setDokument(DokumentTyp dokument) {
		this.dokument = dokument;
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
		Wnioskodawca other = (Wnioskodawca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wnioskodawca [id=" + id + ", nazwisko=" + nazwisko + ", imie=" + imie + ", pesel=" + pesel + "]";
	}


	
	

	
	
	
	
}
