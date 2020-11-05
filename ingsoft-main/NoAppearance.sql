-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2020-10-29 20:42:00.52

-- tables
-- Table: Account_type

CREATE TABLE Account_type (
    account_type_id int NOT NULL AUTO_INCREMENT,
    type varchar(100) NOT NULL,
    price numeric(10,2) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT user_type_id PRIMARY KEY (account_type_id)
);

-- Table: Category
CREATE TABLE Category (
    category_id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT cathegory_id PRIMARY KEY (category_id)
);

-- Table: Chat
CREATE TABLE Chat (
    chat_id int NOT NULL AUTO_INCREMENT,
    profile1_id int NOT NULL,
    profile2_id int NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT chat_id PRIMARY KEY (chat_id)
);

-- Table: Match
CREATE TABLE `Match` (
    match_id int NOT NULL AUTO_INCREMENT,
    profile1_id int NOT NULL,
    profile2_id int NOT NULL,
    date_matches date NOT NULL,
    accepted bool NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    UNIQUE INDEX profile_one_id (profile1_id),
    UNIQUE INDEX profile_two_id (profile2_id),
    CONSTRAINT Match_pk PRIMARY KEY (match_id)
);

-- Table: Messages
CREATE TABLE Messages (
    message_id int NOT NULL AUTO_INCREMENT,
    chat_id int NOT NULL,
    date timestamp NOT NULL,
    content varchar(5000) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT chat_id PRIMARY KEY (message_id)
);

-- Table: Profile
CREATE TABLE Profile (
    profile_id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT Profile_pk PRIMARY KEY (profile_id)
);

-- Table: Profile_Subcategory
CREATE TABLE Profile_Subcategory (
    profile_sub_id int NOT NULL,
    profile_id int NOT NULL,
    subcategory_id int NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT Profile_Subcategory_pk PRIMARY KEY (profile_sub_id)
);

-- Table: Report
CREATE TABLE Report (
    report_id int NOT NULL AUTO_INCREMENT,
    chat_id int NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT user_id PRIMARY KEY (report_id)
) COMMENT 'Registered users in the app';

-- Table: Report_options
CREATE TABLE Report_options (
    report_op_id int NOT NULL AUTO_INCREMENT,
    report_id int NOT NULL,
    message_id int NOT NULL,
    description varchar(150) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT report_id PRIMARY KEY (report_op_id)
);

-- Table: Subcategory
CREATE TABLE Subcategory (
    subcategory_id int NOT NULL AUTO_INCREMENT,
    category_id int NOT NULL,
    name varchar(100) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT cathegory_id PRIMARY KEY (subcategory_id)
);

-- Table: User
CREATE TABLE User (
    user_id int NOT NULL AUTO_INCREMENT,
    account_type_id int NOT NULL,
    user_type_id int NOT NULL,
    name varchar(100) NOT NULL,
    surname varchar(100) NOT NULL,
    birthdate date NOT NULL,
    gender bool NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    user_photo varchar(255) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT user_id PRIMARY KEY (user_id)
) COMMENT 'Registered users in the app';

-- Table: User_type
CREATE TABLE User_type (
    user_type_id int NOT NULL AUTO_INCREMENT,
    type varchar(100) NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT user_type_id PRIMARY KEY (user_type_id)
);

-- Table: h_user
CREATE TABLE h_user (
    h_user_id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    surname varchar(100) NOT NULL,
    birthdate date NOT NULL,
    gender bool NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    user_photo varchar(255) NOT NULL,
    account_type_id int NOT NULL,
    user_type_id int NOT NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT user_id PRIMARY KEY (h_user_id)
) COMMENT 'Registered users in the app';

-- Table: photos
CREATE TABLE photos (
    photos_id int NOT NULL,
    category_id int NOT NULL,
    photo_path varchar(200) NULL,
    status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_user int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT photos_pk PRIMARY KEY (photos_id)
);

-- foreign keys
-- Reference: Chat_Profile_1 (table: Chat)
ALTER TABLE Chat ADD CONSTRAINT Chat_Profile_1 FOREIGN KEY Chat_Profile_1 (profile1_id)
    REFERENCES Profile (profile_id);

-- Reference: Chat_Profile_2 (table: Chat)
ALTER TABLE Chat ADD CONSTRAINT Chat_Profile_2 FOREIGN KEY Chat_Profile_2 (profile2_id)
    REFERENCES Profile (profile_id);

-- Reference: Log_match_Profile1 (table: Match)
ALTER TABLE `Match` ADD CONSTRAINT Log_match_Profile1 FOREIGN KEY Log_match_Profile1 (profile2_id)
    REFERENCES Profile (profile_id);

-- Reference: Match_Profile (table: Match)
ALTER TABLE `Match` ADD CONSTRAINT Match_Profile FOREIGN KEY Match_Profile (profile1_id)
    REFERENCES Profile (profile_id);

-- Reference: Messages_Chat (table: Messages)
ALTER TABLE Messages ADD CONSTRAINT Messages_Chat FOREIGN KEY Messages_Chat (chat_id)
    REFERENCES Chat (chat_id);

-- Reference: Profile_Subcategory_Profile (table: Profile_Subcategory)
ALTER TABLE Profile_Subcategory ADD CONSTRAINT Profile_Subcategory_Profile FOREIGN KEY Profile_Subcategory_Profile (profile_id)
    REFERENCES Profile (profile_id);

-- Reference: Profile_Subcategory_Subcategory (table: Profile_Subcategory)
ALTER TABLE Profile_Subcategory ADD CONSTRAINT Profile_Subcategory_Subcategory FOREIGN KEY Profile_Subcategory_Subcategory (subcategory_id)
    REFERENCES Subcategory (subcategory_id);

-- Reference: Profile_User (table: Profile)
ALTER TABLE Profile ADD CONSTRAINT Profile_User FOREIGN KEY Profile_User (user_id)
    REFERENCES User (user_id);

-- Reference: Report_Chat (table: Report)
ALTER TABLE Report ADD CONSTRAINT Report_Chat FOREIGN KEY Report_Chat (chat_id)
    REFERENCES Chat (chat_id);

-- Reference: Report_options_Messages (table: Report_options)
ALTER TABLE Report_options ADD CONSTRAINT Report_options_Messages FOREIGN KEY Report_options_Messages (message_id)
    REFERENCES Messages (message_id);

-- Reference: Report_options_Report (table: Report_options)
ALTER TABLE Report_options ADD CONSTRAINT Report_options_Report FOREIGN KEY Report_options_Report (report_id)
    REFERENCES Report (report_id);

-- Reference: Subcategory_Category (table: Subcategory)
ALTER TABLE Subcategory ADD CONSTRAINT Subcategory_Category FOREIGN KEY Subcategory_Category (category_id)
    REFERENCES Category (category_id);

-- Reference: User_Account_type (table: User)
ALTER TABLE User ADD CONSTRAINT User_Account_type FOREIGN KEY User_Account_type (account_type_id)
    REFERENCES Account_type (account_type_id);

-- Reference: User_User_type (table: User)
ALTER TABLE User ADD CONSTRAINT User_User_type FOREIGN KEY User_User_type (user_type_id)
    REFERENCES User_type (user_type_id);

-- Reference: photos_Category (table: photos)
ALTER TABLE photos ADD CONSTRAINT photos_Category FOREIGN KEY photos_Category (category_id)
    REFERENCES Category (category_id);

-- End of file.

insert into user_type values
(null,1,1,1,'192.168.1.65',11,now(),curdate()),
(null,2,1,1,'192.168.1.65',11,now(),curdate());

insert into account_type values
(null,1,0,1,1,'192.168.1.68',12,now(),curdate()),
(null,2,5,1,1,'192.168.1.68',12,now(),curdate());

insert into user values
(null,1,1,'Jose','Chura','1998-10-10',0,'jc@gmail.com','12345','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,2,1,'Andres','Roque','1997-9-3',0,'ar@gmail.com','48944','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,1,'Manuel','Melez','1996-8-4',0,'mmg@gmail.com','ewa456','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,2,1,'Sophia','Rich','1995-7-5',0,'sr@gmail.com','fas489','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,1,'Rene','Menji','1994-6-11',0,'rm@gmail.com','ee1264','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,2,1,'Alejandra','Savedra','2000-5-9',0,'as@gmail.com','das451','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,1,'Maria','Avaroa','2001-10-5',0,'ma@gmail.com','vcx56','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,2,1,'Jhon','Perez','1998-9-4',0,'jps@gmail.com','vdsvds44','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,1,'Ibonne','Chon','1998-11-3',0,'df@gmail.com','bea56','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,2,1,'Tania','Dumphy','1997-10-2',0,'jtdg@gmail.com','feacs55','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,2,'Ignacio','Jaen','1996-1-1',0,'ignajaen@gmail.com','sacvasv99','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,2,'Marioly','Vargas','1990-2-12',0,'mollyv@gmail.com','vasvas54','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,2,'Rodrigo','Saravia','1980-3-11',0,'rodriSa@gmail.com','12sfs345','URL',1,1,'192.168.15.25',13,now(),curdate()),
(null,1,2,'Ximena','Cruz','1988-4-5',0,'ximenaC@gmail.com','mbrewq48','URL',1,1,'192.168.15.25',13,now(),curdate());







INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Peliculas', '1', '1','192.168.15.25',11,now(),curdate());
INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Series', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Deportes', '0', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Musica', '1', '1',  '192.168.15.25',11,now(),curdate());
INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Deportes Extremos', '0', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Gastronomia', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, 'Filosofia', '1', '1', '192.168.15.25',11,now(),curdate());



INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '1', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '2', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '3', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '4', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '5', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '6', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '7', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '8', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '9', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES (null, '10', '1', '1','192.168.15.25',11,now(),curdate());


INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('1', '1', 'Terror', '1', '1','192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('2', '2', 'Familiares', '1', '1','192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('3', '3', 'Futbol', '1', '1',  '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('4', '4', 'Rock', '1', '1',  '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('5', '5', 'Parkour', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('6', '6', 'Italiana', '1', '1',  '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('7', '7', 'Dante', '1', '1',  '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('8', '1', 'Comedia', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('9', '2', 'Juveniles', '1', '1', '192.168.15.25',11,now(),curdate());
INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`,`tx_date`, `tx_update`) VALUES ('10', '3', 'Basquet', '1', '1',  '192.168.15.25',11,now(),curdate());

insert into `match` values
(null,1,10,now(),TRUE,1,2,'192.168.31.148',12,now(),now()),
(null,2,9,now(),TRUE,1,2,'192.168.31.148',12,now(),now()),
(null,3,8,now(),FALSE,1,2,'192.168.31.148',12,now(),now()),
(null,4,7,now(),TRUE,1,2,'192.168.31.148',12,now(),now()),
(null,5,6,now(),TRUE,1,2,'192.168.31.148',12,now(),now()),
(null,6,5,now(),FALSE,1,2,'192.168.31.148',12,now(),now()),
(null,7,4,now(),TRUE,1,2,'192.168.31.148',12,now(),now()),
(null,8,3,now(),FALSE,1,2,'192.168.31.148',12,now(),now()),
(null,9,2,now(),FALSE,1,2,'192.168.31.148',12,now(),now()),
(null,10,1,now(),TRUE,1,2,'192.168.31.148',12,now(),now());


INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('1', '1', '1', '1', '10','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('2', '2', '2', '1', '9','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('3', '3', '3', '1',  '8','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('4', '4', '4', '1',  '7','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('5', '5', '5', '1', '6','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('6', '6', '6', '1',  '5','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('7', '7', '7', '1',  '4','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('8', '8', '8', '1',  '3','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('9', '9', '9', '1', '2','192.168.15.25',11,now(),curdate());
INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('10', '10', '10', '1', '1','192.168.15.25',11,now(),curdate());



insert into chat values
(null,1,2,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,3,2,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,2,5,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,3,10,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,8,9,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,8,5,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,7,2,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,8,7,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,1,6,1,1,'192.168.31.148',12,now(),CURDATE()),
(null,4,3,1,1,'192.168.31.148',12,now(),CURDATE());

insert into messages values
(null,1,now(),"Hello, how are you?",1,1,'192.168.31.148',12,now(),now()),
(null,2,now(),"Hi!",1,1,'192.168.31.148',12,now(),now()),
(null,10,now(),"What about you?",1,1,'192.168.31.148',12,now(),now()),
(null,8,now(),"Maybe",1,1,'192.168.31.148',12,now(),now()),
(null,9,now(),"See you then",1,1,'192.168.31.148',12,now(),now()),
(null,2,now(),"What are you doing?",1,1,'192.168.31.148',12,now(),now()),
(null,3,now(),"Tomorrow",1,1,'192.168.31.148',12,now(),now()),
(null,1,now(),"I am fine, thanks",1,1,'192.168.31.148',12,now(),now()),
(null,7,now(),"No, sorry",1,1,'192.168.31.148',12,now(),now()),
(null,6,now(),"At 7 pm",1,1,'192.168.31.148',12,now(),now());

INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('1', '1','1','13', '192.168.1.1', '1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('2', '5', '0','11', '192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`,  `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('3', '6', '1','14','192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('4', '8', '0', '14','192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('5', '9', '1', '11','192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('6','10', '0','14','192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('7', '1', '1', '12','192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('8','3',  '0','11', '192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('9', '2', '1', '12','192.168.1.1','1', '1', '3');
INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('10', '4', '0','14','192.168.1.1','1','1', '3');

INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('1', '1','5','5','1','13', '192.168.1.1', '1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('2', '5', '6','4','0','11', '192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('3', '6', '4','7','1','14','192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('4', '8','2','6', '0', '14','192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('5', '9','3','3', '1', '11','192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('6','10','8','1', '0','14','192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('7', '1', '6','2','1', '12','192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('8','3','7','6', '0','11', '192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('9', '2', '4','7','1', '12','192.168.1.1','1', '1', '3');
INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES ('10', '4', '2','5','0','14','192.168.1.1','1','1', '3');

INSERT INTO `photos` (`photos_id`, `category_id`, `photo_path`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '13', 1, '0000-00-00 00:00:00', '0000-00-00'),
(2, 5, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '11', 1, '0000-00-00 00:00:00', '0000-00-00'),
(3, 6, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '14', 1, '0000-00-00 00:00:00', '0000-00-00'),
(4, 7, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '14', 1, '0000-00-00 00:00:00', '0000-00-00'),
(5, 4, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '11', 1, '0000-00-00 00:00:00', '0000-00-00'),
(6, 5, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '14', 1, '0000-00-00 00:00:00', '0000-00-00'),
(7, 1, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '12', 1, '0000-00-00 00:00:00', '0000-00-00'),
(8, 3, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '11', 1, '0000-00-00 00:00:00', '0000-00-00'),
(9, 2, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '12', 1, '0000-00-00 00:00:00', '0000-00-00'),
(10, 4, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '14', 1, '0000-00-00 00:00:00', '0000-00-00');

account_type

select * from user_type;
select * from account_type;
select * from user;
select * from profile;
select * from `match`;
select * from photos;
select * from subcategory;
select * from profile_subcategory;
select * from chat;
select * from messages;
select * from report;
select * from report_options;
