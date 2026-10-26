/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rjK_2;
import celestial.rrZF;
import celestial.rrZL;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rruF;
import celestial.rruL;
import celestial.rrun_1;
import celestial.rruu_1;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwX_2
implements MinecraftAccessor {
    private static byte[] id_byte;
    private static String[] id_protected;
    private static double[] id_throws;
    private static boolean[] id_case;
    private static short[] id_catch;
    public Object[] id_class;
    public static Object[] id_break;
    private static int[] id_private;
    private static float[] id_implements;

    public boolean id_byte() {
        return (Boolean)this.id_class[id_catch[8]];
    }

    private static void id_int() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_case = blArray;
    }

    public rrwX_2(rrtN_2 rrtN_22) {
        this.id_case();
        rruL rruL2 = new rruL();
        this.id_class[rrwX_2.id_catch[0]] = rruL2;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_class[rrwX_2.id_catch[1]] = rrtN_23;
        if (rrtN_22.id_new()) {
            this.id_package();
        }
    }

    static {
        rrwX_2.ntfClinit();
    }

    public void id_class(Ml_1 ml_1, float f, float f2, boolean bl, boolean bl2) {
        rrtN_2 rrtN_22 = this.id_class();
        int n = ColorHelper.id_class(id_implements[4]);
        int n2 = ColorHelper.id_class(id_implements[5]);
        int n3 = ColorHelper.id_class(id_implements[6]);
        int n4 = ColorHelper.id_class(id_implements[7]);
        float f3 = rrtN_22.id_implements();
        float f4 = rrtN_22.ao_();
        rrfD_2.id_class(ml_1, f, f2 + id_implements[8], f3, f4, id_implements[9], id_implements[10], id_implements[11], id_implements[12], rrZF.n_);
        rrfD_2.id_break(ml_1, f, f2, f3, id_implements[13], id_implements[14], id_implements[15], id_implements[16], id_implements[17], n, n2, n3, n4);
        if (!bl2) {
            rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[5]]).id_protected();
            StringBuilder stringBuilder = new StringBuilder();
            String string = rrtN_22.id_byte();
            for (int i = id_case[5]; i < string.length(); ++i) {
                char c = string.charAt(i);
                if (bl && rrZO2.id_break(stringBuilder.toString() + c) > f3 - id_implements[18]) {
                    int n5 = stringBuilder.length() - id_case[6];
                    if (n5 >= 0 && stringBuilder.charAt(n5) == id_byte[0]) {
                        stringBuilder.deleteCharAt(n5);
                    }
                    stringBuilder.append(id_protected[0]);
                    break;
                }
                stringBuilder.append(c);
            }
            rrZO2.id_byte(ml_1, stringBuilder.toString(), f + f3 / id_implements[19] + id_implements[20], f2 + id_implements[21], rrZF.d_, id_case[7]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFDA465DE;
    }

    public void id_class(Ml_1 ml_1, Runnable runnable, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        rrtN_2 rrtN_22 = this.id_class();
        float f = rrtN_22.id_long();
        this.id_class().id_class(ml_1, f);
        runnable.run();
        this.id_break().id_class(ml_1, rrtu_32, n, n2, id_case[3], bl);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF1C1A4C8BB34813AL;
    }

    public void id_class(Ml_1 ml_1, Runnable runnable, rrtu_3 rrtu_32, int n, int n2, boolean bl, boolean bl2) {
        rrtN_2 rrtN_22 = this.id_class();
        rrwX_2 rrwX_22 = rrtN_22.id_interface();
        float f = rrtN_22.id_long();
        double d = id_implements[1] - f;
        ml_1.id_class(d * (double)(rrtN_22.id_default() + rrtN_22.id_implements() / id_implements[2]), d * (double)(rrtN_22.id_abstract() + rrtN_22.ao_() / id_implements[3]), id_throws[0]);
        ml_1.id_class(f, f, f);
        rrwX_22.id_class(ml_1, rrtN_22.id_default(), rrtN_22.id_abstract(), bl, bl2);
        this.id_break().id_class(ml_1, rrtu_32, n, n2, id_case[2], bl2);
        runnable.run();
    }

    public void id_class(Ml_1 ml_1, Runnable runnable, boolean bl, boolean bl2) {
        if (bl) {
            runnable.run();
            return;
        }
        float f = ((rrtN_2)this.id_class[id_catch[4]]).id_long();
        ml_1.id_class();
        rrfi_3.id_break();
        if (bl2) {
            this.id_class().id_class(ml_1, f);
        }
        runnable.run();
        rrfi_3.id_class(id_case[4]);
        ml_1.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, 111, -1, -88, 35, -121, -114, 86}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrwX_2.id_catch[9]] = bl2;
    }

    public rrtN_2 id_class() {
        return (rrtN_2)this.id_class[id_catch[6]];
    }

    public void id_class(Ml_1 ml_1, Runnable runnable) {
        ml_1.id_class();
        RenderSystem.disableBlend();
        RenderSystem.disableAlphaTest();
        float f = ((rrtN_2)this.id_class[id_catch[3]]).id_long();
        this.id_class().id_class(ml_1, f);
        runnable.run();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableBlend();
        ml_1.id_break();
    }

    public rruL id_break() {
        return (rruL)this.id_class[id_catch[7]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrwX_2.id_int();
        rrwX_2.id_private();
        rrwX_2.id_protected();
        rrwX_2.id_implements();
        rrwX_2.id_native();
        rrwX_2.id_finally();
        rrwX_2.id_final();
        rrwX_2.id_extends();
    }

    private static void id_finally() {
        id_byte = new byte[]{32, 3, 2};
    }

    private static void id_extends() {
        Object[] objectArray = new Object[]{-657931};
        id_break = objectArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
            objectArray[rrwX_2.id_byte[2]] = id_case[8];
        }
    }

    private static void id_implements() {
        float[] fArray = new float[26];
        fArray[0] = 0.3f;
        fArray[1] = 1.0f;
        fArray[2] = 2.0f;
        fArray[3] = 2.0f;
        fArray[5] = 90.0f;
        fArray[6] = 270.0f;
        fArray[7] = 180.0f;
        fArray[8] = 3.0f;
        fArray[9] = 8.0f;
        fArray[10] = 8.0f;
        fArray[11] = 8.0f;
        fArray[12] = 8.0f;
        fArray[13] = 13.0f;
        fArray[14] = 4.0f;
        fArray[15] = 4.0f;
        fArray[18] = 40.0f;
        fArray[19] = 2.0f;
        fArray[20] = 0.5f;
        fArray[21] = 2.5f;
        fArray[22] = 9.0f;
        fArray[23] = 9.0f;
        fArray[24] = 11.0f;
        fArray[25] = 2.0f;
        id_implements = fArray;
    }

    private void id_package() {
        rrtN_2 rrtN_22 = this.id_class();
        Runnable runnable = () -> rrtN_22.id_int();
        rruF[] rruFArray = new rruF[id_case[0]];
        rruFArray[rrwX_2.id_case[1]] = new rruF(this.id_class(), (rruu_1)new rrun_1(() -> rrZL.id_native, () -> new rjK_2(rrtN_22.id_default() + rrtN_22.id_implements() - id_implements[24], rrtN_22.id_abstract() + id_implements[25]), () -> new rjK_2(id_implements[22], id_implements[23]), () -> id_private[0]).id_class(id_implements[0])).id_class(runnable);
        ((rruL)this.id_class[id_catch[2]]).id_class(rruFArray);
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 2;
        id_catch = sArray;
    }

    private static void id_private() {
        id_protected = new String[]{new String("...")};
    }

    private static void id_final() {
        id_private = new int[]{-657931, -657931};
    }

    private static void id_native() {
        id_throws = new double[1];
    }
}

