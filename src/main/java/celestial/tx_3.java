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
import celestial.rSY;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.tJ_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class tx_3
extends tJ_2 {
    private final Iq_1 id_native;
    private final Iq_1 id_volatile;
    private final Iq_1 id_new;
    private final Iq_1 id_continue;

    public tx_3() {
        this(0.0f);
    }

    public tx_3(float f) {
        super(f, 64, 64);
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-1.0f, -7.0f, -1.0f, 2.0f, 7.0f, 2.0f, f);
        this.id_class.id_class(0.0f, 0.0f, 0.0f);
        this.id_byte = new Iq_1(this, 0, 26);
        this.id_byte.id_class(-6.0f, 0.0f, -1.5f, 12.0f, 3.0f, 3.0f, f);
        this.id_byte.id_class(0.0f, 0.0f, 0.0f);
        this.id_protected = new Iq_1(this, 24, 0);
        this.id_protected.id_class(-2.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, f);
        this.id_protected.id_class(-5.0f, 2.0f, 0.0f);
        this.id_throws = new Iq_1(this, 32, 16);
        this.id_throws.id_implements = true;
        this.id_throws.id_class(0.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, f);
        this.id_throws.id_class(5.0f, 2.0f, 0.0f);
        this.id_case = new Iq_1(this, 8, 0);
        this.id_case.id_class(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f, f);
        this.id_case.id_class(-1.9f, 12.0f, 0.0f);
        this.id_catch = new Iq_1(this, 40, 16);
        this.id_catch.id_implements = true;
        this.id_catch.id_class(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f, f);
        this.id_catch.id_class(1.9f, 12.0f, 0.0f);
        this.id_native = new Iq_1(this, 16, 0);
        this.id_native.id_class(-3.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f, f);
        this.id_native.id_class(0.0f, 0.0f, 0.0f);
        this.id_native.id_finally = true;
        this.id_volatile = new Iq_1(this, 48, 16);
        this.id_volatile.id_class(1.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f, f);
        this.id_volatile.id_class(0.0f, 0.0f, 0.0f);
        this.id_new = new Iq_1(this, 0, 48);
        this.id_new.id_class(-4.0f, 10.0f, -1.0f, 8.0f, 2.0f, 2.0f, f);
        this.id_new.id_class(0.0f, 0.0f, 0.0f);
        this.id_continue = new Iq_1(this, 0, 32);
        this.id_continue.id_class(-6.0f, 11.0f, -6.0f, 12.0f, 1.0f, 12.0f, f);
        this.id_continue.id_class(0.0f, 12.0f, 0.0f);
        this.id_break.id_finally = false;
    }

    @Override
    public void id_class(rSY rSY2, float f, float f2, float f3) {
        this.id_continue.id_case = 0.0f;
        this.id_continue.id_catch = (float)Math.PI / 180 * -rfU_2.id_private(f3, ((Float)rSY2.id_throws[17]).floatValue(), ((Float)rSY2.id_throws[15]).floatValue());
        this.id_continue.id_private = 0.0f;
    }

    @Override
    public void id_class(rSY rSY2, float f, float f2, float f3, float f4, float f5) {
        super.id_class(rSY2, f, f2, f3, f4, f5);
        this.id_throws.id_finally = rSY2.id_catch();
        this.id_protected.id_finally = rSY2.id_catch();
        this.id_continue.id_finally = !rSY2.id_private();
        this.id_catch.id_class(1.9f, 12.0f, 0.0f);
        this.id_case.id_class(-1.9f, 12.0f, 0.0f);
        this.id_native.id_case = (float)Math.PI / 180 * rSY2.id_package().id_break();
        this.id_native.id_catch = (float)Math.PI / 180 * rSY2.id_package().id_byte();
        this.id_native.id_private = (float)Math.PI / 180 * rSY2.id_package().id_protected();
        this.id_volatile.id_case = (float)Math.PI / 180 * rSY2.id_package().id_break();
        this.id_volatile.id_catch = (float)Math.PI / 180 * rSY2.id_package().id_byte();
        this.id_volatile.id_private = (float)Math.PI / 180 * rSY2.id_package().id_protected();
        this.id_new.id_case = (float)Math.PI / 180 * rSY2.id_package().id_break();
        this.id_new.id_catch = (float)Math.PI / 180 * rSY2.id_package().id_byte();
        this.id_new.id_private = (float)Math.PI / 180 * rSY2.id_package().id_protected();
    }

    @Override
    public void id_class(rpZ_2 rpZ_22, Ml_1 ml_1) {
        Iq_1 iq_1 = this.id_class(rpZ_22);
        boolean bl = iq_1.id_finally;
        iq_1.id_finally = true;
        super.id_class(rpZ_22, ml_1);
        iq_1.id_finally = bl;
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return Iterables.concat(super.id_break(), (Iterable)ImmutableList.of((Object)this.id_native, (Object)this.id_volatile, (Object)this.id_new, (Object)this.id_continue));
    }
}

