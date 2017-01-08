package taulellinternes;

public class TaulellInternes {

    int x,y;
    Casella in;

    public void TaulellInternes(int x, int y) {
        this.x = x;
        this.y = y;
    }


    class Casella {

       boolean estat;

        public Casella(boolean estat) {
            this.estat = estat;
        }

        public boolean isEstat() {
            return estat;
        }

        public void setEstat(boolean estat) {
            this.estat = estat;
        }

        

    }
}
