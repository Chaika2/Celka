/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Ml_1;
import celestial.QY;
import celestial.cC_2;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cp_3;
import celestial.mG_2;
import celestial.mM_2;
import celestial.mO_2;
import celestial.rJI;
import celestial.rJr_1;
import celestial.rXH;
import celestial.rfU_2;
import celestial.rkw_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public class mb_3
extends ch_3
implements cC_2,
cp_3 {
    public static final rqO_2 id_class = new rqO_2("textures/gui/recipe_book.png");
    private final List<mO_2> id_throws = Lists.newArrayList();
    private boolean id_case;
    private int id_catch;
    private int id_private;
    public QY id_implements;
    private mG_2 id_finally;
    private rkw_3<?> id_extends;
    public float id_native;
    public boolean id_volatile;

    private void id_byte(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6) {
        this.id_break(ml_1, this.id_catch, this.id_private, n5, n6, n4, n4);
        this.id_break(ml_1, this.id_catch + n4 * 2 + n * n3, this.id_private, n5 + n3 + n4, n6, n4, n4);
        this.id_break(ml_1, this.id_catch, this.id_private + n4 * 2 + n2 * n3, n5, n6 + n3 + n4, n4, n4);
        this.id_break(ml_1, this.id_catch + n4 * 2 + n * n3, this.id_private + n4 * 2 + n2 * n3, n5 + n3 + n4, n6 + n3 + n4, n4, n4);
        for (int i = 0; i < n; ++i) {
            this.id_break(ml_1, this.id_catch + n4 + i * n3, this.id_private, n5 + n4, n6, n3, n4);
            this.id_break(ml_1, this.id_catch + n4 + (i + 1) * n3, this.id_private, n5 + n4, n6, n4, n4);
            for (int j = 0; j < n2; ++j) {
                if (i == 0) {
                    this.id_break(ml_1, this.id_catch, this.id_private + n4 + j * n3, n5, n6 + n4, n4, n3);
                    this.id_break(ml_1, this.id_catch, this.id_private + n4 + (j + 1) * n3, n5, n6 + n4, n4, n4);
                }
                this.id_break(ml_1, this.id_catch + n4 + i * n3, this.id_private + n4 + j * n3, n5 + n4, n6 + n4, n3, n3);
                this.id_break(ml_1, this.id_catch + n4 + (i + 1) * n3, this.id_private + n4 + j * n3, n5 + n4, n6 + n4, n4, n3);
                this.id_break(ml_1, this.id_catch + n4 + i * n3, this.id_private + n4 + (j + 1) * n3, n5 + n4, n6 + n4, n3, n4);
                this.id_break(ml_1, this.id_catch + n4 + (i + 1) * n3 - 1, this.id_private + n4 + (j + 1) * n3 - 1, n5 + n4, n6 + n4, n4 + 1, n4 + 1);
                if (i != n - 1) continue;
                this.id_break(ml_1, this.id_catch + n4 * 2 + n * n3, this.id_private + n4 + j * n3, n5 + n3 + n4, n6 + n4, n4, n3);
                this.id_break(ml_1, this.id_catch + n4 * 2 + n * n3, this.id_private + n4 + (j + 1) * n3, n5 + n3 + n4, n6 + n4, n4, n4);
            }
            this.id_break(ml_1, this.id_catch + n4 + i * n3, this.id_private + n4 * 2 + n2 * n3, n5 + n4, n6 + n3 + n4, n3, n4);
            this.id_break(ml_1, this.id_catch + n4 + (i + 1) * n3, this.id_private + n4 * 2 + n2 * n3, n5 + n4, n6 + n3 + n4, n4, n4);
        }
    }

    public void id_class(boolean bl) {
        this.id_case = bl;
    }

    public void id_class(QY qY, mG_2 mG_22, int n, int n2, int n3, int n4, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        this.id_implements = qY;
        this.id_finally = mG_22;
        if ((rJr_1)((cb_3)qY.id_class[57]).id_implements[4] instanceof rXH) {
            this.id_volatile = true;
        }
        boolean bl = ((cb_3)qY.id_class[57]).Z().id_class((rJI)((rJr_1)((cb_3)qY.id_class[57]).id_implements[4]));
        List<rkw_3<?>> list = mG_22.id_break(true);
        List list2 = bl ? Collections.emptyList() : mG_22.id_break(false);
        int n5 = list.size();
        int n6 = n5 + list2.size();
        int n7 = n6 <= 16 ? 4 : 5;
        int n8 = (int)Math.ceil((float)n6 / (float)n7);
        this.id_catch = n;
        this.id_private = n2;
        int n9 = 25;
        float f7 = this.id_catch + Math.min(n6, n7) * 25;
        if (f7 > (f6 = (float)(n3 + 50))) {
            this.id_catch = (int)((float)this.id_catch - f * (float)((int)((f7 - f6) / f)));
        }
        if ((f5 = (float)(this.id_private + n8 * 25)) > (f4 = (float)(n4 + 50))) {
            this.id_private = (int)((float)this.id_private - f * (float)rfU_2.id_case((f5 - f4) / f));
        }
        if ((f3 = (float)this.id_private) < (f2 = (float)(n4 - 100))) {
            this.id_private = (int)((float)this.id_private - f * (float)rfU_2.id_case((f3 - f2) / f));
        }
        this.id_case = true;
        this.id_throws.clear();
        for (int i = 0; i < n6; ++i) {
            boolean bl2 = i < n5;
            rkw_3 rkw_32 = bl2 ? list.get(i) : (rkw_3)list2.get(i - n5);
            int n10 = this.id_catch + 4 + 25 * (i % n7);
            int n11 = this.id_private + 5 + 25 * (i / n7);
            if (this.id_volatile) {
                this.id_throws.add(new mM_2(this, n10, n11, rkw_32, bl2));
                continue;
            }
            this.id_throws.add(new mO_2(this, n10, n11, rkw_32, bl2));
        }
        this.id_extends = null;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_case) {
            this.id_native += f;
            RenderSystem.enableBlend();
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_implements.A().id_class(id_class);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 170.0f);
            int n3 = this.id_throws.size() <= 16 ? 4 : 5;
            int n4 = Math.min(this.id_throws.size(), n3);
            int n5 = rfU_2.id_case((float)this.id_throws.size() / (float)n3);
            int n6 = 24;
            int n7 = 4;
            int n8 = 82;
            int n9 = 208;
            this.id_byte(ml_1, n4, n5, 24, 4, 82, 208);
            RenderSystem.disableBlend();
            for (mO_2 mO_22 : this.id_throws) {
                mO_22.id_class(ml_1, n, n2, f);
            }
            RenderSystem.popMatrix();
        }
    }

    public mG_2 id_class() {
        return this.id_finally;
    }

    @Override
    public boolean id_break(double d, double d2) {
        return false;
    }

    @Override
    public boolean id_break(boolean bl) {
        return false;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n != 0) {
            return false;
        }
        for (mO_2 mO_22 : this.id_throws) {
            if (!mO_22.id_break(d, d2, n)) continue;
            this.id_extends = mO_22.id_case;
            return true;
        }
        return false;
    }

    public boolean id_throws() {
        return this.id_case;
    }

    public rkw_3<?> id_protected() {
        return this.id_extends;
    }
}

