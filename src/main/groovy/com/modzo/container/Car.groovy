package com.modzo.container

import javax.persistence.*

import static javax.persistence.GenerationType.SEQUENCE

@Entity
@Table(name = 'cars')
class Car {
    @Id
    @GeneratedValue(generator = 'cars_sequence', strategy = SEQUENCE)
    @SequenceGenerator(name = 'cars_sequence', sequenceName = 'cars_sequence', allocationSize = 1)
    @Column(name = 'id')
    Long id

    @Column(name = 'title')
    String title
}
