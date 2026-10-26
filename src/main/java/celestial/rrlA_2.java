/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JI;
import celestial.JV;
import celestial.Ji_1;
import celestial.Jt_1;
import celestial.dM_2;
import celestial.dN_2;
import celestial.dQ_2;
import celestial.dq_3;
import celestial.kL_2;
import celestial.kS_2;
import celestial.kV_2;
import celestial.module.player.NoInteract;
import celestial.rrIk_1;
import celestial.xd_3;
import celestial.xs_3;
import celestial.zv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlA_2
extends Enum<rrlA_2> {
    public static Object[] staticFields3851b9c979ec3bbaa39604ca840084aa;
    public Object[] fields3851b9c979ec3bbaa39604ca840084aa;
    private static byte[] bytes3851b9c979ec3bbaa39604ca840084aa;
    private static String[] strings3851b9c979ec3bbaa39604ca840084aa;
    private static boolean[] booleans3851b9c979ec3bbaa39604ca840084aa;
    private static short[] shorts3851b9c979ec3bbaa39604ca840084aa;

    private static void id_byte() {
        strings3851b9c979ec3bbaa39604ca840084aa = new String[]{new String("CHESTS"), new String("BARRELS"), new String("DOORS"), new String("HOPPERS"), new String("BUTTONS"), new String("DISPENSERS"), new String("NOTE_BLOCKS"), new String("CRAFTING_TABLES"), new String("TRAP_DOORS"), new String("FURNACES"), new String("GATES"), new String("ANVILS"), new String("LEVERS")};
    }

    private rrlA_2(Class<? extends xd_3> clazz, Supplier<Boolean> supplier) {
        Supplier<Boolean> supplier2;
        Class<? extends xd_3> clazz2;
        this.id_catch();
        this.fields3851b9c979ec3bbaa39604ca840084aa[rrlA_2.shorts3851b9c979ec3bbaa39604ca840084aa[1]] = clazz2 = clazz;
        this.fields3851b9c979ec3bbaa39604ca840084aa[rrlA_2.shorts3851b9c979ec3bbaa39604ca840084aa[2]] = supplier2 = supplier;
    }

    static {
        rrlA_2.ntfClinit();
    }

    public static rrlA_2[] values() {
        return (rrlA_2[])((rrlA_2[])staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[0]]).clone();
    }

    public static rrlA_2 valueOf(String string) {
        return Enum.valueOf(rrlA_2.class, string);
    }

    public Supplier<Boolean> id_class() {
        return (Supplier)this.fields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8C75DCD;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-106, 106, -19, 120, -81, 59, -56, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE3075D48E8FBDD6L;
    }

    public Class<? extends xd_3> id_break() {
        return (Class)this.fields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[3]];
    }

    private static void id_throws() {
        short[] sArray = new short[18];
        sArray[0] = 13;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[10] = 5;
        sArray[11] = 6;
        sArray[12] = 7;
        sArray[13] = 8;
        sArray[14] = 9;
        sArray[15] = 10;
        sArray[16] = 11;
        sArray[17] = 12;
        shorts3851b9c979ec3bbaa39604ca840084aa = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlA_2.id_private();
        rrlA_2.id_byte();
        rrlA_2.id_throws();
        rrlA_2.id_case();
        rrlA_2.id_implements();
    }

    private void id_catch() {
        if (this.fields3851b9c979ec3bbaa39604ca840084aa == null) {
            this.fields3851b9c979ec3bbaa39604ca840084aa = new Object[2];
        }
    }

    private static void id_case() {
        bytes3851b9c979ec3bbaa39604ca840084aa = new byte[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3, 4, 2, 5, 2, 3, 6, 3, 4, 7, 4, 5, 8, 5, 6, 9, 6, 7, 10, 7, 8, 11, 8, 9, 12, 9, 10, 13, 10, 11, 14, 11, 12, 15, 12, 13, 2, 14};
    }

    private static void id_implements() {
        Object[] objectArray;
        objectArray = new Object[]{new rrlA_2(JI.class, ((rrIk_1)NoInteract.id_byte[3])::id_class), new rrlA_2(xs_3.class, ((rrIk_1)NoInteract.id_byte[4])::id_class), new rrlA_2(dN_2.class, ((rrIk_1)NoInteract.id_byte[5])::id_class), new rrlA_2(kS_2.class, ((rrIk_1)NoInteract.id_byte[6])::id_class), new rrlA_2(Jt_1.class, ((rrIk_1)NoInteract.id_byte[7])::id_class), new rrlA_2(dQ_2.class, ((rrIk_1)NoInteract.id_byte[8])::id_class), new rrlA_2(kV_2.class, ((rrIk_1)NoInteract.id_byte[9])::id_class), new rrlA_2(dM_2.class, ((rrIk_1)NoInteract.id_byte[10])::id_class), new rrlA_2(zv_3.class, ((rrIk_1)NoInteract.id_byte[11])::id_class), new rrlA_2(JV.class, ((rrIk_1)NoInteract.id_byte[12])::id_class), new rrlA_2(dq_3.class, ((rrIk_1)NoInteract.id_byte[13])::id_class), new rrlA_2(Ji_1.class, ((rrIk_1)NoInteract.id_byte[14])::id_class), new rrlA_2(kL_2.class, ((rrIk_1)NoInteract.id_byte[15])::id_class), new rrlA_2[]{(rrlA_2)((Object)objectArray[0]), (rrlA_2)((Object)objectArray[1]), (rrlA_2)((Object)objectArray[2]), (rrlA_2)((Object)objectArray[3]), (rrlA_2)((Object)objectArray[4]), (rrlA_2)((Object)objectArray[5]), (rrlA_2)((Object)objectArray[6]), (rrlA_2)((Object)objectArray[7]), (rrlA_2)((Object)objectArray[8]), (rrlA_2)((Object)objectArray[9]), (rrlA_2)((Object)objectArray[10]), (rrlA_2)((Object)objectArray[11]), (rrlA_2)((Object)objectArray[12])}};
        staticFields3851b9c979ec3bbaa39604ca840084aa = objectArray;
    }

    private static /* synthetic */ rrlA_2[] id_protected() {
        rrlA_2[] rrlA_2Array = new rrlA_2[bytes3851b9c979ec3bbaa39604ca840084aa[0]];
        rrlA_2Array[rrlA_2.booleans3851b9c979ec3bbaa39604ca840084aa[0]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[5]]);
        rrlA_2Array[rrlA_2.booleans3851b9c979ec3bbaa39604ca840084aa[1]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[6]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[1]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[7]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[2]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[8]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[3]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[9]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[4]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[10]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[5]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[11]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[6]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[12]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[7]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[13]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[8]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[14]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[9]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[15]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[10]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[16]]);
        rrlA_2Array[rrlA_2.bytes3851b9c979ec3bbaa39604ca840084aa[11]] = (rrlA_2)((Object)staticFields3851b9c979ec3bbaa39604ca840084aa[shorts3851b9c979ec3bbaa39604ca840084aa[17]]);
        return rrlA_2Array;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans3851b9c979ec3bbaa39604ca840084aa = blArray;
    }
}

