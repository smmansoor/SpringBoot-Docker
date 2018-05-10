[![Build Status](https://travis-ci.com/smmansoor/SpringBoot-Docker.svg?branch=master)](https://travis-ci.com/smmansoor/SpringBoot-Docker)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# SpringBoot-Docker

A simple example for running SpringBoot application within Docker along with PostgreSQL.

##Building Project
This project uses Maven build sytsem. Build the system by running:

    ./mavenw install

##Build Docker Image

After the build is complete. Build spring boot docker image by running:

    docker image build . -t springboot-docker

##Statrting Container

After docker image creation, run the whole stack i.e SpringBoot application and PostgreSQL by running:

    docker-compose up

##API
After that API will be accessible at http://localhost:8085/todos        
