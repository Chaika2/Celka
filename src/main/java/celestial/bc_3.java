/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wg_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rxJ_2;
import celestial.zv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bc_3
extends Enum<bc_3> {
    public static Object[] staticFields88c6ec79f799365a8a83966a191f4fa4;
    private static short[] shorts88c6ec79f799365a8a83966a191f4fa4;
    public Object[] fields88c6ec79f799365a8a83966a191f4fa4;
    private static boolean[] booleans88c6ec79f799365a8a83966a191f4fa4;
    private static String[] strings88c6ec79f799365a8a83966a191f4fa4;
    private static byte[] bytes88c6ec79f799365a8a83966a191f4fa4;

    private static /* synthetic */ bc_3[] id_byte() {
        bc_3[] bc_3Array = new bc_3[bytes88c6ec79f799365a8a83966a191f4fa4[0]];
        bc_3Array[bc_3.booleans88c6ec79f799365a8a83966a191f4fa4[4]] = (bc_3)((Object)staticFields88c6ec79f799365a8a83966a191f4fa4[shorts88c6ec79f799365a8a83966a191f4fa4[3]]);
        bc_3Array[bc_3.booleans88c6ec79f799365a8a83966a191f4fa4[5]] = (bc_3)((Object)staticFields88c6ec79f799365a8a83966a191f4fa4[shorts88c6ec79f799365a8a83966a191f4fa4[4]]);
        return bc_3Array;
    }

    private bc_3(Predicate<rdn_3> predicate) {
        Predicate<rdn_3> predicate2;
        this.id_case();
        this.fields88c6ec79f799365a8a83966a191f4fa4[bc_3.shorts88c6ec79f799365a8a83966a191f4fa4[2]] = predicate2 = predicate;
    }

    static {
        bc_3.ntfClinit();
    }

    public static bc_3[] values() {
        return (bc_3[])((bc_3[])staticFields88c6ec79f799365a8a83966a191f4fa4[shorts88c6ec79f799365a8a83966a191f4fa4[0]]).clone();
    }

    public static bc_3 valueOf(String string) {
        return Enum.valueOf(bc_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x98814C3C29A0B1F9L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, 116, 121, 27, 41, -110, -49, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Predicate<rdn_3> id_class() {
        return (Predicate)this.fields88c6ec79f799365a8a83966a191f4fa4[shorts88c6ec79f799365a8a83966a191f4fa4[1]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x183A364E;
    }

    private static void id_break() {
        bytes88c6ec79f799365a8a83966a191f4fa4 = new byte[]{2, 2, 3};
    }

    private static void id_throws() {
        strings88c6ec79f799365a8a83966a191f4fa4 = new String[]{new String("TRAPDOOR"), new String("SLAB")};
    }

    private static /* synthetic */ void ntfClinit() {
        bc_3.id_private();
        bc_3.id_throws();
        bc_3.id_catch();
        bc_3.id_break();
        bc_3.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[5];
        sArray[0] = 2;
        sArray[4] = 1;
        shorts88c6ec79f799365a8a83966a191f4fa4 = sArray;
    }

    private void id_case() {
        if (this.fields88c6ec79f799365a8a83966a191f4fa4 == null) {
            Object[] objectArray = this.fields88c6ec79f799365a8a83966a191f4fa4 = new Object[booleans88c6ec79f799365a8a83966a191f4fa4[10]];
        }
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new bc_3(rdn_32 -> {
            rxJ_2 rxJ_22;
            rdb_3 rdb_32 = rdn_32.id_break();
            return rdb_32 instanceof rxJ_2 && (rxJ_22 = (rxJ_2)rdb_32).id_catch() instanceof zv_3 ? booleans88c6ec79f799365a8a83966a191f4fa4[2] : booleans88c6ec79f799365a8a83966a191f4fa4[3];
        }), new bc_3(rdn_32 -> {
            rxJ_2 rxJ_22;
            rdb_3 rdb_32 = rdn_32.id_break();
            return rdb_32 instanceof rxJ_2 && (rxJ_22 = (rxJ_2)rdb_32).id_catch() instanceof Wg_1 ? booleans88c6ec79f799365a8a83966a191f4fa4[0] : booleans88c6ec79f799365a8a83966a191f4fa4[1];
        }), new bc_3[]{(bc_3)((Object)objectArray[0]), (bc_3)((Object)objectArray[1])}};
        staticFields88c6ec79f799365a8a83966a191f4fa4 = objectArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        booleans88c6ec79f799365a8a83966a191f4fa4 = blArray;
    }
}

