/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.Iy_1;
import celestial.Ml_1;
import celestial.iB_2;
import celestial.rEr_1;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.rsi_3;
import celestial.tR_2;
import celestial.tY_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class tK_2<T extends rsi_3>
extends wN_2<T>
implements tR_2,
tY_2 {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;

    @Override
    public Iq_1 id_byte() {
        return this.id_class;
    }

    public tK_2(float f, float f2, int n, int n2) {
        this.id_class = new Iq_1(this).id_break(n, n2);
        this.id_class.id_class(0.0f, 0.0f + f2, 0.0f);
        this.id_class.id_class(0, 0).id_class(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, f);
        this.id_break = new Iq_1(this, 32, 0).id_break(n, n2);
        this.id_break.id_class(-4.0f, -10.0f, -4.0f, 8.0f, 12.0f, 8.0f, f + 0.45f);
        this.id_class.id_break(this.id_break);
        this.id_break.id_finally = false;
        Iq_1 iq_1 = new Iq_1(this).id_break(n, n2);
        iq_1.id_class(0.0f, f2 - 2.0f, 0.0f);
        iq_1.id_class(24, 0).id_class(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f, f);
        this.id_class.id_break(iq_1);
        this.id_byte = new Iq_1(this).id_break(n, n2);
        this.id_byte.id_class(0.0f, 0.0f + f2, 0.0f);
        this.id_byte.id_class(16, 20).id_class(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f, f);
        this.id_byte.id_class(0, 38).id_class(-4.0f, 0.0f, -3.0f, 8.0f, 18.0f, 6.0f, f + 0.5f);
        this.id_protected = new Iq_1(this).id_break(n, n2);
        this.id_protected.id_class(0.0f, 0.0f + f2 + 2.0f, 0.0f);
        this.id_protected.id_class(44, 22).id_class(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, f);
        Iq_1 iq_12 = new Iq_1(this, 44, 22).id_break(n, n2);
        iq_12.id_implements = true;
        iq_12.id_class(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, f);
        this.id_protected.id_break(iq_12);
        this.id_protected.id_class(40, 38).id_class(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f, f);
        this.id_throws = new Iq_1(this, 0, 22).id_break(n, n2);
        this.id_throws.id_class(-2.0f, 12.0f + f2, 0.0f);
        this.id_throws.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_case = new Iq_1(this, 0, 22).id_break(n, n2);
        this.id_case.id_implements = true;
        this.id_case.id_class(2.0f, 12.0f + f2, 0.0f);
        this.id_case.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_catch = new Iq_1(this, 40, 46).id_break(n, n2);
        this.id_catch.id_class(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_catch.id_class(-5.0f, 2.0f + f2, 0.0f);
        this.id_private = new Iq_1(this, 40, 46).id_break(n, n2);
        this.id_private.id_implements = true;
        this.id_private.id_class(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_private.id_class(5.0f, 2.0f + f2, 0.0f);
    }

    @Override
    public void id_class(rpZ_2 rpZ_22, Ml_1 ml_1) {
        this.id_class(rpZ_22).id_class(ml_1);
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_byte, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_protected, (Object)this.id_catch, (Object)this.id_private);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        boolean bl;
        this.id_class.id_catch = f4 * ((float)Math.PI / 180);
        this.id_class.id_case = f5 * ((float)Math.PI / 180);
        this.id_protected.id_protected = 3.0f;
        this.id_protected.id_throws = -1.0f;
        this.id_protected.id_case = -0.75f;
        if (this.id_package) {
            this.id_catch.id_case = -0.62831855f;
            this.id_catch.id_catch = 0.0f;
            this.id_catch.id_private = 0.0f;
            this.id_private.id_case = -0.62831855f;
            this.id_private.id_catch = 0.0f;
            this.id_private.id_private = 0.0f;
            this.id_throws.id_case = -1.4137167f;
            this.id_throws.id_catch = 0.31415927f;
            this.id_throws.id_private = 0.07853982f;
            this.id_case.id_case = -1.4137167f;
            this.id_case.id_catch = -0.31415927f;
            this.id_case.id_private = -0.07853982f;
        } else {
            this.id_catch.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 2.0f * f2 * 0.5f;
            this.id_catch.id_catch = 0.0f;
            this.id_catch.id_private = 0.0f;
            this.id_private.id_case = rfU_2.id_break(f * 0.6662f) * 2.0f * f2 * 0.5f;
            this.id_private.id_catch = 0.0f;
            this.id_private.id_private = 0.0f;
            this.id_throws.id_case = rfU_2.id_break(f * 0.6662f) * 1.4f * f2 * 0.5f;
            this.id_throws.id_catch = 0.0f;
            this.id_throws.id_private = 0.0f;
            this.id_case.id_case = rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2 * 0.5f;
            this.id_case.id_catch = 0.0f;
            this.id_case.id_private = 0.0f;
        }
        rEr_1 rEr_12 = ((rsi_3)t).id_throws();
        if (rEr_12 == rEr_1.ATTACKING) {
            if (((iB_2)t).ss().id_class()) {
                Iy_1.id_class(this.id_private, this.id_catch, true, this.id_final, f3);
            } else {
                Iy_1.id_class(this.id_catch, this.id_private, t, this.id_final, f3);
            }
        } else if (rEr_12 == rEr_1.SPELLCASTING) {
            this.id_catch.id_throws = 0.0f;
            this.id_catch.id_byte = -5.0f;
            this.id_private.id_throws = 0.0f;
            this.id_private.id_byte = 5.0f;
            this.id_catch.id_case = rfU_2.id_break(f3 * 0.6662f) * 0.25f;
            this.id_private.id_case = rfU_2.id_break(f3 * 0.6662f) * 0.25f;
            this.id_catch.id_private = 2.3561945f;
            this.id_private.id_private = -2.3561945f;
            this.id_catch.id_catch = 0.0f;
            this.id_private.id_catch = 0.0f;
        } else if (rEr_12 == rEr_1.BOW_AND_ARROW) {
            this.id_catch.id_catch = -0.1f + this.id_class.id_catch;
            this.id_catch.id_case = -1.5707964f + this.id_class.id_case;
            this.id_private.id_case = -0.9424779f + this.id_class.id_case;
            this.id_private.id_catch = this.id_class.id_catch - 0.4f;
            this.id_private.id_private = 1.5707964f;
        } else if (rEr_12 == rEr_1.CROSSBOW_HOLD) {
            Iy_1.id_class(this.id_catch, this.id_private, this.id_class, true);
        } else if (rEr_12 == rEr_1.CROSSBOW_CHARGE) {
            Iy_1.id_class(this.id_catch, this.id_private, t, true);
        } else if (rEr_12 == rEr_1.CELEBRATING) {
            this.id_catch.id_throws = 0.0f;
            this.id_catch.id_byte = -5.0f;
            this.id_catch.id_case = rfU_2.id_break(f3 * 0.6662f) * 0.05f;
            this.id_catch.id_private = 2.670354f;
            this.id_catch.id_catch = 0.0f;
            this.id_private.id_throws = 0.0f;
            this.id_private.id_byte = 5.0f;
            this.id_private.id_case = rfU_2.id_break(f3 * 0.6662f) * 0.05f;
            this.id_private.id_private = -2.3561945f;
            this.id_private.id_catch = 0.0f;
        }
        this.id_protected.id_finally = bl = rEr_12 == rEr_1.CROSSED;
        this.id_private.id_finally = !bl;
        this.id_catch.id_finally = !bl;
    }

    private Iq_1 id_class(rpZ_2 rpZ_22) {
        return rpZ_22 == rpZ_2.LEFT ? this.id_private : this.id_catch;
    }

    public Iq_1 id_break() {
        return this.id_break;
    }
}

