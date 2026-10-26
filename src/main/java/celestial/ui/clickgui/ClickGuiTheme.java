/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.ui.clickgui;

import celestial.Ml_1;
import celestial.manager.ThemeType;
import celestial.module.Category;
import celestial.rrIF;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIz_1;
import celestial.rrZt_1;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import celestial.ui.clickgui.ClickGuiScreen;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Pair;

public class ClickGuiTheme
extends rrtN_2 {
    public static Object[] id_class = new Object[10];

    @Override
    public String id_byte() {
        return "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430";
    }

    public ClickGuiTheme(ClickGuiScreen var1, Supplier<Float> var2, Supplier<Float> var3) {
        super(var2, var3, () -> Float.valueOf(140.0f), () -> Float.valueOf(14.0f));
        rrIF var8 = new rrIF("\u041e\u0442\u043a\u0440\u044b\u0442\u044c \u043c\u0435\u043d\u044e", KeyBind.get(124)).id_class(false);
        ClickGuiTheme.id_class[0] = var8;
        rrIQ var9 = (rrIQ)new rrIQ("\u0426\u0432\u0435\u0442", "\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439", "\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439", "\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0439").id_class("change_mode", (Setting<T> var1x, Pair<T, Boolean> var2x) -> {
            if (!((Boolean)var2x.getRight()).booleanValue() && ((String)var2x.getLeft()).equals("\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439") && !((String)var1x.id_byte()).equals("\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439")) {
                rrZt_1.id_class(var1, Category.THEMES);
            }
            ThemeType var7 = ThemeType.id_class((String)var1x.id_byte());
            ClickGuiTheme.id_class[7] = var7;
        });
        ClickGuiTheme.id_class[1] = var9;
        rrIz_1 var10 = (rrIz_1)new rrIz_1("\u041f\u0435\u0440\u0432\u044b\u0439 \u0446\u0432\u0435\u0442", -4299265).id_break().id_class(() -> ((String)((rrIQ)id_class[1]).id_byte()).equals("\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0439"));
        ClickGuiTheme.id_class[3] = var10;
        rrIz_1 var11 = (rrIz_1)new rrIz_1("\u0412\u0442\u043e\u0440\u043e\u0439 \u0446\u0432\u0435\u0442", -12708504).id_break().id_class(() -> ((String)((rrIQ)id_class[1]).id_byte()).equals("\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0439"));
        ClickGuiTheme.id_class[4] = var11;
        rrIm_1 var12 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0446\u0432\u0435\u0442\u0430", Float.valueOf(3.0f), Float.valueOf(1.0f), Float.valueOf(5.0f), Float.valueOf(1.0f));
        ClickGuiTheme.id_class[2] = var12;
        rrIk_1 var13 = new rrIk_1("\u0421\u043c\u0435\u0448\u0438\u0432\u0430\u043d\u0438\u0435 \u0446\u0432\u0435\u0442\u043e\u0432", false);
        ClickGuiTheme.id_class[9] = var13;
        ((rrIm_1)id_class[2]).id_class("change_speed", (Setting<T> var0, Pair<T, Boolean> var1x) -> {
            Integer var6 = (int)(((rrIm_1)id_class[2]).id_native() + 5.0f - ((Float)var1x.getLeft()).floatValue());
            ClickGuiTheme.id_class[8] = var6;
        });
        rrIk_1 var14 = new rrIk_1("\u0420\u0430\u0437\u043c\u044b\u0442\u0438\u0435", true);
        ClickGuiTheme.id_class[5] = var14;
        rrIk_1 var15 = new rrIk_1("\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435", true);
        ClickGuiTheme.id_class[6] = var15;
        this.id_class((rrIQ)id_class[1], (rrIz_1)id_class[3], (rrIz_1)id_class[4], (rrIm_1)id_class[2], (rrIk_1)id_class[9], (rrIk_1)id_class[5], (rrIk_1)id_class[6], (rrIF)id_class[0]);
        this.id_switch();
    }

    @Override
    public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
        super.id_class(var1, var2, var3, var4, var5);
        this.id_interface().id_class(var1, () -> {}, var2, var3, var4, false, var5);
    }

    public static boolean id_class() {
        return id_class[6] != null && ((rrIk_1)id_class[6]).id_class() != false;
    }

    public static rrIm_1 id_break() {
        return (rrIm_1)id_class[2];
    }

    public static boolean id_throws() {
        return id_class[5] != null && ((rrIk_1)id_class[5]).id_class() != false;
    }

    @Override
    public String id_catch() {
        return "GuiSettingPopUp";
    }

    public static String id_case() {
        return id_class[1] != null ? (String)((rrIQ)id_class[1]).id_byte() : "\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439";
    }

    @Override
    public boolean id_protected() {
        return false;
    }

    static {
        ClickGuiTheme.id_class[7] = ThemeType.CLIENT;
        ClickGuiTheme.id_class[8] = 7;
    }
}

