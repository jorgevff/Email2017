public class Test
{
    public void textFucionalidad02(){
        MailServer serverUno = new MailServer();
        MailClient cliente1 = new MailClient(serverUno, "Juan");
        MailClient cliente2 = new MailClient(serverUno, "Sofia");
        cliente1.sendMailItem("Sofia", "Saludo", "Hola, como estas?");
        cliente2.printNextMailItem();
        cliente2.printNextMailItem();
        cliente2.ultimoCorreoRecibido();
        cliente1.sendMailItem("Sofia", "Recordatorio", "Me debes 50€");
        cliente2.printNextMailItem();
        cliente2.printNextMailItem();
        cliente2.ultimoCorreoRecibido();
    }
}