/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEy_1;
import celestial.rfU_2;
import celestial.rjU_2;
import java.util.EnumSet;

public class rEq_1
extends rBk_1 {
    private final rEy_1 id_class;

    public rEq_1(rEy_1 rEy_12) {
        this.id_class = rEy_12;
        this.id_class(EnumSet.of(rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public void id_throws() {
        if (this.id_class.I_() == null) {
            rjU_2 rjU_22 = this.id_class.rv();
            Float f = Float.valueOf(-((float)rfU_2.id_protected(rjU_22.id_break, rjU_22.id_protected)) * 57.295776f);
            this.id_class.id_throws[15] = f;
            Float f2 = Float.valueOf(((Float)this.id_class.id_throws[15]).floatValue());
            this.id_class.id_private[23] = f2;
        } else {
            iB_2 iB_22 = this.id_class.I_();
            if (iB_22.id_int(this.id_class) < 4096.0) {
                double d = iB_22.rx() - this.id_class.rx();
                double d2 = iB_22.BO() - this.id_class.BO();
                Float f = Float.valueOf(-((float)rfU_2.id_protected(d, d2)) * 57.295776f);
                this.id_class.id_throws[15] = f;
                Float f3 = Float.valueOf(((Float)this.id_class.id_throws[15]).floatValue());
                this.id_class.id_private[23] = f3;
            }
        }
    }
}

