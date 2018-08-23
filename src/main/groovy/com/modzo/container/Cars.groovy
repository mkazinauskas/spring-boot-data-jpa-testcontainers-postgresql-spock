package com.modzo.container

import org.springframework.data.repository.CrudRepository

interface Cars extends CrudRepository<Car, Long> {
}
