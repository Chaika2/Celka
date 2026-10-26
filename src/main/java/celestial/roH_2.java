/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;

public class roH_2 {
    protected byte[] id_class;

    public boolean id_byte() {
        return this.id_class == null;
    }

    private int id_byte(int n) {
        return n >> 1;
    }

    public roH_2() {
    }

    protected roH_2(int n) {
        this.id_class = new byte[n];
    }

    public roH_2(byte[] byArray) {
        this.id_class = byArray;
        if (byArray.length != 2048) {
            throw rqR_2.id_byte(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + byArray.length));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4096; ++i) {
            stringBuilder.append(Integer.toHexString(this.id_class(i)));
            if ((i & 0xF) == 15) {
                stringBuilder.append("\n");
            }
            if ((i & 0xFF) != 255) continue;
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public byte[] id_class() {
        if (this.id_class == null) {
            this.id_class = new byte[2048];
        }
        return this.id_class;
    }

    private void id_class(int n, int n2) {
        if (this.id_class == null) {
            this.id_class = new byte[2048];
        }
        int n3 = this.id_byte(n);
        this.id_class[n3] = this.id_break(n) ? (byte)(this.id_class[n3] & 0xF0 | n2 & 0xF) : (byte)(this.id_class[n3] & 0xF | (n2 & 0xF) << 4);
    }

    public int id_class(int n, int n2, int n3) {
        return this.id_class(this.id_break(n, n2, n3));
    }

    public void id_class(int n, int n2, int n3, int n4) {
        this.id_class(this.id_break(n, n2, n3), n4);
    }

    private int id_class(int n) {
        if (this.id_class == null) {
            return 0;
        }
        int n2 = this.id_byte(n);
        return this.id_break(n) ? this.id_class[n2] & 0xF : this.id_class[n2] >> 4 & 0xF;
    }

    private boolean id_break(int n) {
        return (n & 1) == 0;
    }

    public roH_2 id_break() {
        return this.id_class == null ? new roH_2() : new roH_2((byte[])this.id_class.clone());
    }

    protected int id_break(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }
}

