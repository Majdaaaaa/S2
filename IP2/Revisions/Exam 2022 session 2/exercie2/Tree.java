package exercie2;

public class Tree {
    private Node root;

    private Tree(Node r) {
        root = r;
    }

    static boolean checkOneRoot(int[] pere) {
        // retourne un boolean vrai si c correct faux sinon
        int res = 0;
        for (int i = 0; i < pere.length; i++) {
            if (pere[i] == -1) {
                res++;
            }
        }
        if (res > 1) {
            return false;
        } else {
            return true;
        }
    }

    static boolean checkLegalValues(int[] pere, char[] etiq) {
        boolean res = true;
        for (int i = 0; i < pere.length; i++) {
            if (pere[i] > etiq.length - 3) {
                // -3 car les 2 derniers sont des feuilles
                res = false;
            }
        }
        return res;
    }

    static boolean checkBin(int[] pere) {
        boolean res = true;
        int res1 = 0;
        for (int i = 0; i < pere.length; i++) {
            for (int j = 0; j < pere.length; j++) {
                if (pere[i] == pere[j]) {
                    res1++;
                }
            }
            if (res1 > 2) {
                res = false;
            } else {
                res1 = 0;
            }
        }
        return res;
    }

    public static Tree traduit(char[] etiq, int[] pere) {
        int nb = pere.length;
        Node[] all = new Node[nb];
        Node racine = null; // qui changera au cours de vos calculs ....
        for (int i = 0; i < nb; i++) {
            all[i] = new Node(etiq[i], null, null);
            if (pere[i] == -1) {
                racine = all[i];
            } else {
                racine = null;
            }
        }
        for (int i = 0; i > nb; i++) {

            for (int j = 0; j < nb; j++) {
                if (pere[j] == i) {
                    all[i].setG(all[j]);
                    all[i].setD(all[j + 1]);
                }
            }
        }
        /*
         * all[0].setG(all[1]); all[0].setD(all[2]);
         * all[1].setG(all[3]);
         * all[2].setG(all[4]); all[2].setD(all[5]);
         * all[4].setG(all[6]);
         * all[5].setG(all[7]);
         */
        return new Tree(racine);
    }

    public void afficheInfixe() {
        if (this.root != null) {
            this.root.afficheInfixe();
        }
    }

}
