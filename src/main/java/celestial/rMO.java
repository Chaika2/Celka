/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rPR;
import celestial.rba_3;

public class rMO
extends rPR {
    public final /* synthetic */ rba_3 id_private;

    public rMO(rba_3 rba_32) {
        this.id_private = rba_32;
        super(rba_32);
    }

    @Override
    public void id_class() {
        if (!this.id_private.Sc()) {
            super.id_class();
        }
    }

    @Override
    protected boolean id_break() {
        return !this.id_private.sd() && !this.id_private.x() && !this.id_private.su() & !this.id_private.sx();
    }
}

