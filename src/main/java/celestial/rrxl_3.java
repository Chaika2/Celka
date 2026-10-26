/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWo_1;

public class rrxl_3 {
    private int id_class = -1;
    private int id_break = 0;
    private rrWo_1<rrxl_3> id_byte = new rrWo_1<rrxl_3>(this);

    public int id_byte() {
        return this.id_class + this.id_break;
    }

    public String toString() {
        return this.id_class + "/" + this.id_break + "/" + (this.id_class + this.id_break);
    }

    public void id_class(int n) {
        this.id_class = n;
    }

    public int id_class() {
        return this.id_class;
    }

    public void id_break(int n) {
        this.id_break = n;
    }

    public int id_break() {
        return this.id_break;
    }

    public rrxl_3 id_throws() {
        rrWo_1<rrxl_3> rrWo_12 = this.id_byte.id_break();
        return rrWo_12 == null ? null : rrWo_12.id_class();
    }

    public rrxl_3 id_case() {
        rrWo_1<rrxl_3> rrWo_12 = this.id_byte.id_byte();
        return rrWo_12 == null ? null : rrWo_12.id_class();
    }

    public rrWo_1<rrxl_3> id_protected() {
        return this.id_byte;
    }
}

