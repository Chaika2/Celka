/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfq_3
extends Enum<rrfq_3> {
    private static short[] shorts8f8c034c8eef39ccbbc33e665d937d16;
    public static Object[] staticFields8f8c034c8eef39ccbbc33e665d937d16;
    public Object[] fields8f8c034c8eef39ccbbc33e665d937d16;
    private static byte[] bytes8f8c034c8eef39ccbbc33e665d937d16;
    private static boolean[] booleans8f8c034c8eef39ccbbc33e665d937d16;
    private static String[] strings8f8c034c8eef39ccbbc33e665d937d16;

    private static void id_byte() {
        short[] sArray = new short[13];
        sArray[0] = 10;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        sArray[10] = 7;
        sArray[11] = 8;
        sArray[12] = 9;
        shorts8f8c034c8eef39ccbbc33e665d937d16 = sArray;
    }

    private rrfq_3(String ... stringArray) {
        String[] stringArray2;
        this.id_case();
        this.fields8f8c034c8eef39ccbbc33e665d937d16[rrfq_3.shorts8f8c034c8eef39ccbbc33e665d937d16[1]] = stringArray2 = stringArray;
    }

    static {
        rrfq_3.ntfClinit();
    }

    public static rrfq_3[] values() {
        return (rrfq_3[])((rrfq_3[])staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[0]]).clone();
    }

    public static rrfq_3 valueOf(String string) {
        return Enum.valueOf(rrfq_3.class, string);
    }

    public String[] id_class() {
        return (String[])this.fields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[2]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9ACF2C84D24E2D3CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, 101, 120, 26, -11, 93, 76, 3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCBD1DC29;
    }

    private static void id_break() {
        bytes8f8c034c8eef39ccbbc33e665d937d16 = new byte[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 2, 6, 7, 7, 8, 8, 9, 9, 10, 11};
    }

    private static /* synthetic */ rrfq_3[] id_throws() {
        rrfq_3[] rrfq_3Array = new rrfq_3[bytes8f8c034c8eef39ccbbc33e665d937d16[0]];
        rrfq_3Array[rrfq_3.booleans8f8c034c8eef39ccbbc33e665d937d16[0]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[3]]);
        rrfq_3Array[rrfq_3.booleans8f8c034c8eef39ccbbc33e665d937d16[1]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[4]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[1]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[5]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[2]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[6]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[3]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[7]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[4]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[8]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[5]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[9]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[6]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[10]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[7]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[11]]);
        rrfq_3Array[rrfq_3.bytes8f8c034c8eef39ccbbc33e665d937d16[8]] = (rrfq_3)((Object)staticFields8f8c034c8eef39ccbbc33e665d937d16[shorts8f8c034c8eef39ccbbc33e665d937d16[12]]);
        return rrfq_3Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfq_3.id_private();
        rrfq_3.id_protected();
        rrfq_3.id_byte();
        rrfq_3.id_break();
        rrfq_3.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[11];
        String[] stringArray = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[1], strings8f8c034c8eef39ccbbc33e665d937d16[2]};
        objectArray[0] = new rrfq_3(stringArray);
        String[] stringArray2 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[4]};
        objectArray[1] = new rrfq_3(stringArray2);
        String[] stringArray3 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[6]};
        objectArray[2] = new rrfq_3(stringArray3);
        String[] stringArray4 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[8]};
        objectArray[3] = new rrfq_3(stringArray4);
        String[] stringArray5 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[10]};
        objectArray[4] = new rrfq_3(stringArray5);
        String[] stringArray6 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[12]};
        objectArray[5] = new rrfq_3(stringArray6);
        String[] stringArray7 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[14], strings8f8c034c8eef39ccbbc33e665d937d16[15]};
        objectArray[6] = new rrfq_3(stringArray7);
        String[] stringArray8 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[17]};
        objectArray[7] = new rrfq_3(stringArray8);
        String[] stringArray9 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[19]};
        objectArray[8] = new rrfq_3(stringArray9);
        String[] stringArray10 = new String[]{strings8f8c034c8eef39ccbbc33e665d937d16[21]};
        objectArray[9] = new rrfq_3(stringArray10);
        objectArray[10] = new rrfq_3[]{(rrfq_3)((Object)objectArray[0]), (rrfq_3)((Object)objectArray[1]), (rrfq_3)((Object)objectArray[2]), (rrfq_3)((Object)objectArray[3]), (rrfq_3)((Object)objectArray[4]), (rrfq_3)((Object)objectArray[5]), (rrfq_3)((Object)objectArray[6]), (rrfq_3)((Object)objectArray[7]), (rrfq_3)((Object)objectArray[8]), (rrfq_3)((Object)objectArray[9])};
        staticFields8f8c034c8eef39ccbbc33e665d937d16 = objectArray;
    }

    private void id_case() {
        if (this.fields8f8c034c8eef39ccbbc33e665d937d16 == null) {
            this.fields8f8c034c8eef39ccbbc33e665d937d16 = new Object[1];
        }
    }

    private static void id_protected() {
        strings8f8c034c8eef39ccbbc33e665d937d16 = new String[]{new String("REALLY_WORLD"), new String("reallyworld"), new String("playrw"), new String("ARES_MINE"), new String("aresmine"), new String("FUNTIME"), new String("funtime"), new String("FUNSKY"), new String("funsky"), new String("SPOOKY_TIME"), new String("spookytime"), new String("SLIME_WORLD"), new String("slimeworld"), new String("HOLY_WORLD"), new String("holyworld"), new String("hollyworld"), new String("SUNRISE"), new String("sunmc"), new String("INFINITY_HVH"), new String("infinityhvh"), new String("META_HVH"), new String("metahvh")};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[27];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        booleans8f8c034c8eef39ccbbc33e665d937d16 = blArray;
    }
}

