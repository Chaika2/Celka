/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Rk_1;
import celestial.rCD;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPp_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrrw_1
extends rrrn_1 {
    private static final Logger id_protected = LogManager.getLogger();
    protected rrPl_1 id_class;
    protected rrPN id_break;
    protected rfH_2 id_byte;

    public rrrw_1(raF_2 raF_22, int n) {
        super(raF_22, n);
    }

    public rrrw_1(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
        this.id_byte = new rfH_2(rcd_32.id_private("TPX"), rcd_32.id_private("TPY"), rcd_32.id_private("TPZ"));
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_break.id_class(rfi_32);
        this.id_final = this.id_class.id_break(this.id_break, this.id_byte);
        if (this.id_class.id_class(rRI2, this.id_byte, rfH_22, this.id_break, random, 2)) {
            Object object;
            for (rrPp_1 rrPp_12 : this.id_class.id_class(this.id_byte, this.id_break, xu_3.Js)) {
                if (rrPp_12.id_byte == null || (object = rCD.valueOf(rrPp_12.id_byte.id_native("mode"))) != rCD.DATA) continue;
                this.id_class(rrPp_12.id_byte.id_native("metadata"), rrPp_12.id_class, rRI2, random, rfi_32);
            }
            for (rrPp_1 rrPp_12 : this.id_class.id_class(this.id_byte, this.id_break, xu_3.JE)) {
                if (rrPp_12.id_byte == null) continue;
                object = rrPp_12.id_byte.id_native("final_state");
                Rk_1 rk_1 = new Rk_1(new StringReader((String)object), false);
                xc_3 xc_32 = xu_3.id_class.id_continue();
                try {
                    rk_1.id_class(true);
                    xc_3 xc_33 = rk_1.id_break();
                    if (xc_33 != null) {
                        xc_32 = xc_33;
                    } else {
                        id_protected.error("Error while parsing blockstate {} in jigsaw block @ {}", object, (Object)rrPp_12.id_class);
                    }
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    id_protected.error("Error while parsing blockstate {} in jigsaw block @ {}", object, (Object)rrPp_12.id_class);
                }
                rRI2.id_class(rrPp_12.id_class, xc_32, 3);
            }
        }
        return true;
    }

    @Override
    public rqd_3 id_class() {
        return this.id_break.id_protected();
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        super.id_class(n, n2, n3);
        this.id_byte = this.id_byte.id_break(n, n2, n3);
    }

    protected abstract void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5);

    protected void id_class(rrPl_1 rrPl_12, rfH_2 rfH_22, rrPN rrPN2) {
        this.id_class = rrPl_12;
        this.id_class(rpr_3.NORTH);
        this.id_byte = rfH_22;
        this.id_break = rrPN2;
        this.id_final = rrPl_12.id_break(rrPN2, rfH_22);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("TPX", this.id_byte.b_());
        rcd_32.id_break("TPY", this.id_byte.c_());
        rcd_32.id_break("TPZ", this.id_byte.d_());
    }
}

