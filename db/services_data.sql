INSERT INTO public.city (id, name) VALUES (1, 'Tallinn');
INSERT INTO public.city (id, name) VALUES (2, 'Tartu');
INSERT INTO public.city (id, name) VALUES (3, 'Narva');
INSERT INTO public.city (id, name) VALUES (4, 'Pärnu');
INSERT INTO public.city (id, name) VALUES (5, 'Rakvere');

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
INSERT INTO public.subject (id, name) VALUES (3, 'Keemia');
INSERT INTO public.subject (id, name) VALUES (4, 'Eesti keel');
INSERT INTO public.subject (id, name) VALUES (5, 'Füüsika');
INSERT INTO public.subject (id, name) VALUES (6, 'Inglise keel');
INSERT INTO public.subject (id, name) VALUES (7, 'Kirjandus');

INSERT INTO public."user" (id, email, password) VALUES (1, 'valeria@mail.ee', '123');
INSERT INTO public."user" (id, email, password) VALUES (2, 'kaupo@mail.ee', '321');
INSERT INTO public."user" (id, email, password) VALUES (3, 'anton@mail.ee', '231');

INSERT INTO public.contact (id, first_name, last_name, phone, institution, user_id) VALUES (1, 'Valeria', 'Lukasevits', '56458135', 'Narva linnus', 1);
INSERT INTO public.contact (id, first_name, last_name, phone, institution, user_id) VALUES (2, 'Kaupo', 'Vaher', '55412375', 'Eesti Rahva Muuseum', 2);
INSERT INTO public.contact (id, first_name, last_name, phone, institution, user_id) VALUES (3, 'Anton', 'Klink', '58467125', 'Videomängude muuseum', 3);

INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (1, 1, 'Narva linnuse klastus', 'Narva ajalooga tutvustus', 8, 5, 15, 3, 'Peterburi mnt 2', 53459241, '2022-11-23', 'Ei soobi õpilastele rattastooliga');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (2, 2, 'ERMi külastus', 'Eesti kultuuri ja ajalooga tutvumine', 10, 8, 25, 2, 'Muuseumi tee 2', 55412578, '2022-11-22', 'Sobib vaegnägijatele');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (3, 3, 'Videomängude muuseumi külastus', 'Interaktiivne kogemus', 5, 3, 10, 1, 'Mere pst 1', 58459125, '2022-11-21', 'Ei soobi õpilastele epilepsiaga');

INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (1, 1, 2);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (2, 1, 4);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (3, 2, 2);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (4, 2, 4);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (5, 3, 5);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (6, 3, 6);

INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (1, 1, 8);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (2, 1, 9);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (3, 2, 10);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (4, 2, 11);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (5, 3, 3);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (6, 3, 4);
