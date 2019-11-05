use MusicStore ;

create table Music (
Artist_id int not null auto_increment,
Artist_name varchar(100),
Genre_type varchar (100) not null,
Albums varchar(100) not null,
Songs varchar (100) not null,
art varchar(1000) not null,
price varchar(1000) not null,
primary key (Artist_id)
);

insert into Music(Artist_id, Artist_name, Genre_type,  Albums, Songs, art, price) values(null, 'Mac Demarco','blue wave','2','My Kind Of Woman','tbh-music-src','$10');
insert into Music(Artist_id, Artist_name, Genre_type , Albums, Songs, art, price) values(null, 'Nirvana','Grunge','In Utero','Heart Shaped Box','tbh-music-src','$10');
insert into Music(Artist_id, Artist_name, Genre_type , Albums, Songs, art, price) values(null, 'Led Zepellin','Hard rock','Mothership','Immigrant Song','tbh-music-src','$10');
insert into Music(Artist_id, Artist_name, Genre_type , Albums, Songs, art, price) values(null, 'The Beatles','Classic Rock','Abbey Road','Something','tbh-music-src','$10');
insert into Music(Artist_id, Artist_name, Genre_type , Albums, Songs, art, price) values(null, 'Evanescence','Metal','The Open Door','Lithium','tbh-music-src','$10');
insert into Music(Artist_id, Artist_name, Genre_type , Albums, Songs, art, price) values(null, 'Linkin Park','Alternative Metal','Hybrid Theory','Crawling','tbh-music-src','$10');
insert into Music(Artist_id, Artist_name, Genre_type , Albums, Songs, art, price) values(null, 'Cuco','Indie','Wannabewithu','Lover is a Day','tbh-music-src','$10');