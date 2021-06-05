package responsepojo;

import java.util.List;

public class Fairings {
    public Object reused;
    public boolean recovery_attempt;
    public Object recovered;

    public Object getReused() {
        return reused;
    }

    public void setReused(Object reused) {
        this.reused = reused;
    }

    public boolean isRecovery_attempt() {
        return recovery_attempt;
    }

    public void setRecovery_attempt(boolean recovery_attempt) {
        this.recovery_attempt = recovery_attempt;
    }

    public Object getRecovered() {
        return recovered;
    }

    public void setRecovered(Object recovered) {
        this.recovered = recovered;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public List<String> ships;
}
