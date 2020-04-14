package grailsmailexample

import grails.gsp.PageRenderer
import grails.plugins.mail.MailService

class EmailSenderController {

    MailService mailService
    PageRenderer groovyPageRenderer

    def index() {
        List<Object> contacts = [[id:1, name:"Pepe", email:"correo1@mail.com"], [id:2, name:"Juanita", email:"correo2@mail.com"], [id:3, name:"Marcelo", email:"correo3@mail.com"]]
        render view: "index", model: [myContacts:contacts]
    }

    def send() {
        println params

        try {
            mailService.sendMail {
                to params.address
                subject params.subject
    //            text params.body
                html groovyPageRenderer.render(template: "/emailSender/mailTest", model: [title: params.subject, body: params.body])
            }
            flash.message = "Message sent at " + new Date()
        } catch (Exception e) {
            e.printStackTrace()
            flash.error = "Hubo un error inesperado"
        }
        redirect action: "index"
    }
}
