/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNX
extends Enum<rrNX> {
    public Object[] fields24872387b8fc307e802ef34c708a7fa8;
    private static short[] shorts24872387b8fc307e802ef34c708a7fa8;
    private static String[] strings24872387b8fc307e802ef34c708a7fa8;
    public static Object[] staticFields24872387b8fc307e802ef34c708a7fa8;
    private static boolean[] booleans24872387b8fc307e802ef34c708a7fa8;
    private static byte[] bytes24872387b8fc307e802ef34c708a7fa8;

    private static void id_byte() {
        short[] sArray = new short[18];
        sArray[0] = 15;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        sArray[10] = 7;
        sArray[11] = 8;
        sArray[12] = 9;
        sArray[13] = 10;
        sArray[14] = 11;
        sArray[15] = 12;
        sArray[16] = 13;
        sArray[17] = 14;
        shorts24872387b8fc307e802ef34c708a7fa8 = sArray;
    }

    private rrNX(String string2) {
        this.id_case();
        String string3 = string2;
        this.fields24872387b8fc307e802ef34c708a7fa8[rrNX.shorts24872387b8fc307e802ef34c708a7fa8[2]] = string3;
    }

    static {
        rrNX.ntfClinit();
    }

    public static rrNX[] values() {
        return (rrNX[])((rrNX[])staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[0]]).clone();
    }

    public static rrNX valueOf(String string) {
        return Enum.valueOf(rrNX.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-125, -43, -99, -52, 9, 82, 60, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.fields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7482164F5D28412EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBACF0E38;
    }

    private static /* synthetic */ rrNX[] id_break() {
        rrNX[] rrNXArray = new rrNX[bytes24872387b8fc307e802ef34c708a7fa8[0]];
        rrNXArray[rrNX.booleans24872387b8fc307e802ef34c708a7fa8[0]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[3]]);
        rrNXArray[rrNX.booleans24872387b8fc307e802ef34c708a7fa8[1]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[4]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[1]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[5]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[2]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[6]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[3]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[7]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[4]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[8]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[5]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[9]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[6]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[10]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[7]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[11]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[8]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[12]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[9]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[13]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[10]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[14]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[11]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[15]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[12]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[16]]);
        rrNXArray[rrNX.bytes24872387b8fc307e802ef34c708a7fa8[13]] = (rrNX)((Object)staticFields24872387b8fc307e802ef34c708a7fa8[shorts24872387b8fc307e802ef34c708a7fa8[17]]);
        return rrNXArray;
    }

    private static void id_throws() {
        strings24872387b8fc307e802ef34c708a7fa8 = new String[]{new String("WEAPON"), new String("\u041e\u0440\u0443\u0436\u0438\u0435"), new String("ARMOR"), new String("\u0411\u0440\u043e\u043d\u044f"), new String("ELYTRA"), new String("\u042d\u043b\u0438\u0442\u0440\u044b"), new String("TOOL"), new String("\u0418\u043d\u0441\u0442\u0440\u0443\u043c\u0435\u043d\u0442\u044b"), new String("TALISMAN"), new String("\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d\u044b"), new String("SPHERE"), new String("\u0421\u0444\u0435\u0440\u044b"), new String("SPAWN_EGGS"), new String("\u042f\u0439\u0446\u0430 \u043f\u0440\u0438\u0437\u044b\u0432\u0430"), new String("BOOK"), new String("\u041a\u043d\u0438\u0433\u0438"), new String("ARROW"), new String("\u0421\u0442\u0440\u0435\u043b\u044b"), new String("POTION"), new String("\u0417\u0435\u043b\u044c\u044f"), new String("LOCKPICK"), new String("\u041e\u0442\u043c\u044b\u0447\u043a\u0438"), new String("SIGNAL_FIRE"), new String("\u041c\u0438\u0441\u0442\u044b"), new String("TRAP_SKINS"), new String("\u0421\u043a\u0438\u043d\u044b \u043d\u0430 \u0442\u0440\u0430\u043f\u043a\u0443"), new String("CHUNK_LOADERS"), new String("\u041f\u0440\u043e\u0433\u0440\u0443\u0437\u0447\u0438\u043a\u0438 \u0447\u0430\u043d\u043a\u043e\u0432"), new String("OTHER"), new String("\u0414\u0440\u0443\u0433\u043e\u0435")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrNX.id_protected();
        rrNX.id_throws();
        rrNX.id_byte();
        rrNX.id_catch();
        rrNX.id_private();
    }

    private static void id_catch() {
        bytes24872387b8fc307e802ef34c708a7fa8 = new byte[]{15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16};
    }

    private void id_case() {
        if (this.fields24872387b8fc307e802ef34c708a7fa8 == null) {
            Object[] objectArray = this.fields24872387b8fc307e802ef34c708a7fa8 = new Object[booleans24872387b8fc307e802ef34c708a7fa8[6]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans24872387b8fc307e802ef34c708a7fa8 = blArray;
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rrNX(strings24872387b8fc307e802ef34c708a7fa8[1]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[3]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[5]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[7]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[9]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[11]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[13]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[15]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[17]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[19]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[21]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[23]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[25]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[27]), new rrNX(strings24872387b8fc307e802ef34c708a7fa8[29]), new rrNX[]{(rrNX)((Object)objectArray[0]), (rrNX)((Object)objectArray[1]), (rrNX)((Object)objectArray[2]), (rrNX)((Object)objectArray[3]), (rrNX)((Object)objectArray[4]), (rrNX)((Object)objectArray[5]), (rrNX)((Object)objectArray[6]), (rrNX)((Object)objectArray[7]), (rrNX)((Object)objectArray[8]), (rrNX)((Object)objectArray[9]), (rrNX)((Object)objectArray[10]), (rrNX)((Object)objectArray[11]), (rrNX)((Object)objectArray[12]), (rrNX)((Object)objectArray[13]), (rrNX)((Object)objectArray[14])}};
        staticFields24872387b8fc307e802ef34c708a7fa8 = objectArray;
    }
}

