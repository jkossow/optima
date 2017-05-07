package org.kossowski.optima.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.kossowski.optima.enums.Branza;
import org.kossowski.optima.enums.CzasookresWyplaty;
import org.kossowski.optima.enums.MieszkanieTyp;
import org.kossowski.optima.enums.StanCywilny;
import org.kossowski.optima.enums.TypAdresu;
import org.kossowski.optima.enums.WyksztalcenieEnum;
import org.kossowski.optima.enums.ZgodaNaKontaktSMS;

@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class WnioskodawcaApp implements Serializable {
	
	@XmlTransient
	private Long idFactorDB = 0L;
	
	
	@XmlAttribute( name = "Id" )
	private Integer id = 1;
	
	@XmlTransient
	private String pesel;
	
	@XmlTransient
	private String nazwisko;
	
	@XmlTransient
	private String imie;
	
	
	@XmlElement( name = "DowodOsobisty")
	private String dowodOsobisty;
	
	@XmlElement( name = "SkanDowodu")
	private Boolean skanDowodu;
	
	@XmlElement( name = "Dyskrecja" )
	private DyskrecjaAppOptima dyskrecja = new DyskrecjaAppOptima();
	
	@XmlElement( name = "StanCywilny")
	private StanCywilny stanCywilny;
	
	@XmlElement( name = "MiejsceUrodzenia")
	private String miejsceUrodzenia;
	
	@XmlElement( name = "IleOsobWRodzinie")
	private Integer ileOsobWRodzinie;
	
	@XmlElement( name = "Wyksztalcenie" )
	private WyksztalcenieEnum wyksztalcenie;
	
	@XmlElement( name = "RachunekZaMedia" )
	private Boolean rachunekaMedia;
	
	@XmlElement( name = "Branza" )
	private Branza branza;
	
	@XmlElement( name = "LiczbaKartKredytowych")
	private Integer liczbaKartKredytowych;
	
	@XmlElement( name = "KlientOtrzymujeWyplate" )
	private CzasookresWyplaty czasookresWyplaty;
	
	@XmlElementWrapper( name = "Adresy" )
	@XmlElementRef
	private List<AdresApp> adresy = new ArrayList<AdresApp>();
	
	@XmlElementWrapper( name = "Telefony" )
	@XmlElement( name = "Telefon" )
	private List<Telefon> telefony = new ArrayList<Telefon>();
	
	@XmlElement( name = "Email" )
	private String email;
	
	@XmlElement( name = "ZgodaNaKontakt" )
	private ZgodaNaKontaktSMS zgodaNaKontaksSMS;
	
	@XmlElement( name = "RachunekBankowy" )
	private RachunekBankowy rachunekBankowy = new RachunekBankowy();
	
	@XmlElement( name = "MieszkanieTyp" )
	private MieszkanieTyp mieszkanieTyp;
	
	@XmlElement( name = "Samochod" )
	private Boolean samochod;
	

	
	@XmlElementWrapper( name = "Dokumenty" )
	@XmlElementRef
	private List<Dokument> dokumenty = new ArrayList<Dokument>();
	
	@XmlElement( name = "MiesieczneDochodyWydatki" )
	private MiesieczneDochodyWydatki miesieczneDochodyWydatki = new MiesieczneDochodyWydatki();

	// TODO: jeszcze te pola
	
	
	@XmlElement( name = "RezygnacjaObsluga" )
	private Boolean rezygnacjaObsluga;
	
	@XmlElementWrapper( name = "Zgody" )
	@XmlElement( name = "Zgoda" )
	private List<Zgoda> zgody = new ArrayList<Zgoda>();
	
	@XmlElement( name = "OswiadczenieWarunkiObslugi" )
	private OswiadczenieWarunkiObslugi oswiadczenieWarunkiObslugi = new OswiadczenieWarunkiObslugi();
	
	@XmlElementWrapper( name = "DniOdbioruDochodu" )
	@XmlElement( name = "DzienOdbioruDochodu" )
	private List<DzienOdbioruDochodu> dniOdbioruDochodu = new ArrayList<DzienOdbioruDochodu>();

	
	public void addAddress( AdresApp address) {
		adresy.add( address );
	}
	
	public void addDokument( Dokument doc)  {
		dokumenty.add( doc );
	}
	
	public void addTelefon( Telefon tel ) {
		telefony.add( tel );
	}
	
	public void addZgoda( Zgoda z ) {
		zgody.add( z );
	}
	
	public void addDochod( DochodWydatek d ) {
		miesieczneDochodyWydatki.addDochod( d ) ;
	}
	
	public void addWydatek( DochodWydatek w ) {
		miesieczneDochodyWydatki.addWydatek( w );
	}
	
	public void addDzienOdbioruDochodow( DzienOdbioruDochodu d ) {
		dniOdbioruDochodu.add( d );
	}
	
	public AdresApp getAdres( TypAdresu typ ) {
		
		
		for( AdresApp adres : adresy )
			if( adres.getTyp() == typ )
				return adres;
		return null;
	}
	
	public AdresZamieszkania getAdresZamieszkania() {
		return (AdresZamieszkania) getAdres( TypAdresu.ZAMIESZKANIA );
	}
	
	public void setAdresZamieszkania( AdresZamieszkania a ) {
		AdresZamieszkania old = getAdresZamieszkania();
		if( old != null )
			adresy.remove( old );
		adresy.add( a );
	}
	
	public AdresMeldunkowy getAdresZameldowania() {
		return (AdresMeldunkowy) getAdres(TypAdresu.ZAMIESZKANIA );
	}
	
	public void setAdresZameldowania( AdresMeldunkowy a) {
		AdresMeldunkowy old = getAdresZameldowania();
		if( old != null )
			adresy.remove( old );
		adresy.add( a );
		
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
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

	public String getDowodOsobisty() {
		return dowodOsobisty;
	}

	public void setDowodOsobisty(String dowodOsobisty) {
		this.dowodOsobisty = dowodOsobisty;
	}

	public Boolean getSkanDowodu() {
		return skanDowodu;
	}

	public void setSkanDowodu(Boolean skanDowodu) {
		this.skanDowodu = skanDowodu;
	}

	public DyskrecjaAppOptima getDyskrecja() {
		return dyskrecja;
	}

	public void setDyskrecja(DyskrecjaAppOptima dyskrecja) {
		this.dyskrecja = dyskrecja;
	}

	public StanCywilny getStanCywilny() {
		return stanCywilny;
	}

	public void setStanCywilny(StanCywilny stanCywilny) {
		this.stanCywilny = stanCywilny;
	}

	public String getMiejsceUrodzenia() {
		return miejsceUrodzenia;
	}

	public void setMiejsceUrodzenia(String miejsceUrodzenia) {
		this.miejsceUrodzenia = miejsceUrodzenia;
	}

	public Integer getIleOsobWRodzinie() {
		return ileOsobWRodzinie;
	}

	public void setIleOsobWRodzinie(Integer ileOsobWRodzinie) {
		this.ileOsobWRodzinie = ileOsobWRodzinie;
	}

	public WyksztalcenieEnum getWyksztalcenie() {
		return wyksztalcenie;
	}

	public void setWyksztalcenie(WyksztalcenieEnum wyksztalcenie) {
		this.wyksztalcenie = wyksztalcenie;
	}

	public Boolean getRachunekaMedia() {
		return rachunekaMedia;
	}

	public void setRachunekaMedia(Boolean rachunekaMedia) {
		this.rachunekaMedia = rachunekaMedia;
	}

	public Branza getBranza() {
		return branza;
	}

	public void setBranza(Branza branza) {
		this.branza = branza;
	}

	public Integer getLiczbaKartKredytowych() {
		return liczbaKartKredytowych;
	}

	public void setLiczbaKartKredytowych(Integer liczbaKartKredytoych) {
		this.liczbaKartKredytowych = liczbaKartKredytoych;
	}

	public CzasookresWyplaty getCzasookresWyplaty() {
		return czasookresWyplaty;
	}

	public void setCzasookresWyplaty(CzasookresWyplaty czasookresWyplaty) {
		this.czasookresWyplaty = czasookresWyplaty;
	}

	public List<AdresApp> getAdresy() {
		return adresy;
	}

	public void setAdresy(List<AdresApp> adresy) {
		this.adresy = adresy;
	}

	public List<Telefon> getTelefony() {
		return telefony;
	}

	public void setTelefony(List<Telefon> telefony) {
		this.telefony = telefony;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ZgodaNaKontaktSMS getZgodaNaKontaksSMS() {
		return zgodaNaKontaksSMS;
	}

	public void setZgodaNaKontaksSMS(ZgodaNaKontaktSMS zgodaNaKontaksSMS) {
		this.zgodaNaKontaksSMS = zgodaNaKontaksSMS;
	}

	public RachunekBankowy getRachunekBankowy() {
		return rachunekBankowy;
	}

	public void setRachunekBankowy(RachunekBankowy rachunekBankowy) {
		this.rachunekBankowy = rachunekBankowy;
	}

	public MieszkanieTyp getMieszkanieTyp() {
		return mieszkanieTyp;
	}

	public void setMieszkanieTyp(MieszkanieTyp mieszkanieTyp) {
		this.mieszkanieTyp = mieszkanieTyp;
	}

	public Boolean getSamochod() {
		return samochod;
	}

	public void setSamochod(Boolean samochod) {
		this.samochod = samochod;
	}

	public List<Dokument> getDokumenty() {
		return dokumenty;
	}

	public void setDokumenty(List<Dokument> dokumenty) {
		this.dokumenty = dokumenty;
	}

	public MiesieczneDochodyWydatki getMiesieczneDochodyWydatki() {
		return miesieczneDochodyWydatki;
	}

	public void setMiesieczneDochodyWydatki(MiesieczneDochodyWydatki miesieczneDochodyWydatki) {
		this.miesieczneDochodyWydatki = miesieczneDochodyWydatki;
	}

	public Boolean getRezygnacjaObsluga() {
		return rezygnacjaObsluga;
	}

	public void setRezygnacjaObsluga(Boolean rezygnacjaObsluga) {
		this.rezygnacjaObsluga = rezygnacjaObsluga;
	}

	public List<Zgoda> getZgody() {
		return zgody;
	}

	public void setZgody(List<Zgoda> zgody) {
		this.zgody = zgody;
	}

	public OswiadczenieWarunkiObslugi getOswiadczenieWarunkiObslugi() {
		return oswiadczenieWarunkiObslugi;
	}

	public void setOswiadczenieWarunkiObslugi(OswiadczenieWarunkiObslugi oswiadczenieWarunkiObslugi) {
		this.oswiadczenieWarunkiObslugi = oswiadczenieWarunkiObslugi;
	}

	public List<DzienOdbioruDochodu> getDniOdbioruDochodu() {
		return dniOdbioruDochodu;
	}

	public void setDniOdbioruDochodu(List<DzienOdbioruDochodu> dniOdbioruDochodu) {
		this.dniOdbioruDochodu = dniOdbioruDochodu;
	}

	
	
	public Long getIdFactorDB() {
		return idFactorDB;
	}

	public void setIdFactorDB(Long idFactorDB) {
		this.idFactorDB = idFactorDB;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresy == null) ? 0 : adresy.hashCode());
		result = prime * result + ((branza == null) ? 0 : branza.hashCode());
		result = prime * result + ((czasookresWyplaty == null) ? 0 : czasookresWyplaty.hashCode());
		result = prime * result + ((dniOdbioruDochodu == null) ? 0 : dniOdbioruDochodu.hashCode());
		result = prime * result + ((dokumenty == null) ? 0 : dokumenty.hashCode());
		result = prime * result + ((dowodOsobisty == null) ? 0 : dowodOsobisty.hashCode());
		result = prime * result + ((dyskrecja == null) ? 0 : dyskrecja.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ileOsobWRodzinie == null) ? 0 : ileOsobWRodzinie.hashCode());
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((liczbaKartKredytowych == null) ? 0 : liczbaKartKredytowych.hashCode());
		result = prime * result + ((miejsceUrodzenia == null) ? 0 : miejsceUrodzenia.hashCode());
		result = prime * result + ((miesieczneDochodyWydatki == null) ? 0 : miesieczneDochodyWydatki.hashCode());
		result = prime * result + ((mieszkanieTyp == null) ? 0 : mieszkanieTyp.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + ((oswiadczenieWarunkiObslugi == null) ? 0 : oswiadczenieWarunkiObslugi.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
		result = prime * result + ((rachunekBankowy == null) ? 0 : rachunekBankowy.hashCode());
		result = prime * result + ((rachunekaMedia == null) ? 0 : rachunekaMedia.hashCode());
		result = prime * result + ((rezygnacjaObsluga == null) ? 0 : rezygnacjaObsluga.hashCode());
		result = prime * result + ((samochod == null) ? 0 : samochod.hashCode());
		result = prime * result + ((skanDowodu == null) ? 0 : skanDowodu.hashCode());
		result = prime * result + ((stanCywilny == null) ? 0 : stanCywilny.hashCode());
		result = prime * result + ((telefony == null) ? 0 : telefony.hashCode());
		result = prime * result + ((wyksztalcenie == null) ? 0 : wyksztalcenie.hashCode());
		result = prime * result + ((zgodaNaKontaksSMS == null) ? 0 : zgodaNaKontaksSMS.hashCode());
		result = prime * result + ((zgody == null) ? 0 : zgody.hashCode());
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
		WnioskodawcaApp other = (WnioskodawcaApp) obj;
		if (adresy == null) {
			if (other.adresy != null)
				return false;
		} else if (!adresy.equals(other.adresy))
			return false;
		if (branza != other.branza)
			return false;
		if (czasookresWyplaty != other.czasookresWyplaty)
			return false;
		if (dniOdbioruDochodu == null) {
			if (other.dniOdbioruDochodu != null)
				return false;
		} else if (!dniOdbioruDochodu.equals(other.dniOdbioruDochodu))
			return false;
		if (dokumenty == null) {
			if (other.dokumenty != null)
				return false;
		} else if (!dokumenty.equals(other.dokumenty))
			return false;
		if (dowodOsobisty == null) {
			if (other.dowodOsobisty != null)
				return false;
		} else if (!dowodOsobisty.equals(other.dowodOsobisty))
			return false;
		if (dyskrecja == null) {
			if (other.dyskrecja != null)
				return false;
		} else if (!dyskrecja.equals(other.dyskrecja))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ileOsobWRodzinie == null) {
			if (other.ileOsobWRodzinie != null)
				return false;
		} else if (!ileOsobWRodzinie.equals(other.ileOsobWRodzinie))
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (liczbaKartKredytowych == null) {
			if (other.liczbaKartKredytowych != null)
				return false;
		} else if (!liczbaKartKredytowych.equals(other.liczbaKartKredytowych))
			return false;
		if (miejsceUrodzenia == null) {
			if (other.miejsceUrodzenia != null)
				return false;
		} else if (!miejsceUrodzenia.equals(other.miejsceUrodzenia))
			return false;
		if (miesieczneDochodyWydatki == null) {
			if (other.miesieczneDochodyWydatki != null)
				return false;
		} else if (!miesieczneDochodyWydatki.equals(other.miesieczneDochodyWydatki))
			return false;
		if (mieszkanieTyp != other.mieszkanieTyp)
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (oswiadczenieWarunkiObslugi == null) {
			if (other.oswiadczenieWarunkiObslugi != null)
				return false;
		} else if (!oswiadczenieWarunkiObslugi.equals(other.oswiadczenieWarunkiObslugi))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		if (rachunekBankowy == null) {
			if (other.rachunekBankowy != null)
				return false;
		} else if (!rachunekBankowy.equals(other.rachunekBankowy))
			return false;
		if (rachunekaMedia == null) {
			if (other.rachunekaMedia != null)
				return false;
		} else if (!rachunekaMedia.equals(other.rachunekaMedia))
			return false;
		if (rezygnacjaObsluga == null) {
			if (other.rezygnacjaObsluga != null)
				return false;
		} else if (!rezygnacjaObsluga.equals(other.rezygnacjaObsluga))
			return false;
		if (samochod == null) {
			if (other.samochod != null)
				return false;
		} else if (!samochod.equals(other.samochod))
			return false;
		if (skanDowodu == null) {
			if (other.skanDowodu != null)
				return false;
		} else if (!skanDowodu.equals(other.skanDowodu))
			return false;
		if (stanCywilny != other.stanCywilny)
			return false;
		if (telefony == null) {
			if (other.telefony != null)
				return false;
		} else if (!telefony.equals(other.telefony))
			return false;
		if (wyksztalcenie != other.wyksztalcenie)
			return false;
		if (zgodaNaKontaksSMS != other.zgodaNaKontaksSMS)
			return false;
		if (zgody == null) {
			if (other.zgody != null)
				return false;
		} else if (!zgody.equals(other.zgody))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WnioskodawcaApp [id=" + id + ", pesel=" + pesel + ", nazwisko=" + nazwisko + ", imie=" + imie
				+ ", dowodOsobisty=" + dowodOsobisty + ", skanDowodu=" + skanDowodu + ", dyskrecja=" + dyskrecja
				+ ", stanCywilny=" + stanCywilny + ", miejsceUrodzenia=" + miejsceUrodzenia + ", ileOsobWRodzinie="
				+ ileOsobWRodzinie + ", wyksztalcenie=" + wyksztalcenie + ", rachunekaMedia=" + rachunekaMedia
				+ ", branza=" + branza + ", liczbaKartKredytoych=" + liczbaKartKredytowych + ", czasookresWyplaty="
				+ czasookresWyplaty + ", adresy=" + adresy + ", telefony=" + telefony + ", email=" + email
				+ ", zgodaNaKontaksSMS=" + zgodaNaKontaksSMS + ", rachunekBankowy=" + rachunekBankowy
				+ ", mieszkanieTyp=" + mieszkanieTyp + ", samochod=" + samochod + ", dokumenty=" + dokumenty
				+ ", miesieczneDochodyWydatki=" + miesieczneDochodyWydatki + ", rezygnacjaObsluga=" + rezygnacjaObsluga
				+ ", zgody=" + zgody + ", oswiadczenieWarunkiObslugi=" + oswiadczenieWarunkiObslugi
				+ ", dniOdbioruDochodu=" + dniOdbioruDochodu + "]";
	}

	
	

	
		
	
	
	
	
}
