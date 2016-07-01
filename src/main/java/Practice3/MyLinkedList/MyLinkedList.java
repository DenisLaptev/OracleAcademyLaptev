package Practice3.MyLinkedList;

/**
 * Created by lapte on 17.06.2016.
 */
public class MyLinkedList {
    private ElementOfTheLinkedList a0;
    private ElementOfTheLinkedList aLast;
    private int size = 0;


    public ElementOfTheLinkedList getA0() {
        return a0;
    }

    public void setA0(ElementOfTheLinkedList a0) {
        this.a0 = a0;
    }

    public ElementOfTheLinkedList getaLast() {
        return aLast;
    }

    public void setaLast(ElementOfTheLinkedList aLast) {
        this.aLast = aLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "a0=" + a0 +
                ", aLast=" + aLast +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        MyLinkedList mll = new MyLinkedList();
        ElementOfTheLinkedList a0 = new ElementOfTheLinkedList();
        mll.setA0(a0);
        mll.setaLast(a0);

        System.out.println("Вначале, MyLinkedList пустой:");
        System.out.println("llt.isEmpty()= " + mll.isEmpty());
        System.out.println("mll.size()= " + mll.size());
        System.out.println(mll);
        //mll.printMyLinkedList();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Добавим элементы в MyLinkedList в конец списка с помощью метода .add(Object o):");

        System.out.println("mll.add(5)= " + mll.add(5));
        System.out.println("mll.add(10)= " + mll.add(10));
        System.out.println("mll.add(15)= " + mll.add(15));
        System.out.println("mll.add(20)= " + mll.add(20));
        System.out.println("mll.add(25)= " + mll.add(25));
        System.out.println("mll.add(30)= " + mll.add(30));
        System.out.println("mll.add(35)= " + mll.add(35));

        System.out.println("mll.isEmpty()= " + mll.isEmpty());
        System.out.println("mll.size()= " + mll.size());
        System.out.println(mll);
        mll.printMyLinkedList();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("Проверим, содержит ли MyLinkedList элементы 15, 30 с помощью метода .contains():");

        System.out.println("mll.contains(15): " + mll.contains(15));
        System.out.println("mll.contains(30): " + mll.contains(30));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("Удалим элементы 15 и 30 из MyLinkedList с помощью метода .remove():");


        System.out.println("mll.remove(15)= " + mll.remove(15));
        System.out.println("mll.remove(30)= " + mll.remove(30));

        System.out.println(mll);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        mll.printMyLinkedList();
        System.out.println("mll.size()= " + mll.size());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Проверим, содержит ли MyLinkedList элементы 15, 30 с помощью метода .contains():");

        System.out.println("mll.contains(15): " + mll.contains(15));
        System.out.println("mll.contains(30): " + mll.contains(30));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("Добавим элементы 15, 30 в MyLinkedList в середину списка на 2-е и 5-е место соответственно с помощью метода .add(int position, Object o):");

        System.out.println("mll.add(2,15)= " + mll.add(2, 15));
        System.out.println("mll.add(5,30)= " + mll.add(5, 30));

        System.out.println("mll.size()= " + mll.size());
        System.out.println(mll);
        mll.printMyLinkedList();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Очистим MyArrayList с помощью метода .clear():");

        mll.clear();
        System.out.println("mll.isEmpty(): " + mll.isEmpty());
        System.out.println("mll.size(): " + mll.size());
        System.out.println(mll);
        mll.printMyLinkedList();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

    public boolean add(Object o) {
        boolean isAdd = false;
        ElementOfTheLinkedList aC = new ElementOfTheLinkedList();
        aC.setValue(o);
        if (this.getA0().getValue() == null) {
            this.setA0(aC);
        } else {

            aC.setNextElement(this.getA0());
            this.getA0().setPreviousElement(aC);

            aC.setPreviousElement(this.getaLast());
            this.getaLast().setNextElement(aC);
        }
        this.setaLast(aC);

        this.setSize(this.getSize() + 1);

        isAdd = true;
        return isAdd;
    }


    public boolean add(int position, Object o) {
        boolean isAdd = false;
        ElementOfTheLinkedList aC = new ElementOfTheLinkedList();
        aC.setValue(o);
        if (this.getA0().getValue() == null) {
            if (position == 0) {
                this.setA0(aC);
            } else {
                System.out.println("MyLinkedList has no elements yet.");
            }
        } else if (position == 0) {

            this.getA0().setPreviousElement(aC);
            this.getaLast().setNextElement(aC);

            aC.setPreviousElement(this.getaLast());
            aC.setNextElement(this.getA0());
            this.setA0(aC);

        } else {
            ElementOfTheLinkedList oldCurrent;
            ElementOfTheLinkedList oldNextCurrent;

            oldCurrent = this.getA0();
            for (int i = 1; i < position; i++) {
                oldCurrent = oldCurrent.getNextElement();
            }

            oldNextCurrent = oldCurrent.getNextElement();

            oldCurrent.setNextElement(aC);
            aC.setPreviousElement(oldCurrent);

            oldNextCurrent.setPreviousElement(aC);
            aC.setNextElement(oldNextCurrent);
        }


        this.setSize(this.getSize() + 1);

        isAdd = true;
        return isAdd;
    }


    public int size() {
        return this.getSize();
    }

    public void printMyLinkedList() {
        ElementOfTheLinkedList current;
        current = this.getA0();
        do {
            System.out.println(current);
            current = current.getNextElement();
        } while (current.getValue() != null && !(current.equals(this.getA0())));
    }

    public boolean isEmpty() {
        boolean isEmpty = true;
        if (this.size() != 0) {
            isEmpty = false;
        }
        return isEmpty;
    }

    public boolean contains(Object o) {
        boolean isContain = false;

        ElementOfTheLinkedList current;
        current = this.getA0();
        flagContains:
        do {
            if (current.getValue().equals(o)) {
                isContain = true;
                break flagContains;
            }
            current = current.getNextElement();
        } while (current.getValue() != null && !(current.equals(this.getA0())));

        return isContain;
    }


    public boolean remove(Object o) {
        boolean isRemove = false;
        boolean isContain = false;

        ElementOfTheLinkedList current;
        current = this.getA0();
        flagRemove:
        do {
            if (current.getValue().equals(o)) {
                isContain = true;
                current.getPreviousElement().setNextElement(current.getNextElement());
                current.getNextElement().setPreviousElement(current.getPreviousElement());

                isRemove = true;
                this.setSize(this.getSize() - 1);
                break flagRemove;
            }
            current = current.getNextElement();
        } while (current.getValue() != null && !(current.equals(this.getA0())));
        if (isContain == false) {
            System.out.println("Элемента " + o + " в MyLinkedList нет.");
        }

        return isRemove;
    }


    public void clear() {
        ElementOfTheLinkedList current;
        ElementOfTheLinkedList tmp;
        current = this.getA0();
        do {
            current.setValue(null);
            this.setSize(this.getSize() - 1);
            current = current.getNextElement();
        } while (current.getValue() != null && !(current.equals(this.getA0())));
    }

}
