/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rGA;
import celestial.rGy_1;
import java.util.EnumSet;

public class rGH
extends rBk_1 {
    private final rGA id_class;

    public rGH(rGA rGA2) {
        this.id_class = rGA2;
        this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        return !this.id_class.Pm();
    }

    @Override
    public void id_throws() {
        ((rGy_1)this.id_class.id_super()).id_class(1.0);
    }
}

