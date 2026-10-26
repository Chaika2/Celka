/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.rbv_3;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class td_3
extends wN_2<rbv_3> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;

    public td_3() {
        this.id_return = 64;
        this.id_public = 64;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f);
        Iq_1 iq_1 = new Iq_1(this, 24, 0);
        iq_1.id_class(-4.0f, -6.0f, -2.0f, 3.0f, 4.0f, 1.0f);
        this.id_class.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(this, 24, 0);
        iq_12.id_implements = true;
        iq_12.id_class(1.0f, -6.0f, -2.0f, 3.0f, 4.0f, 1.0f);
        this.id_class.id_break(iq_12);
        this.id_break = new Iq_1(this, 0, 16);
        this.id_break.id_class(-3.0f, 4.0f, -3.0f, 6.0f, 12.0f, 6.0f);
        this.id_break.id_class(0, 34).id_class(-5.0f, 16.0f, 0.0f, 10.0f, 6.0f, 1.0f);
        this.id_byte = new Iq_1(this, 42, 0);
        this.id_byte.id_class(-12.0f, 1.0f, 1.5f, 10.0f, 16.0f, 1.0f);
        this.id_throws = new Iq_1(this, 24, 16);
        this.id_throws.id_class(-12.0f, 1.0f, 1.5f);
        this.id_throws.id_class(-8.0f, 1.0f, 0.0f, 8.0f, 12.0f, 1.0f);
        this.id_protected = new Iq_1(this, 42, 0);
        this.id_protected.id_implements = true;
        this.id_protected.id_class(2.0f, 1.0f, 1.5f, 10.0f, 16.0f, 1.0f);
        this.id_case = new Iq_1(this, 24, 16);
        this.id_case.id_implements = true;
        this.id_case.id_class(12.0f, 1.0f, 1.5f);
        this.id_case.id_class(0.0f, 1.0f, 0.0f, 8.0f, 12.0f, 1.0f);
        this.id_break.id_break(this.id_byte);
        this.id_break.id_break(this.id_protected);
        this.id_byte.id_break(this.id_throws);
        this.id_protected.id_break(this.id_case);
    }

    @Override
    public void id_class(rbv_3 rbv_32, float f, float f2, float f3, float f4, float f5) {
        if (rbv_32.id_catch()) {
            this.id_class.id_case = f5 * ((float)Math.PI / 180);
            this.id_class.id_catch = (float)Math.PI - f4 * ((float)Math.PI / 180);
            this.id_class.id_private = (float)Math.PI;
            this.id_class.id_class(0.0f, -2.0f, 0.0f);
            this.id_byte.id_class(-3.0f, 0.0f, 3.0f);
            this.id_protected.id_class(3.0f, 0.0f, 3.0f);
            this.id_break.id_case = (float)Math.PI;
            this.id_byte.id_case = -0.15707964f;
            this.id_byte.id_catch = -1.2566371f;
            this.id_throws.id_catch = -1.7278761f;
            this.id_protected.id_case = this.id_byte.id_case;
            this.id_protected.id_catch = -this.id_byte.id_catch;
            this.id_case.id_catch = -this.id_throws.id_catch;
        } else {
            this.id_class.id_case = f5 * ((float)Math.PI / 180);
            this.id_class.id_catch = f4 * ((float)Math.PI / 180);
            this.id_class.id_private = 0.0f;
            this.id_class.id_class(0.0f, 0.0f, 0.0f);
            this.id_byte.id_class(0.0f, 0.0f, 0.0f);
            this.id_protected.id_class(0.0f, 0.0f, 0.0f);
            this.id_break.id_case = 0.7853982f + rfU_2.id_break(f3 * 0.1f) * 0.15f;
            this.id_break.id_catch = 0.0f;
            this.id_byte.id_catch = rfU_2.id_break(f3 * 1.3f) * (float)Math.PI * 0.25f;
            this.id_protected.id_catch = -this.id_byte.id_catch;
            this.id_throws.id_catch = this.id_byte.id_catch * 0.5f;
            this.id_case.id_catch = -this.id_byte.id_catch * 0.5f;
        }
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break);
    }
}

