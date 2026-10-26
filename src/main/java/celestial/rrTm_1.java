/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrHv_1;
import celestial.rrTZ;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTm_1
extends Enum<rrTm_1> {
    private static short[] shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4;
    private static boolean[] booleans9ecc5a8aa54b3c499a2c916d8fcc4ea4;
    public static Object[] staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4;
    public Object[] fields9ecc5a8aa54b3c499a2c916d8fcc4ea4;
    private static byte[] bytes9ecc5a8aa54b3c499a2c916d8fcc4ea4;
    private static String[] strings9ecc5a8aa54b3c499a2c916d8fcc4ea4;

    private static void id_byte() {
        bytes9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new byte[]{2, 2};
    }

    private rrTm_1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_case();
        this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[rrTm_1.shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[1]] = arrayList2 = new ArrayList();
        this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[rrTm_1.shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[2]] = arrayList = new ArrayList();
    }

    static {
        rrTm_1.ntfClinit();
    }

    public static rrTm_1[] values() {
        return (rrTm_1[])((rrTm_1[])staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]]).clone();
    }

    public static rrTm_1 valueOf(String string) {
        return Enum.valueOf(rrTm_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x90AA1C37C02B8F14L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB4B9CCB9;
    }

    public void id_class(rrTZ rrTZ2) {
        ((List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[6]]).remove(rrTZ2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, 2, 44, 114, -118, 60, 120, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrHv_1 rrHv_12) {
        ((List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[3]]).add(rrHv_12);
        for (rrTZ rrTZ2 : (List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[4]]) {
            rrTZ2.id_class(rrHv_12);
        }
    }

    public List<rrTZ> id_class() {
        return (List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[8]];
    }

    public List<rrHv_1> id_break() {
        return (List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[7]];
    }

    public void id_break(rrTZ rrTZ2) {
        ((List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[5]]).add(rrTZ2);
    }

    private static /* synthetic */ rrTm_1[] id_throws() {
        rrTm_1[] rrTm_1Array = new rrTm_1[booleans9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]];
        rrTm_1Array[rrTm_1.booleans9ecc5a8aa54b3c499a2c916d8fcc4ea4[1]] = (rrTm_1)((Object)staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[9]]);
        return rrTm_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTm_1.id_implements();
        rrTm_1.id_protected();
        rrTm_1.id_private();
        rrTm_1.id_byte();
        rrTm_1.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rrTm_1(), new rrTm_1[]{(rrTm_1)((Object)objectArray[0])}};
        staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4 = objectArray;
    }

    private void id_case() {
        if (this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4 == null) {
            Object[] objectArray = this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new Object[bytes9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]];
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans9ecc5a8aa54b3c499a2c916d8fcc4ea4 = blArray;
    }

    private static void id_protected() {
        strings9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new String[]{new String("INSTANCE")};
    }

    private static void id_private() {
        short[] sArray = new short[10];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4 = sArray;
    }
}

