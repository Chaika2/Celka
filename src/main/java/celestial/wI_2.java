/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.rfU_2;
import celestial.rsy_3;
import celestial.tY_2;
import celestial.to_3;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wI_2<T extends an_3>
extends wN_2<T>
implements tY_2,
to_3 {
    protected Iq_1 id_class;
    protected Iq_1 id_break;
    protected final Iq_1 id_byte;
    protected final Iq_1 id_protected;
    protected final Iq_1 id_throws;
    protected final Iq_1 id_case;
    protected final Iq_1 id_catch;
    protected final Iq_1 id_private;
    protected final Iq_1 id_implements;

    @Override
    public Iq_1 id_byte() {
        return this.id_class;
    }

    public wI_2(float f) {
        this(f, 64, 64);
    }

    public wI_2(float f, int n, int n2) {
        float f2 = 0.5f;
        this.id_class = new Iq_1(this).id_break(n, n2);
        this.id_class.id_class(0.0f, 0.0f, 0.0f);
        this.id_class.id_class(0, 0).id_class(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, f);
        this.id_break = new Iq_1(this).id_break(n, n2);
        this.id_break.id_class(0.0f, 0.0f, 0.0f);
        this.id_break.id_class(32, 0).id_class(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, f + 0.5f);
        this.id_class.id_break(this.id_break);
        this.id_byte = new Iq_1(this).id_break(n, n2);
        this.id_byte.id_class(0.0f, 0.0f, 0.0f);
        this.id_byte.id_class(30, 47).id_class(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f, f);
        this.id_byte.id_case = -1.5707964f;
        this.id_break.id_break(this.id_byte);
        this.id_implements = new Iq_1(this).id_break(n, n2);
        this.id_implements.id_class(0.0f, -2.0f, 0.0f);
        this.id_implements.id_class(24, 0).id_class(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f, f);
        this.id_class.id_break(this.id_implements);
        this.id_protected = new Iq_1(this).id_break(n, n2);
        this.id_protected.id_class(0.0f, 0.0f, 0.0f);
        this.id_protected.id_class(16, 20).id_class(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f, f);
        this.id_throws = new Iq_1(this).id_break(n, n2);
        this.id_throws.id_class(0.0f, 0.0f, 0.0f);
        this.id_throws.id_class(0, 38).id_class(-4.0f, 0.0f, -3.0f, 8.0f, 18.0f, 6.0f, f + 0.5f);
        this.id_protected.id_break(this.id_throws);
        this.id_case = new Iq_1(this).id_break(n, n2);
        this.id_case.id_class(0.0f, 2.0f, 0.0f);
        this.id_case.id_class(44, 22).id_class(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, f);
        this.id_case.id_class(44, 22).id_class(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, f, true);
        this.id_case.id_class(40, 38).id_class(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f, f);
        this.id_catch = new Iq_1(this, 0, 22).id_break(n, n2);
        this.id_catch.id_class(-2.0f, 12.0f, 0.0f);
        this.id_catch.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_private = new Iq_1(this, 0, 22).id_break(n, n2);
        this.id_private.id_implements = true;
        this.id_private.id_class(2.0f, 12.0f, 0.0f);
        this.id_private.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
    }

    @Override
    public void id_class(boolean bl) {
        this.id_class.id_finally = bl;
        this.id_break.id_finally = bl;
        this.id_byte.id_finally = bl;
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        boolean bl = false;
        if (t instanceof rsy_3) {
            bl = ((rsy_3)t).L() > 0;
        }
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        if (bl) {
            this.id_class.id_private = 0.3f * rfU_2.id_class(0.45f * f3);
            this.id_class.id_case = 0.4f;
        } else {
            this.id_class.id_private = 0.0f;
        }
        this.id_case.id_protected = 3.0f;
        this.id_case.id_throws = -1.0f;
        this.id_case.id_case = -0.75f;
        this.id_catch.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2 * 0.5f;
        this.id_private.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2 * 0.5f;
        this.id_catch.id_catch = 0.0f;
        this.id_private.id_catch = 0.0f;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_protected, (Object)this.id_catch, (Object)this.id_private, (Object)this.id_case);
    }
}

