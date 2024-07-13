package org.p9

class OwaspDependencyCheck implements Serializable {

    def script

    OwaspDependencyCheck(script) {
        this.script = script
    }

    void runOwaspDependencyCheck() {
        script.echo "Running OWASP Dependency Check"
        script.sh 'mvn org.owasp:dependency-check-maven:check -Dformat=HTML'
    }

    void archiveReports() {
        script.echo "Archiving OWASP Dependency Check Reports"
        script.archiveArtifacts artifacts: 'target/dependency-check-report.html', allowEmptyArchive: true
    }
}
