CREATE TABLE contact
(
    id    int PRIMARY KEY AUTO_INCREMENT,
    name  varchar(100) NOT NULL,
    email varchar(100) NOT NULL
);

CREATE TABLE phone
(
    id         int PRIMARY KEY AUTO_INCREMENT,
    contact_id int          NOT NULL,
    numero     varchar(100) NOT NULL,
    FOREIGN KEY (contact_id) REFERENCES contact (id)
);