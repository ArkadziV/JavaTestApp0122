-- DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  employee_id SERIAL PRIMARY KEY,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  department_id int DEFAULT NULL,
  job_title varchar(100) DEFAULT NULL,
  gender varchar(10) DEFAULT NULL,
  date_of_birth date DEFAULT NULL
  );

INSERT INTO employee (first_name, last_name, department_id, job_title, gender, date_of_birth)
VALUES
('John', 'Doe', 11, 'Cleaner', 'male', '12.02.1998'),
('Jane', 'Doe', 22, 'Baker', 'female', '08.06.1997'),
('Alex', 'Smith', 33, 'Tailor', 'male', '08.01.1995');