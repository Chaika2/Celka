/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rfU_2;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class tm_3
extends In_1 {
    private final Iq_1 id_class = new Iq_1(64, 32, 0, 0).id_class(-6.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f);
    private final Iq_1 id_break = new Iq_1(64, 32, 16, 0).id_class(0.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f);
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch = new Iq_1(64, 32, 12, 0).id_class(-1.0f, -5.0f, 0.0f, 2.0f, 10.0f, 0.005f);
    private final List<Iq_1> id_private;

    public tm_3() {
        super(HU::id_break);
        this.id_byte = new Iq_1(64, 32, 0, 10).id_class(0.0f, -4.0f, -0.99f, 5.0f, 8.0f, 1.0f);
        this.id_protected = new Iq_1(64, 32, 12, 10).id_class(0.0f, -4.0f, -0.01f, 5.0f, 8.0f, 1.0f);
        this.id_throws = new Iq_1(64, 32, 24, 10).id_class(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        this.id_case = new Iq_1(64, 32, 24, 10).id_class(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        this.id_private = ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_catch, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case);
        this.id_class.id_class(0.0f, 0.0f, -1.0f);
        this.id_break.id_class(0.0f, 0.0f, 1.0f);
        this.id_catch.id_catch = 1.5707964f;
    }

    public void id_class(float f, float f2, float f3, float f4) {
        float f5 = (rfU_2.id_class(f * 0.02f) * 0.1f + 1.25f) * f4;
        this.id_class.id_catch = (float)Math.PI + f5;
        this.id_break.id_catch = -f5;
        this.id_byte.id_catch = f5;
        this.id_protected.id_catch = -f5;
        this.id_throws.id_catch = f5 - f5 * 2.0f * f2;
        this.id_case.id_catch = f5 - f5 * 2.0f * f3;
        this.id_byte.id_byte = rfU_2.id_class(f5);
        this.id_protected.id_byte = rfU_2.id_class(f5);
        this.id_throws.id_byte = rfU_2.id_class(f5);
        this.id_case.id_byte = rfU_2.id_class(f5);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        this.id_break(ml_1, ok_1, n, n2, f, f2, f3, f4);
    }

    public void id_break(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        this.id_private.forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4));
    }
}

