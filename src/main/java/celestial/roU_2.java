/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.BitSet;

public class roU_2 {
    private final BitSet id_class = new BitSet();

    public int id_class(int n) {
        int n2 = 0;
        while (true) {
            int n3;
            int n4;
            if ((n4 = this.id_class.nextSetBit(n3 = this.id_class.nextClearBit(n2))) == -1 || n4 - n3 >= n) {
                this.id_class(n3, n);
                return n3;
            }
            n2 = n4;
        }
    }

    public void id_class(int n, int n2) {
        this.id_class.set(n, n + n2);
    }

    public void id_break(int n, int n2) {
        this.id_class.clear(n, n + n2);
    }
}

