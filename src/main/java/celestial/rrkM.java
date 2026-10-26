/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.Ml_1;
import celestial.rqO_2;
import celestial.rrXi_1;
import celestial.rrbb_3;

public class rrkM
extends rrXi_1 {
    public rrkM(int n, int n2, int n3) {
        super(n, n2, n3, 22, 20, "");
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_new) {
            super.id_class(ml_1, n, n2, f);
            rqO_2 rqO_22 = new rqO_2("optifine/textures/icons.png");
            rrbb_3.J().id_class(rqO_22);
            MT.id_protected(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_break(ml_1, this.id_volatile + 3, this.id_final + 2, 0, 0, 16, 16);
        }
    }
}

