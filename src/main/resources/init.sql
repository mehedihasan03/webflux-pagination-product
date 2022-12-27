CREATE TABLE public.product (
                                id serial4 NOT NULL,
                                description varchar NOT NULL,
                                price int4 NOT NULL,
                                CONSTRAINT product_pk PRIMARY KEY (id)
);