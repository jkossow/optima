-- Table: public.wnioskodawcy

-- DROP TABLE public.wnioskodawcy;

CREATE TABLE public.wnioskodawcy
(
  id integer NOT NULL DEFAULT nextval(('wnioskodawcy_id_seq'::text)::regclass),
  sid text,
  "timestamp" timestamp without time zone DEFAULT now(),
  imie text,
  nazwisko text,
  nazw_rodowe text,
  nazw_panienskie text,
  pesel text,
  seria_nr_dowodu text,
  data_wydania_dowodu date,
  wydany_przez text,
  miejsce_urodzenia text,
  imie_ojca text,
  stan_cywilny integer,
  ilosc_dzieci integer,
  adres_zamel_miejscowosc text,
  adres_zamel_ul text,
  adres_zamel_ul_nr_1 text,
  adres_zamel_ul_nr_2 text,
  adres_zamel_kod_poczt text,
  adres_zamel_poczta text,
  adres_zamel_data_zameldowania date,
  adres_koresp_miejscowosc text,
  adres_koresp_ul text,
  adres_koresp_ul_nr_1 text,
  adres_koresp_ul_nr_2 text,
  adres_koresp_kod_poczt text,
  adres_koresp_poczta text,
  adres_koresp_data_zameldowania date,
  telefon text,
  tel_kom text,
  forma_wlasnosci integer,
  adres_zamel_wojewodztwo integer,
  rodzaj_dochodu integer,
  dochod text,
  login text,
  password text,
  email text,
  ror text,
  status integer DEFAULT 10,
  status_99_user integer,
  status_99_timestamp timestamp without time zone,
  wniosek_id integer,
  rodzaj_wnioskodawcy integer,
  create_ip text,
  edit_ip text,
  edit_timestamp timestamp without time zone,
  rozdzielnosc_majatkowa integer,
  drugi_dok_tozs text,
  osoby_na_utrzymaniu integer,
  wojsko text,
  plec text,
  malzonek integer,
  imie_matki text,
  drugi_dok_tozs_rodzaj integer,
  telefon_rodzaj integer,
  telefon_rozliczenie integer,
  ror_rodzaj integer,
  data_wydania_dr_dokumentu text,
  dr_dok_wydany_przez text,
  drugi_dok_tozs_inny text,
  adres_koresp_inny integer,
  oswiadczenie_printed integer DEFAULT 0,
  obywatelstwo text,
  kraj_obecnego_przebywania text,
  czyrezydent text,
  postepowanie_egz text,
  zobowiazania_finansowe text,
  wyksztalcenie text,
  od_kiedy_ror text,
  bank_ror_id integer,
  wydatki_stale double precision,
  ror_owner text,
  rodzaj_lokalu_id integer,
  typ_lokalu_id integer,
  pokaz_w_dowodzie_rej integer,
  gap_appt_id integer,
  gap_appt_client_seq integer,
  handlowiec integer,
  ilosc_dzieci_bank integer,
  gap_na_umowe_ubezpieczenia integer,
  tel_stac_operator_id integer,
  tel_kom_operator_id integer,
  data_urodzenia date,
  mieszkanie_wlasnosc_procent numeric(10,2),
  mieszkanie_wynajem_koszt numeric(10,2),
  limity_kredytowe_platnicze integer,
  poreczenie_innych_kredytow integer,
  rodzaj_dochodu_2 integer,
  adres_koresp_telefon text,
  skok_rachunek_bankowy text,
  drugie_imie text,
  czy_posiada_karte_kredyt integer,
  czy_posiada_samochod integer,
  data_zamieszkania timestamp without time zone,
  CONSTRAINT wnioskodawcy_id__pkey PRIMARY KEY (id),
  CONSTRAINT limity_kredytowe_platnicze_fk FOREIGN KEY (limity_kredytowe_platnicze)
      REFERENCES public.tak_nie (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT operator_kom_id_fk_path3 FOREIGN KEY (tel_kom_operator_id)
      REFERENCES public.dict_operator_kom (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT operator_stac_id_fk_path3 FOREIGN KEY (tel_stac_operator_id)
      REFERENCES public.dict_operator_stac (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT poreczenie_innych_kredytow_fk FOREIGN KEY (poreczenie_innych_kredytow)
      REFERENCES public.tak_nie (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE public.wnioskodawcy
  OWNER TO postgres;

-- Index: public.gap_appt_id_idx

-- DROP INDEX public.gap_appt_id_idx;

CREATE INDEX gap_appt_id_idx
  ON public.wnioskodawcy
  USING btree
  (gap_appt_id);

-- Index: public.wniosek_idx

-- DROP INDEX public.wniosek_idx;

CREATE INDEX wniosek_idx
  ON public.wnioskodawcy
  USING btree
  (wniosek_id);


-- Trigger: ustaw_ilosc_dzieci_bank on public.wnioskodawcy

-- DROP TRIGGER ustaw_ilosc_dzieci_bank ON public.wnioskodawcy;

CREATE TRIGGER ustaw_ilosc_dzieci_bank
  BEFORE INSERT OR UPDATE
  ON public.wnioskodawcy
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioskodawcy_ustaw_ilosc_dzieci_bank();

-- Trigger: ustaw_st_cyw_i_rozdz_maj on public.wnioskodawcy

-- DROP TRIGGER ustaw_st_cyw_i_rozdz_maj ON public.wnioskodawcy;

CREATE TRIGGER ustaw_st_cyw_i_rozdz_maj
  BEFORE INSERT
  ON public.wnioskodawcy
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioskodawcy_ustaw_stan_cyw_i_rozdz();

