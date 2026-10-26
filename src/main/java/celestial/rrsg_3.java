/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.roH_2;

public class rrsg_3
extends roH_2 {
    public rrsg_3() {
        super(128);
    }

    public rrsg_3(roH_2 roH_22, int n) {
        super(128);
        System.arraycopy(roH_22.id_class(), n * 128, this.id_class, 0, 128);
    }

    @Override
    public byte[] id_class() {
        byte[] byArray = new byte[2048];
        for (int i = 0; i < 16; ++i) {
            System.arraycopy(this.id_class, 0, byArray, i * 128, 128);
        }
        return byArray;
    }

    @Override
    protected int id_break(int n, int n2, int n3) {
        return n3 << 4 | n;
    }
}

