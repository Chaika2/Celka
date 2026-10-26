/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ay_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEB;
import celestial.rYB;
import celestial.rsi_3;
import java.util.EnumSet;

public class rEs_1
extends rBk_1 {
    private final rEB id_break;
    private final float id_byte;
    public final ay_3 id_class = new ay_3().id_class(8.0).id_protected().id_class().id_break().id_byte().id_throws();

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_break.id_public().id_final();
        for (rEB rEB2 : ((rYB)this.id_break.id_throws[7]).id_class(rEB.class, this.id_class, this.id_break, this.id_break.rN().id_byte(8.0, 8.0, 8.0))) {
            rEB2.id_byte(this.id_break.I_());
        }
    }

    public rEs_1(rEB rEB2, rsi_3 rsi_32, float f) {
        this.id_break = rsi_32;
        this.id_byte = f * f;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_break.Sr();
        return this.id_break.sx() == null && this.id_break.sA() && this.id_break.I_() != null && !this.id_break.v() && (iB_22 == null || iB_22.BC() != aI_2.rM);
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_break.I_();
        if (iB_22 != null) {
            if (this.id_break.id_int(iB_22) > (double)this.id_byte) {
                this.id_break.id_continue().id_class(iB_22, 30.0f, 30.0f);
                if (rEB.id_throws(this.id_break).nextInt(50) == 0) {
                    this.id_break.id_long();
                }
            } else {
                this.id_break.id_case(true);
            }
            super.id_throws();
        }
    }

    @Override
    public void id_protected() {
        super.id_protected();
        iB_2 iB_22 = this.id_break.I_();
        if (iB_22 != null) {
            for (rEB rEB2 : ((rYB)this.id_break.id_throws[7]).id_class(rEB.class, this.id_class, this.id_break, this.id_break.rN().id_byte(8.0, 8.0, 8.0))) {
                rEB2.id_byte(iB_22);
                rEB2.id_case(true);
            }
            this.id_break.id_case(true);
        }
    }
}

