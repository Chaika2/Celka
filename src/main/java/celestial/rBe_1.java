/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aa_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rfU_2;
import java.util.EnumSet;

public class rBe_1
extends rBk_1 {
    private final is_3 id_class;
    private final aa_3 id_break;
    private iB_2 id_byte;
    private int id_protected = -1;
    private final double id_throws;
    private int id_case;
    private final int id_catch;
    private final int id_private;
    private final float id_implements;
    private final float id_finally;

    public rBe_1(aa_3 aa_32, double d, int n, float f) {
        this(aa_32, d, n, n, f);
    }

    public rBe_1(aa_3 aa_32, double d, int n, int n2, float f) {
        if (!(aa_32 instanceof iB_2)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.id_break = aa_32;
        this.id_class = (is_3)((Object)aa_32);
        this.id_throws = d;
        this.id_catch = n;
        this.id_private = n2;
        this.id_implements = f;
        this.id_finally = f * f;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null && iB_22.BM()) {
            this.id_byte = iB_22;
            return true;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return this.id_class() || !this.id_class.id_public().id_native();
    }

    @Override
    public void id_throws() {
        double d = this.id_class.id_class(this.id_byte.rx(), this.id_byte.re(), this.id_byte.BO());
        boolean bl = this.id_class.id_goto().id_class(this.id_byte);
        this.id_case = bl ? ++this.id_case : 0;
        if (!(d > (double)this.id_finally) && this.id_case >= 5) {
            this.id_class.id_public().id_final();
        } else {
            this.id_class.id_public().id_class((an_3)this.id_byte, this.id_throws);
        }
        this.id_class.id_continue().id_class(this.id_byte, 30.0f, 30.0f);
        if (--this.id_protected == 0) {
            if (!bl) {
                return;
            }
            float f = rfU_2.id_class(d) / this.id_implements;
            float f2 = rfU_2.id_class(f, 0.1f, 1.0f);
            this.id_break.id_break(this.id_byte, f2);
            this.id_protected = rfU_2.id_protected(f * (float)(this.id_private - this.id_catch) + (float)this.id_catch);
        } else if (this.id_protected < 0) {
            float f = rfU_2.id_class(d) / this.id_implements;
            this.id_protected = rfU_2.id_protected(f * (float)(this.id_private - this.id_catch) + (float)this.id_catch);
        }
    }

    @Override
    public void id_protected() {
        this.id_byte = null;
        this.id_case = 0;
        this.id_protected = -1;
    }
}

