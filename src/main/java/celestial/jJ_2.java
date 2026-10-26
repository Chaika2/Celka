/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;

public final class jJ_2
extends In_1 {
    public final Iq_1 id_class = new Iq_1(64, 32, 0, 0);
    public final Iq_1 id_break;

    public jJ_2() {
        super(HU::id_protected);
        this.id_class.id_class(-12.0f, -14.0f, -1.0f, 24.0f, 12.0f, 2.0f, 0.0f);
        this.id_break = new Iq_1(64, 32, 0, 14);
        this.id_break.id_class(-1.0f, -2.0f, -1.0f, 2.0f, 14.0f, 2.0f, 0.0f);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        this.id_class.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
        this.id_break.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
    }
}

