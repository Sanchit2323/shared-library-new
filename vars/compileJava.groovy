import org.p9.CompileJavaCode

def callCompile(script) {
    script.sh 'mvn clean compile'
}
