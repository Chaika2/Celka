/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrvs_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvd_1
extends Enum<rrvd_1> {
    private static byte[] bytesf24d96aa22ff35f08b8eb2172b2f28e7;
    private static boolean[] booleansf24d96aa22ff35f08b8eb2172b2f28e7;
    private static short[] shortsf24d96aa22ff35f08b8eb2172b2f28e7;
    public static Object[] staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7;
    public Object[] fieldsf24d96aa22ff35f08b8eb2172b2f28e7;
    private static String[] stringsf24d96aa22ff35f08b8eb2172b2f28e7;

    public void id_byte() {
        ((Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[4]]).clear();
    }

    private rrvd_1() {
        HashSet hashSet;
        this.id_catch();
        this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[rrvd_1.shortsf24d96aa22ff35f08b8eb2172b2f28e7[1]] = hashSet = new HashSet();
    }

    static {
        rrvd_1.ntfClinit();
    }

    public static rrvd_1[] values() {
        return (rrvd_1[])((rrvd_1[])staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[0]]).clone();
    }

    public static rrvd_1 valueOf(String string) {
        return Enum.valueOf(rrvd_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{29, 85, -75, -98, -123, -117, 72, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x91F4FAD7;
    }

    public void id_class(rrvs_1 rrvs_12) {
        ((Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[3]]).remove(rrvs_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD7E4FCCDC7C444EL;
    }

    public Set<rrvs_1> id_class() {
        return (Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[6]];
    }

    public void id_break(rrvs_1 rrvs_12) {
        ((Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[2]]).add(rrvs_12);
    }

    public boolean id_break() {
        for (rrvs_1 rrvs_12 : (Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[5]]) {
            if (!rrvs_12.aO_()) continue;
            return booleansf24d96aa22ff35f08b8eb2172b2f28e7[0];
        }
        return booleansf24d96aa22ff35f08b8eb2172b2f28e7[1];
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrvd_1(), new rrvd_1[]{(rrvd_1)((Object)objectArray[0])}};
        staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvd_1.id_implements();
        rrvd_1.id_private();
        rrvd_1.id_finally();
        rrvd_1.id_protected();
        rrvd_1.id_throws();
    }

    private static void id_finally() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        shortsf24d96aa22ff35f08b8eb2172b2f28e7 = sArray;
    }

    private void id_catch() {
        if (this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7 == null) {
            Object[] objectArray = this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7 = new Object[booleansf24d96aa22ff35f08b8eb2172b2f28e7[7]];
        }
    }

    private static /* synthetic */ rrvd_1[] id_case() {
        rrvd_1[] rrvd_1Array = new rrvd_1[booleansf24d96aa22ff35f08b8eb2172b2f28e7[2]];
        rrvd_1Array[rrvd_1.booleansf24d96aa22ff35f08b8eb2172b2f28e7[3]] = (rrvd_1)((Object)staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[shortsf24d96aa22ff35f08b8eb2172b2f28e7[7]]);
        return rrvd_1Array;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansf24d96aa22ff35f08b8eb2172b2f28e7 = blArray;
    }

    private static void id_protected() {
        bytesf24d96aa22ff35f08b8eb2172b2f28e7 = new byte[]{2};
    }

    private static void id_private() {
        stringsf24d96aa22ff35f08b8eb2172b2f28e7 = new String[]{new String("INSTANCE")};
    }
}

