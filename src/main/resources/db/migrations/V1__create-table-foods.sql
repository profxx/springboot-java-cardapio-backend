CREATE TABLE foods (
    id SERIAL primary key,
    title text not null,
    image text,
    price INTEGER not null
)