/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MK;
import celestial.Ml_1;
import celestial.OP;
import celestial.QY;
import celestial.cC_2;
import celestial.ch_3;
import celestial.cp_3;
import celestial.cu_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rfU_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public abstract class rrJh_1
extends cu_3
implements cp_3 {
    protected static final int id_class = -1;
    protected static final int id_throws = -2;
    protected final QY id_case;
    protected int id_catch;
    protected int id_private;
    protected int id_implements;
    protected int id_finally;
    protected int id_extends;
    protected int id_native;
    protected final int id_volatile;
    protected boolean id_final = true;
    protected int id_package = -2;
    protected double id_int;
    protected boolean id_new = true;
    protected boolean id_continue = true;
    protected boolean id_super;
    protected int id_this;
    private boolean id_else;

    public void id_byte(int n) {
        this.id_int = n * this.id_volatile + this.id_volatile / 2 - (this.id_finally - this.id_implements) / 2;
        this.id_implements();
    }

    public void id_byte(boolean bl) {
        this.id_continue = bl;
    }

    protected void id_byte(int n, int n2, int n3, int n4) {
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        this.id_case.A().id_class(ch_3.id_break);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f = 32.0f;
        lD_22.id_class(7, ju_3.id_public);
        lD_22.id_class((double)this.id_native, (double)n2, 0.0).id_class(0.0f, (float)n2 / 32.0f).id_break(64, 64, 64, n4).id_class();
        lD_22.id_class((double)(this.id_native + this.id_catch), (double)n2, 0.0).id_class((float)this.id_catch / 32.0f, (float)n2 / 32.0f).id_break(64, 64, 64, n4).id_class();
        lD_22.id_class((double)(this.id_native + this.id_catch), (double)n, 0.0).id_class((float)this.id_catch / 32.0f, (float)n / 32.0f).id_break(64, 64, 64, n3).id_class();
        lD_22.id_class((double)this.id_native, (double)n, 0.0).id_class(0.0f, (float)n / 32.0f).id_break(64, 64, 64, n3).id_class();
        yb_32.id_break();
    }

    protected void id_byte(double d, double d2, int n) {
        this.id_else = n == 0 && d >= (double)this.id_package() && d < (double)(this.id_package() + 6);
    }

    public int id_int() {
        return this.id_volatile;
    }

    public rrJh_1(QY qY, int n, int n2, int n3, int n4, int n5) {
        this.id_case = qY;
        this.id_catch = n;
        this.id_private = n2;
        this.id_implements = n3;
        this.id_finally = n4;
        this.id_volatile = n5;
        this.id_native = 0;
        this.id_extends = n;
    }

    protected void id_class(boolean bl, int n) {
        this.id_super = bl;
        this.id_this = n;
        if (!bl) {
            this.id_this = 0;
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_new) {
            this.id_private();
            int n3 = this.id_package();
            int n4 = n3 + 6;
            this.id_implements();
            yb_3 yb_32 = yb_3.id_class();
            lD_2 lD_22 = yb_32.id_byte();
            this.id_case.A().id_class(ch_3.id_break);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            float f2 = 32.0f;
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)this.id_native, (double)this.id_finally, 0.0).id_class((float)this.id_native / 32.0f, (float)(this.id_finally + (int)this.id_int) / 32.0f).id_break(32, 32, 32, 255).id_class();
            lD_22.id_class((double)this.id_extends, (double)this.id_finally, 0.0).id_class((float)this.id_extends / 32.0f, (float)(this.id_finally + (int)this.id_int) / 32.0f).id_break(32, 32, 32, 255).id_class();
            lD_22.id_class((double)this.id_extends, (double)this.id_implements, 0.0).id_class((float)this.id_extends / 32.0f, (float)(this.id_implements + (int)this.id_int) / 32.0f).id_break(32, 32, 32, 255).id_class();
            lD_22.id_class((double)this.id_native, (double)this.id_implements, 0.0).id_class((float)this.id_native / 32.0f, (float)(this.id_implements + (int)this.id_int) / 32.0f).id_break(32, 32, 32, 255).id_class();
            yb_32.id_break();
            int n5 = this.id_native + this.id_catch / 2 - this.id_volatile() / 2 + 2;
            int n6 = this.id_implements + 4 - (int)this.id_int;
            if (this.id_super) {
                this.id_class(n5, n6, yb_32);
            }
            this.id_class(ml_1, n5, n6, n, n2, f);
            RenderSystem.disableDepthTest();
            this.id_byte(0, this.id_implements, 255, 255);
            this.id_byte(this.id_finally, this.id_private, 255, 255);
            RenderSystem.enableBlend();
            RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
            RenderSystem.disableAlphaTest();
            RenderSystem.shadeModel(7425);
            RenderSystem.disableTexture();
            int n7 = 4;
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)this.id_native, (double)(this.id_implements + 4), 0.0).id_class(0.0f, 1.0f).id_break(0, 0, 0, 0).id_class();
            lD_22.id_class((double)this.id_extends, (double)(this.id_implements + 4), 0.0).id_class(1.0f, 1.0f).id_break(0, 0, 0, 0).id_class();
            lD_22.id_class((double)this.id_extends, (double)this.id_implements, 0.0).id_class(1.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_native, (double)this.id_implements, 0.0).id_class(0.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
            yb_32.id_break();
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)this.id_native, (double)this.id_finally, 0.0).id_class(0.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_extends, (double)this.id_finally, 0.0).id_class(1.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_extends, (double)(this.id_finally - 4), 0.0).id_class(1.0f, 0.0f).id_break(0, 0, 0, 0).id_class();
            lD_22.id_class((double)this.id_native, (double)(this.id_finally - 4), 0.0).id_class(0.0f, 0.0f).id_break(0, 0, 0, 0).id_class();
            yb_32.id_break();
            int n8 = this.id_finally();
            if (n8 > 0) {
                int n9 = (int)((float)((this.id_finally - this.id_implements) * (this.id_finally - this.id_implements)) / (float)this.id_throws());
                int n10 = (int)this.id_int * (this.id_finally - this.id_implements - (n9 = rfU_2.id_class(n9, 32, this.id_finally - this.id_implements - 8))) / n8 + this.id_implements;
                if (n10 < this.id_implements) {
                    n10 = this.id_implements;
                }
                lD_22.id_class(7, ju_3.id_public);
                lD_22.id_class((double)n3, (double)this.id_finally, 0.0).id_class(0.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
                lD_22.id_class((double)n4, (double)this.id_finally, 0.0).id_class(1.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
                lD_22.id_class((double)n4, (double)this.id_implements, 0.0).id_class(1.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
                lD_22.id_class((double)n3, (double)this.id_implements, 0.0).id_class(0.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
                yb_32.id_break();
                lD_22.id_class(7, ju_3.id_public);
                lD_22.id_class((double)n3, (double)(n10 + n9), 0.0).id_class(0.0f, 1.0f).id_break(128, 128, 128, 255).id_class();
                lD_22.id_class((double)n4, (double)(n10 + n9), 0.0).id_class(1.0f, 1.0f).id_break(128, 128, 128, 255).id_class();
                lD_22.id_class((double)n4, (double)n10, 0.0).id_class(1.0f, 0.0f).id_break(128, 128, 128, 255).id_class();
                lD_22.id_class((double)n3, (double)n10, 0.0).id_class(0.0f, 0.0f).id_break(128, 128, 128, 255).id_class();
                yb_32.id_break();
                lD_22.id_class(7, ju_3.id_public);
                lD_22.id_class((double)n3, (double)(n10 + n9 - 1), 0.0).id_class(0.0f, 1.0f).id_break(192, 192, 192, 255).id_class();
                lD_22.id_class((double)(n4 - 1), (double)(n10 + n9 - 1), 0.0).id_class(1.0f, 1.0f).id_break(192, 192, 192, 255).id_class();
                lD_22.id_class((double)(n4 - 1), (double)n10, 0.0).id_class(1.0f, 0.0f).id_break(192, 192, 192, 255).id_class();
                lD_22.id_class((double)n3, (double)n10, 0.0).id_class(0.0f, 0.0f).id_break(192, 192, 192, 255).id_class();
                yb_32.id_break();
            }
            this.id_break(n, n2);
            RenderSystem.enableTexture();
            RenderSystem.shadeModel(7424);
            RenderSystem.enableAlphaTest();
            RenderSystem.disableBlend();
        }
    }

    protected void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, float f) {
        int n5 = this.id_protected();
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        for (int i = 0; i < n5; ++i) {
            int n6 = n2 + i * this.id_volatile + this.id_this;
            int n7 = this.id_volatile - 4;
            if (n6 > this.id_finally || n6 + n7 < this.id_implements) {
                this.id_class(i, n, n6, f);
            }
            if (this.id_continue && this.id_break(i)) {
                int n8 = this.id_native + this.id_catch / 2 - this.id_volatile() / 2;
                int n9 = this.id_native + this.id_catch / 2 + this.id_volatile() / 2;
                RenderSystem.disableTexture();
                float f2 = this.id_final() ? 1.0f : 0.5f;
                RenderSystem.color4f(f2, f2, f2, 1.0f);
                lD_22.id_class(7, ju_3.id_super);
                lD_22.id_class((double)n8, (double)(n6 + n7 + 2), 0.0).id_class();
                lD_22.id_class((double)n9, (double)(n6 + n7 + 2), 0.0).id_class();
                lD_22.id_class((double)n9, (double)(n6 - 2), 0.0).id_class();
                lD_22.id_class((double)n8, (double)(n6 - 2), 0.0).id_class();
                yb_32.id_break();
                RenderSystem.color4f(0.0f, 0.0f, 0.0f, 1.0f);
                lD_22.id_class(7, ju_3.id_super);
                lD_22.id_class((double)(n8 + 1), (double)(n6 + n7 + 1), 0.0).id_class();
                lD_22.id_class((double)(n9 - 1), (double)(n6 + n7 + 1), 0.0).id_class();
                lD_22.id_class((double)(n9 - 1), (double)(n6 - 1), 0.0).id_class();
                lD_22.id_class((double)(n8 + 1), (double)(n6 - 1), 0.0).id_class();
                yb_32.id_break();
                RenderSystem.enableTexture();
            }
            if (n6 + this.id_volatile < this.id_implements || n6 > this.id_finally) continue;
            this.id_class(ml_1, i, n, n6, n7, n3, n4, f);
        }
    }

    @Override
    public boolean id_class(char c, int n) {
        return !this.id_class() ? false : super.id_class(c, n);
    }

    protected void id_class(int n, int n2) {
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (!this.id_class()) {
            return false;
        }
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (n == 264) {
            this.id_throws(1);
            return true;
        }
        if (n == 265) {
            this.id_throws(-1);
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        if (!this.id_class()) {
            return false;
        }
        this.id_int -= d3 * (double)this.id_volatile / 2.0;
        return true;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (super.id_class(d, d2, n, d3, d4)) {
            return true;
        }
        if (this.id_class() && n == 0 && this.id_else) {
            if (d2 < (double)this.id_implements) {
                this.id_int = 0.0;
            } else if (d2 > (double)this.id_finally) {
                this.id_int = this.id_finally();
            } else {
                double d5 = this.id_finally();
                if (d5 < 1.0) {
                    d5 = 1.0;
                }
                int n2 = (int)((float)((this.id_finally - this.id_implements) * (this.id_finally - this.id_implements)) / (float)this.id_throws());
                double d6 = d5 / (double)(this.id_finally - this.id_implements - (n2 = rfU_2.id_class(n2, 32, this.id_finally - this.id_implements - 8)));
                if (d6 < 1.0) {
                    d6 = 1.0;
                }
                this.id_int += d4 * d6;
                this.id_implements();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (this.id_catch() != null) {
            this.id_catch().id_class(d, d2, n);
        }
        return false;
    }

    protected abstract void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

    protected void id_class(int n, int n2, int n3, float f) {
    }

    protected boolean id_class(int n, int n2, double d, double d2) {
        return true;
    }

    protected void id_class(int n, int n2, yb_3 yb_32) {
    }

    public boolean id_class() {
        return this.id_new;
    }

    @Override
    public boolean id_break(double d, double d2) {
        return this.id_throws(d, d2);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_byte(d, d2, n);
        if (this.id_class() && this.id_throws(d, d2)) {
            int n2 = this.id_protected(d, d2);
            if (n2 == -1 && n == 0) {
                this.id_class((int)(d - (double)(this.id_native + this.id_catch / 2 - this.id_volatile() / 2)), (int)(d2 - (double)this.id_implements) + (int)this.id_int - 4);
                return true;
            }
            if (n2 != -1 && this.id_class(n2, n, d, d2)) {
                if (this.x_().size() > n2) {
                    this.id_class(this.x_().get(n2));
                }
                this.id_class(true);
                return true;
            }
            return this.id_else;
        }
        return false;
    }

    protected abstract boolean id_break(int var1);

    protected void id_break(int n, int n2) {
    }

    public void id_break(int n, int n2, int n3, int n4) {
        this.id_catch = n;
        this.id_private = n2;
        this.id_implements = n3;
        this.id_finally = n4;
        this.id_native = 0;
        this.id_extends = n;
    }

    public boolean id_throws(double d, double d2) {
        return d2 >= (double)this.id_implements && d2 <= (double)this.id_finally && d >= (double)this.id_native && d <= (double)this.id_extends;
    }

    protected int id_throws() {
        return this.id_protected() * this.id_volatile + this.id_this;
    }

    protected void id_throws(int n) {
    }

    public int id_finally() {
        return Math.max(0, this.id_throws() - (this.id_finally - this.id_implements - 4));
    }

    public int id_extends() {
        return (int)this.id_int;
    }

    public void id_case(int n) {
        this.id_native = n;
        this.id_extends = n + this.id_catch;
    }

    protected void id_implements() {
        this.id_int = rfU_2.id_class(this.id_int, 0.0, (double)this.id_finally());
    }

    protected int id_package() {
        return this.id_catch / 2 + 124;
    }

    protected abstract int id_protected();

    public int id_protected(double d, double d2) {
        int n = this.id_native + this.id_catch / 2 - this.id_volatile() / 2;
        int n2 = this.id_native + this.id_catch / 2 + this.id_volatile() / 2;
        int n3 = rfU_2.id_byte(d2 - (double)this.id_implements) - this.id_this + (int)this.id_int - 4;
        int n4 = n3 / this.id_volatile;
        return d < (double)this.id_package() && d >= (double)n && d <= (double)n2 && n4 >= 0 && n3 >= 0 && n4 < this.id_protected() ? n4 : -1;
    }

    public void id_protected(boolean bl) {
        this.id_new = bl;
    }

    public void id_protected(int n) {
        this.id_int += (double)n;
        this.id_implements();
        this.id_package = -2;
    }

    protected abstract void id_private();

    protected boolean id_final() {
        return false;
    }

    public int id_volatile() {
        return 220;
    }

    public int id_native() {
        return (int)this.id_int - this.id_private - this.id_this;
    }

    @Override
    public List<? extends cC_2> x_() {
        return Collections.emptyList();
    }
}

