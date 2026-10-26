/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rOJ;
import celestial.rfU_2;

public class rOd_1
extends rBk_1 {
    private final rOJ id_class;

    public rOd_1(rOJ rOJ2, rOJ rOJ3) {
        this.id_class = rOJ3;
    }

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public void id_throws() {
        int n = this.id_class.BI();
        if (n > 100) {
            this.id_class.id_byte(0.0f, 0.0f, 0.0f);
        } else if (this.id_class.Sa().nextInt(50) == 0 || !rOJ.id_class(this.id_class) || !this.id_class.L()) {
            float f = this.id_class.Sa().nextFloat() * ((float)Math.PI * 2);
            float f2 = rfU_2.id_break(f) * 0.2f;
            float f3 = -0.1f + this.id_class.Sa().nextFloat() * 0.2f;
            float f4 = rfU_2.id_class(f) * 0.2f;
            this.id_class.id_byte(f2, f3, f4);
        }
    }
}

