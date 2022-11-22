-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-22 14:30:12.424

-- tables
-- Table: account
CREATE TABLE account (
                         id serial  NOT NULL,
                         first_name varchar(255)  NOT NULL,
                         last_name varchar(255)  NOT NULL,
                         institution varchar(255)  NOT NULL,
                         phone int  NOT NULL,
                         CONSTRAINT account_pk PRIMARY KEY (id)
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
                       offer_name varchar(255)  NOT NULL,
                       address varchar(255)  NOT NULL,
                       city varchar(50)  NOT NULL,
                       price_per_student int  NOT NULL,
                       phone int  NOT NULL,
                       student_number_min int  NOT NULL,
                       student_number_max int  NOT NULL,
                       offer_description varchar(4096)  NOT NULL,
                       additional_info varchar(255)  NOT NULL,
                       photo bigint  NOT NULL,
                       time date  NOT NULL,
                       CONSTRAINT offer_pk PRIMARY KEY (id)
);

-- Table: offer_grade
CREATE TABLE offer_grade (
                             id serial  NOT NULL,
                             offer_id int  NOT NULL,
                             school_grade_id int  NOT NULL,
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
-- Reference: Table_8_offer (table: offer_grade)
ALTER TABLE offer_grade ADD CONSTRAINT Table_8_offer
    FOREIGN KEY (offer_id)
        REFERENCES offer (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: Table_8_school_grade (table: offer_grade)
ALTER TABLE offer_grade ADD CONSTRAINT Table_8_school_grade
    FOREIGN KEY (school_grade_id)
        REFERENCES grade (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: Table_9_offer (table: offer_subject)
ALTER TABLE offer_subject ADD CONSTRAINT Table_9_offer
    FOREIGN KEY (offer_id)
        REFERENCES offer (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: Table_9_subject (table: offer_subject)
ALTER TABLE offer_subject ADD CONSTRAINT Table_9_subject
    FOREIGN KEY (subject_id)
        REFERENCES subject (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

