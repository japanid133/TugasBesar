/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittertb;

/**
 *
 * @author baguspw2405
 */
public class datFo {
    /*private*/ String ConsumerKey;
    /*private*/ String ConsumerSecret;
    /*private*/ String AccessKey;
    /*private*/ String AccessSecret;

    /*public datFo(String ConsumerKey,String ConsumerSecret,String AccessKey,String AccessSecret) {
       this.ConsumerKey=ConsumerKey;
        this.ConsumerSecret=ConsumerSecret;
        this.AccessKey=AccessKey;
        this.AccessSecret=AccessSecret;
    }*/
    public void setConsumerKey(String ConsumerKey){
        this.ConsumerKey=ConsumerKey;
    }
    public void setConsumerSecret(String ConsumerSecret){
        this.ConsumerSecret=ConsumerSecret;
    }
    public void setAccessKey(String AccessKey){
        this.AccessKey=AccessKey;
    }
    public void setAccessSecret(String AccessSecret){
        this.AccessSecret=AccessSecret;
    }
    public String getConsumerKey(){
        return ConsumerKey;
    }
    public String getConsumerSecret(){
        return ConsumerSecret;
    }
    public String getAccessKey(){
        return AccessKey;
    }
    public String getAccessSecret(){
        return AccessSecret;
    }
}
