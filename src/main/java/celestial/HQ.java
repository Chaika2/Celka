/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.fN_2;
import celestial.fk_3;
import celestial.gm_3;
import celestial.rLD;
import celestial.rYB;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import com.mojang.blaze3d.systems.RenderSystem;

public class HQ
implements AutoCloseable {
    private final fk_3 id_break;
    private final fN_2 id_byte;
    private final rqO_2 id_protected;
    private boolean id_throws;
    private float id_case;
    private final Hh_1 id_catch;
    private final QY id_private;
    private boolean id_implements = true;
    private boolean id_finally = false;
    private rje_3 id_extends = new rje_3();
    public static final int id_class = HQ.id_class(15, 15);

    public void id_byte() {
        if (this.id_implements) {
            RenderSystem.activeTexture(33986);
            RenderSystem.matrixMode(5890);
            RenderSystem.loadIdentity();
            float f = 0.00390625f;
            RenderSystem.scalef(0.00390625f, 0.00390625f, 0.00390625f);
            RenderSystem.translatef(8.0f, 8.0f, 8.0f);
            RenderSystem.matrixMode(5888);
            this.id_private.A().id_class(this.id_protected);
            RenderSystem.texParameter(3553, 10241, 9729);
            RenderSystem.texParameter(3553, 10240, 9729);
            RenderSystem.texParameter(3553, 10242, 33071);
            RenderSystem.texParameter(3553, 10243, 33071);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.enableTexture();
            RenderSystem.activeTexture(33984);
            if (rrbb_3.rs()) {
                rrdZ.A();
            }
        }
    }

    public HQ(Hh_1 hh_1, QY qY) {
        this.id_catch = hh_1;
        this.id_private = qY;
        this.id_break = new fk_3(16, 16, false);
        this.id_protected = this.id_private.A().id_class("light_map", this.id_break);
        this.id_byte = this.id_break.id_break();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.id_byte.id_class(j, i, -1);
            }
        }
        this.id_break.id_class();
    }

    private float id_class(rYB rYB2, int n) {
        return rYB2.id_default().id_class(n);
    }

    private rje_3 id_class(rje_3 rje_32) {
        this.id_extends.id_break(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
        return this.id_extends;
    }

    public static int id_class(int n) {
        return (n & 0xFFFF) >> 4;
    }

    public void id_class(boolean bl) {
        this.id_implements = bl;
    }

    private rje_3 id_class(float f, float f2, float f3) {
        this.id_extends.id_break(f, f2, f3);
        return this.id_extends;
    }

    public void id_class() {
        this.id_case = (float)((double)this.id_case + (Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
        this.id_case = (float)((double)this.id_case * 0.9);
        this.id_throws = true;
    }

    public void id_class(float f) {
        if (this.id_throws) {
            this.id_throws = false;
            gm_3 gm_32 = (gm_3)this.id_private.id_class[56];
            double d = ((Qw_1)this.id_private.id_class[20]).a;
            if (gm_32 != null) {
                this.id_finally = false;
                if (rrbb_3.K()) {
                    boolean bl;
                    boolean bl2 = bl = d == 100.0 || ((cb_3)this.id_private.id_class[57]).id_break(rLD.id_int) || ((cb_3)this.id_private.id_class[57]).id_break(rLD.id_throw);
                    if (rrbN_2.id_class(gm_32, this.id_case, this.id_byte, bl, f)) {
                        this.id_break.id_class();
                        this.id_throws = false;
                        this.id_finally = true;
                        return;
                    }
                }
                float f2 = gm_32.id_class(1.0f);
                float f3 = gm_32.id_super() > 0 ? 1.0f : f2 * 0.95f + 0.05f;
                float f4 = ((cb_3)this.id_private.id_class[57]).id_public();
                float f5 = d == 100.0 ? 1.0f : (((cb_3)this.id_private.id_class[57]).id_break(rLD.id_int) ? Hh_1.id_class((cb_3)this.id_private.id_class[57], f) : (f4 > 0.0f && ((cb_3)this.id_private.id_class[57]).id_break(rLD.id_throw) ? f4 : 0.0f));
                rje_3 rje_32 = new rje_3(f2, f2, 1.0f);
                rje_32.id_class(new rje_3(1.0f, 1.0f, 1.0f), 0.35f);
                float f6 = this.id_case + 1.5f;
                rje_3 rje_33 = new rje_3();
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        float f7;
                        float f8;
                        rje_3 rje_34;
                        float f9;
                        float f10 = this.id_class(gm_32, i) * f3;
                        float f11 = this.id_class(gm_32, j) * f6;
                        float f12 = f11 * ((f11 * 0.6f + 0.4f) * 0.6f + 0.4f);
                        float f13 = f11 * (f11 * f11 * 0.6f + 0.4f);
                        rje_33.id_break(f11, f12, f13);
                        if (gm_32.id_break().id_protected()) {
                            rje_33.id_class(this.id_class(0.99f, 1.12f, 1.0f), 0.25f);
                        } else {
                            rje_3 rje_35 = this.id_class(rje_32);
                            rje_35.id_class(f10);
                            rje_33.id_class(rje_35);
                            rje_33.id_class(this.id_class(0.75f, 0.75f, 0.75f), 0.04f);
                            if (this.id_catch.id_break(f) > 0.0f) {
                                f9 = this.id_catch.id_break(f);
                                rje_34 = this.id_class(rje_33);
                                rje_34.id_class(0.7f, 0.6f, 0.6f);
                                rje_33.id_class(rje_34, f9);
                            }
                        }
                        rje_33.id_class(0.0f, 1.0f);
                        if (f5 > 0.0f && (f8 = Math.max(rje_33.id_class(), Math.max(rje_33.id_break(), rje_33.id_byte()))) < 1.0f) {
                            f9 = 1.0f / f8;
                            rje_34 = this.id_class(rje_33);
                            rje_34.id_class(f9);
                            rje_33.id_class(rje_34, f5);
                        }
                        if ((f7 = (float)d) == 100.0f) {
                            f7 = 0.0f;
                        }
                        rje_3 rje_36 = this.id_class(rje_33);
                        rje_36.id_class(this::id_break);
                        rje_33.id_class(rje_36, f7);
                        rje_33.id_class(this.id_class(0.75f, 0.75f, 0.75f), 0.04f);
                        rje_33.id_class(0.0f, 1.0f);
                        rje_33.id_class(255.0f);
                        int n = (int)rje_33.id_class();
                        int n2 = (int)rje_33.id_break();
                        int n3 = (int)rje_33.id_byte();
                        this.id_byte.id_class(j, i, 0xFF000000 | n3 << 16 | n2 << 8 | n);
                    }
                }
                this.id_break.id_class();
            }
        }
    }

    public static int id_class(int n, int n2) {
        return n << 4 | n2 << 20;
    }

    @Override
    public void close() {
        this.id_break.close();
    }

    public void id_break() {
        RenderSystem.activeTexture(33986);
        RenderSystem.disableTexture();
        RenderSystem.activeTexture(33984);
        if (rrbb_3.rs()) {
            rrdZ.n();
        }
    }

    private float id_break(float f) {
        float f2 = 1.0f - f;
        return 1.0f - f2 * f2 * f2 * f2;
    }

    public static int id_break(int n) {
        return n >> 20 & 0xFFFF;
    }

    public boolean id_throws() {
        return this.id_finally;
    }

    public boolean id_protected() {
        return this.id_implements;
    }
}

