/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rGz_1;

public class rGm_1
extends rBk_1 {
    private int id_break;
    public final /* synthetic */ rGz_1 id_class;

    @Override
    public void id_byte() {
        this.id_break = 20 * (1 + rGz_1.id_throws(this.id_class).nextInt(3));
        this.id_class.id_class(30);
    }

    public rGm_1(rGz_1 rGz_12) {
        this.id_class = rGz_12;
    }

    @Override
    public boolean id_class() {
        return this.id_class.I_() == null && rGz_1.id_protected(this.id_class).nextInt(40) == 0;
    }

    @Override
    public boolean id_break() {
        return this.id_class.I_() == null && this.id_break > 0;
    }

    @Override
    public void id_throws() {
        --this.id_break;
    }

    @Override
    public void id_protected() {
        if (this.id_class.I_() == null) {
            this.id_class.id_class(0);
        }
    }
}

