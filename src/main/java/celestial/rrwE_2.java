/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwE_2
extends Enum<rrwE_2> {
    private static byte[] bytes6648a4467c4f300f966c59969d37f426;
    public Object[] fields6648a4467c4f300f966c59969d37f426;
    private static short[] shorts6648a4467c4f300f966c59969d37f426;
    private static float[] floats6648a4467c4f300f966c59969d37f426;
    private static String[] strings6648a4467c4f300f966c59969d37f426;
    public static Object[] staticFields6648a4467c4f300f966c59969d37f426;
    private static boolean[] booleans6648a4467c4f300f966c59969d37f426;

    private void id_byte() {
        if (this.fields6648a4467c4f300f966c59969d37f426 == null) {
            Object[] objectArray = this.fields6648a4467c4f300f966c59969d37f426 = new Object[bytes6648a4467c4f300f966c59969d37f426[26]];
            objectArray[rrwE_2.booleans6648a4467c4f300f966c59969d37f426[10]] = Float.valueOf(floats6648a4467c4f300f966c59969d37f426[24]);
            objectArray[rrwE_2.booleans6648a4467c4f300f966c59969d37f426[11]] = Float.valueOf(floats6648a4467c4f300f966c59969d37f426[25]);
        }
    }

    private rrwE_2(float f, float f2) {
        this.id_byte();
        Float f3 = Float.valueOf(f);
        this.fields6648a4467c4f300f966c59969d37f426[rrwE_2.shorts6648a4467c4f300f966c59969d37f426[1]] = f3;
        Float f4 = Float.valueOf(f2);
        this.fields6648a4467c4f300f966c59969d37f426[rrwE_2.shorts6648a4467c4f300f966c59969d37f426[2]] = f4;
    }

    static {
        rrwE_2.ntfClinit();
    }

    public static rrwE_2[] values() {
        return (rrwE_2[])((rrwE_2[])staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[0]]).clone();
    }

    public static rrwE_2 valueOf(String string) {
        return Enum.valueOf(rrwE_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30F79DED;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, 8, -10, -65, 4, -21, -53, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCC5C091F406FB317L;
    }

    public float id_class(float f, float f2) {
        return (f - f2) * ((Float)this.fields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[3]]).floatValue();
    }

    public static rrwE_2 id_class(float f, float f2, float f3, float f4) {
        byte by;
        byte by2 = f < f3 / floats6648a4467c4f300f966c59969d37f426[0] ? booleans6648a4467c4f300f966c59969d37f426[0] : (by = f < f3 * floats6648a4467c4f300f966c59969d37f426[1] / floats6648a4467c4f300f966c59969d37f426[2] ? booleans6648a4467c4f300f966c59969d37f426[1] : bytes6648a4467c4f300f966c59969d37f426[0]);
        byte by3 = f2 < f4 / floats6648a4467c4f300f966c59969d37f426[3] ? booleans6648a4467c4f300f966c59969d37f426[2] : (f2 < f4 * floats6648a4467c4f300f966c59969d37f426[4] / floats6648a4467c4f300f966c59969d37f426[5] ? booleans6648a4467c4f300f966c59969d37f426[3] : bytes6648a4467c4f300f966c59969d37f426[1]);
        return rrwE_2.values()[by3 * bytes6648a4467c4f300f966c59969d37f426[2] + by];
    }

    public float id_class() {
        return ((Float)this.fields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[5]]).floatValue();
    }

    public float id_break() {
        return ((Float)this.fields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[6]]).floatValue();
    }

    public float id_break(float f, float f2) {
        return (f - f2) * ((Float)this.fields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[4]]).floatValue();
    }

    private static /* synthetic */ rrwE_2[] id_throws() {
        rrwE_2[] rrwE_2Array = new rrwE_2[bytes6648a4467c4f300f966c59969d37f426[3]];
        rrwE_2Array[rrwE_2.booleans6648a4467c4f300f966c59969d37f426[4]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[7]]);
        rrwE_2Array[rrwE_2.booleans6648a4467c4f300f966c59969d37f426[5]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[8]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[4]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[9]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[5]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[10]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[6]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[11]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[7]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[12]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[8]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[13]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[9]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[14]]);
        rrwE_2Array[rrwE_2.bytes6648a4467c4f300f966c59969d37f426[10]] = (rrwE_2)((Object)staticFields6648a4467c4f300f966c59969d37f426[shorts6648a4467c4f300f966c59969d37f426[15]]);
        return rrwE_2Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwE_2.id_case();
        rrwE_2.id_protected();
        rrwE_2.id_finally();
        rrwE_2.id_private();
        rrwE_2.id_implements();
        rrwE_2.id_catch();
    }

    private static void id_finally() {
        short[] sArray = new short[16];
        sArray[0] = 9;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 7;
        sArray[15] = 8;
        shorts6648a4467c4f300f966c59969d37f426 = sArray;
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2(0.0f, 0.0f), new rrwE_2[]{(rrwE_2)((Object)objectArray[0]), (rrwE_2)((Object)objectArray[1]), (rrwE_2)((Object)objectArray[2]), (rrwE_2)((Object)objectArray[3]), (rrwE_2)((Object)objectArray[4]), (rrwE_2)((Object)objectArray[5]), (rrwE_2)((Object)objectArray[6]), (rrwE_2)((Object)objectArray[7]), (rrwE_2)((Object)objectArray[8])}};
        staticFields6648a4467c4f300f966c59969d37f426 = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        booleans6648a4467c4f300f966c59969d37f426 = blArray;
    }

    private static void id_implements() {
        bytes6648a4467c4f300f966c59969d37f426 = new byte[]{2, 2, 3, 9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 2, 10};
    }

    private static void id_protected() {
        strings6648a4467c4f300f966c59969d37f426 = new String[]{new String("TOP_LEFT"), new String("TOP_CENTER"), new String("TOP_RIGHT"), new String("MIDDLE_LEFT"), new String("CENTER"), new String("MIDDLE_RIGHT"), new String("BOTTOM_LEFT"), new String("BOTTOM_CENTER"), new String("BOTTOM_RIGHT")};
    }

    private static void id_private() {
        float[] fArray = new float[26];
        fArray[0] = 3.0f;
        fArray[1] = 2.0f;
        fArray[2] = 3.0f;
        fArray[3] = 3.0f;
        fArray[4] = 2.0f;
        fArray[5] = 3.0f;
        fArray[8] = 0.5f;
        fArray[10] = 1.0f;
        fArray[13] = 0.5f;
        fArray[14] = 0.5f;
        fArray[15] = 0.5f;
        fArray[16] = 1.0f;
        fArray[17] = 0.5f;
        fArray[19] = 1.0f;
        fArray[20] = 0.5f;
        fArray[21] = 1.0f;
        fArray[22] = 1.0f;
        fArray[23] = 1.0f;
        floats6648a4467c4f300f966c59969d37f426 = fArray;
    }
}

