INSERT INTO user_tb(username,password,fullname,created_at) VALUES ('Minsu','1234','KennethMinsuKim',now());
INSERT INTO user_tb(username,password,fullname,created_at) VALUES ('Yongju','1234','DannyYongjuLee',now());
INSERT INTO user_tb(username,password,fullname,created_at) VALUES ('Jaehyung','1234',' JeongJaehyung',now());

INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (1,1111,'1234',10001,true,now());
INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (1,2222,'1234',10002,true,now());
INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (2,3333,'1234',10003,true,now());
INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (2,4444,'1234',10004,true,now());
INSERT INTO account_tb(user_id,number,password,balance,status,created_at) VALUES (3,5555,'1234',10005,true,now());

INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,2,10001,10002,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,3,9001,10003,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,4,8001,10004,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (1,5,7001,10005,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (2,3,11002,11003,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (2,4,10002,11004,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (2,5,9002,11005,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (3,4,12003,12004,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (3,5,11003,12005,1000,now());
INSERT INTO history_tb(sender_id,receiver_id,sender_balance,receiver_balance,amount,created_at) VALUES (4,5,12004,12005,1000,now());


