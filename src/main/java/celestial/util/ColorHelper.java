/*
 * Decompiled with CFR 0.152.
 */
package celestial.util;

import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.manager.ThemeType;
import celestial.rfU_2;
import celestial.rqR_2;
import celestial.rrfQ_2;
import celestial.rrjZ_2;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.MinecraftAccessor;
import java.awt.Color;

public class ColorHelper
implements MinecraftAccessor {
    public static int id_byte(int var0) {
        return var0 >> 16 & 0xFF;
    }

    private static int id_byte(int var0, int var1) {
        return (int)(rqR_2.id_break() / (long)var0 + (long)var1) % 360;
    }

    public static int id_byte(int var0, int var1, float var2) {
        var2 = rfU_2.id_class(var2, 0.0f, 1.0f);
        int var3 = ColorHelper.id_byte(var0);
        int var4 = ColorHelper.id_protected(var0);
        int var5 = ColorHelper.id_break(var0);
        int var6 = ColorHelper.id_byte(var1);
        int var7 = ColorHelper.id_protected(var1);
        int var8 = ColorHelper.id_break(var1);
        float[] var9 = ColorHelper.id_class(var3, var4, var5, null);
        float[] var10 = ColorHelper.id_class(var6, var7, var8, null);
        int var11 = ColorHelper.id_class(rrfQ_2.id_break(var9[0], var10[0], var2), rrfQ_2.id_break(var9[1], var10[1], var2), rrfQ_2.id_break(var9[2], var10[2], var2));
        return ColorHelper.id_class(ColorHelper.id_byte(var11), ColorHelper.id_protected(var11), ColorHelper.id_break(var11), (int)rrfQ_2.id_break(ColorHelper.id_throws(var0), ColorHelper.id_throws(var1), var2));
    }

    public static int id_class(int var0, int var1, int var2, int var3, float var4) {
        return ColorHelper.id_class((int)Math.max((float)var0 * var4, 0.0f), (int)Math.max((float)var1 * var4, 0.0f), (int)Math.max((float)var2 * var4, 0.0f), rfU_2.id_class(var3, 0, 255));
    }

    public static int id_class(int var0, int var1) {
        return rfU_2.id_class(var1, 0, 255) << 24 | var0 << 16 | var0 << 8 | var0;
    }

    public static int id_class(int var0, float var1) {
        return ColorHelper.id_class((int)Math.max((float)ColorHelper.id_byte(var0) * var1, 0.0f), (int)Math.max((float)ColorHelper.id_protected(var0) * var1, 0.0f), (int)Math.max((float)ColorHelper.id_break(var0) * var1, 0.0f), rfU_2.id_class(ColorHelper.id_throws(var0), 0, 255));
    }

    public static int id_class(float var0, float var1, float var2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (var1 == 0.0f) {
            var4 = var5 = Math.round(var2 * 255.0f);
            var3 = var5;
        } else {
            float var6 = (var0 - (float)Math.floor(var0)) * 6.0f;
            int var7 = (int)Math.floor(var6);
            float var8 = var6 - (float)var7;
            float var9 = var2 * (1.0f - var1);
            float var10 = var2 * (1.0f - var1 * var8);
            float var11 = var2 * (1.0f - var1 * (1.0f - var8));
            switch (var7) {
                case 0: {
                    var3 = Math.round(var2 * 255.0f);
                    var4 = Math.round(var11 * 255.0f);
                    var5 = Math.round(var9 * 255.0f);
                    break;
                }
                case 1: {
                    var3 = Math.round(var10 * 255.0f);
                    var4 = Math.round(var2 * 255.0f);
                    var5 = Math.round(var9 * 255.0f);
                    break;
                }
                case 2: {
                    var3 = Math.round(var9 * 255.0f);
                    var4 = Math.round(var2 * 255.0f);
                    var5 = Math.round(var11 * 255.0f);
                    break;
                }
                case 3: {
                    var3 = Math.round(var9 * 255.0f);
                    var4 = Math.round(var10 * 255.0f);
                    var5 = Math.round(var2 * 255.0f);
                    break;
                }
                case 4: {
                    var3 = Math.round(var11 * 255.0f);
                    var4 = Math.round(var9 * 255.0f);
                    var5 = Math.round(var2 * 255.0f);
                    break;
                }
                case 5: {
                    var3 = Math.round(var2 * 255.0f);
                    var4 = Math.round(var9 * 255.0f);
                    var5 = Math.round(var10 * 255.0f);
                }
            }
        }
        return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
    }

    public static int id_class(float var0) {
        return ColorHelper.id_case((int)var0);
    }

    public static int id_class(int var0, int var1, int var2, int var3, boolean var4) {
        int var5 = ColorHelper.id_byte(var0, var1);
        var5 = (var5 >= 180 ? 360 - var5 : var5) * 2;
        float var6 = (float)var5 / 360.0f;
        return var4 ? ColorHelper.id_byte(var2, var3, var6) : ColorHelper.id_break(var2, var3, var6);
    }

    public static int id_class(an_3 var0) {
        return ColorHelper.id_break(Color.RED.getRGB(), Color.GREEN.getRGB(), ((cb_3)ColorHelper.id_import.id_class[57]).id_implements(var0) / 30.0f);
    }

    public static int id_class(int var0, int var1, float var2) {
        float[] var3 = new float[3];
        float[] var4 = new float[3];
        float[] var5 = new float[3];
        ColorHelper.id_class(ColorHelper.id_byte(var0), ColorHelper.id_protected(var0), ColorHelper.id_break(var0), var3);
        ColorHelper.id_class(ColorHelper.id_byte(var1), ColorHelper.id_protected(var1), ColorHelper.id_break(var1), var4);
        for (int var6 = 0; var6 < 3; ++var6) {
            var5[var6] = var3[var6] + var2 * (var4[var6] - var3[var6]);
        }
        return ColorHelper.id_class(var5[0], var5[1], var5[2]);
    }

    public static int id_class(int var0, int var1, int var2, int var3) {
        return rfU_2.id_class(var3, 0, 255) << 24 | var0 << 16 | var1 << 8 | var2;
    }

    public static int id_class(int var0, int var1, int var2) {
        return ColorHelper.id_class(var0, var1, var2, 255);
    }

    public static float[] id_class(int var0) {
        return Color.RGBtoHSB(ColorHelper.id_byte(var0), ColorHelper.id_protected(var0), ColorHelper.id_break(var0), null);
    }

    public static int id_class(int var0, int var1, float var2, float var3, float var4) {
        float f;
        float var5 = ColorHelper.id_byte(var0, var1);
        var5 = (float)((double)var5 % 360.0);
        float var7 = var5 % 360.0f;
        return ColorHelper.id_break(Color.HSBtoRGB((double)(f / 360.0f) < 0.5 ? -(var7 / 360.0f) : var7 / 360.0f, var2, var3), Math.max(0, Math.min(255, (int)(var4 * 255.0f))));
    }

    public static int id_class(float var0, int var1) {
        return ColorHelper.id_break(ColorHelper.id_case((int)var0), var1);
    }

    public static int id_class(iB_2 var0) {
        return ColorHelper.id_break(Color.RED.getRGB(), Color.GREEN.getRGB(), 1.0f - rrjZ_2.id_class(var0));
    }

    public static float[] id_class(int var0, int var1, int var2, float[] var3) {
        if (var3 == null) {
            var3 = new float[3];
        }
        int var4 = Math.max(var0, Math.max(var1, var2));
        int var5 = Math.min(var0, Math.min(var1, var2));
        float var6 = (float)var4 / 255.0f;
        float var7 = var4 != 0 ? (float)(var4 - var5) / (float)var4 : 0.0f;
        float var8 = 0.0f;
        if (var7 != 0.0f) {
            float var9 = (float)(var4 - var0) / (float)(var4 - var5);
            float var10 = (float)(var4 - var1) / (float)(var4 - var5);
            float var11 = (float)(var4 - var2) / (float)(var4 - var5);
            var8 = var0 == var4 ? var11 - var10 : (var1 == var4 ? 2.0f + var9 - var11 : 4.0f + var10 - var9);
            if ((var8 /= 6.0f) < 0.0f) {
                var8 += 1.0f;
            }
        }
        var3[0] = var8;
        var3[1] = var7;
        var3[2] = var6;
        return var3;
    }

    public static int id_break(int var0, float var1) {
        return ColorHelper.id_class((int)Math.min((float)ColorHelper.id_byte(var0) / var1, 255.0f), (int)Math.min((float)ColorHelper.id_protected(var0) / var1, 255.0f), (int)Math.min((float)ColorHelper.id_break(var0) / var1, 255.0f), rfU_2.id_class(ColorHelper.id_throws(var0), 0, 255));
    }

    public static int id_break(int var0, int var1, float var2) {
        var2 = rfU_2.id_class(var2, 0.0f, 1.0f);
        return ColorHelper.id_class(Math.round(rrfQ_2.id_break(ColorHelper.id_byte(var0), ColorHelper.id_byte(var1), var2)), Math.round(rrfQ_2.id_break(ColorHelper.id_protected(var0), ColorHelper.id_protected(var1), var2)), Math.round(rrfQ_2.id_break(ColorHelper.id_break(var0), ColorHelper.id_break(var1), var2)), Math.round(rrfQ_2.id_break(ColorHelper.id_throws(var0), ColorHelper.id_throws(var1), var2)));
    }

    public static int id_break(int var0, int var1) {
        return rfU_2.id_class(var1, 0, 255) << 24 | var0 & 0xFFFFFF;
    }

    public static int id_break(int var0, int var1, float var2, float var3, float var4) {
        float var5 = (float)ColorHelper.id_byte(var0, var1) / 360.0f;
        return ColorHelper.id_break(ColorHelper.id_class(var5, var2, var3), Math.max(0, Math.min(255, (int)(var4 * 255.0f))));
    }

    public static int id_break(int var0, int var1, int var2, int var3, float var4) {
        return ColorHelper.id_class((int)Math.min((float)var0 / var4, 255.0f), (int)Math.min((float)var1 / var4, 255.0f), (int)Math.min((float)var2 / var4, 255.0f), rfU_2.id_class(var3, 0, 255));
    }

    public static int id_break(int var0) {
        return var0 & 0xFF;
    }

    public static int id_throws(int var0) {
        return var0 >> 24 & 0xFF;
    }

    private static int id_catch(int var0) {
        return Integer.rotateLeft(var0, 16) ^ 0x17DA9631;
    }

    private static int id_case(int var0) {
        return ((ThemeType)((Object)ClickGuiTheme.id_class[7])).id_class().apply(var0);
    }

    public static int id_protected(int var0) {
        return var0 >> 8 & 0xFF;
    }
}

