import spock.lang.FailsWith
import spock.lang.Specification
import spock.lang.Unroll


class NumbersSpec extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given: "2 numbers"
        int left = 2
        int right = 2

        when: "adding them"
        int result = left + right

        then: "result should be 2"
        result == 4
    }

    def "Should be able to remove first item from list"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(0)


        then:
        list == [2, 3, 4]
    }

    def "Should get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)

    }

    @FailsWith(IndexOutOfBoundsException)
    def "Should fail to get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]
        list.remove(20)
    }

    def "max number"() {
        when:
        def x = Math.max(1, 2)

        then:
        x == 2

        expect:
        Math.max(1, 2) == 2
        Math.max(5, 8) == 8
        Math.max(0, 10) == 10
    }


    def "numbers to the power of two"() {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
        4 | 2 | 16
    }

}