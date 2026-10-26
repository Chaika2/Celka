/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.dz_3;
import celestial.rCL;
import celestial.rCZ;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dn_3
extends dz_3 {
    protected static final rjC_2 id_final = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    protected static final rjC_2 id_package = xd_3.id_class(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

    protected dn_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.UP));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        double d = (double)rfH_22.b_() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d2 = (double)rfH_22.c_() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d3 = (double)rfH_22.d_() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d4 = 0.4f - (random.nextFloat() + random.nextFloat()) * 0.4f;
        if (random.nextInt(5) == 0) {
            rYB2.id_class(rLQ.id_this, d + (double)rpr_32.id_implements() * d4, d2 + (double)rpr_32.id_finally() * d4, d3 + (double)rpr_32.id_extends() * d4, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005);
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return (xc_3)xc_32.id_class(id_volatile, rpa_32.id_break(xc_32.id_byte(id_volatile)));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile).id_final()) {
            default: {
                return id_int;
            }
            case Z: {
                return id_package;
            }
            case Y: 
        }
        return id_final;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3 rpr_32 = rxx_32.id_finally();
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class().id_break(rpr_32.id_case()));
        return xc_32.id_class(this) && xc_32.id_byte(id_volatile) == rpr_32 ? (xc_3)this.id_continue().id_class(id_volatile, rpr_32.id_case()) : (xc_3)this.id_continue().id_class(id_volatile, rpr_32);
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.NORMAL;
    }
}

