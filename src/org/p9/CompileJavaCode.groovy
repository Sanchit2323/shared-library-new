package org.p9

def callCompile(script) {
    script.sh 'mvn clean compile'
}
