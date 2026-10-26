/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.util;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.rryJ;
import celestial.rryX;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class AntiAfk
extends Module {
    public Object[] id_break;

    public AntiAfk() {
        super("Anti AFK", "\u041e\u0431\u0445\u043e\u0434\u0438\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 \u0441 \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u043e\u0439 \u043d\u0430\n\u0410\u0424\u041a", Category.UTIL);
        this.id_super();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Funtime", "Funtime", "Vanilla");
        this.id_break[1] = var5;
        this.id_class((rrIQ)this.id_break[1]);
        rryJ var6 = new rryJ(this);
        this.id_break[2] = var6;
        rryX var7 = new rryX(this);
        this.id_break[3] = var7;
        rryJ var8 = (rryJ)this.id_break[2];
        this.id_break[0] = var8;
        ((rrIQ)this.id_break[1]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_super();
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aK_();
            }
            rryJ var9 = switch ((String)var2.getLeft()) {
                case "Vanilla" -> (rryJ)this.id_break[2];
                case "Funtime" -> (rryX)this.id_break[3];
                default -> null;
            };
            this.id_break[0] = var9;
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aI_();
            }
        });
    }

    @Override
    public void id_class(boolean var1) {
        super.id_class(var1);
        this.id_new().aI_();
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_new().aK_();
    }

    public rrTF<AntiAfk> id_new() {
        this.id_super();
        return (rrTF)this.id_break[0];
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
    }
}

