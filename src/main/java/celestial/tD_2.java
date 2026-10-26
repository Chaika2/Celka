/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.rMZ;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class tD_2<T extends rMZ>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;

    public tD_2() {
        int n = 128;
        int n2 = 128;
        this.id_class = new Iq_1(this).id_break(128, 128);
        this.id_class.id_class(0.0f, -7.0f, -2.0f);
        this.id_class.id_class(0, 0).id_class(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f, 0.0f);
        this.id_class.id_class(24, 0).id_class(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f, 0.0f);
        this.id_break = new Iq_1(this).id_break(128, 128);
        this.id_break.id_class(0.0f, -7.0f, 0.0f);
        this.id_break.id_class(0, 40).id_class(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f, 0.0f);
        this.id_break.id_class(0, 70).id_class(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, 0.5f);
        this.id_byte = new Iq_1(this).id_break(128, 128);
        this.id_byte.id_class(0.0f, -7.0f, 0.0f);
        this.id_byte.id_class(60, 21).id_class(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, 0.0f);
        this.id_protected = new Iq_1(this).id_break(128, 128);
        this.id_protected.id_class(0.0f, -7.0f, 0.0f);
        this.id_protected.id_class(60, 58).id_class(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, 0.0f);
        this.id_throws = new Iq_1(this, 0, 22).id_break(128, 128);
        this.id_throws.id_class(-4.0f, 11.0f, 0.0f);
        this.id_throws.id_class(37, 0).id_class(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, 0.0f);
        this.id_case = new Iq_1(this, 0, 22).id_break(128, 128);
        this.id_case.id_implements = true;
        this.id_case.id_class(60, 0).id_class(5.0f, 11.0f, 0.0f);
        this.id_case.id_class(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, 0.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        int n = ((rMZ)t).sJ();
        if (n > 0) {
            this.id_byte.id_case = -2.0f + 1.5f * rfU_2.id_throws((float)n - f3, 10.0f);
            this.id_protected.id_case = -2.0f + 1.5f * rfU_2.id_throws((float)n - f3, 10.0f);
        } else {
            int n2 = ((rMZ)t).sx();
            if (n2 > 0) {
                this.id_byte.id_case = -0.8f + 0.025f * rfU_2.id_throws(n2, 70.0f);
                this.id_protected.id_case = 0.0f;
            } else {
                this.id_byte.id_case = (-0.2f + 1.5f * rfU_2.id_throws(f, 13.0f)) * f2;
                this.id_protected.id_case = (-0.2f - 1.5f * rfU_2.id_throws(f, 13.0f)) * f2;
            }
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_throws.id_case = -1.5f * rfU_2.id_throws(f, 13.0f) * f2;
        this.id_case.id_case = 1.5f * rfU_2.id_throws(f, 13.0f) * f2;
        this.id_throws.id_catch = 0.0f;
        this.id_case.id_catch = 0.0f;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_byte, (Object)this.id_protected);
    }

    public Iq_1 id_break() {
        return this.id_byte;
    }
}

