/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fj_3;

public class rrxC_2 {
    private fj_3 id_class;
    private int[] id_break;
    private int[] id_byte;

    public int[] id_byte() {
        return this.id_byte;
    }

    public rrxC_2(fj_3 fj_32, int[] nArray, int[] nArray2) {
        this.id_class = fj_32;
        this.id_break = nArray;
        this.id_byte = nArray2;
        if (nArray.length != nArray2.length) {
            throw new IllegalArgumentException(nArray.length + " != " + nArray2.length);
        }
    }

    public String toString() {
        return this.id_class.id_finally() + ", " + this.id_break.length;
    }

    public fj_3 id_class() {
        return this.id_class;
    }

    public int[] id_break() {
        return this.id_break;
    }
}

