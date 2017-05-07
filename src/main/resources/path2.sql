-- Table: public.path2

-- DROP TABLE public.path2;

CREATE TABLE public.path2
(
  id integer NOT NULL DEFAULT nextval(('path2_id_seq'::text)::regclass),
  sid text,
  "timestamp" timestamp without time zone DEFAULT now(),
  decyzja_start date,
  decyzja_end date,
  swiadczenie text,
  dochod text,
  dodatki text,
  sposob_wyplaty text,
  id_wniosku integer,
  wojewodztwo text,
  id_wnioskodawcy integer,
  czas_decyzji integer,
  status integer DEFAULT 10,
  handlowiec integer,
  dochod_bank text,
  dochod_brutto numeric,
  nr_dochodu integer DEFAULT 1,
  CONSTRAINT path2_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=TRUE
);
ALTER TABLE public.path2
  OWNER TO postgres;

-- Index: public.id_wnioskodawcy_path2_idx

-- DROP INDEX public.id_wnioskodawcy_path2_idx;

CREATE INDEX id_wnioskodawcy_path2_idx
  ON public.path2
  USING btree
  (id_wnioskodawcy);

-- Index: public.id_wniosku_path2_idx

-- DROP INDEX public.id_wniosku_path2_idx;

CREATE INDEX id_wniosku_path2_idx
  ON public.path2
  USING btree
  (id_wniosku);

-- Index: public.id_wojewodztwo_path2_idx

-- DROP INDEX public.id_wojewodztwo_path2_idx;

CREATE INDEX id_wojewodztwo_path2_idx
  ON public.path2
  USING btree
  (wojewodztwo COLLATE pg_catalog."default");


-- Trigger: ustaw_dochod_bank on public.path2

-- DROP TRIGGER ustaw_dochod_bank ON public.path2;

CREATE TRIGGER ustaw_dochod_bank
  BEFORE INSERT OR UPDATE
  ON public.path2
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioskodawca_ustaw_dochod_bank();

