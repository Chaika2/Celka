/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.WJ;
import celestial.rCR;
import celestial.rCZ;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public abstract class Jo_1
extends xd_3 {
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
    protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    private final boolean id_package;

    protected Jo_1(boolean bl, Jq_1 jq_1) {
        super(jq_1);
        this.id_package = bl;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (!rYB2.id_continue && rYB2.id_byte(rfH_22).id_class(this)) {
            rCR rCR2 = xc_32.id_byte(this.id_implements());
            if (Jo_1.id_class(rfH_22, rYB2, rCR2)) {
                Jo_1.id_protected(xc_32, rYB2, rfH_22);
                rYB2.id_class(rfH_22, bl);
            } else {
                this.id_class(xc_32, rYB2, rfH_22, xd_32);
            }
        }
    }

    private static boolean id_class(rfH_2 rfH_22, rYB rYB2, rCR rCR2) {
        if (!Jo_1.id_byte(rYB2, rfH_22.id_break())) {
            return true;
        }
        switch (rCR2) {
            case ASCENDING_EAST: {
                return !Jo_1.id_byte(rYB2, rfH_22.id_extends());
            }
            case ASCENDING_WEST: {
                return !Jo_1.id_byte(rYB2, rfH_22.id_byte());
            }
            case ASCENDING_NORTH: {
                return !Jo_1.id_byte(rYB2, rfH_22.id_private());
            }
            case ASCENDING_SOUTH: {
                return !Jo_1.id_byte(rYB2, rfH_22.id_protected());
            }
        }
        return false;
    }

    protected void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32) {
    }

    protected xc_3 id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        if (rYB2.id_continue) {
            return xc_32;
        }
        rCR rCR2 = xc_32.id_byte(this.id_implements());
        return new WJ(rYB2, rfH_22, xc_32).id_class(rYB2.id_public(rfH_22), bl, rCR2).id_byte();
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = super.id_continue();
        rpr_3 rpr_32 = rxx_32.id_case();
        boolean bl = rpr_32 == rpr_3.EAST || rpr_32 == rpr_3.WEST;
        return (xc_3)xc_32.id_class(this.id_implements(), bl ? rCR.EAST_WEST : rCR.NORTH_SOUTH);
    }

    public static boolean id_class(rYB rYB2, rfH_2 rfH_22) {
        return Jo_1.id_catch(rYB2.id_byte(rfH_22));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rCR rCR2 = xc_32.id_class(this) ? xc_32.id_byte(this.id_implements()) : null;
        return rCR2 != null && rCR2.id_break() ? id_final : id_volatile;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return Jo_1.id_byte(rRR2, rfH_22.id_break());
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break())) {
            this.id_class(xc_32, rYB2, rfH_22, bl);
        }
    }

    protected xc_3 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, boolean bl) {
        xc_32 = this.id_class(rYB2, rfH_22, xc_32, true);
        if (this.id_package) {
            xc_32.id_class(rYB2, rfH_22, this, rfH_22, bl);
        }
        return xc_32;
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl) {
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
            if (xc_32.id_byte(this.id_implements()).id_break()) {
                rYB2.id_break(rfH_22.id_final(), this);
            }
            if (this.id_package) {
                rYB2.id_break(rfH_22, this);
                rYB2.id_break(rfH_22.id_break(), this);
            }
        }
    }

    public boolean id_break() {
        return this.id_package;
    }

    public static boolean id_catch(xc_3 xc_32) {
        return xc_32.id_class(rls_3.id_float) && xc_32.id_break() instanceof Jo_1;
    }

    public abstract rCZ<rCR> id_implements();

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.NORMAL;
    }
}

