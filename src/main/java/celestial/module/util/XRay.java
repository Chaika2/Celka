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
import celestial.rrIm_1;
import celestial.rrqN_2;
import celestial.rrqQ_2;
import celestial.rrqZ_2;
import celestial.rrqd_3;
import celestial.rrqm_3;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class XRay<T extends rrqN_2>
extends Module
implements rrqd_3 {
    public Object[] id_break;

    public XRay() {
        super("X-Ray", "WallHack \u043d\u0430 \u0431\u043b\u043e\u043a\u0438 \u0434\u043b\u044f \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u0432 \u0441\n\u0441\u0438\u043b\u044c\u043d\u044b\u043c \u0430\u043d\u0442\u0438\u0447\u0438\u0442\u043e\u043c", Category.UTIL);
        this.id_goto();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Default", "Default", "Ancient");
        this.id_break[3] = var5;
        rrIm_1 var6 = new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441 \u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", Float.valueOf(16.0f), Float.valueOf(6.0f), Float.valueOf(64.0f), Float.valueOf(1.0f));
        this.id_break[4] = var6;
        rrIm_1 var7 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", Float.valueOf(20.0f), Float.valueOf(1.0f), Float.valueOf(30.0f), Float.valueOf(1.0f));
        this.id_break[5] = var7;
        this.id_break[6] = true;
        rrqm_3 var9 = new rrqm_3(this);
        this.id_break[0] = var9;
        rrqZ_2 var10 = new rrqZ_2(this);
        this.id_break[1] = var10;
        rrqm_3 var11 = (rrqm_3)this.id_break[0];
        this.id_break[2] = var11;
        ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break(this);
        ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break((rrqN_2)this.id_break[2]);
        ((rrIQ)this.id_break[3]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_goto();
            if ((rrqN_2)this.id_break[2] != null && this.aJ_()) {
                ((rrqN_2)this.id_break[2]).aK_();
            }
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_class((rrqN_2)this.id_break[2]);
            rrqm_3 var9x = switch ((String)var2.getLeft()) {
                case "Default" -> (rrqm_3)this.id_break[0];
                case "Ancient" -> (rrqZ_2)this.id_break[1];
                default -> null;
            };
            this.id_break[2] = var9x;
            if ((rrqN_2)this.id_break[2] != null && this.aJ_()) {
                ((rrqN_2)this.id_break[2]).aI_();
            }
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break((rrqN_2)this.id_break[2]);
        });
        ((rrIm_1)this.id_break[4]).id_class(() -> {
            this.id_goto();
            return (rrqN_2)this.id_break[2] == (rrqm_3)this.id_break[0];
        });
        ((rrIm_1)this.id_break[5]).id_class(() -> {
            this.id_goto();
            return (rrqN_2)this.id_break[2] == (rrqm_3)this.id_break[0];
        });
        this.id_class((rrIQ)this.id_break[3], (rrIm_1)this.id_break[4], (rrIm_1)this.id_break[5]);
    }

    public rrIQ id_this() {
        this.id_goto();
        return (rrIQ)this.id_break[3];
    }

    @Override
    public void id_class(boolean var1) {
        this.id_goto();
        if (((rrqN_2)this.id_break[2]).aI_()) {
            super.id_class(var1);
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_goto();
        super.id_throws(var1);
        ((rrqN_2)this.id_break[2]).aK_();
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
            this.id_break[6] = false;
        }
    }

    public void id_case(boolean var1) {
        this.id_goto();
        this.id_break[6] = var1;
    }

    public boolean id_continue() {
        this.id_goto();
        return (Boolean)this.id_break[6];
    }

    public rrIm_1 id_else() {
        this.id_goto();
        return (rrIm_1)this.id_break[4];
    }

    public rrIm_1 id_new() {
        this.id_goto();
        return (rrIm_1)this.id_break[5];
    }

    public rrqZ_2 id_return() {
        this.id_goto();
        return (rrqZ_2)this.id_break[1];
    }

    public T id_super() {
        this.id_goto();
        return (T)((rrqN_2)this.id_break[2]);
    }

    public rrqm_3 id_public() {
        this.id_goto();
        return (rrqm_3)this.id_break[0];
    }
}

