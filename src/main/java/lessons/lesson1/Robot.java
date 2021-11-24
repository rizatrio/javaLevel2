/*
 *    Rizat.Orazalina created on 24.11.2021
 */

package lessons.lesson1;

public class Robot implements Players{

    private String name;
    private static final int MAXLENGTH = 300;
    private static final int MAXHEIGHT = 50;
    private boolean success = false;

    public Robot(String name) {
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
        return "Робот " + name + " перепрыгнул";
    }

    public String run() {
        return "Робот " + name + " пробежал";
    }
}
