[![Build Status](https://travis-ci.com/smmansoor/SpringBoot-Docker.svg?branch=master)](https://travis-ci.com/smmansoor/SpringBoot-Docker)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1e1443531f8a4bf2b2a2d3c7cfbb48e8)](https://www.codacy.com/app/smmansoor/SpringBoot-Docker?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=smmansoor/SpringBoot-Docker&amp;utm_campaign=Badge_Grade)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# SpringBoot-Docker

A simple example for running SpringBoot application within Docker along with PostgreSQL.
This application is a simple todo API. It uses SpringBoot Data Rest to expose data repository as rest API.
It also provide the Spring Data HAL browser.
## Building Project
This project uses Maven build system. Build the system by running:

    ./mavenw install

Maven build will also create container image for SpringBoot Docker applicaiton.
## Starting Container
After successful build, run the whole stack i.e SpringBoot application and PostgreSQL by running:

    docker-compose up
## API
API will be accessible at http://localhost:8085/todos. To access HAL browser goto http://localhost:8085/browser/index.html
        
