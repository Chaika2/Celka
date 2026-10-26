/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rba_3;
import java.util.EnumSet;

public class rMM
extends rBk_1 {
    public int id_class;
    public final /* synthetic */ rba_3 id_break;

    @Override
    public void id_byte() {
        this.id_class = 40;
    }

    public rMM(rba_3 rba_32) {
        this.id_break = rba_32;
        this.id_class(EnumSet.of(rBW.LOOK, rBW.JUMP, rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        return this.id_break.sx();
    }

    @Override
    public boolean id_break() {
        return this.id_class() && this.id_class > 0;
    }

    @Override
    public void id_throws() {
        --this.id_class;
    }

    @Override
    public void id_protected() {
        this.id_break.id_public(false);
    }
}

