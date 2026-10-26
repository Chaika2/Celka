/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.tt_3;

public class tg_3
extends tt_3 {
    private final Iq_1 id_break = new Iq_1(this, 32, 0);

    public tg_3() {
        super(0, 0, 64, 64);
        this.id_break.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, 0.25f);
        this.id_break.id_class(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void id_class(float f, float f2, float f3) {
        super.id_class(f, f2, f3);
        this.id_break.id_catch = this.id_class.id_catch;
        this.id_break.id_case = this.id_class.id_case;
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        super.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
        this.id_break.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
    }
}

