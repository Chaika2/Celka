/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;

public class rPg_1 {
    private final is_3 id_break;
    protected boolean id_class;

    public rPg_1(is_3 is_32) {
        this.id_break = is_32;
    }

    public void id_class() {
        this.id_class = true;
    }

    public void id_break() {
        this.id_break.id_super(this.id_class);
        this.id_class = false;
    }
}

