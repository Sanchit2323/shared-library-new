package org.example

class PipelineUtils implements Serializable {

    def script

    PipelineUtils(script) {
        this.script = script
    }

    def runDAST(server) {
        script.sh "curl http://localhost:5555/JSON/spider/action/scan/?url=http://${server}:8080/salary-documentation&maxChildren=10"
        script.sh "curl http://localhost:5555/OTHER/core/other/htmlreport/ -o zap_report.html"
    }

    def publishReport() {
        script.publishHTML(target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: '.',
            reportFiles: 'zap_report.html',
            reportName: 'OWASP ZAP Report'
        ])
    }
}
