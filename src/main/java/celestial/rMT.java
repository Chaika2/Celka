/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rMl_1;

public class rMT
extends rBk_1 {
    private final rMl_1 id_class;
    private int id_break;

    @Override
    public void id_byte() {
        this.id_class.id_else(true);
        this.id_break = 0;
    }

    public rMT(rMl_1 rMl_12) {
        this.id_class = rMl_12;
    }

    @Override
    public boolean id_class() {
        return this.id_break < (Integer)this.id_class.id_throws[41] && this.id_class.sL() && this.id_class.sy() && rMl_1.id_byte(this.id_class).nextInt(400) == 1;
    }

    @Override
    public boolean id_break() {
        if (!this.id_class.rT() && (this.id_class.sL() || rMl_1.id_protected(this.id_class).nextInt(600) != 1)) {
            return rMl_1.id_throws(this.id_class).nextInt(2000) != 1;
        }
        return false;
    }

    @Override
    public void id_protected() {
        this.id_class.id_else(false);
        this.id_break = (Integer)this.id_class.id_throws[41] + 200;
    }
}

