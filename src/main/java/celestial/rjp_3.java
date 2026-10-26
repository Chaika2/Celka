/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjT_2;
import celestial.rjd_3;
import celestial.rjq_3;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.ryF_2;

public abstract class rjp_3 {
    private static final rpB_2[] id_protected = rpB_2.values();
    protected final int id_class;
    protected final int id_break;
    protected final int id_byte;

    public int id_byte(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_class, this.id_break, this.id_byte);
    }

    public int id_byte() {
        return this.id_byte(rpB_2.Y);
    }

    public boolean id_byte(int n, int n2, int n3) {
        if (n >= 0 && n2 >= 0 && n3 >= 0) {
            return n < this.id_class && n2 < this.id_break && n3 < this.id_byte ? this.id_break(n, n2, n3) : false;
        }
        return false;
    }

    protected rjp_3(int n, int n2, int n3) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
    }

    protected boolean id_class(int n, int n2, int n3, int n4) {
        for (int i = n; i < n2; ++i) {
            if (this.id_byte(n3, n4, i)) continue;
            return false;
        }
        return true;
    }

    private void id_class(rjT_2 rjT_22, ryF_2 ryF_22, boolean bl) {
        ryF_2 ryF_23 = ryF_22.id_class();
        int n = this.id_byte(ryF_23.id_class(rpB_2.X));
        int n2 = this.id_byte(ryF_23.id_class(rpB_2.Y));
        int n3 = this.id_byte(ryF_23.id_class(rpB_2.Z));
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n2; ++j) {
                int n4 = -1;
                for (int k = 0; k <= n3; ++k) {
                    int n5 = 0;
                    int n6 = 0;
                    for (int i2 = 0; i2 <= 1; ++i2) {
                        for (int i3 = 0; i3 <= 1; ++i3) {
                            if (!this.id_class(ryF_23, i + i2 - 1, j + i3 - 1, k)) continue;
                            ++n5;
                            n6 ^= i2 ^ i3;
                        }
                    }
                    if (n5 == 1 || n5 == 3 || n5 == 2 && !(n6 & true)) {
                        if (bl) {
                            if (n4 != -1) continue;
                            n4 = k;
                            continue;
                        }
                        rjT_22.consume(ryF_23.id_class(i, j, k, rpB_2.X), ryF_23.id_class(i, j, k, rpB_2.Y), ryF_23.id_class(i, j, k, rpB_2.Z), ryF_23.id_class(i, j, k + 1, rpB_2.X), ryF_23.id_class(i, j, k + 1, rpB_2.Y), ryF_23.id_class(i, j, k + 1, rpB_2.Z));
                        continue;
                    }
                    if (n4 == -1) continue;
                    rjT_22.consume(ryF_23.id_class(i, j, n4, rpB_2.X), ryF_23.id_class(i, j, n4, rpB_2.Y), ryF_23.id_class(i, j, n4, rpB_2.Z), ryF_23.id_class(i, j, k, rpB_2.X), ryF_23.id_class(i, j, k, rpB_2.Y), ryF_23.id_class(i, j, k, rpB_2.Z));
                    n4 = -1;
                }
            }
        }
    }

    public void id_class(rjT_2 rjT_22, boolean bl) {
        this.id_class(rjT_22, ryF_2.NONE, bl);
        this.id_class(rjT_22, ryF_2.FORWARD, bl);
        this.id_class(rjT_22, ryF_2.BACKWARD, bl);
    }

    public boolean id_class(ryF_2 ryF_22, int n, int n2, int n3) {
        return this.id_byte(ryF_22.id_class(n, n2, n3, rpB_2.X), ryF_22.id_class(n, n2, n3, rpB_2.Y), ryF_22.id_class(n, n2, n3, rpB_2.Z));
    }

    private void id_class(rjq_3 rjq_32, ryF_2 ryF_22) {
        ryF_2 ryF_23 = ryF_22.id_class();
        rpB_2 rpB_22 = ryF_23.id_class(rpB_2.Z);
        int n = this.id_byte(ryF_23.id_class(rpB_2.X));
        int n2 = this.id_byte(ryF_23.id_class(rpB_2.Y));
        int n3 = this.id_byte(rpB_22);
        rpr_3 rpr_32 = rpr_3.id_class(rpB_22, rpG_2.NEGATIVE);
        rpr_3 rpr_33 = rpr_3.id_class(rpB_22, rpG_2.POSITIVE);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                boolean bl = false;
                for (int k = 0; k <= n3; ++k) {
                    boolean bl2;
                    boolean bl3 = bl2 = k != n3 && this.id_break(ryF_23, i, j, k);
                    if (!bl && bl2) {
                        rjq_32.consume(rpr_32, ryF_23.id_class(i, j, k, rpB_2.X), ryF_23.id_class(i, j, k, rpB_2.Y), ryF_23.id_class(i, j, k, rpB_2.Z));
                    }
                    if (bl && !bl2) {
                        rjq_32.consume(rpr_33, ryF_23.id_class(i, j, k - 1, rpB_2.X), ryF_23.id_class(i, j, k - 1, rpB_2.Y), ryF_23.id_class(i, j, k - 1, rpB_2.Z));
                    }
                    bl = bl2;
                }
            }
        }
    }

    public void id_class(rjq_3 rjq_32) {
        this.id_class(rjq_32, ryF_2.NONE);
        this.id_class(rjq_32, ryF_2.FORWARD);
        this.id_class(rjq_32, ryF_2.BACKWARD);
    }

    protected boolean id_class(int n, int n2, int n3, int n4, int n5) {
        for (int i = n; i < n2; ++i) {
            if (this.id_class(n3, n4, i, n5)) continue;
            return false;
        }
        return true;
    }

    protected void id_class(int n, int n2, int n3, int n4, boolean bl) {
        for (int i = n; i < n2; ++i) {
            this.id_class(n3, n4, i, false, bl);
        }
    }

    public int id_class(rpB_2 rpB_22, int n, int n2) {
        if (n >= 0 && n2 >= 0) {
            rpB_2 rpB_23 = ryF_2.FORWARD.id_class(rpB_22);
            rpB_2 rpB_24 = ryF_2.BACKWARD.id_class(rpB_22);
            if (n < this.id_byte(rpB_23) && n2 < this.id_byte(rpB_24)) {
                int n3 = this.id_byte(rpB_22);
                ryF_2 ryF_22 = ryF_2.id_class(rpB_2.X, rpB_22);
                for (int i = n3 - 1; i >= 0; --i) {
                    if (!this.id_break(ryF_22, i, n, n2)) continue;
                    return i + 1;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public boolean id_class() {
        for (rpB_2 rpB_22 : id_protected) {
            if (this.id_class(rpB_22) < this.id_break(rpB_22)) continue;
            return true;
        }
        return false;
    }

    public abstract void id_class(int var1, int var2, int var3, boolean var4, boolean var5);

    public abstract int id_class(rpB_2 var1);

    public int id_break() {
        return this.id_byte(rpB_2.X);
    }

    public void id_break(rjT_2 rjT_22, boolean bl) {
        rjd_3 rjd_32 = new rjd_3(this);
        for (int i = 0; i <= this.id_class; ++i) {
            for (int j = 0; j <= this.id_break; ++j) {
                int n = -1;
                for (int k = 0; k <= this.id_byte; ++k) {
                    int n2;
                    if (rjd_32.id_byte(i, j, k)) {
                        if (bl) {
                            if (n != -1) continue;
                            n = k;
                            continue;
                        }
                        rjT_22.consume(i, j, k, i + 1, j + 1, k + 1);
                        continue;
                    }
                    if (n == -1) continue;
                    int n3 = i;
                    int n4 = i;
                    int n5 = j;
                    int n6 = j;
                    ((rjp_3)rjd_32).id_class(n, k, i, j, false);
                    while (((rjp_3)rjd_32).id_class(n, k, n3 - 1, n5)) {
                        ((rjp_3)rjd_32).id_class(n, k, n3 - 1, n5, false);
                        --n3;
                    }
                    while (((rjp_3)rjd_32).id_class(n, k, n4 + 1, n5)) {
                        ((rjp_3)rjd_32).id_class(n, k, n4 + 1, n5, false);
                        ++n4;
                    }
                    while (rjd_32.id_class(n3, n4 + 1, n, k, n5 - 1)) {
                        for (n2 = n3; n2 <= n4; ++n2) {
                            ((rjp_3)rjd_32).id_class(n, k, n2, n5 - 1, false);
                        }
                        --n5;
                    }
                    while (rjd_32.id_class(n3, n4 + 1, n, k, n6 + 1)) {
                        for (n2 = n3; n2 <= n4; ++n2) {
                            ((rjp_3)rjd_32).id_class(n, k, n2, n6 + 1, false);
                        }
                        ++n6;
                    }
                    rjT_22.consume(n3, n5, n, n4 + 1, n6 + 1, k);
                    n = -1;
                }
            }
        }
    }

    public boolean id_break(ryF_2 ryF_22, int n, int n2, int n3) {
        return this.id_break(ryF_22.id_class(n, n2, n3, rpB_2.X), ryF_22.id_class(n, n2, n3, rpB_2.Y), ryF_22.id_class(n, n2, n3, rpB_2.Z));
    }

    public abstract boolean id_break(int var1, int var2, int var3);

    public abstract int id_break(rpB_2 var1);

    public int id_protected() {
        return this.id_byte(rpB_2.Z);
    }
}

