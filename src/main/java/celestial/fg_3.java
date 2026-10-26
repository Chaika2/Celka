/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.fV_2;
import celestial.fj_3;

public final class fg_3
implements AutoCloseable {
    public final fN_2[] id_break;
    public final /* synthetic */ fj_3 id_class;

    public fg_3(fj_3 fj_32, fN_2[] fN_2Array) {
        this.id_class = fj_32;
        this.id_break = fN_2Array;
    }

    public fg_3(fj_3 fj_32, fV_2 fV_22, int n) {
        this.id_class = fj_32;
        this.id_break = new fN_2[n + 1];
        for (int i = 0; i < this.id_break.length; ++i) {
            int n2 = fV_22.id_break >> i;
            int n3 = fV_22.id_byte >> i;
            if (this.id_break[i] != null) continue;
            this.id_break[i] = new fN_2(n2, n3, false);
        }
    }

    private int id_class(int n, int n2, int n3, int n4) {
        return this.id_class.id_class[n2].id_class(n3 + (this.id_class.id_super[n] * this.id_class.id_new.id_break >> n2), n4 + (this.id_class.id_this[n] * this.id_class.id_new.id_byte >> n2));
    }

    private int id_class(double d, int n, int n2) {
        return (int)(d * (double)n + (1.0 - d) * (double)n2);
    }

    public void id_class() {
        int n;
        int n2;
        double d = 1.0 - (double)this.id_class.id_throw / (double)this.id_class.id_continue.id_byte(this.id_class.id_instanceof);
        int n3 = this.id_class.id_continue.id_protected(this.id_class.id_instanceof);
        if (n3 != (n2 = this.id_class.id_continue.id_protected((this.id_class.id_instanceof + 1) % (n = this.id_class.id_continue.id_class() == 0 ? this.id_class.id_native() : this.id_class.id_continue.id_class()))) && n2 >= 0 && n2 < this.id_class.id_native()) {
            if (!this.id_class.id_private) {
                for (int i = 0; i < this.id_break.length; ++i) {
                    int n4 = this.id_class.id_new.id_break >> i;
                    int n5 = this.id_class.id_new.id_byte >> i;
                    for (int j = 0; j < n5; ++j) {
                        for (int k = 0; k < n4; ++k) {
                            int n6 = this.id_class(n3, i, k, j);
                            int n7 = this.id_class(n2, i, k, j);
                            int n8 = this.id_class(d, n6 >> 16 & 0xFF, n7 >> 16 & 0xFF);
                            int n9 = this.id_class(d, n6 >> 8 & 0xFF, n7 >> 8 & 0xFF);
                            int n10 = this.id_class(d, n6 & 0xFF, n7 & 0xFF);
                            this.id_break[i].id_class(k, j, n6 & 0xFF000000 | n8 << 16 | n9 << 8 | n10);
                        }
                    }
                }
            }
            this.id_class.id_class(0, 0, this.id_break);
        }
    }

    @Override
    public void close() {
        for (fN_2 fN_22 : this.id_break) {
            if (fN_22 == null) continue;
            fN_22.close();
        }
    }
}

