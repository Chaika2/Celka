/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Oo_1;
import celestial.an_3;
import celestial.rFy_1;
import celestial.rHf_1;
import celestial.rHp_1;
import celestial.rRq_1;
import celestial.rSi_1;
import celestial.rUO;
import celestial.rUP;
import celestial.rUx_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.roJ_2;
import celestial.rpJ_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rHy_1
extends rHp_1
implements rHf_1 {
    private static final Logger id_class = LogManager.getLogger();
    private long id_break;
    private int id_byte;
    private rfH_2 id_protected;
    private boolean id_throws;

    public rHy_1() {
        super(ryW_2.id_else);
    }

    public float id_class(float f) {
        return rfU_2.id_class(((float)this.id_break + f) / 200.0f, 0.0f, 1.0f);
    }

    private void id_class(rrEm_1 rrEm_12) {
        rjU_2 rjU_22 = new rjU_2(this.id_char().b_(), 0.0, this.id_char().d_()).id_protected();
        rjU_2 rjU_23 = rjU_22.id_class(1024.0);
        int n = 16;
        while (rHy_1.id_class(rrEm_12, rjU_23).id_char() > 0 && n-- > 0) {
            id_class.debug("Skipping backwards past nonempty chunk at {}", (Object)rjU_23);
            rjU_23 = rjU_23.id_throws(rjU_22.id_class(-16.0));
        }
        n = 16;
        while (rHy_1.id_class(rrEm_12, rjU_23).id_char() == 0 && n-- > 0) {
            id_class.debug("Skipping forward past empty chunk at {}", (Object)rjU_23);
            rjU_23 = rjU_23.id_throws(rjU_22.id_class(16.0));
        }
        id_class.debug("Found chunk at {}", (Object)rjU_23);
        roJ_2 roJ_22 = rHy_1.id_class(rrEm_12, rjU_23);
        this.id_protected = rHy_1.id_class(roJ_22);
        if (this.id_protected == null) {
            this.id_protected = new rfH_2(rjU_23.id_break + 0.5, 75.0, rjU_23.id_protected + 0.5);
            id_class.debug("Failed to find suitable block, settling on {}", (Object)this.id_protected);
            rUx_1.id_throws.id_class(rrEm_12, rrEm_12.id_else().id_implements(), new Random(this.id_protected.id_package()), this.id_protected);
        } else {
            id_class.debug("Found block at {}", (Object)this.id_protected);
        }
        this.id_protected = rHy_1.id_class(rrEm_12, this.id_protected, 16, true);
        id_class.debug("Creating portal at {}", (Object)this.id_protected);
        this.id_protected = this.id_protected.id_break(10);
        this.id_class(rrEm_12, this.id_protected);
        this.id_break();
    }

    private static rfH_2 id_class(roJ_2 roJ_22) {
        rfj_3 rfj_32 = roJ_22.id_private();
        rfH_2 rfH_22 = new rfH_2(rfj_32.id_break(), 30, rfj_32.id_byte());
        int n = roJ_22.id_char() + 16 - 1;
        rfH_2 rfH_23 = new rfH_2(rfj_32.id_protected(), n, rfj_32.id_throws());
        rfH_2 rfH_24 = null;
        double d = 0.0;
        for (rfH_2 rfH_25 : rfH_2.id_class(rfH_22, rfH_23)) {
            xc_3 xc_32 = roJ_22.id_byte(rfH_25);
            rfH_2 rfH_26 = rfH_25.id_final();
            rfH_2 rfH_27 = rfH_25.id_break(2);
            if (!xc_32.id_class(xu_3.Sh) || roJ_22.id_byte(rfH_26).id_new(roJ_22, rfH_26) || roJ_22.id_byte(rfH_27).id_new(roJ_22, rfH_27)) continue;
            double d2 = rfH_25.id_class(0.0, 0.0, 0.0, true);
            if (rfH_24 != null && !(d2 < d)) continue;
            rfH_24 = rfH_25;
            d = d2;
        }
        return rfH_24;
    }

    private static roJ_2 id_class(rYB rYB2, rjU_2 rjU_22) {
        return rYB2.id_throws(rfU_2.id_byte(rjU_22.id_break / 16.0), rfU_2.id_byte(rjU_22.id_protected / 16.0));
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Age", this.id_break);
        if (this.id_protected != null) {
            rcd_32.id_class("ExitPortal", rco_3.id_class(this.id_protected));
        }
        if (this.id_throws) {
            rcd_32.id_class("ExactTeleport", this.id_throws);
        }
        return rcd_32;
    }

    private static rfH_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22, int n, boolean bl) {
        rja_3 rja_32 = null;
        for (int i = -n; i <= n; ++i) {
            block1: for (int j = -n; j <= n; ++j) {
                if (i == 0 && j == 0 && !bl) continue;
                for (int k = 255; k > (rja_32 == null ? 0 : rja_32.c_()); --k) {
                    rfH_2 rfH_23 = new rfH_2(rfH_22.b_() + i, k, rfH_22.d_() + j);
                    xc_3 xc_32 = rRq_12.id_byte(rfH_23);
                    if (!xc_32.id_new(rRq_12, rfH_23) || !bl && xc_32.id_class(xu_3.id_while)) continue;
                    rja_32 = rfH_23;
                    continue block1;
                }
            }
        }
        return rja_32 == null ? rfH_22 : rja_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_break = rcd_32.id_implements("Age");
        if (rcd_32.id_byte("ExitPortal", 10)) {
            this.id_protected = rco_3.id_break(rcd_32.id_int("ExitPortal"));
        }
        this.id_throws = rcd_32.id_new("ExactTeleport");
    }

    public void id_class(rfH_2 rfH_22, boolean bl) {
        this.id_throws = bl;
        this.id_protected = rfH_22;
    }

    public static boolean id_class(an_3 an_32) {
        return rpJ_2.id_catch.test(an_32) && !an_32.PO().rZ();
    }

    private void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        rUO.id_interface.id_break(rUP.id_class(this.id_char(), false)).id_class(rrEm_12, rrEm_12.id_else().id_implements(), new Random(), rfH_22);
    }

    @Override
    public boolean id_class(rpr_3 rpr_32) {
        return xd_3.id_byte(this.id_abstract(), this.id_extends, this.id_char(), rpr_32);
    }

    public void id_break(an_3 an_32) {
        if (this.id_extends instanceof rrEm_1 && !this.id_private()) {
            this.id_byte = 100;
            if (this.id_protected == null && this.id_extends.E() == rYB.id_throws) {
                this.id_class((rrEm_1)this.id_extends);
            }
            if (this.id_protected != null) {
                an_3 an_33;
                rfH_2 rfH_22;
                rfH_2 rfH_23 = rfH_22 = this.id_throws ? this.id_protected : this.id_native();
                if (an_32 instanceof rSi_1) {
                    an_3 an_34 = ((rSi_1)an_32).id_else();
                    if (an_34 instanceof rhN_2) {
                        Oo_1.id_protected.id_class((rhN_2)an_34, this.id_extends.id_byte(this.id_char()));
                    }
                    if (an_34 != null) {
                        an_33 = an_34;
                        an_32.PD();
                    } else {
                        an_33 = an_32;
                    }
                } else {
                    an_33 = an_32.PO();
                }
                an_33.rc();
                an_33.id_throws((double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5);
            }
            this.id_finally();
        }
    }

    public float id_break(float f) {
        return 1.0f - rfU_2.id_class(((float)this.id_byte - f) / 40.0f, 0.0f, 1.0f);
    }

    @Override
    public void id_throws() {
        boolean bl = this.id_catch();
        boolean bl2 = this.id_private();
        ++this.id_break;
        if (bl2) {
            --this.id_byte;
        } else if (!this.id_extends.id_continue) {
            List<an_3> list = this.id_extends.id_class(an_3.class, new rfl_3(this.id_char()), rHy_1::id_class);
            if (!list.isEmpty()) {
                this.id_break(list.get(this.id_extends.id_int.nextInt(list.size())));
            }
            if (this.id_break % 2400L == 0L) {
                this.id_finally();
            }
        }
        if (bl != this.id_catch() || bl2 != this.id_private()) {
            this.id_break();
        }
    }

    public void id_finally() {
        if (!this.id_extends.id_continue) {
            this.id_byte = 40;
            this.id_extends.id_class(this.id_char(), this.id_abstract().id_break(), 1, 0);
            this.id_break();
        }
    }

    public boolean id_catch() {
        return this.id_break < 200L;
    }

    public int id_extends() {
        int n = 0;
        for (rpr_3 rpr_32 : rpr_3.values()) {
            n += this.id_class(rpr_32) ? 1 : 0;
        }
        return n;
    }

    @Override
    public double id_implements() {
        return 256.0;
    }

    public boolean id_private() {
        return this.id_byte > 0;
    }

    private rfH_2 id_native() {
        rfH_2 rfH_22 = rHy_1.id_class(this.id_extends, this.id_protected.id_break(0, 2, 0), 5, false);
        id_class.debug("Best exit position for portal at {} is {}", (Object)this.id_protected, (Object)rfH_22);
        return rfH_22.id_final();
    }

    @Override
    public boolean a_(int n, int n2) {
        if (n == 1) {
            this.id_byte = 40;
            return true;
        }
        return super.a_(n, n2);
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 8, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

