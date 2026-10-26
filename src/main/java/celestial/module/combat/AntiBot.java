/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.rrnR_2;
import celestial.rrnY_2;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class AntiBot
extends Module {
    public Object[] id_break;

    public AntiBot() {
        super("Anti Bot", "\u0414\u0435\u0442\u0435\u043a\u0442\u0438\u0442 \u041d\u041f\u0421/\u0431\u043e\u0442\u043e\u0432 \u043e\u0442 \u0430\u043d\u0442\u0438\u0447\u0438\u0442\u0430", Category.COMBAT);
        this.id_this();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Matrix", "Matrix", "ReallyWorld");
        this.id_break[1] = var5;
        this.id_class((rrIQ)this.id_break[1]);
        rrnR_2 var6 = new rrnR_2(this);
        this.id_break[3] = var6;
        rrnY_2 var7 = new rrnY_2(this);
        this.id_break[2] = var7;
        rrnR_2 var8 = (rrnR_2)this.id_break[3];
        this.id_break[0] = var8;
        ((rrIQ)this.id_break[1]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_this();
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aK_();
            }
            rrnY_2 var9 = switch ((String)var2.getLeft()) {
                case "ReallyWorld" -> (rrnY_2)this.id_break[2];
                case "Matrix" -> (rrnR_2)this.id_break[3];
                default -> null;
            };
            this.id_break[0] = var9;
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aI_();
            }
        });
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
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

    public rrTF<AntiBot> id_new() {
        this.id_this();
        return (rrTF)this.id_break[0];
    }
}

