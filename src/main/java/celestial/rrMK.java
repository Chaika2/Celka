/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import celestial.rrMU;

public class rrMK {
    private String id_class = null;
    private String id_break = null;
    private rqO_2 id_byte = null;
    private rrMU[] id_protected = null;
    private float id_throws = 0.0f;

    public rqO_2 id_byte() {
        return this.id_byte;
    }

    public rrMK(String string, String string2, rqO_2 rqO_22, rrMU[] rrMUArray, float f) {
        this.id_class = string;
        this.id_break = string2;
        this.id_byte = rqO_22;
        this.id_protected = rrMUArray;
        this.id_throws = f;
    }

    public String id_class() {
        return this.id_class;
    }

    public String id_break() {
        return this.id_break;
    }

    public float id_throws() {
        return this.id_throws;
    }

    public rrMU[] id_protected() {
        return this.id_protected;
    }
}

