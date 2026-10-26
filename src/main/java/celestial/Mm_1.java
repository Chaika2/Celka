/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 */
package celestial;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mm_1 {
    private static String[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    public int id_byte() {
        return (Integer)this.id_class[id_byte[5]];
    }

    public Mm_1(int n) {
        this.id_catch();
        Integer n2 = n;
        this.id_class[Mm_1.id_byte[0]] = n2;
        byte[] byArray = Mm_1.id_class((Integer)this.id_class[id_byte[1]]);
        this.id_class[Mm_1.id_byte[2]] = byArray;
        Integer n3 = ((byte[])this.id_class[id_byte[3]]).length;
        this.id_class[Mm_1.id_byte[4]] = n3;
    }

    static {
        Mm_1.ntfClinit();
    }

    public byte[] id_class() {
        return (byte[])this.id_class[id_byte[7]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{6, 58, -126, 4, 76, 79, 48, -105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4DC3F32FBCD7A01DL;
    }

    private static byte[] id_class(int n) {
        ByteArrayList byteArrayList = new ByteArrayList();
        int n2 = n;
        while ((n2 & id_byte[8]) != 0) {
            byteArrayList.add((byte)(n2 & id_throws[0] | id_byte[9]));
            n2 >>>= id_throws[1];
        }
        byteArrayList.add((byte)(n2 & id_byte[10]));
        return byteArrayList.toByteArray();
    }

    public static Mm_1 id_class(byte[] byArray) {
        return Mm_1.id_class(byArray, id_protected[0]);
    }

    public static Mm_1 id_class(byte[] byArray, int n) {
        byte by;
        int n2 = id_protected[1];
        int n3 = id_protected[2];
        int n4 = n;
        do {
            by = byArray[n4++];
            n2 |= (by & id_throws[2]) << n3++ * id_throws[3];
            if (n3 <= id_throws[4]) continue;
            throw new IllegalArgumentException(id_break[0]);
        } while ((by & id_byte[11]) != 0);
        return new Mm_1(n2);
    }

    public int id_break() {
        return (Integer)this.id_class[id_byte[6]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x25F8A5;
    }

    private static void id_throws() {
        id_break = new String[]{new String("VarInt size cannot exceed 5 bytes")};
    }

    private static /* synthetic */ void ntfClinit() {
        Mm_1.id_private();
        Mm_1.id_throws();
        Mm_1.id_case();
        Mm_1.id_protected();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[5]];
            objectArray[Mm_1.id_protected[3]] = id_protected[4];
            objectArray[Mm_1.id_throws[6]] = id_protected[5];
        }
    }

    private static void id_case() {
        short[] sArray = new short[12];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 128;
        sArray[9] = 128;
        sArray[10] = 255;
        sArray[11] = 128;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_throws = new byte[]{127, 7, 127, 7, 5, 3, 2};
    }

    private static void id_private() {
        id_protected = new boolean[6];
    }
}

