/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rpB_2;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class WL
extends xd_3 {
    public static final rCu_1<rpB_2> id_new = rCT.id_abstract;

    public WL(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)this.id_continue().id_class(id_new, rpB_2.Y));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case COUNTERCLOCKWISE_90: 
            case CLOCKWISE_90: {
                switch (xc_32.id_byte(id_new)) {
                    case X: {
                        return (xc_3)xc_32.id_class(id_new, rpB_2.Z);
                    }
                    case Z: {
                        return (xc_3)xc_32.id_class(id_new, rpB_2.X);
                    }
                }
                return xc_32;
            }
        }
        return xc_32;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_new, rxx_32.id_finally().id_final());
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_new});
    }
}

