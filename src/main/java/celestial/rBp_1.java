/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.eX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rRR;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import java.util.EnumSet;

public abstract class rBp_1
extends rBk_1 {
    protected final aA_2 id_class;
    public final double id_break;
    protected int id_byte;
    protected int id_protected;
    private int id_catch;
    protected rfH_2 id_throws = rfH_2.id_protected;
    private boolean id_private;
    private final int id_implements;
    private final int id_finally;
    protected int id_case;

    @Override
    public void id_byte() {
        this.id_catch();
        this.id_protected = 0;
        this.id_catch = this.id_class.Sa().nextInt(this.id_class.Sa().nextInt(1200) + 1200) + 1200;
    }

    public rBp_1(aA_2 aA_22, double d, int n) {
        this(aA_22, d, n, 1);
    }

    public rBp_1(aA_2 aA_22, double d, int n, int n2) {
        this.id_class = aA_22;
        this.id_break = d;
        this.id_implements = n;
        this.id_case = 0;
        this.id_finally = n2;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.JUMP));
    }

    protected abstract boolean id_class(rRR var1, rfH_2 var2);

    @Override
    public boolean id_class() {
        if (this.id_byte > 0) {
            --this.id_byte;
            return false;
        }
        this.id_byte = this.id_class(this.id_class);
        return this.id_volatile();
    }

    protected int id_class(aA_2 aA_22) {
        return 200 + aA_22.Sa().nextInt(200);
    }

    @Override
    public boolean id_break() {
        return this.id_protected >= -this.id_catch && this.id_protected <= 1200 && this.id_class((rYB)this.id_class.id_throws[7], this.id_throws);
    }

    @Override
    public void id_throws() {
        rfH_2 rfH_22 = this.id_finally();
        if (!rfH_22.id_class((eX_2)this.id_class.Ps(), this.id_private())) {
            this.id_private = false;
            ++this.id_protected;
            if (this.id_extends()) {
                this.id_class.id_public().id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_(), (double)rfH_22.d_() + 0.5, this.id_break);
            }
        } else {
            this.id_private = true;
            --this.id_protected;
        }
    }

    protected rfH_2 id_finally() {
        return this.id_throws.id_final();
    }

    protected void id_catch() {
        this.id_class.id_public().id_class((double)this.id_throws.b_() + 0.5, (double)(this.id_throws.c_() + 1), (double)this.id_throws.d_() + 0.5, this.id_break);
    }

    public boolean id_extends() {
        return this.id_protected % 40 == 0;
    }

    public double id_private() {
        return 1.0;
    }

    protected boolean id_volatile() {
        int n = this.id_implements;
        int n2 = this.id_finally;
        rfH_2 rfH_22 = this.id_class.Bs();
        rfw_3 rfw_32 = new rfw_3();
        int n3 = this.id_case;
        while (n3 <= n2) {
            for (int i = 0; i < n; ++i) {
                int n4 = 0;
                while (n4 <= i) {
                    int n5;
                    int n6 = n5 = n4 < i && n4 > -i ? i : 0;
                    while (n5 <= i) {
                        rfw_32.id_class(rfH_22, n4, n3 - 1, n5);
                        if (this.id_class.id_private(rfw_32) && this.id_class((rYB)this.id_class.id_throws[7], rfw_32)) {
                            this.id_throws = rfw_32;
                            return true;
                        }
                        n5 = n5 > 0 ? -n5 : 1 - n5;
                    }
                    n4 = n4 > 0 ? -n4 : 1 - n4;
                }
            }
            n3 = n3 > 0 ? -n3 : 1 - n3;
        }
        return false;
    }

    protected boolean id_native() {
        return this.id_private;
    }
}

