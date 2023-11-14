import groovy.json.JsonSlurper
import spock.lang.Specification

class IntegrationTestSpec extends Specification {
    def jsonSlurper = new JsonSlurper()

    def "should validate pokemon types" () {
        given:
        def url = new URL('https://pokeapi.co/api/v2/pokemon/gastrodon')

        when:
        def connection = url.openConnection() as HttpURLConnection
        def response = jsonSlurper.parseText(connection.inputStream.text)


        then:
        connection.responseCode == 200
        response.types[0].type.name == "water"
        response.types[1].type.name == "ground"
    }


}