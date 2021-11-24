/*
 *    Rizat.Orazalina created on 24.11.2021
 */

package lessons.lesson1;

public class Wall implements Barriers {
    private int height;

    public String check(Players player) {
        player.jump();
        player.setSuccess(height < player.getMaxHeight());
        if (player.getSuccess()) {
            return player.getName() + " успешно перепрыгнул";
        }
        return player.getName() + " не перепрыгнул";
    }
}
