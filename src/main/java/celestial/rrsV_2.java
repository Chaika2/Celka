/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjh_3;
import celestial.rjw_3;
import celestial.roH_2;
import celestial.rol_3;
import celestial.rpr_3;
import celestial.rrsR_2;
import celestial.rrsT_2;
import celestial.rrsj_3;
import celestial.rrsw_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Arrays;
import org.apache.commons.lang3.mutable.MutableInt;

public abstract class rrsV_2<M extends rrsj_3<M>, S extends rrsR_2<M>>
extends rrsw_3
implements rrsT_2 {
    private static final rpr_3[] id_throws = rpr_3.values();
    protected final rol_3 id_class;
    protected final rRo_1 id_break;
    protected final S id_byte;
    private boolean id_case;
    protected final rfw_3 id_protected = new rfw_3();
    private final long[] id_catch = new long[2];
    private final rRq_1[] id_private = new rRq_1[2];

    @Override
    protected int id_byte(long l) {
        return l == Long.MAX_VALUE ? 0 : 15 - ((rrsR_2)this.id_byte).id_implements(l);
    }

    public rrsV_2(rol_3 rol_32, rRo_1 rRo_12, S s) {
        super(16, 256, 8192);
        this.id_class = rol_32;
        this.id_break = rRo_12;
        this.id_byte = s;
        this.id_throws();
    }

    protected void id_class(long l, roH_2 roH_22, boolean bl) {
        ((rrsR_2)this.id_byte).id_class(l, roH_22, bl);
    }

    public void id_class(rfj_3 rfj_32, boolean bl) {
        long l = rjh_3.id_case(rjh_3.id_break(rfj_32.id_break, 0, rfj_32.id_byte));
        ((rrsR_2)this.id_byte).id_break(l, bl);
    }

    public boolean id_class() {
        return this.id_break() || ((rrsw_3)this.id_byte).id_break() || ((rrsR_2)this.id_byte).id_class();
    }

    @Override
    protected void id_class(long l, int n) {
        ((rrsR_2)this.id_byte).id_break(l, Math.min(15, 15 - n));
    }

    public void id_class(rfH_2 rfH_22, int n) {
    }

    @Override
    public void id_class(rjh_3 rjh_32, boolean bl) {
        ((rrsR_2)this.id_byte).id_protected(rjh_32.id_continue(), bl);
    }

    @Override
    public int id_class(rfH_2 rfH_22) {
        return ((rrsR_2)this.id_byte).id_protected(rfH_22.id_package());
    }

    @Override
    public roH_2 id_class(rjh_3 rjh_32) {
        return ((rrsR_2)this.id_byte).id_private(rjh_32.id_continue());
    }

    @Override
    protected boolean id_class(long l) {
        return l == Long.MAX_VALUE;
    }

    public static int id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, xc_3 xc_33, rfH_2 rfH_23, rpr_3 rpr_32, int n) {
        boolean bl;
        boolean bl2 = xc_32.id_native() && xc_32.id_throws();
        boolean bl3 = bl = xc_33.id_native() && xc_33.id_throws();
        if (!bl2 && !bl) {
            return n;
        }
        rjC_2 rjC_22 = bl2 ? xc_32.id_byte(rRq_12, rfH_22) : rjw_3.id_class();
        rjC_2 rjC_23 = bl ? xc_33.id_byte(rRq_12, rfH_23) : rjw_3.id_class();
        return rjw_3.id_break(rjC_22, rjC_23, rpr_32) ? 16 : n;
    }

    protected rjC_2 id_class(xc_3 xc_32, long l, rpr_3 rpr_32) {
        return xc_32.id_native() ? xc_32.id_class(this.id_class.id_break(), (rfH_2)this.id_protected.id_case(l), rpr_32) : rjw_3.id_class();
    }

    protected xc_3 id_class(long l, MutableInt mutableInt) {
        boolean bl;
        int n;
        if (l == Long.MAX_VALUE) {
            if (mutableInt != null) {
                mutableInt.setValue(0);
            }
            return xu_3.id_class.id_continue();
        }
        int n2 = rjh_3.id_class(rfH_2.id_class(l));
        rRq_1 rRq_12 = this.id_class(n2, n = rjh_3.id_class(rfH_2.id_byte(l)));
        if (rRq_12 == null) {
            if (mutableInt != null) {
                mutableInt.setValue(16);
            }
            return xu_3.id_while.id_continue();
        }
        this.id_protected.id_case(l);
        xc_3 xc_32 = rRq_12.id_byte(this.id_protected);
        boolean bl2 = bl = xc_32.id_native() && xc_32.id_throws();
        if (mutableInt != null) {
            mutableInt.setValue(xc_32.id_break(this.id_class.id_break(), (rfH_2)this.id_protected));
        }
        return bl ? xc_32 : xu_3.id_class.id_continue();
    }

    public int id_class(int n, boolean bl, boolean bl2) {
        if (!this.id_case) {
            if (((rrsw_3)this.id_byte).id_break() && (n = ((rrsw_3)this.id_byte).id_class(n)) == 0) {
                return n;
            }
            ((rrsR_2)this.id_byte).id_class(this, bl, bl2);
        }
        this.id_case = true;
        if (this.id_break()) {
            n = this.id_class(n);
            this.id_throws();
            if (n == 0) {
                return n;
            }
        }
        this.id_case = false;
        ((rrsR_2)this.id_byte).id_case();
        return n;
    }

    protected int id_class(roH_2 roH_22, long l) {
        return 15 - roH_22.id_class(rjh_3.id_break(rfH_2.id_class(l)), rjh_3.id_break(rfH_2.id_break(l)), rjh_3.id_break(rfH_2.id_byte(l)));
    }

    private rRq_1 id_class(int n, int n2) {
        long l = rfj_3.id_class(n, n2);
        for (int i = 0; i < 2; ++i) {
            if (l != this.id_catch[i]) continue;
            return this.id_private[i];
        }
        rRq_1 rRq_12 = this.id_class.id_throws(n, n2);
        for (int i = 1; i > 0; --i) {
            this.id_catch[i] = this.id_catch[i - 1];
            this.id_private[i] = this.id_private[i - 1];
        }
        this.id_catch[0] = l;
        this.id_private[0] = rRq_12;
        return rRq_12;
    }

    @Override
    protected int id_class(long l, long l2, int n) {
        return 0;
    }

    public void id_break(rfj_3 rfj_32, boolean bl) {
        long l = rjh_3.id_case(rjh_3.id_break(rfj_32.id_break, 0, rfj_32.id_byte));
        ((rrsR_2)this.id_byte).id_byte(l, bl);
    }

    @Override
    protected int id_break(long l, long l2, int n) {
        return 0;
    }

    public String id_break(long l) {
        return "" + ((rrsR_2)this.id_byte).id_byte(l);
    }

    public void id_break(rfH_2 rfH_22) {
        long l = rfH_22.id_package();
        this.id_case(l);
        for (rpr_3 rpr_32 : id_throws) {
            this.id_case(rfH_2.id_class(l, rpr_32));
        }
    }

    private void id_throws() {
        Arrays.fill(this.id_catch, rfj_3.id_class);
        Arrays.fill(this.id_private, null);
    }

    @Override
    protected void id_case(long l) {
        ((rrsR_2)this.id_byte).id_throws();
        if (((rrsR_2)this.id_byte).id_catch(rjh_3.id_throws(l))) {
            super.id_case(l);
        }
    }
}

