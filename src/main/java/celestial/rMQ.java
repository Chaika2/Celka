/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rSb_1;
import celestial.rba_3;
import celestial.rlG_2;

public class rMQ
extends rSb_1 {
    public final /* synthetic */ rba_3 id_class;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_class.sL();
    }

    public rMQ(rba_3 rba_32) {
        this.id_class = rba_32;
        super(rba_32);
    }

    @Override
    public boolean id_class() {
        return this.id_class.rT() && this.id_class.id_break(rlG_2.id_break) > 0.25 || this.id_class.ry();
    }
}

