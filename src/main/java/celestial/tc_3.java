/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.iB_2;
import celestial.is_3;
import celestial.rEo_1;
import celestial.rfU_2;
import celestial.tX_2;
import com.google.common.collect.ImmutableList;

public class tc_3<T extends is_3>
extends tX_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;

    public tc_3() {
        super(true, 8.0f, 6.0f, 1.9f, 2.0f, 24.0f);
        this.id_return = 128;
        this.id_public = 64;
        this.id_protected = new Iq_1(this);
        this.id_protected.id_class(0.0f, 7.0f, 0.0f);
        this.id_protected.id_class(1, 1).id_class(-8.0f, -7.0f, -13.0f, 16.0f, 14.0f, 26.0f);
        this.id_implements = new Iq_1(this);
        this.id_implements.id_class(0.0f, -14.0f, -5.0f);
        this.id_implements.id_class(90, 33).id_class(0.0f, 0.0f, -9.0f, 0.0f, 10.0f, 19.0f, 0.001f);
        this.id_protected.id_break(this.id_implements);
        this.id_class = new Iq_1(this);
        this.id_class.id_class(0.0f, 2.0f, -12.0f);
        this.id_class.id_class(61, 1).id_class(-7.0f, -3.0f, -19.0f, 14.0f, 6.0f, 19.0f);
        this.id_break = new Iq_1(this);
        this.id_break.id_class(-6.0f, -2.0f, -3.0f);
        this.id_break.id_class(1, 1).id_class(-6.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f);
        this.id_break.id_private = -0.69813174f;
        this.id_class.id_break(this.id_break);
        this.id_byte = new Iq_1(this);
        this.id_byte.id_class(6.0f, -2.0f, -3.0f);
        this.id_byte.id_class(1, 6).id_class(0.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f);
        this.id_byte.id_private = 0.69813174f;
        this.id_class.id_break(this.id_byte);
        Iq_1 iq_1 = new Iq_1(this);
        iq_1.id_class(-7.0f, 2.0f, -12.0f);
        iq_1.id_class(10, 13).id_class(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f);
        this.id_class.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(this);
        iq_12.id_class(7.0f, 2.0f, -12.0f);
        iq_12.id_class(1, 13).id_class(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f);
        this.id_class.id_break(iq_12);
        this.id_class.id_case = 0.87266463f;
        int n = 14;
        int n2 = 11;
        this.id_throws = new Iq_1(this);
        this.id_throws.id_class(-4.0f, 10.0f, -8.5f);
        this.id_throws.id_class(66, 42).id_class(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f);
        this.id_case = new Iq_1(this);
        this.id_case.id_class(4.0f, 10.0f, -8.5f);
        this.id_case.id_class(41, 42).id_class(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f);
        this.id_catch = new Iq_1(this);
        this.id_catch.id_class(-5.0f, 13.0f, 10.0f);
        this.id_catch.id_class(21, 45).id_class(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f);
        this.id_private = new Iq_1(this);
        this.id_private.id_class(5.0f, 13.0f, 10.0f);
        this.id_private.id_class(0, 45).id_class(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_break.id_private = -0.69813174f - f2 * rfU_2.id_class(f);
        this.id_byte.id_private = 0.69813174f + f2 * rfU_2.id_class(f);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        int n = ((rEo_1)t).n();
        float f6 = 1.0f - (float)rfU_2.id_class(10 - 2 * n) / 10.0f;
        this.id_class.id_case = rfU_2.id_catch(f6, 0.87266463f, -0.34906584f);
        if (((iB_2)t).n_()) {
            this.id_class.id_protected = rfU_2.id_catch(f6, 2.0f, 5.0f);
            this.id_implements.id_throws = -3.0f;
        } else {
            this.id_class.id_protected = 2.0f;
            this.id_implements.id_throws = -7.0f;
        }
        float f7 = 1.2f;
        this.id_throws.id_case = rfU_2.id_break(f) * 1.2f * f2;
        this.id_catch.id_case = this.id_case.id_case = rfU_2.id_break(f + (float)Math.PI) * 1.2f * f2;
        this.id_private.id_case = this.id_throws.id_case;
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_private);
    }
}

