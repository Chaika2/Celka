/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfi_3;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rrTR;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class rfl_3
implements rrTR {
    public final double id_class;
    public final double id_break;
    public final double id_byte;
    public final double id_protected;
    public final double id_throws;
    public final double id_case;

    public double id_byte(rfl_3 rfl_32, double d) {
        if (rfl_32.id_protected > this.id_class && rfl_32.id_class < this.id_protected && rfl_32.id_throws > this.id_break && rfl_32.id_break < this.id_throws) {
            double d2;
            if (d > 0.0 && rfl_32.id_case <= this.id_byte) {
                double d3 = this.id_byte - rfl_32.id_case;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && rfl_32.id_byte >= this.id_case && (d2 = this.id_case - rfl_32.id_byte) > d) {
                d = d2;
            }
            return d;
        }
        return d;
    }

    public Optional<Pair<rpr_3, rjU_2>> id_byte(rjU_2 rjU_22, rjU_2 rjU_23) {
        double[] dArray = new double[]{1.0};
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_byte - rjU_22.id_byte;
        double d3 = rjU_23.id_protected - rjU_22.id_protected;
        rpr_3 rpr_32 = rfl_3.id_class(this, rjU_22, dArray, null, d, d2, d3);
        if (rpr_32 == null) {
            return Optional.empty();
        }
        double d4 = dArray[0];
        return Optional.of(Pair.of((Object)rpr_32, (Object)rjU_22.id_break(d4 * d, d4 * d2, d4 * d3)));
    }

    public rfl_3 id_byte(double d, double d2, double d3) {
        double d4 = this.id_class - d;
        double d5 = this.id_break - d2;
        double d6 = this.id_byte - d3;
        double d7 = this.id_protected + d;
        double d8 = this.id_throws + d2;
        double d9 = this.id_case + d3;
        return new rfl_3(d4, d5, d6, d7, d8, d9);
    }

    public double id_byte() {
        return this.id_throws - this.id_break;
    }

    public boolean id_byte(rfl_3 rfl_32) {
        return this.id_class(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case);
    }

    public rfl_3 id_byte(rjU_2 rjU_22) {
        return this.id_byte(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public rfl_3(double d, double d2, double d3, double d4, double d5, double d6) {
        this.id_class = Math.min(d, d4);
        this.id_break = Math.min(d2, d5);
        this.id_byte = Math.min(d3, d6);
        this.id_protected = Math.max(d, d4);
        this.id_throws = Math.max(d2, d5);
        this.id_case = Math.max(d3, d6);
    }

    public rfl_3(rfH_2 rfH_22, rfH_2 rfH_23) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_23.b_(), rfH_23.c_(), rfH_23.d_());
    }

    public rfl_3(rfH_2 rfH_22) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_22.b_() + 1, rfH_22.c_() + 1, rfH_22.d_() + 1);
    }

    public rfl_3(rjU_2 rjU_22, rjU_2 rjU_23) {
        this(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rfl_3)) {
            return false;
        }
        rfl_3 rfl_32 = (rfl_3)object;
        if (Double.compare(rfl_32.id_class, this.id_class) != 0) {
            return false;
        }
        if (Double.compare(rfl_32.id_break, this.id_break) != 0) {
            return false;
        }
        if (Double.compare(rfl_32.id_byte, this.id_byte) != 0) {
            return false;
        }
        if (Double.compare(rfl_32.id_protected, this.id_protected) != 0) {
            return false;
        }
        if (Double.compare(rfl_32.id_throws, this.id_throws) != 0) {
            return false;
        }
        return Double.compare(rfl_32.id_case, this.id_case) == 0;
    }

    public String toString() {
        return "AABB[" + this.id_class + ", " + this.id_break + ", " + this.id_byte + "] -> [" + this.id_protected + ", " + this.id_throws + ", " + this.id_case + "]";
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.id_class);
        int n = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_break);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_byte);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_protected);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_throws);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_case);
        return 31 * n + (int)(l ^ l >>> 32);
    }

    private static rpr_3 id_class(double[] dArray, rpr_3 rpr_32, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, rpr_3 rpr_33, double d9, double d10, double d11) {
        double d12 = (d4 - d9) / d;
        double d13 = d10 + d12 * d2;
        double d14 = d11 + d12 * d3;
        if (0.0 < d12 && d12 < dArray[0] && d5 - 1.0E-7 < d13 && d13 < d6 + 1.0E-7 && d7 - 1.0E-7 < d14 && d14 < d8 + 1.0E-7) {
            dArray[0] = d12;
            return rpr_33;
        }
        return rpr_32;
    }

    public boolean id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.id_class < d4 && this.id_protected > d && this.id_break < d5 && this.id_throws > d2 && this.id_byte < d6 && this.id_case > d3;
    }

    public double id_class(rfl_3 rfl_32, double d) {
        if (rfl_32.id_throws > this.id_break && rfl_32.id_break < this.id_throws && rfl_32.id_case > this.id_byte && rfl_32.id_byte < this.id_case) {
            double d2;
            if (d > 0.0 && rfl_32.id_protected <= this.id_class) {
                double d3 = this.id_class - rfl_32.id_protected;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && rfl_32.id_class >= this.id_protected && (d2 = this.id_protected - rfl_32.id_class) > d) {
                d = d2;
            }
            return d;
        }
        return d;
    }

    public static rpr_3 id_class(rfl_3 rfl_32, rjU_2 rjU_22, double[] dArray, rpr_3 rpr_32, double d, double d2, double d3) {
        if (d > 1.0E-7) {
            rpr_32 = rfl_3.id_class(dArray, rpr_32, d, d2, d3, rfl_32.id_class, rfl_32.id_break, rfl_32.id_throws, rfl_32.id_byte, rfl_32.id_case, rpr_3.WEST, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        } else if (d < -1.0E-7) {
            rpr_32 = rfl_3.id_class(dArray, rpr_32, d, d2, d3, rfl_32.id_protected, rfl_32.id_break, rfl_32.id_throws, rfl_32.id_byte, rfl_32.id_case, rpr_3.EAST, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        }
        if (d2 > 1.0E-7) {
            rpr_32 = rfl_3.id_class(dArray, rpr_32, d2, d3, d, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_case, rfl_32.id_class, rfl_32.id_protected, rpr_3.DOWN, rjU_22.id_byte, rjU_22.id_protected, rjU_22.id_break);
        } else if (d2 < -1.0E-7) {
            rpr_32 = rfl_3.id_class(dArray, rpr_32, d2, d3, d, rfl_32.id_throws, rfl_32.id_byte, rfl_32.id_case, rfl_32.id_class, rfl_32.id_protected, rpr_3.UP, rjU_22.id_byte, rjU_22.id_protected, rjU_22.id_break);
        }
        if (d3 > 1.0E-7) {
            rpr_32 = rfl_3.id_class(dArray, rpr_32, d3, d, d2, rfl_32.id_byte, rfl_32.id_class, rfl_32.id_protected, rfl_32.id_break, rfl_32.id_throws, rpr_3.NORTH, rjU_22.id_protected, rjU_22.id_break, rjU_22.id_byte);
        } else if (d3 < -1.0E-7) {
            rpr_32 = rfl_3.id_class(dArray, rpr_32, d3, d, d2, rfl_32.id_case, rfl_32.id_class, rfl_32.id_protected, rfl_32.id_break, rfl_32.id_throws, rpr_3.SOUTH, rjU_22.id_protected, rjU_22.id_break, rjU_22.id_byte);
        }
        return rpr_32;
    }

    public double id_class() {
        double d = this.id_break();
        double d2 = this.id_byte();
        double d3 = this.id_protected();
        return (d + d2 + d3) / 3.0;
    }

    public boolean id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        return this.id_class(Math.min(rjU_22.id_break, rjU_23.id_break), Math.min(rjU_22.id_byte, rjU_23.id_byte), Math.min(rjU_22.id_protected, rjU_23.id_protected), Math.max(rjU_22.id_break, rjU_23.id_break), Math.max(rjU_22.id_byte, rjU_23.id_byte), Math.max(rjU_22.id_protected, rjU_23.id_protected));
    }

    public static rff_3 id_class(Iterable<rfl_3> iterable, rjU_2 rjU_22, rjU_2 rjU_23, rfH_2 rfH_22) {
        double[] dArray = new double[]{1.0};
        rpr_3 rpr_32 = null;
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_byte - rjU_22.id_byte;
        double d3 = rjU_23.id_protected - rjU_22.id_protected;
        for (rfl_3 rfl_32 : iterable) {
            rpr_32 = rfl_3.id_class(rfl_32.id_class(rfH_22), rjU_22, dArray, rpr_32, d, d2, d3);
        }
        if (rpr_32 == null) {
            return null;
        }
        double d4 = dArray[0];
        return new rff_3(rjU_22.id_break(d4 * d, d4 * d2, d4 * d3), rpr_32, rfH_22, false);
    }

    public rfl_3 id_class(double d) {
        return this.id_byte(d, d, d);
    }

    public static rfl_3 id_class(rfi_3 rfi_32) {
        return new rfl_3(rfi_32.id_class, rfi_32.id_break, rfi_32.id_byte, rfi_32.id_protected + 1, rfi_32.id_throws + 1, rfi_32.id_case + 1);
    }

    public rfl_3 id_class(double d, double d2, double d3) {
        double d4 = this.id_class;
        double d5 = this.id_break;
        double d6 = this.id_byte;
        double d7 = this.id_protected;
        double d8 = this.id_throws;
        double d9 = this.id_case;
        if (d < 0.0) {
            d4 -= d;
        } else if (d > 0.0) {
            d7 -= d;
        }
        if (d2 < 0.0) {
            d5 -= d2;
        } else if (d2 > 0.0) {
            d8 -= d2;
        }
        if (d3 < 0.0) {
            d6 -= d3;
        } else if (d3 > 0.0) {
            d9 -= d3;
        }
        return new rfl_3(d4, d5, d6, d7, d8, d9);
    }

    public double id_class(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_class, this.id_break, this.id_byte);
    }

    public static rfl_3 id_class(rjU_2 rjU_22) {
        return new rfl_3(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rjU_22.id_break + 1.0, rjU_22.id_byte + 1.0, rjU_22.id_protected + 1.0);
    }

    public rfl_3 id_class(rfH_2 rfH_22) {
        return new rfl_3(this.id_class + (double)rfH_22.b_(), this.id_break + (double)rfH_22.c_(), this.id_byte + (double)rfH_22.d_(), this.id_protected + (double)rfH_22.b_(), this.id_throws + (double)rfH_22.c_(), this.id_case + (double)rfH_22.d_());
    }

    public rfl_3 id_class(rfl_3 rfl_32) {
        double d = Math.max(this.id_class, rfl_32.id_class);
        double d2 = Math.max(this.id_break, rfl_32.id_break);
        double d3 = Math.max(this.id_byte, rfl_32.id_byte);
        double d4 = Math.min(this.id_protected, rfl_32.id_protected);
        double d5 = Math.min(this.id_throws, rfl_32.id_throws);
        double d6 = Math.min(this.id_case, rfl_32.id_case);
        return new rfl_3(d, d2, d3, d4, d5, d6);
    }

    public double id_break(rfl_3 rfl_32, double d) {
        if (rfl_32.id_protected > this.id_class && rfl_32.id_class < this.id_protected && rfl_32.id_case > this.id_byte && rfl_32.id_byte < this.id_case) {
            double d2;
            if (d > 0.0 && rfl_32.id_throws <= this.id_break) {
                double d3 = this.id_break - rfl_32.id_throws;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && rfl_32.id_break >= this.id_throws && (d2 = this.id_throws - rfl_32.id_break) > d) {
                d = d2;
            }
            return d;
        }
        return d;
    }

    public rfl_3 id_break(double d) {
        return this.id_class(-d);
    }

    public double id_break(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_protected, this.id_throws, this.id_case);
    }

    public Optional<rjU_2> id_break(rjU_2 rjU_22, rjU_2 rjU_23) {
        double[] dArray = new double[]{1.0};
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_byte - rjU_22.id_byte;
        double d3 = rjU_23.id_protected - rjU_22.id_protected;
        rpr_3 rpr_32 = rfl_3.id_class(this, rjU_22, dArray, null, d, d2, d3);
        if (rpr_32 == null) {
            return Optional.empty();
        }
        double d4 = dArray[0];
        return Optional.of(rjU_22.id_break(d4 * d, d4 * d2, d4 * d3));
    }

    public rfl_3 id_break(rjU_2 rjU_22) {
        return this.id_break(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public boolean id_break(rfH_2 rfH_22) {
        return this.id_throws(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public rfl_3 id_break(rfl_3 rfl_32) {
        double d = Math.min(this.id_class, rfl_32.id_class);
        double d2 = Math.min(this.id_break, rfl_32.id_break);
        double d3 = Math.min(this.id_byte, rfl_32.id_byte);
        double d4 = Math.max(this.id_protected, rfl_32.id_protected);
        double d5 = Math.max(this.id_throws, rfl_32.id_throws);
        double d6 = Math.max(this.id_case, rfl_32.id_case);
        return new rfl_3(d, d2, d3, d4, d5, d6);
    }

    public double id_break() {
        return this.id_protected - this.id_class;
    }

    public rfl_3 id_break(double d, double d2, double d3) {
        double d4 = this.id_class;
        double d5 = this.id_break;
        double d6 = this.id_byte;
        double d7 = this.id_protected;
        double d8 = this.id_throws;
        double d9 = this.id_case;
        if (d < 0.0) {
            d4 += d;
        } else if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        return new rfl_3(d4, d5, d6, d7, d8, d9);
    }

    public boolean id_throws() {
        return Double.isNaN(this.id_class) || Double.isNaN(this.id_break) || Double.isNaN(this.id_byte) || Double.isNaN(this.id_protected) || Double.isNaN(this.id_throws) || Double.isNaN(this.id_case);
    }

    public boolean id_throws(double d, double d2, double d3) {
        return d >= this.id_class && d < this.id_protected && d2 >= this.id_break && d2 < this.id_throws && d3 >= this.id_byte && d3 < this.id_case;
    }

    public rfl_3 id_throws(rjU_2 rjU_22) {
        return this.id_protected(-rjU_22.id_break, -rjU_22.id_byte, -rjU_22.id_protected);
    }

    public rfl_3 id_finally(rjU_2 rjU_22) {
        return this.id_private(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public static rfl_3 id_catch(double d, double d2, double d3) {
        return new rfl_3(-d / 2.0, -d2 / 2.0, -d3 / 2.0, d / 2.0, d2 / 2.0, d3 / 2.0);
    }

    public rfl_3 id_catch(rjU_2 rjU_22) {
        return this.id_byte(-rjU_22.id_break, -rjU_22.id_byte, -rjU_22.id_protected);
    }

    public rjU_2 id_case() {
        return new rjU_2(rfU_2.id_protected(0.5, this.id_class, this.id_protected), rfU_2.id_protected(0.5, this.id_break, this.id_throws), rfU_2.id_protected(0.5, this.id_byte, this.id_case));
    }

    public boolean id_case(rjU_2 rjU_22) {
        return this.id_throws(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public rfl_3 id_case(double d, double d2, double d3) {
        return this.id_byte(-d, -d2, -d3);
    }

    public rjU_2 id_implements(rjU_2 rjU_22) {
        float f = (float)rfU_2.id_class(rjU_22.id_break, this.id_class, this.id_protected);
        float f2 = (float)rfU_2.id_class(rjU_22.id_byte, this.id_break, this.id_throws);
        float f3 = (float)rfU_2.id_class(rjU_22.id_protected, this.id_byte, this.id_case);
        return new rjU_2(f, f2, f3);
    }

    public double id_protected() {
        return this.id_case - this.id_byte;
    }

    public rfl_3 id_protected(rjU_2 rjU_22) {
        return this.id_protected(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public boolean id_protected(rfl_3 rfl_32) {
        return this.id_class < rfl_32.id_protected && this.id_protected > rfl_32.id_class && this.id_byte < rfl_32.id_case && this.id_case > rfl_32.id_byte;
    }

    public rfl_3 id_protected(double d, double d2, double d3) {
        return new rfl_3(this.id_class + d, this.id_break + d2, this.id_byte + d3, this.id_protected + d, this.id_throws + d2, this.id_case + d3);
    }

    public rfl_3 id_private(double d, double d2, double d3) {
        return new rfl_3(d, d2, d3, d + this.id_break(), d2 + this.id_byte(), d3 + this.id_protected());
    }

    public rjU_2 id_private(rjU_2 rjU_22) {
        int n = (int)rfU_2.id_class(rjU_22.id_break, this.id_class, this.id_protected);
        int n2 = (int)rfU_2.id_class(rjU_22.id_byte, this.id_break, this.id_throws);
        int n3 = (int)rfU_2.id_class(rjU_22.id_protected, this.id_byte, this.id_case);
        return new rjU_2(n, n2, n3);
    }

    @Override
    public rjU_2 rr() {
        return this.id_case();
    }
}

