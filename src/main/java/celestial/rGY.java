/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.ay_3;
import celestial.rGg_1;
import celestial.rSM;

public class rGY
extends rSM {
    private final ay_3 id_break;
    public final /* synthetic */ rGg_1 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_byte(this.id_class.id_break.I_());
        super.id_byte();
    }

    public rGY(rGg_1 rGg_12, aA_2 aA_22) {
        this.id_class = rGg_12;
        super(aA_22, false);
        this.id_break = new ay_3().id_byte().id_throws();
    }

    @Override
    public boolean id_class() {
        return this.id_class.id_break != null && this.id_class.id_break.I_() != null && this.id_class(this.id_class.id_break.I_(), this.id_break);
    }
}

