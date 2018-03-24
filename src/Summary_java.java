import java.io.*;
import java.util.Properties;

public class Summary_java {
    public static void main(String[] args) {
        InputStreamReader InputStreamReader = null;
        BufferedReader bufferedReader = null;
        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("bd.properties");
            property.load(new InputStreamReader(fis, "UTF-8"));
            StringBuilder sb = new StringBuilder();

            String fio = new String(property.getProperty("FIO").getBytes("UTF-8"));
            String dob = property.getProperty("DOB");
            String telefon = property.getProperty("telefon");
            String email = property.getProperty("email");
            String skype = property.getProperty("skype");
            String avatar = property.getProperty("avatar");
            String target = property.getProperty("target");
            String experience = property.getProperty("experience");
            String education = property.getProperty("education");
            String plus_education = property.getProperty("plus_education");
            String skils = property.getProperty("skils");
            String prev = property.getProperty("prev");



            PrintWriter writer = new PrintWriter("index.html");
            writer.println("<!DOCTYPE HTML>\n" +
                    "<html>\n" +
                    " <head>\n" +
                    "  <meta charset=utf-8\">\n" +
                    "  <title>Пример веб-страницы</title>\n" +
                    "   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
                    "  <style>\n" +
                    "\t<div class=\"container\">\n" +
                    "\t\twight = 50%;\n" +
                    "\t</div>\n" +
                    "  \n" +
                    "  </style>\n" +
                    " </head>\n" +
                    " <body>\n" +
                    " <div class=\"container\"> <font size=\"4\">\n" +
                    "  <div class=\"row\">\n" +
                    "  <div class=\"col-xs-12\"><center><h1>Резюме</h1> <h4>на должность Java-стажёр </h4><center></div>\n" +
                    "\t<div class=\"col-xs-2\" align=\"right\">\n" +
                    "\tФИО:\n" +
                    "\t<br>Дата рождения:\n" +
                    "\t<br>Телефон:\n" +
                    "\t<br>e-mail:\n" +
                    "\t<br>Skype: <br></div>\n" +
                    "\t<div class=\"col-xs-7\">"+fio+ "<br>" + dob + "<br>" + telefon + "<br>" + email + "<br>" + skype + "</div>\n" +
                    "\t<div class=\"col-xs-3\"><img src=\"" + avatar + "\" width=\"250\" height=\"200\" alt=\"avatar\" class=\"img-rounded\" ></div>\n" +
                    "\t<div class=\"clearfix\"><b>Цель:</b></div> \n" +
                    "\t<div class=\"clearfix\">" + target + "</div> \n" +
                    "\t<div class=\"clearfix\"><b>Опыт работы:</b></div>\n" +
                    "\t<div class=\"clearfix\">\n" +
                    "\t\t<ol>\n" +
                    "\t\t\t" + experience + "\n" +
                    "\t\t</ol>\n" +
                    "\t</div>\t\n" +
                    "\t<div class=\"clearfix\"><b>Образование:</b></div>\n" +
                    "\t<div class=\"clearfix\">" + education + "</div> \n" +
                    "\t<div class=\"clearfix\"><b>Дополнительное образование и курсы:</b></div> \n" +
                    "\t<div class=\"clearfix\"><ol>\n" +
                    "\t\t\t" + plus_education + "\n" +
                    "\t\t</ol></div>\n" +
                    "<div class=\"clearfix\"><b>Навыки:</b></div> \t\n" +
                    "\t<div class=\"clearfix\"><ol>\n" +
                    "\t\t\t" + skils + "\n" +
                    "\t\t</ol>\n" +
                    "\t</div>\n" +
                    "\t<div class=\"clearfix\"><b>Пример моего кода:</b></div> \t\n" +
                    "\t<div class=\"clearfix\"><a href=\"+ prev + \">GitHub</a></div>"+
                    "  </font></div>\n" +
                    "</div>\n" +
                    " \n" +
                    "  \n" +
                    " </body>\n" +
                    "</html>");
            writer.close();



        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
