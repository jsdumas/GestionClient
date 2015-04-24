/*
INSERT IGNORE INTO User (login, password, enabled) VALUES ('user3', 'aa', true );
INSERT IGNORE INTO User (login, password, enabled) VALUES ('user4', 'aa', true );

DELETE FROM User_roles;


INSERT IGNORE INTO User_roles (User_login, roles) VALUES ('user3', 'ROLE_USER');

INSERT IGNORE INTO User_roles (User_login, roles) VALUES ('user3', 'ROLE_ADMIN');
INSERT IGNORE INTO User_roles (User_login, roles) VALUES ('user4', 'ROLE_ADMIN');

*/;