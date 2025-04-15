# Weather Application
A Spring Boot application that provides weather information for cities using an external weather API, with Redis caching and MongoDB configuration storage.

## Overview
This application provides a REST API to retrieve current weather information for a specified city. It implements several key features:

* Redis caching to improve response times and reduce external API calls
* MongoDB for configuration storage
* Circuit breaker pattern for fault tolerance
* RESTful API with Spring Web

## Features

* Get current weather conditions by city name
* Cache responses to minimize external API calls
* Configuration management through MongoDB
* Fault tolerance with circuit breaker pattern

## Technical Stack

* Java 17
* Spring Boot
* Spring Data MongoDB
* Spring Data Redis
* RestTemplate for HTTP requests
* Lombok for reducing boilerplate code

## Project Structure

* **Controller:** Handles HTTP requests and responses
* **Service:** Contains business logic and external API calls
* **Repository:** Interfaces with MongoDB
* **Entity:** Data models
* **Configuration:** Application configuration
* **Cache:** Application cache management
