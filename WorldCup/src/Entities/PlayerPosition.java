
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

    public int getIdPosition() {
        return idPlayerPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPlayerPosition = idPosition;
    }

    public String getPositionName() {
        return playerPositionName;
    }

    public void setPositionName(String positionName) {
        this.playerPositionName = positionName;
    }

    @Override
    public String toString() {
        return "PlayerPosition{" + "idPosition=" + idPlayerPosition + ", positionName=" + playerPositionName + '}';
    }
}
