package org.p9

class CompileJavaCode {
    static void call() {
        script {
            sh 'mvn clean compile'
        }
    }
}
