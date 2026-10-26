/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.movement;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrCa_1;
import celestial.rrCe_1;
import celestial.rrCi_1;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.rrlr_3;
import celestial.rrnZ_2;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class NoSlow
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public NoSlow() {
        super("No Slow", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u043f\u0440\u0438\n\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", Category.MOVEMENT);
        this.id_this();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Funtime", "Funtime", "SpookyTime", "ReallyWorld", "Vanilla");
        this.id_break[0] = var5;
        this.id_class((rrIQ)this.id_break[0]);
        rrlr_3 var6 = new rrlr_3(this);
        this.id_break[2] = var6;
        rrCe_1 var7 = new rrCe_1(this);
        this.id_break[3] = var7;
        rrCi_1 var8 = new rrCi_1(this);
        this.id_break[4] = var8;
        rrCa_1 var9 = new rrCa_1(this);
        this.id_break[5] = var9;
        rrCe_1 var10 = (rrCe_1)this.id_break[3];
        this.id_break[1] = var10;
        ((rrIQ)this.id_break[0]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_this();
            if ((rrTF)this.id_break[1] != null && this.aJ_()) {
                ((rrTF)this.id_break[1]).aK_();
            }
            rrCe_1 var9x = switch ((String)var2.getLeft()) {
                case "Funtime" -> (rrCe_1)this.id_break[3];
                case "Vanilla" -> (rrlr_3)this.id_break[2];
                case "SpookyTime" -> (rrCi_1)this.id_break[4];
                case "ReallyWorld" -> (rrCa_1)this.id_break[5];
                default -> null;
            };
            this.id_break[1] = var9x;
            if ((rrTF)this.id_break[1] != null && this.aJ_()) {
                ((rrTF)this.id_break[1]).aI_();
            }
        });
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }

    @Override
    public void id_class(boolean var1) {
        super.id_class(var1);
        this.id_new().aI_();
    }

    @Override
    public void id_class() {
        this.id_byte(false);
        this.id_new().id_super();
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_new().aK_();
    }

    public rrTF<NoSlow> id_new() {
        this.id_this();
        return (rrTF)this.id_break[1];
    }
}

