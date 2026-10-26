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
import celestial.rrlB_2;
import celestial.rrlE_2;
import celestial.rrlS_2;
import celestial.rrls_3;
import celestial.rrnZ_2;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class Speed
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public Speed() {
        super("Speed", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430", Category.MOVEMENT);
        this.id_continue();
        String var10004 = "\u0420\u0435\u0436\u0438\u043c";
        String var10005 = "Vanilla";
        rrIQ var5 = this.id_class(new rrIQ(var10004, var10005, "Vanilla", "Collision", "Matrix", "Grim"));
        this.id_break[1] = var5;
        rrlB_2 var6 = new rrlB_2(this);
        this.id_break[2] = var6;
        rrls_3 var7 = new rrls_3(this);
        this.id_break[3] = var7;
        rrlS_2 var8 = new rrlS_2(this);
        this.id_break[4] = var8;
        rrlE_2 var9 = new rrlE_2(this);
        this.id_break[5] = var9;
        rrlE_2 var10 = (rrlE_2)this.id_break[5];
        this.id_break[0] = var10;
        ((rrIQ)this.id_break[1]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_continue();
            if ((rrTF)this.id_break[0] != null && this.aJ_()) {
                ((rrTF)this.id_break[0]).aK_();
            }
            rrlE_2 var9x = switch ((String)var2.getLeft()) {
                case "Vanilla" -> (rrlE_2)this.id_break[5];
                case "Collision" -> (rrlB_2)this.id_break[2];
                case "Matrix" -> (rrls_3)this.id_break[3];
                case "Grim" -> (rrlS_2)this.id_break[4];
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
        this.id_byte(false);
        rrTF<Speed> var1 = this.id_new();
        var1.aK_();
        var1.id_super();
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

    private void id_continue() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }

    public rrTF<Speed> id_new() {
        this.id_continue();
        return (rrTF)this.id_break[0];
    }
}

