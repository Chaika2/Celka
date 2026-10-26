/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrCI;
import celestial.rrCf_1;
import celestial.rrCt_1;
import celestial.rrCw_1;
import celestial.rrIQ;
import celestial.rrTF;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class Velocity
extends Module {
    public Object[] id_break;

    public Velocity() {
        super("Velocity", "\u0420\u0435\u0434\u0430\u043a\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0448\u0435 \u043e\u0442\u043a\u0438\u0434\u044b\u0432\u0430\u043d\u0438\u0435", Category.COMBAT);
        rrIQ var5 = (rrIQ)this.id_class(new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Vanilla", "Vanilla", "Custom", "Jump", "JumpReset")).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_continue();
            if ((rrTF)this.id_break[5] != null && this.aJ_()) {
                ((rrTF)this.id_break[5]).aK_();
            }
            rrCf_1 var9x = switch ((String)var2.getLeft()) {
                case "Vanilla" -> (rrCf_1)this.id_break[1];
                case "Jump" -> (rrCI)this.id_break[3];
                case "Custom" -> (rrCt_1)this.id_break[2];
                case "JumpReset" -> (rrCw_1)this.id_break[4];
                default -> null;
            };
            this.id_break[5] = var9x;
            if ((rrTF)this.id_break[5] != null && this.aJ_()) {
                ((rrTF)this.id_break[5]).aI_();
            }
        });
        this.id_break[0] = var5;
        rrCf_1 var6 = new rrCf_1(this);
        this.id_break[1] = var6;
        rrCt_1 var7 = new rrCt_1(this);
        this.id_break[2] = var7;
        rrCI var8 = new rrCI(this);
        this.id_break[3] = var8;
        rrCw_1 var9 = new rrCw_1(this);
        this.id_break[4] = var9;
        rrCf_1 var10 = (rrCf_1)this.id_break[1];
        this.id_break[5] = var10;
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

    public rrTF<Velocity> id_new() {
        this.id_continue();
        return (rrTF)this.id_break[5];
    }
}

