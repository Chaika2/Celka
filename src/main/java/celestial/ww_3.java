/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 */
package celestial;

import celestial.Iq_1;
import celestial.rGg_1;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.tW_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class ww_3
extends tW_2<rGg_1> {
    private final Iq_1 id_native;
    private final Iq_1 id_volatile;

    public ww_3() {
        super(0.0f, 0.0f, 64, 64);
        this.id_catch.id_finally = false;
        this.id_break.id_finally = false;
        this.id_case = new Iq_1(this, 32, 0);
        this.id_case.id_class(-1.0f, -1.0f, -2.0f, 6.0f, 10.0f, 4.0f, 0.0f);
        this.id_case.id_class(-1.9f, 12.0f, 0.0f);
        this.id_volatile = new Iq_1(this, 0, 32);
        this.id_volatile.id_class(-20.0f, 0.0f, 0.0f, 20.0f, 12.0f, 1.0f);
        this.id_native = new Iq_1(this, 0, 32);
        this.id_native.id_implements = true;
        this.id_native.id_class(0.0f, 0.0f, 0.0f, 20.0f, 12.0f, 1.0f);
    }

    @Override
    public void id_class(rGg_1 rGg_12, float f, float f2, float f3, float f4, float f5) {
        super.id_class(rGg_12, f, f2, f3, f4, f5);
        if (rGg_12.sx()) {
            if (rGg_12.ss().id_class()) {
                this.id_protected.id_case = 4.712389f;
                this.id_throws.id_case = 4.712389f;
            } else if (rGg_12.Su() == rpZ_2.RIGHT) {
                this.id_protected.id_case = 3.7699115f;
            } else {
                this.id_throws.id_case = 3.7699115f;
            }
        }
        this.id_case.id_case += 0.62831855f;
        this.id_volatile.id_throws = 2.0f;
        this.id_native.id_throws = 2.0f;
        this.id_volatile.id_protected = 1.0f;
        this.id_native.id_protected = 1.0f;
        this.id_volatile.id_catch = 0.47123894f + rfU_2.id_break(f3 * 0.8f) * (float)Math.PI * 0.05f;
        this.id_native.id_catch = -this.id_volatile.id_catch;
        this.id_native.id_private = -0.47123894f;
        this.id_native.id_case = 0.47123894f;
        this.id_volatile.id_case = 0.47123894f;
        this.id_volatile.id_private = 0.47123894f;
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return Iterables.concat(super.id_break(), (Iterable)ImmutableList.of((Object)this.id_volatile, (Object)this.id_native));
    }
}

