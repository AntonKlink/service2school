INSERT INTO public."user" (id, email, password) VALUES (1, 'valeria@mail.ee', '123');
INSERT INTO public."user" (id, email, password) VALUES (2, 'kaupo@mail.ee', '321');
INSERT INTO public."user" (id, email, password) VALUES (3, 'anton@mail.ee', '231');

INSERT INTO public.account (id, first_name, last_name, institution, phone)VALUES (1, 'Valeria', 'Lukasevits', 'Lennusadam', 5561248);
INSERT INTO public.account (id, first_name, last_name, institution, phone)VALUES (2, 'Kaupo', 'Vaher', 'Energia Avastuskeskus', 5561249);
INSERT INTO public.account (id, first_name, last_name, institution, phone)VALUES (3, 'Anton', 'Klink', 'Lauamängude muuseum', 5561240);

INSERT INTO public.offer (id, offer_name, address, city, price_per_student, phone, student_number_min, student_number_max, offer_description, additional_info, photo, time) VALUES (1, 'Ekskursioon Lennusadamas', 'Vesilennuki 6', 'Tallinn', 10, 56123485, 5, 10, 'Tutvumine Lennusadama eksponaatidega', 'Sobib ka rattastoolis õpilastele', 100, '2022-11-16');


INSERT INTO public.grade (id, number) VALUES (1, 1);
INSERT INTO public.grade (id, number) VALUES (2, 2);
INSERT INTO public.grade (id, number) VALUES (3, 3);
INSERT INTO public.grade (id, number) VALUES (4, 4);
INSERT INTO public.grade (id, number) VALUES (5, 5);
INSERT INTO public.grade (id, number) VALUES (6, 6);
INSERT INTO public.grade (id, number) VALUES (7, 7);
INSERT INTO public.grade (id, number) VALUES (8, 8);
INSERT INTO public.grade (id, number) VALUES (9, 9);
INSERT INTO public.grade (id, number) VALUES (10, 10);
INSERT INTO public.grade (id, number) VALUES (11, 11);
INSERT INTO public.grade (id, number) VALUES (12, 12);


INSERT INTO public.subject (id, name) VALUES (1, 'Matemaatika');
INSERT INTO public.subject (id, name) VALUES (2, 'Ajalugu');
INSERT INTO public.subject (id, name) VALUES (3, 'Eesti keel');
INSERT INTO public.subject (id, name) VALUES (4, 'Bioloogia');
INSERT INTO public.subject (id, name) VALUES (5, 'Keemia');
INSERT INTO public.subject (id, name) VALUES (6, 'Füüsika');
INSERT INTO public.subject (id, name) VALUES (7, 'Inglise keel');
INSERT INTO public.subject (id, name) VALUES (8, 'Vene keel');


INSERT INTO public.offer (id, offer_name, address, city, price_per_student, phone, student_number_min, student_number_max, offer_description, additional_info, photo, time) VALUES (2, 'ERMi külastus', 'Muuseumi tee 2', 'Tartu', 12, 53125464, 6, 15, 'Tutvume Eesti ajalooga', 'Sobib ka vaegnägijatele', 300, '2022-11-12');
INSERT INTO public.offer (id, offer_name, address, city, price_per_student, phone, student_number_min, student_number_max, offer_description, additional_info, photo, time) VALUES (3, 'Ilon Wiklandi muuseumi külastus', 'Kooli 5', 'Haapsalu', 7, 53327332, 2, 12, 'Ilon Wiklandi kunstniku elulugu ', 'Joonistamine kohapeal', 400, '2022-11-01');
