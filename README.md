# Projeto Maven - Conexão e Operação MySQL
Este projeto é um exercício do curso de Desenvolvimento de Aplicações Web do quarto período de Sistemas de Informação. O objetivo é criar um projeto Maven que habilite e execute uma operação básica em uma base de dados MySQL.
## Descrição
Este projeto é uma aplicação Java que estabelece uma conexão com uma base de dados MySQL e executa uma operação de inserção de dados. 
## Criação da Base de Dados
   ```sql
   CREATE DATABASE databaseprojetomaven;
   USE databaseprojetomaven;
   CREATE TABLE EMPRESA (
       id INT PRIMARY KEY,
       nome VARCHAR(100)
   );
