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

public class sr_3
extends Enum<sr_3>
implements C_float<Float> {
    public static Object[] staticFieldsdd9a043fbdee37a982ad31015e01625d;
    private static String[] stringsdd9a043fbdee37a982ad31015e01625d;
    private static short[] shortsdd9a043fbdee37a982ad31015e01625d;
    private static byte[] bytesdd9a043fbdee37a982ad31015e01625d;
    private static boolean[] booleansdd9a043fbdee37a982ad31015e01625d;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansdd9a043fbdee37a982ad31015e01625d = blArray;
    }

    static {
        sr_3.ntfClinit();
    }

    public static sr_3[] values() {
        return (sr_3[])((sr_3[])staticFieldsdd9a043fbdee37a982ad31015e01625d[shortsdd9a043fbdee37a982ad31015e01625d[0]]).clone();
    }

    public static sr_3 valueOf(String string) {
        return Enum.valueOf(sr_3.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-19, -2, 123, 52, 49, -96, -102, -68}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ Object id_class(C_import c_import) throws Exception {
        return this.id_break(c_import);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x234805AB20636848L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE1D0A6A3;
    }

    @Override
    public Class<Float> id_class() {
        return Float.class;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new sr_3(), new sr_3[]{(sr_3)objectArray[0]}};
        staticFieldsdd9a043fbdee37a982ad31015e01625d = objectArray;
    }

    public Float id_break(C_import c_import) throws RuntimeException {
        String string = c_import.id_break();
        if (!string.matches(stringsdd9a043fbdee37a982ad31015e01625d[0])) {
            throw new IllegalArgumentException(stringsdd9a043fbdee37a982ad31015e01625d[1]);
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    private static /* synthetic */ sr_3[] id_throws() {
        sr_3[] sr_3Array = new sr_3[booleansdd9a043fbdee37a982ad31015e01625d[0]];
        sr_3Array[sr_3.booleansdd9a043fbdee37a982ad31015e01625d[1]] = (sr_3)staticFieldsdd9a043fbdee37a982ad31015e01625d[shortsdd9a043fbdee37a982ad31015e01625d[1]];
        return sr_3Array;
    }

    private static /* synthetic */ void ntfClinit() {
        sr_3.id_byte();
        sr_3.id_case();
        sr_3.id_catch();
        sr_3.id_protected();
        sr_3.id_break();
    }

    private static void id_catch() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shortsdd9a043fbdee37a982ad31015e01625d = sArray;
    }

    private static void id_case() {
        stringsdd9a043fbdee37a982ad31015e01625d = new String[]{new String("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$"), new String("failed float format check"), new String("INSTANCE")};
    }

    private static void id_protected() {
        bytesdd9a043fbdee37a982ad31015e01625d = new byte[]{2};
    }
}

