import org.p9.CompileJavaCode
import org.p9.SonarqubeJava

def callCompile(script) {
    script.sh 'mvn clean compile'
}

def call(String projectKey, String sourcesDir, String sonarToken) {
    new SonarqubeJava().call(projectKey, sourcesDir, sonarToken)
}

def call(String projectKey, String sourcesDir, String sonarToken, String binariesDir) {
    new SonarqubeJava().call(projectKey, sourcesDir, sonarToken, binariesDir)
}
