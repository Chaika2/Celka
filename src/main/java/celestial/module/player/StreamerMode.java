/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.ao_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVa_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rrIk_1;
import celestial.rrLb_1;
import celestial.rrZW;
import celestial.rrZk_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrnb_3;
import celestial.rsG_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class StreamerMode
extends Module {
    public static Object[] id_break;
    public Object[] id_byte;

    public StreamerMode() {
        super("Streamer Mode", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043d\u0435\u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b\n\u0438\u0433\u0440\u044b", Category.PLAYER);
        this.id_this();
        rrIk_1 var5 = new rrIk_1("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0441\u0432\u043e\u0439", true);
        this.id_byte[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0434\u0440\u0443\u0437\u0435\u0439", false);
        this.id_byte[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e", false);
        this.id_byte[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0430\u043d\u0430\u0440\u0445\u0438\u044e/\u0433\u0440\u0438\u0444", false);
        this.id_byte[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b", false);
        this.id_byte[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0420\u0435\u0436\u0438\u043c \u044e\u0442\u0443\u0431\u0435\u0440\u0430", false);
        this.id_byte[5] = var10;
        this.id_class(new GroupSetting("\u041d\u0438\u043a\u043d\u0435\u0439\u043c\u044b", (rrIk_1)this.id_byte[0], (rrIk_1)this.id_byte[1]), new GroupSetting("\u0427\u0430\u0442", new Setting[]{(rrIk_1)this.id_byte[2]}), new GroupSetting("\u0420\u0430\u0437\u043d\u043e\u0435", (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[5]));
    }

    private void id_this() {
        if (this.id_byte == null) {
            this.id_byte = new Object[6];
        }
    }

    public static void id_class(rVi_1 var0, String var1, Map<Integer, String> var2) {
        List<rgP_2> var3 = var0.id_protected();
        if (!var3.isEmpty()) {
            StringBuilder var4 = new StringBuilder();
            for (rgP_2 var6 : var3) {
                var4.append(var6.getString());
            }
            String var20 = var4.toString().toLowerCase();
            int var21 = var20.indexOf(var1.toLowerCase());
            if (var21 != -1) {
                int var7 = var21 + var1.length();
                ArrayList<rgP_2> var8 = new ArrayList<rgP_2>(var3.size());
                int var9 = 0;
                for (rgP_2 var11 : var3) {
                    String var12 = var11.getString();
                    int var13 = var12.length();
                    int var14 = var9 + var13;
                    if (var14 > var21 && var9 < var7) {
                        StringBuilder var15 = new StringBuilder(var13);
                        for (int var16 = 0; var16 < var13; ++var16) {
                            int var17 = var9 + var16;
                            if (var17 >= var21 && var17 < var7) {
                                int var18 = var17 - var21;
                                String var19 = var2.getOrDefault(var18, String.valueOf(var12.charAt(var16)));
                                var15.append(var19);
                                continue;
                            }
                            var15.append(var12.charAt(var16));
                        }
                        rgN_2 var22 = new rgN_2(var15.toString());
                        var22.id_class(var11.id_class());
                        var8.add(var22);
                    } else {
                        var8.add(var11);
                    }
                    var9 = var14;
                }
                var0.id_protected().clear();
                var0.id_protected().addAll(var8);
            }
        }
    }

    public rgP_2 id_class(rgP_2 var1) {
        String var9;
        String var10;
        Map<String, rrZk_1> var6;
        this.id_this();
        if (!this.aJ_()) {
            return var1;
        }
        boolean var2 = ((rrIk_1)this.id_byte[1]).id_class();
        boolean var3 = ((rrIk_1)this.id_byte[0]).id_class();
        if (!var2 && !var3) {
            return var1;
        }
        String var4 = var1.getString();
        String var5 = var4.toLowerCase();
        if (var2 && !(var6 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class()).isEmpty()) {
            for (String var8 : var6.keySet()) {
                if (!var5.contains(var8)) continue;
                return var1.id_case().id_class(var8, (String)id_break[2], false);
            }
        }
        if (var3 && var5.contains(var10 = (var9 = id_import.id_while().id_byte()).toLowerCase())) {
            return var1.id_case().id_class(var10, (String)id_break[2], false);
        }
        return var1;
    }

    public static boolean id_class(int var0) {
        int var1 = var0 >> 16 & 0xFF;
        int var2 = var0 >> 8 & 0xFF;
        int var3 = var0 & 0xFF;
        return var1 > var2 && var1 > var3 && var1 >= 80;
    }

    @EventTarget
    public void id_class(rrnb_3 var1) {
        this.id_this();
        ao_3 ao_32 = var1.id_class();
        if (ao_32 instanceof rsG_2) {
            rsG_2 var3 = (rsG_2)ao_32;
            if (((rrIk_1)this.id_byte[5]).id_class().booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && (int)var3.BO() == -29) {
                var1.id_class(true);
            }
        }
    }

    @EventTarget
    public void id_class(rrLb_1 var1) {
        String var2 = var1.id_class();
        if (var2 != null) {
            var1.id_break(this.id_break(var2));
        }
    }

    private static int id_break(int var0) {
        return Integer.rotateLeft(var0, 16) ^ 0xD99FB18;
    }

    public String id_break(String var1) {
        String var8;
        String var9;
        Map<String, rrZk_1> var5;
        this.id_this();
        if (!this.aJ_()) {
            return var1;
        }
        boolean var2 = ((rrIk_1)this.id_byte[1]).id_class();
        boolean var3 = ((rrIk_1)this.id_byte[0]).id_class();
        if (!var2 && !var3) {
            return var1;
        }
        String var4 = var1.toLowerCase();
        if (var2 && !(var5 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class()).isEmpty()) {
            for (String var7 : var5.keySet()) {
                if (!var4.contains(var7)) continue;
                return var4.replace(var7, (String)id_break[2]);
            }
        }
        if (var3 && var4.contains(var9 = (var8 = id_import.id_while().id_byte()).toLowerCase())) {
            return var4.replace(var9, (String)id_break[2]);
        }
        return var1;
    }

    public boolean id_continue() {
        this.id_this();
        return this.aJ_() && ((rrIk_1)this.id_byte[3]).id_class() != false;
    }

    public boolean id_new() {
        this.id_this();
        return this.aJ_() && ((rrIk_1)this.id_byte[4]).id_class() != false;
    }

    public boolean id_super() {
        this.id_this();
        return this.aJ_() && ((rrIk_1)this.id_byte[5]).id_class() != false;
    }

    public boolean id_protected(String var1) {
        this.id_this();
        return this.aJ_() && ((rrIk_1)this.id_byte[2]).id_class() != false ? Arrays.stream((String[])id_break[0]).anyMatch(var1x -> var1.startsWith("/" + var1x)) : false;
    }

    static {
        String[] var2;
        Object[] var0 = new Object[8];
        var0[0] = var2 = new String[]{"warp", "call", "tpa", "tp", "l", "login", "register", "reg", "cp", "an", "gr", "changepass", "cpass", "changepassword"};
        var0[1] = new rgN_2("Protected");
        var0[2] = new String("Protected");
        var0[3] = Pattern.compile("(funtime|\u0444\u0430\u043d\u0442\u0430\u0439\u043c)", 2);
        var0[4] = Pattern.compile("funac", 2);
        Map.Entry[] var3 = new Map.Entry[]{Map.entry(0, "c"), Map.entry(1, "e"), Map.entry(2, "l"), Map.entry(3, "e"), Map.entry(4, "s"), Map.entry(5, "t"), Map.entry(6, "ial")};
        var0[5] = Map.ofEntries(var3);
        Map.Entry[] var4 = new Map.Entry[]{Map.entry(0, "C"), Map.entry(1, "e"), Map.entry(2, "l"), Map.entry(3, "A"), Map.entry(4, "C")};
        var0[6] = Map.ofEntries(var4);
        var0[7] = rVa_1.id_class(16738740);
        id_break = var0;
    }
}

