/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.render.BlockEsp;
import celestial.rrIz_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.IntSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqK_2
extends Enum<rrqK_2> {
    public static Object[] staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3;
    private static byte[] bytes052c2fa722bb33cbaa8dc8a4acf6b5f3;
    private static short[] shorts052c2fa722bb33cbaa8dc8a4acf6b5f3;
    private static String[] strings052c2fa722bb33cbaa8dc8a4acf6b5f3;
    private static boolean[] booleans052c2fa722bb33cbaa8dc8a4acf6b5f3;
    public Object[] fields052c2fa722bb33cbaa8dc8a4acf6b5f3;

    private void id_byte() {
        if (this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3 == null) {
            this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3 = new Object[1];
        }
    }

    private rrqK_2(IntSupplier intSupplier) {
        this.id_byte();
        IntSupplier intSupplier2 = intSupplier;
        this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3[rrqK_2.shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[1]] = intSupplier2;
    }

    static {
        rrqK_2.ntfClinit();
    }

    public static rrqK_2[] values() {
        return (rrqK_2[])((rrqK_2[])staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[0]]).clone();
    }

    public static rrqK_2 valueOf(String string) {
        return Enum.valueOf(rrqK_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC452B5DEF5B13C20L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{64, 91, -25, 30, -30, 120, -22, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public IntSupplier id_class() {
        return (IntSupplier)this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[2]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3D9C4A7C;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrqK_2(((rrIz_1)BlockEsp.id_byte[7])::id_byte), new rrqK_2(((rrIz_1)BlockEsp.id_byte[8])::id_byte), new rrqK_2(((rrIz_1)BlockEsp.id_byte[9])::id_byte), new rrqK_2(((rrIz_1)BlockEsp.id_byte[11])::id_byte), new rrqK_2(((rrIz_1)BlockEsp.id_byte[12])::id_byte), new rrqK_2(((rrIz_1)BlockEsp.id_byte[13])::id_byte), new rrqK_2(((rrIz_1)BlockEsp.id_byte[10])::id_byte), new rrqK_2[]{(rrqK_2)((Object)objectArray[0]), (rrqK_2)((Object)objectArray[1]), (rrqK_2)((Object)objectArray[2]), (rrqK_2)((Object)objectArray[3]), (rrqK_2)((Object)objectArray[4]), (rrqK_2)((Object)objectArray[5]), (rrqK_2)((Object)objectArray[6])}};
        staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3 = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans052c2fa722bb33cbaa8dc8a4acf6b5f3 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqK_2.id_throws();
        rrqK_2.id_protected();
        rrqK_2.id_case();
        rrqK_2.id_catch();
        rrqK_2.id_break();
    }

    private static void id_catch() {
        bytes052c2fa722bb33cbaa8dc8a4acf6b5f3 = new byte[]{7, 2, 3, 4, 5, 6, 7, 8, 2, 9, 2, 3, 11, 3, 4, 12, 4, 5, 13, 5, 6, 10, 6, 7, 8};
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[0] = 7;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        shorts052c2fa722bb33cbaa8dc8a4acf6b5f3 = sArray;
    }

    private static void id_protected() {
        strings052c2fa722bb33cbaa8dc8a4acf6b5f3 = new String[]{new String("SPAWNER"), new String("SHULKER"), new String("CHEST"), new String("MINECART"), new String("DISPENSER"), new String("GIFT"), new String("BARREL")};
    }

    private static /* synthetic */ rrqK_2[] id_private() {
        rrqK_2[] rrqK_2Array = new rrqK_2[bytes052c2fa722bb33cbaa8dc8a4acf6b5f3[0]];
        rrqK_2Array[rrqK_2.booleans052c2fa722bb33cbaa8dc8a4acf6b5f3[0]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[3]]);
        rrqK_2Array[rrqK_2.booleans052c2fa722bb33cbaa8dc8a4acf6b5f3[1]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[4]]);
        rrqK_2Array[rrqK_2.bytes052c2fa722bb33cbaa8dc8a4acf6b5f3[1]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[5]]);
        rrqK_2Array[rrqK_2.bytes052c2fa722bb33cbaa8dc8a4acf6b5f3[2]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[6]]);
        rrqK_2Array[rrqK_2.bytes052c2fa722bb33cbaa8dc8a4acf6b5f3[3]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[7]]);
        rrqK_2Array[rrqK_2.bytes052c2fa722bb33cbaa8dc8a4acf6b5f3[4]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[8]]);
        rrqK_2Array[rrqK_2.bytes052c2fa722bb33cbaa8dc8a4acf6b5f3[5]] = (rrqK_2)((Object)staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[shorts052c2fa722bb33cbaa8dc8a4acf6b5f3[9]]);
        return rrqK_2Array;
    }
}

