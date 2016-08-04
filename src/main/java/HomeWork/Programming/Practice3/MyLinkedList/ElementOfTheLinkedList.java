package HomeWork.Programming.Practice3.MyLinkedList;

/**
 * Created by lapte on 17.06.2016.
 */
public class ElementOfTheLinkedList {
    private Object value;
    private ElementOfTheLinkedList previousElement;
    private ElementOfTheLinkedList nextElement;


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public ElementOfTheLinkedList getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(ElementOfTheLinkedList previousElement) {
        this.previousElement = previousElement;
    }

    public ElementOfTheLinkedList getNextElement() {
        return nextElement;
    }

    public void setNextElement(ElementOfTheLinkedList nextElement) {
        this.nextElement = nextElement;
    }


    @Override
    public String toString() {
        return "ElementOfTheLinkedList{" +
                "value=" + value +
                '}';
    }
}
