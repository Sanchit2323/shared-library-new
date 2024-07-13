package org.p9

class CompileJavaCode {
    static void call(script) {
        script {
            sh 'mvn clean compile'
        }
    }
}
