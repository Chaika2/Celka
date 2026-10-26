/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.QY;
import celestial.an_3;
import celestial.rEI;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class tf_3
extends wN_2<rEI> {
    private static final float[] id_class = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
    private static final float[] id_break = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
    private static final float[] id_byte = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
    private static final float[] id_protected = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
    private static final float[] id_throws = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
    private static final float[] id_case = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1[] id_implements;
    private final Iq_1[] id_finally;

    public tf_3() {
        this.id_return = 64;
        this.id_public = 64;
        this.id_implements = new Iq_1[12];
        this.id_catch = new Iq_1(this);
        this.id_catch.id_class(0, 0).id_class(-6.0f, 10.0f, -8.0f, 12.0f, 12.0f, 16.0f);
        this.id_catch.id_class(0, 28).id_class(-8.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f);
        this.id_catch.id_class(0, 28).id_class(6.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f, true);
        this.id_catch.id_class(16, 40).id_class(-6.0f, 8.0f, -6.0f, 12.0f, 2.0f, 12.0f);
        this.id_catch.id_class(16, 40).id_class(-6.0f, 22.0f, -6.0f, 12.0f, 2.0f, 12.0f);
        for (int i = 0; i < this.id_implements.length; ++i) {
            this.id_implements[i] = new Iq_1(this, 0, 0);
            this.id_implements[i].id_class(-1.0f, -4.5f, -1.0f, 2.0f, 9.0f, 2.0f);
            this.id_catch.id_break(this.id_implements[i]);
        }
        this.id_private = new Iq_1(this, 8, 0);
        this.id_private.id_class(-1.0f, 15.0f, 0.0f, 2.0f, 2.0f, 1.0f);
        this.id_catch.id_break(this.id_private);
        this.id_finally = new Iq_1[3];
        this.id_finally[0] = new Iq_1(this, 40, 0);
        this.id_finally[0].id_class(-2.0f, 14.0f, 7.0f, 4.0f, 4.0f, 8.0f);
        this.id_finally[1] = new Iq_1(this, 0, 54);
        this.id_finally[1].id_class(0.0f, 14.0f, 0.0f, 3.0f, 3.0f, 7.0f);
        this.id_finally[2] = new Iq_1(this);
        this.id_finally[2].id_class(41, 32).id_class(0.0f, 14.0f, 0.0f, 2.0f, 2.0f, 6.0f);
        this.id_finally[2].id_class(25, 19).id_class(1.0f, 10.5f, 3.0f, 1.0f, 9.0f, 9.0f);
        this.id_catch.id_break(this.id_finally[0]);
        this.id_finally[0].id_break(this.id_finally[1]);
        this.id_finally[1].id_break(this.id_finally[2]);
        this.id_class(0.0f, 0.0f);
    }

    private void id_class(float f, float f2) {
        for (int i = 0; i < 12; ++i) {
            this.id_implements[i].id_case = (float)Math.PI * id_class[i];
            this.id_implements[i].id_catch = (float)Math.PI * id_break[i];
            this.id_implements[i].id_private = (float)Math.PI * id_byte[i];
            this.id_implements[i].id_byte = id_protected[i] * (1.0f + rfU_2.id_break(f * 1.5f + (float)i) * 0.01f - f2);
            this.id_implements[i].id_protected = 16.0f + id_throws[i] * (1.0f + rfU_2.id_break(f * 1.5f + (float)i) * 0.01f - f2);
            this.id_implements[i].id_throws = id_case[i] * (1.0f + rfU_2.id_break(f * 1.5f + (float)i) * 0.01f - f2);
        }
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_catch);
    }

    @Override
    public void id_class(rEI rEI2, float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 - (float)((Integer)rEI2.id_throws[41]).intValue();
        this.id_catch.id_catch = f4 * ((float)Math.PI / 180);
        this.id_catch.id_case = f5 * ((float)Math.PI / 180);
        float f7 = (1.0f - rEI2.id_interface(f6)) * 0.55f;
        this.id_class(f3, f7);
        this.id_private.id_throws = -8.25f;
        an_3 an_32 = QY.id_instanceof().id_catch();
        if (rEI2.sk()) {
            an_32 = rEI2.sW();
        }
        if (an_32 != null) {
            rjU_2 rjU_22 = an_32.id_new(0.0f);
            rjU_2 rjU_23 = rEI2.id_new(0.0f);
            double d = rjU_22.id_byte - rjU_23.id_byte;
            this.id_private.id_protected = d > 0.0 ? 0.0f : 1.0f;
            rjU_2 rjU_24 = rEI2.id_break(0.0f);
            rjU_24 = new rjU_2(rjU_24.id_break, 0.0, rjU_24.id_protected);
            rjU_2 rjU_25 = new rjU_2(rjU_23.id_break - rjU_22.id_break, 0.0, rjU_23.id_protected - rjU_22.id_protected).id_protected().id_break(1.5707964f);
            double d2 = rjU_24.id_break(rjU_25);
            this.id_private.id_byte = rfU_2.id_byte((float)Math.abs(d2)) * 2.0f * (float)Math.signum(d2);
        }
        this.id_private.id_finally = true;
        float f8 = rEI2.id_throw(f6);
        this.id_finally[0].id_catch = rfU_2.id_class(f8) * (float)Math.PI * 0.05f;
        this.id_finally[1].id_catch = rfU_2.id_class(f8) * (float)Math.PI * 0.1f;
        this.id_finally[1].id_byte = -1.5f;
        this.id_finally[1].id_protected = 0.5f;
        this.id_finally[1].id_throws = 14.0f;
        this.id_finally[2].id_catch = rfU_2.id_class(f8) * (float)Math.PI * 0.15f;
        this.id_finally[2].id_byte = 0.5f;
        this.id_finally[2].id_protected = 0.5f;
        this.id_finally[2].id_throws = 6.0f;
    }
}

