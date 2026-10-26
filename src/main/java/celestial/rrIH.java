/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ng_1;
import celestial.rAL;
import celestial.rrII;
import celestial.rrIR;
import celestial.rrIT;
import celestial.rrIY;
import celestial.rrIf_1;
import celestial.rrIg_1;
import celestial.rrIj_1;
import celestial.rrIl_1;
import celestial.rrIq_1;
import celestial.rrIt_1;
import celestial.rrIw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIH
extends Enum<rrIH> {
    public Object[] fields0d29566e59ec37698621b18f09fc7b34;
    private static boolean[] booleans0d29566e59ec37698621b18f09fc7b34;
    private static byte[] bytes0d29566e59ec37698621b18f09fc7b34;
    private static short[] shorts0d29566e59ec37698621b18f09fc7b34;
    private static String[] strings0d29566e59ec37698621b18f09fc7b34;
    public static Object[] staticFields0d29566e59ec37698621b18f09fc7b34;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[0] = 1;
        shorts0d29566e59ec37698621b18f09fc7b34 = sArray;
    }

    private rrIH() {
        ArrayList arrayList;
        this.id_implements();
        this.fields0d29566e59ec37698621b18f09fc7b34[rrIH.shorts0d29566e59ec37698621b18f09fc7b34[1]] = arrayList = new ArrayList();
        this.id_protected();
    }

    static {
        rrIH.ntfClinit();
    }

    public static rrIH[] values() {
        return (rrIH[])((rrIH[])staticFields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[0]]).clone();
    }

    public static rrIH valueOf(String string) {
        return Enum.valueOf(rrIH.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x10BB36F1F61A5E93L;
    }

    public List<rrIl_1> id_class() {
        return (List)this.fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{78, 48, 93, 94, -63, 109, -25, 76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrIl_1 ... rrIl_1Array) {
        ((List)this.fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[2]]).addAll(List.of(rrIl_1Array));
    }

    public void id_class(Ng_1 ng_1, rAL rAL2) {
        for (rrIl_1 rrIl_12 : (List)((rrIH)((Object)rrIH.staticFields0d29566e59ec37698621b18f09fc7b34[rrIH.shorts0d29566e59ec37698621b18f09fc7b34[3]])).fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[4]]) {
            ng_1.id_class(rrIl_12.id_native(), rrIl_12.id_volatile(), rAL2);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE907A5A7;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[2] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans0d29566e59ec37698621b18f09fc7b34 = blArray;
    }

    private static void id_throws() {
        strings0d29566e59ec37698621b18f09fc7b34 = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrIH.id_break();
        rrIH.id_throws();
        rrIH.id_byte();
        rrIH.id_case();
        rrIH.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rrIH(), new rrIH[]{(rrIH)((Object)objectArray[0])}};
        staticFields0d29566e59ec37698621b18f09fc7b34 = objectArray;
    }

    private static void id_case() {
        bytes0d29566e59ec37698621b18f09fc7b34 = new byte[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 2};
    }

    private void id_implements() {
        if (this.fields0d29566e59ec37698621b18f09fc7b34 == null) {
            Object[] objectArray = this.fields0d29566e59ec37698621b18f09fc7b34 = new Object[booleans0d29566e59ec37698621b18f09fc7b34[7]];
        }
    }

    private void id_protected() {
        rrIl_1[] rrIl_1Array = new rrIl_1[bytes0d29566e59ec37698621b18f09fc7b34[0]];
        rrIl_1Array[rrIH.booleans0d29566e59ec37698621b18f09fc7b34[0]] = new rrIR();
        rrIl_1Array[rrIH.booleans0d29566e59ec37698621b18f09fc7b34[1]] = new rrIg_1();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[1]] = new rrIY();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[2]] = new rrIt_1();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[3]] = new rrIT();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[4]] = new rrIq_1();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[5]] = new rrIw_1();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[6]] = new rrIf_1();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[7]] = new rrIj_1();
        rrIl_1Array[rrIH.bytes0d29566e59ec37698621b18f09fc7b34[8]] = new rrII();
        this.id_class(rrIl_1Array);
    }

    private static /* synthetic */ rrIH[] id_private() {
        rrIH[] rrIHArray = new rrIH[booleans0d29566e59ec37698621b18f09fc7b34[2]];
        rrIHArray[rrIH.booleans0d29566e59ec37698621b18f09fc7b34[3]] = (rrIH)((Object)staticFields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[6]]);
        return rrIHArray;
    }
}

