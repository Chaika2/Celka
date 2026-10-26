/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJQ;
import celestial.rJY;
import celestial.rOD;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rdy_3;

public class rJN
extends rJY {
    public final /* synthetic */ rOD id_class;

    public rJN(rJQ rJQ2, rXu_1 rXu_12, int n, int n2, int n3, rOD rOD2) {
        this.id_class = rOD2;
        super(rXu_12, n, n2, n3);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.hK && !this.id_break() && this.id_class.id_class();
    }

    @Override
    public boolean id_case() {
        return this.id_class.id_class();
    }
}

