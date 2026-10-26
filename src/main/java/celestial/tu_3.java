/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.Iq_1;
import celestial.rSK;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public class tu_3
extends wN_2<rSK> {
    private final Iq_1[] id_class = new Iq_1[2];
    private final Iq_1 id_break;
    private final ImmutableList<Iq_1> id_byte;

    public Iq_1 id_byte() {
        return this.id_break;
    }

    public tu_3() {
        Iq_1[] iq_1Array = new Iq_1[]{new Iq_1(this, 0, 0).id_break(128, 64), new Iq_1(this, 0, 19).id_break(128, 64), new Iq_1(this, 0, 27).id_break(128, 64), new Iq_1(this, 0, 35).id_break(128, 64), new Iq_1(this, 0, 43).id_break(128, 64)};
        int n = 32;
        int n2 = 6;
        int n3 = 20;
        int n4 = 4;
        int n5 = 28;
        iq_1Array[0].id_class(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f, 0.0f);
        iq_1Array[0].id_class(0.0f, 3.0f, 1.0f);
        iq_1Array[1].id_class(-13.0f, -7.0f, -1.0f, 18.0f, 6.0f, 2.0f, 0.0f);
        iq_1Array[1].id_class(-15.0f, 4.0f, 4.0f);
        iq_1Array[2].id_class(-8.0f, -7.0f, -1.0f, 16.0f, 6.0f, 2.0f, 0.0f);
        iq_1Array[2].id_class(15.0f, 4.0f, 0.0f);
        iq_1Array[3].id_class(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f, 0.0f);
        iq_1Array[3].id_class(0.0f, 4.0f, -9.0f);
        iq_1Array[4].id_class(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f, 0.0f);
        iq_1Array[4].id_class(0.0f, 4.0f, 9.0f);
        iq_1Array[0].id_case = 1.5707964f;
        iq_1Array[1].id_catch = 4.712389f;
        iq_1Array[2].id_catch = 1.5707964f;
        iq_1Array[3].id_catch = (float)Math.PI;
        this.id_class[0] = this.id_class(true);
        this.id_class[0].id_class(3.0f, -5.0f, 9.0f);
        this.id_class[1] = this.id_class(false);
        this.id_class[1].id_class(3.0f, -5.0f, -9.0f);
        this.id_class[1].id_catch = (float)Math.PI;
        this.id_class[0].id_private = 0.19634955f;
        this.id_class[1].id_private = 0.19634955f;
        this.id_break = new Iq_1(this, 0, 0).id_break(128, 64);
        this.id_break.id_class(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f, 0.0f);
        this.id_break.id_class(0.0f, -3.0f, 1.0f);
        this.id_break.id_case = 1.5707964f;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Arrays.asList(iq_1Array));
        builder.addAll(Arrays.asList(this.id_class));
        this.id_byte = builder.build();
    }

    protected void id_class(rSK rSK2, int n, float f) {
        float f2 = rSK2.id_class(n, f);
        Iq_1 iq_1 = this.id_class[n];
        iq_1.id_case = (float)rfU_2.id_break(-1.0471975803375244, -0.2617993950843811, (double)((rfU_2.id_class(-f2) + 1.0f) / 2.0f));
        iq_1.id_catch = (float)rfU_2.id_break(-0.7853981852531433, 0.7853981852531433, (double)((rfU_2.id_class(-f2 + 1.0f) + 1.0f) / 2.0f));
        if (n == 1) {
            iq_1.id_catch = (float)Math.PI - iq_1.id_catch;
        }
    }

    @Override
    public /* synthetic */ Iterable id_class() {
        return this.id_break();
    }

    protected Iq_1 id_class(boolean bl) {
        Iq_1 iq_1 = new Iq_1(this, 62, bl ? 0 : 20).id_break(128, 64);
        int n = 20;
        int n2 = 7;
        int n3 = 6;
        float f = -5.0f;
        iq_1.id_class(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f);
        iq_1.id_class(bl ? -1.001f : 0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f);
        return iq_1;
    }

    @Override
    public void id_class(rSK rSK2, float f, float f2, float f3, float f4, float f5) {
        this.id_class(rSK2, 0, f);
        this.id_class(rSK2, 1, f);
    }

    public ImmutableList<Iq_1> id_break() {
        return this.id_byte;
    }
}

