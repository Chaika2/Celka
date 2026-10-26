/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.cb_3;
import celestial.mE_2;
import celestial.mG_2;
import celestial.rJI;
import celestial.rJr_1;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rkU_2;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.vm_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class mJ_2
extends LZ {
    private static final rqO_2 id_class = new rqO_2("textures/gui/recipe_book.png");
    private static final rgP_2 id_throws = new rgn_3("gui.recipebook.moreRecipes");
    private rJI<?> id_case;
    private rkU_2 id_catch;
    private mG_2 id_private;
    private float id_implements;
    private float id_super;
    private int id_this;

    public mJ_2() {
        super(0, 0, 25, 25, rgN_2.id_byte);
    }

    public void id_class(mG_2 mG_22, mE_2 mE_22) {
        this.id_private = mG_22;
        this.id_case = (rJI)((rJr_1)((cb_3)mE_22.id_protected().id_class[57]).id_implements[4]);
        this.id_catch = mE_22.id_throws();
        List<rkw_3<?>> list = mG_22.id_class(this.id_catch.id_class(this.id_case));
        for (rkw_3<?> rkw_32 : list) {
            if (!this.id_catch.id_protected(rkw_32)) continue;
            mE_22.id_class(list);
            this.id_super = 15.0f;
            break;
        }
    }

    public List<rgP_2> id_class(vm_3 vm_32) {
        rdn_3 rdn_32 = this.id_catch().get(this.id_this).id_byte();
        ArrayList arrayList = Lists.newArrayList((Iterable)((Object)vm_32.id_class(rdn_32)));
        if (this.id_private.id_class(this.id_catch.id_class(this.id_case)).size() > 1) {
            arrayList.add(id_throws);
        }
        return arrayList;
    }

    public mG_2 id_class() {
        return this.id_private;
    }

    public void id_class(int n, int n2) {
        this.id_volatile = n;
        this.id_final = n2;
    }

    @Override
    protected boolean id_break(int n) {
        return n == 0 || n == 1;
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        boolean bl;
        if (!vm_3.id_else()) {
            this.id_implements += f;
        }
        QY qY = QY.id_instanceof();
        qY.A().id_class(id_class);
        int n3 = 29;
        if (!this.id_private.id_break()) {
            n3 += 25;
        }
        int n4 = 206;
        if (this.id_private.id_class(this.id_catch.id_class(this.id_case)).size() > 1) {
            n4 += 25;
        }
        boolean bl2 = bl = this.id_super > 0.0f;
        if (bl) {
            float f2 = 1.0f + 0.1f * (float)Math.sin(this.id_super / 15.0f * (float)Math.PI);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(this.id_volatile + 8, this.id_final + 12, 0.0f);
            RenderSystem.scalef(f2, f2, 1.0f);
            RenderSystem.translatef(-(this.id_volatile + 8), -(this.id_final + 12), 0.0f);
            this.id_super -= f;
        }
        this.id_break(ml_1, this.id_volatile, this.id_final, n3, n4, this.id_extends, this.id_native);
        List<rkw_3<?>> list = this.id_catch();
        this.id_this = rfU_2.id_protected(this.id_implements / 30.0f) % list.size();
        rdn_3 rdn_32 = list.get(this.id_this).id_byte();
        int n5 = 4;
        if (this.id_private.id_throws() && this.id_catch().size() > 1) {
            qY.id_float().id_class(rdn_32, this.id_volatile + n5 + 1, this.id_final + n5 + 1);
            --n5;
        }
        qY.id_float().id_break(rdn_32, this.id_volatile + n5, this.id_final + n5);
        if (bl) {
            RenderSystem.popMatrix();
        }
    }

    public rkw_3<?> id_throws() {
        List<rkw_3<?>> list = this.id_catch();
        return list.get(this.id_this);
    }

    private List<rkw_3<?>> id_catch() {
        List<rkw_3<?>> list = this.id_private.id_break(true);
        if (!this.id_catch.id_class(this.id_case)) {
            list.addAll(this.id_private.id_break(false));
        }
        return list;
    }

    @Override
    public int id_case() {
        return 25;
    }

    public boolean id_protected() {
        return this.id_catch().size() == 1;
    }
}

