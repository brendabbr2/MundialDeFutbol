
package Entities;

/**
 *
 * @author david
 */
public class PlayerPosition {
    private int idPlayerPosition;
    private String playerPositionName;

    public PlayerPosition(int idPosition, String positionName) {
        this.idPlayerPosition = idPosition;
        this.playerPositionName = positionName;
    }

    public int getIdPlayerPosition() {
        return idPlayerPosition;
    }

    public void setIdPlayerPosition(int idPosition) {
        this.idPlayerPosition = idPosition;
    }

    public String getPlayerPositionName() {
        return playerPositionName;
    }

    public void setPlayerPositionName(String positionName) {
        this.playerPositionName = positionName;
    }

    @Override
    public String toString() {
        return "PlayerPosition{" + "idPosition=" + idPlayerPosition + ", positionName=" + playerPositionName + '}';
    }
}
