/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.render;

import celestial.aI_2;
import celestial.an_3;
import celestial.cb_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.setting.Setting;
import celestial.yX_2;
import org.apache.commons.lang3.tuple.Pair;

public class NoRender
extends Module {
    public Object[] id_break;

    public NoRender() {
        super("No Render", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u043d\u0435\u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b\n\u0438\u0433\u0440\u044b", Category.RENDER);
        this.id_try();
        rrIk_1 var5 = new rrIk_1("\u042d\u0444\u0444\u0435\u043a\u0442 \u0442\u043e\u0442\u0435\u043c\u0430", true);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0418\u0433\u0440\u043e\u043a\u043e\u0432", false);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0417\u0430\u0433\u043e\u043b\u043e\u0432\u043a\u0438", false);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0411\u043e\u0441\u0441 \u0431\u0430\u0440", false);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0421\u043a\u043e\u0440\u0431\u043e\u0440\u0434", false);
        this.id_break[4] = var9;
        rrIk_1 var10 = (rrIk_1)new rrIk_1("\u041b\u0430\u0432\u0443/\u0412\u043e\u0434\u0443", false).id_class("fluids", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            if (this.aJ_()) {
                ((yX_2)NoRender.id_import.id_class[8]).id_throws();
            }
        });
        this.id_break[5] = var10;
        this.id_class(new rrIc_1("\u0423\u0431\u0438\u0440\u0430\u0442\u044c", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[5]));
    }

    public boolean id_this() {
        this.id_try();
        return this.id_class((rrIk_1)this.id_break[4]);
    }

    public boolean id_class(rrIk_1 var1) {
        return !this.aJ_() || var1.id_class() == false;
    }

    public boolean id_class(an_3 var1) {
        this.id_try();
        if (var1 == (cb_3)NoRender.id_import.id_class[57]) {
            return true;
        }
        return var1.BC() != aI_2.rM || this.id_class((rrIk_1)this.id_break[1]);
    }

    @Override
    public void id_class(boolean var1) {
        super.id_class(var1);
        ((yX_2)NoRender.id_import.id_class[8]).id_throws();
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        ((yX_2)NoRender.id_import.id_class[8]).id_throws();
    }

    public boolean id_continue() {
        this.id_try();
        return this.id_class((rrIk_1)this.id_break[3]);
    }

    public boolean id_else() {
        this.id_try();
        return this.id_class((rrIk_1)this.id_break[5]);
    }

    public boolean id_new() {
        this.id_try();
        return this.id_class((rrIk_1)this.id_break[2]);
    }

    public boolean id_super() {
        this.id_try();
        return this.id_class((rrIk_1)this.id_break[0]);
    }

    private void id_try() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }
}

