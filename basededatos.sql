PGDMP     #    /            
    z            bd    15.1    15.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                        1262    16399    bd    DATABASE     y   CREATE DATABASE bd WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Argentina.1252';
    DROP DATABASE bd;
                postgres    false                      0    16400    cama 
   TABLE DATA           :   COPY public.cama (numero, estado, habitacion) FROM stdin;
    public          postgres    false    214   �	                 0    16404 
   habitacion 
   TABLE DATA           7   COPY public.habitacion (numero, ubicacion) FROM stdin;
    public          postgres    false    216   �	                 0    16408    internacion 
   TABLE DATA           M   COPY public.internacion (id, paciente, fecha, diagnostico, cama) FROM stdin;
    public          postgres    false    218   
                 0    16412 	   ubicacion 
   TABLE DATA           9   COPY public.ubicacion (id, nombre, hospital) FROM stdin;
    public          postgres    false    220   [
       %           0    0    cama_numero_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.cama_numero_seq', 1, false);
          public          postgres    false    215            &           0    0    habitacion_numero_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.habitacion_numero_seq', 1, false);
          public          postgres    false    217            '           0    0    internacion_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.internacion_id_seq', 4, true);
          public          postgres    false    219            (           0    0    ubicacion_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.ubicacion_id_seq', 1, false);
          public          postgres    false    221               @   x�3�t�,.���L�I�4�2B�r���Z"s��9��KS�*�Q5��j�@�h�ʍ���� !�(I            x�3�4�2bc ����� (         2   x�3��I��K�Qp,J/M����4202�50�52�t/�,H�4����� �
�         �   x�e�=j�@���S�ʕP$����.l!�r3X��ڵgW�V>C.VE����{�6G���ʑ�3���c��K�E��{SU8�$\�l[�r+�TC�KS���t
ş���>ě$rYu�a�=�^~^�6f���a��='�7_`�(�j�)'�3������-�D/�3Z�;J2�=���_��E�     