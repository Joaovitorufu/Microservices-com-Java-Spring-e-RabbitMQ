# Microservices-com-Java-Spring-e-RabbitMQ
Este repositório contém um exemplo prático de uma aplicação baseada em microservices utilizando o framework Spring Boot e o sistema de mensageria RabbitMQ. O objetivo é demonstrar os conceitos fundamentais de arquitetura de microservices, como comunicação assíncrona, escalabilidade e desacoplamento entre serviços.

---

## Funcionalidades Principais  
- **Comunicação Assíncrona**: Integração entre serviços utilizando RabbitMQ como middleware de mensageria.  
- **Estrutura Modular**: Organização do código em múltiplos serviços independentes (Producer, Consumer, API Gateway, etc.).  
- **Configuração Simplificada**: Exemplo de uso do Spring Boot para configuração de filas, exchanges e bindings no RabbitMQ.  
- **Mensagens Resilientes**: Implementação de estratégias para garantir entrega confiável das mensagens.  
- **Escalabilidade**: Demonstração de como adicionar novos consumidores ou serviços sem impactar a arquitetura.

---

## Tecnologias Utilizadas  
- **Java 17**  
- **Spring Boot**  
- **Spring AMQP**  
- **RabbitMQ**  

---

## Estrutura do Projeto  
O projeto está dividido em múltiplos serviços:  

1. **User Service**: Serviço responsável por enviar mensagens para o RabbitMQ.  
2. **Email Service**: Serviço responsável por consumir mensagens da fila do RabbitMQ.  

---

## Pré-requisitos  
Certifique-se de ter as seguintes ferramentas instaladas:  
- **Java 17 ou superior**  
- **Maven**  
- **RabbitMQ**
---


