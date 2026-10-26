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
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class tq_3<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class = new Iq_1(this, 0, 0);
    private final Iq_1 id_break;
    private final Iq_1 id_byte;

    public tq_3() {
        this.id_class.id_class(-5.0f, 22.0f, -5.0f);
        this.id_class.id_class(0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 10.0f);
        this.id_break = new Iq_1(this, 40, 0);
        this.id_break.id_class(1.5f, 22.0f, -4.0f);
        this.id_break.id_class(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
        this.id_byte = new Iq_1(this, 40, 0);
        this.id_byte.id_class(-1.5f, 22.0f, 4.0f);
        this.id_byte.id_class(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = f * 2.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        f6 = 1.0f - f6 * f6 * f6;
        this.id_break.id_private = (float)Math.PI - f6 * 0.35f * (float)Math.PI;
        this.id_byte.id_private = (float)Math.PI + f6 * 0.35f * (float)Math.PI;
        this.id_byte.id_catch = (float)Math.PI;
        float f7 = (f + rfU_2.id_class(f * 2.7f)) * 0.6f * 12.0f;
        this.id_byte.id_protected = this.id_break.id_protected = 24.0f - f7;
        this.id_class.id_protected = this.id_break.id_protected;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte);
    }
}

