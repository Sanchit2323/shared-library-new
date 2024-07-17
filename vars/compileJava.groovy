import org.p9.CompileJavaCode
import org.p9.SonarqubeJava
import org.p9.JavaTestUtils
import org.p9.OwaspDependencyCheck

def callCompile(script) {
    script.sh 'mvn clean compile'
}

def callSonarAnalysis(String projectKey, String sourcesDir, String sonarToken) {
    new SonarqubeJava().call(projectKey, sourcesDir, sonarToken)
}

def callTests(script) {
    def javaTestUtils = new JavaTestUtils(script)
    javaTestUtils.runTests()
}

def runOwaspCheck(script) {
    def owaspDependencyCheck = new OwaspDependencyCheck(script)
    owaspDependencyCheck.runOwaspDependencyCheck()
    owaspDependencyCheck.archiveReports()
}
