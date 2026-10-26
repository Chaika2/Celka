/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.AM;
import celestial.Ab_1;
import celestial.Aq_1;
import celestial.Ml_1;
import celestial.OT;
import celestial.Oj_1;
import celestial.Qi_1;
import celestial.Qw_1;
import celestial.cD_2;
import celestial.co_3;
import celestial.rZc_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.vm_3;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class ca_3
extends vm_3
implements AM {
    private static final rqO_2 id_class = new rqO_2("textures/gui/advancements/window.png");
    private static final rqO_2 id_throws = new rqO_2("textures/gui/advancements/tabs.png");
    private static final rgP_2 id_case = new rgn_3("advancements.sad_label");
    private static final rgP_2 id_catch = new rgn_3("advancements.empty");
    private static final rgP_2 id_private = new rgn_3("gui.advancements");
    private final Ab_1 id_implements;
    private final Map<OT, cD_2> id_finally = Maps.newLinkedHashMap();
    private cD_2 id_else;
    private boolean id_synchronized;

    private void id_byte(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        cD_2 cD_22 = this.id_else;
        if (cD_22 == null) {
            ca_3.id_class(ml_1, n3 + 9, n4 + 18, n3 + 9 + 234, n4 + 18 + 113, -16777216);
            int n5 = n3 + 9 + 117;
            ca_3.id_class(ml_1, this.id_super, id_catch, n5, n4 + 18 + 56 - 4, -1);
            ca_3.id_class(ml_1, this.id_super, id_case, n5, n4 + 18 + 113 - 9, -1);
        } else {
            RenderSystem.pushMatrix();
            RenderSystem.translatef(n3 + 9, n4 + 18, 0.0f);
            cD_22.id_class(ml_1);
            RenderSystem.popMatrix();
            RenderSystem.depthFunc(515);
            RenderSystem.disableDepthTest();
        }
    }

    @Override
    public void id_byte(OT oT) {
        cD_2 cD_22 = this.id_catch(oT);
        if (cD_22 != null) {
            cD_22.id_class(oT);
        }
    }

    public ca_3(Ab_1 ab_1) {
        super(rgN_2.id_byte);
        this.id_implements = ab_1;
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableBlend();
        this.id_volatile.A().id_class(id_class);
        this.id_break(ml_1, n, n2, 0, 0, 252, 140);
        if (this.id_finally.size() > 1) {
            this.id_volatile.A().id_class(id_throws);
            for (cD_2 cD_22 : this.id_finally.values()) {
                cD_22.id_class(ml_1, n, n2, cD_22 == this.id_else);
            }
            RenderSystem.enableRescaleNormal();
            RenderSystem.defaultBlendFunc();
            for (cD_2 cD_22 : this.id_finally.values()) {
                cD_22.id_class(n, n2, this.id_final);
            }
            RenderSystem.disableBlend();
        }
        this.id_super.id_byte(ml_1, id_private, n + 8, n2 + 6, 0x404040);
    }

    @Override
    public void id_class(OT oT) {
        cD_2 cD_22 = cD_2.id_class(this.id_volatile, this, this.id_finally.size(), oT);
        if (cD_22 != null) {
            this.id_finally.put(oT, cD_22);
        }
    }

    @Override
    public void id_class(OT oT, Oj_1 oj_1) {
        co_3 co_32 = this.id_case(oT);
        if (co_32 != null) {
            co_32.id_class(oj_1);
        }
    }

    @Override
    public void id_class() {
        this.id_finally.clear();
        this.id_else = null;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (n != 0) {
            this.id_synchronized = false;
            return false;
        }
        if (!this.id_synchronized) {
            this.id_synchronized = true;
        } else if (this.id_else != null) {
            this.id_else.id_class(d3, d4);
        }
        return true;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (((Qw_1)this.id_volatile.id_class[20]).q.id_class(n, n2)) {
            this.id_volatile.id_break((vm_3)null);
            ((Qi_1)this.id_volatile.id_class[22]).id_catch();
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        int n3 = (this.id_package - 252) / 2;
        int n4 = (this.id_int - 140) / 2;
        this.id_class(ml_1);
        this.id_byte(ml_1, n, n2, n3, n4);
        this.id_class(ml_1, n3, n4);
        this.id_protected(ml_1, n, n2, n3, n4);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n == 0) {
            int n2 = (this.id_package - 252) / 2;
            int n3 = (this.id_int - 140) / 2;
            for (cD_2 cD_22 : this.id_finally.values()) {
                if (!cD_22.id_class(n2, n3, d, d2)) continue;
                this.id_implements.id_class(cD_22.id_class(), true);
                break;
            }
        }
        return super.id_break(d, d2, n);
    }

    @Override
    public void id_break(OT oT) {
    }

    @Override
    public void id_throws(OT oT) {
        this.id_else = this.id_finally.get(oT);
    }

    private cD_2 id_catch(OT oT) {
        while (oT.id_break() != null) {
            oT = oT.id_break();
        }
        return this.id_finally.get(oT);
    }

    public co_3 id_case(OT oT) {
        cD_2 cD_22 = this.id_catch(oT);
        return cD_22 == null ? null : cD_22.id_break(oT);
    }

    private void id_protected(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.id_else != null) {
            RenderSystem.pushMatrix();
            RenderSystem.enableDepthTest();
            RenderSystem.translatef(n3 + 9, n4 + 18, 400.0f);
            this.id_else.id_byte(ml_1, n - n3 - 9, n2 - n4 - 18, n3, n4);
            RenderSystem.disableDepthTest();
            RenderSystem.popMatrix();
        }
        if (this.id_finally.size() > 1) {
            for (cD_2 cD_22 : this.id_finally.values()) {
                if (!cD_22.id_class(n3, n4, (double)n, (double)n2)) continue;
                this.id_class(ml_1, cD_22.id_protected(), n, n2);
            }
        }
    }

    @Override
    public void id_protected(OT oT) {
    }

    @Override
    protected void v_() {
        this.id_finally.clear();
        this.id_else = null;
        this.id_implements.id_class(this);
        if (this.id_else == null && !this.id_finally.isEmpty()) {
            this.id_implements.id_class(this.id_finally.values().iterator().next().id_class(), true);
        } else {
            this.id_implements.id_class(this.id_else == null ? null : this.id_else.id_class(), true);
        }
    }

    @Override
    public void w_() {
        super.w_();
        this.id_implements.id_class((AM)null);
        Aq_1 aq_1 = this.id_volatile.id_void();
        if (aq_1 != null) {
            aq_1.id_class(rZc_1.id_break());
        }
    }
}

