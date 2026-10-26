/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iB_2;
import celestial.rEK;
import celestial.rFy_1;
import celestial.rHf_1;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rHA
extends ryO_2
implements rHf_1 {
    private static final xd_3[] id_break = new xd_3[]{xu_3.Em, xu_3.EZ, xu_3.EH, xu_3.Ev};
    public int id_class;
    private float id_byte;
    private boolean id_protected;
    private boolean id_throws;
    private final List<rfH_2> id_case = Lists.newArrayList();
    private iB_2 id_catch;
    private UUID id_private;
    private long id_implements;

    public rHA() {
        this(ryW_2.id_goto);
    }

    public rHA(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    public void id_class(rqA_2 rqA_22) {
        this.id_extends.id_class((rhd_3)null, this.id_native, rqA_22, rqL_2.BLOCKS, 1.0f, 1.0f);
    }

    public float id_class(float f) {
        return (this.id_byte + f) * -0.0375f;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_private = rcd_32.id_break("Target") ? rcd_32.id_class("Target") : null;
    }

    private void id_class(boolean bl) {
        if (bl != this.id_protected) {
            this.id_class(bl ? rqn_3.Ps : rqn_3.PM);
        }
        this.id_protected = bl;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_catch != null) {
            rcd_32.id_class("Target", this.id_catch.ro());
        }
        return rcd_32;
    }

    private void id_break(boolean bl) {
        this.id_throws = bl;
    }

    @Override
    public void id_throws() {
        ++this.id_class;
        long l = this.id_extends.r();
        if (l % 40L == 0L) {
            this.id_class(this.id_finally());
            if (!this.id_extends.id_continue && this.id_catch()) {
                this.id_extends();
                this.id_native();
            }
        }
        if (l % 80L == 0L && this.id_catch()) {
            this.id_class(rqn_3.PE);
        }
        if (l > this.id_implements && this.id_catch()) {
            this.id_implements = l + 60L + (long)this.id_extends.id_long().nextInt(40);
            this.id_class(rqn_3.PG);
        }
        if (this.id_extends.id_continue) {
            this.id_volatile();
            this.id_new();
            if (this.id_catch()) {
                this.id_byte += 1.0f;
            }
        }
    }

    private boolean id_finally() {
        int n;
        int n2;
        int n3;
        this.id_case.clear();
        for (n3 = -1; n3 <= 1; ++n3) {
            for (n2 = -1; n2 <= 1; ++n2) {
                for (n = -1; n <= 1; ++n) {
                    rfH_2 rfH_22 = this.id_native.id_break(n3, n2, n);
                    if (this.id_extends.id_final(rfH_22)) continue;
                    return false;
                }
            }
        }
        for (n3 = -2; n3 <= 2; ++n3) {
            for (n2 = -2; n2 <= 2; ++n2) {
                for (n = -2; n <= 2; ++n) {
                    int n4 = Math.abs(n3);
                    int n5 = Math.abs(n2);
                    int n6 = Math.abs(n);
                    if (n4 <= 1 && n5 <= 1 && n6 <= 1 || (n3 != 0 || n5 != 2 && n6 != 2) && (n2 != 0 || n4 != 2 && n6 != 2) && (n != 0 || n4 != 2 && n5 != 2)) continue;
                    rfH_2 rfH_23 = this.id_native.id_break(n3, n2, n);
                    xc_3 xc_32 = this.id_extends.id_byte(rfH_23);
                    for (xd_3 xd_32 : id_break) {
                        if (!xc_32.id_class(xd_32)) continue;
                        this.id_case.add(rfH_23);
                    }
                }
            }
        }
        this.id_break(this.id_case.size() >= 42);
        return this.id_case.size() >= 16;
    }

    public boolean id_catch() {
        return this.id_protected;
    }

    private void id_extends() {
        int n;
        int n2;
        int n3 = this.id_case.size();
        int n4 = n3 / 7 * 16;
        int n5 = this.id_native.b_();
        rfl_3 rfl_32 = new rfl_3(n5, n2 = this.id_native.c_(), n = this.id_native.d_(), n5 + 1, n2 + 1, n + 1).id_class(n4).id_break(0.0, this.id_extends.id_try(), 0.0);
        List<rhd_3> list = this.id_extends.id_class(rhd_3.class, rfl_32);
        if (!list.isEmpty()) {
            for (rhd_3 rhd_32 : list) {
                if (!this.id_native.id_class(rhd_32.Bs(), (double)n4) || !rhd_32.Pf()) continue;
                rhd_32.id_break(new rLY(rLD.id_throw, 260, 0, true, true));
            }
        }
    }

    private void id_new() {
        float f;
        float f2;
        Random random = this.id_extends.id_int;
        double d = rfU_2.id_class((float)(this.id_class + 35) * 0.1f) / 2.0f + 0.5f;
        d = (d * d + d) * (double)0.3f;
        rjU_2 rjU_22 = new rjU_2((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 1.5 + d, (double)this.id_native.d_() + 0.5);
        for (rfH_2 rfH_22 : this.id_case) {
            if (random.nextInt(50) != 0) continue;
            f2 = -0.5f + random.nextFloat();
            f = -2.0f + random.nextFloat();
            float f3 = -0.5f + random.nextFloat();
            rfH_2 rfH_23 = rfH_22.id_byte(this.id_native);
            rjU_2 rjU_23 = new rjU_2(f2, f, f3).id_break(rfH_23.b_(), rfH_23.c_(), rfH_23.d_());
            this.id_extends.id_class(rLQ.h, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected);
        }
        if (this.id_catch != null) {
            rjU_2 rjU_24 = new rjU_2(this.id_catch.rx(), this.id_catch.rH(), this.id_catch.BO());
            float f4 = (-0.5f + random.nextFloat()) * (3.0f + this.id_catch.PN());
            f2 = -1.0f + random.nextFloat() * this.id_catch.Bm();
            f = (-0.5f + random.nextFloat()) * (3.0f + this.id_catch.PN());
            rjU_2 rjU_25 = new rjU_2(f4, f2, f);
            this.id_extends.id_class(rLQ.h, rjU_24.id_break, rjU_24.id_byte, rjU_24.id_protected, rjU_25.id_break, rjU_25.id_byte, rjU_25.id_protected);
        }
    }

    private iB_2 id_package() {
        List<iB_2> list = this.id_extends.id_class(iB_2.class, this.id_final(), iB_22 -> iB_22.ro().equals(this.id_private));
        return list.size() == 1 ? list.get(0) : null;
    }

    public boolean id_private() {
        return this.id_throws;
    }

    private rfl_3 id_final() {
        int n = this.id_native.b_();
        int n2 = this.id_native.c_();
        int n3 = this.id_native.d_();
        return new rfl_3(n, n2, n3, n + 1, n2 + 1, n3 + 1).id_class(8.0);
    }

    private void id_volatile() {
        if (this.id_private == null) {
            this.id_catch = null;
        } else if (this.id_catch == null || !this.id_catch.ro().equals(this.id_private)) {
            this.id_catch = this.id_package();
            if (this.id_catch == null) {
                this.id_private = null;
            }
        }
    }

    private void id_native() {
        List<iB_2> list;
        iB_2 iB_23 = this.id_catch;
        int n = this.id_case.size();
        if (n < 42) {
            this.id_catch = null;
        } else if (this.id_catch == null && this.id_private != null) {
            this.id_catch = this.id_package();
            this.id_private = null;
        } else if (this.id_catch == null) {
            list = this.id_extends.id_class(iB_2.class, this.id_final(), iB_22 -> iB_22 instanceof rEK && iB_22.Pf());
            if (!list.isEmpty()) {
                this.id_catch = (iB_2)list.get(this.id_extends.id_int.nextInt(list.size()));
            }
        } else if (!this.id_catch.BM() || !this.id_native.id_class(this.id_catch.Bs(), 8.0)) {
            this.id_catch = null;
        }
        if (this.id_catch != null) {
            this.id_extends.id_class((rhd_3)null, this.id_catch.rx(), this.id_catch.re(), this.id_catch.BO(), rqn_3.Pb, rqL_2.BLOCKS, 1.0f, 1.0f);
            this.id_catch.id_break(rye_3.id_package, 4.0f);
        }
        if (iB_23 != this.id_catch) {
            list = this.id_abstract();
            this.id_extends.id_class(this.id_native, (xc_3)((Object)list), (xc_3)((Object)list), 2);
        }
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 5, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

