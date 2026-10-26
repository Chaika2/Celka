/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;

public class tt_3
extends In_1 {
    protected final Iq_1 id_class;

    public tt_3() {
        this(0, 35, 64, 64);
    }

    public tt_3(int n, int n2, int n3, int n4) {
        super(HU::id_private);
        this.id_return = n3;
        this.id_public = n4;
        this.id_class = new Iq_1(this, n, n2);
        this.id_class.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, 0.0f);
        this.id_class.id_class(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        this.id_class.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
    }

    public void id_class(float f, float f2, float f3) {
        this.id_class.id_catch = f2 * ((float)Math.PI / 180);
        this.id_class.id_case = f3 * ((float)Math.PI / 180);
    }
}

