package fr.uvsq.doosa.gbintool1

import org.junit.Test

class MainTest {
    @Test
   void shouldReturnHello() {
       Main m = new Main()
    assert 'Hello' == m.returnHello()
    }

    @Test
        void shouldHaveTheCorrectNumberOfObjects() {
        assert starTable.rowCount == rowCount
        }

    @Test
    void shouldHaveTheCorrectParameters() {
    def parameterValues = starTable.parameters.collect { it.getValue() }
    assert parameters == parameterValues.join(", ")
    }
}