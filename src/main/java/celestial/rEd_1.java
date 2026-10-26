/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rEx_1;
import celestial.rSW;

public class rEd_1
extends rSW {
    private final rEx_1 id_break;

    public rEd_1(rEx_1 rEx_12, double d, boolean bl) {
        super(rEx_12, d, bl);
        this.id_break = rEx_12;
    }

    @Override
    public boolean id_class() {
        return super.id_class() && this.id_break.id_private(this.id_break.I_());
    }

    @Override
    public boolean id_break() {
        return super.id_break() && this.id_break.id_private(this.id_break.I_());
    }
}

