package utils;

import j2html.tags.Tag;

import static j2html.TagCreator.*;

public class HTMLGenerator {

    public static String generateHTML(){

        return html(
                head(
                        title("To upper case"),
                        meta().withCharset("UTF-8")
                ),
                body(
                        h1("To upper case"),
                        div(

                        ),
                        div(
                                fieldset(
                                        form().withStyle("display:block").withMethod("post").with(
                                                getTextarea(),
                                                getButton()
                                        )
                                )
                        )
                ).withStyle("background-color: AliceBlue")
        ).render();

    }

    public static Tag getTextarea(){

        return textarea().withStyle("height:200px; width:1000px").withName("text").isRequired();

    }

    public static Tag getButton(){
        return input().withType("submit").withValue("Submit").withStyle("height:30px; width: 100px; display:block");
    }

}
