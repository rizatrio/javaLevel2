/*
 *    Rizat.Orazalina created on 24.11.2021
 */

package lessons.lesson1;

public class RunningTrack implements Barriers {
    private int length;

    public String check(Players player) {
        player.run();
        player.setSuccess(length < player.getMaxLength());
        if (player.getSuccess()) {
            return player.getName() + " успешно пробежал";
        }
        return player.getName() + " не пробежал";
    }
}
