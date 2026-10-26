/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CJ;
import celestial.Hd_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.gm_3;
import celestial.ly_3;
import celestial.pg_3;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rrbb_3;
import celestial.rrdG;
import celestial.rrdZ;
import celestial.rsE_2;
import celestial.yB_2;

public class CN
extends CH {
    private final yB_2 id_class;
    private final an_3 id_break;
    private final an_3 id_instanceof;
    private int id_throw;
    private final pg_3 id_interface;

    public CN(pg_3 pg_32, yB_2 yB_22, gm_3 gm_32, an_3 an_32, an_3 an_33) {
        this(pg_32, yB_22, gm_32, an_32, an_33, an_32.rv());
    }

    private CN(pg_3 pg_32, yB_2 yB_22, gm_3 gm_32, an_3 an_32, an_3 an_33, rjU_2 rjU_22) {
        super(gm_32, an_32.rx(), an_32.re(), an_32.BO(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        this.id_class = yB_22;
        this.id_break = this.id_class(an_32);
        this.id_instanceof = an_33;
        this.id_interface = pg_32;
    }

    @Override
    public CJ id_class() {
        return CJ.id_throws;
    }

    @Override
    public void id_class(Ok_1 ok_1, ly_3 ly_32, float f) {
        rrdG rrdG2 = null;
        if (rrbb_3.rs()) {
            rrdG2 = rrdZ.Sz;
            rrdZ.id_class(this.id_break);
        }
        float f2 = ((float)this.id_throw + f) / 3.0f;
        f2 *= f2;
        double d = rfU_2.id_protected((double)f, (Double)this.id_instanceof.id_throws[34], this.id_instanceof.rx());
        double d2 = rfU_2.id_protected((double)f, (Double)this.id_instanceof.id_throws[35], this.id_instanceof.re()) + 0.5;
        double d3 = rfU_2.id_protected((double)f, (Double)this.id_instanceof.id_throws[36], this.id_instanceof.BO());
        double d4 = rfU_2.id_protected((double)f2, this.id_break.rx(), d);
        double d5 = rfU_2.id_protected((double)f2, this.id_break.re(), d2);
        double d6 = rfU_2.id_protected((double)f2, this.id_break.BO(), d3);
        Hd_1 hd_1 = this.id_class.id_break();
        rjU_2 rjU_22 = ly_32.id_break();
        this.id_interface.id_class(this.id_break, d4 - rjU_22.id_class(), d5 - rjU_22.id_break(), d6 - rjU_22.id_byte(), ((Float)this.id_break.id_throws[15]).floatValue(), f, new Ml_1(), hd_1, this.id_interface.id_class(this.id_break, f));
        hd_1.id_break();
        if (rrbb_3.rs()) {
            rrdZ.id_break((an_3)null);
            rrdZ.id_class(rrdG2);
        }
    }

    private an_3 id_class(an_3 an_32) {
        return !(an_32 instanceof rsE_2) ? an_32 : ((rsE_2)an_32).id_continue();
    }

    @Override
    public void id_case() {
        ++this.id_throw;
        if (this.id_throw == 3) {
            this.id_finally();
        }
    }
}

