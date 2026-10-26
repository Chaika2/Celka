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

public class wB_2<T extends an_3>
extends tX_2<T> {
    protected final Iq_1 id_class;
    protected final Iq_1 id_break;
    protected final Iq_1 id_byte;
    protected final Iq_1 id_protected;
    protected final Iq_1 id_throws;
    protected final Iq_1 id_case;
    protected final Iq_1 id_catch = new Iq_1(this);
    protected final Iq_1 id_private;
    protected int id_implements = 1;

    public wB_2(float f) {
        super(true, 10.0f, 4.0f);
        this.id_catch.id_class("main", -2.5f, -2.0f, -3.0f, 5, 4, 5, f, 0, 0);
        this.id_catch.id_class("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2, f, 0, 24);
        this.id_catch.id_class("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2, f, 0, 10);
        this.id_catch.id_class("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2, f, 6, 10);
        this.id_catch.id_class(0.0f, 15.0f, -9.0f);
        this.id_private = new Iq_1(this, 20, 0);
        this.id_private.id_class(-2.0f, 3.0f, -8.0f, 4.0f, 16.0f, 6.0f, f);
        this.id_private.id_class(0.0f, 12.0f, -10.0f);
        this.id_throws = new Iq_1(this, 0, 15);
        this.id_throws.id_class(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, f);
        this.id_throws.id_case = 0.9f;
        this.id_throws.id_class(0.0f, 15.0f, 8.0f);
        this.id_case = new Iq_1(this, 4, 15);
        this.id_case.id_class(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, f);
        this.id_case.id_class(0.0f, 20.0f, 14.0f);
        this.id_class = new Iq_1(this, 8, 13);
        this.id_class.id_class(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, f);
        this.id_class.id_class(1.1f, 18.0f, 5.0f);
        this.id_break = new Iq_1(this, 8, 13);
        this.id_break.id_class(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, f);
        this.id_break.id_class(-1.1f, 18.0f, 5.0f);
        this.id_byte = new Iq_1(this, 40, 0);
        this.id_byte.id_class(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, f);
        this.id_byte.id_class(1.2f, 14.1f, -5.0f);
        this.id_protected = new Iq_1(this, 40, 0);
        this.id_protected.id_class(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, f);
        this.id_protected.id_class(-1.2f, 14.1f, -5.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_catch.id_case = f5 * ((float)Math.PI / 180);
        this.id_catch.id_catch = f4 * ((float)Math.PI / 180);
        if (this.id_implements != 3) {
            this.id_private.id_case = 1.5707964f;
            if (this.id_implements == 2) {
                this.id_class.id_case = rfU_2.id_break(f * 0.6662f) * f2;
                this.id_break.id_case = rfU_2.id_break(f * 0.6662f + 0.3f) * f2;
                this.id_byte.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI + 0.3f) * f2;
                this.id_protected.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * f2;
                this.id_case.id_case = 1.7278761f + 0.31415927f * rfU_2.id_break(f) * f2;
            } else {
                this.id_class.id_case = rfU_2.id_break(f * 0.6662f) * f2;
                this.id_break.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * f2;
                this.id_byte.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * f2;
                this.id_protected.id_case = rfU_2.id_break(f * 0.6662f) * f2;
                this.id_case.id_case = this.id_implements == 1 ? 1.7278761f + 0.7853982f * rfU_2.id_break(f) * f2 : 1.7278761f + 0.47123894f * rfU_2.id_break(f) * f2;
            }
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_private.id_protected = 12.0f;
        this.id_private.id_throws = -10.0f;
        this.id_catch.id_protected = 15.0f;
        this.id_catch.id_throws = -9.0f;
        this.id_throws.id_protected = 15.0f;
        this.id_throws.id_throws = 8.0f;
        this.id_case.id_protected = 20.0f;
        this.id_case.id_throws = 14.0f;
        this.id_byte.id_protected = 14.1f;
        this.id_byte.id_throws = -5.0f;
        this.id_protected.id_protected = 14.1f;
        this.id_protected.id_throws = -5.0f;
        this.id_class.id_protected = 18.0f;
        this.id_class.id_throws = 5.0f;
        this.id_break.id_protected = 18.0f;
        this.id_break.id_throws = 5.0f;
        this.id_throws.id_case = 0.9f;
        if (((an_3)t).x()) {
            this.id_private.id_protected += 1.0f;
            this.id_catch.id_protected += 2.0f;
            this.id_throws.id_protected += 1.0f;
            this.id_case.id_protected += -4.0f;
            this.id_case.id_throws += 2.0f;
            this.id_throws.id_case = 1.5707964f;
            this.id_case.id_case = 1.5707964f;
            this.id_implements = 0;
        } else if (((an_3)t).PF()) {
            this.id_case.id_protected = this.id_throws.id_protected;
            this.id_case.id_throws += 2.0f;
            this.id_throws.id_case = 1.5707964f;
            this.id_case.id_case = 1.5707964f;
            this.id_implements = 2;
        } else {
            this.id_implements = 1;
        }
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_catch);
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_private, (Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case);
    }
}

