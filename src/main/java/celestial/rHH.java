/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHf_1;
import celestial.rcd_3;
import celestial.rfU_2;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rpA_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import java.util.Random;

public class rHH
extends ryO_2
implements rHf_1,
rpA_2 {
    public int id_class;
    public float id_break;
    public float id_byte;
    public float id_protected;
    public float id_throws;
    public float id_case;
    public float id_catch;
    public float id_private;
    public float id_implements;
    public float id_finally;
    private static final Random id_final = new Random();
    private rgP_2 id_package;

    public rHH() {
        super(ryW_2.id_native);
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_package = rgP_22;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.Bk()) {
            rcd_32.id_class("CustomName", rgB_2.id_class(this.id_package));
        }
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        if (rcd_32.id_byte("CustomName", 8)) {
            this.id_package = rgB_2.id_class(rcd_32.id_native("CustomName"));
        }
    }

    @Override
    public rgP_2 g() {
        return this.id_package != null ? this.id_package : new rgn_3("container.enchant");
    }

    @Override
    public void id_throws() {
        float f;
        this.id_catch = this.id_case;
        this.id_implements = this.id_private;
        rhd_3 rhd_32 = this.id_extends.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5, 3.0, false);
        if (rhd_32 != null) {
            double d = rhd_32.rx() - ((double)this.id_native.b_() + 0.5);
            double d2 = rhd_32.BO() - ((double)this.id_native.d_() + 0.5);
            this.id_finally = (float)rfU_2.id_protected(d2, d);
            this.id_case += 0.1f;
            if (this.id_case < 0.5f || id_final.nextInt(40) == 0) {
                float f2 = this.id_protected;
                do {
                    this.id_protected += (float)(id_final.nextInt(4) - id_final.nextInt(4));
                } while (f2 == this.id_protected);
            }
        } else {
            this.id_finally += 0.02f;
            this.id_case -= 0.1f;
        }
        while (this.id_private >= (float)Math.PI) {
            this.id_private -= (float)Math.PI * 2;
        }
        while (this.id_private < (float)(-Math.PI)) {
            this.id_private += (float)Math.PI * 2;
        }
        while (this.id_finally >= (float)Math.PI) {
            this.id_finally -= (float)Math.PI * 2;
        }
        while (this.id_finally < (float)(-Math.PI)) {
            this.id_finally += (float)Math.PI * 2;
        }
        for (f = this.id_finally - this.id_private; f >= (float)Math.PI; f -= (float)Math.PI * 2) {
        }
        while (f < (float)(-Math.PI)) {
            f += (float)Math.PI * 2;
        }
        this.id_private += f * 0.4f;
        this.id_case = rfU_2.id_class(this.id_case, 0.0f, 1.0f);
        ++this.id_class;
        this.id_byte = this.id_break;
        float f3 = (this.id_protected - this.id_break) * 0.4f;
        float f4 = 0.2f;
        f3 = rfU_2.id_class(f3, -0.2f, 0.2f);
        this.id_throws += (f3 - this.id_throws) * 0.9f;
        this.id_break += this.id_throws;
    }

    @Override
    public rgP_2 rD() {
        return this.id_package;
    }
}

