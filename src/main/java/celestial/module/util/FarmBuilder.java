/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.util;

import celestial.C_throws;
import celestial.bW_2;
import celestial.bc_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rY_2;
import celestial.rrIQ;
import celestial.rrfu_3;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class FarmBuilder
extends Module {
    public Object[] id_break;

    public boolean id_byte(String var1) {
        this.id_goto();
        bW_2 var2 = C_throws.id_byte().id_abstract();
        String var3 = rrfu_3.id_class(this);
        if ((rY_2)this.id_break[1] == null) {
            String var10001 = "\u041d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u043e\u0431\u043b\u0430\u0441\u0442\u044c \u0444\u0435\u0440\u043c\u044b \u043a\u0440\u0438\u043f\u0435\u0440\u043e\u0432. \u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 %sfb";
            String var6 = var3 + var10001.formatted(C_throws.id_break().id_protected.id_class[0]);
            rrfu_3.id_byte(var6);
            return false;
        }
        bc_3 var4 = this.id_protected(var1);
        if (var4 == null) {
            String var5 = var3 + "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0440\u0435\u0436\u0438\u043c: " + (String)((rrIQ)this.id_break[0]).id_byte();
            rrfu_3.id_byte(var5);
            return false;
        }
        var2.id_class(var4, (rY_2)this.id_break[1]);
        return true;
    }

    public FarmBuilder() {
        super("Farm Builder", "\u041f\u043e\u043c\u043e\u0433\u0430\u0435\u0442 \u0432 \u043f\u043e\u0441\u0442\u0440\u043e\u0439\u043a\u0435 \u0444\u0435\u0440\u043c\u044b\n\u043a\u0440\u0438\u043f\u0435\u0440\u043e\u0432", Category.UTIL);
        this.id_goto();
        rrIQ var5 = (rrIQ)new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u041b\u044e\u043a\u0438", "\u041b\u044e\u043a\u0438", "\u041f\u043e\u043b\u0443\u0431\u043b\u043e\u043a\u0438").id_class("onChangeMode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            String var3;
            if (this.aJ_() && !this.id_byte(var3 = (String)var1.id_byte())) {
                this.id_byte(true);
            }
        });
        this.id_break[0] = var5;
        this.id_class((rrIQ)this.id_break[0]);
    }

    private void id_this() {
        this.id_super().id_protected();
    }

    public void id_class(rY_2 var1) {
        this.id_goto();
        this.id_break[1] = var1;
    }

    @Override
    public void id_class(boolean var1) {
        this.id_goto();
        if (!this.id_byte((String)((rrIQ)this.id_break[0]).id_byte())) {
            this.id_byte(true);
        } else {
            super.id_class(var1);
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_this();
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }

    public rY_2 id_new() {
        this.id_goto();
        return (rY_2)this.id_break[1];
    }

    private bW_2 id_super() {
        return C_throws.id_byte().id_abstract();
    }

    private bc_3 id_protected(String var1) {
        int var3 = -1;
        switch (var1.hashCode()) {
            case 192075: {
                if (!var1.equals("\u041f\u043e\u043b\u0443\u0431\u043b\u043e\u043a\u0438")) break;
                var3 = 1;
                break;
            }
            case 32403985: {
                if (!var1.equals("\u041b\u044e\u043a\u0438")) break;
                var3 = 0;
            }
        }
        return switch (var3) {
            case 0 -> (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0]);
            case 1 -> (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1]);
            default -> null;
        };
    }
}

