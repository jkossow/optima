-- Table: public.path3

-- DROP TABLE public.path3;

CREATE TABLE public.path3
(
  id integer NOT NULL DEFAULT nextval(('path3_id_seq'::text)::regclass),
  sid text,
  "timestamp" timestamp without time zone DEFAULT now(),
  firma_nazwa text,
  stawka_vat text,
  ulica text,
  ulica_nr_1 text,
  ulica_nr_2 text,
  telefon text,
  tel_kom text,
  kod_pocztowy text,
  poczta text,
  miejscowosc text,
  wojewodztwo text,
  dzialalnosc_od date,
  dochod text,
  nip text,
  zaswiadczenie_data date,
  regon text,
  wpis_ewid_krs text,
  data_wpisu_ewid_krs date,
  forma_opodatkowania text,
  id_wniosku integer,
  id_wnioskodawcy integer,
  rodzaj_dzialalnosci integer,
  rolnik integer,
  tel_do_zakladu_wlasc integer,
  tel_kom_abonament integer,
  zaswiadczenie_jest_brak integer,
  status integer DEFAULT 10,
  adres_jak_zameldowania integer DEFAULT 0,
  tel_kom_rolnik_gotowka integer,
  tel_stacj_rolnik_gotowka integer,
  data_rolnik_gosp date,
  forma_prawna_id integer,
  stanowisko text,
  pkd text,
  ekd text,
  branza_pracodawcy_id integer,
  status_prawny_id integer,
  podstawowa_branza_id integer,
  forma_ksieg_id integer,
  rodzaj_podmiotu_id integer,
  typ_reprezentanta_id integer,
  handlowiec integer,
  dochod_bank text,
  zawod_inny text,
  firma_liczba_pracownikow_id integer,
  staz_id integer,
  status_zawodowy_id integer,
  zawod_wykonywany_id integer,
  tel_stac_operator_id integer,
  tel_kom_operator_id integer,
  dochod_brutto numeric,
  dochod_roczny numeric,
  liczba_ha numeric,
  dochod_fv numeric,
  ilosc_miesiecy_fv numeric,
  kwota_dotacji numeric,
  nr_dochodu integer DEFAULT 1,
  rolnik_dochod_urzad_gminy_rok_ubiegly numeric(10,2),
  rolnik_dochod_urzad_gminy_rok_biezacy numeric(10,2),
  rolnik_dochod_ue_rok_ubiegly numeric(10,2),
  rolnik_dochod_ue_rok_biezacy numeric(10,2),
  rolnik_dochod_faktury_rok_ubiegly numeric(10,2),
  rolnik_dochod_faktury_rok_biezacy numeric(10,2),
  rolnik_dochod_inny numeric(10,2),
  CONSTRAINT path3_id__pkey PRIMARY KEY (id),
  CONSTRAINT firma_liczba_pracownikow_id_path3_fk FOREIGN KEY (firma_liczba_pracownikow_id)
      REFERENCES public.dict_liczba_pracownikow (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT operator_kom_id_path3_fk FOREIGN KEY (tel_kom_operator_id)
      REFERENCES public.dict_operator_kom (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT operator_stac_id_path3_fk FOREIGN KEY (tel_stac_operator_id)
      REFERENCES public.dict_operator_stac (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT status_zawodowy_id_path3_fk FOREIGN KEY (status_zawodowy_id)
      REFERENCES public.dict_status_zawodowy (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT staz_id_path3_fk FOREIGN KEY (staz_id)
      REFERENCES public.dict_staz (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT zawod_wykonywany_id_path3_fk FOREIGN KEY (zawod_wykonywany_id)
      REFERENCES public.dict_zawod_wykonywany (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE public.path3
  OWNER TO postgres;

-- Index: public.id_wnioskodawcy_path3_idx

-- DROP INDEX public.id_wnioskodawcy_path3_idx;

CREATE INDEX id_wnioskodawcy_path3_idx
  ON public.path3
  USING btree
  (id_wnioskodawcy);

-- Index: public.id_wniosku_path3_idx

-- DROP INDEX public.id_wniosku_path3_idx;

CREATE INDEX id_wniosku_path3_idx
  ON public.path3
  USING btree
  (id_wniosku);

-- Index: public.id_wojewodztwo_path3_idx

-- DROP INDEX public.id_wojewodztwo_path3_idx;

CREATE INDEX id_wojewodztwo_path3_idx
  ON public.path3
  USING btree
  (wojewodztwo COLLATE pg_catalog."default");


-- Trigger: ustaw_dochod_bank on public.path3

-- DROP TRIGGER ustaw_dochod_bank ON public.path3;

CREATE TRIGGER ustaw_dochod_bank
  BEFORE INSERT OR UPDATE
  ON public.path3
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioskodawca_ustaw_dochod_bank();

-- Trigger: ustaw_woj_z_adr_zam on public.path3

-- DROP TRIGGER ustaw_woj_z_adr_zam ON public.path3;

CREATE TRIGGER ustaw_woj_z_adr_zam
  BEFORE INSERT OR UPDATE
  ON public.path3
  FOR EACH ROW
  EXECUTE PROCEDURE public.ustaw_woj_z_adr_zam();

