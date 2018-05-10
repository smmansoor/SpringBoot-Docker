create schema IF NOT EXISTS todoapp;

create table IF NOT EXISTS todoapp.todos (id serial PRIMARY  KEY, name VARCHAR(1024), completed boolean);


