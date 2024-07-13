package org.p9

class JavaTestUtils implements Serializable {
    def script

    JavaTestUtils(script) {
        this.script = script
    }

    def runTests() {
        script.sh 'mvn test'
    }
}
