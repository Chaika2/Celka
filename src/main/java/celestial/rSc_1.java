/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rSN;
import java.util.EnumSet;

public class rSc_1
extends rBk_1 {
    public final /* synthetic */ rSN id_class;

    public rSc_1(rSN rSN2) {
        this.id_class = rSN2;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.JUMP, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return this.id_class.n() > 0;
    }
}

