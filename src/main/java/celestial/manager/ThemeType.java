/*
 * Decompiled with CFR 0.152.
 */
package celestial.manager;

import celestial.manager.ThemeManager;
import celestial.rrIk_1;
import celestial.rrIz_1;
import celestial.rrvP;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.ColorHelper;
import java.util.function.Function;

public enum ThemeType {
    CLIENT(var0x -> {
        rrvP var1 = ThemeManager.INSTANCE.id_break();
        int speed = ClickGuiTheme.id_class[8] != null ? (Integer)ClickGuiTheme.id_class[8] : 7;
        boolean blend = ClickGuiTheme.id_class[9] != null && ((rrIk_1)ClickGuiTheme.id_class[9]).id_class() != false;
        return ColorHelper.id_class(speed, (int)var0x, var1 != null ? var1.id_class() : -1, var1 != null ? var1.id_break() : -1, blend);
    }),
    CUSTOM(var0x -> {
        int speed = ClickGuiTheme.id_class[8] != null ? (Integer)ClickGuiTheme.id_class[8] : 7;
        int color1 = ClickGuiTheme.id_class[3] != null ? (Integer)((rrIz_1)ClickGuiTheme.id_class[3]).id_byte() : -4299265;
        int color2 = ClickGuiTheme.id_class[4] != null ? (Integer)((rrIz_1)ClickGuiTheme.id_class[4]).id_byte() : -12708504;
        boolean blend = ClickGuiTheme.id_class[9] != null && ((rrIk_1)ClickGuiTheme.id_class[9]).id_class() != false;
        return ColorHelper.id_class(speed, (int)var0x, color1, color2, blend);
    });

    public static Object[] staticFields5969a4913d2033e8a6ff59f1ab73faf8;
    public Object[] fields5969a4913d2033e8a6ff59f1ab73faf8;
    private final Function<Integer, Integer> colorFunction;

    private ThemeType(Function<Integer, Integer> colorFunction) {
        this.colorFunction = colorFunction;
    }

    public static ThemeType id_class(String var0) {
        if ("CLIENT".equalsIgnoreCase(var0) || "\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439".equalsIgnoreCase(var0)) {
            return CLIENT;
        }
        if ("CUSTOM".equalsIgnoreCase(var0) || "\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0439".equalsIgnoreCase(var0)) {
            return CUSTOM;
        }
        return CLIENT;
    }

    public Function<Integer, Integer> id_class() {
        return this.colorFunction;
    }

    static {
        staticFields5969a4913d2033e8a6ff59f1ab73faf8 = new Object[]{CLIENT, CUSTOM, new ThemeType[]{CLIENT, CUSTOM}};
    }
}

