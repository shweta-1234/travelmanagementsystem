ALTER TABLE public.booking ADD CONSTRAINT fk5lnxjel3hostogmaaexhyrw0x FOREIGN KEY (customer_id)
                                   REFERENCES public.jhi_user (id) MATCH SIMPLE
                                   ON UPDATE NO ACTION
                                   ON DELETE NO ACTION;

ALTER TABLE public.feedback ADD CONSTRAINT fkcf0mb0brvmunrxi1b5brgv2ja FOREIGN KEY (customer_id)
                                        REFERENCES public.jhi_user (id) MATCH SIMPLE
                                        ON UPDATE NO ACTION
                                        ON DELETE NO ACTION;
