--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2022-11-15 13:56:26

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3360 (class 1262 OID 16399)
-- Name: bd; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE bd WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Argentina.1252';


ALTER DATABASE bd OWNER TO postgres;

\connect bd

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3347 (class 0 OID 16400)
-- Dependencies: 214
-- Data for Name: cama; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cama (numero, estado, habitacion) FROM stdin;
5	Disponible	2
4	Disponible	2
9	Disponible	3
1	Ocupada	1
6	Disponible	2
8	Disponible	3
7	Disponible	3
\.


--
-- TOC entry 3349 (class 0 OID 16404)
-- Dependencies: 216
-- Data for Name: habitacion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.habitacion (numero, ubicacion) FROM stdin;
1	1
2	1
3	1
\.


--
-- TOC entry 3351 (class 0 OID 16408)
-- Dependencies: 218
-- Data for Name: internacion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.internacion (id, paciente, fecha, diagnostico, cama) FROM stdin;
1	Leonel Arguello	2022-02-22	Cumpleaños	1
\.


--
-- TOC entry 3353 (class 0 OID 16412)
-- Dependencies: 220
-- Data for Name: ubicacion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.ubicacion (id, nombre, hospital) FROM stdin;
1	Madre Teresa de Calcuta, Olta &, F5300 La Rioja	Dr Enrique Vera Barros
2	1 de Marzo, La Rioja\n	Hospital de la madre y el niño
3	Avda. Luis Vernet s/n, Av. Ortiz de Ocampo 1700, F5300 La Rioja	Virgen Maria de Fatima
\.


--
-- TOC entry 3365 (class 0 OID 0)
-- Dependencies: 215
-- Name: cama_numero_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cama_numero_seq', 1, false);


--
-- TOC entry 3366 (class 0 OID 0)
-- Dependencies: 217
-- Name: habitacion_numero_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.habitacion_numero_seq', 1, false);


--
-- TOC entry 3367 (class 0 OID 0)
-- Dependencies: 219
-- Name: internacion_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.internacion_id_seq', 4, true);


--
-- TOC entry 3368 (class 0 OID 0)
-- Dependencies: 221
-- Name: ubicacion_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ubicacion_id_seq', 1, false);


-- Completed on 2022-11-15 13:56:26

--
-- PostgreSQL database dump complete
--

