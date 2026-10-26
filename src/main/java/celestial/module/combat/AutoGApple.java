/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.Qw_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rpD_2;
import celestial.rrAC;
import celestial.rrAR;
import celestial.rrAm_1;
import celestial.rrIm_1;
import celestial.rrfH_2;

public class AutoGApple
extends Module {
    public Object[] id_break;

    public AutoGApple() {
        super("Auto GApple", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0435\u0441\u0442 \u0437\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e\n\u043f\u0440\u0438 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0451\u043d\u043d\u043e\u043c \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435", Category.COMBAT);
        this.id_new();
        rrIm_1 var5 = new rrIm_1("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", Float.valueOf(15.0f), Float.valueOf(5.0f), Float.valueOf(20.0f), Float.valueOf(0.5f));
        this.id_break[2] = var5;
        this.id_class((rrIm_1)this.id_break[2]);
    }

    @EventTarget
    public void id_class(rrAm_1 var1) {
        this.id_new();
        if (((Boolean)this.id_break[0]).booleanValue() || ((Boolean)this.id_break[1]).booleanValue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrAR var1) {
        this.id_new();
        if (((Boolean)this.id_break[0]).booleanValue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrAC var1) {
        this.id_new();
        if (var1.id_break() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((Boolean)this.id_break[0]).booleanValue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_new();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            cb_3 var10;
            rdb_3[] items;
            rpD_2 var10000;
            this.id_break[1] = false;
            if (((cb_3)AutoGApple.id_import.id_class[57]).Ss() <= ((Float)((rrIm_1)this.id_break[2]).id_byte()).floatValue() && !(var10000 = ((cb_3)AutoGApple.id_import.id_class[57]).sK()).id_class(items = new rdb_3[]{rdy_3.hy, rdy_3.hp}) && rrfH_2.id_class((iB_2)(var10 = (cb_3)AutoGApple.id_import.id_class[57]), items) != null) {
                ((Qw_1)AutoGApple.id_import.id_class[20]).u.id_class(true);
                this.id_break[0] = true;
                return;
            }
            if (((Boolean)this.id_break[0]).booleanValue()) {
                ((Qw_1)AutoGApple.id_import.id_class[20]).u.id_class(false);
                this.id_break[0] = false;
                this.id_break[1] = true;
            }
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_new();
        super.id_throws(var1);
        this.id_break[1] = false;
        if (((Boolean)this.id_break[0]).booleanValue()) {
            if (((Qw_1)AutoGApple.id_import.id_class[20]).u.id_protected()) {
                ((Qw_1)AutoGApple.id_import.id_class[20]).u.id_class(false);
            }
            this.id_break[0] = false;
        }
    }

    private void id_new() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
            this.id_break[0] = false;
            this.id_break[1] = false;
        }
    }
}

