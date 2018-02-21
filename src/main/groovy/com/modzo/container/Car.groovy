package com.modzo.container

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Car {
    @Id
    @GeneratedValue
    @Column(name = 'id')
    Long id

    @Column(name = 'title')
    String title
}
