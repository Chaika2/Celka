/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.cm_3;
import celestial.jI_2;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rrJM;
import celestial.rrJX;
import celestial.rrJk_1;
import celestial.rrXi_1;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrdD;
import celestial.rrdU;
import celestial.rrdZ;
import celestial.rrdi_1;
import celestial.rrkX;
import celestial.rrkk_1;
import celestial.vm_3;

public class rrkJ
extends rrJM {
    private vm_3 id_finally;
    private Qw_1 id_else;
    private rrJX id_synchronized = new rrJX(this, new rrJk_1());
    private String id_return = null;
    private String id_public = null;
    private boolean id_goto = false;
    public static final String id_class = "<profile>";
    public static final String id_private = "<empty>";
    public static final String id_implements = "*";

    @Override
    protected void id_byte(LZ lZ) {
        if (lZ instanceof rrkX) {
            rrkX rrkX2 = (rrkX)lZ;
            rrdD rrdD2 = rrkX2.id_private();
            if (rrkJ.id_synchronized()) {
                rrdD2.id_case();
            } else if (rrkX2.id_extends()) {
                rrdD2.id_private();
            }
            this.id_finally();
            this.id_goto = true;
        }
    }

    public rrkJ(vm_3 vm_32, Qw_1 qw_1) {
        super(new rgN_2(jI_2.id_class("of.options.shaderOptionsTitle", new Object[0])));
        this.id_finally = vm_32;
        this.id_else = qw_1;
    }

    public rrkJ(vm_3 vm_32, Qw_1 qw_1, String string) {
        this(vm_32, qw_1);
        this.id_return = string;
        if (string != null) {
            this.id_public = rrdZ.id_break("screen." + string, string);
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        if (this.id_public != null) {
            rrkJ.id_class(ml_1, this.id_case, this.id_public, this.id_package / 2, 15, 0xFFFFFF);
        } else {
            rrkJ.id_class(ml_1, this.id_case, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        }
        super.id_class(ml_1, n, n2, f);
        this.id_synchronized.id_class(ml_1, n, n2, this.id_throws);
    }

    public static String id_class(rrdD rrdD2, int n) {
        String string = rrdD2.id_volatile();
        if (rrdD2 instanceof rrdi_1) {
            rrdi_1 rrdi_12 = (rrdi_1)rrdD2;
            return string + "...";
        }
        cm_3 cm_32 = (cm_3)rrbb_3.X().id_class[15];
        int n2 = cm_32.id_break(": " + rrba_3.id_byte()) + 5;
        while (cm_32.id_break(string) + n2 >= n && string.length() > 0) {
            string = string.substring(0, string.length() - 1);
        }
        String string2 = rrdD2.id_extends() ? rrdD2.id_throws(rrdD2.id_protected()) : "";
        String string3 = rrdD2.id_protected(rrdD2.id_protected());
        return string + ": " + string2 + string3;
    }

    @Override
    protected void id_break(LZ lZ) {
        if (lZ instanceof rrXi_1) {
            rrXi_1 rrXi_12 = (rrXi_1)lZ;
            if (rrXi_12.id_int) {
                rrdD[] rrdDArray;
                if (rrXi_12.id_class < 200 && rrXi_12 instanceof rrkX) {
                    rrdDArray = (rrdD[])rrXi_12;
                    rrdD rrdD2 = rrdDArray.id_private();
                    if (rrdD2 instanceof rrdi_1) {
                        String string = rrdD2.id_class();
                        rrkJ rrkJ2 = new rrkJ(this, this.id_else, string);
                        this.id_volatile.id_break(rrkJ2);
                        return;
                    }
                    if (rrkJ.id_synchronized()) {
                        rrdD2.id_case();
                    } else if (rrdDArray.id_extends()) {
                        rrdD2.id_catch();
                    }
                    this.id_finally();
                    this.id_goto = true;
                }
                if (rrXi_12.id_class == 201) {
                    rrdDArray = rrdZ.id_class(rrdZ.id_throws());
                    for (int i = 0; i < rrdDArray.length; ++i) {
                        rrdD rrdD3 = rrdDArray[i];
                        rrdD3.id_case();
                        this.id_goto = true;
                    }
                    this.id_finally();
                }
                if (rrXi_12.id_class == 200) {
                    if (this.id_goto) {
                        rrdZ.id_case();
                        this.id_goto = false;
                        rrdZ.id_while();
                    }
                    this.id_volatile.id_break(this.id_finally);
                }
            }
        }
    }

    private void id_finally() {
        for (LZ lZ : this.id_throws) {
            if (!(lZ instanceof rrkX)) continue;
            rrkX rrkX2 = (rrkX)lZ;
            rrdD rrdD2 = rrkX2.id_private();
            if (rrdD2 instanceof rrdU) {
                rrdU rrdU2 = (rrdU)rrdD2;
                rrdU2.id_continue();
            }
            rrkX2.id_class(rrkJ.id_class(rrdD2, rrkX2.id_case()));
            rrkX2.id_implements();
        }
    }

    @Override
    public void v_() {
        int n = 100;
        int n2 = 0;
        int n3 = 30;
        int n4 = 20;
        int n5 = 120;
        int n6 = 20;
        int n7 = rrdZ.id_class(this.id_return, 2);
        rrdD[] rrdDArray = rrdZ.id_byte(this.id_return);
        if (rrdDArray != null) {
            int n8 = rfU_2.id_throws((double)rrdDArray.length / 9.0);
            if (n7 < n8) {
                n7 = n8;
            }
            for (int i = 0; i < rrdDArray.length; ++i) {
                rrdD rrdD2 = rrdDArray[i];
                if (rrdD2 == null || !rrdD2.id_native()) continue;
                int n9 = i % n7;
                int n10 = i / n7;
                int n11 = Math.min(this.id_package / n7, 200);
                n2 = (this.id_package - n11 * n7) / 2;
                int n12 = n9 * n11 + 5 + n2;
                int n13 = n3 + n10 * n4;
                int n14 = n11 - 10;
                String string = rrkJ.id_class(rrdD2, n14);
                rrkX rrkX2 = rrdZ.id_throws(rrdD2.id_class()) ? new rrkk_1(n + i, n12, n13, n14, n6, rrdD2, string) : new rrkX(n + i, n12, n13, n14, n6, rrdD2, string);
                rrkX2.id_int = rrdD2.id_finally();
                this.id_class(rrkX2);
            }
        }
        this.id_class(new rrXi_1(201, this.id_package / 2 - n5 - 20, this.id_int / 6 + 168 + 11, n5, n6, jI_2.id_class("controls.reset", new Object[0])));
        this.id_class(new rrXi_1(200, this.id_package / 2 + 20, this.id_int / 6 + 168 + 11, n5, n6, jI_2.id_class("gui.done", new Object[0])));
    }

    @Override
    public void w_() {
        super.w_();
        if (this.id_goto) {
            rrdZ.id_case();
            this.id_goto = false;
            rrdZ.id_while();
        }
    }
}

