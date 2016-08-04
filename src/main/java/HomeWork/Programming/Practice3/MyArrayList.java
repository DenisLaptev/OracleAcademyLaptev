package HomeWork.Programming.Practice3;

import java.util.Arrays;

/**
 * Created by lapte on 09.06.2016.
 */
public class MyArrayList {
    //private Object[] arrayOfObjects = new Object[16];
    private Object[] arrayOfObjects = new Object[0];

    public Object[] getArrayOfObjects() {
        return arrayOfObjects;
    }

    public void setArrayOfObjects(Object[] arrayOfObjects) {
        this.arrayOfObjects = arrayOfObjects;
    }

    public int capacity() {
        return this.getArrayOfObjects().length;
    }

    public int size() {
        int sizeOfTheMyArrayList = 0;
        flag1:
        for (int i = this.getArrayOfObjects().length - 1; i >= 0; i--) {
            if (this.getArrayOfObjects()[i] != null) {
                sizeOfTheMyArrayList = i + 1;
                break flag1;
            }
        }
        return sizeOfTheMyArrayList;
    }


    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < this.getArrayOfObjects().length; i++) {
            if (this.getArrayOfObjects()[i] != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public boolean contains(Object o) {
        boolean isContain = false;
        for (int i = 0; i < this.getArrayOfObjects().length; i++) {
            if (this.getArrayOfObjects()[i].equals(o)) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    public boolean add(Object o) {
        boolean isAdd = false;
        Object[] newArrayOfObjects = new Object[this.getArrayOfObjects().length + 1];
        for (int i = 0; i < this.getArrayOfObjects().length; i++) {
            newArrayOfObjects[i] = this.getArrayOfObjects()[i];
        }
        newArrayOfObjects[this.getArrayOfObjects().length] = o;
        arrayOfObjects = newArrayOfObjects;
        isAdd = true;
        return isAdd;
    }

    public boolean remove(Object o) {
        boolean isRemove = false;
        Object[] newArrayOfObjects = new Object[this.getArrayOfObjects().length - 1];
        flag:
        for (int i = 0; i < this.getArrayOfObjects().length; i++) {
            if (this.getArrayOfObjects()[i].equals(o)) {
                for (int j = 0; j < i; j++) {
                    newArrayOfObjects[j] = this.getArrayOfObjects()[j];
                }
                for (int j = i; j < this.getArrayOfObjects().length - 1; j++) {
                    newArrayOfObjects[j] = this.getArrayOfObjects()[j + 1];
                }
                isRemove = true;
                break flag;
            }
        }
        arrayOfObjects = newArrayOfObjects;

        return isRemove;
    }


    public void clear() {
        for (int i = 0; i < this.getArrayOfObjects().length; i++) {
            this.getArrayOfObjects()[i] = null;
        }

        System.out.println("Содержание списка: " + Arrays.toString(arrayOfObjects));
    }

    @Override
    public String toString() {
        return "arrayOfObjects=" + Arrays.toString(arrayOfObjects);
    }

    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();
        System.out.println("Вначале, MyArrayList пустой:");
        System.out.println(mal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("mal.capacity(): " + mal.capacity());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("mal.size(): " + mal.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("mal.isEmpty(): " + mal.isEmpty());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Добавим элементы в MyArrayList с помощью метода .add():");

//        mal.add(5);
//        mal.add(10);
//        mal.add(15);
//        mal.add(20);
//        mal.add(25);
//        mal.add(30);
//        mal.add(35);

        System.out.println("mal.add(5)= " + mal.add(5));
        System.out.println("mal.add(10)= " + mal.add(10));
        System.out.println("mal.add(15)= " + mal.add(15));
        System.out.println("mal.add(20)= " + mal.add(20));
        System.out.println("mal.add(25)= " + mal.add(25));
        System.out.println("mal.add(30)= " + mal.add(30));
        System.out.println("mal.add(35)= " + mal.add(35));

        System.out.println("mal.isEmpty(): " + mal.isEmpty());
        System.out.println(mal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("mal.capacity(): " + mal.capacity());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("mal.size(): " + mal.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Проверим, содержит ли MyArrayList элементы 15, 30 с помощью метода .contains():");

        System.out.println("mal.contains(15): " + mal.contains(15));
        System.out.println("mal.contains(30): " + mal.contains(30));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Удалим элементы 15 и 30 из MyArrayList с помощью метода .remove():");

//        mal.remove(15);
//        mal.remove(30);

        System.out.println("mal.remove(15)= " + mal.remove(15));
        System.out.println("mal.remove(30)= " + mal.remove(30));

        System.out.println(mal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("mal.capacity(): " + mal.capacity());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("mal.size(): " + mal.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Проверим, содержит ли MyArrayList элементы 15, 30 с помощью метода .contains():");

        System.out.println("mal.contains(15): " + mal.contains(15));
        System.out.println("mal.contains(30): " + mal.contains(30));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Очистим MyArrayList с помощью метода .clear():");

        mal.clear();
        System.out.println("mal.isEmpty(): " + mal.isEmpty());
        System.out.println(mal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("mal.capacity(): " + mal.capacity());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("mal.size(): " + mal.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

}
