-- Table: public.path1

-- DROP TABLE public.path1;

CREATE TABLE public.path1
(
  id integer NOT NULL DEFAULT nextval(('path1_id_seq'::text)::regclass),
  sid text,
  "timestamp" timestamp without time zone DEFAULT now(),
  firma_nazwa text,
  ulica text,
  ulica_nr_1 text,
  ulica_nr_2 text,
  telefon text,
  tel_kom text,
  kod_pocztowy text,
  poczta text,
  miejscowosc text,
  wojewodztwo text,
  zatrudnienie_od date,
  zatrudnienie_do date,
  dochod text,
  nip text,
  stanowisko text,
  zaswiadczenie_data date,
  wystawiajacy text,
  stanowisko_wystawiajacego text,
  id_wniosku integer,
  id_wnioskodawcy integer,
  tel_do_zakladu_wlasc integer,
  tel_kom_abonament integer,
  okres_zatrudnienia integer,
  status integer DEFAULT 10,
  branza_pracodawcy_id integer,
  handlowiec integer,
  dochod_bank text,
  regon text,
  zawod_inny text,
  firma_liczba_pracownikow_id integer,
  staz_id integer,
  status_zawodowy_id integer,
  zawod_wykonywany_id integer,
  forma_prawna_id integer,
  tel_stac_operator_id integer,
  tel_kom_operator_id integer,
  sektor_id integer,
  dochod_brutto numeric,
  ilosc_umow integer,
  data_umowy_start date,
  data_umowy_end date,
  nr_dochodu integer DEFAULT 1,
  dzien_wyplaty integer,
  CONSTRAINT path1_id__pkey PRIMARY KEY (id),
  CONSTRAINT firma_liczba_pracownikow_id_path1_fk FOREIGN KEY (firma_liczba_pracownikow_id)
      REFERENCES public.dict_liczba_pracownikow (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT operator_kom_id_fk_path1 FOREIGN KEY (tel_kom_operator_id)
      REFERENCES public.dict_operator_kom (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT operator_stac_id_fk_path1 FOREIGN KEY (tel_stac_operator_id)
      REFERENCES public.dict_operator_stac (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT sektor_id_fk FOREIGN KEY (sektor_id)
      REFERENCES public.dict_sektor (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT status_zawodowy_id_fk FOREIGN KEY (status_zawodowy_id)
      REFERENCES public.dict_status_zawodowy (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT staz_id_fk FOREIGN KEY (staz_id)
      REFERENCES public.dict_staz (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT zawod_wykonywany_id_fk FOREIGN KEY (zawod_wykonywany_id)
      REFERENCES public.dict_zawod_wykonywany (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE public.path1
  OWNER TO postgres;

-- Index: public.id_wnioskodawcy_idx

-- DROP INDEX public.id_wnioskodawcy_idx;

CREATE INDEX id_wnioskodawcy_idx
  ON public.path1
  USING btree
  (id_wnioskodawcy);

-- Index: public.id_wniosku_idx

-- DROP INDEX public.id_wniosku_idx;

CREATE INDEX id_wniosku_idx
  ON public.path1
  USING btree
  (id_wniosku);

-- Index: public.id_wojewodztwo_path1_idx

-- DROP INDEX public.id_wojewodztwo_path1_idx;

CREATE INDEX id_wojewodztwo_path1_idx
  ON public.path1
  USING btree
  (wojewodztwo COLLATE pg_catalog."default");


-- Trigger: ustaw_dochod_bank on public.path1

-- DROP TRIGGER ustaw_dochod_bank ON public.path1;

CREATE TRIGGER ustaw_dochod_bank
  BEFORE INSERT OR UPDATE
  ON public.path1
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioskodawca_ustaw_dochod_bank();

