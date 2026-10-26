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
import celestial.tX_2;
import com.google.common.collect.ImmutableList;

public class wk_3<T extends an_3>
extends tX_2<T> {
    protected Iq_1 id_class = new Iq_1(this, 0, 0);
    protected Iq_1 id_break;
    protected Iq_1 id_byte;
    protected Iq_1 id_protected;
    protected Iq_1 id_throws;
    protected Iq_1 id_case;

    public wk_3(int n, float f, boolean bl, float f2, float f3, float f4, float f5, int n2) {
        super(bl, f2, f3, f4, f5, n2);
        this.id_class.id_class(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, f);
        this.id_class.id_class(0.0f, 18 - n, -6.0f);
        this.id_break = new Iq_1(this, 28, 8);
        this.id_break.id_class(-5.0f, -10.0f, -7.0f, 10.0f, 16.0f, 8.0f, f);
        this.id_break.id_class(0.0f, 17 - n, 2.0f);
        this.id_byte = new Iq_1(this, 0, 16);
        this.id_byte.id_class(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, f);
        this.id_byte.id_class(-3.0f, 24 - n, 7.0f);
        this.id_protected = new Iq_1(this, 0, 16);
        this.id_protected.id_class(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, f);
        this.id_protected.id_class(3.0f, 24 - n, 7.0f);
        this.id_throws = new Iq_1(this, 0, 16);
        this.id_throws.id_class(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, f);
        this.id_throws.id_class(-3.0f, 24 - n, -5.0f);
        this.id_case = new Iq_1(this, 0, 16);
        this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, f);
        this.id_case.id_class(3.0f, 24 - n, -5.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_break.id_case = 1.5707964f;
        this.id_byte.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
        this.id_protected.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.id_throws.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.id_case.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class);
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case);
    }
}

