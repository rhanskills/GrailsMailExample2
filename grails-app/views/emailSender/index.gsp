<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Email Sender</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<div id="content" role="main">
    <section class="row colset-2-its">
        <g:if test="${flash.message}">
            <div class="message" role="alert">
                ${flash.message}
            </div>
        </g:if>
        <g:if test="${flash.error}">
            <div class="message" role="alert">
                ${flash.error}
            </div>
        </g:if>
        <h2>Email Sender Form</h2>
        <g:form controller="emailSender" action="send">
            <div class="fieldcontain">
                <g:textField name="address" placeholder="youremail@djamware.com" required="" />
%{--                <g:select name="address" from="${myContacts}" optionKey="email" optionValue="name" noSelection="${['':'Seleccione un contacto...']}" required=""/>--}%
%{--                <select name="address">--}%
%{--                    <g:each var="contact" in="${myContacts}">--}%
%{--                        <option value="${contact.email}">${contact.name}</option>--}%
%{--                    </g:each>--}%
%{--                </select>--}%
            </div>
            <div class="fieldcontain">
                <g:textField name="subject" placeholder="Your Subject" required="" />
            </div>
            <div class="fieldcontain">
                <g:textArea name="body" rows="5" cols="80" placeholder="Your message" required="" />
            </div>
            <fieldset>
                <g:submitButton name="send" value="Send" />
            </fieldset>
        </g:form>
    </section>
</div>

</body>
</html>