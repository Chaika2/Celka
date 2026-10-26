/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.C_throws;
import celestial.PI;
import celestial.PK;
import celestial.Pf_1;
import celestial.Po_1;
import celestial.SF;
import celestial.SL;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rql_3;
import celestial.rrFK;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrlQ_2;

public class AutoReconnect
extends Module {
    public Object[] id_break;
    private static long[] id_throws = new long[2];

    public AutoReconnect() {
        super("Auto Reconnect", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0438\u0442 \u043d\u0430\n\u043f\u043e\u0441\u043b\u0435\u0434\u043d\u0438\u0439 \u0438\u0433\u0440\u043e\u0432\u043e\u0439 \u0440\u0435\u0436\u0438\u043c", Category.PLAYER);
        this.id_continue();
    }

    private void id_this() {
        this.id_continue();
        PI var1 = C_throws.id_byte().id_native().id_protected();
        if (var1 != null) {
            Pf_1 var2 = var1.id_class();
            if (var2.id_break()) {
                this.id_break[0] = var2.id_class() + var1.id_break();
            } else if (!rql_3.id_break((String)this.id_break[0]) && (Integer)((cb_3)AutoReconnect.id_import.id_class[57]).id_throws[41] != 0 && (Integer)((cb_3)AutoReconnect.id_import.id_class[57]).id_throws[41] % 20 == 0) {
                ((cb_3)AutoReconnect.id_import.id_class[57]).id_case("/" + (String)this.id_break[0]);
            }
        }
    }

    private void id_class(SL var1) {
        this.id_continue();
        String var2 = C_throws.id_byte().id_final().id_throws();
        if (!rql_3.id_break(var2)) {
            this.id_break[0] = var2;
        } else if (!rql_3.id_break((String)this.id_break[0])) {
            var1.id_class(new SF((String)this.id_break[0], id_throws[1]));
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if ((rrfq_3)((Object)rrfp_3.id_class[1]) == null) {
                return;
            }
            SL var2 = C_throws.id_byte().id_default();
            if (var2.id_throws()) {
                return;
            }
            switch (((int[])rrlQ_2.id_class[0])[((rrfq_3)((Object)rrfp_3.id_class[1])).ordinal()]) {
                case 1: 
                case 2: {
                    this.id_this();
                    break;
                }
                case 3: {
                    this.id_break(var2);
                    break;
                }
                case 4: {
                    this.id_class(var2);
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_continue();
        Object var6 = null;
        this.id_break[0] = var6;
    }

    private void id_break(SL var1) {
        this.id_continue();
        Po_1 var2 = C_throws.id_byte().P().id_break();
        if (var2 != null) {
            PK var3 = var2.id_break();
            if (var3.id_break()) {
                this.id_break[0] = var3.id_class() + var2.id_class();
            } else if (!rql_3.id_break((String)this.id_break[0])) {
                var1.id_class(new SF((String)this.id_break[0], id_throws[0]));
            }
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_continue();
        super.id_throws(var1);
        Object var6 = null;
        this.id_break[0] = var6;
    }

    private void id_continue() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    private static void id_else() {
        id_throws = new long[2];
    }
}

