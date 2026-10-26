/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.math.DoubleMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rjF_2;
import celestial.rjI_2;
import celestial.rjN_2;
import celestial.rjU_2;
import celestial.rjl_3;
import celestial.rjn_3;
import celestial.rjp_3;
import celestial.rjw_3;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.ryF_2;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;

public abstract class rjC_2 {
    protected final rjp_3 id_class;
    private rjC_2[] id_break;

    public double id_byte(rpB_2 rpB_22) {
        int n = this.id_class.id_break(rpB_22);
        return n <= 0 ? Double.NEGATIVE_INFINITY : this.id_class(rpB_22, n);
    }

    public rjC_2 id_byte() {
        rjC_2[] rjC_2Array = new rjC_2[]{rjw_3.id_class()};
        this.id_break((double d, double d2, double d3, double d4, double d5, double d6) -> {
            rjC_2Array[0] = rjw_3.id_break(rjC_2Array[0], rjw_3.id_class(d, d2, d3, d4, d5, d6), rjN_2.id_package);
        });
        return rjC_2Array[0];
    }

    public rjC_2(rjp_3 rjp_32) {
        this.id_class = rjp_32;
    }

    public String toString() {
        return this.id_break() ? "EMPTY" : "VoxelShape[" + this.id_class() + "]";
    }

    protected double id_class(ryF_2 ryF_22, rfl_3 rfl_32, double d) {
        block11: {
            int n;
            int n2;
            double d2;
            rpB_2 rpB_22;
            ryF_2 ryF_23;
            block10: {
                if (this.id_break()) {
                    return d;
                }
                if (Math.abs(d) < 1.0E-7) {
                    return 0.0;
                }
                ryF_23 = ryF_22.id_class();
                rpB_22 = ryF_23.id_class(rpB_2.X);
                rpB_2 rpB_23 = ryF_23.id_class(rpB_2.Y);
                rpB_2 rpB_24 = ryF_23.id_class(rpB_2.Z);
                double d3 = rfl_32.id_break(rpB_22);
                d2 = rfl_32.id_class(rpB_22);
                int n3 = this.id_class(rpB_22, d2 + 1.0E-7);
                int n4 = this.id_class(rpB_22, d3 - 1.0E-7);
                int n5 = Math.max(0, this.id_class(rpB_23, rfl_32.id_class(rpB_23) + 1.0E-7));
                n2 = Math.min(this.id_class.id_byte(rpB_23), this.id_class(rpB_23, rfl_32.id_break(rpB_23) - 1.0E-7) + 1);
                int n6 = Math.max(0, this.id_class(rpB_24, rfl_32.id_class(rpB_24) + 1.0E-7));
                n = Math.min(this.id_class.id_byte(rpB_24), this.id_class(rpB_24, rfl_32.id_break(rpB_24) - 1.0E-7) + 1);
                int n7 = this.id_class.id_byte(rpB_22);
                if (!(d > 0.0)) break block10;
                for (int i = n4 + 1; i < n7; ++i) {
                    for (int j = n5; j < n2; ++j) {
                        for (int k = n6; k < n; ++k) {
                            if (!this.id_class.id_class(ryF_23, i, j, k)) continue;
                            double d4 = this.id_class(rpB_22, i) - d3;
                            if (d4 >= -1.0E-7) {
                                d = Math.min(d, d4);
                            }
                            return d;
                        }
                    }
                }
                break block11;
            }
            if (!(d < 0.0)) break block11;
            for (int i = n3 - 1; i >= 0; --i) {
                for (int j = n5; j < n2; ++j) {
                    for (int k = n6; k < n; ++k) {
                        if (!this.id_class.id_class(ryF_23, i, j, k)) continue;
                        double d5 = this.id_class(rpB_22, i + 1) - d2;
                        if (d5 <= 1.0E-7) {
                            d = Math.max(d, d5);
                        }
                        return d;
                    }
                }
            }
        }
        return d;
    }

    public double id_class(rpB_2 rpB_22, rfl_3 rfl_32, double d) {
        return this.id_class(ryF_2.id_class(rpB_22, rpB_2.X), rfl_32, d);
    }

    public rjC_2 id_class(rpr_3 rpr_32) {
        if (!this.id_break() && this != rjw_3.id_break()) {
            rjC_2 rjC_22;
            if (this.id_break != null) {
                rjC_22 = this.id_break[rpr_32.ordinal()];
                if (rjC_22 != null) {
                    return rjC_22;
                }
            } else {
                this.id_break = new rjC_2[6];
            }
            this.id_break[rpr_32.ordinal()] = rjC_22 = this.id_break(rpr_32);
            return rjC_22;
        }
        return this;
    }

    public rff_3 id_class(rjU_2 rjU_22, rjU_2 rjU_23, rfH_2 rfH_22, boolean bl) {
        if (this.id_break()) {
            return null;
        }
        rjU_2 rjU_24 = rjU_23.id_protected(rjU_22);
        if (rjU_24.id_catch() < 1.0E-7) {
            return null;
        }
        rjU_2 rjU_25 = rjU_22.id_throws(rjU_24.id_class(0.001));
        return !bl && this.id_break(rjU_25.id_break - (double)rfH_22.b_(), rjU_25.id_byte - (double)rfH_22.c_(), rjU_25.id_protected - (double)rfH_22.d_()) ? new rff_3(rjU_25, rpr_3.id_class(rjU_24.id_break, rjU_24.id_byte, rjU_24.id_protected).id_case(), rfH_22, true) : rfl_3.id_class(this.id_protected(), rjU_22, rjU_23, rfH_22);
    }

    protected int id_class(rpB_2 rpB_22, double d) {
        return rfU_2.id_class(0, this.id_class.id_byte(rpB_22) + 1, n -> {
            if (n < 0) {
                return false;
            }
            if (n > this.id_class.id_byte(rpB_22)) {
                return true;
            }
            return d < this.id_class(rpB_22, n);
        }) - 1;
    }

    public rfl_3 id_class() {
        if (!this.id_break()) {
            return new rfl_3(this.id_break(rpB_2.X), this.id_break(rpB_2.Y), this.id_break(rpB_2.Z), this.id_byte(rpB_2.X), this.id_byte(rpB_2.Y), this.id_byte(rpB_2.Z));
        }
        return rfl_3.id_class(rjU_2.id_class);
    }

    protected double id_class(rpB_2 rpB_22, int n) {
        return this.id_class(rpB_22).getDouble(n);
    }

    public void id_class(rjI_2 rjI_22) {
        this.id_class.id_class((int n, int n2, int n3, int n4, int n5, int n6) -> rjI_22.consume(this.id_class(rpB_2.X, n), this.id_class(rpB_2.Y, n2), this.id_class(rpB_2.Z, n3), this.id_class(rpB_2.X, n4), this.id_class(rpB_2.Y, n5), this.id_class(rpB_2.Z, n6)), true);
    }

    protected abstract DoubleList id_class(rpB_2 var1);

    public rjC_2 id_class(double d, double d2, double d3) {
        return this.id_break() ? rjw_3.id_class() : new rjl_3(this.id_class, (DoubleList)new rjF_2(this.id_class(rpB_2.X), d), (DoubleList)new rjF_2(this.id_class(rpB_2.Y), d2), (DoubleList)new rjF_2(this.id_class(rpB_2.Z), d3));
    }

    public double id_class(rpB_2 rpB_22, double d, double d2) {
        int n;
        rpB_2 rpB_23 = ryF_2.FORWARD.id_class(rpB_22);
        rpB_2 rpB_24 = ryF_2.BACKWARD.id_class(rpB_22);
        int n2 = this.id_class(rpB_23, d);
        int n3 = this.id_class.id_class(rpB_22, n2, n = this.id_class(rpB_24, d2));
        return n3 <= 0 ? Double.NEGATIVE_INFINITY : this.id_class(rpB_22, n3);
    }

    public boolean id_break() {
        return this.id_class.id_class();
    }

    public double id_break(rpB_2 rpB_22) {
        int n = this.id_class.id_class(rpB_22);
        return n >= this.id_class.id_byte(rpB_22) ? Double.POSITIVE_INFINITY : this.id_class(rpB_22, n);
    }

    private rjC_2 id_break(rpr_3 rpr_32) {
        rpB_2 rpB_22 = rpr_32.id_final();
        rpG_2 rpG_22 = rpr_32.id_throws();
        DoubleList doubleList = this.id_class(rpB_22);
        if (doubleList.size() == 2 && DoubleMath.fuzzyEquals((double)doubleList.getDouble(0), (double)0.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)doubleList.getDouble(1), (double)1.0, (double)1.0E-7)) {
            return this;
        }
        int n = this.id_class(rpB_22, rpG_22 == rpG_2.POSITIVE ? 0.9999999 : 1.0E-7);
        return new rjn_3(this, rpB_22, n);
    }

    public void id_break(rjI_2 rjI_22) {
        DoubleList doubleList = this.id_class(rpB_2.X);
        DoubleList doubleList2 = this.id_class(rpB_2.Y);
        DoubleList doubleList3 = this.id_class(rpB_2.Z);
        this.id_class.id_break((n, n2, n3, n4, n5, n6) -> rjI_22.consume(doubleList.getDouble(n), doubleList2.getDouble(n2), doubleList3.getDouble(n3), doubleList.getDouble(n4), doubleList2.getDouble(n5), doubleList3.getDouble(n6)), true);
    }

    protected boolean id_break(double d, double d2, double d3) {
        return this.id_class.id_byte(this.id_class(rpB_2.X, d), this.id_class(rpB_2.Y, d2), this.id_class(rpB_2.Z, d3));
    }

    public List<rfl_3> id_protected() {
        ArrayList arrayList = Lists.newArrayList();
        this.id_break((double d, double d2, double d3, double d4, double d5, double d6) -> arrayList.add(new rfl_3(d, d2, d3, d4, d5, d6)));
        return arrayList;
    }
}

