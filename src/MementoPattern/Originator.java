package MementoPattern;

public class Originator {
    private String content;

    public Memento save(String content){
        return new Memento(content);
    }

    public void undo(Memento memento){
        this.content = memento.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
