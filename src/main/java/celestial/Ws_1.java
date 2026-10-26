/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jo_1;
import celestial.Jq_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rCR;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpa_3;
import celestial.rqd_3;
import celestial.xc_3;
import celestial.xd_3;

public class Ws_1
extends Jo_1 {
    public static final rCu_1<rCR> id_package = rCT.O;
    public static final rCN id_int = rCT.id_return;

    protected Ws_1(Jq_1 jq_1) {
        super(true, jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_package, rCR.NORTH_SOUTH)).id_class(id_int, false));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_package, id_int);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        rCR rCR2 = xc_32.id_byte(id_package);
        block0 : switch (rpa_32) {
            case LEFT_RIGHT: {
                switch (rCR2) {
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                }
                return super.id_class(xc_32, rpa_32);
            }
            case FRONT_BACK: {
                switch (rCR2) {
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    default: {
                        break block0;
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case NORTH_EAST: 
                }
                return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                switch (xc_32.id_byte(id_package)) {
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                }
            }
            case COUNTERCLOCKWISE_90: {
                switch (xc_32.id_byte(id_package)) {
                    case NORTH_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.EAST_WEST);
                    }
                    case EAST_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_SOUTH);
                    }
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                }
            }
            case CLOCKWISE_90: {
                switch (xc_32.id_byte(id_package)) {
                    case NORTH_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.EAST_WEST);
                    }
                    case EAST_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_SOUTH);
                    }
                    case ASCENDING_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_SOUTH);
                    }
                    case ASCENDING_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_NORTH);
                    }
                    case ASCENDING_NORTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_EAST);
                    }
                    case ASCENDING_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.ASCENDING_WEST);
                    }
                    case SOUTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_WEST);
                    }
                    case SOUTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_WEST);
                    }
                    case NORTH_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_EAST);
                    }
                    case NORTH_EAST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.SOUTH_EAST);
                    }
                }
            }
        }
        return xc_32;
    }

    protected boolean id_class(rYB rYB2, rfH_2 rfH_22, boolean bl, int n, rCR rCR2) {
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (!xc_32.id_class(this)) {
            return false;
        }
        rCR rCR3 = xc_32.id_byte(id_package);
        if (rCR2 != rCR.EAST_WEST || rCR3 != rCR.NORTH_SOUTH && rCR3 != rCR.ASCENDING_NORTH && rCR3 != rCR.ASCENDING_SOUTH) {
            if (rCR2 != rCR.NORTH_SOUTH || rCR3 != rCR.EAST_WEST && rCR3 != rCR.ASCENDING_EAST && rCR3 != rCR.ASCENDING_WEST) {
                if (xc_32.id_byte(id_int).booleanValue()) {
                    return rYB2.id_public(rfH_22) ? true : this.id_class(rYB2, rfH_22, xc_32, bl, n + 1);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    protected void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32) {
        boolean bl;
        boolean bl2 = xc_32.id_byte(id_int);
        boolean bl3 = bl = rYB2.id_public(rfH_22) || this.id_class(rYB2, rfH_22, xc_32, true, 0) || this.id_class(rYB2, rfH_22, xc_32, false, 0);
        if (bl != bl2) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_int, bl), 3);
            rYB2.id_break(rfH_22.id_break(), this);
            if (xc_32.id_byte(id_package).id_break()) {
                rYB2.id_break(rfH_22.id_final(), this);
            }
        }
    }

    protected boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl, int n) {
        if (n >= 8) {
            return false;
        }
        int n2 = rfH_22.b_();
        int n3 = rfH_22.c_();
        int n4 = rfH_22.d_();
        boolean bl2 = true;
        rCR rCR2 = xc_32.id_byte(id_package);
        switch (rCR2) {
            case NORTH_SOUTH: {
                if (bl) {
                    ++n4;
                    break;
                }
                --n4;
                break;
            }
            case EAST_WEST: {
                if (bl) {
                    --n2;
                    break;
                }
                ++n2;
                break;
            }
            case ASCENDING_EAST: {
                if (bl) {
                    --n2;
                } else {
                    ++n2;
                    ++n3;
                    bl2 = false;
                }
                rCR2 = rCR.EAST_WEST;
                break;
            }
            case ASCENDING_WEST: {
                if (bl) {
                    --n2;
                    ++n3;
                    bl2 = false;
                } else {
                    ++n2;
                }
                rCR2 = rCR.EAST_WEST;
                break;
            }
            case ASCENDING_NORTH: {
                if (bl) {
                    ++n4;
                } else {
                    --n4;
                    ++n3;
                    bl2 = false;
                }
                rCR2 = rCR.NORTH_SOUTH;
                break;
            }
            case ASCENDING_SOUTH: {
                if (bl) {
                    ++n4;
                    ++n3;
                    bl2 = false;
                } else {
                    --n4;
                }
                rCR2 = rCR.NORTH_SOUTH;
            }
        }
        if (this.id_class(rYB2, new rfH_2(n2, n3, n4), bl, n, rCR2)) {
            return true;
        }
        return bl2 && this.id_class(rYB2, new rfH_2(n2, n3 - 1, n4), bl, n, rCR2);
    }

    @Override
    public rCZ<rCR> id_implements() {
        return id_package;
    }
}

