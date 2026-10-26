/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrZv_1;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.BlurShader;
import celestial.util.MinecraftAccessor;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvk_1 {
    private static float[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        id_throws = blArray;
    }

    static {
        rrvk_1.ntfClinit();
    }

    public static float id_class() {
        vm_3 vm_32 = (vm_3)MinecraftAccessor.id_import.id_class[id_protected[0]];
        if (!(vm_32 instanceof rrZv_1)) {
            return id_break[0];
        }
        rrZv_1 rrZv_12 = (rrZv_1)((Object)vm_32);
        return rrZv_12.id_package().id_byte();
    }

    public static void id_class(Ml_1 ml_1, Runnable runnable, float f) {
        if (ClickGuiTheme.id_throws()) {
            BlurShader.id_class(ml_1, runnable, f);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x93B9910F81F3B359L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF93C53E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{114, -72, 83, 71, 11, -59, 80, -4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new short[]{73};
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0, 0};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvk_1.id_byte();
        rrvk_1.id_break();
        rrvk_1.id_case();
        rrvk_1.id_protected();
        rrvk_1.id_throws();
    }

    private static void id_case() {
        id_break = new float[]{1.0f};
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

