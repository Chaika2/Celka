/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEI;
import celestial.rEc_1;
import celestial.rRO;
import celestial.rYB;
import celestial.rye_3;
import java.util.EnumSet;

public class rEf_1
extends rBk_1 {
    private final rEI id_class;
    private int id_break;
    private final boolean id_byte;

    @Override
    public void id_byte() {
        this.id_break = -10;
        this.id_class.id_public().id_final();
        this.id_class.id_continue().id_class(this.id_class.I_(), 90.0f, 90.0f);
        Boolean bl = true;
        this.id_class.id_throws[57] = bl;
    }

    public rEf_1(rEI rEI2) {
        this.id_class = rEI2;
        this.id_byte = rEI2 instanceof rEc_1;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.I_();
        return iB_22 != null && iB_22.BM();
    }

    @Override
    public boolean id_break() {
        return super.id_break() && (this.id_byte || this.id_class.id_int(this.id_class.I_()) > 9.0);
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_class.I_();
        this.id_class.id_public().id_final();
        this.id_class.id_continue().id_class(iB_22, 90.0f, 90.0f);
        if (!this.id_class.id_while(iB_22)) {
            this.id_class.id_byte((iB_2)null);
        } else {
            ++this.id_break;
            if (this.id_break == 0) {
                this.id_class.id_class(this.id_class.I_().V());
                if (!this.id_class.BF()) {
                    ((rYB)this.id_class.id_throws[7]).id_class((an_3)this.id_class, (byte)21);
                }
            } else if (this.id_break >= this.id_class.L()) {
                float f = 1.0f;
                if (((rYB)this.id_class.id_throws[7]).id_abstract() == rRO.HARD) {
                    f += 2.0f;
                }
                if (this.id_byte) {
                    f += 2.0f;
                }
                iB_22.id_break(rye_3.id_byte(this.id_class, this.id_class), f);
                iB_22.id_break(rye_3.id_byte(this.id_class), (float)this.id_class.id_class(iQ_2.id_case));
                this.id_class.id_byte((iB_2)null);
            }
            super.id_throws();
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_class(0);
        this.id_class.id_byte((iB_2)null);
        this.id_class.id_break.id_private();
    }
}

