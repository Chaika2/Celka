/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.rOH;
import celestial.rOQ;
import celestial.rfU_2;
import celestial.wy_3;
import com.google.common.collect.ImmutableList;

public class wV_2<T extends rOH>
extends wy_3<T> {
    private final Iq_1 id_class = new Iq_1(this, 0, 0);
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;
    private final Iq_1 id_finally;

    public wV_2() {
        this.id_class.id_class(-1.0f, 13.5f, -7.0f);
        this.id_break = new Iq_1(this, 0, 0);
        this.id_break.id_class(-2.0f, -3.0f, -2.0f, 6.0f, 6.0f, 4.0f, 0.0f);
        this.id_class.id_break(this.id_break);
        this.id_byte = new Iq_1(this, 18, 14);
        this.id_byte.id_class(-3.0f, -2.0f, -3.0f, 6.0f, 9.0f, 6.0f, 0.0f);
        this.id_byte.id_class(0.0f, 14.0f, 2.0f);
        this.id_finally = new Iq_1(this, 21, 0);
        this.id_finally.id_class(-3.0f, -3.0f, -3.0f, 8.0f, 6.0f, 7.0f, 0.0f);
        this.id_finally.id_class(-1.0f, 14.0f, 2.0f);
        this.id_protected = new Iq_1(this, 0, 18);
        this.id_protected.id_class(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.id_protected.id_class(-2.5f, 16.0f, 7.0f);
        this.id_throws = new Iq_1(this, 0, 18);
        this.id_throws.id_class(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.id_throws.id_class(0.5f, 16.0f, 7.0f);
        this.id_case = new Iq_1(this, 0, 18);
        this.id_case.id_class(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.id_case.id_class(-2.5f, 16.0f, -4.0f);
        this.id_catch = new Iq_1(this, 0, 18);
        this.id_catch.id_class(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.id_catch.id_class(0.5f, 16.0f, -4.0f);
        this.id_private = new Iq_1(this, 9, 18);
        this.id_private.id_class(-1.0f, 12.0f, 8.0f);
        this.id_implements = new Iq_1(this, 9, 18);
        this.id_implements.id_class(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.id_private.id_break(this.id_implements);
        this.id_break.id_class(16, 14).id_class(-2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        this.id_break.id_class(16, 14).id_class(2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        this.id_break.id_class(0, 10).id_class(-0.5f, 0.0f, -5.0f, 3.0f, 3.0f, 4.0f, 0.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_private.id_case = f3;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_private.id_catch = t.T_() ? 0.0f : rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
        if (((rOQ)t).Sc()) {
            this.id_finally.id_class(-1.0f, 16.0f, -3.0f);
            this.id_finally.id_case = 1.2566371f;
            this.id_finally.id_catch = 0.0f;
            this.id_byte.id_class(0.0f, 18.0f, 0.0f);
            this.id_byte.id_case = 0.7853982f;
            this.id_private.id_class(-1.0f, 21.0f, 6.0f);
            this.id_protected.id_class(-2.5f, 22.7f, 2.0f);
            this.id_protected.id_case = 4.712389f;
            this.id_throws.id_class(0.5f, 22.7f, 2.0f);
            this.id_throws.id_case = 4.712389f;
            this.id_case.id_case = 5.811947f;
            this.id_case.id_class(-2.49f, 17.0f, -4.0f);
            this.id_catch.id_case = 5.811947f;
            this.id_catch.id_class(0.51f, 17.0f, -4.0f);
        } else {
            this.id_byte.id_class(0.0f, 14.0f, 2.0f);
            this.id_byte.id_case = 1.5707964f;
            this.id_finally.id_class(-1.0f, 14.0f, -3.0f);
            this.id_finally.id_case = this.id_byte.id_case;
            this.id_private.id_class(-1.0f, 12.0f, 8.0f);
            this.id_protected.id_class(-2.5f, 16.0f, 7.0f);
            this.id_throws.id_class(0.5f, 16.0f, 7.0f);
            this.id_case.id_class(-2.5f, 16.0f, -4.0f);
            this.id_catch.id_class(0.5f, 16.0f, -4.0f);
            this.id_protected.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
            this.id_throws.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.id_case.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.id_catch.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
        }
        this.id_break.id_private = ((rOH)t).id_interface(f3) + ((rOH)t).id_break(f3, 0.0f);
        this.id_finally.id_private = ((rOH)t).id_break(f3, -0.08f);
        this.id_byte.id_private = ((rOH)t).id_break(f3, -0.16f);
        this.id_implements.id_private = ((rOH)t).id_break(f3, -0.2f);
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_private, (Object)this.id_finally);
    }
}

