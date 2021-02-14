create table carrinho (
    id bigint not null auto_increment,
    total float not null,
    usuario_id bigint,
    primary key (id)
) engine = MyISAM; 

create table carrinho_itens (
    carrinho_id bigint not null,
    itens_id bigint not null
) engine = MyISAM; 

create table categoria (
    id bigint not null auto_increment,
    tipo varchar(255),
    primary key (id)
) engine = MyISAM; 

create table compra (
    id bigint not null auto_increment,
    situacao integer,
    valor_compra double precision not null,
    usuario_pagador_id bigint,
    primary key (id)
) engine = MyISAM; 

create table compra_itens (
    compra_id bigint not null,
    itens_id bigint not null
) engine = MyISAM; 

create table funcao (
    id integer not null auto_increment,
    name varchar(20),
    primary key (id)
) engine = MyISAM; 

create table item (
    id bigint not null auto_increment,
    quantidade integer not null,
    produto_id bigint,
    primary key (id)
) engine = MyISAM; 

create table pagamento (
    dtype varchar(31) not null,
    id bigint not null auto_increment,
    cod_pagamento integer not null,
    primary key (id)
) engine = MyISAM; 

create table pessoa (
    pessoa varchar(31) not null,
    id bigint not null auto_increment,
    cpf varchar(255),
    data_nascimento date,
    nome varchar(255),
    cnpj varchar(255),
    razao_social varchar(255),
    primary key (id)
) engine = MyISAM; 

create table produto (
    id bigint not null auto_increment,
    descricao varchar(255) not null,
    preco float not null,
    qtd_estoque integer not null,
    categoria_id bigint,
    primary key (id)
) engine = MyISAM; 

create table usuario (
    id bigint not null auto_increment,
    email varchar(255),
    senha varchar(255),
    username varchar(255),
    dados_pessoa_id bigint,
    primary key (id)
) engine = MyISAM; 

create table usuario_funcoes (
    usuario_id bigint not null,
    funcao_id integer not null,
    primary key (usuario_id, funcao_id)
) engine = MyISAM;

alter table carrinho_itens drop index UK_axcvjecxcr3osgvy9eheycw8x;
alter table carrinho_itens add constraint UK_axcvjecxcr3osgvy9eheycw8x unique (itens_id);
alter table compra_itens drop index UK_7qpswdxlqimyboapft5r80nas;
alter table compra_itens add constraint UK_7qpswdxlqimyboapft5r80nas unique (itens_id)
alter table carrinho add constraint FK8jwo8e9vk1gdcw8ak7if31ahc foreign key (usuario_id) references usuario (id);
alter table carrinho_itens add constraint FKrjg8abuatdy9bfg7aj5jiwlpd foreign key (itens_id) references item (id);
alter table carrinho_itens add constraint FK3t59fa8o4detuvmxsk9fl89rq foreign key (carrinho_id) references carrinho (id);
alter table compra add constraint FKr00fdns5d22mihexf5nah409e foreign key (usuario_pagador_id) references usuario (id);
alter table compra_itens add constraint FK2i8xml2uthv7g3mlnv6kq5uw2 foreign key (itens_id) references item (id);
alter table compra_itens add constraint FKhb5t6atclh5uvnft81wmol0px foreign key (compra_id) references compra (id);
alter table item add constraint FKoya2x5ip1q2t3s0936vgjiyx9 foreign key (produto_id) references produto (id);
alter table produto add constraint FKopu9jggwnamfv0c8k2ri3kx0a foreign key (categoria_id) references categoria (id);
alter table usuario add constraint FKceurvf9cci080k24qtsrvbur1 foreign key (dados_pessoa_id) references pessoa (id);
alter table usuario_funcoes add constraint FKa21ql5q61hegafbt1ystfeitv foreign key (funcao_id) references funcao (id);
alter table usuario_funcoes add constraint FKqxl8cd29iknv908uoqx775pbc foreign key (usuario_id) references usuario (id);

insert into funcao (name) values ('CLIENTE');