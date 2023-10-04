package edu.lawrence.quiz_server;

public class Response {

    private String student;
    private String response;
    private int question;

    
public Response(){}
    public String getStudent() {
        return student;
    }

    public String getResponse() {
        return response;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getQuestion() {
        return question;
    }

}
