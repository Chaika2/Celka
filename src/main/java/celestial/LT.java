/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LI;
import celestial.Lt_1;
import celestial.Lw_1;
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
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class LT<E extends Lt_1<E>>
extends cu_3
implements cp_3 {
    protected final QY id_native;
    protected final int id_volatile;
    private List<E> id_class = new LI(this);
    protected int id_final;
    protected int id_package;
    protected int id_int;
    protected int id_new;
    protected int id_continue;
    protected int id_super;
    protected boolean id_this = true;
    private double id_throws;
    private boolean id_case = true;
    private boolean id_catch;
    protected int id_else;
    protected int id_synchronized;
    private boolean id_private;
    private E id_implements;
    private boolean id_finally = true;
    private boolean id_extends = true;

    protected void id_byte(double d, double d2, int n) {
        this.id_private = n == 0 && d >= (double)this.id_protected() && d < (double)(this.id_protected() + 6);
    }

    protected void id_byte(E e) {
        this.id_class((double)(this.x_().indexOf(e) * this.id_volatile + this.id_volatile / 2 - (this.id_new - this.id_int) / 2));
    }

    public void id_byte(boolean bl) {
        this.id_case = bl;
    }

    protected E id_byte(int n) {
        List<E> list = this.x_();
        if (n < 0 || n >= list.size()) {
            return null;
        }
        return (E)((Lt_1)list.get(n));
    }

    public int id_int() {
        return Math.max(0, this.id_final() - (this.id_new - this.id_int - 4 - this.id_synchronized));
    }

    public LT(QY qY, int n, int n2, int n3, int n4, int n5) {
        this.id_native = qY;
        this.id_final = n;
        this.id_package = n2;
        this.id_int = n3;
        this.id_new = n4;
        this.id_volatile = n5;
        this.id_super = 0;
        this.id_continue = n;
    }

    public List<E> id_this() {
        return this.id_class;
    }

    protected void id_class(Ml_1 ml_1, int n, int n2) {
    }

    protected void id_class(Ml_1 ml_1) {
    }

    protected void id_class(Ml_1 ml_1, int n, int n2, yb_3 yb_32) {
    }

    protected void id_class(int n, int n2) {
    }

    protected void id_class(Lw_1 lw_1) {
        this.id_class(lw_1, lt_1 -> true);
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (this.id_extends() != null) {
            this.id_extends().id_class(d, d2, n);
        }
        return false;
    }

    public void id_class(double d) {
        this.id_throws = rfU_2.id_class(d, 0.0, (double)this.id_int());
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (super.id_class(d, d2, n, d3, d4)) {
            return true;
        }
        if (n == 0 && this.id_private) {
            if (d2 < (double)this.id_int) {
                this.id_class(0.0);
            } else if (d2 > (double)this.id_new) {
                this.id_class((double)this.id_int());
            } else {
                double d5 = Math.max(1, this.id_int());
                int n2 = this.id_new - this.id_int;
                int n3 = rfU_2.id_class((int)((float)(n2 * n2) / (float)this.id_final()), 32, n2 - 8);
                double d6 = Math.max(1.0, d5 / (double)(n2 - n3));
                this.id_class(this.id_package() + d4 * d6);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        this.id_class(this.id_package() - d3 * (double)this.id_volatile / 2.0);
        return true;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (n == 264) {
            this.id_class(Lw_1.DOWN);
            return true;
        }
        if (n == 265) {
            this.id_class(Lw_1.UP);
            return true;
        }
        return false;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        int n3;
        this.id_class(ml_1);
        int n4 = this.id_protected();
        int n5 = n4 + 6;
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        if (this.id_finally) {
            this.id_native.A().id_class(ch_3.id_break);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)this.id_super, (double)this.id_new, 0.0).id_class((float)this.id_super / 32.0f, (float)(this.id_new + (int)this.id_package()) / 32.0f).id_break(32, 32, 32, 255).id_class();
            lD_22.id_class((double)this.id_continue, (double)this.id_new, 0.0).id_class((float)this.id_continue / 32.0f, (float)(this.id_new + (int)this.id_package()) / 32.0f).id_break(32, 32, 32, 255).id_class();
            lD_22.id_class((double)this.id_continue, (double)this.id_int, 0.0).id_class((float)this.id_continue / 32.0f, (float)(this.id_int + (int)this.id_package()) / 32.0f).id_break(32, 32, 32, 255).id_class();
            lD_22.id_class((double)this.id_super, (double)this.id_int, 0.0).id_class((float)this.id_super / 32.0f, (float)(this.id_int + (int)this.id_package()) / 32.0f).id_break(32, 32, 32, 255).id_class();
            yb_32.id_break();
        }
        int n6 = this.id_continue();
        int n7 = this.id_int + 4 - (int)this.id_package();
        if (this.id_catch) {
            this.id_class(ml_1, n6, n7, yb_32);
        }
        this.id_class(ml_1, n6, n7, n, n2, f);
        if (this.id_extends) {
            this.id_native.A().id_class(ch_3.id_break);
            RenderSystem.enableDepthTest();
            RenderSystem.depthFunc(519);
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)this.id_super, (double)this.id_int, -100.0).id_class(0.0f, (float)this.id_int / 32.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)(this.id_super + this.id_final), (double)this.id_int, -100.0).id_class((float)this.id_final / 32.0f, (float)this.id_int / 32.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)(this.id_super + this.id_final), 0.0, -100.0).id_class((float)this.id_final / 32.0f, 0.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)this.id_super, 0.0, -100.0).id_class(0.0f, 0.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)this.id_super, (double)this.id_package, -100.0).id_class(0.0f, (float)this.id_package / 32.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)(this.id_super + this.id_final), (double)this.id_package, -100.0).id_class((float)this.id_final / 32.0f, (float)this.id_package / 32.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)(this.id_super + this.id_final), (double)this.id_new, -100.0).id_class((float)this.id_final / 32.0f, (float)this.id_new / 32.0f).id_break(64, 64, 64, 255).id_class();
            lD_22.id_class((double)this.id_super, (double)this.id_new, -100.0).id_class(0.0f, (float)this.id_new / 32.0f).id_break(64, 64, 64, 255).id_class();
            yb_32.id_break();
            RenderSystem.depthFunc(515);
            RenderSystem.disableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
            RenderSystem.disableAlphaTest();
            RenderSystem.shadeModel(7425);
            RenderSystem.disableTexture();
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)this.id_super, (double)(this.id_int + 4), 0.0).id_class(0.0f, 1.0f).id_break(0, 0, 0, 0).id_class();
            lD_22.id_class((double)this.id_continue, (double)(this.id_int + 4), 0.0).id_class(1.0f, 1.0f).id_break(0, 0, 0, 0).id_class();
            lD_22.id_class((double)this.id_continue, (double)this.id_int, 0.0).id_class(1.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_super, (double)this.id_int, 0.0).id_class(0.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_super, (double)this.id_new, 0.0).id_class(0.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_continue, (double)this.id_new, 0.0).id_class(1.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)this.id_continue, (double)(this.id_new - 4), 0.0).id_class(1.0f, 0.0f).id_break(0, 0, 0, 0).id_class();
            lD_22.id_class((double)this.id_super, (double)(this.id_new - 4), 0.0).id_class(0.0f, 0.0f).id_break(0, 0, 0, 0).id_class();
            yb_32.id_break();
        }
        if ((n3 = this.id_int()) > 0) {
            RenderSystem.disableTexture();
            int n8 = (int)((float)((this.id_new - this.id_int) * (this.id_new - this.id_int)) / (float)this.id_final());
            n8 = rfU_2.id_class(n8, 32, this.id_new - this.id_int - 8);
            int n9 = (int)this.id_package() * (this.id_new - this.id_int - n8) / n3 + this.id_int;
            if (n9 < this.id_int) {
                n9 = this.id_int;
            }
            lD_22.id_class(7, ju_3.id_public);
            lD_22.id_class((double)n4, (double)this.id_new, 0.0).id_class(0.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)n5, (double)this.id_new, 0.0).id_class(1.0f, 1.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)n5, (double)this.id_int, 0.0).id_class(1.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)n4, (double)this.id_int, 0.0).id_class(0.0f, 0.0f).id_break(0, 0, 0, 255).id_class();
            lD_22.id_class((double)n4, (double)(n9 + n8), 0.0).id_class(0.0f, 1.0f).id_break(128, 128, 128, 255).id_class();
            lD_22.id_class((double)n5, (double)(n9 + n8), 0.0).id_class(1.0f, 1.0f).id_break(128, 128, 128, 255).id_class();
            lD_22.id_class((double)n5, (double)n9, 0.0).id_class(1.0f, 0.0f).id_break(128, 128, 128, 255).id_class();
            lD_22.id_class((double)n4, (double)n9, 0.0).id_class(0.0f, 0.0f).id_break(128, 128, 128, 255).id_class();
            lD_22.id_class((double)n4, (double)(n9 + n8 - 1), 0.0).id_class(0.0f, 1.0f).id_break(192, 192, 192, 255).id_class();
            lD_22.id_class((double)(n5 - 1), (double)(n9 + n8 - 1), 0.0).id_class(1.0f, 1.0f).id_break(192, 192, 192, 255).id_class();
            lD_22.id_class((double)(n5 - 1), (double)n9, 0.0).id_class(1.0f, 0.0f).id_break(192, 192, 192, 255).id_class();
            lD_22.id_class((double)n4, (double)n9, 0.0).id_class(0.0f, 0.0f).id_break(192, 192, 192, 255).id_class();
            yb_32.id_break();
        }
        this.id_class(ml_1, n, n2);
        RenderSystem.enableTexture();
        RenderSystem.shadeModel(7424);
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
    }

    public void id_class(E e) {
        this.id_implements = e;
    }

    protected void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, float f) {
        int n5 = this.id_volatile();
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        for (int i = 0; i < n5; ++i) {
            int n6 = this.id_case(i);
            int n7 = this.id_implements(i);
            if (n7 < this.id_int || n6 > this.id_new) continue;
            int n8 = n2 + i * this.id_volatile + this.id_else;
            int n9 = this.id_volatile - 4;
            E e = this.id_byte(i);
            if (e == null) continue;
            int n10 = this.F_();
            int n11 = this.id_super + this.id_final / 2 - n10 / 2;
            int n12 = this.id_super + this.id_final / 2 + n10 / 2;
            if (this.id_case && this.id_protected(i)) {
                RenderSystem.disableTexture();
                float f2 = this.id_class() ? 1.0f : 0.5f;
                RenderSystem.color4f(f2, f2, f2, 1.0f);
                lD_22.id_class(7, ju_3.id_super);
                lD_22.id_class((double)n11, (double)(n8 + n9 + 2), 0.0).id_class();
                lD_22.id_class((double)n12, (double)(n8 + n9 + 2), 0.0).id_class();
                lD_22.id_class((double)n12, (double)(n8 - 2), 0.0).id_class();
                lD_22.id_class((double)n11, (double)(n8 - 2), 0.0).id_class();
                yb_32.id_break();
                RenderSystem.color4f(0.0f, 0.0f, 0.0f, 1.0f);
                lD_22.id_class(7, ju_3.id_super);
                lD_22.id_class((double)(n11 + 1), (double)(n8 + n9 + 1), 0.0).id_class();
                lD_22.id_class((double)(n12 - 1), (double)(n8 + n9 + 1), 0.0).id_class();
                lD_22.id_class((double)(n12 - 1), (double)(n8 - 1), 0.0).id_class();
                lD_22.id_class((double)(n11 + 1), (double)(n8 - 1), 0.0).id_class();
                yb_32.id_break();
                RenderSystem.enableTexture();
            }
            int n13 = this.id_continue();
            ((Lt_1)e).id_class(ml_1, i, n6, n13, n10, n9, n3, n4, this.id_break(n3, n4) && Objects.equals(this.id_protected(n3, n4), e), f);
        }
    }

    protected void id_class(Collection<E> collection) {
        this.id_class.clear();
        this.id_class.addAll(collection);
    }

    protected boolean id_class() {
        return false;
    }

    public void id_class(boolean bl, int n) {
        this.id_catch = bl;
        this.id_else = n;
        if (!bl) {
            this.id_else = 0;
        }
    }

    protected void id_class(Lw_1 lw_1, Predicate<E> predicate) {
        int n;
        int n2 = n = lw_1 == Lw_1.UP ? -1 : 1;
        if (!this.x_().isEmpty()) {
            int n3;
            int n4 = this.x_().indexOf(this.id_finally());
            while (n4 != (n3 = rfU_2.id_class(n4 + n, 0, this.id_volatile() - 1))) {
                Lt_1 lt_1 = (Lt_1)this.x_().get(n3);
                if (predicate.test(lt_1)) {
                    this.id_class((E)lt_1);
                    this.id_protected(lt_1);
                    break;
                }
                n4 = n3;
            }
        }
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_byte(d, d2, n);
        if (!this.id_break(d, d2)) {
            return false;
        }
        E e = this.id_protected(d, d2);
        if (e != null) {
            if (e.id_break(d, d2, n)) {
                this.id_class(e);
                this.id_class((E)true);
                return true;
            }
        } else if (n == 0) {
            this.id_class((int)(d - (double)(this.id_super + this.id_final / 2 - this.F_() / 2)), (int)(d2 - (double)this.id_int) + (int)this.id_package() - 4);
            return true;
        }
        return this.id_private;
    }

    public void id_break(int n) {
        this.id_synchronized = n;
    }

    public void id_break(int n, int n2, int n3, int n4) {
        this.id_final = n;
        this.id_package = n2;
        this.id_int = n3;
        this.id_new = n4;
        this.id_super = 0;
        this.id_continue = n;
    }

    @Override
    public boolean id_break(double d, double d2) {
        return d2 >= (double)this.id_int && d2 <= (double)this.id_new && d >= (double)this.id_super && d <= (double)this.id_continue;
    }

    protected int id_break(E e) {
        this.id_class.add(e);
        return this.id_class.size() - 1;
    }

    public void id_throws(int n) {
        this.id_super = n;
        this.id_continue = n + this.id_final;
    }

    public void id_throws(boolean bl) {
        this.id_extends = bl;
    }

    public boolean id_throws(E e) {
        boolean bl = this.id_class.remove(e);
        if (bl && e == this.id_finally()) {
            this.id_class((E)null);
        }
        return bl;
    }

    public E id_finally() {
        return this.id_implements;
    }

    @Override
    public /* synthetic */ cC_2 id_catch() {
        return this.id_extends();
    }

    protected E id_catch(int n) {
        Lt_1 lt_1 = (Lt_1)this.id_class.get(n);
        return (E)(this.id_throws((Lt_1)this.id_class.get(n)) ? lt_1 : null);
    }

    public E id_extends() {
        return (E)((Lt_1)super.id_catch());
    }

    public void id_case(Lt_1<E> lt_1) {
        lt_1.id_class = this;
    }

    protected int id_case(int n) {
        return this.id_int + 4 - (int)this.id_package() + n * this.id_volatile + this.id_else;
    }

    public int id_continue() {
        return this.id_super + this.id_final / 2 - this.F_() / 2 + 2;
    }

    private int id_implements(int n) {
        return this.id_case(n) + this.id_volatile;
    }

    protected void id_new() {
        E e = this.id_finally();
        if (e != null) {
            this.id_class(e);
            this.id_protected(e);
        }
    }

    public double id_package() {
        return this.id_throws;
    }

    public int id_super() {
        return this.id_continue() + this.F_();
    }

    public void id_protected(boolean bl) {
        this.id_finally = bl;
    }

    protected void id_protected(E e) {
        int n;
        int n2 = this.id_case(this.x_().indexOf(e));
        int n3 = n2 - this.id_int - 4 - this.id_volatile;
        if (n3 < 0) {
            this.id_private(n3);
        }
        if ((n = this.id_new - n2 - this.id_volatile - this.id_volatile) < 0) {
            this.id_private(-n);
        }
    }

    protected final E id_protected(double d, double d2) {
        int n = this.F_() / 2;
        int n2 = this.id_super + this.id_final / 2;
        int n3 = n2 - n;
        int n4 = n2 + n;
        int n5 = rfU_2.id_byte(d2 - (double)this.id_int) - this.id_else + (int)this.id_package() - 4;
        int n6 = n5 / this.id_volatile;
        return (E)(d < (double)this.id_protected() && d >= (double)n3 && d <= (double)n4 && n6 >= 0 && n5 >= 0 && n6 < this.id_volatile() ? (Lt_1)this.x_().get(n6) : null);
    }

    protected boolean id_protected(int n) {
        return Objects.equals(this.id_finally(), this.x_().get(n));
    }

    protected int id_protected() {
        return this.id_final / 2 + 124;
    }

    private void id_private(int n) {
        this.id_class(this.id_package() + (double)n);
    }

    protected int id_final() {
        return this.id_volatile() * this.id_volatile + this.id_else;
    }

    protected int id_volatile() {
        return this.x_().size();
    }

    protected final void id_native() {
        this.id_class.clear();
    }

    public final List<E> x_() {
        return this.id_class;
    }

    public int F_() {
        return 220;
    }
}

