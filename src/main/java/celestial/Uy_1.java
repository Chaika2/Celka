/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.UT;
import celestial.Uq_1;
import celestial.dQ_2;
import celestial.eX_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rsE_2;

public class Uy_1
implements UT {
    public static void id_class(rYB rYB2, rdn_3 rdn_32, int n, rpr_3 rpr_32, eX_2 eX_22) {
        double d = eX_22.id_class();
        double d2 = eX_22.id_break();
        double d3 = eX_22.id_byte();
        d2 = rpr_32.id_final() == rpB_2.Y ? (d2 -= 0.125) : (d2 -= 0.15625);
        rsE_2 rsE_22 = new rsE_2(rYB2, d, d2, d3, rdn_32);
        double d4 = rYB2.id_int.nextDouble() * 0.1 + 0.2;
        rsE_22.id_catch(rYB2.id_int.nextGaussian() * (double)0.0075f * (double)n + (double)rpr_32.id_implements() * d4, rYB2.id_int.nextGaussian() * (double)0.0075f * (double)n + (double)0.2f, rYB2.id_int.nextGaussian() * (double)0.0075f * (double)n + (double)rpr_32.id_extends() * d4);
        rYB2.a_(rsE_22);
    }

    protected void id_class(Uq_1 uq_1) {
        uq_1.id_catch().id_byte(1000, uq_1.id_protected(), 0);
    }

    protected void id_class(Uq_1 uq_1, rpr_3 rpr_32) {
        uq_1.id_catch().id_byte(2000, uq_1.id_protected(), rpr_32.id_byte());
    }

    protected rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
        eX_2 eX_22 = dQ_2.id_class(uq_1);
        rdn_3 rdn_33 = rdn_32.id_class(1);
        Uy_1.id_class(uq_1.id_catch(), rdn_33, 6, rpr_32, eX_22);
        return rdn_32;
    }

    @Override
    public final rdn_3 dispense(Uq_1 uq_1, rdn_3 rdn_32) {
        rdn_3 rdn_33 = this.id_class(uq_1, rdn_32);
        this.id_class(uq_1);
        this.id_class(uq_1, uq_1.id_throws().id_byte(dQ_2.id_volatile));
        return rdn_33;
    }
}

