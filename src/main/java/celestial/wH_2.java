/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.rOk_1;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wH_2<T extends rOk_1>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;

    public wH_2() {
        this.id_return = 64;
        this.id_public = 128;
        this.id_class = new Iq_1(this, 0, 32);
        this.id_class.id_class(-4.0f, 8.0f, 0.0f);
        this.id_class.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f, 0.0f);
        this.id_break = new Iq_1(this, 0, 55);
        this.id_break.id_class(4.0f, 8.0f, 0.0f);
        this.id_break.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f, 0.0f);
        this.id_byte = new Iq_1(this, 0, 0);
        this.id_byte.id_class(0.0f, 1.0f, 0.0f);
        this.id_byte.id_class(-8.0f, -6.0f, -8.0f, 16.0f, 14.0f, 16.0f, 0.0f);
        this.id_protected = new Iq_1(this, 16, 65);
        this.id_protected.id_class(-8.0f, 4.0f, -8.0f);
        this.id_protected.id_class(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, 0.0f, true);
        this.id_class(this.id_protected, 0.0f, 0.0f, -1.2217305f);
        this.id_throws = new Iq_1(this, 16, 49);
        this.id_throws.id_class(-8.0f, -1.0f, -8.0f);
        this.id_throws.id_class(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, 0.0f, true);
        this.id_class(this.id_throws, 0.0f, 0.0f, -1.134464f);
        this.id_case = new Iq_1(this, 16, 33);
        this.id_case.id_class(-8.0f, -5.0f, -8.0f);
        this.id_case.id_class(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, 0.0f, true);
        this.id_class(this.id_case, 0.0f, 0.0f, -0.87266463f);
        this.id_catch = new Iq_1(this, 16, 33);
        this.id_catch.id_class(8.0f, -6.0f, -8.0f);
        this.id_catch.id_class(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, 0.0f);
        this.id_class(this.id_catch, 0.0f, 0.0f, 0.87266463f);
        this.id_private = new Iq_1(this, 16, 49);
        this.id_private.id_class(8.0f, -2.0f, -8.0f);
        this.id_private.id_class(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, 0.0f);
        this.id_class(this.id_private, 0.0f, 0.0f, 1.134464f);
        this.id_implements = new Iq_1(this, 16, 65);
        this.id_implements.id_class(8.0f, 3.0f, -8.0f);
        this.id_implements.id_class(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, 0.0f);
        this.id_class(this.id_implements, 0.0f, 0.0f, 1.2217305f);
        this.id_byte.id_break(this.id_protected);
        this.id_byte.id_break(this.id_throws);
        this.id_byte.id_break(this.id_case);
        this.id_byte.id_break(this.id_catch);
        this.id_byte.id_break(this.id_private);
        this.id_byte.id_break(this.id_implements);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_byte, (Object)this.id_break, (Object)this.id_class);
    }

    @Override
    public void id_class(Iq_1 iq_1, float f, float f2, float f3) {
        iq_1.id_case = f;
        iq_1.id_catch = f2;
        iq_1.id_private = f3;
    }

    @Override
    public void id_class(rOk_1 rOk_12, float f, float f2, float f3, float f4, float f5) {
        f2 = Math.min(0.25f, f2);
        if (rOk_12.Bh().size() <= 0) {
            this.id_byte.id_case = f5 * ((float)Math.PI / 180);
            this.id_byte.id_catch = f4 * ((float)Math.PI / 180);
        } else {
            this.id_byte.id_case = 0.0f;
            this.id_byte.id_catch = 0.0f;
        }
        float f6 = 1.5f;
        this.id_byte.id_private = 0.1f * rfU_2.id_class(f * 1.5f) * 4.0f * f2;
        this.id_byte.id_protected = 2.0f;
        this.id_byte.id_protected -= 2.0f * rfU_2.id_break(f * 1.5f) * 2.0f * f2;
        this.id_break.id_case = rfU_2.id_class(f * 1.5f * 0.5f) * 2.0f * f2;
        this.id_class.id_case = rfU_2.id_class(f * 1.5f * 0.5f + (float)Math.PI) * 2.0f * f2;
        this.id_break.id_private = 0.17453292f * rfU_2.id_break(f * 1.5f * 0.5f) * f2;
        this.id_class.id_private = 0.17453292f * rfU_2.id_break(f * 1.5f * 0.5f + (float)Math.PI) * f2;
        this.id_break.id_protected = 8.0f + 2.0f * rfU_2.id_class(f * 1.5f * 0.5f + (float)Math.PI) * 2.0f * f2;
        this.id_class.id_protected = 8.0f + 2.0f * rfU_2.id_class(f * 1.5f * 0.5f) * 2.0f * f2;
        this.id_protected.id_private = -1.2217305f;
        this.id_throws.id_private = -1.134464f;
        this.id_case.id_private = -0.87266463f;
        this.id_catch.id_private = 0.87266463f;
        this.id_private.id_private = 1.134464f;
        this.id_implements.id_private = 1.2217305f;
        float f7 = rfU_2.id_break(f * 1.5f + (float)Math.PI) * f2;
        this.id_protected.id_private += f7 * 1.3f;
        this.id_throws.id_private += f7 * 1.2f;
        this.id_case.id_private += f7 * 0.6f;
        this.id_catch.id_private += f7 * 0.6f;
        this.id_private.id_private += f7 * 1.2f;
        this.id_implements.id_private += f7 * 1.3f;
        float f8 = 1.0f;
        float f9 = 1.0f;
        this.id_protected.id_private += 0.05f * rfU_2.id_class(f3 * 1.0f * -0.4f);
        this.id_throws.id_private += 0.1f * rfU_2.id_class(f3 * 1.0f * 0.2f);
        this.id_case.id_private += 0.1f * rfU_2.id_class(f3 * 1.0f * 0.4f);
        this.id_catch.id_private += 0.1f * rfU_2.id_class(f3 * 1.0f * 0.4f);
        this.id_private.id_private += 0.1f * rfU_2.id_class(f3 * 1.0f * 0.2f);
        this.id_implements.id_private += 0.05f * rfU_2.id_class(f3 * 1.0f * -0.4f);
    }
}

