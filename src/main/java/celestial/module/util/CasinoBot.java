/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.C_throws;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rql_3;
import celestial.rrHL;
import celestial.rrLO;
import celestial.rrfw_3;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CasinoBot
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    private boolean id_byte(String var1) {
        return var1.startsWith("[$]") && var1.contains("\u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043e \u043e\u0442 \u0438\u0433\u0440\u043e\u043a\u0430");
    }

    public CasinoBot() {
        super("Casino", "Test", Category.UTIL);
        CopyOnWriteArrayList var6;
        this.id_this();
        rrfw_3 var5 = new rrfw_3();
        this.id_break[0] = var5;
        this.id_break[1] = var6 = new CopyOnWriteArrayList();
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_this();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (((rrfw_3)this.id_break[0]).id_class(32000.0)) {
                cb_3 var10000 = (cb_3)CasinoBot.id_import.id_class[57];
                String var10001 = "!\u041f\u0440\u0438\u0432\u0435\u0442! \u042f - \u0432\u0430\u0448 \u043b\u0438\u0447\u043d\u044b\u0439 \u043a\u0430\u0437\u0438\u043d\u043e \u0431\u043e\u0442. \u041f\u043e\u043f\u0440\u043e\u0431\u0443\u0439\u0442\u0435 \u0441\u0432\u043e\u044e \u0443\u0434\u0430\u0447\u0443 \u0438 \u043e\u0442\u043f\u0440\u0430\u0432\u044c\u0442\u0435 \u043c\u043d\u0435 \u0434\u0435\u043d\u044c\u0433\u0438 %s. \u0412\u0437\u0430\u043c\u0435\u043d, \u044f \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u044e \u0432\u0430\u043c \u0441\u0443\u043c\u043c\u0443, \u0443\u043c\u043d\u043e\u0436\u0435\u043d\u043d\u0443\u044e \u043d\u0430 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0435 \u0447\u0438\u0441\u043b\u043e \u043e\u0442 0 \u0434\u043e 3. \u041c\u043e\u0439 \u0442\u0435\u043a\u0443\u0449\u0438\u0439 \u0431\u0430\u043b\u0430\u043d\u0441 - %s \u043c\u043e\u043d\u0435\u0442, \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0438\u0433\u0440: " + (Integer)id_byte[3];
                var10000.id_protected(String.format(var10001, "/pay " + ((cb_3)CasinoBot.id_import.id_class[57]).sv().getName() + " \u0441\u0443\u043c\u043c\u0430", rql_3.id_class((Number)this.id_else(), ' ')));
                ((rrfw_3)this.id_break[0]).id_class();
            }
            if (((List)this.id_break[1]).isEmpty()) {
                return;
            }
            rrHL var2 = (rrHL)((List)this.id_break[1]).get(0);
            if (var2.id_protected()) {
                ((List)this.id_break[1]).remove(false);
            }
        }
    }

    @EventTarget
    public void id_class(rrLO var1) {
        this.id_this();
        String var2 = var1.id_protected();
        if (this.id_byte(var2)) {
            Matcher var3 = ((Pattern)id_byte[1]).matcher(var2);
            Matcher var4 = ((Pattern)id_byte[0]).matcher(var2);
            if (var3.find() && var4.find()) {
                int var5 = Float.valueOf(var3.group(0).replace(",", "").substring(1)).intValue();
                String var6 = var4.group(1);
                if (var5 >= 2000) {
                    ((List)this.id_break[1]).add(new rrHL(this, var5, var6, new rrfw_3()));
                } else {
                    cb_3 var10000 = (cb_3)CasinoBot.id_import.id_class[57];
                    String var10001 = "/m %s %s";
                    Object[] var10002 = new Object[2];
                    var10002[0] = var6;
                    int var10004 = 1;
                    String var10005 = "\u041c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u0442\u0430\u0432\u043a\u0430 \u043e\u0442 %s$";
                    var10002[var10004] = String.format(var10005, 2000);
                    var10000.id_protected(String.format(var10001, var10002));
                }
            }
        }
    }

    long id_else() {
        return C_throws.id_byte().id_native().id_byte();
    }

    static {
        Object[] var0 = new Object[]{Pattern.compile("\\s([a-zA-Z0-9_]+)"), Pattern.compile("\\$[0-9,]+"), 2000, 0};
        id_byte = var0;
    }
}

