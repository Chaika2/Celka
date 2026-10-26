/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.Qg_1;
import celestial.VC;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class rrfi_3
implements MinecraftAccessor {
    private static byte[] id_class;
    private static int[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_class = new byte[]{-1, -1};
    }

    static {
        rrfi_3.ntfClinit();
    }

    public static void id_class(int n) {
        GL11.glColorMask((boolean)id_byte[7], (boolean)id_byte[8], (boolean)id_byte[9], (boolean)id_byte[10]);
        GL11.glStencilFunc((int)id_protected[6], (int)n, (int)id_byte[11]);
        GL11.glStencilOp((int)id_protected[7], (int)id_protected[8], (int)id_protected[9]);
    }

    public static void id_class() {
        GL11.glDisable((int)id_protected[10]);
    }

    private static void id_class(VC vC, int n, int n2) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)vC.id_finally());
        int n3 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)id_break[0], (int)n3);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)id_break[1], (int)id_break[2], (int)n, (int)n2);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)id_break[3], (int)id_break[4], (int)id_break[5], (int)n3);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)id_break[6], (int)id_break[7], (int)id_break[8], (int)n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-17, 127, 36, 67, -71, 100, -55, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(VC vC) {
        if (vC == null || vC.id_finally() <= id_class[0]) {
            return;
        }
        Qg_1 qg_1 = id_import.id_else();
        int n = qg_1.id_new();
        int n2 = qg_1.id_continue();
        if (n == 0 || n2 == 0) {
            return;
        }
        rrfi_3.id_class(vC, n, n2);
        vC.id_break(id_class[1]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5345E5D5079CA3C4L;
    }

    public static void id_break() {
        VC vC = id_import.B();
        vC.id_class(id_byte[0]);
        rrfi_3.id_class(vC);
        GL11.glClear((int)id_protected[0]);
        GL11.glEnable((int)id_protected[1]);
        GL11.glStencilFunc((int)id_protected[2], (int)id_byte[1], (int)id_byte[2]);
        GL11.glStencilOp((int)id_protected[3], (int)id_protected[4], (int)id_protected[5]);
        GL11.glColorMask((boolean)id_byte[3], (boolean)id_byte[4], (boolean)id_byte[5], (boolean)id_byte[6]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x29DAF44C;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[2] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfi_3.id_throws();
        rrfi_3.id_case();
        rrfi_3.id_byte();
        rrfi_3.id_protected();
    }

    private static void id_case() {
        id_protected = new short[]{1024, 2960, 519, 7681, 7681, 7681, 514, 7680, 7680, 7680, 2960};
    }

    private static void id_protected() {
        id_break = new int[]{36161, 36161, 34041, 36160, 36128, 36161, 36160, 36096, 36161};
    }
}

