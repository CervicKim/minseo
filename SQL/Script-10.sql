create table wallet(
	wallter_seq int auto_increment primary key,
	member_seq int not null,
	now_money int not null,
	used int not null,
	detail varchar(255) NOT null
	
);

ALTER TABLE MEMBER ADD column money int DEFAULT 0;

INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('거절', 100, 0, 0, '없음', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('닭볶음탕', 12000, 100, 1000, '닭고기', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('코코볼', 2500, 5, 250, '우유,초콜릿,계란,밀', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('보쌈', 20000, 120, 800, '돼지고기', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('조개찜', 15000, 60, 900, '어패류', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('불고기', 8000, 20, 800, '쇠고기,밀,대두', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('건빵후레이크', 1000, 10, 300, '우유,밀,대두', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('김치국', 3200, 30, 540, '없음', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('연어초밥', 5000, 15, 600, '생선', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('열라면', 30000, 5, 600, '밀,대두,돼지고기', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('순두부찌개', 5000, 40, 800, '밀,대두', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('불족발', 23000, 140, 1000, '밀,대두,돼지고기', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('당당치킨', 6000, 30, 900, '잣,밀,닭고기', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('낙곱새', 8000, 60, 800, '어패류, 생선, 돼지고기, 밀, 대두, 우유', 0 )
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('까르보나라', 6000, 20, 700, '밀,대두,우유,유제품', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('마라탕', 8000, 30, 1200, '밀,대두,우유,유제품,쇠고기,돼지고기,어패류,생선,새우', 0)
INSERT INTO food(food_name, cost, cook_time, cal, allergy, order_quantity) values('부대찌개', 6000, 40, 900, '밀,대두,우유,유제품,돼지고기,생선', 0)

INSERT INTO member(id, name, tel, email) values('asdf123', '김영희', '01011111111', 'asdf123@naver.com')

DROP TABLE MEMBER

alter table member add COLUMN allergy varchar(255); 

CREATE TABLE order_list(
	order_seq int AUTO_INCREMENT primary KEY,
	food_name varchar(255) NOT NULL,
	an_order varchar(50) NOT NULL,
	order_price int comment '주문금액',
	delivery_complete int(1) DEFAULT 0,
	memo varchar(255) comment '특이사항'
	);
	


CREATE TABLE venture(
	num int AUTO_INCREMENT PRIMARY KEY,
	company varchar(255) comment '업체명',
	addr varchar(255) comment '주소',
	category varchar(255) comment '업종 분류',
	business_name varchar(255) comment '업종명',
	product varchar(255) comment '주생산품'
);
DROP TABLE venture;

CREATE TABLE venture(
	num int Auto_increment PRIMARY KEY,
	company varchar(255) comment '업체명',
	addr varchar(255) comment '주소',
	category varchar(255) comment '업종 분류',
	business_name varchar(255) comment '업종명',
	product varchar(255) comment '주생산품'
);

CREATE TABLE users(
	id varchar(50) comment '유저 아이디',
	pw varchar(200) comment '유저 비밀번호',
	name varchar(30) comment '유저 이름'
);