/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjK_2;
import celestial.rrLx_1;

public class rqr_3 {
    public float id_break;
    public float id_byte;
    public boolean id_protected;
    public boolean id_throws;
    public boolean id_case;
    public boolean id_catch;
    public boolean id_private;
    public boolean id_implements;
    public boolean id_finally;
    public boolean id_extends;
    public boolean id_native;

    public boolean id_byte() {
        return Math.abs(this.id_break) > 1.0E-5f;
    }

    public void id_class(boolean bl) {
    }

    public rjK_2 id_class() {
        return new rjK_2(this.id_break, this.id_byte);
    }

    public void id_break(boolean bl) {
        this.id_protected = bl;
        this.id_throws = bl;
        this.id_case = bl;
        this.id_catch = bl;
    }

    public boolean id_break() {
        return rrLx_1.id_class(this.id_byte > 1.0E-5f).id_class();
    }

    public boolean id_protected() {
        return this.id_byte() || Math.abs(this.id_byte) > 1.0E-5f;
    }
}

