import org.p9.CompileJavaCode
import org.p9.SonarqubeJava

def callCompile(script) {
    script.sh 'mvn clean compile'
}

def callSonarAnalysis(String projectKey, String sourcesDir, String sonarToken, String binariesDir) {
    new SonarqubeJava().call(projectKey, sourcesDir, sonarToken, binariesDir)
}
