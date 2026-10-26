/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HU;
import celestial.Iq_1;
import celestial.rGz_1;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wv_3<T extends rGz_1>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break = new Iq_1(64, 64, 0, 0);
    private final Iq_1 id_byte;

    public Iq_1 id_byte() {
        return this.id_break;
    }

    public wv_3() {
        super(HU::id_throws);
        this.id_class = new Iq_1(64, 64, 0, 28);
        this.id_byte = new Iq_1(64, 64, 0, 52);
        this.id_break.id_class(-8.0f, -16.0f, -8.0f, 16.0f, 12.0f, 16.0f);
        this.id_break.id_class(0.0f, 24.0f, 0.0f);
        this.id_class.id_class(-8.0f, -8.0f, -8.0f, 16.0f, 8.0f, 16.0f);
        this.id_class.id_class(0.0f, 24.0f, 0.0f);
        this.id_byte.id_class(-3.0f, 0.0f, -3.0f, 6.0f, 6.0f, 6.0f);
        this.id_byte.id_class(0.0f, 12.0f, 0.0f);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 - (float)((Integer)((rGz_1)t).id_throws[41]).intValue();
        float f7 = (0.5f + ((rGz_1)t).id_throw(f6)) * (float)Math.PI;
        float f8 = -1.0f + rfU_2.id_class(f7);
        float f9 = 0.0f;
        if (f7 > (float)Math.PI) {
            f9 = rfU_2.id_class(f3 * 0.1f) * 0.7f;
        }
        this.id_break.id_class(0.0f, 16.0f + rfU_2.id_class(f7) * 8.0f + f9, 0.0f);
        this.id_break.id_catch = ((rGz_1)t).id_throw(f6) > 0.3f ? f8 * f8 * f8 * f8 * (float)Math.PI * 0.125f : 0.0f;
        this.id_byte.id_case = f5 * ((float)Math.PI / 180);
        this.id_byte.id_catch = (((Float)((rGz_1)t).id_private[25]).floatValue() - 180.0f - ((Float)((rGz_1)t).id_private[23]).floatValue()) * ((float)Math.PI / 180);
    }

    public Iq_1 id_break() {
        return this.id_class;
    }

    public Iq_1 id_protected() {
        return this.id_byte;
    }
}

