package com.modzo.container

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class CarsRepositorySpec extends Specification {

    @Autowired
    Cars cars

    def 'should save new car'() {
        given:
            Car car = new Car(title: 'Audi')
        when:
            Long id = cars.save(car).id
        then:
            cars.findById(id).get().title == 'Audi'
    }
}
