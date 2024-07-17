def call() {
    echo 'Publishing ZAP report...'
    publishHTML(target: [
        allowMissing: false,
        alwaysLinkToLastBuild: false,
        keepAll: true,
        reportDir: '.',
        reportFiles: 'zap_report.html',
        reportName: 'OWASP ZAP Report'
    ])
}
