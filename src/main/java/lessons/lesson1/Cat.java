/*
 *    Rizat.Orazalina created on 24.11.2021
 */

package lessons.lesson1;

public class Cat implements Players{

    private String name;
    private static final int MAXLENGTH = 200;
    private static final int MAXHEIGHT = 30;
    private boolean success = false;

    public Cat(String name) {
        this.name = name;
    }

    public int getMaxLength() {
        return MAXLENGTH;
    }

    public int getMaxHeight() {
        return MAXHEIGHT;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getName() {
        return name;
    }

    public String jump() {
        return "Кот " + name + " перепрыгнул";
    }

    public String run() {
        return "Кот " + name + " пробежал";
    }
}
