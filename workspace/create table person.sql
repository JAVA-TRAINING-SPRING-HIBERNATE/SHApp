CREATE TABLE PERSON(
id NUMBER(11) NOT NULL,
NAME VARCHAR2(20) NOT NULL,
COUNTRY VARCHAR2(20),
CONSTRAINT person_pk PRIMARY KEY (id)
);
commit;