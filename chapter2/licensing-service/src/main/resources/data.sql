-- Persons
INSERT INTO person (id, name, major, dept, date_of_birth, phone, email)
VALUES (1, 'Benjamin Feuerborn', 'Software Engineering', 'Electrical and Computer Engineering', '2004-08-03', '516-2883', 'bfeuerborn@arizona.edu');

INSERT INTO person (id, name, major, dept, date_of_birth, phone, email)
VALUES (2, 'Kanon Church', 'Aerospace Engineering', 'Aerospace and Mechanical Engineering', '2004-10-02', '824-3222', 'kanonchurch@arizona.edu');

INSERT INTO person (id, name, major, dept, date_of_birth, phone, email)
VALUES (3, 'Finn Gerber', 'Systems Engineering', 'Systems and Industrial Engineering', '2004-01-27', '354-2167', 'fgerber@arizona.edu');

-- Organizations
INSERT INTO organization (id, name, category, established_date, president_id)
VALUES (1, 'Club Soccer', 'SPORTS', '2024-09-02', 1);

INSERT INTO organization (id, name, category, established_date, president_id)
VALUES (2, 'Baja Wildcat Racing Club', 'SPORTS', '2000-01-01', 3);

-- Memberships
INSERT INTO organization_members (organization_id, person_id) VALUES (1,1);
INSERT INTO organization_members (organization_id, person_id) VALUES (1,2);
INSERT INTO organization_members (organization_id, person_id) VALUES (2,2);
INSERT INTO organization_members (organization_id, person_id) VALUES (2,3);