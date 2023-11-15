import spock.lang.Specification


class SimpleSpec extends Specification {

    def "test list"() {
        given:
        ArrayList list = ["one", "two", "three"]

        when:
        list.add("four")

        then:
        !list.empty
        list.size() == 4

    }

}