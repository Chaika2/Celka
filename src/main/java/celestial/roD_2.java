/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class roD_2 {
    public final byte[] id_class;
    private final int id_break;
    private final int id_byte;

    public roD_2(byte[] byArray, int n) {
        this.id_class = byArray;
        this.id_break = n;
        this.id_byte = n + 4;
    }

    public int id_class(int n, int n2, int n3) {
        int n4 = n << this.id_byte | n3 << this.id_break | n2;
        int n5 = n4 >> 1;
        int n6 = n4 & 1;
        return n6 == 0 ? this.id_class[n5] & 0xF : this.id_class[n5] >> 4 & 0xF;
    }
}

