modules = {
    
    'jquery-bvalidator' {
        dependsOn 'jquery'
        resource id:'css', url:[plugin: 'jquery-bvalidator', dir: 'css', file: 'bvalidator.css'], disposition: 'head'
        resource id:'js', url:[plugin: 'jquery-bvalidator', dir: 'js', file: 'jquery.bvalidator.js'], disposition: 'head'
    }
    
}