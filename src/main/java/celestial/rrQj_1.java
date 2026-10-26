/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQj_1
extends Enum<rrQj_1> {
    private static String[] stringsc4090a7bea7631ca9c84243abffd0bdb;
    public Object[] fieldsc4090a7bea7631ca9c84243abffd0bdb;
    private static boolean[] booleansc4090a7bea7631ca9c84243abffd0bdb;
    public static Object[] staticFieldsc4090a7bea7631ca9c84243abffd0bdb;
    private static byte[] bytesc4090a7bea7631ca9c84243abffd0bdb;
    private static short[] shortsc4090a7bea7631ca9c84243abffd0bdb;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[1]), new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[3]), new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[5]), new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[7]), new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[9]), new rrQj_1[]{(rrQj_1)((Object)objectArray[0]), (rrQj_1)((Object)objectArray[1]), (rrQj_1)((Object)objectArray[2]), (rrQj_1)((Object)objectArray[3]), (rrQj_1)((Object)objectArray[4])}};
        staticFieldsc4090a7bea7631ca9c84243abffd0bdb = objectArray;
    }

    private rrQj_1(String string2) {
        this.id_catch();
        String string3 = string2;
        this.fieldsc4090a7bea7631ca9c84243abffd0bdb[rrQj_1.shortsc4090a7bea7631ca9c84243abffd0bdb[1]] = string3;
    }

    static {
        rrQj_1.ntfClinit();
    }

    public String toString() {
        return (String)this.fieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[2]];
    }

    public static rrQj_1[] values() {
        return (rrQj_1[])((rrQj_1[])staticFieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[0]]).clone();
    }

    public static rrQj_1 valueOf(String string) {
        return Enum.valueOf(rrQj_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x12B58440;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x34AE7097BBF7A27EL;
    }

    private static /* synthetic */ rrQj_1[] id_class() {
        rrQj_1[] rrQj_1Array = new rrQj_1[bytesc4090a7bea7631ca9c84243abffd0bdb[0]];
        rrQj_1Array[rrQj_1.booleansc4090a7bea7631ca9c84243abffd0bdb[0]] = (rrQj_1)((Object)staticFieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[3]]);
        rrQj_1Array[rrQj_1.booleansc4090a7bea7631ca9c84243abffd0bdb[1]] = (rrQj_1)((Object)staticFieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[4]]);
        rrQj_1Array[rrQj_1.bytesc4090a7bea7631ca9c84243abffd0bdb[1]] = (rrQj_1)((Object)staticFieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[5]]);
        rrQj_1Array[rrQj_1.bytesc4090a7bea7631ca9c84243abffd0bdb[2]] = (rrQj_1)((Object)staticFieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[6]]);
        rrQj_1Array[rrQj_1.bytesc4090a7bea7631ca9c84243abffd0bdb[3]] = (rrQj_1)((Object)staticFieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[7]]);
        return rrQj_1Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{2, 23, 32, -4, 53, 74, -31, 106}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytesc4090a7bea7631ca9c84243abffd0bdb = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static void id_throws() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shortsc4090a7bea7631ca9c84243abffd0bdb = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQj_1.id_protected();
        rrQj_1.id_case();
        rrQj_1.id_throws();
        rrQj_1.id_break();
        rrQj_1.id_byte();
    }

    private void id_catch() {
        if (this.fieldsc4090a7bea7631ca9c84243abffd0bdb == null) {
            Object[] objectArray = this.fieldsc4090a7bea7631ca9c84243abffd0bdb = new Object[booleansc4090a7bea7631ca9c84243abffd0bdb[6]];
        }
    }

    private static void id_case() {
        stringsc4090a7bea7631ca9c84243abffd0bdb = new String[]{new String("DEFAULT"), new String(""), new String("SELECT_ACCOUNT"), new String("select_account"), new String("LOGIN"), new String("login"), new String("NONE"), new String("none"), new String("CONSENT"), new String("consent")};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleansc4090a7bea7631ca9c84243abffd0bdb = blArray;
    }
}

