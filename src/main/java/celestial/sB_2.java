/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_float;
import celestial.C_import;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sB_2
extends Enum<sB_2>
implements C_float<Long> {
    private static boolean[] booleans4194f58175203a8cae693b8dbfb27b1e;
    public static Object[] staticFields4194f58175203a8cae693b8dbfb27b1e;
    private static String[] strings4194f58175203a8cae693b8dbfb27b1e;
    private static byte[] bytes4194f58175203a8cae693b8dbfb27b1e;
    private static short[] shorts4194f58175203a8cae693b8dbfb27b1e;

    private static void id_byte() {
        strings4194f58175203a8cae693b8dbfb27b1e = new String[]{new String("INSTANCE")};
    }

    static {
        sB_2.ntfClinit();
    }

    public static sB_2[] values() {
        return (sB_2[])((sB_2[])staticFields4194f58175203a8cae693b8dbfb27b1e[shorts4194f58175203a8cae693b8dbfb27b1e[0]]).clone();
    }

    public static sB_2 valueOf(String string) {
        return Enum.valueOf(sB_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8C140E6A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x395A7CDEC76607E7L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{58, -78, -94, -102, 72, 5, -81, 29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Class<Long> id_class() {
        return Long.class;
    }

    @Override
    public /* synthetic */ Object id_class(C_import c_import) throws Exception {
        return this.id_break(c_import);
    }

    private static void id_break() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts4194f58175203a8cae693b8dbfb27b1e = sArray;
    }

    public Long id_break(C_import c_import) throws RuntimeException {
        return Long.parseLong(c_import.id_break());
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans4194f58175203a8cae693b8dbfb27b1e = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sB_2.id_throws();
        sB_2.id_byte();
        sB_2.id_break();
        sB_2.id_protected();
        sB_2.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new sB_2(), new sB_2[]{(sB_2)objectArray[0]}};
        staticFields4194f58175203a8cae693b8dbfb27b1e = objectArray;
    }

    private static /* synthetic */ sB_2[] id_case() {
        sB_2[] sB_2Array = new sB_2[booleans4194f58175203a8cae693b8dbfb27b1e[0]];
        sB_2Array[sB_2.booleans4194f58175203a8cae693b8dbfb27b1e[1]] = (sB_2)staticFields4194f58175203a8cae693b8dbfb27b1e[shorts4194f58175203a8cae693b8dbfb27b1e[1]];
        return sB_2Array;
    }

    private static void id_protected() {
        bytes4194f58175203a8cae693b8dbfb27b1e = new byte[]{2};
    }
}

