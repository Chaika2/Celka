/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruK
extends Enum<rruK> {
    private static byte[] bytes11fe8af515b33fa79776ddc4dd3ca7f8;
    public static Object[] staticFields11fe8af515b33fa79776ddc4dd3ca7f8;
    private static int[] integers11fe8af515b33fa79776ddc4dd3ca7f8;
    private static short[] shorts11fe8af515b33fa79776ddc4dd3ca7f8;
    private static boolean[] booleans11fe8af515b33fa79776ddc4dd3ca7f8;
    public Object[] fields11fe8af515b33fa79776ddc4dd3ca7f8;
    private static double[] doubles11fe8af515b33fa79776ddc4dd3ca7f8;
    private static String[] strings11fe8af515b33fa79776ddc4dd3ca7f8;

    private rruK(String string2, Supplier<Integer> supplier) {
        Supplier<Integer> supplier2;
        this.id_final();
        String string3 = string2;
        this.fields11fe8af515b33fa79776ddc4dd3ca7f8[rruK.shorts11fe8af515b33fa79776ddc4dd3ca7f8[3]] = string3;
        this.fields11fe8af515b33fa79776ddc4dd3ca7f8[rruK.shorts11fe8af515b33fa79776ddc4dd3ca7f8[4]] = supplier2 = supplier;
    }

    static {
        rruK.ntfClinit();
    }

    public static rruK[] values() {
        return (rruK[])((rruK[])staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[0]]).clone();
    }

    public static rruK valueOf(String string) {
        return Enum.valueOf(rruK.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1FF2A05F69CCFB4BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE10AFCD8;
    }

    public String id_class() {
        return (String)this.fields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[1]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-57, -101, 79, 79, -97, 71, -19, -68}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Supplier<Integer> id_break() {
        return (Supplier)this.fields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[2]];
    }

    private static void id_throws() {
        strings11fe8af515b33fa79776ddc4dd3ca7f8 = new String[]{new String("RANDOM"), new String("random"), new String("GREEN"), new String("green"), new String("RED"), new String("red"), new String("BLUE"), new String("blue"), new String("YELLOW"), new String("yellow"), new String("PURPLE"), new String("purple"), new String("CYAN"), new String("cyan"), new String("WHITE"), new String("white"), new String("BLACK"), new String("black"), new String("GRAY"), new String("gray"), new String("BROWN"), new String("brown"), new String("ORANGE"), new String("orange"), new String("PINK"), new String("pink"), new String("LIME"), new String("lime"), new String("MAGENTA"), new String("magenta")};
    }

    private static /* synthetic */ void ntfClinit() {
        rruK.id_implements();
        rruK.id_throws();
        rruK.id_package();
        rruK.id_volatile();
        rruK.id_public();
        rruK.id_catch();
        rruK.id_extends();
    }

    private static void id_catch() {
        integers11fe8af515b33fa79776ddc4dd3ca7f8 = new int[]{-65281, -16711936, -5952982, -8355712, -16777216, -16711681, -8388480, -16776961, -65536, -16711936, -16777216};
    }

    private static void id_extends() {
        Object[] objectArray;
        objectArray = new Object[]{new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[1], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[10] | (int)(Math.random() * doubles11fe8af515b33fa79776ddc4dd3ca7f8[0])), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[3], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[9]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[5], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[8]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[7], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[7]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[9], () -> shorts11fe8af515b33fa79776ddc4dd3ca7f8[7]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[11], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[6]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[13], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[5]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[15], () -> bytes11fe8af515b33fa79776ddc4dd3ca7f8[0]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[17], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[4]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[19], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[3]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[21], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[2]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[23], () -> shorts11fe8af515b33fa79776ddc4dd3ca7f8[6]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[25], () -> shorts11fe8af515b33fa79776ddc4dd3ca7f8[5]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[27], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[1]), new rruK(strings11fe8af515b33fa79776ddc4dd3ca7f8[29], () -> integers11fe8af515b33fa79776ddc4dd3ca7f8[0]), new rruK[]{(rruK)((Object)objectArray[0]), (rruK)((Object)objectArray[1]), (rruK)((Object)objectArray[2]), (rruK)((Object)objectArray[3]), (rruK)((Object)objectArray[4]), (rruK)((Object)objectArray[5]), (rruK)((Object)objectArray[6]), (rruK)((Object)objectArray[7]), (rruK)((Object)objectArray[8]), (rruK)((Object)objectArray[9]), (rruK)((Object)objectArray[10]), (rruK)((Object)objectArray[11]), (rruK)((Object)objectArray[12]), (rruK)((Object)objectArray[13]), (rruK)((Object)objectArray[14])}};
        staticFields11fe8af515b33fa79776ddc4dd3ca7f8 = objectArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans11fe8af515b33fa79776ddc4dd3ca7f8 = blArray;
    }

    private static void id_package() {
        short[] sArray = new short[23];
        sArray[0] = 15;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = -16181;
        sArray[6] = -23296;
        sArray[7] = -256;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 4;
        sArray[13] = 5;
        sArray[14] = 6;
        sArray[15] = 7;
        sArray[16] = 8;
        sArray[17] = 9;
        sArray[18] = 10;
        sArray[19] = 11;
        sArray[20] = 12;
        sArray[21] = 13;
        sArray[22] = 14;
        shorts11fe8af515b33fa79776ddc4dd3ca7f8 = sArray;
    }

    private static void id_public() {
        bytes11fe8af515b33fa79776ddc4dd3ca7f8 = new byte[]{-1, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 2, 16};
    }

    private void id_final() {
        if (this.fields11fe8af515b33fa79776ddc4dd3ca7f8 == null) {
            Object[] objectArray = this.fields11fe8af515b33fa79776ddc4dd3ca7f8 = new Object[bytes11fe8af515b33fa79776ddc4dd3ca7f8[42]];
        }
    }

    private static void id_volatile() {
        doubles11fe8af515b33fa79776ddc4dd3ca7f8 = new double[]{1.6777216E7};
    }

    private static /* synthetic */ rruK[] id_synchronized() {
        rruK[] rruKArray = new rruK[bytes11fe8af515b33fa79776ddc4dd3ca7f8[1]];
        rruKArray[rruK.booleans11fe8af515b33fa79776ddc4dd3ca7f8[0]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[8]]);
        rruKArray[rruK.booleans11fe8af515b33fa79776ddc4dd3ca7f8[1]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[9]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[2]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[10]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[3]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[11]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[4]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[12]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[5]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[13]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[6]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[14]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[7]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[15]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[8]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[16]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[9]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[17]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[10]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[18]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[11]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[19]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[12]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[20]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[13]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[21]]);
        rruKArray[rruK.bytes11fe8af515b33fa79776ddc4dd3ca7f8[14]] = (rruK)((Object)staticFields11fe8af515b33fa79776ddc4dd3ca7f8[shorts11fe8af515b33fa79776ddc4dd3ca7f8[22]]);
        return rruKArray;
    }
}

