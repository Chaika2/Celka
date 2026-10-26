/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBP;
import celestial.rMl_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.xu_3;

public class rMt_1
extends rBP {
    private final rMl_1 id_protected;
    private int id_throws;

    public rMt_1(rMl_1 rMl_12, rMl_1 rMl_13, double d) {
        super(rMl_13, d);
        this.id_protected = rMl_13;
    }

    @Override
    public boolean id_class() {
        if (super.id_class() && this.id_protected.L() == 0) {
            if (!this.id_private()) {
                if (this.id_throws <= (Integer)this.id_protected.id_throws[41]) {
                    this.id_protected.id_else(32);
                    this.id_throws = (Integer)this.id_protected.id_throws[41] + 600;
                    if (this.id_protected.id_try()) {
                        rhd_3 rhd_32 = this.id_break.id_class(rMl_1.id_while, this.id_protected);
                        this.id_protected.id_static.id_class(rhd_32);
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean id_private() {
        rfH_2 rfH_22 = this.id_protected.Bs();
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 8; ++j) {
                int n = 0;
                while (n <= j) {
                    int n2;
                    int n3 = n2 = n < j && n > -j ? j : 0;
                    while (n2 <= j) {
                        rfw_32.id_class(rfH_22, n, i, n2);
                        if (this.id_break.id_byte(rfw_32).id_class(xu_3.hs)) {
                            return true;
                        }
                        n2 = n2 > 0 ? -n2 : 1 - n2;
                    }
                    n = n > 0 ? -n : 1 - n;
                }
            }
        }
        return false;
    }
}

