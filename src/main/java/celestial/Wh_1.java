/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jo_1;
import celestial.Jq_1;
import celestial.WJ;
import celestial.rCL;
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

public class Wh_1
extends Jo_1 {
    public static final rCu_1<rCR> id_package = rCT.M;

    protected Wh_1(Jq_1 jq_1) {
        super(false, jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_package, rCR.NORTH_SOUTH));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_package});
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
                    case NORTH_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.EAST_WEST);
                    }
                    case EAST_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_SOUTH);
                    }
                }
            }
            case CLOCKWISE_90: {
                switch (xc_32.id_byte(id_package)) {
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
                    case NORTH_SOUTH: {
                        return (xc_3)xc_32.id_class(id_package, rCR.EAST_WEST);
                    }
                    case EAST_WEST: {
                        return (xc_3)xc_32.id_class(id_package, rCR.NORTH_SOUTH);
                    }
                }
            }
        }
        return xc_32;
    }

    @Override
    protected void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32) {
        if (xd_32.id_continue().id_implements() && new WJ(rYB2, rfH_22, xc_32).id_break() == 3) {
            this.id_class(rYB2, rfH_22, xc_32, false);
        }
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
    public rCZ<rCR> id_implements() {
        return id_package;
    }
}

