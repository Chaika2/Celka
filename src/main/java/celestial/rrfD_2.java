/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jhlabs.image.GaussianFilter
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.Hz_1;
import celestial.MT;
import celestial.Ml_1;
import celestial.ch_3;
import celestial.cm_3;
import celestial.fj_3;
import celestial.iB_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.manager.ShaderManager;
import celestial.rLR;
import celestial.rdn_3;
import celestial.rfl_3;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrfU_2;
import celestial.rrfa_3;
import celestial.rrjr_3;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import com.jhlabs.image.GaussianFilter;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrfD_2
implements MinecraftAccessor {
    private static double[] id_break;
    private static String[] id_byte;
    public static Object[] id_class;
    private static float[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;
    private static byte[] id_catch;

    public static void id_byte(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        rrfD_2.id_class(ml_1, f - f5, f2 - f5, f3 + f5 * id_protected[180], f4 + f5 * id_protected[181], id_protected[182], id_protected[183], n, n2, n3, n4);
    }

    public static void id_byte(lD_2 lD_22) {
        lD_22.id_class((int)id_catch[2], ju_3.id_public);
    }

    public static void id_byte(Ml_1 ml_1, lD_2 lD_22, float f, int n, int n2, int n3, int n4) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        lD_22.id_class(rjV_22, -f, -f, id_protected[72]).id_class(id_protected[73], id_protected[74]).id_class(n).id_class();
        lD_22.id_class(rjV_22, -f, f, id_protected[75]).id_class(id_protected[76], id_protected[77]).id_class(n2).id_class();
        lD_22.id_class(rjV_22, f, f, id_protected[78]).id_class(id_protected[79], id_protected[80]).id_class(n3).id_class();
        lD_22.id_class(rjV_22, f, -f, id_protected[81]).id_class(id_protected[82], id_protected[83]).id_class(n4).id_class();
    }

    public static void id_byte(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        RenderSystem.shadeModel(id_case[23]);
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.disableAlphaTest();
        id_strictfp.id_class((int)id_catch[3], ju_3.id_this);
        id_strictfp.id_class(rjV_22, f, f2 + f4, id_protected[28]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2 + f4, id_protected[29]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2, id_protected[30]).id_class(n2).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[31]).id_class(n2).id_class();
        id_default.id_break();
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
        RenderSystem.enableTexture();
        RenderSystem.shadeModel(id_case[24]);
    }

    private static void id_byte() {
        short[] sArray = new short[117];
        sArray[0] = 6;
        sArray[1] = 6;
        sArray[2] = 6;
        sArray[3] = 3553;
        sArray[4] = 10240;
        sArray[5] = 9729;
        sArray[6] = 5;
        sArray[7] = 5;
        sArray[8] = 5;
        sArray[9] = 5;
        sArray[10] = 5;
        sArray[11] = 5;
        sArray[12] = 5;
        sArray[13] = 5;
        sArray[14] = 5;
        sArray[15] = 770;
        sArray[16] = 771;
        sArray[17] = 3553;
        sArray[18] = 10240;
        sArray[19] = 9729;
        sArray[20] = 3553;
        sArray[21] = 10240;
        sArray[22] = 9729;
        sArray[23] = 7425;
        sArray[24] = 7424;
        sArray[25] = 2848;
        sArray[26] = 770;
        sArray[27] = 771;
        sArray[28] = 2848;
        sArray[29] = 2848;
        sArray[30] = 2881;
        sArray[31] = 3155;
        sArray[32] = 4354;
        sArray[33] = 770;
        sArray[34] = 771;
        sArray[35] = 2848;
        sArray[36] = 2881;
        sArray[46] = 770;
        sArray[47] = 771;
        sArray[48] = 2;
        sArray[49] = 2;
        sArray[50] = 2;
        sArray[51] = 2;
        sArray[52] = 2;
        sArray[53] = 2;
        sArray[54] = 2;
        sArray[55] = 2;
        sArray[56] = 2;
        sArray[57] = 2;
        sArray[58] = 2;
        sArray[59] = 516;
        sArray[60] = 516;
        sArray[61] = 401;
        sArray[62] = 407;
        sArray[63] = 6;
        sArray[64] = 6;
        sArray[66] = 1;
        sArray[67] = 1;
        sArray[68] = 1;
        sArray[69] = 1;
        sArray[70] = 1;
        sArray[71] = 1;
        sArray[72] = 1;
        sArray[73] = 1;
        sArray[74] = 1;
        sArray[75] = 1;
        sArray[85] = 770;
        sArray[86] = 771;
        sArray[87] = 2832;
        sArray[88] = 3153;
        sArray[89] = 4354;
        sArray[90] = 3553;
        sArray[91] = 770;
        sArray[92] = 771;
        sArray[93] = 2832;
        sArray[94] = 3153;
        sArray[95] = 4354;
        sArray[96] = 3553;
        sArray[97] = 255;
        sArray[98] = 15;
        sArray[99] = 4;
        sArray[100] = 4;
        sArray[101] = 4;
        sArray[102] = 4;
        sArray[103] = 4;
        sArray[104] = 4;
        sArray[105] = 4;
        sArray[106] = 4;
        sArray[107] = 3;
        sArray[108] = 3;
        sArray[109] = 3;
        sArray[110] = 3;
        sArray[111] = 3;
        sArray[113] = 6;
        sArray[114] = 6;
        sArray[115] = 256;
        sArray[116] = 256;
        id_case = sArray;
    }

    public static void id_byte(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, int n, int n2) {
        rrfD_2.id_class(ml_1, lD_22, f, f2, f3, f4, n, n2, n2, n);
    }

    public static void id_byte(Ml_1 ml_1, float f, float f2, float f3, float f4, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        float f5 = f + (f3 - f) * id_protected[32];
        float f6 = f + (f3 - f) * id_protected[33];
        id_strictfp.id_class((int)id_catch[4], ju_3.id_this);
        id_strictfp.id_class(rjV_22, f, f2, id_protected[34]).id_class(n).id_class();
        byte by = id_catch[5];
        for (int i = id_throws[2]; i <= id_catch[6]; ++i) {
            float f7 = (float)i / id_protected[35];
            float f8 = rrfD_2.id_class(f, f5, f6, f3, f7);
            float f9 = rrfD_2.id_class(f2, f2, f4, f4, f7);
            id_strictfp.id_class(rjV_22, f8, f9, id_protected[36]).id_class(n).id_class();
        }
        id_strictfp.id_class(rjV_22, f3, f4, id_protected[37]).id_class(n).id_class();
        GL11.glEnable((int)id_case[25]);
        RenderSystem.disableTexture();
        RenderSystem.lineWidth(id_protected[38]);
        RenderSystem.disableAlphaTest();
        RenderSystem.blendFunc(id_case[26], id_case[27]);
        RenderSystem.enableBlend();
        id_default.id_break();
        RenderSystem.disableBlend();
        RenderSystem.enableTexture();
        RenderSystem.enableAlphaTest();
        GL11.glDisable((int)id_case[28]);
        rrfa_3.id_class();
    }

    static {
        rrfD_2.ntfClinit();
    }

    public static void id_class(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, int n, int n2) {
        rrfD_2.id_class(ml_1, lD_22, f, f2, f3, f4, n2, n2, n, n);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        ((ShaderManager)id_class[id_case[107]]).id_protected();
        ((ShaderManager)id_class[id_case[108]]).id_break(id_byte[44], f3 * id_protected[250], f4 * id_protected[251]);
        ((ShaderManager)id_class[id_case[109]]).id_break(id_byte[45], f5 * id_protected[252]);
        ((ShaderManager)id_class[id_case[110]]).id_break(id_byte[46], f6);
        id_strictfp.id_class((int)id_catch[32], ju_3.id_synchronized);
        id_strictfp.id_class(rjV_22, f, f2, id_protected[253]).id_class(id_protected[254], id_protected[255]).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + f4, id_protected[256]).id_class(id_protected[257], id_protected[258]).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2 + f4, id_protected[259]).id_class(id_protected[260], id_protected[261]).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2, id_protected[262]).id_class(id_protected[263], id_protected[264]).id_class();
        id_default.id_break();
        RenderSystem.bindTexture(id_throws[17]);
        ((ShaderManager)id_class[id_case[111]]).id_byte();
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        float f5 = id_protected[42] / f3;
        float f6 = id_protected[43] / f4;
        id_strictfp.id_class((int)id_catch[7], ju_3.id_synchronized);
        id_strictfp.id_class(rjV_22, (float)n, (float)(n2 + n4), id_protected[44]).id_class(f * f5, (f2 + (float)n4) * f6).id_class();
        id_strictfp.id_class(rjV_22, (float)(n + n3), (float)(n2 + n4), id_protected[45]).id_class((f + (float)n3) * f5, (f2 + (float)n4) * f6).id_class();
        id_strictfp.id_class(rjV_22, (float)(n + n3), (float)n2, id_protected[46]).id_class((f + (float)n3) * f5, f2 * f6).id_class();
        id_strictfp.id_class(rjV_22, (float)n, (float)n2, id_protected[47]).id_class(f * f5, f2 * f6).id_class();
        id_default.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB4E9A63C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2531C92EDEBB9CE8L;
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4, int n5, int n6) {
        float f6 = f3 + f5 * id_protected[186];
        float f7 = f4 + f5 * id_protected[187];
        rrfD_2.id_class(ml_1, f - f5, f2 - f5, f6, f7, (float)n, (float)n2, n3, n4, n5, n6);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, int n, float f4) {
        ml_1.id_class();
        ml_1.id_class((double)f, (double)f2, id_break[0]);
        ml_1.id_class(rje_3.id_case.id_byte(id_protected[84] + f3));
        ml_1.id_class(f4, f4, f4);
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.disableAlphaTest();
        GL11.glEnable((int)id_case[29]);
        GL11.glEnable((int)id_case[30]);
        GL11.glHint((int)id_case[31], (int)id_case[32]);
        GL11.glBlendFunc((int)id_case[33], (int)id_case[34]);
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        id_strictfp.id_class((int)id_catch[11], ju_3.id_this);
        id_strictfp.id_class(rjV_22, id_protected[85], id_protected[86], id_protected[87]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, id_protected[88], id_protected[89], id_protected[90]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, id_protected[91], id_protected[92], id_protected[93]).id_class(n).id_class();
        id_default.id_break();
        GL11.glDisable((int)id_case[35]);
        GL11.glDisable((int)id_case[36]);
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        ml_1.id_break();
    }

    public static void id_class(Ml_1 ml_1, double d, double d2, float f, int n, float f2) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_case[85], id_case[86]);
        RenderSystem.disableTexture();
        GL11.glEnable((int)id_case[87]);
        GL11.glHint((int)id_case[88], (int)id_case[89]);
        GL11.glPointSize((float)(f * id_protected[222] * f2));
        id_strictfp.id_class(id_throws[7], ju_3.id_this);
        id_strictfp.id_class(ml_1.id_byte().id_class(), (float)d, (float)d2, id_protected[223]).id_class(n).id_class();
        id_default.id_break();
        GL11.glEnable((int)id_case[90]);
        RenderSystem.disableBlend();
        RenderSystem.enableTexture();
    }

    public static void id_class(Ml_1 ml_1, rfl_3 rfl_32, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        float f = (float)rfl_32.id_protected;
        float f2 = (float)rfl_32.id_class;
        float f3 = (float)rfl_32.id_throws;
        float f4 = (float)rfl_32.id_break;
        float f5 = (float)rfl_32.id_case;
        float f6 = (float)rfl_32.id_byte;
        id_strictfp.id_class(rjV_22, f2, f4, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f4, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f4, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f3, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f4, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f4, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f4, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f3, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f3, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f3, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f3, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f3, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f3, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f4, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f4, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f4, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f4, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f4, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f2, f3, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f3, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f4, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f3, f5).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f3, f6).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f3, f5).id_class(n).id_class();
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4) {
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        ((ShaderManager)id_class[id_case[66]]).id_class();
        ((ShaderManager)id_class[id_case[67]]).id_break(id_byte[23], f3);
        ((ShaderManager)id_class[id_case[68]]).id_break(id_byte[24], f4);
        ((ShaderManager)id_class[id_case[69]]).id_break(id_byte[25], f5);
        ((ShaderManager)id_class[id_case[70]]).id_break(id_byte[26], f6);
        ((ShaderManager)id_class[id_case[71]]).id_break(id_byte[27], (float)ColorHelper.id_byte(n) / id_protected[191], (float)ColorHelper.id_protected(n) / id_protected[192], (float)ColorHelper.id_break(n) / id_protected[193], (float)ColorHelper.id_throws(n) / id_protected[194]);
        ((ShaderManager)id_class[id_case[72]]).id_break(id_byte[28], (float)ColorHelper.id_byte(n2) / id_protected[195], (float)ColorHelper.id_protected(n2) / id_protected[196], (float)ColorHelper.id_break(n2) / id_protected[197], (float)ColorHelper.id_throws(n2) / id_protected[198]);
        ((ShaderManager)id_class[id_case[73]]).id_break(id_byte[29], (float)ColorHelper.id_byte(n3) / id_protected[199], (float)ColorHelper.id_protected(n3) / id_protected[200], (float)ColorHelper.id_break(n3) / id_protected[201], (float)ColorHelper.id_throws(n3) / id_protected[202]);
        ((ShaderManager)id_class[id_case[74]]).id_break(id_byte[30], (float)ColorHelper.id_byte(n4) / id_protected[203], (float)ColorHelper.id_protected(n4) / id_protected[204], (float)ColorHelper.id_break(n4) / id_protected[205], (float)ColorHelper.id_throws(n4) / id_protected[206]);
        ShaderManager.id_break(ml_1, f - id_protected[207] - f6, f2 - id_protected[208] - f6, f3 + id_protected[209] + f6 * id_protected[210], f4 + id_protected[211] + f6 * id_protected[212]);
        ((ShaderManager)id_class[id_case[75]]).id_break();
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, int n5, boolean bl) {
        rrfD_2.id_class(ml_1, f, f2, f3, f4, n, n2, n3, n4, n5, bl, id_protected[168]);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n, int n2, int n3, int n4) {
        rrfa_3.id_class();
        RenderSystem.disableAlphaTest();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_case[46], id_case[47]);
        ((ShaderManager)id_class[id_case[48]]).id_class();
        ((ShaderManager)id_class[id_case[49]]).id_break(id_byte[14], f3);
        ((ShaderManager)id_class[id_case[50]]).id_break(id_byte[15], f4);
        ((ShaderManager)id_class[id_case[51]]).id_break(id_byte[16], f5);
        ((ShaderManager)id_class[id_case[52]]).id_break(id_byte[17], f6);
        ((ShaderManager)id_class[id_case[53]]).id_break(id_byte[18], id_protected[119], f7);
        ((ShaderManager)id_class[id_case[54]]).id_break(id_byte[19], (float)ColorHelper.id_byte(n) / id_protected[120], (float)ColorHelper.id_protected(n) / id_protected[121], (float)ColorHelper.id_break(n) / id_protected[122], (float)ColorHelper.id_throws(n) / id_protected[123]);
        ((ShaderManager)id_class[id_case[55]]).id_break(id_byte[20], (float)ColorHelper.id_byte(n2) / id_protected[124], (float)ColorHelper.id_protected(n2) / id_protected[125], (float)ColorHelper.id_break(n2) / id_protected[126], (float)ColorHelper.id_throws(n2) / id_protected[127]);
        ((ShaderManager)id_class[id_case[56]]).id_break(id_byte[21], (float)ColorHelper.id_byte(n3) / id_protected[128], (float)ColorHelper.id_protected(n3) / id_protected[129], (float)ColorHelper.id_break(n3) / id_protected[130], (float)ColorHelper.id_throws(n3) / id_protected[131]);
        ((ShaderManager)id_class[id_case[57]]).id_break(id_byte[22], (float)ColorHelper.id_byte(n4) / id_protected[132], (float)ColorHelper.id_protected(n4) / id_protected[133], (float)ColorHelper.id_break(n4) / id_protected[134], (float)ColorHelper.id_throws(n4) / id_protected[135]);
        ShaderManager.id_break(ml_1, f - id_protected[136], f2 - id_protected[137], f3 + id_protected[138], f4 + id_protected[139]);
        ((ShaderManager)id_class[id_case[58]]).id_break();
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        RenderSystem.enableTexture();
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.alphaFunc(id_case[59], id_protected[142]);
        MT.id_super(rrfD_2.id_class((int)f3, (int)f4, n));
        id_strictfp.id_class((int)id_catch[14], ju_3.id_public);
        id_strictfp.id_class(rjV_22, f -= (float)n, f2 -= (float)n, id_protected[143]).id_class(id_protected[144], id_protected[145]).id_class(n2).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + (f4 += (float)(n * id_catch[13])), id_protected[146]).id_class(id_protected[147], id_protected[148]).id_class(n2).id_class();
        id_strictfp.id_class(rjV_22, f + (f3 += (float)(n * id_catch[12])), f2 + f4, id_protected[149]).id_class(id_protected[150], id_protected[151]).id_class(n2).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2, id_protected[152]).id_class(id_protected[153], id_protected[154]).id_class(n2).id_class();
        id_default.id_break();
        RenderSystem.disableTexture();
        RenderSystem.disableBlend();
    }

    public static void id_class(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, int n, float f4) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        GL11.glPointSize((float)(f3 * id_protected[224] * f4));
        lD_22.id_class(rjV_22, f, f2, id_protected[225]).id_class(n).id_class();
    }

    public static void id_class(Ml_1 ml_1, iB_2 iB_22, float f, float f2, int n, int n2, float f3, float f4, float f5, int n3) {
        rqO_2 rqO_22 = id_import.id_case().id_class(iB_22).id_class(iB_22);
        id_import.A().id_class(rqO_22);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableAlphaTest();
        rrfa_3.id_class();
        ((ShaderManager)id_class[id_case[99]]).id_protected();
        ((ShaderManager)id_class[id_case[100]]).id_break(id_byte[38], n);
        ((ShaderManager)id_class[id_case[101]]).id_break(id_byte[39], n2);
        ((ShaderManager)id_class[id_case[102]]).id_break(id_byte[40], f3);
        ((ShaderManager)id_class[id_case[103]]).id_break(id_byte[41], f4);
        ((ShaderManager)id_class[id_case[104]]).id_break(id_byte[42], f5);
        ((ShaderManager)id_class[id_case[105]]).id_class(id_byte[43], (float)ColorHelper.id_byte(n3) / id_protected[236], (float)ColorHelper.id_protected(n3) / id_protected[237], (float)ColorHelper.id_break(n3) / id_protected[238]);
        ShaderManager.id_break(ml_1, f, f2, n, n2);
        ((ShaderManager)id_class[id_case[106]]).id_byte();
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, float f5, float f6) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        float f7 = id_protected[265] / f5;
        float f8 = id_protected[266] / f6;
        id_strictfp.id_class((int)id_catch[33], ju_3.id_synchronized);
        id_strictfp.id_class(rjV_22, f, f2 + (float)n4, id_protected[267]).id_class(f3 * f7, (f4 + (float)n2) * f8).id_class();
        id_strictfp.id_class(rjV_22, f + (float)n3, f2 + (float)n4, id_protected[268]).id_class((f3 + (float)n) * f7, (f4 + (float)n2) * f8).id_class();
        id_strictfp.id_class(rjV_22, f + (float)n3, f2, id_protected[269]).id_class((f3 + (float)n) * f7, f4 * f8).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[270]).id_class(f3 * f7, f4 * f8).id_class();
        id_default.id_break();
    }

    public static void id_class(Ml_1 ml_1, rLR rLR2, float f, float f2, float f3) {
        ml_1.id_class();
        fj_3 fj_32 = id_import.id_abstract().id_class(rLR2);
        id_static.id_class(fj_32.id_extends().id_protected());
        ml_1.id_class((double)f, (double)f2, id_break[2]);
        ml_1.id_class(f3, f3, f3);
        ch_3.id_class(ml_1, id_throws[14], id_throws[15], id_throws[16], (int)id_catch[26], (int)id_catch[27], fj_32);
        ml_1.id_break();
    }

    public static void id_class(Ml_1 ml_1, rfl_3 rfl_32, rpr_3 rpr_32, int n) {
        rfl_3 rfl_33 = rrfD_2.id_class(rfl_32, rpr_32);
        rrfD_2.id_class(ml_1, rfl_33, n);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = ColorHelper.id_break(n3, n7);
        int n9 = ColorHelper.id_break(n4, n7);
        int n10 = ColorHelper.id_break(n5, n7);
        int n11 = ColorHelper.id_break(n6, n7);
        float f6 = f3 + f5 * id_protected[184];
        float f7 = f4 + f5 * id_protected[185];
        rrfD_2.id_class(ml_1, f - f5, f2 - f5, f6, f7, (float)n, (float)n2, n8, n9, n10, n11);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4, int n5) {
        int n6 = ColorHelper.id_break(n, n5);
        int n7 = ColorHelper.id_break(n2, n5);
        int n8 = ColorHelper.id_break(n3, n5);
        int n9 = ColorHelper.id_break(n4, n5);
        float f7 = f3 + f5 * id_protected[188];
        float f8 = f4 + f5 * id_protected[189];
        rrfD_2.id_class(ml_1, f - f5, f2 - f5, f7, f8, id_protected[190], f6, n6, n7, n8, n9);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n) {
        rrfD_2.id_class(ml_1, id_strictfp, f, f2, f3, f4, n);
    }

    public static void id_class(Ml_1 ml_1, rqO_2 rqO_22, float f, float f2, float f3, float f4, int n) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_case[15], id_case[16]);
        rrfa_3.id_class(n);
        id_import.A().id_class(rqO_22);
        GL11.glTexParameteri((int)id_case[17], (int)id_case[18], (int)id_case[19]);
        rrfD_2.id_class(ml_1, f, f2, id_protected[24], id_protected[25], f3, f4, f3, f4);
        RenderSystem.disableBlend();
        rrfa_3.id_class();
    }

    public static void id_class(Ml_1 ml_1, rqO_2 rqO_22, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        RenderSystem.enableSmoothShadeModel();
        RenderSystem.disableAlphaTest();
        RenderSystem.depthMask(id_throws[0]);
        id_import.A().id_class(rqO_22);
        GL11.glTexParameteri((int)id_case[20], (int)id_case[21], (int)id_case[22]);
        rrfD_2.id_class(ml_1, f, f2, id_protected[26], id_protected[27], f3, f4, f3, f4, n, n2, n3, n4);
        RenderSystem.enableAlphaTest();
        RenderSystem.depthMask(id_throws[1]);
        RenderSystem.disableSmoothShadeModel();
    }

    public static void id_class(lD_2 lD_22) {
        RenderSystem.enableTexture();
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.alphaFunc(id_case[60], id_protected[155]);
        id_default.id_class(lD_22);
        RenderSystem.disableTexture();
        RenderSystem.disableBlend();
    }

    private static rfl_3 id_class(rfl_3 rfl_32, rpr_3 rpr_32) {
        return switch (((int[])rrfU_2.id_class[id_case[112]])[rpr_32.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_break, rfl_32.id_case);
            case 2 -> new rfl_3(rfl_32.id_class, rfl_32.id_throws, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case);
            case 3 -> new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_byte);
            case 4 -> new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_case, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case);
            case 5 -> new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_class, rfl_32.id_throws, rfl_32.id_case);
            case 6 -> new rfl_3(rfl_32.id_protected, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case);
        };
    }

    private static int id_class(int n, int n2, int n3) {
        int n4 = (n * id_case[61] + n2) * id_case[62] + n3;
        Integer n5 = (Integer)((HashMap)id_class[id_case[63]]).get(n4);
        if (n5 != null) {
            return n5;
        }
        BufferedImage bufferedImage = new BufferedImage(n + n3 * id_catch[18], n2 + n3 * id_catch[19], id_catch[20]);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(n3, n3, n, n2);
        graphics.dispose();
        GaussianFilter gaussianFilter = new GaussianFilter((float)n3);
        BufferedImage bufferedImage2 = gaussianFilter.filter(bufferedImage, null);
        try {
            n5 = rrjr_3.id_class(bufferedImage2, id_throws[3], id_throws[4], id_throws[5], id_throws[6]).id_new();
            ((HashMap)id_class[id_case[64]]).put(n4, n5);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return n5 != null ? n5 : id_catch[21];
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        float f9 = id_protected[48] / f7;
        float f10 = id_protected[49] / f8;
        id_strictfp.id_class((int)id_catch[8], ju_3.id_synchronized);
        id_strictfp.id_class(rjV_22, f, f2 + f6, id_protected[50]).id_class(f3 * f9, (f4 + f6) * f10).id_class();
        id_strictfp.id_class(rjV_22, f + f5, f2 + f6, id_protected[51]).id_class((f3 + f5) * f9, (f4 + f6) * f10).id_class();
        id_strictfp.id_class(rjV_22, f + f5, f2, id_protected[52]).id_class((f3 + f5) * f9, f4 * f10).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[53]).id_class(f3 * f9, f4 * f10).id_class();
        id_default.id_break();
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        id_strictfp.id_class(rjV_22, f, f2, f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[271], f2, f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[272], f2, f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[273], f2, f3 + id_protected[274]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[275], f2, f3 + id_protected[276]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, f3 + id_protected[277]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, f3 + id_protected[278]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + id_protected[279], f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[280], f2 + id_protected[281], f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[282], f2 + id_protected[283], f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[284], f2 + id_protected[285], f3 + id_protected[286]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[287], f2 + id_protected[288], f3 + id_protected[289]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + id_protected[290], f3 + id_protected[291]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + id_protected[292], f3 + id_protected[293]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + id_protected[294], f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[295], f2, f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[296], f2 + id_protected[297], f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[298], f2, f3 + id_protected[299]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + id_protected[300], f2 + id_protected[301], f3 + id_protected[302]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, f3 + id_protected[303]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + id_protected[304], f3 + id_protected[305]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, f3).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2 + id_protected[306], f3).id_class(n).id_class();
    }

    private static float id_class(float f, float f2, float f3, float f4, float f5) {
        float f6 = id_protected[39] - f5;
        float f7 = f5 * f5;
        float f8 = f6 * f6;
        float f9 = f8 * f6;
        float f10 = f7 * f5;
        float f11 = f9 * f;
        f11 += id_protected[40] * f8 * f5 * f2;
        f11 += id_protected[41] * f6 * f7 * f3;
        return f11 += f10 * f4;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, 88, 81, -118, -119, 36, -111, 123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(Ml_1 ml_1, rdn_3 rdn_32, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        rrfD_2.id_class(ml_1, rdn_32, f, f2, f3, f4, f5, f6, n, id_throws[11]);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        rrfa_3.id_class();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        ((ShaderManager)id_class[id_case[6]]).id_class();
        ((ShaderManager)id_class[id_case[7]]).id_break(id_byte[0], f3);
        ((ShaderManager)id_class[id_case[8]]).id_break(id_byte[1], f4);
        ((ShaderManager)id_class[id_case[9]]).id_break(id_byte[2], f5);
        ((ShaderManager)id_class[id_case[10]]).id_break(id_byte[3], (float)ColorHelper.id_byte(n) / id_protected[8], (float)ColorHelper.id_protected(n) / id_protected[9], (float)ColorHelper.id_break(n) / id_protected[10], (float)ColorHelper.id_throws(n) / id_protected[11]);
        ((ShaderManager)id_class[id_case[11]]).id_break(id_byte[4], (float)ColorHelper.id_byte(n2) / id_protected[12], (float)ColorHelper.id_protected(n2) / id_protected[13], (float)ColorHelper.id_break(n2) / id_protected[14], (float)ColorHelper.id_throws(n2) / id_protected[15]);
        ((ShaderManager)id_class[id_case[12]]).id_break(id_byte[5], (float)ColorHelper.id_byte(n3) / id_protected[16], (float)ColorHelper.id_protected(n3) / id_protected[17], (float)ColorHelper.id_break(n3) / id_protected[18], (float)ColorHelper.id_throws(n3) / id_protected[19]);
        ((ShaderManager)id_class[id_case[13]]).id_break(id_byte[6], (float)ColorHelper.id_byte(n4) / id_protected[20], (float)ColorHelper.id_protected(n4) / id_protected[21], (float)ColorHelper.id_break(n4) / id_protected[22], (float)ColorHelper.id_throws(n4) / id_protected[23]);
        ShaderManager.id_break(ml_1, f, f2, f3, f4);
        ((ShaderManager)id_class[id_case[14]]).id_break();
        RenderSystem.disableBlend();
    }

    public static void id_class(Ml_1 ml_1, rqO_2 rqO_22, boolean bl, float f, float f2, int n, int n2, float f3) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableAlphaTest();
        id_import.A().id_class(rqO_22);
        RenderSystem.color4f(id_protected[239], id_protected[240], id_protected[241], f3);
        rrfD_2.id_class(ml_1, f, f2, id_protected[242], id_protected[243], (int)id_catch[28], (int)id_catch[29], n, n2, id_protected[244], id_protected[245]);
        if (bl) {
            rrfD_2.id_class(ml_1, f, f2, id_protected[246], id_protected[247], (int)id_catch[30], (int)id_catch[31], n, n2, id_protected[248], id_protected[249]);
        }
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
    }

    public static void id_class(Ml_1 ml_1, rdn_3 rdn_32, float f, float f2, float f3, float f4, float f5, float f6, int n, boolean bl) {
        rrfD_2.id_class(ml_1, rdn_32, f, f2, f3, f4, f5, f6, n, bl, id_throws[12]);
    }

    public static void id_class(Ml_1 ml_1, lD_2 lD_22, float f, int n, int n2, int n3, int n4) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        lD_22.id_class((int)id_catch[10], ju_3.id_public);
        lD_22.id_class(rjV_22, -f, -f, id_protected[60]).id_class(id_protected[61], id_protected[62]).id_class(n).id_class();
        lD_22.id_class(rjV_22, -f, f, id_protected[63]).id_class(id_protected[64], id_protected[65]).id_class(n2).id_class();
        lD_22.id_class(rjV_22, f, f, id_protected[66]).id_class(id_protected[67], id_protected[68]).id_class(n3).id_class();
        lD_22.id_class(rjV_22, f, -f, id_protected[69]).id_class(id_protected[70], id_protected[71]).id_class(n4).id_class();
        id_default.id_class(lD_22);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();
        ((ShaderManager)id_class[id_case[76]]).id_protected();
        float f9 = id_protected[213];
        float f10 = (float)ColorHelper.id_byte(n) / id_protected[214];
        float f11 = (float)ColorHelper.id_protected(n) / id_protected[215];
        float f12 = (float)ColorHelper.id_break(n) / id_protected[216];
        float f13 = (float)ColorHelper.id_throws(n) / id_protected[217];
        ((ShaderManager)id_class[id_case[77]]).id_class(id_byte[31], f * f9, (float)id_const.id_native() - f4 * f9 - f2 * f9);
        ((ShaderManager)id_class[id_case[78]]).id_class(id_byte[32], f3 * f9, f4 * f9);
        ((ShaderManager)id_class[id_case[79]]).id_class(id_byte[33], f5 * f9, f6 * f9, f8 * f9, f7 * f9);
        ((ShaderManager)id_class[id_case[80]]).id_class(id_byte[34], f10, f11, f12, f13);
        ((ShaderManager)id_class[id_case[81]]).id_class(id_byte[35], f10, f11, f12, f13);
        ((ShaderManager)id_class[id_case[82]]).id_class(id_byte[36], f10, f11, f12, f13);
        ((ShaderManager)id_class[id_case[83]]).id_class(id_byte[37], f10, f11, f12, f13);
        ShaderManager.id_break(ml_1, f - id_protected[218], f2 - id_protected[219], f3 + id_protected[220], f4 + id_protected[221]);
        ((ShaderManager)id_class[id_case[84]]).id_byte();
        RenderSystem.disableBlend();
        RenderSystem.disableAlphaTest();
    }

    public static void id_class(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        lD_22.id_class(rjV_22, f, f2 + f4, id_protected[4]).id_class(n).id_class();
        lD_22.id_class(rjV_22, f + f3, f2 + f4, id_protected[5]).id_class(n).id_class();
        lD_22.id_class(rjV_22, f + f3, f2, id_protected[6]).id_class(n).id_class();
        lD_22.id_class(rjV_22, f, f2, id_protected[7]).id_class(n).id_class();
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, int n5, boolean bl, float f5) {
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[65]]).id_private().w().id_goto()) {
            byte by = id_catch[22];
            byte by2 = id_catch[23];
            rrfD_2.id_class(ml_1, f - (float)by, f2 - (float)by, f3 + (float)(by * id_catch[24]), f4 + (float)(by * id_catch[25]), (float)by2, (float)by2, n2, n3, n4, n5);
        }
        rrfD_2.id_class(ml_1, f, f2, f3, f4, f5, f5, f5, f5, ColorHelper.id_break(rrZF.j_, n));
        if (bl) {
            rrfD_2.id_break(ml_1, f - id_protected[169], f2 - id_protected[170], f3 + id_protected[171], id_protected[172], f5, f5, id_protected[173], id_protected[174], n2, n3, n4, n5);
        }
        rrfD_2.id_break(ml_1, f - id_protected[175], f2 - id_protected[176], f3 + id_protected[177], f4 + id_protected[178], f5 + id_protected[179], n2, n3, n4, n5);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, int n2, int n3, int n4) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        float f9 = id_protected[54] / f7;
        float f10 = id_protected[55] / f8;
        id_strictfp.id_class((int)id_catch[9], ju_3.id_public);
        id_strictfp.id_class(rjV_22, f, f2 + f6, id_protected[56]).id_class(f3 * f9, (f4 + f6) * f10).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f5, f2 + f6, id_protected[57]).id_class((f3 + f5) * f9, (f4 + f6) * f10).id_class(n2).id_class();
        id_strictfp.id_class(rjV_22, f + f5, f2, id_protected[58]).id_class((f3 + f5) * f9, f4 * f10).id_class(n3).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[59]).id_class(f3 * f9, f4 * f10).id_class(n4).id_class();
        id_default.id_break();
    }

    public static void id_class() {
        if (!((HashMap)id_class[id_case[0]]).isEmpty()) {
            if (!RenderSystem.isOnRenderThread()) {
                RenderSystem.recordRenderCall(() -> {
                    for (Integer n : ((HashMap)id_class[id_case[113]]).values()) {
                        GL11.glDeleteTextures((int)n);
                    }
                    ((HashMap)id_class[id_case[114]]).clear();
                });
            } else {
                for (Integer n : ((HashMap)id_class[id_case[1]]).values()) {
                    GL11.glDeleteTextures((int)n);
                }
                ((HashMap)id_class[id_case[2]]).clear();
            }
        }
    }

    public static void id_class(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        lD_22.id_class(rjV_22, f, f2 + f4, id_protected[94]).id_class(n).id_class();
        lD_22.id_class(rjV_22, f + f3, f2 + f4, id_protected[95]).id_class(n2).id_class();
        lD_22.id_class(rjV_22, f + f3, f2, id_protected[96]).id_class(n3).id_class();
        lD_22.id_class(rjV_22, f, f2, id_protected[97]).id_class(n4).id_class();
    }

    public static void id_class(Ml_1 ml_1, lD_2 lD_22, rdn_3 rdn_32, float f, float f2, boolean bl, boolean bl2, float f3, float f4, int n) {
        ml_1.id_class();
        ml_1.id_class((double)f, (double)f2, id_break[1]);
        MT.id_transient();
        MT.id_byte(f, f2, id_protected[226]);
        MT.id_break(f3, f3, f3);
        MT.id_volatile();
        if (!bl) {
            Hz_1.id_protected = id_throws[9];
        }
        id_short.id_class(rdn_32, id_protected[227], id_protected[228]);
        if (bl2) {
            id_short.id_class(ml_1, lD_22, rdn_32, id_protected[229], f4, (float)n, (int)id_case[97]);
        }
        Hz_1.id_protected = id_throws[10];
        MT.id_native();
        MT.id_for();
        ml_1.id_break();
    }

    public static void id_class(Ml_1 ml_1, rdn_3 rdn_32, float f, float f2, float f3, float f4, float f5, float f6, int n, boolean bl, boolean bl2) {
        MT.id_transient();
        MT.id_byte(f, f2, id_protected[230]);
        MT.id_break(f4, f4, f4);
        MT.id_volatile();
        Hz_1.id_protected = bl;
        id_short.id_class(ml_1, rdn_32, id_protected[231], id_protected[232], f3);
        if (n > 0) {
            id_short.id_class(ml_1, rdn_32, f5, f6, (float)n, f3 * id_protected[233]);
        }
        if (bl2) {
            id_short.id_class((cm_3)rrfD_2.id_import.id_class[id_case[98]], rdn_32, id_protected[234], id_protected[235], null, f3);
        }
        Hz_1.id_protected = id_throws[13];
        MT.id_native();
        MT.id_for();
    }

    public static void id_break(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, int n2) {
        float f5;
        if (f < f3) {
            f5 = f;
            f = f3;
            f3 = f5;
        }
        if (f2 < f4) {
            f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        rrfD_2.id_break(ml_1, f - id_protected[307], f2 - id_protected[308], f + id_protected[309] + f3, f2 + id_protected[310] + f4, n2);
        rrfD_2.id_break(ml_1, f, f2, f + f3, f2 + f4, n);
    }

    public static void id_break(Ml_1 ml_1, lD_2 lD_22, float f, int n, int n2, int n3, int n4) {
        rrfD_2.id_byte(ml_1, lD_22, f, n, n2, n3, n4);
    }

    public static void id_break() {
        id_default.id_break();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.disableSmoothShadeModel();
    }

    public static void id_break(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, int n2, int n3, int n4) {
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();
        ((ShaderManager)id_class[id_case[37]]).id_protected();
        float f9 = id_protected[98];
        ((ShaderManager)id_class[id_case[38]]).id_class(id_byte[7], f * f9, (float)id_const.id_native() - f4 * f9 - f2 * f9);
        ((ShaderManager)id_class[id_case[39]]).id_class(id_byte[8], f3 * f9, f4 * f9);
        ((ShaderManager)id_class[id_case[40]]).id_class(id_byte[9], f5 * f9, f6 * f9, f8 * f9, f7 * f9);
        ((ShaderManager)id_class[id_case[41]]).id_class(id_byte[10], (float)ColorHelper.id_byte(n) / id_protected[99], (float)ColorHelper.id_protected(n) / id_protected[100], (float)ColorHelper.id_break(n) / id_protected[101], (float)ColorHelper.id_throws(n) / id_protected[102]);
        ((ShaderManager)id_class[id_case[42]]).id_class(id_byte[11], (float)ColorHelper.id_byte(n2) / id_protected[103], (float)ColorHelper.id_protected(n2) / id_protected[104], (float)ColorHelper.id_break(n2) / id_protected[105], (float)ColorHelper.id_throws(n2) / id_protected[106]);
        ((ShaderManager)id_class[id_case[43]]).id_class(id_byte[12], (float)ColorHelper.id_byte(n3) / id_protected[107], (float)ColorHelper.id_protected(n3) / id_protected[108], (float)ColorHelper.id_break(n3) / id_protected[109], (float)ColorHelper.id_throws(n3) / id_protected[110]);
        ((ShaderManager)id_class[id_case[44]]).id_class(id_byte[13], (float)ColorHelper.id_byte(n4) / id_protected[111], (float)ColorHelper.id_protected(n4) / id_protected[112], (float)ColorHelper.id_break(n4) / id_protected[113], (float)ColorHelper.id_throws(n4) / id_protected[114]);
        ShaderManager.id_break(ml_1, f - id_protected[115], f2 - id_protected[116], f3 + id_protected[117], f4 + id_protected[118]);
        ((ShaderManager)id_class[id_case[45]]).id_byte();
        RenderSystem.disableBlend();
        RenderSystem.disableAlphaTest();
    }

    public static void id_break(lD_2 lD_22) {
        id_default.id_class(lD_22);
        GL11.glEnable((int)id_case[96]);
        RenderSystem.disableBlend();
        RenderSystem.enableTexture();
    }

    public static void id_break(Ml_1 ml_1, float f, float f2, float f3, float f4, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        id_strictfp.id_class(rjV_22, f, f4, id_protected[311]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f3, f4, id_protected[312]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f3, f2, id_protected[313]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[314]).id_class(n).id_class();
    }

    public static void id_break(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, int n, int n2) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        MT.id_super(rrfD_2.id_class((int)f3, (int)f4, n));
        lD_22.id_class(rjV_22, f -= (float)n, f2 -= (float)n, id_protected[156]).id_class(id_protected[157], id_protected[158]).id_class(n2).id_class();
        lD_22.id_class(rjV_22, f, f2 + (f4 += (float)(n * id_catch[17])), id_protected[159]).id_class(id_protected[160], id_protected[161]).id_class(n2).id_class();
        lD_22.id_class(rjV_22, f + (f3 += (float)(n * id_catch[16])), f2 + f4, id_protected[162]).id_class(id_protected[163], id_protected[164]).id_class(n2).id_class();
        lD_22.id_class(rjV_22, f + f3, f2, id_protected[165]).id_class(id_protected[166], id_protected[167]).id_class(n2).id_class();
    }

    public static void id_break(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        rrfD_2.id_class(ml_1, f, f2, f3, f4, f5, id_protected[140], id_protected[141], n, n2, n3, n4);
    }

    private static void id_throws() {
        float[] fArray = new float[315];
        fArray[8] = 255.0f;
        fArray[9] = 255.0f;
        fArray[10] = 255.0f;
        fArray[11] = 255.0f;
        fArray[12] = 255.0f;
        fArray[13] = 255.0f;
        fArray[14] = 255.0f;
        fArray[15] = 255.0f;
        fArray[16] = 255.0f;
        fArray[17] = 255.0f;
        fArray[18] = 255.0f;
        fArray[19] = 255.0f;
        fArray[20] = 255.0f;
        fArray[21] = 255.0f;
        fArray[22] = 255.0f;
        fArray[23] = 255.0f;
        fArray[32] = 0.25f;
        fArray[33] = 0.75f;
        fArray[35] = 20.0f;
        fArray[38] = 2.0f;
        fArray[39] = 1.0f;
        fArray[40] = 3.0f;
        fArray[41] = 3.0f;
        fArray[42] = 1.0f;
        fArray[43] = 1.0f;
        fArray[48] = 1.0f;
        fArray[49] = 1.0f;
        fArray[54] = 1.0f;
        fArray[55] = 1.0f;
        fArray[65] = 1.0f;
        fArray[67] = 1.0f;
        fArray[68] = 1.0f;
        fArray[70] = 1.0f;
        fArray[77] = 1.0f;
        fArray[79] = 1.0f;
        fArray[80] = 1.0f;
        fArray[82] = 1.0f;
        fArray[84] = 180.0f;
        fArray[86] = 1.5f;
        fArray[88] = 2.0f;
        fArray[89] = -0.5f;
        fArray[91] = -2.3f;
        fArray[92] = -0.5f;
        fArray[98] = 2.0f;
        fArray[99] = 255.0f;
        fArray[100] = 255.0f;
        fArray[101] = 255.0f;
        fArray[102] = 255.0f;
        fArray[103] = 255.0f;
        fArray[104] = 255.0f;
        fArray[105] = 255.0f;
        fArray[106] = 255.0f;
        fArray[107] = 255.0f;
        fArray[108] = 255.0f;
        fArray[109] = 255.0f;
        fArray[110] = 255.0f;
        fArray[111] = 255.0f;
        fArray[112] = 255.0f;
        fArray[113] = 255.0f;
        fArray[114] = 255.0f;
        fArray[115] = 1.0f;
        fArray[116] = 1.0f;
        fArray[117] = 2.0f;
        fArray[118] = 2.0f;
        fArray[120] = 255.0f;
        fArray[121] = 255.0f;
        fArray[122] = 255.0f;
        fArray[123] = 255.0f;
        fArray[124] = 255.0f;
        fArray[125] = 255.0f;
        fArray[126] = 255.0f;
        fArray[127] = 255.0f;
        fArray[128] = 255.0f;
        fArray[129] = 255.0f;
        fArray[130] = 255.0f;
        fArray[131] = 255.0f;
        fArray[132] = 255.0f;
        fArray[133] = 255.0f;
        fArray[134] = 255.0f;
        fArray[135] = 255.0f;
        fArray[136] = 1.0f;
        fArray[137] = 1.0f;
        fArray[138] = 2.0f;
        fArray[139] = 2.0f;
        fArray[140] = 1.1f;
        fArray[141] = 0.5f;
        fArray[148] = 1.0f;
        fArray[150] = 1.0f;
        fArray[151] = 1.0f;
        fArray[153] = 1.0f;
        fArray[161] = 1.0f;
        fArray[163] = 1.0f;
        fArray[164] = 1.0f;
        fArray[166] = 1.0f;
        fArray[168] = 4.0f;
        fArray[169] = 0.5f;
        fArray[170] = 0.5f;
        fArray[171] = 1.0f;
        fArray[172] = 12.0f;
        fArray[175] = 1.5f;
        fArray[176] = 1.5f;
        fArray[177] = 3.0f;
        fArray[178] = 3.0f;
        fArray[179] = 1.0f;
        fArray[180] = 2.0f;
        fArray[181] = 2.0f;
        fArray[182] = 3.0f;
        fArray[183] = 8.0f;
        fArray[184] = 2.0f;
        fArray[185] = 2.0f;
        fArray[186] = 2.0f;
        fArray[187] = 2.0f;
        fArray[188] = 2.0f;
        fArray[189] = 2.0f;
        fArray[190] = 3.0f;
        fArray[191] = 255.0f;
        fArray[192] = 255.0f;
        fArray[193] = 255.0f;
        fArray[194] = 255.0f;
        fArray[195] = 255.0f;
        fArray[196] = 255.0f;
        fArray[197] = 255.0f;
        fArray[198] = 255.0f;
        fArray[199] = 255.0f;
        fArray[200] = 255.0f;
        fArray[201] = 255.0f;
        fArray[202] = 255.0f;
        fArray[203] = 255.0f;
        fArray[204] = 255.0f;
        fArray[205] = 255.0f;
        fArray[206] = 255.0f;
        fArray[207] = 1.0f;
        fArray[208] = 1.0f;
        fArray[209] = 2.0f;
        fArray[210] = 2.0f;
        fArray[211] = 2.0f;
        fArray[212] = 2.0f;
        fArray[213] = 2.0f;
        fArray[214] = 255.0f;
        fArray[215] = 255.0f;
        fArray[216] = 255.0f;
        fArray[217] = 255.0f;
        fArray[218] = 1.0f;
        fArray[219] = 1.0f;
        fArray[220] = 2.0f;
        fArray[221] = 2.0f;
        fArray[222] = 2.0f;
        fArray[224] = 2.0f;
        fArray[233] = 255.0f;
        fArray[236] = 255.0f;
        fArray[237] = 255.0f;
        fArray[238] = 255.0f;
        fArray[239] = 1.0f;
        fArray[240] = 1.0f;
        fArray[241] = 1.0f;
        fArray[242] = 8.0f;
        fArray[243] = 8.0f;
        fArray[244] = 64.0f;
        fArray[245] = 64.0f;
        fArray[246] = 40.0f;
        fArray[247] = 8.0f;
        fArray[248] = 64.0f;
        fArray[249] = 64.0f;
        fArray[250] = 2.0f;
        fArray[251] = 2.0f;
        fArray[252] = 2.0f;
        fArray[258] = 1.0f;
        fArray[260] = 1.0f;
        fArray[261] = 1.0f;
        fArray[263] = 1.0f;
        fArray[265] = 1.0f;
        fArray[266] = 1.0f;
        fArray[271] = 1.0f;
        fArray[272] = 1.0f;
        fArray[273] = 1.0f;
        fArray[274] = 1.0f;
        fArray[275] = 1.0f;
        fArray[276] = 1.0f;
        fArray[277] = 1.0f;
        fArray[278] = 1.0f;
        fArray[279] = 1.0f;
        fArray[280] = 1.0f;
        fArray[281] = 1.0f;
        fArray[282] = 1.0f;
        fArray[283] = 1.0f;
        fArray[284] = 1.0f;
        fArray[285] = 1.0f;
        fArray[286] = 1.0f;
        fArray[287] = 1.0f;
        fArray[288] = 1.0f;
        fArray[289] = 1.0f;
        fArray[290] = 1.0f;
        fArray[291] = 1.0f;
        fArray[292] = 1.0f;
        fArray[293] = 1.0f;
        fArray[294] = 1.0f;
        fArray[295] = 1.0f;
        fArray[296] = 1.0f;
        fArray[297] = 1.0f;
        fArray[298] = 1.0f;
        fArray[299] = 1.0f;
        fArray[300] = 1.0f;
        fArray[301] = 1.0f;
        fArray[302] = 1.0f;
        fArray[303] = 1.0f;
        fArray[304] = 1.0f;
        fArray[305] = 1.0f;
        fArray[306] = 1.0f;
        fArray[307] = 0.5f;
        fArray[308] = 0.5f;
        fArray[309] = 0.5f;
        fArray[310] = 0.5f;
        id_protected = fArray;
    }

    public static void id_throws(lD_2 lD_22) {
        lD_22.id_class((int)id_catch[1], ju_3.id_this);
    }

    private static /* synthetic */ void ntfClinit() {
        rrfD_2.id_case();
        rrfD_2.id_private();
        rrfD_2.id_byte();
        rrfD_2.id_throws();
        rrfD_2.id_protected();
        rrfD_2.id_implements();
        rrfD_2.id_catch();
    }

    public static void id_catch(lD_2 lD_22) {
        RenderSystem.enableSmoothShadeModel();
        RenderSystem.enableBlend();
        RenderSystem.enableTexture();
        RenderSystem.disableAlphaTest();
        GL11.glTexParameteri((int)id_case[3], (int)id_case[4], (int)id_case[5]);
        id_default.id_class(lD_22);
        RenderSystem.disableTexture();
        RenderSystem.disableBlend();
        RenderSystem.disableSmoothShadeModel();
        RenderSystem.enableAlphaTest();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new ShaderManager(id_byte[47], true), new ShaderManager(id_byte[48], false), new ShaderManager(id_byte[49], false), new ShaderManager(id_byte[50], false), new ShaderManager(id_byte[51], false), new ShaderManager(id_byte[52], false), new HashMap(), new lD_2(256), new lD_2(256)};
        id_class = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[26];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[18] = true;
        blArray[21] = true;
        id_throws = blArray;
    }

    public static void id_case(lD_2 lD_22) {
        lD_22.id_class((int)id_catch[15], ju_3.id_public);
    }

    private static void id_implements() {
        id_catch = new byte[]{7, 7, 7, 7, 3, 20, 20, 7, 7, 7, 7, 4, 2, 2, 7, 7, 2, 2, 2, 2, 3, -1, 3, 6, 2, 2, 18, 18, 8, 8, 8, 8, 7, 7, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    private static void id_protected() {
        id_break = new double[3];
    }

    public static void id_protected(Ml_1 ml_1, float f, float f2, float f3, float f4, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        id_strictfp.id_class((int)id_catch[0], ju_3.id_this);
        id_strictfp.id_class(rjV_22, f, f2 + f4, id_protected[0]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2 + f4, id_protected[1]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2, id_protected[2]).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[3]).id_class(n).id_class();
        id_default.id_break();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }

    public static void id_protected(lD_2 lD_22) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_case[91], id_case[92]);
        RenderSystem.disableTexture();
        GL11.glEnable((int)id_case[93]);
        GL11.glHint((int)id_case[94], (int)id_case[95]);
        lD_22.id_class(id_throws[8], ju_3.id_this);
    }

    private static void id_private() {
        id_byte = new String[]{new String("width"), new String("height"), new String("radius"), new String("color1"), new String("color2"), new String("color3"), new String("color4"), new String("location"), new String("rectSize"), new String("cornerRadii"), new String("color1"), new String("color2"), new String("color3"), new String("color4"), new String("width"), new String("height"), new String("radius"), new String("thickness"), new String("smoothness"), new String("color"), new String("color2"), new String("color3"), new String("color4"), new String("width"), new String("height"), new String("radius"), new String("glowRadius"), new String("color1"), new String("color2"), new String("color3"), new String("color4"), new String("location"), new String("rectSize"), new String("cornerRadii"), new String("color1"), new String("color2"), new String("color3"), new String("color4"), new String("width"), new String("height"), new String("radius"), new String("hurtStrength"), new String("alpha"), new String("hurtColor"), new String("rectSize"), new String("radius"), new String("alpha"), new String("gradient_rect"), new String("glow_rect"), new String("outline_gradient_rect"), new String("rounded_texture"), new String("targethud_head"), new String("colored_texture")};
    }

    public static void id_private(lD_2 lD_22) {
        RenderSystem.enableSmoothShadeModel();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        id_default.id_class(lD_22);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.disableSmoothShadeModel();
    }
}

