class JqueryBvalidatorGrailsPlugin {
    // the plugin version
    def version = "0.55.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = ['resources':'1.0 > *', 'jquery':'1.6 > *']
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Karol Balejko"
    def authorEmail = "kb@groovydev.org"
    def title = "Plugin form validator for jQuery resource files"
    def description = 'Form validator for jQuery resource files.'

    // URL to the plugin's documentation
    def documentation = "https://github.com/groovydev/jquery-bvalidator-grails-plugin/blob/master/README.md"
    def license = "APACHE"
    def issueManagement = [ system: "github", url: "https://github.com/groovydev/jquery-bvalidator-grails-plugin/issues" ]
    def scm = [ url: "https://github.com/groovydev/jquery-bvalidator-grails-plugin" ]

}
