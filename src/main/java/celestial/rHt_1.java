/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.kS_2;
import celestial.rHI;
import celestial.rHK;
import celestial.rHf_1;
import celestial.rHu_1;
import celestial.rJr_1;
import celestial.rJz_1;
import celestial.rXC;
import celestial.rXF;
import celestial.rXL;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rjN_2;
import celestial.rjw_3;
import celestial.rpJ_2;
import celestial.rpr_3;
import celestial.rqs_3;
import celestial.rsE_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xt_3;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rHt_1
extends rHK
implements rHI,
rHf_1 {
    private rqs_3<rdn_3> id_case = rqs_3.id_class(5, rdn_3.id_break);
    private int id_catch = -1;
    private long id_private;

    public static List<rsE_2> id_byte(rHI rHI2) {
        return rHI2.id_byte().id_protected().stream().flatMap(rfl_32 -> rHI2.id_while().id_class(rsE_2.class, rfl_32.id_protected(rHI2.id_try() - 0.5, rHI2.id_instanceof() - 0.5, rHI2.id_throw() - 0.5), rpJ_2.id_class).stream()).collect(Collectors.toList());
    }

    private static boolean id_byte(rXu_1 rXu_12, rpr_3 rpr_32) {
        return rHt_1.id_class(rXu_12, rpr_32).allMatch(n -> rXu_12.id_extends(n).id_class());
    }

    public rHt_1() {
        super(ryW_2.id_new);
    }

    public static rdn_3 id_class(rXu_1 rXu_12, rXu_1 rXu_13, rdn_3 rdn_32, rpr_3 rpr_32) {
        if (rXu_13 instanceof rXF && rpr_32 != null) {
            rXF rXF2 = (rXF)rXu_13;
            int[] nArray = rXF2.id_class(rpr_32);
            for (int i = 0; i < nArray.length && !rdn_32.id_class(); ++i) {
                rdn_32 = rHt_1.id_class(rXu_12, rXu_13, rdn_32, nArray[i], rpr_32);
            }
        } else {
            int n = rXu_13.id_else();
            for (int i = 0; i < n && !rdn_32.id_class(); ++i) {
                rdn_32 = rHt_1.id_class(rXu_12, rXu_13, rdn_32, i, rpr_32);
            }
        }
        return rdn_32;
    }

    private static rdn_3 id_class(rXu_1 rXu_12, rXu_1 rXu_13, rdn_3 rdn_32, int n, rpr_3 rpr_32) {
        rdn_3 rdn_33 = rXu_13.id_extends(n);
        if (rHt_1.id_class(rXu_13, rdn_32, n, rpr_32)) {
            int n2;
            boolean bl = false;
            boolean bl2 = rXu_13.id_return();
            if (rdn_33.id_class()) {
                rXu_13.id_break(n, rdn_32);
                rdn_32 = rdn_3.id_break;
                bl = true;
            } else if (rHt_1.id_class(rdn_33, rdn_32)) {
                int n3 = rdn_32.id_byte() - rdn_33.id_char();
                n2 = Math.min(rdn_32.id_char(), n3);
                rdn_32.id_catch(n2);
                rdn_33.id_case(n2);
                boolean bl3 = bl = n2 > 0;
            }
            if (bl) {
                rHt_1 rHt_12;
                if (bl2 && rXu_13 instanceof rHt_1 && !(rHt_12 = (rHt_1)rXu_13).id_native()) {
                    n2 = 0;
                    if (rXu_12 instanceof rHt_1) {
                        rHt_1 rHt_13 = (rHt_1)rXu_12;
                        if (rHt_12.id_private >= rHt_13.id_private) {
                            n2 = 1;
                        }
                    }
                    rHt_12.id_class(8 - n2);
                }
                rXu_13.id_break();
            }
        }
        return rdn_32;
    }

    private static boolean id_class(rXu_1 rXu_12, rdn_3 rdn_32, int n, rpr_3 rpr_32) {
        if (!rXu_12.a_(n, rdn_32)) {
            return false;
        }
        return !(rXu_12 instanceof rXF) || ((rXF)rXu_12).id_class(n, rdn_32, rpr_32);
    }

    private static boolean id_class(rHI rHI2, rXu_1 rXu_12, int n, rpr_3 rpr_32) {
        rdn_3 rdn_32 = rXu_12.id_extends(n);
        if (!rdn_32.id_class() && rHt_1.id_break(rXu_12, rdn_32, n, rpr_32)) {
            rdn_3 rdn_33 = rdn_32.id_implements();
            rdn_3 rdn_34 = rHt_1.id_class(rXu_12, (rXu_1)rHI2, rXu_12.id_class(n, 1), (rpr_3)null);
            if (rdn_34.id_class()) {
                rXu_12.id_break();
                return true;
            }
            rXu_12.id_break(n, rdn_33);
        }
        return false;
    }

    public static boolean id_class(rXu_1 rXu_12, rsE_2 rsE_22) {
        boolean bl = false;
        rdn_3 rdn_32 = rsE_22.id_protected().id_implements();
        rdn_3 rdn_33 = rHt_1.id_class((rXu_1)null, rXu_12, rdn_32, (rpr_3)null);
        if (rdn_33.id_class()) {
            bl = true;
            rsE_22.PD();
        } else {
            rsE_22.id_break(rdn_33);
        }
        return bl;
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rJz_1(n, rhz_32, this);
    }

    public void id_class(an_3 an_32) {
        if (an_32 instanceof rsE_2) {
            rfH_2 rfH_22 = this.id_char();
            if (rjw_3.id_byte(rjw_3.id_class(an_32.rN().id_protected(-rfH_22.b_(), -rfH_22.c_(), -rfH_22.d_())), this.id_byte(), rjN_2.id_implements)) {
                this.id_class(() -> rHt_1.id_class((rXu_1)this, (rsE_2)an_32));
            }
        }
    }

    @Override
    protected void id_class(rqs_3<rdn_3> rqs_32) {
        this.id_case = rqs_32;
    }

    private void id_class(int n) {
        this.id_catch = n;
    }

    private static boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (rdn_32.id_break() != rdn_33.id_break()) {
            return false;
        }
        if (rdn_32.id_catch() != rdn_33.id_catch()) {
            return false;
        }
        if (rdn_32.id_char() > rdn_32.id_byte()) {
            return false;
        }
        return rdn_3.id_class(rdn_32, rdn_33);
    }

    public static rXu_1 id_class(rYB rYB2, double d, double d2, double d3) {
        Object object;
        rXu_1 rXu_12 = null;
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof rXL) {
            rXu_12 = ((rXL)((Object)xd_32)).id_class(xc_32, rYB2, rfH_22);
        } else if (xd_32.id_protected() && (object = rYB2.id_class(rfH_22)) instanceof rXu_1 && (rXu_12 = (rXu_1)object) instanceof rHu_1 && xd_32 instanceof xt_3) {
            rXu_12 = xt_3.id_class((xt_3)xd_32, xc_32, rYB2, rfH_22, true);
        }
        if (rXu_12 == null && !(object = rYB2.id_break((an_3)null, new rfl_3(d - 0.5, d2 - 0.5, d3 - 0.5, d + 0.5, d2 + 0.5, d3 + 0.5), rpJ_2.id_protected)).isEmpty()) {
            rXu_12 = (rXu_1)object.get(rYB2.id_int.nextInt(object.size()));
        }
        return rXu_12;
    }

    public static rXu_1 id_class(rYB rYB2, rfH_2 rfH_22) {
        return rHt_1.id_class(rYB2, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5);
    }

    private boolean id_class(Supplier<Boolean> supplier) {
        if (this.id_extends != null && !this.id_extends.id_continue) {
            if (!this.id_extends() && this.id_abstract().id_byte(kS_2.id_final).booleanValue()) {
                boolean bl = false;
                if (!this.id_return()) {
                    bl = this.id_private();
                }
                if (!this.id_catch()) {
                    bl |= supplier.get().booleanValue();
                }
                if (bl) {
                    this.id_class(8);
                    this.id_break();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        this.id_protected(null);
        return rXC.id_class(this.ad_(), n, n2);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_byte(rcd_32)) {
            rXC.id_class(rcd_32, this.id_case);
        }
        rcd_32.id_break("TransferCooldown", this.id_catch);
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_case = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        if (!this.id_break(rcd_32)) {
            rXC.id_break(rcd_32, this.id_case);
        }
        this.id_catch = rcd_32.id_private("TransferCooldown");
    }

    private static IntStream id_class(rXu_1 rXu_12, rpr_3 rpr_32) {
        return rXu_12 instanceof rXF ? IntStream.of(((rXF)rXu_12).id_class(rpr_32)) : IntStream.range(0, rXu_12.id_else());
    }

    public static boolean id_class(rHI rHI2) {
        rXu_1 rXu_12 = rHt_1.id_break(rHI2);
        if (rXu_12 != null) {
            rpr_3 rpr_32 = rpr_3.DOWN;
            return rHt_1.id_byte(rXu_12, rpr_32) ? false : rHt_1.id_class(rXu_12, rpr_32).anyMatch(n -> rHt_1.id_class(rHI2, rXu_12, n, rpr_32));
        }
        for (rsE_2 rsE_22 : rHt_1.id_byte(rHI2)) {
            if (!rHt_1.id_class((rXu_1)rHI2, rsE_22)) continue;
            return true;
        }
        return false;
    }

    private boolean id_break(rXu_1 rXu_12, rpr_3 rpr_32) {
        return rHt_1.id_class(rXu_12, rpr_32).allMatch(n -> {
            rdn_3 rdn_32 = rXu_12.id_extends(n);
            return rdn_32.id_char() >= rdn_32.id_byte();
        });
    }

    public static rXu_1 id_break(rHI rHI2) {
        return rHt_1.id_class(rHI2.id_while(), rHI2.id_try(), rHI2.id_instanceof() + 1.0, rHI2.id_throw());
    }

    private static boolean id_break(rXu_1 rXu_12, rdn_3 rdn_32, int n, rpr_3 rpr_32) {
        return !(rXu_12 instanceof rXF) || ((rXF)rXu_12).id_break(n, rdn_32, rpr_32);
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_protected(null);
        this.ad_().set(n, rdn_32);
        if (rdn_32.id_char() > this.ab_()) {
            rdn_32.id_throws(this.ab_());
        }
    }

    @Override
    public void id_throws() {
        if (this.id_extends != null && !this.id_extends.id_continue) {
            --this.id_catch;
            this.id_private = this.id_extends.r();
            if (!this.id_extends()) {
                this.id_class(0);
                this.id_class(() -> rHt_1.id_class(this));
            }
        }
    }

    private rXu_1 id_finally() {
        rpr_3 rpr_32 = this.id_abstract().id_byte(kS_2.id_volatile);
        return rHt_1.id_class(this.id_while(), this.id_native.id_break(rpr_32));
    }

    private boolean id_catch() {
        for (rdn_3 rdn_32 : this.id_case) {
            if (!rdn_32.id_class() && rdn_32.id_char() == rdn_32.id_byte()) continue;
            return false;
        }
        return true;
    }

    private boolean id_extends() {
        return this.id_catch > 0;
    }

    @Override
    public int id_else() {
        return this.id_case.size();
    }

    @Override
    public double id_instanceof() {
        return (double)this.id_native.c_() + 0.5;
    }

    @Override
    public double id_throw() {
        return (double)this.id_native.d_() + 0.5;
    }

    @Override
    public double id_try() {
        return (double)this.id_native.b_() + 0.5;
    }

    private boolean id_private() {
        rXu_1 rXu_12 = this.id_finally();
        if (rXu_12 == null) {
            return false;
        }
        rpr_3 rpr_32 = this.id_abstract().id_byte(kS_2.id_volatile).id_case();
        if (this.id_break(rXu_12, rpr_32)) {
            return false;
        }
        for (int i = 0; i < this.id_else(); ++i) {
            if (this.id_extends(i).id_class()) continue;
            rdn_3 rdn_32 = this.id_extends(i).id_implements();
            rdn_3 rdn_33 = rHt_1.id_class((rXu_1)this, rXu_12, this.id_class(i, 1), rpr_32);
            if (rdn_33.id_class()) {
                rXu_12.id_break();
                return true;
            }
            this.id_break(i, rdn_32);
        }
        return false;
    }

    private boolean id_native() {
        return this.id_catch > 8;
    }

    @Override
    protected rqs_3<rdn_3> ad_() {
        return this.id_case;
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.hopper");
    }
}

