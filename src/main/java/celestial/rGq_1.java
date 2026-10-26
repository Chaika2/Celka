/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rGT;
import celestial.rGp_1;
import java.util.EnumSet;

public class rGq_1
extends rBk_1 {
    public final /* synthetic */ rGp_1 id_break;

    @Override
    public void id_byte() {
        super.id_byte();
        rGp_1.id_class(this.id_break).id_final();
    }

    public rGq_1(rGp_1 rGp_12) {
        this.id_break = rGp_12;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return this.id_break.sl() > 0;
    }

    @Override
    public void id_throws() {
        if (this.id_break.I_() != null) {
            this.id_break.id_continue().id_class(this.id_break.I_(), (float)this.id_break.S(), (float)this.id_break.r());
        }
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_break.id_class(rGT.NONE);
    }
}

