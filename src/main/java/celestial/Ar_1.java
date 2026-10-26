/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Li_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cv_3;
import celestial.rAl_1;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgX_2;
import celestial.rpl_3;
import celestial.vd_3;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Ar_1
extends Lg_1<Ar_1> {
    private Li_1 id_byte;
    protected final QY id_class;
    protected final vm_3 id_break;
    private final vd_3 id_protected;
    private final rpl_3 id_throws;
    private final cv_3 id_case;
    private final rpl_3 id_catch;
    private final cv_3 id_private;

    public Ar_1(QY qY, Li_1 li_1, vm_3 vm_32, vd_3 vd_32) {
        this.id_class = qY;
        this.id_break = vm_32;
        this.id_protected = vd_32;
        this.id_byte = li_1;
        this.id_throws = Ar_1.id_class(qY, vd_32.id_throws());
        this.id_case = Ar_1.id_break(qY, vd_32.id_continue());
        this.id_catch = Ar_1.id_class(qY, Li_1.id_case);
        this.id_private = Ar_1.id_break(qY, vd_32.id_protected().id_break());
    }

    public vd_3 id_class() {
        return this.id_protected;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        rAl_1 rAl_12 = this.id_protected.id_protected();
        if (!rAl_12.id_class()) {
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            ch_3.id_class(ml_1, n3 - 1, n2 - 1, n3 + n4 - 9, n2 + n5 + 1, -8978432);
        }
        this.id_class.A().id_class(this.id_protected.id_byte());
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        ch_3.id_class(ml_1, n3, n2, 0.0f, 0.0f, 32, 32, 32, 32);
        rpl_3 rpl_32 = this.id_throws;
        cv_3 cv_32 = this.id_case;
        if (this.id_break() && (((Qw_1)this.id_class.id_class[20]).S || bl)) {
            this.id_class.A().id_class(Li_1.id_throws);
            ch_3.id_class(ml_1, n3, n2, n3 + 32, n2 + 32, -1601138544);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            int n8 = n6 - n3;
            int n9 = n7 - n2;
            if (!this.id_protected.id_protected().id_class()) {
                rpl_32 = this.id_catch;
                cv_32 = this.id_private;
            }
            if (this.id_protected.id_super()) {
                if (n8 < 32) {
                    ch_3.id_class(ml_1, n3, n2, 0.0f, 32.0f, 32, 32, 256, 256);
                } else {
                    ch_3.id_class(ml_1, n3, n2, 0.0f, 0.0f, 32, 32, 256, 256);
                }
            } else {
                if (this.id_protected.id_this()) {
                    if (n8 < 16) {
                        ch_3.id_class(ml_1, n3, n2, 32.0f, 32.0f, 32, 32, 256, 256);
                    } else {
                        ch_3.id_class(ml_1, n3, n2, 32.0f, 0.0f, 32, 32, 256, 256);
                    }
                }
                if (this.id_protected.id_extends()) {
                    if (n8 < 32 && n8 > 16 && n9 < 16) {
                        ch_3.id_class(ml_1, n3, n2, 96.0f, 32.0f, 32, 32, 256, 256);
                    } else {
                        ch_3.id_class(ml_1, n3, n2, 96.0f, 0.0f, 32, 32, 256, 256);
                    }
                }
                if (this.id_protected.id_volatile()) {
                    if (n8 < 32 && n8 > 16 && n9 > 16) {
                        ch_3.id_class(ml_1, n3, n2, 64.0f, 32.0f, 32, 32, 256, 256);
                    } else {
                        ch_3.id_class(ml_1, n3, n2, 64.0f, 0.0f, 32, 32, 256, 256);
                    }
                }
            }
        }
        ((cm_3)this.id_class.id_class[15]).id_class(ml_1, rpl_32, (float)(n3 + 32 + 2), (float)(n2 + 1), 0xFFFFFF);
        cv_32.id_break(ml_1, n3 + 32 + 2, n2 + 12, 10, 0x808080);
    }

    private static rpl_3 id_class(QY qY, rgP_2 rgP_22) {
        int n = ((cm_3)qY.id_class[15]).id_class(rgP_22);
        if (n > 157) {
            rgS_2 rgS_22 = rgS_2.id_class(((cm_3)qY.id_class[15]).id_class(rgP_22, 157 - ((cm_3)qY.id_class[15]).id_break("...")), rgS_2.id_protected("..."));
            return rgX_2.id_byte().id_class(rgS_22);
        }
        return rgP_22.id_catch();
    }

    private static cv_3 id_break(QY qY, rgP_2 rgP_22) {
        return cv_3.id_class((cm_3)qY.id_class[15], (rgS_2)rgP_22, 157, 2);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        double d3 = d - (double)this.id_byte.id_continue();
        double d4 = d2 - (double)this.id_byte.id_case(this.id_byte.x_().indexOf(this));
        if (this.id_break() && d3 <= 32.0) {
            if (this.id_protected.id_super()) {
                this.id_protected.id_int();
                return true;
            }
            if (d3 < 16.0 && this.id_protected.id_this()) {
                this.id_protected.id_new();
                return true;
            }
            if (d3 > 16.0 && d4 < 16.0 && this.id_protected.id_extends()) {
                this.id_protected.id_native();
                return true;
            }
            if (d3 > 16.0 && d4 > 16.0 && this.id_protected.id_volatile()) {
                this.id_protected.id_final();
                return true;
            }
        }
        return false;
    }

    private boolean id_break() {
        return !this.id_protected.id_private() || !this.id_protected.id_implements();
    }
}

