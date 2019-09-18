package com.winkle;


import com.opensymphony.xwork2.ActionSupport;


import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.util.LinkedHashMap;
import java.util.Map;

public class MessageAction extends ActionSupport {

    private Map<String, String> data = new LinkedHashMap<String, String>();

    private String message, userName, uniqueId;


    private WebSocketContainer ws;
    private Session session;

    public String execute() throws Exception {

        //Pusher pusher = new Pusher("app_id", "key", "secret");
//        Pusher pusher = new Pusher("853080", "e4e0d5b5a655ff4b5de7", "a1a909b7600c4a4adc08");
//        pusher.setCluster("us2"); // update with your pusher cluster
//        pusher.setEncrypted(true);
//        System.out.println("will start to check init chat endpoint");
//        ChatEndpoint chatEndpoint = new ChatEndpoint();
//        chatEndpoint.sayHello();

        System.out.println("action is triggered from front end");
        System.out.println(this.getUniqueId());
        ws = this.getWs();
        data.put("message", this.getMessage());
        data.put("userName", this.getUserName());
        data.put("uniqueId", this.getUniqueId());
//        myLoop(pusher);

        return SUCCESS;
    }


    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public WebSocketContainer getWs() {
        return ws;
    }

    public void setWs(WebSocketContainer ws) {
        this.ws = ws;
    }
}