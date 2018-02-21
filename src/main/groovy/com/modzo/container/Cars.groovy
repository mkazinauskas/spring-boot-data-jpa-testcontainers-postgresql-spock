package com.modzo.container

import org.springframework.data.jpa.repository.JpaRepository

interface Cars extends JpaRepository<Car, Long> {
}
