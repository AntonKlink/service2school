INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Tallinn');
INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Tartu');
INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Narva');
INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Pärnu');
INSERT INTO public.city (id, name) VALUES (DEFAULT, 'Rakvere');

INSERT INTO public.grade (id, number) VALUES (DEFAULT, 1);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 2);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 3);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 4);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 5);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 6);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 7);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 8);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 9);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 10);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 11);
INSERT INTO public.grade (id, number) VALUES (DEFAULT, 12);

INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Matemaatika');
INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Ajalugu');
INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Keemia');
INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Eesti keel');
INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Füüsika');
INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Inglise keel');
INSERT INTO public.subject (id, name) VALUES (DEFAULT, 'Kirjandus');

INSERT INTO public."user" (id, email, password) VALUES (DEFAULT, 'valeria', '123');
INSERT INTO public."user" (id, email, password) VALUES (DEFAULT, 'kaupo', '321');
INSERT INTO public."user" (id, email, password) VALUES (DEFAULT, 'anton', '231');

INSERT INTO public.contact (id, first_name, last_name, phone, institution, user_id) VALUES (DEFAULT, 'Valeria', 'Lukasevits', '56458135', 'Narva linnus', 1);
INSERT INTO public.contact (id, first_name, last_name, phone, institution, user_id) VALUES (DEFAULT, 'Kaupo', 'Vaher', '55412375', 'Eesti Rahva Muuseum', 2);
INSERT INTO public.contact (id, first_name, last_name, phone, institution, user_id) VALUES (DEFAULT, 'Anton', 'Klink', '58467125', 'Videomängude muuseum', 3);

INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (DEFAULT, 1, 'Narva linnuse klastus', 'Narva ajalooga tutvustus', 8, 5, 15, 3, 'Peterburi mnt 2', 53459241, '2022-11-23', 'Ei soobi õpilastele rattastooliga');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (DEFAULT, 2, 'ERMi külastus', 'Eesti kultuuri ja ajalooga tutvumine', 10, 8, 25, 2, 'Muuseumi tee 2', 55412578, '2022-11-22', 'Sobib vaegnägijatele');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (DEFAULT, 3, 'Videomängude muuseumi külastus', 'Äge kogemus', 5, 3, 10, 1, 'Mere pst 1', 58459125, '2022-11-21', 'Ei soobi õpilastele epilepsiaga');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (DEFAULT, 2, 'ERMi külastus', 'Eesti kultuuri ja ajalooga tutvumine', 5, 3, 10, 1, 'Muuseumi tee 2', 55412578, '2022-11-30', 'Ei soobi õpilastele epilepsiaga');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (DEFAULT, 2, 'ERMi külastus', 'Eesti kultuuri ja ajalooga tutvumine', 5, 3, 10, 1, 'Muuseumi tee 2', 55412578, '2022-11-29', 'Sobib vaegnägijatele');
INSERT INTO public.offer (id, user_id, name, description, price_per_student, students_min, students_max, city_id, address, phone, date_add, additional_info) VALUES (DEFAULT, 2, 'ERMi külastus', 'Eesti kultuuri ja ajalooga tutvumine', 5, 3, 10, 1, 'Muuseumi tee 2', 55412578, '2022-11-26', 'Sobib vaegnägijatele');


INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (DEFAULT, 1, 4);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (DEFAULT, 2, 2);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (DEFAULT, 2, 4);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (DEFAULT, 3, 5);
INSERT INTO public.offer_subject (id, offer_id, subject_id) VALUES (DEFAULT, 3, 6);

INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (DEFAULT, 1, 8);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (DEFAULT, 1, 9);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (DEFAULT, 2, 10);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (DEFAULT, 2, 11);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (DEFAULT, 3, 3);
INSERT INTO public.offer_grade (id, offer_id, grade_id) VALUES (DEFAULT, 3, 4);
