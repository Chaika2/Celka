/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIA
extends Enum<rrIA> {
    private static String[] stringse25fceafd9d23d67b8a30b04e4e147ad;
    private static byte[] bytese25fceafd9d23d67b8a30b04e4e147ad;
    public Object[] fieldse25fceafd9d23d67b8a30b04e4e147ad;
    private static boolean[] booleanse25fceafd9d23d67b8a30b04e4e147ad;
    private static short[] shortse25fceafd9d23d67b8a30b04e4e147ad;
    public static Object[] staticFieldse25fceafd9d23d67b8a30b04e4e147ad;

    private static /* synthetic */ rrIA[] id_byte() {
        rrIA[] rrIAArray = new rrIA[bytese25fceafd9d23d67b8a30b04e4e147ad[0]];
        rrIAArray[rrIA.booleanse25fceafd9d23d67b8a30b04e4e147ad[0]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[5]]);
        rrIAArray[rrIA.booleanse25fceafd9d23d67b8a30b04e4e147ad[1]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[6]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[1]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[7]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[2]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[8]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[3]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[9]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[4]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[10]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[5]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[11]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[6]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[12]]);
        rrIAArray[rrIA.bytese25fceafd9d23d67b8a30b04e4e147ad[7]] = (rrIA)((Object)staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[13]]);
        return rrIAArray;
    }

    private rrIA(String string2, boolean bl) {
        this.id_protected();
        String string3 = string2;
        this.fieldse25fceafd9d23d67b8a30b04e4e147ad[rrIA.shortse25fceafd9d23d67b8a30b04e4e147ad[1]] = string3;
        Boolean bl2 = bl;
        this.fieldse25fceafd9d23d67b8a30b04e4e147ad[rrIA.shortse25fceafd9d23d67b8a30b04e4e147ad[2]] = bl2;
    }

    static {
        rrIA.ntfClinit();
    }

    public static rrIA[] values() {
        return (rrIA[])((rrIA[])staticFieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[0]]).clone();
    }

    public static rrIA valueOf(String string) {
        return Enum.valueOf(rrIA.class, string);
    }

    public String id_class() {
        return (String)this.fieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x78380792219F12ABL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA1CF5E66;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-52, 99, 31, 36, 102, 99, 119, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_break() {
        return (Boolean)this.fieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[4]];
    }

    private static void id_throws() {
        bytese25fceafd9d23d67b8a30b04e4e147ad = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 2, 10};
    }

    private static /* synthetic */ void ntfClinit() {
        rrIA.id_private();
        rrIA.id_case();
        rrIA.id_implements();
        rrIA.id_throws();
        rrIA.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[1], true), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[3], false), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[5], false), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[7], false), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[9], false), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[11], true), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[13], true), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[15], false), new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[17], false), new rrIA[]{(rrIA)((Object)objectArray[0]), (rrIA)((Object)objectArray[1]), (rrIA)((Object)objectArray[2]), (rrIA)((Object)objectArray[3]), (rrIA)((Object)objectArray[4]), (rrIA)((Object)objectArray[5]), (rrIA)((Object)objectArray[6]), (rrIA)((Object)objectArray[7]), (rrIA)((Object)objectArray[8])}};
        staticFieldse25fceafd9d23d67b8a30b04e4e147ad = objectArray;
    }

    private static void id_case() {
        stringse25fceafd9d23d67b8a30b04e4e147ad = new String[]{new String("PLAYERS"), new String("\u0418\u0433\u0440\u043e\u043a\u0438"), new String("NAKED_PLAYERS"), new String("\u0413\u043e\u043b\u044b\u0435 \u0438\u0433\u0440\u043e\u043a\u0438"), new String("FRIENDS"), new String("\u0414\u0440\u0443\u0437\u044c\u044f"), new String("MONSTERS"), new String("\u041c\u043e\u043d\u0441\u0442\u0440\u044b"), new String("ANIMALS"), new String("\u0416\u0438\u0432\u043e\u0442\u043d\u044b\u0435"), new String("INVISIBLES"), new String("\u041d\u0435\u0432\u0438\u0434\u0438\u043c\u044b\u0435"), new String("ITEMS"), new String("\u041f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"), new String("BOTS"), new String("\u0411\u043e\u0442\u044b"), new String("ENDER_PEARLS"), new String("\u042d\u043d\u0434\u0435\u0440-\u043f\u0451\u0440\u043b\u044b")};
    }

    private static void id_implements() {
        short[] sArray = new short[14];
        sArray[0] = 9;
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
        shortse25fceafd9d23d67b8a30b04e4e147ad = sArray;
    }

    private void id_protected() {
        if (this.fieldse25fceafd9d23d67b8a30b04e4e147ad == null) {
            Object[] objectArray = this.fieldse25fceafd9d23d67b8a30b04e4e147ad = new Object[bytese25fceafd9d23d67b8a30b04e4e147ad[23]];
            objectArray[rrIA.booleanse25fceafd9d23d67b8a30b04e4e147ad[15]] = booleanse25fceafd9d23d67b8a30b04e4e147ad[16];
        }
    }

    private static void id_private() {
        boolean[] blArray = new boolean[17];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[15] = true;
        booleanse25fceafd9d23d67b8a30b04e4e147ad = blArray;
    }
}

