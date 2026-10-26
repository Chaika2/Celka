/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.util;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIF;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.rryC;
import celestial.rryy_1;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class ClickPearl
extends Module {
    public Object[] id_break;

    public ClickPearl() {
        super("Click Pearl", "\u0411\u0440\u043e\u0441\u0430\u0435\u0442 \u044d\u043d\u0434\u0435\u0440-\u043f\u0451\u0440\u043b \u043d\u0430 \u043a\u043b\u0430\u0432\u0438\u0448\u0443", Category.UTIL);
        this.id_return();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Vanilla", "Vanilla", "HolyWorld");
        this.id_break[0] = var5;
        rrIF var6 = new rrIF("\u041a\u043b\u0430\u0432\u0438\u0448\u0430", KeyBind.get(3));
        this.id_break[1] = var6;
        this.id_class((rrIQ)this.id_break[0], (rrIF)this.id_break[1]);
        rryy_1 var7 = new rryy_1(this);
        this.id_break[3] = var7;
        rryC var8 = new rryC(this);
        this.id_break[4] = var8;
        rryy_1 var9 = (rryy_1)this.id_break[3];
        this.id_break[2] = var9;
        ((rrIQ)this.id_break[0]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_return();
            if ((rrTF)this.id_break[2] != null && this.aJ_()) {
                ((rrTF)this.id_break[2]).aK_();
            }
            rryy_1 var9x = switch ((String)var2.getLeft()) {
                case "Vanilla" -> (rryy_1)this.id_break[3];
                case "HolyWorld" -> (rryC)this.id_break[4];
                default -> null;
            };
            this.id_break[2] = var9x;
            if ((rrTF)this.id_break[2] != null && this.aJ_()) {
                ((rrTF)this.id_break[2]).aI_();
            }
        });
    }

    @Override
    public void id_class(boolean var1) {
        this.id_return();
        super.id_class(var1);
        ((rrTF)this.id_break[2]).aI_();
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_return();
        super.id_throws(var1);
        ((rrTF)this.id_break[2]).aK_();
    }

    public rrIF id_continue() {
        this.id_return();
        return (rrIF)this.id_break[1];
    }

    public rrTF<ClickPearl> id_new() {
        this.id_return();
        return (rrTF)this.id_break[2];
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[5];
        }
    }
}

