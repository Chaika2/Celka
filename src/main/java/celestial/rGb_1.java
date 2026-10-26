/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rGB;
import java.util.EnumSet;

public abstract class rGb_1
extends rBk_1 {
    public final /* synthetic */ rGB id_class;

    public rGb_1(rGB rGB2) {
        this.id_class = rGB2;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    protected boolean id_catch() {
        return this.id_class.id_break.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO()) < 4.0;
    }
}

