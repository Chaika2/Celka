/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rGA;
import celestial.rGy_1;
import celestial.rhd_3;
import celestial.rhx_3;
import java.util.EnumSet;

public class rGn_1
extends rBk_1 {
    private final rGA id_class;
    private int id_break;

    @Override
    public void id_byte() {
        this.id_break = 300;
        super.id_byte();
    }

    public rGn_1(rGA rGA2) {
        this.id_class = rGA2;
        this.id_class(EnumSet.of(rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 == null) {
            return false;
        }
        if (!iB_22.BM()) {
            return false;
        }
        return iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_class ? false : this.id_class.id_super() instanceof rGy_1;
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 == null) {
            return false;
        }
        if (!iB_22.BM()) {
            return false;
        }
        if (iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_class) {
            return false;
        }
        return --this.id_break > 0;
    }

    @Override
    public void id_throws() {
        this.id_class.id_class((an_3)this.id_class.I_(), 10.0f, 10.0f);
        ((rGy_1)this.id_class.id_super()).id_class(((Float)this.id_class.id_throws[15]).floatValue(), this.id_class.n());
    }
}

