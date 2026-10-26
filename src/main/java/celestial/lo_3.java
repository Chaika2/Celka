/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hs_1;
import celestial.Hx_1;
import celestial.IJ;
import celestial.IQ;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.jG_2;
import celestial.lT_2;
import celestial.lY_2;
import celestial.rAL;
import celestial.rAn_1;
import celestial.rRp_1;
import celestial.rXE;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrGD;
import celestial.rrGK;
import celestial.rrGp_1;
import celestial.rrGq_1;
import celestial.rrQX;
import celestial.rrxr_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.yC_2;
import celestial.yS_2;
import java.util.Random;

public class lo_3
implements rAn_1 {
    private final lY_2 id_class;
    private final lT_2 id_break;
    private final Hs_1 id_byte;
    private final Random id_protected = new Random();
    private final yC_2 id_throws;

    public lT_2 id_byte() {
        return this.id_break;
    }

    public lo_3(lY_2 lY_22, yC_2 yC_22) {
        this.id_class = lY_22;
        this.id_throws = yC_22;
        this.id_break = rrxr_3.x.id_byte() ? (lT_2)rrxr_3.id_class(rrxr_3.x, this.id_throws) : new lT_2(this.id_throws);
        this.id_byte = new Hs_1();
    }

    public boolean id_class(rfH_2 rfH_22, rRp_1 rRp_12, Ok_1 ok_1, rXE rXE2) {
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_else()) {
            return false;
        }
        try {
            return this.id_byte.id_class(rRp_12, rfH_22, ok_1, rXE2);
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Tesselating liquid in world");
            Ko_1 ko_1 = kY.id_class("Block being tesselated");
            Ko_1.id_class(ko_1, rfH_22, null);
            throw new KU(kY);
        }
    }

    public IJ id_class(xc_3 xc_32) {
        return this.id_class.id_break(xc_32);
    }

    public void id_class(xc_3 xc_32, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        this.id_class(xc_32, ml_1, hx_1, n, n2, (rrGq_1)rrGp_1.id_class);
    }

    public void id_class(xc_3 xc_32, Ml_1 ml_1, Hx_1 hx_1, int n, int n2, rrGq_1 rrGq_12) {
        xN_2 xN_22 = xc_32.id_private();
        if (xN_22 != xN_2.INVISIBLE) {
            switch (xN_22) {
                case MODEL: {
                    IJ iJ = this.id_class(xc_32);
                    int n3 = this.id_throws.id_class(xc_32, (rRp_1)null, (rfH_2)null, 0);
                    float f = (float)(n3 >> 16 & 0xFF) / 255.0f;
                    float f2 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                    float f3 = (float)(n3 & 0xFF) / 255.0f;
                    this.id_break.id_class(ml_1.id_byte(), hx_1.getBuffer(yS_2.id_class(xc_32, false)), xc_32, iJ, f, f2, f3, n, n2, rrGq_12);
                    break;
                }
                case ENTITYBLOCK_ANIMATED: {
                    if (rrxr_3.Pb.id_byte()) {
                        rdn_3 rdn_32 = new rdn_3(xc_32.id_break());
                        jG_2 jG_22 = (jG_2)rrxr_3.id_private(rdn_32.id_break(), rrxr_3.Pb, new Object[0]);
                        jG_22.id_class(rdn_32, IQ.NONE, ml_1, hx_1, n, n2);
                        break;
                    }
                    jG_2.id_class.id_class(new rdn_3(xc_32.id_break()), IQ.NONE, ml_1, hx_1, n, n2);
                }
            }
        }
    }

    @Override
    public void id_class(rAL rAL2) {
        this.id_byte.id_class();
    }

    public void id_class(xc_3 xc_32, rfH_2 rfH_22, rRp_1 rRp_12, Ml_1 ml_1, Ok_1 ok_1) {
        this.id_class(xc_32, rfH_22, rRp_12, ml_1, ok_1, (rrGq_1)rrGp_1.id_class);
    }

    public void id_class(xc_3 xc_32, rfH_2 rfH_22, rRp_1 rRp_12, Ml_1 ml_1, Ok_1 ok_1, rrGq_1 rrGq_12) {
        if (xc_32.id_private() == xN_2.MODEL) {
            IJ iJ = this.id_class.id_break(xc_32);
            long l = xc_32.id_break(rfH_22);
            this.id_break.id_class(rRp_12, iJ, xc_32, rfH_22, ml_1, ok_1, true, this.id_protected, l, fZ_2.id_class, rrGq_12);
        }
    }

    public boolean id_class(xc_3 xc_32, rfH_2 rfH_22, rRp_1 rRp_12, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random) {
        return this.id_class(xc_32, rfH_22, rRp_12, ml_1, ok_1, bl, random, rrGp_1.id_class);
    }

    public boolean id_class(xc_3 xc_32, rfH_2 rfH_22, rRp_1 rRp_12, Ml_1 ml_1, Ok_1 ok_1, boolean bl, Random random, rrGq_1 rrGq_12) {
        try {
            xN_2 xN_22 = xc_32.id_private();
            return xN_22 != xN_2.MODEL ? false : this.id_break.id_class(rRp_12, this.id_class(xc_32), xc_32, rfH_22, ml_1, ok_1, bl, random, xc_32.id_break(rfH_22), fZ_2.id_class, rrGq_12);
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Tesselating block in world");
            Ko_1 ko_1 = kY.id_class("Block being tesselated");
            Ko_1.id_class(ko_1, rfH_22, xc_32);
            throw new KU(kY);
        }
    }

    public lY_2 id_break() {
        return this.id_class;
    }

    public rrGK id_protected() {
        return rrGD.MODELS;
    }
}

