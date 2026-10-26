/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rFm_1;
import celestial.rFu_1;
import celestial.rgP_2;
import celestial.rql_3;
import celestial.rrHc_1;
import celestial.rrIv_1;
import celestial.rrLO;
import celestial.rrLu_1;
import celestial.rrtR_2;
import celestial.rrte_3;
import celestial.ruS_2;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class AutoAuth
extends Module {
    public static Object[] id_break;
    public Object[] id_byte;

    private void id_byte(String var1) {
        String[] var2;
        String[] var3 = var2 = var1.split(" ");
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            if (((Set)id_break[2]).contains(var6)) {
                this.id_super();
                break;
            }
            if (!((Set)id_break[1]).contains(var6)) continue;
            this.id_return();
            break;
        }
    }

    public AutoAuth() {
        super("Auto Auth", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0443\u0435\u0442\u0441\u044f\n\u0438 \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u0438\u0440\u0443\u0435\u0442\u0441\u044f \u043d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u0435", Category.UTIL);
        this.id_else();
        rrIv_1 var5 = new rrIv_1("\u041f\u0430\u0440\u043e\u043b\u044c", "qwerty123", rrte_3.id_class((Pattern)rrtR_2.id_class[8])).id_class(80.0f);
        this.id_byte[0] = var5;
        this.id_class((rrIv_1)this.id_byte[0]);
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rFu_1) {
            rFu_1 var2 = (rFu_1)ruS_22;
            rFm_1 var5 = var2.id_break();
            rgP_2 var4 = var2.id_byte();
            if (var4 == null) {
                return;
            }
            if ((cb_3)AutoAuth.id_import.id_class[57] == null || id_import.id_finally() || id_import.S() == null) {
                return;
            }
            if (var5 == rFm_1.TITLE || var5 == rFm_1.SUBTITLE || var5 == rFm_1.ACTIONBAR) {
                this.id_byte(var4.id_byte().toLowerCase());
            }
        }
    }

    @EventTarget
    public void id_class(rrLO var1) {
        String var2 = var1.id_protected().toLowerCase();
        if (!id_import.id_finally() && id_import.S() != null) {
            this.id_byte(var2);
        }
    }

    private void id_else() {
        if (this.id_byte == null) {
            this.id_byte = new Object[1];
        }
    }

    private void id_return() {
        this.id_else();
        String var1 = ((rrIv_1)this.id_byte[0]).id_extends();
        if (var1.isEmpty()) {
            var1 = ((rrIv_1)this.id_byte[0]).id_final();
        }
        ((cb_3)AutoAuth.id_import.id_class[57]).id_case("/register " + var1 + " " + var1);
        ((Set)id_break[0]).add(new rrHc_1(id_import.id_while().id_byte(), AutoAuth.id_import.S().id_break, var1));
    }

    private void id_super() {
        this.id_else();
        for (rrHc_1 var2 : (Set)id_break[0]) {
            String var3 = var2.id_byte();
            String var4 = var2.id_break();
            if (!id_import.id_while().id_byte().equalsIgnoreCase(var3) || !var4.equals(AutoAuth.id_import.S().id_break)) continue;
            String var5 = var2.id_class();
            if (!rql_3.id_break(var5)) {
                ((cb_3)AutoAuth.id_import.id_class[57]).id_case("/login " + var5);
            }
            return;
        }
        ((cb_3)AutoAuth.id_import.id_class[57]).id_case("/login " + ((rrIv_1)this.id_byte[0]).id_extends());
    }

    static {
        Object[] var0 = new Object[]{new HashSet(), Set.of("/register", "/reg"), Set.of("/login", "/l")};
        id_break = var0;
    }
}

