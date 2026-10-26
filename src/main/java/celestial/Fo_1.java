/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.FD;
import celestial.FK;
import celestial.FU;
import celestial.Fe_1;
import celestial.LF;
import celestial.Lj_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cC_2;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cq_3;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.ryj_3;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Fo_1
extends Lj_1<Fo_1> {
    private final QY id_case;
    private final List<cC_2> id_catch;
    private final UUID id_private;
    private final String id_implements;
    private final Supplier<rqO_2> id_finally;
    private boolean id_extends;
    private LF id_native;
    private LF id_volatile;
    private final List<rpl_3> id_final;
    private final List<rpl_3> id_package;
    private float id_int;
    private static final rgP_2 id_new = new rgn_3("gui.socialInteractions.status_hidden").id_class(rgF_2.ITALIC);
    private static final rgP_2 id_continue = new rgn_3("gui.socialInteractions.status_blocked").id_class(rgF_2.ITALIC);
    private static final rgP_2 id_super = new rgn_3("gui.socialInteractions.status_offline").id_class(rgF_2.ITALIC);
    private static final rgP_2 id_this = new rgn_3("gui.socialInteractions.status_hidden_offline").id_class(rgF_2.ITALIC);
    private static final rgP_2 id_else = new rgn_3("gui.socialInteractions.status_blocked_offline").id_class(rgF_2.ITALIC);
    public static final int id_class = ryj_3.id_class(190, 0, 0, 0);
    public static final int id_break = ryj_3.id_class(255, 74, 74, 74);
    public static final int id_byte = ryj_3.id_class(255, 48, 48, 48);
    public static final int id_protected = ryj_3.id_class(255, 255, 255, 255);
    public static final int id_throws = ryj_3.id_class(140, 255, 255, 255);

    public void id_byte(boolean bl) {
        this.id_extends = bl;
    }

    public Fo_1(QY qY, Fe_1 fe_1, UUID uUID, String string, Supplier<rqO_2> supplier) {
        this.id_case = qY;
        this.id_private = uUID;
        this.id_implements = string;
        this.id_finally = supplier;
        this.id_final = ((cm_3)qY.id_class[15]).id_break(new rgn_3("gui.socialInteractions.tooltip.hide", string), 150);
        this.id_package = ((cm_3)qY.id_class[15]).id_break(new rgn_3("gui.socialInteractions.tooltip.show", string), 150);
        FU fU = qY.id_volatile();
        if (!((cb_3)qY.id_class[57]).sv().getId().equals(uUID) && !fU.id_throws(uUID)) {
            this.id_native = new FK(this, 0, 0, 20, 20, 0, 38, 20, Fe_1.id_class, 256, 256, lF -> {
                fU.id_class(uUID);
                this.id_class(true, new rgn_3("gui.socialInteractions.hidden_in_chat", string));
            }, (lF, ml_1, n, n2) -> {
                this.id_int += qY.id_default();
                if (this.id_int >= 10.0f) {
                    fe_1.id_class(() -> Fo_1.id_class(fe_1, ml_1, this.id_final, n, n2));
                }
            }, new rgn_3("gui.socialInteractions.hide"));
            this.id_volatile = new FD(this, 0, 0, 20, 20, 20, 38, 20, Fe_1.id_class, 256, 256, lF -> {
                fU.id_break(uUID);
                this.id_class(false, new rgn_3("gui.socialInteractions.shown_in_chat", string));
            }, (lF, ml_1, n, n2) -> {
                this.id_int += qY.id_default();
                if (this.id_int >= 10.0f) {
                    fe_1.id_class(() -> Fo_1.id_class(fe_1, ml_1, this.id_package, n, n2));
                }
            }, new rgn_3("gui.socialInteractions.show"));
            this.id_volatile.id_new = fU.id_protected(uUID);
            this.id_native.id_new = !this.id_volatile.id_new;
            this.id_catch = ImmutableList.of((Object)this.id_native, (Object)this.id_volatile);
        } else {
            this.id_catch = ImmutableList.of();
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        int n8;
        int n9 = n3 + 4;
        int n10 = n2 + (n5 - 24) / 2;
        int n11 = n9 + 24 + 4;
        rgP_2 rgP_22 = this.id_protected();
        if (rgP_22 == rgN_2.id_byte) {
            ch_3.id_class(ml_1, n3, n2, n3 + n4, n2 + n5, id_break);
            n8 = n2 + (n5 - 9) / 2;
        } else {
            ch_3.id_class(ml_1, n3, n2, n3 + n4, n2 + n5, id_byte);
            n8 = n2 + (n5 - 18) / 2;
            ((cm_3)this.id_case.id_class[15]).id_byte(ml_1, rgP_22, n11, n8 + 12, id_throws);
        }
        this.id_case.A().id_class(this.id_finally.get());
        ch_3.id_class(ml_1, n9, n10, 24, 24, 8.0f, 8.0f, 8, 8, 64, 64);
        RenderSystem.enableBlend();
        ch_3.id_class(ml_1, n9, n10, 24, 24, 40.0f, 8.0f, 8, 8, 64, 64);
        RenderSystem.disableBlend();
        ((cm_3)this.id_case.id_class[15]).id_break(ml_1, this.id_implements, (float)n11, (float)n8, id_protected);
        if (this.id_extends) {
            ch_3.id_class(ml_1, n9, n10, n9 + 24, n10 + 24, id_class);
        }
        if (this.id_native != null && this.id_volatile != null) {
            float f2 = this.id_int;
            this.id_native.id_volatile = n3 + (n4 - this.id_native.id_case() - 4);
            this.id_native.id_final = n2 + (n5 - this.id_native.id_else()) / 2;
            this.id_native.id_class(ml_1, n6, n7, f);
            this.id_volatile.id_volatile = n3 + (n4 - this.id_volatile.id_case() - 4);
            this.id_volatile.id_final = n2 + (n5 - this.id_volatile.id_else()) / 2;
            this.id_volatile.id_class(ml_1, n6, n7, f);
            if (f2 == this.id_int) {
                this.id_int = 0.0f;
            }
        }
    }

    private static void id_class(Fe_1 fe_1, Ml_1 ml_1, List<rpl_3> list, int n, int n2) {
        fe_1.id_break(ml_1, list, n, n2);
        fe_1.id_class((Runnable)null);
    }

    public String id_class() {
        return this.id_implements;
    }

    private void id_class(boolean bl, rgP_2 rgP_22) {
        this.id_volatile.id_new = bl;
        this.id_native.id_new = !bl;
        ((cq_3)this.id_case.id_class[19]).id_throws().id_class(rgP_22);
    }

    public rVi_1 id_class(rVi_1 rVi_12) {
        rgP_2 rgP_22 = this.id_protected();
        return rgP_22 == rgN_2.id_byte ? new rgN_2(this.id_implements).id_break(", ").id_class(rVi_12) : new rgN_2(this.id_implements).id_break(", ").id_class(rgP_22).id_break(", ").id_class(rVi_12);
    }

    public UUID id_break() {
        return this.id_private;
    }

    private rgP_2 id_protected() {
        boolean bl = this.id_case.id_volatile().id_protected(this.id_private);
        boolean bl2 = this.id_case.id_volatile().id_throws(this.id_private);
        if (bl2 && this.id_extends) {
            return id_else;
        }
        if (bl && this.id_extends) {
            return id_this;
        }
        if (bl2) {
            return id_continue;
        }
        if (bl) {
            return id_new;
        }
        return this.id_extends ? id_super : rgN_2.id_byte;
    }

    @Override
    public List<? extends cC_2> x_() {
        return this.id_catch;
    }
}

