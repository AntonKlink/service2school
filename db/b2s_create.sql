-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-12-05 14:26:46.419
-- tables
-- Table: city
CREATE TABLE city (
                      id serial  NOT NULL,
                      name varchar(50)  NOT NULL,
                      CONSTRAINT city_pk PRIMARY KEY (id)
);

-- Table: contact
CREATE TABLE contact (
                         id serial  NOT NULL,
                         first_name varchar(255)  NOT NULL,
                         last_name varchar(255)  NOT NULL,
                         phone varchar(255)  NOT NULL,
                         institution varchar(255)  NOT NULL,
                         user_id int  NOT NULL,
                         CONSTRAINT contact_pk PRIMARY KEY (id)
);

-- Table: grade
CREATE TABLE grade (
                       id serial  NOT NULL,
                       number int  NOT NULL,
                       CONSTRAINT grade_pk PRIMARY KEY (id)
);

-- Table: offer
CREATE TABLE offer (
                       id serial  NOT NULL,
                       user_id int  NOT NULL,
                       name varchar(255)  NOT NULL,
                       description varchar(4096)  NOT NULL,
                       price_per_student int  NOT NULL,
                       students_min int  NOT NULL,
                       students_max int  NOT NULL,
                       city_id int  NOT NULL,
                       address varchar(255)  NOT NULL,
                       phone int  NOT NULL,
                       date_add date  NOT NULL DEFAULT NOW(),
                       additional_info varchar(255)  NULL,
                       picture bytea  NULL,
                       CONSTRAINT offer_pk PRIMARY KEY (id)
);

-- Table: offer_grade
CREATE TABLE offer_grade (
                             id serial  NOT NULL,
                             offer_id int  NOT NULL,
                             grade_id int  NOT NULL,
                             CONSTRAINT offer_grade_pk PRIMARY KEY (id)
);

-- Table: offer_subject
CREATE TABLE offer_subject (
                               id serial  NOT NULL,
                               offer_id int  NOT NULL,
                               subject_id int  NOT NULL,
                               CONSTRAINT offer_subject_pk PRIMARY KEY (id)
);

-- Table: subject
CREATE TABLE subject (
                         id serial  NOT NULL,
                         name varchar(50)  NOT NULL,
                         CONSTRAINT subject_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        email varchar(255)  NOT NULL,
                        password varchar(255)  NOT NULL,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);


-- foreign keys
-- Reference: contact_user (table: contact)
ALTER TABLE contact ADD CONSTRAINT contact_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: offer_city (table: offer)
ALTER TABLE offer ADD CONSTRAINT offer_city
    FOREIGN KEY (city_id)
        REFERENCES city (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: offer_grade_grade (table: offer_grade)
ALTER TABLE offer_grade ADD CONSTRAINT offer_grade_grade
    FOREIGN KEY (grade_id)
        REFERENCES grade (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: offer_grade_offer (table: offer_grade)
ALTER TABLE offer_grade ADD CONSTRAINT offer_grade_offer
    FOREIGN KEY (offer_id)
        REFERENCES offer (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: offer_subject_offer (table: offer_subject)
ALTER TABLE offer_subject ADD CONSTRAINT offer_subject_offer
    FOREIGN KEY (offer_id)
        REFERENCES offer (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: offer_subject_subject (table: offer_subject)
ALTER TABLE offer_subject ADD CONSTRAINT offer_subject_subject
    FOREIGN KEY (subject_id)
        REFERENCES subject (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: offer_user (table: offer)
ALTER TABLE offer ADD CONSTRAINT offer_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;