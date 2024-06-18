create schema BD_salas;
use BD_salas;

create table Usuario (
cpf int not null primary key,
nome varchar(45) not null,
senha int not null,
email varchar(45) not null
);

create table Recurso (
idrecurso int not null primary key,
nome_recurso varchar(45) not null
);

create table Sala (
idsala int not null primary key,
cpf int not null,
idrecurso int not null,
numero_sala int not null,
capacidade_max int not null,
constraint fk_Sala_cpf foreign key (cpf)
references Usuario (cpf),
constraint fk_Sala_idrecursos foreign key (idrecurso)
references Rercurso (idrecurso)
);
create index fk_Sala_cpf_idx on Sala(cpf);
create index fk_Sala_idrecurso_idx on Sala(idrecurso);

create table Reserva (
idreserva int not null primary key,
cpf int not null,
idrecurso int not null,
idsala int not null,
data_reserva date not null,
hora_reserva time not null,
constraint fk_Reserva_cpf foreign key (cpf)
references Usuario (cpf),
constraint fk_Reserva_idrecursos foreign key (idrecurso)
references Rercurso (idrecurso),
constraint fk_Reserva_idsala foreign key (idsala)
references Sala (idsala)
);
create index fk_Recurso_cpf_idx on Recurso(cpf);
create index fk_Recurso_idrecurso_idx on Recurso(idrecurso);
create index fk_Recurso_idsala_idx on Recurso(idsala);




