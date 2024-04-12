-- INSERT INTO user_tb(username,password,fullname,created_at) VALUES ('Minsu','1234','Kenneth-Minsu-Kim',now());
-- INSERT INTO user_tb(username,password,fullname,created_at) VALUES ('Yongju','1234','Danny-Yongju-Lee',now());
-- INSERT INTO user_tb(username,password,fullname,created_at) VALUES ('Jaehyung','1234',' Jeong-Jaehyung',now());
--
-- INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (1,1111,'1234',6001,true,now());
-- INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (1,2222,'1234',8002,true,now());
-- INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (2,3333,'1234',10003,true,now());
-- INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (2,4444,'1234',12004,true,now());
-- INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (3,5555,'1234',14005,true,now());
--
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,2,9001,11002,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,3,8001,11003,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,4,7001,11004,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,5,6001,11005,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (2,3,10002,12003,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (2,4,9002,12004,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (2,5,8002,12005,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (3,4,11003,13004,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (3,5,10003,13005,1000,now());
-- INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (4,5,12004,14005,1000,now());

insert into user_tb(username,password,fullname,created_at) values ('ssar','1234','홍길동',now());
insert into user_tb(username,password,fullname,created_at) values ('cos','1234','임꺽정',now());
insert into user_tb(username,password,fullname,created_at) values ('love','1234','이순신',now());

insert into account_tb(user_id,number,password,balance,status,created_at) values (1,1111,'1234',500,true,now());
insert into account_tb(user_id,number,password,balance,status,created_at) values (2,2222,'1234',1000,true,now());
insert into account_tb(user_id,number,password,balance,status,created_at) values (3,3333,'1234',1400,true,now());
insert into account_tb(user_id,number,password,balance,status,created_at) values (1,4444,'1234',1000,true,now());
insert into account_tb(user_id,number,password,balance,status,created_at) values (2,5555,'1234',1100,true,now());

insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (1,2,100,900,1100,now());
insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (1,3,100,800,1100,now());
insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (1,4,100,700,1100,now());
insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (1,5,100,600,1100,now());
insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (2,3,100,1000,1200,now());
insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (4,3,100,1000,1300,now());
insert into history_tb(sender_id,receiver_id,amount, sender_balance,receiver_balance,created_at)
values (1,3,100,500,1400,now());