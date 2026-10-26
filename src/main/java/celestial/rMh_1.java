/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.an_3;
import celestial.au_3;
import celestial.rBP;
import celestial.rRu_1;
import celestial.rba_3;
import celestial.rhN_2;
import celestial.rlB_2;
import celestial.rrEm_1;
import celestial.rsP_2;

public class rMh_1
extends rBP {
    @Override
    public void id_byte() {
        ((rba_3)this.id_class).sL();
        ((rba_3)this.id_byte).sL();
        super.id_byte();
    }

    public rMh_1(rba_3 rba_32, double d) {
        super(rba_32, d);
    }

    @Override
    protected void id_catch() {
        rrEm_1 rrEm_12 = (rrEm_1)this.id_break;
        rba_3 rba_32 = (rba_3)this.id_class.id_class(rrEm_12, (au_3)this.id_byte);
        if (rba_32 != null) {
            rhN_2 rhN_22 = this.id_class.sz();
            rhN_2 rhN_23 = this.id_byte.sz();
            rhN_2 rhN_24 = rhN_22;
            if (rhN_22 != null) {
                rba_32.id_break(rhN_22.ro());
            } else {
                rhN_24 = rhN_23;
            }
            if (rhN_23 != null && rhN_22 != rhN_23) {
                rba_32.id_break(rhN_23.ro());
            }
            if (rhN_24 != null) {
                rhN_24.id_break(rlB_2.id_strictfp);
                Oo_1.id_package.id_class(rhN_24, this.id_class, this.id_byte, rba_32);
            }
            this.id_class.e_(6000);
            this.id_byte.e_(6000);
            this.id_class.sN();
            this.id_byte.sN();
            rba_32.e_(-24000);
            rba_32.id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO(), 0.0f, 0.0f);
            rrEm_12.id_class((an_3)rba_32);
            this.id_break.id_class((an_3)this.id_class, (byte)18);
            if (this.id_break.B().id_break(rRu_1.id_throws)) {
                this.id_break.a_(new rsP_2(this.id_break, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), this.id_class.Sa().nextInt(7) + 1));
            }
        }
    }
}

