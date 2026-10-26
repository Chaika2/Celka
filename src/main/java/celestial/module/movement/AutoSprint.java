/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.I;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIk_1;
import celestial.rrLX;
import celestial.setting.ButtonSetting;
import celestial.setting.GroupSetting;

public class AutoSprint
extends Module {
    public Object[] id_break;

    public AutoSprint() {
        super("Auto Sprint", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0441\u043f\u0440\u0438\u043d\u0442", Category.MOVEMENT);
        this.id_try();
        rrIk_1 var5 = new rrIk_1("\u0413\u043e\u043b\u043e\u0434", false);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0421\u043b\u0435\u043f\u043e\u0442\u0443", true);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u041f\u0440\u0438\u0441\u0435\u0434\u0430\u043d\u0438\u0435", true);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u041f\u043e\u043b\u0437\u0430\u043d\u0438\u0435", true);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", true);
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0413\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u0443\u044e \u043a\u043e\u043b\u043b\u0438\u0437\u0438\u044e", true);
        this.id_break[5] = var10;
        ButtonSetting b1 = new ButtonSetting(this, "SpookyTime", () -> {
            this.id_try();
            ((rrIk_1)this.id_break[0]).id_class(false, false, true);
            ((rrIk_1)this.id_break[1]).id_class(true, false, true);
            ((rrIk_1)this.id_break[2]).id_class(true, false, true);
            ((rrIk_1)this.id_break[3]).id_class(true, false, true);
            ((rrIk_1)this.id_break[4]).id_class(true, false, true);
            ((rrIk_1)this.id_break[5]).id_class(true, false, true);
        });
        ButtonSetting b2 = new ButtonSetting(this, "Funtime", () -> {
            this.id_try();
            ((rrIk_1)this.id_break[0]).id_class(false, false, true);
            ((rrIk_1)this.id_break[1]).id_class(true, false, true);
            ((rrIk_1)this.id_break[2]).id_class(true, false, true);
            ((rrIk_1)this.id_break[3]).id_class(true, false, true);
            ((rrIk_1)this.id_break[4]).id_class(true, false, true);
            ((rrIk_1)this.id_break[5]).id_class(true, false, true);
        });
        ButtonSetting b3 = new ButtonSetting(this, "Grim", () -> {
            this.id_try();
            ((rrIk_1)this.id_break[0]).id_class(false, false, true);
            ((rrIk_1)this.id_break[1]).id_class(false, false, true);
            ((rrIk_1)this.id_break[2]).id_class(false, false, true);
            ((rrIk_1)this.id_break[3]).id_class(false, false, true);
            ((rrIk_1)this.id_break[4]).id_class(false, false, true);
            ((rrIk_1)this.id_break[5]).id_class(false, false, true);
        });
        this.id_class(new GroupSetting("\u0410\u0432\u0442\u043e. \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438", b1, b2, b3), new GroupSetting("\u0418\u0433\u043d\u043e\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5]));
    }

    public boolean id_this() {
        this.id_try();
        return this.aJ_() && ((rrIk_1)this.id_break[2]).id_class() != false;
    }

    @EventTarget
    public void id_class(I var1) {
        var1.id_class(true);
    }

    @EventTarget
    public void id_class(rrLX var1) {
        this.id_try();
        if (((rrIk_1)this.id_break[5]).id_class().booleanValue()) {
            var1.id_break(false);
        }
    }

    public boolean id_continue() {
        this.id_try();
        return this.aJ_() && ((rrIk_1)this.id_break[1]).id_class() != false;
    }

    public boolean id_else() {
        this.id_try();
        return this.aJ_() && ((rrIk_1)this.id_break[0]).id_class() != false;
    }

    public boolean id_new() {
        this.id_try();
        return this.aJ_() && ((rrIk_1)this.id_break[4]).id_class() != false;
    }

    public boolean id_super() {
        this.id_try();
        return this.aJ_() && ((rrIk_1)this.id_break[3]).id_class() != false;
    }

    private void id_try() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }
}

