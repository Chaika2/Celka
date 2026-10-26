/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.WT;
import celestial.rBk_1;
import celestial.rGZ;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class rGF
extends rBk_1 {
    private final rGZ id_class;
    private int id_break;

    public rGF(rGZ rGZ2) {
        this.id_class = rGZ2;
    }

    @Override
    public boolean id_class() {
        return this.id_break > 0;
    }

    @Override
    public void id_throws() {
        --this.id_break;
        if (this.id_break <= 0) {
            rYB rYB2 = (rYB)this.id_class.id_throws[7];
            Random random = this.id_class.Sa();
            rfH_2 rfH_22 = this.id_class.Bs();
            int n = 0;
            while (n <= 5 && n >= -5) {
                int n2 = 0;
                while (n2 <= 10 && n2 >= -10) {
                    int n3 = 0;
                    while (n3 <= 10 && n3 >= -10) {
                        rfH_2 rfH_23 = rfH_22.id_break(n2, n, n3);
                        xc_3 xc_32 = rYB2.id_byte(rfH_23);
                        xd_3 xd_32 = xc_32.id_break();
                        if (xd_32 instanceof WT) {
                            if (rYB2.B().id_break(rRu_1.id_break)) {
                                rYB2.id_class(rfH_23, true, this.id_class);
                            } else {
                                rYB2.id_class(rfH_23, ((WT)xd_32).id_break().id_continue(), 3);
                            }
                            if (random.nextBoolean()) {
                                return;
                            }
                        }
                        n3 = (n3 <= 0 ? 1 : 0) - n3;
                    }
                    n2 = (n2 <= 0 ? 1 : 0) - n2;
                }
                n = (n <= 0 ? 1 : 0) - n;
            }
        }
    }

    public void id_catch() {
        if (this.id_break == 0) {
            this.id_break = 20;
        }
    }
}

