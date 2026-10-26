/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjV_2;
import celestial.rjj_3;

public final class MH {
    public final rjV_2 id_class;
    public final rjj_3 id_break;

    public MH(rjV_2 rjV_22, rjj_3 rjj_32) {
        this.id_class = rjV_22;
        this.id_break = rjj_32;
    }

    public String toString() {
        return this.id_class.toString() + this.id_break.toString();
    }

    public rjV_2 id_class() {
        return this.id_class;
    }

    public rjj_3 id_break() {
        return this.id_break;
    }
}

