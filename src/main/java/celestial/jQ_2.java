/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.tt_3;

public class jQ_2
extends tt_3 {
    private final Iq_1 id_break;
    private final Iq_1 id_byte;

    public jQ_2(float f) {
        this.id_return = 256;
        this.id_public = 256;
        float f2 = -16.0f;
        this.id_break = new Iq_1(this);
        this.id_break.id_class("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16, f, 176, 44);
        this.id_break.id_class("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16, f, 112, 30);
        this.id_break.id_implements = true;
        this.id_break.id_class("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, f, 0, 0);
        this.id_break.id_class("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, f, 112, 0);
        this.id_break.id_implements = false;
        this.id_break.id_class("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, f, 0, 0);
        this.id_break.id_class("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, f, 112, 0);
        this.id_byte = new Iq_1(this);
        this.id_byte.id_class(0.0f, 4.0f, -8.0f);
        this.id_byte.id_class("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16, f, 176, 65);
        this.id_break.id_break(this.id_byte);
    }

    @Override
    public void id_class(float f, float f2, float f3) {
        this.id_byte.id_case = (float)(Math.sin(f * (float)Math.PI * 0.2f) + 1.0) * 0.2f;
        this.id_break.id_catch = f2 * ((float)Math.PI / 180);
        this.id_break.id_case = f3 * ((float)Math.PI / 180);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        ml_1.id_class();
        ml_1.id_class(0.0, (double)-0.374375f, 0.0);
        ml_1.id_class(0.75f, 0.75f, 0.75f);
        this.id_break.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
        ml_1.id_break();
    }
}

