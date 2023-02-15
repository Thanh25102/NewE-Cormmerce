create table cart_detail
(
    id         integer   not null auto_increment,
    price      float(53) not null,
    quantity   integer   not null,
    cart_id    integer   not null,
    product_id integer   not null,
    primary key (id)
) engine=InnoDB;

create table order_detail
(
    id         integer   not null auto_increment,
    price      float(53) not null,
    quantity   integer   not null,
    order_id   integer   not null,
    product_id integer   not null,
    primary key (id)
) engine=InnoDB;

create table product_detail
(
    id          integer      not null auto_increment,
    description varchar(255) not null,
    image       varchar(255),
    quantity    integer      not null,
    color_id    integer      not null,
    product_id  integer      not null,
    size_id     integer      not null,
    primary key (id)
) engine=InnoDB;

create table access
(
    id          integer  not null auto_increment,
    code        longtext not null,
    description varchar(255),
    primary key (id)
) engine=InnoDB;

create table account
(
    username     varchar(50)  not null,
    address      varchar(255),
    avatar       varchar(255),
    email        varchar(100) not null,
    enabled      bit          not null,
    full_name    varchar(55)  not null,
    password     varchar(64)  not null,
    phone        varchar(20),
    rank_account varchar(55)  not null,
    role_id      integer      not null,
    primary key (username)
) engine=InnoDB;

create table cart
(
    id       integer     not null auto_increment,
    ammount  integer     not null,
    username varchar(50) not null,
    primary key (id)
) engine=InnoDB;

create table category
(
    id          integer     not null auto_increment,
    code        varchar(50) not null,
    description varchar(255),
    logo        varchar(255),
    name        varchar(50) not null,
    thumbnail   varchar(50),
    primary key (id)
) engine=InnoDB;

create table color
(
    id          integer     not null auto_increment,
    code        varchar(50) not null,
    description varchar(255),
    name        varchar(50) not null,
    primary key (id)
) engine=InnoDB;

create table discount
(
    id           integer not null auto_increment,
    description  varchar(255),
    end_day      datetime(6) not null,
    sale_percent integer not null,
    start_day    datetime(6) not null,
    primary key (id)
) engine=InnoDB;

create table discount_code
(
    id           integer     not null auto_increment,
    code         varchar(50) not null,
    description  varchar(255),
    end_day      datetime(6) not null,
    max_discount bigint      not null,
    sale_money   bigint      not null,
    sale_percent integer     not null,
    start_day    datetime(6) not null,
    primary key (id)
) engine=InnoDB;

create table order_
(
    id               integer     not null auto_increment,
    ammount          integer     not null,
    city             varchar(255),
    create_time      datetime(6) not null,
    order_status     varchar(20) not null,
    payment_method   varchar(50) not null,
    phone            varchar(255),
    shiping_address  varchar(255),
    sum_money        float(53),
    username         varchar(50) not null,
    discount_code_id integer,
    primary key (id)
) engine=InnoDB;

create table permission
(
    role_id   integer not null,
    access_id integer not null
) engine=InnoDB;

create table product
(
    id          integer     not null auto_increment,
    description varchar(255),
    name        varchar(55) not null,
    price       float(53)   not null,
    represent   varchar(255),
    thumbnail   varchar(55),
    category_id integer     not null,
    discount_id integer,
    primary key (id)
) engine=InnoDB;

create table role
(
    id        integer     not null auto_increment,
    authority varchar(64) not null,
    primary key (id)
) engine=InnoDB;

create table size
(
    id          integer     not null auto_increment,
    code        varchar(50) not null,
    description varchar(255),
    name        varchar(50) not null,
    primary key (id)
) engine=InnoDB;

alter table account
    add constraint UK_q0uja26qgu1atulenwup9rxyr unique (email);

alter table cart_detail
    add constraint FKrg4yopd2252nwj8bfcgq5f4jp
        foreign key (cart_id)
            references cart (id);

alter table cart_detail
    add constraint FK1e6mj8jige6dn7j6n2qedabon
        foreign key (product_id)
            references product_detail (id);

alter table order_detail
    add constraint FK4u34rkhbehcj1jbb1mc5m8ccs
        foreign key (order_id)
            references order_ (id);

alter table order_detail
    add constraint FKdg9xhuyv5ov6n4ceqk601eifi
        foreign key (product_id)
            references product_detail (id);

alter table product_detail
    add constraint FK99vj2np1gk1robp8n6htiweii
        foreign key (color_id)
            references color (id);

alter table product_detail
    add constraint FKilxoi77ctyin6jn9robktb16c
        foreign key (product_id)
            references product (id);

alter table product_detail
    add constraint FKcum8u2vfvebmmc4xo8de3k35s
        foreign key (size_id)
            references size (id);

alter table account
    add constraint FKd4vb66o896tay3yy52oqxr9w0
        foreign key (role_id)
            references role (id);

alter table cart
    add constraint FKaw59i1y3in0mwyhig0sw0bapn
        foreign key (username)
            references account (username);

alter table order_
    add constraint FKghgcu3gxl8trwk9dic7117yaq
        foreign key (username)
            references account (username);

alter table order_
    add constraint FKpeb56aqqhvpi8jm3jey78mrr3
        foreign key (discount_code_id)
            references discount_code (id);

alter table permission
    add constraint FKg9bqdtd19o5sb0bghyui3bcia
        foreign key (access_id)
            references access (id);

alter table permission
    add constraint FKrvhjnns4bvlh4m1n97vb7vbar
        foreign key (role_id)
            references role (id);

alter table product
    add constraint FK1mtsbur82frn64de7balymq9s
        foreign key (category_id)
            references category (id);

alter table product
    add constraint FKps2e0q9jpd0i9kj83je4rsmf1
        foreign key (discount_id)
            references discount (id);
