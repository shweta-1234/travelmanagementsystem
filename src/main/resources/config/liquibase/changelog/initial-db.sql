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
    id bigint NOT NULL,
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

CREATE TABLE IF NOT EXISTS public.aadhaar_card
(
    id bigint NOT NULL,
    image bytea,
    image_name character varying(255) COLLATE pg_catalog."default",
    image_url character varying(255) COLLATE pg_catalog."default",
    is_accepted boolean,
    CONSTRAINT aadhaar_card_pkey PRIMARY KEY (id)
);
