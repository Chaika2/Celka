/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrFK;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.rryA;
import celestial.rryQ;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class AutoDuel
extends Module {
    public Object[] id_break;

    public AutoDuel() {
        super("Auto Duel", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043d\u0430\u0445\u043e\u0434\u0438\u0442 \u0434\u0443\u044d\u043b\u0438", Category.UTIL);
        this.id_return();
        rrIQ var5 = new rrIQ("\u0421\u0435\u0440\u0432\u0435\u0440", "Funtime", "Funtime", "ReallyWorld");
        this.id_break[0] = var5;
        this.id_class((rrIQ)this.id_break[0]);
        rryQ var6 = new rryQ(this);
        this.id_break[1] = var6;
        rryA var7 = new rryA(this);
        this.id_break[2] = var7;
        rryQ var8 = (rryQ)this.id_break[1];
        this.id_break[3] = var8;
        ((rrIQ)this.id_break[0]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_return();
            if ((rrTF)this.id_break[3] != null && this.aJ_()) {
                ((rrTF)this.id_break[3]).aK_();
            }
            rryQ var9 = switch ((String)var2.getLeft()) {
                case "Funtime" -> (rryQ)this.id_break[1];
                case "ReallyWorld" -> (rryA)this.id_break[2];
                default -> null;
            };
            this.id_break[3] = var9;
            if ((rrTF)this.id_break[3] != null && this.aJ_()) {
                ((rrTF)this.id_break[3]).aI_();
            }
        });
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_byte(false);
    }

    @Override
    public void id_class(boolean var1) {
        if (this.id_new().aI_()) {
            super.id_class(var1);
        }
    }

    @Override
    public void id_throws(boolean var1) {
        if (this.id_new().aK_()) {
            super.id_throws(var1);
        }
    }

    public rrTF<AutoDuel> id_new() {
        this.id_return();
        return (rrTF)this.id_break[3];
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
    }
}

