/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rqO_2;

public class wp_3
extends In_1 {
    public static final rqO_2 id_class = new rqO_2("textures/entity/trident.png");
    private final Iq_1 id_break = new Iq_1(32, 32, 0, 6);

    public wp_3() {
        super(HU::id_break);
        this.id_break.id_class(-0.5f, 2.0f, -0.5f, 1.0f, 25.0f, 1.0f, 0.0f);
        Iq_1 iq_1 = new Iq_1(32, 32, 4, 0);
        iq_1.id_class(-1.5f, 0.0f, -0.5f, 3.0f, 2.0f, 1.0f);
        this.id_break.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(32, 32, 4, 3);
        iq_12.id_class(-2.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f);
        this.id_break.id_break(iq_12);
        Iq_1 iq_13 = new Iq_1(32, 32, 0, 0);
        iq_13.id_class(-0.5f, -4.0f, -0.5f, 1.0f, 4.0f, 1.0f, 0.0f);
        this.id_break.id_break(iq_13);
        Iq_1 iq_14 = new Iq_1(32, 32, 4, 3);
        iq_14.id_implements = true;
        iq_14.id_class(1.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f);
        this.id_break.id_break(iq_14);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        this.id_break.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
    }
}

