package sample.pastebinapi;


import sample.AlertBox;

import java.io.IOException;

public class EggMain {
    private AlertBox Abox;

    private String apiKey;
    private String username;
    private String password;



    public void PostOnPasteBin(String message) throws PastebinException, IOException {

        PastebinAPI api = new PastebinAPI("71bcf459f261293dac25075bf5307edb");  // A DUMP ACCOUNTS API KEY because it wont work without it.

        CreatePaste paste = api.createPaste()                             // You can call api.createPaste() to create a paste as a guest.
                .withName("From : " + System.getProperty("user.name"))  // the name of the post in pastebin
                .withPrivacyLevel(PrivacyLevel.PUBLIC) // privacy level of post
                .withExpireDate(ExpireDate.NEVER) // expirey date of post
                .withText(message); // test of post

        String url = paste.post();
        Abox.startAlertBox("The link is : " + url);
    }
}
/*

                This api is not Clodio's its nrubin29 api that has been slighlty modifed by clodio

                Credit to nrubin29
                https://github.com/nrubin29/PastebinAPI
                https://github.com/nrubin29/PastebinAPI
                https://github.com/nrubin29/PastebinAPI


                Also

                This is Clodio's first javafx program. So if you find any issues message me or something..

 */
/*  This is here for anyone that wats to implement the login feature for themselfs.-clodio

            //PastebinAPI initialization
         PastebinAPI api = new PastebinAPI(); // api key here

         //Getting a user
        User user = api.getUser();      //username and password text here!

        also use = CreatePaste paste = user.createPaste()  This is used if you want to implement the login feature.
*/