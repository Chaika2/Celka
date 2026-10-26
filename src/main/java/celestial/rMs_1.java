/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBO;
import celestial.rYB;
import celestial.rba_3;
import celestial.rfH_2;
import celestial.rrEm_1;

public class rMs_1
extends rBO {
    private int id_byte;
    public final /* synthetic */ rba_3 id_break;

    @Override
    public void id_byte() {
        this.id_break.sL();
        super.id_byte();
    }

    public rMs_1(rba_3 rba_32, double d) {
        this.id_break = rba_32;
        super(rba_32, d);
        this.id_byte = 100;
    }

    @Override
    public boolean id_class() {
        if (!this.id_break.Sc() && this.id_class.I_() == null) {
            if (((rYB)this.id_break.id_throws[7]).S()) {
                return true;
            }
            if (this.id_byte > 0) {
                --this.id_byte;
                return false;
            }
            this.id_byte = 100;
            rfH_2 rfH_22 = this.id_class.Bs();
            return ((rYB)this.id_break.id_throws[7]).id_strictfp() && ((rYB)this.id_break.id_throws[7]).id_case(rfH_22) && !((rrEm_1)((rYB)this.id_break.id_throws[7])).id_throw(rfH_22) && this.id_catch();
        }
        return false;
    }
}

