-- Table: public.wnioski

-- DROP TABLE public.wnioski;

CREATE TABLE public.wnioski
(
  id integer NOT NULL DEFAULT nextval(('wnioski_id_seq1'::text)::regclass),
  sid text,
  "timestamp" timestamp without time zone DEFAULT now(),
  kwota_kredytu numeric DEFAULT 0.00,
  ilosc_rat integer DEFAULT 0,
  opis_wniosku text,
  wnioskodawca integer,
  handlowiec integer,
  status_wniosku integer DEFAULT 1,
  uwagi_admin text,
  rodzaj_wniosku integer,
  index text,
  s_manager_prowizja text,
  manager integer,
  s_manager integer,
  status integer DEFAULT 10,
  status_99_user integer,
  status_99_timestamp timestamp without time zone,
  prowizja_agent_kwota text DEFAULT 0.00,
  prowizja_agent integer DEFAULT '-998'::integer,
  manager_prowizja text,
  prowizja_agent_procent text DEFAULT 0.00,
  bank integer DEFAULT '-1000'::integer,
  uwagi_agent text,
  wnioskodawca_2 integer,
  wspolkredytobiorca integer,
  wspolkredytobiorca_2 integer,
  poreczyciel integer,
  poreczyciel_2 integer,
  kwota_kredytu_wniosek numeric,
  ilosc_rat_wniosek integer,
  data_uruchomienia date,
  edit_user integer,
  edit_timestamp timestamp without time zone,
  create_ip text,
  edit_ip text,
  waluta integer DEFAULT 4,
  wnioskodawca_3 integer,
  zabezpieczajacy integer,
  zabezpieczajacy_2 integer,
  http_referer text,
  ogolny_zysk_efauto numeric DEFAULT 0.00,
  worker_id integer,
  prowizja_agent_podwyzka_oproc text,
  prowizja_agent_prowizja_banku text,
  prowizja_agent_ubezpieczenie text,
  edit_login_id integer,
  przegladarka text,
  os_system text,
  new_interface_1 integer DEFAULT 1,
  data_wyslania_pisma text,
  salon_komis integer,
  dzien_miesiaca_zobowiazanie integer,
  data_splaty_1_raty text,
  oczekiwane_wynagrodzenie_pko_id integer,
  pko_kwota_brutto double precision,
  pko_skladka_ubezpieczeniowa double precision,
  pko_data_zawarcia_umowy_kredytu text,
  pko_posrednictwo_finansowe_kwota text,
  pko_data_umowy text,
  pko_nr_umowy text,
  pko_ror_rodzaj integer,
  pko_ror text,
  firma_witczak integer,
  komentarz_do_wniosku_z_kontaktu text,
  gap_data_umowy text,
  gap_data_pierwszej_raty text,
  gap_acoc_ror text,
  gap_acoc_ror_wlasc text,
  gap_got_inne_potrzeby_kredytobiorcy numeric(10,2),
  gap_got_ubezpieczenie_na_zycie numeric(10,2),
  gap_got_prowizja_banku numeric(10,2),
  gap_got_zwyzka_przedstawiciela numeric(10,2),
  gap_got_inne_potrzeby_kredytobiorcy_kwota numeric(10,2),
  gap_got_ubezpieczenie_na_zycie_kwota numeric(10,2),
  gap_got_prowizja_banku_kwota numeric(10,2),
  gap_got_zwyzka_przedstawiciela_kwota numeric(10,2),
  gap_szac_koszt_ac numeric(10,2) DEFAULT 0,
  gap_appn_id integer,
  gap_odstepstwa_od_prcd text,
  gap_rata numeric(10,2),
  gap_kwota_kredytu numeric(10,2),
  gap_status text,
  gap_status_opis text,
  gap_uwagi text,
  gap_send_timestamp timestamp without time zone,
  pko_prowizja_banku numeric(10,2),
  pko_umowa_path text,
  pko_umowa_nazwa_pliku text,
  gotowka_zabezp_poj integer,
  kwota_kredytu_brutto numeric,
  prowizja_manager_kwota numeric(10,2) DEFAULT 0,
  prowizja_smanager_kwota numeric(10,2) DEFAULT 0,
  ostateczna_kwota_raty numeric(10,2),
  ostatecznie_ubezpieczenie boolean,
  zezwol_agentowi_na_edycje_danych_pojazdu boolean,
  pko_kwota_brutto_efauto numeric,
  cel_pozyczki text,
  status_zlozono_timestamp timestamp without time zone,
  data_umowy text,
  nr_umowy text,
  cel_pozyczki_wybor integer,
  CONSTRAINT wnioski_id__pkey PRIMARY KEY (id),
  CONSTRAINT oczekiwane_wynagrodzenie_pko_fk FOREIGN KEY (oczekiwane_wynagrodzenie_pko_id)
      REFERENCES public.oczekiwane_wynagrodzenie_pko (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT status_wniosku FOREIGN KEY (status_wniosku)
      REFERENCES public.status_wniosku (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE public.wnioski
  OWNER TO postgres;

-- Index: public.handlowiec_idx

-- DROP INDEX public.handlowiec_idx;

CREATE INDEX handlowiec_idx
  ON public.wnioski
  USING btree
  (handlowiec);

-- Index: public.index_idx

-- DROP INDEX public.index_idx;

CREATE INDEX index_idx
  ON public.wnioski
  USING btree
  (index COLLATE pg_catalog."default");

-- Index: public.manager_idx

-- DROP INDEX public.manager_idx;

CREATE INDEX manager_idx
  ON public.wnioski
  USING btree
  (manager);

-- Index: public.s_manager_idx

-- DROP INDEX public.s_manager_idx;

CREATE INDEX s_manager_idx
  ON public.wnioski
  USING btree
  (s_manager);

-- Index: public.status_wniosku__idx

-- DROP INDEX public.status_wniosku__idx;

CREATE INDEX status_wniosku__idx
  ON public.wnioski
  USING btree
  (status_wniosku);

-- Index: public.wnioski_bank

-- DROP INDEX public.wnioski_bank;

CREATE INDEX wnioski_bank
  ON public.wnioski
  USING btree
  (bank);

-- Index: public.worker_idx

-- DROP INDEX public.worker_idx;

CREATE INDEX worker_idx
  ON public.wnioski
  USING btree
  (worker_id);


-- Trigger: historia on public.wnioski

-- DROP TRIGGER historia ON public.wnioski;

CREATE TRIGGER historia
  BEFORE UPDATE
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.historia_statusow();

-- Trigger: set_index on public.wnioski

-- DROP TRIGGER set_index ON public.wnioski;

CREATE TRIGGER set_index
  BEFORE INSERT OR UPDATE
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioski_generate_idnex();

-- Trigger: set_prowizje_managerow on public.wnioski

-- DROP TRIGGER set_prowizje_managerow ON public.wnioski;

CREATE TRIGGER set_prowizje_managerow
  BEFORE INSERT
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.wnioski_ustaw_prowizje_managerow();

-- Trigger: ustaw_firma_witczak on public.wnioski

-- DROP TRIGGER ustaw_firma_witczak ON public.wnioski;

CREATE TRIGGER ustaw_firma_witczak
  BEFORE UPDATE
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.ustaw_firma_witczak();

-- Trigger: ustaw_kwote_i_raty_wnioskowane on public.wnioski

-- DROP TRIGGER ustaw_kwote_i_raty_wnioskowane ON public.wnioski;

CREATE TRIGGER ustaw_kwote_i_raty_wnioskowane
  BEFORE INSERT
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.ustaw_kwote_i_rat_wnioskowane();

-- Trigger: ustaw_wnioski_status_zlozono_timestamp on public.wnioski

-- DROP TRIGGER ustaw_wnioski_status_zlozono_timestamp ON public.wnioski;

CREATE TRIGGER ustaw_wnioski_status_zlozono_timestamp
  BEFORE UPDATE
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.ustaw_wnioski_status_zlozono_timestamp();

-- Trigger: wnioski_insert_status on public.wnioski

-- DROP TRIGGER wnioski_insert_status ON public.wnioski;

CREATE TRIGGER wnioski_insert_status
  AFTER INSERT
  ON public.wnioski
  FOR EACH ROW
  EXECUTE PROCEDURE public.insert_status();

