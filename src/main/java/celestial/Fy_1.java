/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fp_1;
import celestial.Fu_1;
import celestial.Ml_1;
import celestial.rJp_1;
import celestial.rVi_1;
import celestial.rZm_1;
import celestial.rdI_2;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rsp_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Fy_1
extends Fu_1<rJp_1> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/villager2.png");
    private static final rgP_2 id_throws = new rgn_3("merchant.trades");
    private static final rgP_2 id_case = new rgN_2(" - ");
    private static final rgP_2 id_catch = new rgn_3("merchant.deprecated");
    private int id_private;
    private final Fp_1[] id_implements = new Fp_1[7];
    public int id_finally;
    private boolean id_boolean;

    public static /* synthetic */ void id_byte(Fy_1 fy_1, Ml_1 ml_1, rdn_3 rdn_32, int n, int n2) {
        fy_1.id_class(ml_1, rdn_32, n, n2);
    }

    public Fy_1(rJp_1 rJp_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJp_12, rhz_32, rgP_22);
        this.id_synchronized = 276;
        this.id_while = 107;
    }

    private void id_class(Ml_1 ml_1, rdI_2 rdI_22, int n, int n2) {
        RenderSystem.enableBlend();
        this.id_volatile.A().id_class(id_class);
        if (rdI_22.id_int()) {
            Fy_1.id_class(ml_1, n + 5 + 35 + 20, n2 + 3, this.h_(), 25.0f, 171.0f, 10, 9, 256, 512);
        } else {
            Fy_1.id_class(ml_1, n + 5 + 35 + 20, n2 + 3, this.h_(), 15.0f, 171.0f, 10, 9, 256, 512);
        }
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        int n = ((rJp_1)this.id_instanceof).id_throws().size();
        if (this.id_break(n)) {
            int n2 = n - 7;
            this.id_finally = (int)((double)this.id_finally - d3);
            this.id_finally = rfU_2.id_class(this.id_finally, 0, n2);
        }
        return true;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        int n2 = ((rJp_1)this.id_instanceof).id_throws().size();
        if (this.id_boolean) {
            int n3 = this.id_abstract + 18;
            int n4 = n3 + 139;
            int n5 = n2 - 7;
            float f = ((float)d2 - (float)n3 - 13.5f) / ((float)(n4 - n3) - 27.0f);
            f = f * (float)n5 + 0.5f;
            this.id_finally = rfU_2.id_class((int)f, 0, n5);
            return true;
        }
        return super.id_class(d, d2, n, d3, d4);
    }

    public static /* synthetic */ void id_class(Fy_1 fy_1, Ml_1 ml_1, rdn_3 rdn_32, int n, int n2) {
        fy_1.id_class(ml_1, rdn_32, n, n2);
    }

    private void id_class(Ml_1 ml_1, rdn_3 rdn_32, rdn_3 rdn_33, int n, int n2) {
        this.id_final.id_break(rdn_32, n, n2);
        if (rdn_33.id_char() == rdn_32.id_char()) {
            this.id_final.id_class(this.id_super, rdn_32, (float)n, (float)n2);
        } else {
            this.id_final.id_class(this.id_super, rdn_33, (float)n, (float)n2, rdn_33.id_char() == 1 ? "1" : null);
            this.id_final.id_class(this.id_super, rdn_32, (float)(n + 14), (float)n2, rdn_32.id_char() == 1 ? "1" : null);
            this.id_volatile.A().id_class(id_class);
            this.id_class(this.h_() + 300);
            Fy_1.id_class(ml_1, n + 7, n2 + 12, this.h_(), 0.0f, 176.0f, 9, 2, 256, 512);
            this.id_class(this.h_() - 300);
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        Fy_1.id_class(ml_1, n3, n4, this.h_(), 0.0f, 0.0f, this.id_synchronized, this.id_return, 256, 512);
        rdf_3 rdf_32 = ((rJp_1)this.id_instanceof).id_throws();
        if (!rdf_32.isEmpty()) {
            int n5 = this.id_private;
            if (n5 < 0 || n5 >= rdf_32.size()) {
                return;
            }
            rdI_2 rdI_22 = (rdI_2)rdf_32.get(n5);
            if (rdI_22.id_int()) {
                this.id_volatile.A().id_class(id_class);
                RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
                Fy_1.id_class(ml_1, this.id_char + 83 + 99, this.id_abstract + 35, this.h_(), 311.0f, 0.0f, 28, 21, 256, 512);
            }
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        int n3 = ((rJp_1)this.id_instanceof).id_byte();
        if (n3 > 0 && n3 <= 5 && ((rJp_1)this.id_instanceof).id_case()) {
            rVi_1 rVi_12 = this.id_extends.id_case().id_class(id_case).id_class(new rgn_3("merchant.level." + n3));
            int n4 = this.id_super.id_class(rVi_12);
            int n5 = 49 + this.id_synchronized / 2 - n4 / 2;
            this.id_super.id_byte(ml_1, rVi_12, n5, 6.0f, 0x404040);
        } else {
            this.id_super.id_byte(ml_1, this.id_extends, 49 + this.id_synchronized / 2 - this.id_super.id_class(this.id_extends) / 2, 6.0f, 0x404040);
        }
        if (this.id_throw != null) {
            this.id_super.id_byte(ml_1, this.id_throw.L_(), this.id_while, this.id_try, 0x404040);
        }
        int n6 = this.id_super.id_class(id_throws);
        this.id_super.id_byte(ml_1, id_throws, 5 - n6 / 2 + 48, 6.0f, 0x404040);
    }

    private void id_class(Ml_1 ml_1, int n, int n2, rdf_3 rdf_32) {
        int n3 = rdf_32.size() + 1 - 7;
        if (n3 > 1) {
            int n4 = 139 - (27 + (n3 - 1) * 139 / n3);
            int n5 = 1 + n4 / n3 + 139 / n3;
            int n6 = 113;
            int n7 = Math.min(113, this.id_finally * n5);
            if (this.id_finally == n3 - 1) {
                n7 = 113;
            }
            Fy_1.id_class(ml_1, n + 94, n2 + 18 + n7, this.h_(), 0.0f, 199.0f, 6, 27, 256, 512);
        } else {
            Fy_1.id_class(ml_1, n + 94, n2 + 18, this.h_(), 6.0f, 199.0f, 6, 27, 256, 512);
        }
    }

    private void id_class(Ml_1 ml_1, int n, int n2, rdI_2 rdI_22) {
        this.id_volatile.A().id_class(id_class);
        int n3 = ((rJp_1)this.id_instanceof).id_byte();
        int n4 = ((rJp_1)this.id_instanceof).id_class();
        if (n3 < 5) {
            Fy_1.id_class(ml_1, n + 136, n2 + 16, this.h_(), 0.0f, 186.0f, 102, 5, 256, 512);
            int n5 = rsp_3.id_break(n3);
            if (n4 >= n5 && rsp_3.id_protected(n3)) {
                int n6 = 100;
                float f = 100.0f / (float)(rsp_3.id_byte(n3) - n5);
                int n7 = Math.min(rfU_2.id_protected(f * (float)(n4 - n5)), 100);
                Fy_1.id_class(ml_1, n + 136, n2 + 16, this.h_(), 0.0f, 191.0f, n7 + 1, 5, 256, 512);
                int n8 = ((rJp_1)this.id_instanceof).id_break();
                if (n8 > 0) {
                    int n9 = Math.min(rfU_2.id_protected((float)n8 * f), 100 - n7);
                    Fy_1.id_class(ml_1, n + 136 + n7 + 1, n2 + 16 + 1, this.h_(), 2.0f, 182.0f, n9, 3, 256, 512);
                }
            }
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        rdf_3 rdf_32 = ((rJp_1)this.id_instanceof).id_throws();
        if (!rdf_32.isEmpty()) {
            rdI_2 rdI_2222;
            int n3 = (this.id_package - this.id_synchronized) / 2;
            int n4 = (this.id_int - this.id_return) / 2;
            int n5 = n4 + 16 + 1;
            int n6 = n3 + 5 + 5;
            RenderSystem.pushMatrix();
            RenderSystem.enableRescaleNormal();
            this.id_volatile.A().id_class(id_class);
            this.id_class(ml_1, n3, n4, rdf_32);
            int n7 = 0;
            for (rdI_2 rdI_2222 : rdf_32) {
                if (this.id_break(rdf_32.size()) && (n7 < this.id_finally || n7 >= 7 + this.id_finally)) {
                    ++n7;
                    continue;
                }
                Fp_1[] fp_1Array = rdI_2222.id_class();
                rdn_3 rdn_32 = rdI_2222.id_break();
                rdn_3 rdn_33 = rdI_2222.id_byte();
                rdn_3 object = rdI_2222.id_protected();
                this.id_final.id_break = 100.0f;
                int n8 = n5 + 2;
                this.id_class(ml_1, rdn_32, (rdn_3)fp_1Array, n6, n8);
                if (!rdn_33.id_class()) {
                    this.id_final.id_break(rdn_33, n3 + 5 + 35, n8);
                    this.id_final.id_class(this.id_super, rdn_33, (float)(n3 + 5 + 35), (float)n8);
                }
                this.id_class(ml_1, rdI_2222, n3, n8);
                this.id_final.id_break(object, n3 + 5 + 68, n8);
                this.id_final.id_class(this.id_super, object, (float)(n3 + 5 + 68), (float)n8);
                this.id_final.id_break = 0.0f;
                n5 += 20;
                ++n7;
            }
            int n9 = this.id_private;
            rdI_2222 = (rdI_2)rdf_32.get(n9);
            if (((rJp_1)this.id_instanceof).id_case()) {
                this.id_class(ml_1, n3, n4, rdI_2222);
            }
            if (rdI_2222.id_int() && this.id_class(186, 35, 22, 21, n, n2) && ((rJp_1)this.id_instanceof).id_protected()) {
                this.id_class(ml_1, id_catch, n, n2);
            }
            for (Fp_1 fp_1 : this.id_implements) {
                if (fp_1.B_()) {
                    fp_1.id_class(ml_1, n, n2);
                }
                fp_1.id_new = fp_1.id_class < ((rJp_1)this.id_instanceof).id_throws().size();
            }
            RenderSystem.popMatrix();
            RenderSystem.enableDepthTest();
        }
        this.id_break(ml_1, n, n2);
    }

    public static /* synthetic */ void id_break(Fy_1 fy_1, Ml_1 ml_1, rdn_3 rdn_32, int n, int n2) {
        fy_1.id_class(ml_1, rdn_32, n, n2);
    }

    private boolean id_break(int n) {
        return n > 7;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_boolean = false;
        int n2 = (this.id_package - this.id_synchronized) / 2;
        int n3 = (this.id_int - this.id_return) / 2;
        if (this.id_break(((rJp_1)this.id_instanceof).id_throws().size()) && d > (double)(n2 + 94) && d < (double)(n2 + 94 + 6) && d2 > (double)(n3 + 18) && d2 <= (double)(n3 + 18 + 139 + 1)) {
            this.id_boolean = true;
        }
        return super.id_break(d, d2, n);
    }

    private void id_finally() {
        ((rJp_1)this.id_instanceof).id_protected(this.id_private);
        ((rJp_1)this.id_instanceof).id_catch(this.id_private);
        this.id_volatile.id_void().id_class(new rZm_1(this.id_private));
    }

    @Override
    protected void v_() {
        super.v_();
        int n = (this.id_package - this.id_synchronized) / 2;
        int n2 = (this.id_int - this.id_return) / 2;
        int n3 = n2 + 16 + 2;
        for (int i = 0; i < 7; ++i) {
            this.id_implements[i] = this.id_class(new Fp_1(this, n + 5, n3, i, lF -> {
                if (lF instanceof Fp_1) {
                    this.id_private = ((Fp_1)lF).id_private() + this.id_finally;
                    this.id_finally();
                }
            }));
            n3 += 20;
        }
    }
}

