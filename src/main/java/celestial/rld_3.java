/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rlh_3;

public class rld_3 {
    private final rlh_3 id_class;
    private final String id_break;

    public rld_3(rlh_3 rlh_32, String string) {
        this.id_class = rlh_32;
        this.id_break = string;
    }

    public String toString() {
        return this.id_class.toString() + " (from " + this.id_break + ")";
    }

    public rlh_3 id_class() {
        return this.id_class;
    }
}

