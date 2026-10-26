/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdD;

public class rrdV {
    private String id_class;
    private rrdD[] id_break;
    private int id_byte;

    public int id_byte() {
        return this.id_byte;
    }

    public rrdV(String string, rrdD[] rrdDArray, int n) {
        this.id_class = string;
        this.id_break = rrdDArray;
        this.id_byte = n;
    }

    public String id_class() {
        return this.id_class;
    }

    public rrdD[] id_break() {
        return this.id_break;
    }
}

