/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrTE;
import celestial.rrTS;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTB {
    private static byte[] id_break;
    public Object[] id_class;
    private static float[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;
    private static boolean[] id_case;

    public float id_byte() {
        return ((Float)this.id_class[id_protected[9]]).floatValue();
    }

    public rrTB(rrTS rrTS2, String string, rrTE[] rrTEArray) {
        rrTE[] rrTEArray2;
        this.id_finally();
        String string2 = id_throws[0];
        this.id_class[rrTB.id_protected[0]] = string2;
        rrTS rrTS3 = rrTS2;
        this.id_class[rrTB.id_protected[1]] = rrTS3;
        String string3 = string;
        this.id_class[rrTB.id_protected[2]] = string3;
        this.id_class[rrTB.id_protected[3]] = rrTEArray2 = rrTEArray;
    }

    static {
        rrTB.ntfClinit();
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrTB.id_protected[13]] = f2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB42D577006485597L;
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrTB.id_protected[14]] = n2;
    }

    public rrTS id_class() {
        return (rrTS)((Object)this.id_class[id_protected[5]]);
    }

    public void id_class(LocalDateTime localDateTime) {
        LocalDateTime localDateTime2 = localDateTime;
        this.id_class[rrTB.id_protected[12]] = localDateTime2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{101, 127, -48, 114, -100, 14, -86, 34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x15496DCF;
    }

    public void id_break(String string) {
        String string2 = string;
        this.id_class[rrTB.id_protected[11]] = string2;
    }

    public int id_break() {
        return (Integer)this.id_class[id_protected[10]];
    }

    public String id_throws() {
        return (String)this.id_class[id_protected[6]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrTB.id_implements();
        rrTB.id_native();
        rrTB.id_extends();
        rrTB.id_private();
        rrTB.id_volatile();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[7];
            this.id_class[5] = Float.valueOf(0.0f);
            this.id_class[6] = 0;
        }
    }

    public rrTE[] id_catch() {
        return (rrTE[])this.id_class[id_protected[4]];
    }

    private static void id_extends() {
        short[] sArray = new short[15];
        sArray[0] = 3;
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[9] = 5;
        sArray[10] = 6;
        sArray[11] = 3;
        sArray[12] = 4;
        sArray[13] = 5;
        sArray[14] = 6;
        id_protected = sArray;
    }

    public String id_case() {
        return (String)this.id_class[id_protected[7]];
    }

    private static void id_implements() {
        id_case = new boolean[1];
    }

    public LocalDateTime id_protected() {
        return (LocalDateTime)this.id_class[id_protected[8]];
    }

    private static void id_private() {
        id_byte = new float[1];
    }

    private static void id_volatile() {
        id_break = new byte[]{7, 5, 6};
    }

    private static void id_native() {
        id_throws = new String[]{new String("")};
    }
}

