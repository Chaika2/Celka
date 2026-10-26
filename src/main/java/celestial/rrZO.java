/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.MT;
import celestial.Ml_1;
import celestial.fk_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.manager.ShaderManager;
import celestial.rgP_2;
import celestial.rrZM;
import celestial.rrZX;
import celestial.rrZb_1;
import celestial.rrZh_1;
import celestial.rrZx_1;
import celestial.rrfa_3;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZO
extends rrZb_1 {
    private static String[] id_protected;
    private static float[] id_throws;
    private static boolean[] id_case;
    private static int[] id_catch;
    public Object[] id_break;
    private static short[] id_private;
    private static double[] id_implements;
    public static Object[] id_byte;
    private static byte[] id_finally;

    public void id_byte(lD_2 lD_22) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_private[41], id_private[42]);
        RenderSystem.enableTexture();
        RenderSystem.bindTexture(((fk_3)this.id_class[id_private[43]]).id_new());
        id_default.id_class(lD_22);
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{30, -45, 0, 18, -34, -74, 28, -86}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public float id_byte(Ml_1 ml_1, String string, float f, float f2, int n) {
        return this.id_break(ml_1, string, f, f2, n, id_case[19], id_case[20]);
    }

    public float id_byte(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl) {
        return this.id_protected(ml_1, string, f - this.id_break(string) / id_throws[0], f2, n, bl);
    }

    public void id_byte(Ml_1 ml_1, lD_2 lD_22, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        this.id_protected(ml_1, lD_22, string, d - id_implements[26], d2, id_catch[17], bl, bl2);
        this.id_protected(ml_1, lD_22, string, d + id_implements[27], d2, id_catch[18], bl, bl2);
        this.id_protected(ml_1, lD_22, string, d, d2 - id_implements[28], id_catch[19], bl, bl2);
        this.id_protected(ml_1, lD_22, string, d, d2 + id_implements[29], id_catch[20], bl, bl2);
        this.id_protected(ml_1, lD_22, string, d, d2, n, bl, bl2);
    }

    public rrZO(Font font, rrZx_1 rrZx_12, boolean bl, boolean bl2, boolean bl3) {
        super(font, rrZx_12, bl, bl2, bl3);
        this.id_case();
        int[] nArray = new int[id_finally[0]];
        this.id_break[rrZO.id_private[0]] = nArray;
        for (int i = id_case[0]; i < id_finally[1]; ++i) {
            int n = (i >> id_finally[2] & id_case[1]) * id_finally[3];
            int n2 = (i >> id_finally[4] & id_case[2]) * id_private[1] + n;
            int n3 = (i >> id_case[3] & id_case[4]) * id_private[2] + n;
            int n4 = (i & id_case[5]) * id_private[3] + n;
            if (i == id_finally[5]) {
                n2 += 85;
            }
            if (i >= id_finally[6]) {
                n2 /= id_finally[7];
                n3 /= id_finally[8];
                n4 /= id_finally[9];
            }
            ((int[])this.id_break[rrZO.id_private[4]])[i] = (n2 & id_private[5]) << id_finally[10] | (n3 & id_private[6]) << id_finally[11] | n4 & id_private[7];
        }
    }

    static {
        rrZO.ntfClinit();
    }

    public void id_class(Ml_1 ml_1, String string, float f, float f2, int n, float f3, float f4, float f5) {
        float f6 = rrfa_3.id_class(ml_1);
        ((ShaderManager)id_byte[id_private[8]]).id_class();
        ((ShaderManager)id_byte[id_private[9]]).id_break(id_protected[0], (float)(n >> id_finally[12] & id_private[10]) / id_throws[6], (float)(n >> id_finally[13] & id_private[11]) / id_throws[7], (float)(n & id_private[12]) / id_throws[8], (float)(n >> id_finally[14] & id_private[13]) / id_throws[9]);
        ((ShaderManager)id_byte[id_private[14]]).id_break(id_protected[1], f3 * f6);
        ((ShaderManager)id_byte[id_private[15]]).id_break(id_protected[2], (f + f3 * f6) * id_throws[10]);
        ((ShaderManager)id_byte[id_private[16]]).id_break(id_protected[3], f4 * f6);
        ((ShaderManager)id_byte[id_private[17]]).id_break(id_protected[4], f5 * f6);
        this.id_break(ml_1, string, f, f2, n, id_case[24], id_case[25]);
        ((ShaderManager)id_byte[id_private[18]]).id_break();
    }

    public float id_class(Ml_1 ml_1, lD_2 lD_22, String string, float f, float f2, int n, boolean bl) {
        return this.id_break(ml_1, lD_22, string, f - this.id_break(string) / id_throws[1], f2, n, id_case[21], bl);
    }

    public float id_class(Ml_1 ml_1, lD_2 lD_22, String string, double d, double d2, int n) {
        float f = this.id_break(ml_1, lD_22, string, d + id_implements[4], d2 + id_implements[5], n, id_case[12], id_case[13]);
        return Math.max(f, this.id_break(ml_1, lD_22, string, d, d2, n, id_case[14], id_case[15]));
    }

    public void id_class(Ml_1 ml_1, String string, float f, float f2, int n, float f3) {
        float f4 = rrfa_3.id_class(ml_1);
        ((ShaderManager)id_byte[id_private[19]]).id_class();
        ((ShaderManager)id_byte[id_private[20]]).id_break(id_protected[5], (float)(n >> id_finally[15] & id_private[21]) / id_throws[11], (float)(n >> id_finally[16] & id_private[22]) / id_throws[12], (float)(n & id_private[23]) / id_throws[13], (float)(n >> id_finally[17] & id_private[24]) / id_throws[14]);
        ((ShaderManager)id_byte[id_private[25]]).id_break(id_protected[6], f3 * f4);
        ((ShaderManager)id_byte[id_private[26]]).id_break(id_protected[7], (f + f3 * f4) * id_throws[15]);
        ((ShaderManager)id_byte[id_private[27]]).id_break(id_protected[8], id_throws[16] * f4);
        ((ShaderManager)id_byte[id_private[28]]).id_break(id_protected[9], id_throws[17] * f4);
        this.id_break(ml_1, string, f, f2, n, id_case[26], id_case[27]);
        ((ShaderManager)id_byte[id_private[29]]).id_break();
    }

    public void id_class(Ml_1 ml_1, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        this.id_case();
        if (string == null) {
            return;
        }
        d -= id_implements[42];
        rrfa_3.id_class();
        if (bl2) {
            if (n == id_catch[28]) {
                n = id_finally[57];
            }
            if ((n & id_catch[29]) == 0) {
                n |= id_catch[30];
            }
        }
        if (bl) {
            n = (n & id_catch[31]) >> id_finally[58] | n & id_catch[32];
        }
        float f = (float)(n >> id_finally[59] & id_private[91]) / id_throws[89];
        float f2 = (float)(n >> id_finally[60] & id_private[92]) / id_throws[90];
        float f3 = (float)(n & id_private[93]) / id_throws[91];
        float f4 = (float)(n >> id_finally[61] & id_private[94]) / id_throws[92];
        d *= id_implements[43];
        d2 = (d2 - id_implements[44]) * id_implements[45];
        ml_1.id_class();
        ml_1.id_class(id_throws[93], id_throws[94], id_throws[95]);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_private[95], id_private[96]);
        RenderSystem.enableTexture();
        MT.id_super(((fk_3)this.id_class[id_private[97]]).id_new());
        MinecraftAccessor.id_strictfp.id_class((int)id_finally[62], ju_3.id_public);
        float f5 = (float)d;
        float f6 = (float)d2;
        int n2 = string.length();
        for (int i = id_case[49]; i < n2; ++i) {
            char c = string.charAt(i);
            if (c == id_private[98] && i < n2 - id_case[50]) {
                if (n != id_catch[33]) {
                    char c2 = string.charAt(i + id_case[51]);
                    int n3 = id_protected[18].indexOf(c2);
                    if (c2 == id_finally[63]) {
                        f = (float)(n >> id_finally[64] & id_private[99]) / id_throws[96];
                        f2 = (float)(n >> id_finally[65] & id_private[100]) / id_throws[97];
                        f3 = (float)(n & id_private[101]) / id_throws[98];
                    } else if (n3 < id_finally[66]) {
                        if (n3 < 0) {
                            n3 = id_finally[67];
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        int n4 = ((int[])this.id_break[id_private[102]])[n3];
                        f = (float)(n4 >> id_finally[68] & id_private[103]) / id_throws[99];
                        f2 = (float)(n4 >> id_finally[69] & id_private[104]) / id_throws[100];
                        f3 = (float)(n4 & id_private[105]) / id_throws[101];
                    }
                }
                ++i;
                continue;
            }
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_private[106]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_private[107]]));
            if (rrZM2 == null) continue;
            float f7 = (Integer)rrZM2.id_class[id_private[108]] - id_finally[70] + (Integer)this.id_class[id_private[109]];
            if (c == id_finally[71]) {
                f5 = (float)d;
                f6 += (float)((Integer)rrZM2.id_class[id_private[110]]).intValue();
                continue;
            }
            this.id_class(ml_1, c, f5, f6, f, f2, f3, f4);
            f5 += f7;
        }
        id_default.id_break();
        ml_1.id_break();
    }

    public float id_class(Ml_1 ml_1, rgP_2 rgP_22, double d, double d2, int n, int n2) {
        if (rgP_22 == null) {
            return id_throws[76];
        }
        ml_1.id_class();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_private[88], id_private[89]);
        RenderSystem.enableTexture();
        RenderSystem.bindTexture(((fk_3)this.id_class[id_private[90]]).id_new());
        MinecraftAccessor.id_strictfp.id_class((int)id_finally[56], ju_3.id_public);
        ml_1.id_class(id_throws[77], id_throws[78], id_throws[79]);
        d -= id_implements[34];
        d2 = (d2 - id_implements[36]) * id_implements[37];
        float f = (float)(d *= id_implements[35]);
        float f2 = (float)d2;
        rgP_22.id_catch().accept(new rrZh_1(this, f, n, ml_1, f2, n2));
        id_default.id_break();
        ml_1.id_break();
        return (float)d / id_throws[80];
    }

    public void id_class(Ml_1 ml_1, String string, double d, double d2, int n, float f, boolean bl, boolean bl2) {
        this.id_case();
        if (string == null) {
            return;
        }
        ml_1.id_class(id_throws[102], id_throws[103], id_throws[104]);
        d -= id_implements[50];
        if (bl2) {
            if (n == id_catch[38]) {
                n = id_catch[39];
            }
            if ((n & id_catch[40]) == 0) {
                n |= id_catch[41];
            }
        }
        if (bl) {
            n = (n & id_catch[42]) >> id_finally[72] | n & id_catch[43];
        }
        float f2 = (float)(n >> id_finally[73] & id_private[111]) / id_throws[105];
        float f3 = (float)(n >> id_finally[74] & id_private[112]) / id_throws[106];
        float f4 = (float)(n & id_private[113]) / id_throws[107];
        float f5 = (float)(n >> id_finally[75] & id_private[114]) / id_throws[108];
        d2 = (d2 - id_implements[52]) * id_implements[53];
        float f6 = (float)(d *= id_implements[51]);
        float f7 = (float)d2;
        int n2 = string.length();
        for (int i = id_case[52]; i < n2; ++i) {
            char c = string.charAt(i);
            if (c == id_private[115] && i < n2 - id_case[53]) {
                if (n != id_catch[44]) {
                    char c2 = string.charAt(i + id_case[54]);
                    int n3 = id_protected[19].indexOf(c2);
                    if (c2 == id_finally[76]) {
                        f2 = (float)(n >> id_finally[77] & id_private[116]) / id_throws[109];
                        f3 = (float)(n >> id_finally[78] & id_private[117]) / id_throws[110];
                        f4 = (float)(n & id_private[118]) / id_throws[111];
                    } else if (n3 < id_finally[79]) {
                        if (n3 < 0) {
                            n3 = id_finally[80];
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        int n4 = ((int[])this.id_break[id_private[119]])[n3];
                        f2 = (float)(n4 >> id_finally[81] & id_private[120]) / id_throws[112];
                        f3 = (float)(n4 >> id_finally[82] & id_private[121]) / id_throws[113];
                        f4 = (float)(n4 & id_private[122]) / id_throws[114];
                    }
                }
                ++i;
                continue;
            }
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_private[123]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_private[124]]));
            if (rrZM2 == null) continue;
            float f8 = (Integer)rrZM2.id_class[id_private[125]] - id_finally[83] + (Integer)this.id_class[id_private[126]];
            if (c == id_finally[84]) {
                f6 = (float)d;
                f7 += f;
                continue;
            }
            this.id_class(ml_1, c, f6, f7, f2, f3, f4, f5);
            f6 += f8;
        }
        ml_1.id_class(id_throws[115], id_throws[116], id_throws[117]);
    }

    public void id_class(lD_2 lD_22) {
        lD_22.id_class((int)id_finally[21], ju_3.id_public);
    }

    public float id_class(Ml_1 ml_1, String string, double d, double d2, int n, int n2, boolean bl) {
        this.id_case();
        if (string == null) {
            return id_throws[40];
        }
        d -= id_implements[14];
        rrfa_3.id_class();
        d *= id_implements[15];
        d2 = (d2 - id_implements[16]) * id_implements[17];
        ml_1.id_class();
        ml_1.id_class(id_throws[41], id_throws[42], id_throws[43]);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_private[63], id_private[64]);
        RenderSystem.enableTexture();
        RenderSystem.bindTexture(((fk_3)this.id_class[id_private[65]]).id_new());
        id_strictfp.id_class((int)id_finally[37], ju_3.id_public);
        boolean bl2 = id_case[35];
        int n3 = id_finally[38];
        int n4 = string.length();
        for (int i = id_case[36]; i < n4; ++i) {
            char c = string.charAt(i);
            int n5 = ColorHelper.id_class((float)(-i * n), n2);
            if (bl) {
                n5 = (n5 & id_catch[6]) >> id_finally[39] | n5 & id_catch[7];
            }
            float f = (float)ColorHelper.id_byte(n5) / id_throws[44];
            float f2 = (float)ColorHelper.id_protected(n5) / id_throws[45];
            float f3 = (float)ColorHelper.id_break(n5) / id_throws[46];
            float f4 = (float)ColorHelper.id_throws(n5) / id_throws[47];
            if (c == id_private[66] && i < n4 - id_case[37]) {
                char c2 = string.charAt(i + id_case[38]);
                int n6 = id_protected[16].indexOf(c2);
                if (c2 != id_finally[40] && n6 < id_finally[41]) {
                    if (n6 < 0) {
                        n6 = id_finally[42];
                    }
                    if (bl) {
                        n6 += 16;
                    }
                    n3 = ((int[])this.id_break[id_private[67]])[n6];
                }
                bl2 = id_case[39];
                ++i;
                continue;
            }
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_private[68]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_private[69]]));
            if (rrZM2 == null) continue;
            if (bl2) {
                f = (float)ColorHelper.id_byte(n3) / id_throws[48];
                f2 = (float)ColorHelper.id_protected(n3) / id_throws[49];
                f3 = (float)ColorHelper.id_break(n3) / id_throws[50];
            }
            this.id_class(ml_1, c, (float)d, (float)d2, f, f2, f3, f4);
            d += (double)((Integer)rrZM2.id_class[id_private[70]] - id_finally[43] + (Integer)this.id_class[id_private[71]]);
        }
        id_default.id_break();
        ml_1.id_break();
        return (float)d / id_throws[51];
    }

    public void id_class(Ml_1 ml_1, String string, float f, float f2, int n, float f3, float f4) {
        ((ShaderManager)id_byte[id_private[30]]).id_class();
        ((ShaderManager)id_byte[id_private[31]]).id_break(id_protected[10], (float)(n >> id_finally[18] & id_private[32]) / id_throws[18], (float)(n >> id_finally[19] & id_private[33]) / id_throws[19], (float)(n & id_private[34]) / id_throws[20], (float)(n >> id_finally[20] & id_private[35]) / id_throws[21]);
        ((ShaderManager)id_byte[id_private[36]]).id_break(id_protected[11], f3 * f4);
        ((ShaderManager)id_byte[id_private[37]]).id_break(id_protected[12], (f * f4 + f3) * id_throws[22]);
        ((ShaderManager)id_byte[id_private[38]]).id_break(id_protected[13], id_throws[23]);
        ((ShaderManager)id_byte[id_private[39]]).id_break(id_protected[14], id_throws[24]);
        this.id_break(ml_1, string, f, f2, n, id_case[28], id_case[29]);
        ((ShaderManager)id_byte[id_private[40]]).id_break();
    }

    public float id_class(Ml_1 ml_1, String string, double d, double d2, int n, int n2) {
        float f = this.id_class(ml_1, string, d + id_implements[12], d2 + id_implements[13], n, n2, id_case[33]);
        return Math.max(f, this.id_class(ml_1, string, d, d2, n, n2, id_case[34]));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA356B96D9ECD252L;
    }

    public void id_class(Ml_1 ml_1, String string, double d, double d2, int n, boolean bl) {
        this.id_break(ml_1, string, d - id_implements[18], d2, id_catch[8], id_case[40], bl);
        this.id_break(ml_1, string, d + id_implements[19], d2, id_catch[9], id_case[41], bl);
        this.id_break(ml_1, string, d, d2 - id_implements[20], id_catch[10], id_case[42], bl);
        this.id_break(ml_1, string, d, d2 + id_implements[21], id_catch[11], id_case[43], bl);
        this.id_break(ml_1, string, d, d2, n, id_case[44], bl);
    }

    public float id_class(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl) {
        return this.id_break(ml_1, string, (double)(f - this.id_break(string) / id_throws[4]), (double)f2, n, bl);
    }

    public float id_class(Ml_1 ml_1, String string, double d, double d2, int n) {
        float f = this.id_break(ml_1, string, d + id_implements[0], d2 + id_implements[1], n, id_case[6], id_case[7]);
        return Math.max(f, this.id_break(ml_1, string, d, d2, n, id_case[8], id_case[9]));
    }

    public float id_class(Ml_1 ml_1, lD_2 lD_22, String string, double d, double d2, int n, boolean bl) {
        float f = this.id_break(ml_1, lD_22, string, d + id_implements[6], d2 + id_implements[7], n, id_case[16], bl);
        return Math.max(f, this.id_break(ml_1, lD_22, string, d, d2, n, id_case[17], bl));
    }

    public void id_class(Ml_1 ml_1, lD_2 lD_22, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        this.id_break(ml_1, lD_22, string, d - id_implements[22], d2, id_catch[12], bl, bl2);
        this.id_break(ml_1, lD_22, string, d + id_implements[23], d2, id_catch[13], bl, bl2);
        this.id_break(ml_1, lD_22, string, d, d2 - id_implements[24], id_catch[14], bl, bl2);
        this.id_break(ml_1, lD_22, string, d, d2 + id_implements[25], id_catch[15], bl, bl2);
        this.id_break(ml_1, lD_22, string, d, d2, n, bl, bl2);
    }

    public float id_class(Ml_1 ml_1, lD_2 lD_22, String string, float f, float f2, int n) {
        return this.id_class(ml_1, lD_22, string, (double)(f - this.id_break(string) / id_throws[5]), (double)f2, n);
    }

    public void id_class(Ml_1 ml_1, String string, double d, double d2, int n, int n2, boolean bl, boolean bl2) {
        this.id_class(ml_1, string, d - id_implements[46], d2, id_catch[34], (float)n2, bl, bl2);
        this.id_class(ml_1, string, d + id_implements[47], d2, id_catch[35], (float)n2, bl, bl2);
        this.id_class(ml_1, string, d, d2 - id_implements[48], id_catch[36], (float)n2, bl, bl2);
        this.id_class(ml_1, string, d, d2 + id_implements[49], id_catch[37], (float)n2, bl, bl2);
        this.id_class(ml_1, string, d, d2, n, (float)n2, bl, bl2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF179C8C;
    }

    public void id_class(Ml_1 ml_1, String string, float f, float f2, int n) {
        this.id_break(ml_1, id_strictfp, string, f - this.id_break(string) / id_throws[2], f2, n, id_case[22], id_case[23]);
    }

    public float id_break(Ml_1 ml_1, rgP_2 rgP_22, double d, double d2, int n, int n2) {
        if (rgP_22 == null) {
            return id_throws[81];
        }
        ml_1.id_class(id_throws[82], id_throws[83], id_throws[84]);
        d -= id_implements[38];
        d2 = (d2 - id_implements[40]) * id_implements[41];
        float f = (float)(d *= id_implements[39]);
        float f2 = (float)d2;
        rgP_22.id_catch().accept(new rrZX(this, f, n, ml_1, f2, n2));
        ml_1.id_class(id_throws[85], id_throws[86], id_throws[87]);
        return (float)d / id_throws[88];
    }

    public void id_break(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl) {
        float f3 = f - this.id_break(string) / id_throws[52];
        int n2 = n & id_catch[16];
        this.id_protected(ml_1, string, f3 - id_throws[53], f2, n2, bl);
        this.id_protected(ml_1, string, f3 + id_throws[54], f2, n2, bl);
        this.id_protected(ml_1, string, f3, f2 - id_throws[55], n2, bl);
        this.id_protected(ml_1, string, f3, f2 + id_throws[56], n2, bl);
        this.id_protected(ml_1, string, f3, f2, n, bl);
    }

    public float id_break(Ml_1 ml_1, String string, float f, float f2, int n) {
        return this.id_class(ml_1, string, (double)(f - this.id_break(string) / id_throws[3]), (double)f2, n);
    }

    public void id_break(lD_2 lD_22) {
        lD_22.id_class((int)id_finally[22], ju_3.id_public);
    }

    @Override
    public float id_break(String string) {
        if (string == null) {
            return id_throws[118];
        }
        float f = id_throws[119];
        for (int i = id_case[55]; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == id_private[127]) {
                ++i;
                continue;
            }
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_private[128]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_private[129]]));
            f += (float)((Integer)rrZM2.id_class[id_private[130]] - id_finally[85] + (Integer)this.id_class[id_private[131]]);
        }
        return (float)Math.ceil(f * id_throws[120]);
    }

    public float id_break(Ml_1 ml_1, lD_2 lD_22, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        this.id_case();
        if (string == null) {
            return id_throws[58];
        }
        ml_1.id_class(id_throws[59], id_throws[60], id_throws[61]);
        d -= id_implements[30];
        if (bl2) {
            if (n == id_catch[21]) {
                n = id_catch[22];
            }
            if ((n & id_catch[23]) == 0) {
                n |= id_catch[24];
            }
        }
        if (bl) {
            n = (n & id_catch[25]) >> id_finally[44] | n & id_catch[26];
        }
        float f = (float)(n >> id_finally[45] & id_private[72]) / id_throws[62];
        float f2 = (float)(n >> id_finally[46] & id_private[73]) / id_throws[63];
        float f3 = (float)(n & id_private[74]) / id_throws[64];
        float f4 = (float)(n >> id_finally[47] & id_private[75]) / id_throws[65];
        d *= id_implements[31];
        d2 = (d2 - id_implements[32]) * id_implements[33];
        int n2 = string.length();
        for (int i = id_case[46]; i < n2; ++i) {
            char c = string.charAt(i);
            if (c == id_private[76] && i < n2 - id_case[47]) {
                if (n != id_catch[27]) {
                    char c2 = string.charAt(i + id_case[48]);
                    int n3 = id_protected[17].indexOf(c2);
                    if (c2 == id_finally[48]) {
                        f = (float)(n >> id_finally[49] & id_private[77]) / id_throws[66];
                        f2 = (float)(n >> id_finally[50] & id_private[78]) / id_throws[67];
                        f3 = (float)(n & id_private[79]) / id_throws[68];
                    } else if (n3 < id_finally[51]) {
                        if (n3 < 0) {
                            n3 = id_finally[52];
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        int n4 = ((int[])this.id_break[id_private[80]])[n3];
                        f = (float)(n4 >> id_finally[53] & id_private[81]) / id_throws[69];
                        f2 = (float)(n4 >> id_finally[54] & id_private[82]) / id_throws[70];
                        f3 = (float)(n4 & id_private[83]) / id_throws[71];
                    }
                }
                ++i;
                continue;
            }
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_private[84]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_private[85]]));
            if (rrZM2 == null) continue;
            this.id_class(ml_1, lD_22, c, (float)d, (float)d2, f, f2, f3, f4);
            d += (double)((Integer)rrZM2.id_class[id_private[86]] - id_finally[55] + (Integer)this.id_class[id_private[87]]);
        }
        ml_1.id_class(id_throws[72], id_throws[73], id_throws[74]);
        return (float)d / id_throws[75];
    }

    public float id_break(Ml_1 ml_1, String string, double d, double d2, int n, boolean bl) {
        float f = this.id_break(ml_1, string, d + id_implements[2], d2 + id_implements[3], n, id_case[10], bl);
        return Math.max(f, this.id_break(ml_1, string, d, d2, n, id_case[11], bl));
    }

    public float id_break(Ml_1 ml_1, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        this.id_case();
        if (string == null) {
            return id_throws[25];
        }
        d -= id_implements[8];
        rrfa_3.id_class();
        if (bl2) {
            if (n == id_catch[0]) {
                n = id_finally[23];
            }
            if ((n & id_catch[1]) == 0) {
                n |= id_catch[2];
            }
        }
        if (bl) {
            n = (n & id_catch[3]) >> id_finally[24] | n & id_catch[4];
        }
        float f = (float)(n >> id_finally[25] & id_private[44]) / id_throws[26];
        float f2 = (float)(n >> id_finally[26] & id_private[45]) / id_throws[27];
        float f3 = (float)(n & id_private[46]) / id_throws[28];
        float f4 = (float)(n >> id_finally[27] & id_private[47]) / id_throws[29];
        d *= id_implements[9];
        d2 = (d2 - id_implements[10]) * id_implements[11];
        ml_1.id_class();
        ml_1.id_class(id_throws[30], id_throws[31], id_throws[32]);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(id_private[48], id_private[49]);
        RenderSystem.enableTexture();
        RenderSystem.bindTexture(((fk_3)this.id_class[id_private[50]]).id_new());
        id_strictfp.id_class((int)id_finally[28], ju_3.id_public);
        int n2 = string.length();
        for (int i = id_case[30]; i < n2; ++i) {
            char c = string.charAt(i);
            if (c == id_private[51] && i < n2 - id_case[31]) {
                if (n != id_catch[5]) {
                    char c2 = string.charAt(i + id_case[32]);
                    int n3 = id_protected[15].indexOf(c2);
                    if (c2 == id_finally[29]) {
                        f = (float)(n >> id_finally[30] & id_private[52]) / id_throws[33];
                        f2 = (float)(n >> id_finally[31] & id_private[53]) / id_throws[34];
                        f3 = (float)(n & id_private[54]) / id_throws[35];
                    } else if (n3 < id_finally[32]) {
                        if (n3 < 0) {
                            n3 = id_finally[33];
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        int n4 = ((int[])this.id_break[id_private[55]])[n3];
                        f = (float)(n4 >> id_finally[34] & id_private[56]) / id_throws[36];
                        f2 = (float)(n4 >> id_finally[35] & id_private[57]) / id_throws[37];
                        f3 = (float)(n4 & id_private[58]) / id_throws[38];
                    }
                }
                ++i;
                continue;
            }
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_private[59]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_private[60]]));
            if (rrZM2 == null) continue;
            this.id_class(ml_1, c, (float)d, (float)d2, f, f2, f3, f4);
            d += (double)((Integer)rrZM2.id_class[id_private[61]] - id_finally[36] + (Integer)this.id_class[id_private[62]]);
        }
        id_default.id_break();
        ml_1.id_break();
        return (float)d / id_throws[39];
    }

    private static void id_throws() {
        id_protected = new String[]{new String("inColor"), new String("width"), new String("maxWidth"), new String("smoothness"), new String("startCutoff"), new String("inColor"), new String("width"), new String("maxWidth"), new String("smoothness"), new String("startCutoff"), new String("inColor"), new String("width"), new String("maxWidth"), new String("smoothness"), new String("startCutoff"), new String("0123456789abcdefklmnor"), new String("0123456789abcdefklmnor"), new String("0123456789abcdefklmnor"), new String("0123456789abcdefklmnor"), new String("0123456789abcdefklmnor"), new String("substring_font")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrZO.id_private();
        rrZO.id_throws();
        rrZO.id_native();
        rrZO.id_extends();
        rrZO.id_implements();
        rrZO.id_volatile();
        rrZO.id_catch();
        rrZO.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new ShaderManager(id_protected[20], false)};
        id_byte = objectArray;
    }

    private static void id_catch() {
        id_catch = new int[]{0x20FFFFFF, -67108864, -16777216, 0xFCFCFC, -938208236, -16777216, 0xFCFCFC, -938208236, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, 0x20FFFFFF, 0xFFFFFF, -67108864, -16777216, 0xFCFCFC, -938208236, -16777216, 0x20FFFFFF, -67108864, -16777216, 0xFCFCFC, -938208236, -16777216, -16777216, -16777216, -16777216, -16777216, 0x20FFFFFF, 0xFFFFFF, -67108864, -16777216, 0xFCFCFC, -938208236, -16777216};
    }

    private static void id_extends() {
        id_implements = new double[]{0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1.0, 2.0, 3.0, 2.0, 0.5, 0.5, 1.0, 2.0, 3.0, 2.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1.0, 2.0, 3.0, 2.0, 1.0, 2.0, 3.0, 2.0, 1.0, 2.0, 3.0, 2.0, 1.0, 2.0, 3.0, 2.0, 0.5, 0.5, 0.5, 0.5, 1.0, 2.0, 3.0, 2.0};
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[58]];
        }
    }

    private static void id_implements() {
        float[] fArray = new float[121];
        fArray[0] = 2.0f;
        fArray[1] = 2.0f;
        fArray[2] = 2.0f;
        fArray[3] = 2.0f;
        fArray[4] = 2.0f;
        fArray[5] = 2.0f;
        fArray[6] = 255.0f;
        fArray[7] = 255.0f;
        fArray[8] = 255.0f;
        fArray[9] = 255.0f;
        fArray[10] = 2.0f;
        fArray[11] = 255.0f;
        fArray[12] = 255.0f;
        fArray[13] = 255.0f;
        fArray[14] = 255.0f;
        fArray[15] = 2.0f;
        fArray[16] = 1.0f;
        fArray[17] = 0.5f;
        fArray[18] = 255.0f;
        fArray[19] = 255.0f;
        fArray[20] = 255.0f;
        fArray[21] = 255.0f;
        fArray[22] = 2.0f;
        fArray[23] = 1.0f;
        fArray[24] = 0.5f;
        fArray[26] = 255.0f;
        fArray[27] = 255.0f;
        fArray[28] = 255.0f;
        fArray[29] = 255.0f;
        fArray[30] = 0.5f;
        fArray[31] = 0.5f;
        fArray[32] = 0.5f;
        fArray[33] = 255.0f;
        fArray[34] = 255.0f;
        fArray[35] = 255.0f;
        fArray[36] = 255.0f;
        fArray[37] = 255.0f;
        fArray[38] = 255.0f;
        fArray[39] = 2.0f;
        fArray[41] = 0.5f;
        fArray[42] = 0.5f;
        fArray[43] = 0.5f;
        fArray[44] = 255.0f;
        fArray[45] = 255.0f;
        fArray[46] = 255.0f;
        fArray[47] = 255.0f;
        fArray[48] = 255.0f;
        fArray[49] = 255.0f;
        fArray[50] = 255.0f;
        fArray[51] = 2.0f;
        fArray[52] = 2.0f;
        fArray[53] = 0.5f;
        fArray[54] = 0.5f;
        fArray[55] = 0.5f;
        fArray[56] = 0.5f;
        fArray[57] = 2.0f;
        fArray[59] = 0.5f;
        fArray[60] = 0.5f;
        fArray[62] = 255.0f;
        fArray[63] = 255.0f;
        fArray[64] = 255.0f;
        fArray[65] = 255.0f;
        fArray[66] = 255.0f;
        fArray[67] = 255.0f;
        fArray[68] = 255.0f;
        fArray[69] = 255.0f;
        fArray[70] = 255.0f;
        fArray[71] = 255.0f;
        fArray[72] = 2.0f;
        fArray[73] = 2.0f;
        fArray[74] = 2.0f;
        fArray[75] = 2.0f;
        fArray[77] = 0.5f;
        fArray[78] = 0.5f;
        fArray[79] = 0.5f;
        fArray[80] = 2.0f;
        fArray[82] = 0.5f;
        fArray[83] = 0.5f;
        fArray[85] = 2.0f;
        fArray[86] = 2.0f;
        fArray[87] = 2.0f;
        fArray[88] = 2.0f;
        fArray[89] = 255.0f;
        fArray[90] = 255.0f;
        fArray[91] = 255.0f;
        fArray[92] = 255.0f;
        fArray[93] = 0.5f;
        fArray[94] = 0.5f;
        fArray[95] = 0.5f;
        fArray[96] = 255.0f;
        fArray[97] = 255.0f;
        fArray[98] = 255.0f;
        fArray[99] = 255.0f;
        fArray[100] = 255.0f;
        fArray[101] = 255.0f;
        fArray[102] = 0.5f;
        fArray[103] = 0.5f;
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
        fArray[115] = 2.0f;
        fArray[116] = 2.0f;
        fArray[117] = 2.0f;
        fArray[120] = 0.5f;
        id_throws = fArray;
    }

    public void id_protected(Ml_1 ml_1, String string, float f, float f2, int n) {
        this.id_break(ml_1, string, f, f2, n, id_case[45]);
    }

    private void id_protected(Ml_1 ml_1, lD_2 lD_22, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        this.id_break(ml_1, lD_22, string, d - (double)(this.id_break(string) / id_throws[57]), d2, n, bl, bl2);
    }

    public float id_protected(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl) {
        return this.id_break(ml_1, string, f, f2, n, id_case[18], bl);
    }

    private static void id_private() {
        boolean[] blArray = new boolean[60];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[16] = true;
        blArray[20] = true;
        blArray[31] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[37] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[48] = true;
        blArray[50] = true;
        blArray[51] = true;
        blArray[53] = true;
        blArray[54] = true;
        blArray[58] = true;
        blArray[59] = true;
        id_case = blArray;
    }

    private static void id_volatile() {
        id_finally = new byte[]{32, 32, 3, 85, 2, 6, 16, 4, 4, 4, 16, 8, 16, 8, 24, 16, 8, 24, 16, 8, 24, 7, 7, -1, 2, 16, 8, 24, 7, 114, 16, 8, 16, 15, 16, 8, 8, 7, -1, 2, 114, 16, 15, 8, 2, 16, 8, 24, 114, 16, 8, 16, 15, 16, 8, 8, 7, -1, 2, 16, 8, 24, 7, 114, 16, 8, 16, 15, 16, 8, 8, 10, 2, 16, 8, 24, 114, 16, 8, 16, 15, 16, 8, 8, 10, 8};
    }

    private static void id_native() {
        short[] sArray = new short[132];
        sArray[1] = 170;
        sArray[2] = 170;
        sArray[3] = 170;
        sArray[5] = 255;
        sArray[6] = 255;
        sArray[7] = 255;
        sArray[10] = 255;
        sArray[11] = 255;
        sArray[12] = 255;
        sArray[13] = 255;
        sArray[21] = 255;
        sArray[22] = 255;
        sArray[23] = 255;
        sArray[24] = 255;
        sArray[32] = 255;
        sArray[33] = 255;
        sArray[34] = 255;
        sArray[35] = 255;
        sArray[41] = 770;
        sArray[42] = 771;
        sArray[43] = 10;
        sArray[44] = 255;
        sArray[45] = 255;
        sArray[46] = 255;
        sArray[47] = 255;
        sArray[48] = 770;
        sArray[49] = 771;
        sArray[50] = 10;
        sArray[51] = 167;
        sArray[52] = 255;
        sArray[53] = 255;
        sArray[54] = 255;
        sArray[56] = 255;
        sArray[57] = 255;
        sArray[58] = 255;
        sArray[59] = 1;
        sArray[60] = 2;
        sArray[61] = 2;
        sArray[62] = 8;
        sArray[63] = 770;
        sArray[64] = 771;
        sArray[65] = 10;
        sArray[66] = 167;
        sArray[68] = 1;
        sArray[69] = 2;
        sArray[70] = 2;
        sArray[71] = 8;
        sArray[72] = 255;
        sArray[73] = 255;
        sArray[74] = 255;
        sArray[75] = 255;
        sArray[76] = 167;
        sArray[77] = 255;
        sArray[78] = 255;
        sArray[79] = 255;
        sArray[81] = 255;
        sArray[82] = 255;
        sArray[83] = 255;
        sArray[84] = 1;
        sArray[85] = 2;
        sArray[86] = 2;
        sArray[87] = 8;
        sArray[88] = 770;
        sArray[89] = 771;
        sArray[90] = 10;
        sArray[91] = 255;
        sArray[92] = 255;
        sArray[93] = 255;
        sArray[94] = 255;
        sArray[95] = 770;
        sArray[96] = 771;
        sArray[97] = 10;
        sArray[98] = 167;
        sArray[99] = 255;
        sArray[100] = 255;
        sArray[101] = 255;
        sArray[103] = 255;
        sArray[104] = 255;
        sArray[105] = 255;
        sArray[106] = 1;
        sArray[107] = 2;
        sArray[108] = 2;
        sArray[109] = 8;
        sArray[110] = 3;
        sArray[111] = 255;
        sArray[112] = 255;
        sArray[113] = 255;
        sArray[114] = 255;
        sArray[115] = 167;
        sArray[116] = 255;
        sArray[117] = 255;
        sArray[118] = 255;
        sArray[120] = 255;
        sArray[121] = 255;
        sArray[122] = 255;
        sArray[123] = 1;
        sArray[124] = 2;
        sArray[125] = 2;
        sArray[126] = 8;
        sArray[127] = 167;
        sArray[128] = 1;
        sArray[129] = 2;
        sArray[130] = 2;
        sArray[131] = 8;
        id_private = sArray;
    }
}

