/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.movement;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.rrlM_2;
import celestial.rrlO_2;
import celestial.rrlb_3;
import celestial.rrnZ_2;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class Spider
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public Spider() {
        super("Spider", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u0437\u0431\u0438\u0440\u0430\u0442\u044c\u0441\u044f \u043f\u043e \u0441\u0442\u0435\u043d\u0430\u043c", Category.MOVEMENT);
        this.id_else();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Grim", "Grim", "Matrix", "Funtime");
        this.id_break[1] = var5;
        this.id_class((rrIQ)this.id_break[1]);
        rrlM_2 var6 = new rrlM_2(this);
        this.id_break[2] = var6;
        rrlO_2 var7 = new rrlO_2(this);
        this.id_break[3] = var7;
        rrlb_3 var8 = new rrlb_3(this);
        this.id_break[4] = var8;
        rrlM_2 var9 = (rrlM_2)this.id_break[2];
        this.id_break[0] = var9;
        ((rrIQ)this.id_break[1]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_else();
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aK_();
            }
            rrlM_2 var9x = switch ((String)var2.getLeft()) {
                case "Grim" -> (rrlM_2)this.id_break[2];
                case "Matrix" -> (rrlO_2)this.id_break[3];
                case "Funtime" -> (rrlb_3)this.id_break[4];
                default -> null;
            };
            this.id_break[0] = var9x;
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aI_();
            }
        });
    }

    @Override
    public void id_class() {
        this.id_protected(false);
        this.id_new().aK_();
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

    public rrlM_2 id_continue() {
        this.id_else();
        return (rrlM_2)this.id_break[2];
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[5];
        }
    }

    public rrTF<Spider> id_new() {
        this.id_else();
        return (rrTF)this.id_break[0];
    }
}

