/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rrGi_1;
import celestial.rrdS;
import java.util.Iterator;

public class rrdB
implements Iterator<rfH_2> {
    private rrdS id_class;
    private rrGi_1 id_break = new rrGi_1(0, 0, 0);
    private int id_byte = 0;
    private int id_protected;
    private int id_throws;
    private int id_case;
    private static final int id_catch = 0;
    private static final int id_private = 1;
    private static final int id_implements = 2;

    public rrdB(rfH_2 rfH_22, rfH_2 rfH_23, int n, int n2) {
        boolean bl = rfH_22.b_() > rfH_23.b_();
        boolean bl2 = rfH_22.c_() > rfH_23.c_();
        boolean bl3 = rfH_22.d_() > rfH_23.d_();
        rfH_22 = this.id_class(rfH_22, bl, bl2, bl3);
        rfH_23 = this.id_class(rfH_23, bl, bl2, bl3);
        this.id_protected = bl ? -1 : 1;
        this.id_throws = bl2 ? -1 : 1;
        this.id_case = bl3 ? -1 : 1;
        rjU_2 rjU_22 = new rjU_2(rfH_23.b_() - rfH_22.b_(), rfH_23.c_() - rfH_22.c_(), rfH_23.d_() - rfH_22.d_());
        rjU_2 rjU_23 = rjU_22.id_protected();
        rjU_2 rjU_24 = new rjU_2(1.0, 0.0, 0.0);
        double d = rjU_23.id_break(rjU_24);
        double d2 = Math.abs(d);
        rjU_2 rjU_25 = new rjU_2(0.0, 1.0, 0.0);
        double d3 = rjU_23.id_break(rjU_25);
        double d4 = Math.abs(d3);
        rjU_2 rjU_26 = new rjU_2(0.0, 0.0, 1.0);
        double d5 = rjU_23.id_break(rjU_26);
        double d6 = Math.abs(d5);
        if (d6 >= d4 && d6 >= d2) {
            this.id_byte = 2;
            rfH_2 rfH_24 = new rfH_2(rfH_22.d_(), rfH_22.c_() - n, rfH_22.b_() - n2);
            rfH_2 rfH_25 = new rfH_2(rfH_23.d_(), rfH_22.c_() + n + 1, rfH_22.b_() + n2 + 1);
            int n3 = rfH_23.d_() - rfH_22.d_();
            double d7 = (double)(rfH_23.c_() - rfH_22.c_()) / (1.0 * (double)n3);
            double d8 = (double)(rfH_23.b_() - rfH_22.b_()) / (1.0 * (double)n3);
            this.id_class = new rrdS(rfH_24, rfH_25, d7, d8);
        } else if (d4 >= d2 && d4 >= d6) {
            this.id_byte = 1;
            rfH_2 rfH_26 = new rfH_2(rfH_22.c_(), rfH_22.b_() - n, rfH_22.d_() - n2);
            rfH_2 rfH_27 = new rfH_2(rfH_23.c_(), rfH_22.b_() + n + 1, rfH_22.d_() + n2 + 1);
            int n4 = rfH_23.c_() - rfH_22.c_();
            double d9 = (double)(rfH_23.b_() - rfH_22.b_()) / (1.0 * (double)n4);
            double d10 = (double)(rfH_23.d_() - rfH_22.d_()) / (1.0 * (double)n4);
            this.id_class = new rrdS(rfH_26, rfH_27, d9, d10);
        } else {
            this.id_byte = 0;
            rfH_2 rfH_28 = new rfH_2(rfH_22.b_(), rfH_22.c_() - n, rfH_22.d_() - n2);
            rfH_2 rfH_29 = new rfH_2(rfH_23.b_(), rfH_22.c_() + n + 1, rfH_22.d_() + n2 + 1);
            int n5 = rfH_23.b_() - rfH_22.b_();
            double d11 = (double)(rfH_23.c_() - rfH_22.c_()) / (1.0 * (double)n5);
            double d12 = (double)(rfH_23.d_() - rfH_22.d_()) / (1.0 * (double)n5);
            this.id_class = new rrdS(rfH_28, rfH_29, d11, d12);
        }
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    @Override
    public boolean hasNext() {
        return this.id_class.hasNext();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    private rfH_2 id_class(rfH_2 rfH_22, boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            rfH_22 = new rfH_2(-rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
        }
        if (bl2) {
            rfH_22 = new rfH_2(rfH_22.b_(), -rfH_22.c_(), rfH_22.d_());
        }
        if (bl3) {
            rfH_22 = new rfH_2(rfH_22.b_(), rfH_22.c_(), -rfH_22.d_());
        }
        return rfH_22;
    }

    public rfH_2 id_class() {
        rfH_2 rfH_22 = this.id_class.id_class();
        switch (this.id_byte) {
            case 0: {
                this.id_break.id_class(rfH_22.b_() * this.id_protected, rfH_22.c_() * this.id_throws, rfH_22.d_() * this.id_case);
                return this.id_break;
            }
            case 1: {
                this.id_break.id_class(rfH_22.c_() * this.id_protected, rfH_22.b_() * this.id_throws, rfH_22.d_() * this.id_case);
                return this.id_break;
            }
            case 2: {
                this.id_break.id_class(rfH_22.d_() * this.id_protected, rfH_22.c_() * this.id_throws, rfH_22.b_() * this.id_case);
                return this.id_break;
            }
        }
        this.id_break.id_class(rfH_22.b_() * this.id_protected, rfH_22.c_() * this.id_throws, rfH_22.d_() * this.id_case);
        return this.id_break;
    }
}

