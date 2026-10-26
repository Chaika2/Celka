/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rEy_1;
import celestial.rPY;
import java.util.EnumSet;
import java.util.Random;

public class rEt_1
extends rBk_1 {
    private final rEy_1 id_class;

    @Override
    public void id_byte() {
        Random random = this.id_class.Sa();
        double d = this.id_class.rx() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d2 = this.id_class.re() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d3 = this.id_class.BO() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        this.id_class.id_super().id_class(d, d2, d3, 1.0);
    }

    public rEt_1(rEy_1 rEy_12) {
        this.id_class = rEy_12;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        double d;
        double d2;
        rPY rPY2 = this.id_class.id_super();
        if (!rPY2.id_break()) {
            return true;
        }
        double d3 = rPY2.id_protected() - this.id_class.rx();
        double d4 = d3 * d3 + (d2 = rPY2.id_throws() - this.id_class.re()) * d2 + (d = rPY2.id_case() - this.id_class.BO()) * d;
        return d4 < 1.0 || d4 > 3600.0;
    }

    @Override
    public boolean id_break() {
        return false;
    }
}

