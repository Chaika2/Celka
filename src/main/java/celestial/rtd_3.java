/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rtd_3 {
    private final byte[] id_class;

    public rtd_3() {
        this.id_class = new byte[2048];
    }

    public rtd_3(byte[] byArray) {
        this.id_class = byArray;
        if (byArray.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + byArray.length);
        }
    }

    private boolean id_class(int n) {
        return (n & 1) == 0;
    }

    public int id_class(int n, int n2, int n3) {
        int n4 = this.id_break(n2 << 8 | n3 << 4 | n);
        return this.id_class(n2 << 8 | n3 << 4 | n) ? this.id_class[n4] & 0xF : this.id_class[n4] >> 4 & 0xF;
    }

    private int id_break(int n) {
        return n >> 1;
    }
}

