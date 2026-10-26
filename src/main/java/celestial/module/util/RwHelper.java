/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rdn_3;
import celestial.rhx_3;
import celestial.rmj_3;
import celestial.rrAR;
import celestial.rrAt_1;
import celestial.rrAw_1;
import celestial.rrFI;
import celestial.rrFK;
import celestial.rrFw_1;
import celestial.rrHa_1;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLu_1;
import celestial.rrLz_1;
import celestial.rrfj_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjQ_2;
import celestial.ruS_2;
import celestial.rvp_3;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RwHelper
extends Module {
    public Object[] id_break;

    public RwHelper() {
        super("RW Helper", "\u0423\u0442\u0438\u043b\u0438\u0442\u0430\u0440\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f\nReallyWorld", Category.UTIL);
        CopyOnWriteArrayList var11;
        this.id_super();
        rrIk_1 var5 = new rrIk_1("\u0424\u043b\u0430\u0439 \u043d\u0430 \u0434\u0440\u0430\u0433\u043e\u043d\u0435", true);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0417\u0430\u043a\u0440\u044b\u0442\u0438\u0435 \u043c\u0435\u043d\u044e", true);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u041d\u0435 \u0441\u0442\u0430\u0432\u0438\u0442\u044c \u0448\u0430\u0440\u044b", true);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0410\u0432\u0442\u043e. \u043f\u043e\u043b\u0451\u0442", true);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0410\u0432\u0442\u043e. \u043f\u043e\u0447\u0438\u043d\u043a\u0430", true);
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0410\u0432\u0442\u043e. \u0438\u0441\u0446\u0435\u043b\u0435\u043d\u0438\u0435", true);
        this.id_break[5] = var10;
        this.id_break[6] = var11 = new CopyOnWriteArrayList();
        this.id_class(new rrIc_1("\u0423\u0442\u0438\u043b\u0438\u0442\u044b", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2]), new rrIc_1("\u041f\u043e\u0441\u043b\u0435 \u041f\u0412\u041f", (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[3]));
    }

    @EventTarget
    public void id_class(rrFw_1 var1) {
        if (var1.id_class() == (rrFI)((Object)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1])) {
            this.id_while();
        }
    }

    @EventTarget
    public void id_class(rrAR var1) {
        rdn_3 var2;
        this.id_super();
        if (((rrIk_1)this.id_break[2]).id_class().booleanValue() && rrjQ_2.id_class(var2 = var1.id_class())) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_super();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (((rrIk_1)this.id_break[0]).id_class().booleanValue() && ((Boolean)this.id_break[7]).booleanValue()) {
                if (!((rhx_3)((cb_3)RwHelper.id_import.id_class[57]).id_implements[18]).id_break) {
                    this.id_break[8] = (Integer)this.id_break[8] + 1;
                }
                if ((Integer)this.id_break[8] > 10) {
                    ((cb_3)RwHelper.id_import.id_class[57]).G();
                    this.id_new();
                }
            }
            for (rrHa_1 var3 : (List)this.id_break[6]) {
                if (System.currentTimeMillis() - ((Ax_1)RwHelper.id_import.id_class[55]).id_byte <= 1000L || !((cb_3)RwHelper.id_import.id_class[57]).id_protected(var3.id_class())) continue;
                ((List)this.id_break[6]).remove(var3);
            }
        }
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_super();
        ((List)this.id_break[6]).clear();
    }

    @EventTarget
    public void id_class(rrAt_1 var1) {
        this.id_super();
        if (((rrIk_1)this.id_break[0]).id_class().booleanValue() && var1.id_class() == (rrAw_1)((Object)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[1])) {
            var1.id_class(true);
            this.id_break[7] = true;
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        this.id_super();
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rvp_3) {
            String var4;
            rvp_3 var2 = (rvp_3)ruS_22;
            if (((rrIk_1)this.id_break[1]).id_class().booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) && ((var4 = var2.id_protected().id_byte()).equals("\ua201\ua000\ua202\ua301\ua202\ua001\ua203\ua100") || var4.equals("\u041c\u0435\u043d\u044e"))) {
                var1.id_class(true);
                ((Aq_1)((cb_3)RwHelper.id_import.id_class[57]).id_break[0]).id_break(new rmj_3(var2.id_break()));
            }
        }
    }

    @EventTarget
    public void id_class(rrLz_1 var1) {
        this.id_super();
        if (((rrIk_1)this.id_break[0]).id_class().booleanValue() && ((rhx_3)((cb_3)RwHelper.id_import.id_class[57]).id_implements[18]).id_break) {
            float var2 = rrfj_3.id_class();
            boolean var3 = rrfj_3.id_catch();
            boolean var4 = var2 != 0.0f;
            float var5 = var3 && var4 ? 1.061f : 1.199f;
            float var6 = var3 ? 0.56f : 1.199f;
            var1.id_class(var5);
            var1.id_catch().id_byte = var2 * var6;
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_new();
    }

    private void id_new() {
        this.id_super();
        this.id_break[7] = false;
        this.id_break[8] = 0;
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[9];
            this.id_break[7] = false;
            this.id_break[8] = 0;
        }
    }

    private void id_while() {
        this.id_super();
        ((List)this.id_break[6]).clear();
        if (((rrIk_1)this.id_break[3]).id_class().booleanValue()) {
            ((List)this.id_break[6]).add(new rrHa_1("/fly"));
        }
        if (((rrIk_1)this.id_break[4]).id_class().booleanValue()) {
            ((List)this.id_break[6]).add(new rrHa_1("/fix all"));
        }
        if (((rrIk_1)this.id_break[5]).id_class().booleanValue()) {
            ((List)this.id_break[6]).add(new rrHa_1("/heal"));
        }
    }
}

