/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.rGx_1;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wz_3
extends wN_2<rGx_1> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;

    public wz_3() {
        this.id_return = 128;
        this.id_public = 128;
        int n = 16;
        float f = 0.0f;
        this.id_private = new Iq_1(this);
        this.id_private.id_class(0.0f, -7.0f, -1.5f);
        this.id_private.id_class(68, 73).id_class(-5.0f, -1.0f, -18.0f, 10.0f, 10.0f, 18.0f, 0.0f);
        this.id_class = new Iq_1(this);
        this.id_class.id_class(0.0f, 16.0f, -17.0f);
        this.id_class.id_class(0, 0).id_class(-8.0f, -20.0f, -14.0f, 16.0f, 20.0f, 16.0f, 0.0f);
        this.id_class.id_class(0, 0).id_class(-2.0f, -6.0f, -18.0f, 4.0f, 8.0f, 4.0f, 0.0f);
        Iq_1 iq_1 = new Iq_1(this);
        iq_1.id_class(-10.0f, -14.0f, -8.0f);
        iq_1.id_class(74, 55).id_class(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f, 0.0f);
        iq_1.id_case = 1.0995574f;
        this.id_class.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(this);
        iq_12.id_implements = true;
        iq_12.id_class(8.0f, -14.0f, -8.0f);
        iq_12.id_class(74, 55).id_class(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f, 0.0f);
        iq_12.id_case = 1.0995574f;
        this.id_class.id_break(iq_12);
        this.id_break = new Iq_1(this);
        this.id_break.id_class(0.0f, -2.0f, 2.0f);
        this.id_break.id_class(0, 36).id_class(-8.0f, 0.0f, -16.0f, 16.0f, 3.0f, 16.0f, 0.0f);
        this.id_class.id_break(this.id_break);
        this.id_private.id_break(this.id_class);
        this.id_byte = new Iq_1(this);
        this.id_byte.id_class(0, 55).id_class(-7.0f, -10.0f, -7.0f, 14.0f, 16.0f, 20.0f, 0.0f);
        this.id_byte.id_class(0, 91).id_class(-6.0f, 6.0f, -7.0f, 12.0f, 13.0f, 18.0f, 0.0f);
        this.id_byte.id_class(0.0f, 1.0f, 2.0f);
        this.id_protected = new Iq_1(this, 96, 0);
        this.id_protected.id_class(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.id_protected.id_class(-8.0f, -13.0f, 18.0f);
        this.id_throws = new Iq_1(this, 96, 0);
        this.id_throws.id_implements = true;
        this.id_throws.id_class(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.id_throws.id_class(8.0f, -13.0f, 18.0f);
        this.id_case = new Iq_1(this, 64, 0);
        this.id_case.id_class(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.id_case.id_class(-8.0f, -13.0f, -5.0f);
        this.id_catch = new Iq_1(this, 64, 0);
        this.id_catch.id_implements = true;
        this.id_catch.id_class(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.id_catch.id_class(8.0f, -13.0f, -5.0f);
    }

    @Override
    public void id_class(rGx_1 rGx_12, float f, float f2, float f3) {
        super.id_class(rGx_12, f, f2, f3);
        int n = rGx_12.sc();
        int n2 = rGx_12.sn();
        int n3 = 20;
        int n4 = rGx_12.sN();
        int n5 = 10;
        if (n4 > 0) {
            float f4 = rfU_2.id_throws((float)n4 - f3, 10.0f);
            float f5 = (1.0f + f4) * 0.5f;
            float f6 = f5 * f5 * f5 * 12.0f;
            float f7 = f6 * rfU_2.id_class(this.id_private.id_case);
            this.id_private.id_throws = -6.5f + f6;
            this.id_private.id_protected = -7.0f - f7;
            float f8 = rfU_2.id_class(((float)n4 - f3) / 10.0f * (float)Math.PI * 0.25f);
            this.id_break.id_case = 1.5707964f * f8;
            this.id_break.id_case = n4 > 5 ? rfU_2.id_class(((float)(-4 + n4) - f3) / 4.0f) * (float)Math.PI * 0.4f : 0.15707964f * rfU_2.id_class((float)Math.PI * ((float)n4 - f3) / 10.0f);
        } else {
            float f9 = -1.0f;
            float f10 = -1.0f * rfU_2.id_class(this.id_private.id_case);
            this.id_private.id_byte = 0.0f;
            this.id_private.id_protected = -7.0f - f10;
            this.id_private.id_throws = 5.5f;
            boolean bl = n > 0;
            this.id_private.id_case = bl ? 0.2199115f : 0.0f;
            this.id_break.id_case = (float)Math.PI * (bl ? 0.05f : 0.01f);
            if (bl) {
                double d = (double)n / 40.0;
                this.id_private.id_byte = (float)Math.sin(d * 10.0) * 3.0f;
            } else if (n2 > 0) {
                float f11 = rfU_2.id_class(((float)(20 - n2) - f3) / 20.0f * (float)Math.PI * 0.25f);
                this.id_break.id_case = 1.5707964f * f11;
            }
        }
    }

    @Override
    public void id_class(rGx_1 rGx_12, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_byte.id_case = 1.5707964f;
        float f6 = 0.4f * f2;
        this.id_protected.id_case = rfU_2.id_break(f * 0.6662f) * f6;
        this.id_throws.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * f6;
        this.id_case.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * f6;
        this.id_catch.id_case = rfU_2.id_break(f * 0.6662f) * f6;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_private, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch);
    }
}

