
use MusicStore;

create table Music (
id int(200) not null,
Artist_name varchar(100),
Genre_type varchar (100) not null,
Albums varchar(100) not null,
Songs varchar (100) not null,
art varchar(1000) not null,
price varchar(1000) not null,
primary key (id)
);

insert into Music(id,Artist_name, Genre_type,  Albums, Songs, art, price) values(1,'Mac Demarco','blue wave','2','My Kind Of Woman','./Assets/mykindWoman.mp3','$10');
insert into Music(id,Artist_name, Genre_type , Albums, Songs, art, price) values(2,'Nirvana','Grunge','In Utero','Heart Shaped Box','tbh-music-src','$10');
insert into Music(id,Artist_name, Genre_type , Albums, Songs, art, price) values(3,'Led Zepellin','Hard rock','Mothership','Immigrant Song','tbh-music-src','$10');
insert into Music(id,Artist_name, Genre_type , Albums, Songs, art, price) values(4,'The Beatles','Classic Rock','Abbey Road','Something','tbh-music-src','$10');
insert into Music(id,Artist_name, Genre_type , Albums, Songs, art, price) values(5,'Evanescence','Metal','The Open Door','Lithium','tbh-music-src','$10');
insert into Music(id, Artist_name, Genre_type , Albums, Songs, art, price) values(6,'Linkin Park','Alternative Metal','Hybrid Theory','Crawling','tbh-music-src','$10');
insert into Music(id,Artist_name, Genre_type , Albums, Songs, art, price) values(7,'Cuco','Indie','Wannabewithu','Lover is a Day','tbh-music-src','$10');