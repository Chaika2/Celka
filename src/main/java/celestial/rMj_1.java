/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rMl_1;
import celestial.rYB;
import celestial.rfU_2;
import java.util.EnumSet;

public class rMj_1
extends rBk_1 {
    private final rMl_1 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_public(true);
    }

    public rMj_1(rMl_1 rMl_12) {
        this.id_class = rMl_12;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
    }

    @Override
    public boolean id_class() {
        if ((this.id_class.n_() || this.id_class.sn()) && rMl_1.id_case(this.id_class)) {
            if (!this.id_class.sy()) {
                return false;
            }
            float f = ((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180);
            int n = 0;
            int n2 = 0;
            float f2 = -rfU_2.id_class(f);
            float f3 = rfU_2.id_break(f);
            if ((double)Math.abs(f2) > 0.5) {
                n = (int)((float)n + f2 / Math.abs(f2));
            }
            if ((double)Math.abs(f3) > 0.5) {
                n2 = (int)((float)n2 + f3 / Math.abs(f3));
            }
            if (((rYB)this.id_class.id_throws[7]).id_byte(this.id_class.Bs().id_break(n, -1, n2)).id_catch()) {
                return true;
            }
            if (this.id_class.sn() && rMl_1.id_catch(this.id_class).nextInt(60) == 1) {
                return true;
            }
            return rMl_1.id_private(this.id_class).nextInt(500) == 1;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return false;
    }

    @Override
    public boolean J_() {
        return false;
    }
}

