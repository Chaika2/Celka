/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pf_1
extends Enum<Pf_1> {
    private static short[] shortsc81ab00368b8322fb29ceba592eaabc7;
    private static byte[] bytesc81ab00368b8322fb29ceba592eaabc7;
    public static Object[] staticFieldsc81ab00368b8322fb29ceba592eaabc7;
    private static boolean[] booleansc81ab00368b8322fb29ceba592eaabc7;
    public Object[] fieldsc81ab00368b8322fb29ceba592eaabc7;
    private static String[] stringsc81ab00368b8322fb29ceba592eaabc7;

    private static void id_byte() {
        stringsc81ab00368b8322fb29ceba592eaabc7 = new String[]{new String("ANARCHY"), new String("an"), new String("GRIEF"), new String("grief"), new String("HUB"), new String("hub")};
    }

    private Pf_1(String string2) {
        this.id_protected();
        String string3 = string2;
        this.fieldsc81ab00368b8322fb29ceba592eaabc7[Pf_1.shortsc81ab00368b8322fb29ceba592eaabc7[3]] = string3;
    }

    static {
        Pf_1.ntfClinit();
    }

    public static Pf_1[] values() {
        return (Pf_1[])((Pf_1[])staticFieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[0]]).clone();
    }

    public static Pf_1 valueOf(String string) {
        return Enum.valueOf(Pf_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6553116756172D23L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA4F529B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{111, -121, -108, -6, 82, 125, -118, 92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.fieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[2]];
    }

    public boolean id_break() {
        return this != (Pf_1)((Object)staticFieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[1]]) ? booleansc81ab00368b8322fb29ceba592eaabc7[0] : booleansc81ab00368b8322fb29ceba592eaabc7[1];
    }

    private static void id_throws() {
        bytesc81ab00368b8322fb29ceba592eaabc7 = new byte[]{3, 2, 2, 2, 4, 3, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        Pf_1.id_case();
        Pf_1.id_byte();
        Pf_1.id_catch();
        Pf_1.id_throws();
        Pf_1.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[7];
        sArray[0] = 4;
        sArray[1] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        shortsc81ab00368b8322fb29ceba592eaabc7 = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        booleansc81ab00368b8322fb29ceba592eaabc7 = blArray;
    }

    private static /* synthetic */ Pf_1[] id_implements() {
        Pf_1[] pf_1Array = new Pf_1[bytesc81ab00368b8322fb29ceba592eaabc7[0]];
        pf_1Array[Pf_1.booleansc81ab00368b8322fb29ceba592eaabc7[2]] = (Pf_1)((Object)staticFieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[4]]);
        pf_1Array[Pf_1.booleansc81ab00368b8322fb29ceba592eaabc7[3]] = (Pf_1)((Object)staticFieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[5]]);
        pf_1Array[Pf_1.bytesc81ab00368b8322fb29ceba592eaabc7[1]] = (Pf_1)((Object)staticFieldsc81ab00368b8322fb29ceba592eaabc7[shortsc81ab00368b8322fb29ceba592eaabc7[6]]);
        return pf_1Array;
    }

    private void id_protected() {
        if (this.fieldsc81ab00368b8322fb29ceba592eaabc7 == null) {
            Object[] objectArray = this.fieldsc81ab00368b8322fb29ceba592eaabc7 = new Object[booleansc81ab00368b8322fb29ceba592eaabc7[8]];
        }
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new Pf_1(stringsc81ab00368b8322fb29ceba592eaabc7[1]), new Pf_1(stringsc81ab00368b8322fb29ceba592eaabc7[3]), new Pf_1(stringsc81ab00368b8322fb29ceba592eaabc7[5]), new Pf_1[]{(Pf_1)((Object)objectArray[0]), (Pf_1)((Object)objectArray[1]), (Pf_1)((Object)objectArray[2])}, new Pf_1[]{(Pf_1)((Object)objectArray[0]), (Pf_1)((Object)objectArray[1]), (Pf_1)((Object)objectArray[2])}};
        staticFieldsc81ab00368b8322fb29ceba592eaabc7 = objectArray;
    }
}

