/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLA;
import celestial.rLL;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rPR;
import celestial.rYB;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class rBX
extends rBk_1 {
    private final is_3 id_class;
    private final Predicate<is_3> id_break;
    private is_3 id_byte;
    private final double id_protected;
    private final rLy_1 id_throws;
    private int id_case;
    private final float id_catch;
    private float id_private;
    private final float id_implements;

    @Override
    public void id_byte() {
        this.id_case = 0;
        this.id_private = this.id_class.id_class(rLp_1.WATER);
        this.id_class.id_class(rLp_1.WATER, 0.0f);
    }

    public rBX(is_3 is_32, double d, float f, float f2) {
        this.id_class = is_32;
        this.id_break = is_33 -> is_33 != null && is_32.getClass() != is_33.getClass();
        this.id_protected = d;
        this.id_throws = is_32.id_public();
        this.id_catch = f;
        this.id_implements = f2;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
        if (!(is_32.id_public() instanceof rLA) && !(is_32.id_public() instanceof rLL)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
        }
    }

    @Override
    public boolean id_class() {
        List<is_3> list = ((rYB)this.id_class.id_throws[7]).id_class(is_3.class, this.id_class.rN().id_class(this.id_implements), this.id_break);
        if (!list.isEmpty()) {
            for (is_3 is_32 : list) {
                if (is_32.Pp()) continue;
                this.id_byte = is_32;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return this.id_byte != null && !this.id_throws.id_native() && this.id_class.id_int(this.id_byte) > (double)(this.id_catch * this.id_catch);
    }

    @Override
    public void id_throws() {
        if (this.id_byte != null && !this.id_class.z()) {
            this.id_class.id_continue().id_class(this.id_byte, 10.0f, (float)this.id_class.r());
            if (--this.id_case <= 0) {
                double d;
                double d2;
                this.id_case = 10;
                double d3 = this.id_class.rx() - this.id_byte.rx();
                double d4 = d3 * d3 + (d2 = this.id_class.re() - this.id_byte.re()) * d2 + (d = this.id_class.BO() - this.id_byte.BO()) * d;
                if (!(d4 <= (double)(this.id_catch * this.id_catch))) {
                    this.id_throws.id_class((an_3)this.id_byte, this.id_protected);
                } else {
                    this.id_throws.id_final();
                    rPR rPR2 = this.id_byte.id_continue();
                    if (d4 <= (double)this.id_catch || rPR2.id_protected() == this.id_class.rx() && rPR2.id_throws() == this.id_class.re() && rPR2.id_case() == this.id_class.BO()) {
                        double d5 = this.id_byte.rx() - this.id_class.rx();
                        double d6 = this.id_byte.BO() - this.id_class.BO();
                        this.id_throws.id_class(this.id_class.rx() - d5, this.id_class.re(), this.id_class.BO() - d6, this.id_protected);
                    }
                }
            }
        }
    }

    @Override
    public void id_protected() {
        this.id_byte = null;
        this.id_throws.id_final();
        this.id_class.id_class(rLp_1.WATER, this.id_private);
    }
}

