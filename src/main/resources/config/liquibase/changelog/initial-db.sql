CREATE TABLE IF NOT EXISTS public.booking
(
    id bigint NOT NULL,
    destination_city character varying(255) COLLATE pg_catalog."default",
    booking_date date,
    source_city character varying(255) COLLATE pg_catalog."default",
    travel_vehicle character varying(255) COLLATE pg_catalog."default",
    customer_id bigint,
    CONSTRAINT booking_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.city
(
    id bigint NOT NULL DEFAULT nextval('city_id_seq'::regclass),
    city_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT city_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.feedback
(
    id bigint NOT NULL,
    customer_feedback character varying(255) COLLATE pg_catalog."default",
    customer_rating character varying(255) COLLATE pg_catalog."default",
    submitted_date date,
    customer_id bigint,
    CONSTRAINT feedback_pkey PRIMARY KEY (id)
);
