/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 */
package celestial;

import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.rON;
import celestial.rfU_2;
import celestial.wk_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class wt_3<T extends rON>
extends wk_3<T> {
    private final Iq_1 id_catch;

    public wt_3(float f) {
        super(12, f, true, 120.0f, 0.0f, 9.0f, 6.0f, 120);
        this.id_return = 128;
        this.id_public = 64;
        this.id_class = new Iq_1(this, 3, 0);
        this.id_class.id_class(-3.0f, -1.0f, -3.0f, 6.0f, 5.0f, 6.0f, 0.0f);
        this.id_class.id_class(0.0f, 19.0f, -10.0f);
        this.id_break = new Iq_1(this);
        this.id_break.id_class(7, 37).id_class(-9.5f, 3.0f, -10.0f, 19.0f, 20.0f, 6.0f, 0.0f);
        this.id_break.id_class(31, 1).id_class(-5.5f, 3.0f, -13.0f, 11.0f, 18.0f, 3.0f, 0.0f);
        this.id_break.id_class(0.0f, 11.0f, -10.0f);
        this.id_catch = new Iq_1(this);
        this.id_catch.id_class(70, 33).id_class(-4.5f, 3.0f, -14.0f, 9.0f, 18.0f, 1.0f, 0.0f);
        this.id_catch.id_class(0.0f, 11.0f, -10.0f);
        boolean bl = true;
        this.id_byte = new Iq_1(this, 1, 23);
        this.id_byte.id_class(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f, 0.0f);
        this.id_byte.id_class(-3.5f, 22.0f, 11.0f);
        this.id_protected = new Iq_1(this, 1, 12);
        this.id_protected.id_class(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f, 0.0f);
        this.id_protected.id_class(3.5f, 22.0f, 11.0f);
        this.id_throws = new Iq_1(this, 27, 30);
        this.id_throws.id_class(-13.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f, 0.0f);
        this.id_throws.id_class(-5.0f, 21.0f, -4.0f);
        this.id_case = new Iq_1(this, 27, 24);
        this.id_case.id_class(0.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f, 0.0f);
        this.id_case.id_class(5.0f, 21.0f, -4.0f);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
        boolean bl = this.id_catch.id_finally;
        if (bl) {
            ml_1.id_class();
            ml_1.id_class(0.0, (double)-0.08f, 0.0);
        }
        super.id_class(ml_1, ok_1, n, n2, f, f2, f3, f4);
        if (bl) {
            ml_1.id_break();
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        this.id_byte.id_case = rfU_2.id_break(f * 0.6662f * 0.6f) * 0.5f * f2;
        this.id_protected.id_case = rfU_2.id_break(f * 0.6662f * 0.6f + (float)Math.PI) * 0.5f * f2;
        this.id_throws.id_private = rfU_2.id_break(f * 0.6662f * 0.6f + (float)Math.PI) * 0.5f * f2;
        this.id_case.id_private = rfU_2.id_break(f * 0.6662f * 0.6f) * 0.5f * f2;
        this.id_throws.id_case = 0.0f;
        this.id_case.id_case = 0.0f;
        this.id_throws.id_catch = 0.0f;
        this.id_case.id_catch = 0.0f;
        this.id_byte.id_catch = 0.0f;
        this.id_protected.id_catch = 0.0f;
        this.id_catch.id_case = 1.5707964f;
        if (!((an_3)t).rT() && ((an_3)t).BL()) {
            float f6 = ((rON)t).n() ? 4.0f : 1.0f;
            float f7 = ((rON)t).n() ? 2.0f : 1.0f;
            float f8 = 5.0f;
            this.id_throws.id_catch = rfU_2.id_break(f6 * f * 5.0f + (float)Math.PI) * 8.0f * f2 * f7;
            this.id_throws.id_private = 0.0f;
            this.id_case.id_catch = rfU_2.id_break(f6 * f * 5.0f) * 8.0f * f2 * f7;
            this.id_case.id_private = 0.0f;
            this.id_byte.id_catch = rfU_2.id_break(f * 5.0f + (float)Math.PI) * 3.0f * f2;
            this.id_byte.id_case = 0.0f;
            this.id_protected.id_catch = rfU_2.id_break(f * 5.0f) * 3.0f * f2;
            this.id_protected.id_case = 0.0f;
        }
        this.id_catch.id_finally = !this.id_int && ((rON)t).L();
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return Iterables.concat(super.id_break(), (Iterable)ImmutableList.of((Object)this.id_catch));
    }
}

