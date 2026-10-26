/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.an_3;
import celestial.gV_2;
import celestial.gy_3;
import celestial.rFy_1;
import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rgB_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgl_3;
import celestial.rgv_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rpl_3;
import celestial.rrEm_1;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class ryS_2
extends ryO_2 {
    private final rgP_2[] id_class = new rgP_2[]{rgN_2.id_byte, rgN_2.id_byte, rgN_2.id_byte, rgN_2.id_byte};
    private boolean id_break = true;
    private rhd_3 id_byte;
    private final rpl_3[] id_protected = new rpl_3[4];
    private rxL_2 id_throws = rxL_2.BLACK;

    public ryS_2() {
        super(ryW_2.id_private);
    }

    public void id_class(boolean bl) {
        this.id_break = bl;
        if (!bl) {
            this.id_byte = null;
        }
    }

    public boolean id_class(rxL_2 rxL_22) {
        if (rxL_22 != this.id_private()) {
            this.id_throws = rxL_22;
            this.id_break();
            this.id_extends.id_class(this.id_char(), this.id_abstract(), this.id_abstract(), 3);
            return true;
        }
        return false;
    }

    public rpl_3 id_class(int n, Function<rgP_2, rpl_3> function) {
        if (this.id_protected[n] == null && this.id_class[n] != null) {
            this.id_protected[n] = function.apply(this.id_class[n]);
        }
        return this.id_protected[n];
    }

    public void id_class(rhd_3 rhd_32) {
        this.id_byte = rhd_32;
    }

    public gy_3 id_class(rhN_2 rhN_22) {
        String string = rhN_22 == null ? "Sign" : rhN_22.g().getString();
        rgP_2 rgP_22 = rhN_22 == null ? new rgN_2("Sign") : rhN_22.L_();
        return new gy_3(gV_2.id_byte, rjU_2.id_class(this.id_native), rjK_2.id_class, (rrEm_1)this.id_extends, 2, string, rgP_22, this.id_extends.id_const(), rhN_22);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        for (int i = 0; i < 4; ++i) {
            String string = rgB_2.id_class(this.id_class[i]);
            rcd_32.id_class("Text" + (i + 1), string);
        }
        rcd_32.id_class("Color", this.id_throws.id_byte());
        return rcd_32;
    }

    public rgP_2 id_class(int n) {
        return this.id_class[n];
    }

    public void id_class(int n, rgP_2 rgP_22) {
        this.id_class[n] = rgP_22;
        this.id_protected[n] = null;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        this.id_break = false;
        super.id_class(xc_32, rcd_32);
        this.id_throws = rxL_2.id_class(rcd_32.id_native("Color"), rxL_2.BLACK);
        for (int i = 0; i < 4; ++i) {
            String string = rcd_32.id_native("Text" + (i + 1));
            rVi_1 rVi_12 = rgB_2.id_class(string.isEmpty() ? "\"\"" : string);
            if (this.id_extends instanceof rrEm_1) {
                try {
                    this.id_class[i] = rgv_3.id_class(this.id_class((rhN_2)null), rVi_12, (an_3)null, 0);
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    this.id_class[i] = rVi_12;
                }
            } else {
                this.id_class[i] = rVi_12;
            }
            this.id_protected[i] = null;
        }
    }

    public boolean id_break(rhd_3 rhd_32) {
        for (rgP_2 rgP_22 : this.id_class) {
            rgl_3 rgl_32;
            rgc_3 rgc_32;
            rgc_3 rgc_33 = rgc_32 = rgP_22 == null ? null : rgP_22.id_class();
            if (rgc_32 == null || rgc_32.id_private() == null || (rgl_32 = rgc_32.id_private()).id_class() != rgH_2.RUN_COMMAND) continue;
            rhd_32.rC().f().id_class(this.id_class((rhN_2)rhd_32), rgl_32.id_break());
        }
        return true;
    }

    public boolean id_throws() {
        return this.id_break;
    }

    public rhd_3 id_catch() {
        return this.id_byte;
    }

    public rxL_2 id_private() {
        return this.id_throws;
    }

    @Override
    public boolean ac_() {
        return true;
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 9, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

