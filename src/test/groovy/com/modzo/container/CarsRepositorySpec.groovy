package com.modzo.container

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(webEnvironment = RANDOM_PORT)
class CarsRepositorySpec extends Specification {

    @Autowired
    Cars cars

    def 'should save new car'() {
        given:
            Car car = new Car(title: 'Audi')
        when:
            Long id = cars.save(car).id
        then:
            cars.findOne(id).title == 'Audi'
    }
}
