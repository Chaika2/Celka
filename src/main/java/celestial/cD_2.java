/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Hz_1;
import celestial.Ml_1;
import celestial.OT;
import celestial.OU;
import celestial.QY;
import celestial.cU_2;
import celestial.ca_3;
import celestial.ch_3;
import celestial.co_3;
import celestial.fY_2;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class cD_2
extends ch_3 {
    private final QY id_class;
    private final ca_3 id_throws;
    private final cU_2 id_case;
    private final int id_catch;
    private final OT id_private;
    private final OU id_implements;
    private final rdn_3 id_finally;
    private final rgP_2 id_extends;
    private final co_3 id_native;
    private final Map<OT, co_3> id_volatile = Maps.newLinkedHashMap();
    private double id_final;
    private double id_package;
    private int id_int = Integer.MAX_VALUE;
    private int id_new = Integer.MAX_VALUE;
    private int id_continue = Integer.MIN_VALUE;
    private int id_super = Integer.MIN_VALUE;
    private float id_this;
    private boolean id_else;

    public void id_byte(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        RenderSystem.pushMatrix();
        RenderSystem.translatef(0.0f, 0.0f, 200.0f);
        cD_2.id_class(ml_1, 0, 0, 234, 113, rfU_2.id_protected(this.id_this * 255.0f) << 24);
        boolean bl = false;
        int n5 = rfU_2.id_byte(this.id_final);
        int n6 = rfU_2.id_byte(this.id_package);
        if (n > 0 && n < 234 && n2 > 0 && n2 < 113) {
            for (co_3 co_32 : this.id_volatile.values()) {
                if (!co_32.id_break(n5, n6, n, n2)) continue;
                bl = true;
                co_32.id_class(ml_1, n5, n6, this.id_this, n3, n4);
                break;
            }
        }
        RenderSystem.popMatrix();
        this.id_this = bl ? rfU_2.id_class(this.id_this + 0.02f, 0.0f, 0.3f) : rfU_2.id_class(this.id_this - 0.04f, 0.0f, 1.0f);
    }

    public cD_2(QY qY, ca_3 ca_32, cU_2 cU_22, int n, OT oT, OU oU) {
        this.id_class = qY;
        this.id_throws = ca_32;
        this.id_case = cU_22;
        this.id_catch = n;
        this.id_private = oT;
        this.id_implements = oU;
        this.id_finally = oU.id_byte();
        this.id_extends = oU.id_class();
        this.id_native = new co_3(this, qY, oT, oU);
        this.id_class(this.id_native, oT);
    }

    public void id_class(double d, double d2) {
        if (this.id_continue - this.id_int > 234) {
            this.id_final = rfU_2.id_class(this.id_final + d, (double)(-(this.id_continue - 234)), 0.0);
        }
        if (this.id_super - this.id_new > 113) {
            this.id_package = rfU_2.id_class(this.id_package + d2, (double)(-(this.id_super - 113)), 0.0);
        }
    }

    public boolean id_class(int n, int n2, double d, double d2) {
        return this.id_case.id_class(n, n2, this.id_catch, d, d2);
    }

    public static cD_2 id_class(QY qY, ca_3 ca_32, int n, OT oT) {
        if (oT.id_byte() == null) {
            return null;
        }
        for (cU_2 cU_22 : cU_2.values()) {
            if (n < cU_22.id_class()) {
                return new cD_2(qY, ca_32, cU_22, n, oT, oT.id_byte());
            }
            n -= cU_22.id_class();
        }
        return null;
    }

    private void id_class(co_3 co_32, OT oT) {
        this.id_volatile.put(oT, co_32);
        int n = co_32.id_throws();
        int n2 = n + 28;
        int n3 = co_32.id_protected();
        int n4 = n3 + 27;
        this.id_int = Math.min(this.id_int, n);
        this.id_continue = Math.max(this.id_continue, n2);
        this.id_new = Math.min(this.id_new, n3);
        this.id_super = Math.max(this.id_super, n4);
        for (co_3 co_33 : this.id_volatile.values()) {
            co_33.id_class();
        }
    }

    public void id_class(OT oT) {
        if (oT.id_byte() != null) {
            co_3 co_32 = new co_3(this, this.id_class, oT, oT.id_byte());
            this.id_class(co_32, oT);
        }
    }

    public OT id_class() {
        return this.id_private;
    }

    public void id_class(Ml_1 ml_1, int n, int n2, boolean bl) {
        this.id_case.id_class(ml_1, this, n, n2, bl, this.id_catch);
    }

    public void id_class(int n, int n2, Hz_1 hz_1) {
        this.id_case.id_class(n, n2, this.id_catch, hz_1, this.id_finally);
    }

    public void id_class(Ml_1 ml_1) {
        if (!this.id_else) {
            this.id_final = 117 - (this.id_continue + this.id_int) / 2;
            this.id_package = 56 - (this.id_super + this.id_new) / 2;
            this.id_else = true;
        }
        RenderSystem.pushMatrix();
        RenderSystem.enableDepthTest();
        RenderSystem.translatef(0.0f, 0.0f, 950.0f);
        RenderSystem.colorMask(false, false, false, false);
        cD_2.id_class(ml_1, 4680, 2260, -4680, -2260, -16777216);
        RenderSystem.colorMask(true, true, true, true);
        RenderSystem.translatef(0.0f, 0.0f, -950.0f);
        RenderSystem.depthFunc(518);
        cD_2.id_class(ml_1, 234, 113, 0, 0, -16777216);
        RenderSystem.depthFunc(515);
        rqO_2 rqO_22 = this.id_implements.id_protected();
        if (rqO_22 != null) {
            this.id_class.A().id_class(rqO_22);
        } else {
            this.id_class.A().id_class(fY_2.id_class);
        }
        int n = rfU_2.id_byte(this.id_final);
        int n2 = rfU_2.id_byte(this.id_package);
        int n3 = n % 16;
        int n4 = n2 % 16;
        for (int i = -1; i <= 15; ++i) {
            for (int j = -1; j <= 8; ++j) {
                cD_2.id_class(ml_1, n3 + 16 * i, n4 + 16 * j, 0.0f, 0.0f, 16, 16, 16, 16);
            }
        }
        this.id_native.id_class(ml_1, n, n2, true);
        this.id_native.id_class(ml_1, n, n2, false);
        this.id_native.id_class(ml_1, n, n2);
        RenderSystem.depthFunc(518);
        RenderSystem.translatef(0.0f, 0.0f, -950.0f);
        RenderSystem.colorMask(false, false, false, false);
        cD_2.id_class(ml_1, 4680, 2260, -4680, -2260, -16777216);
        RenderSystem.colorMask(true, true, true, true);
        RenderSystem.translatef(0.0f, 0.0f, 950.0f);
        RenderSystem.depthFunc(515);
        RenderSystem.popMatrix();
    }

    public co_3 id_break(OT oT) {
        return this.id_volatile.get(oT);
    }

    public ca_3 id_throws() {
        return this.id_throws;
    }

    public rgP_2 id_protected() {
        return this.id_extends;
    }
}

