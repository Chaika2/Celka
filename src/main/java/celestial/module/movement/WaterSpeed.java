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
import celestial.rrld_3;
import celestial.rrlx_3;
import celestial.rrnZ_2;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class WaterSpeed
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public WaterSpeed() {
        super("Water Speed", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0432 \u0432\u043e\u0434\u0435", Category.MOVEMENT);
        this.id_this();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Funtime", "Funtime", "Vulcan");
        this.id_break[0] = var5;
        this.id_class((rrIQ)this.id_break[0]);
        rrlx_3 var6 = new rrlx_3(this);
        this.id_break[1] = var6;
        rrld_3 var7 = new rrld_3(this);
        this.id_break[2] = var7;
        rrlx_3 var8 = (rrlx_3)this.id_break[1];
        this.id_break[3] = var8;
        ((rrIQ)this.id_break[0]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_this();
            if ((rrTF)this.id_break[3] != null && this.aJ_()) {
                ((rrTF)this.id_break[3]).aK_();
            }
            rrlx_3 var9 = switch ((String)var2.getLeft()) {
                case "Funtime" -> (rrlx_3)this.id_break[1];
                case "Vulcan" -> (rrld_3)this.id_break[2];
                default -> null;
            };
            this.id_break[3] = var9;
            if ((rrTF)this.id_break[3] != null && this.aJ_()) {
                ((rrTF)this.id_break[3]).aI_();
            }
        });
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
    }

    @Override
    public void id_class() {
        this.id_byte(false);
        this.id_new().id_super();
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

    public rrTF<WaterSpeed> id_new() {
        this.id_this();
        return (rrTF)this.id_break[3];
    }
}

