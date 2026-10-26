/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.Iq_1;
import celestial.rSN;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public class wj_3<T extends rSN>
extends wN_2<T> {
    private final Iq_1[] id_class;
    private final Iq_1[] id_break;
    private final ImmutableList<Iq_1> id_byte;

    public wj_3(float f) {
        this.id_return = 64;
        this.id_public = 64;
        this.id_class = new Iq_1[3];
        this.id_class[0] = new Iq_1(this, 0, 16);
        this.id_class[0].id_class(-10.0f, 3.9f, -0.5f, 20.0f, 3.0f, 3.0f, f);
        this.id_class[1] = new Iq_1(this).id_break(this.id_return, this.id_public);
        this.id_class[1].id_class(-2.0f, 6.9f, -0.5f);
        this.id_class[1].id_class(0, 22).id_class(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f, f);
        this.id_class[1].id_class(24, 22).id_class(-4.0f, 1.5f, 0.5f, 11.0f, 2.0f, 2.0f, f);
        this.id_class[1].id_class(24, 22).id_class(-4.0f, 4.0f, 0.5f, 11.0f, 2.0f, 2.0f, f);
        this.id_class[1].id_class(24, 22).id_class(-4.0f, 6.5f, 0.5f, 11.0f, 2.0f, 2.0f, f);
        this.id_class[2] = new Iq_1(this, 12, 22);
        this.id_class[2].id_class(0.0f, 0.0f, 0.0f, 3.0f, 6.0f, 3.0f, f);
        this.id_break = new Iq_1[3];
        this.id_break[0] = new Iq_1(this, 0, 0);
        this.id_break[0].id_class(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f, f);
        this.id_break[1] = new Iq_1(this, 32, 0);
        this.id_break[1].id_class(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, f);
        this.id_break[1].id_byte = -8.0f;
        this.id_break[1].id_protected = 4.0f;
        this.id_break[2] = new Iq_1(this, 32, 0);
        this.id_break[2].id_class(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, f);
        this.id_break[2].id_byte = 10.0f;
        this.id_break[2].id_protected = 4.0f;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Arrays.asList(this.id_break));
        builder.addAll(Arrays.asList(this.id_class));
        this.id_byte = builder.build();
    }

    @Override
    public /* synthetic */ Iterable id_class() {
        return this.id_break();
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        for (int i = 1; i < 3; ++i) {
            this.id_break[i].id_catch = (((rSN)t).id_class(i - 1) - ((Float)((rSN)t).id_private[23]).floatValue()) * ((float)Math.PI / 180);
            this.id_break[i].id_case = ((rSN)t).id_break(i - 1) * ((float)Math.PI / 180);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = rfU_2.id_break(f3 * 0.1f);
        this.id_class[1].id_case = (0.065f + 0.05f * f6) * (float)Math.PI;
        this.id_class[2].id_class(-2.0f, 6.9f + rfU_2.id_break(this.id_class[1].id_case) * 10.0f, -0.5f + rfU_2.id_class(this.id_class[1].id_case) * 10.0f);
        this.id_class[2].id_case = (0.265f + 0.1f * f6) * (float)Math.PI;
        this.id_break[0].id_catch = f4 * ((float)Math.PI / 180);
        this.id_break[0].id_case = f5 * ((float)Math.PI / 180);
    }

    public ImmutableList<Iq_1> id_break() {
        return this.id_byte;
    }
}

