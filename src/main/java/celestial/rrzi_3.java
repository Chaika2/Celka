/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQr_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzi_3 {
    private static byte[] id_class;
    public static Object[] id_byte;
    private static String[] id_break;
    private static short[] id_throws;
    public Object[] id_protected;
    private static boolean[] id_case;

    public static rrzi_3 id_byte(byte[] byArray) {
        rrzi_3 rrzi_32 = (rrzi_3)((ThreadLocal)id_byte[id_throws[14]]).get();
        if (rrzi_32 == null) {
            rrzi_32 = new rrzi_3(byArray, id_class[15]);
            ((ThreadLocal)id_byte[id_throws[15]]).set(rrzi_32);
        }
        return rrzi_32.id_class(byArray);
    }

    private static void id_byte() {
        boolean[] blArray = new boolean[34];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[32] = true;
        id_case = blArray;
    }

    public rrzi_3(byte[] byArray, boolean bl) {
        this.id_class();
        Integer n = id_class[1];
        this.id_protected[rrzi_3.id_throws[1]] = n;
        this.id_break(byArray);
        Boolean bl2 = bl;
        this.id_protected[rrzi_3.id_throws[2]] = bl2;
        Integer n2 = id_class[2];
        this.id_protected[rrzi_3.id_throws[3]] = n2;
    }

    public rrzi_3() {
        this.id_class();
        Integer n = id_class[0];
        this.id_protected[rrzi_3.id_throws[0]] = n;
    }

    public rrzi_3(byte[] byArray, int n) {
        this.id_class();
        Integer n2 = id_class[3];
        this.id_protected[rrzi_3.id_throws[4]] = n2;
        this.id_break(byArray);
        Integer n3 = n;
        this.id_protected[rrzi_3.id_throws[5]] = n3;
    }

    public rrzi_3(byte[] byArray, int n, int n2) {
        this.id_class();
        Integer n3 = id_class[4];
        this.id_protected[rrzi_3.id_throws[6]] = n3;
        int n4 = n + id_class[5];
        if (byArray[n4 + n2 - id_case[0]] == id_class[6]) {
            Boolean bl = id_case[1];
            this.id_protected[rrzi_3.id_throws[7]] = bl;
            --n2;
        }
        if (n2 > 0 && byArray[n4] == id_class[7]) {
            byte[] byArray2 = Arrays.copyOfRange(byArray, n4, n4 + n2);
            this.id_protected[rrzi_3.id_throws[8]] = byArray2;
        } else {
            byte[] byArray3 = new byte[n2 + id_case[2]];
            this.id_protected[rrzi_3.id_throws[9]] = byArray3;
            System.arraycopy(byArray, n4, (byte[])this.id_protected[id_throws[10]], id_case[3], n2);
            ((byte[])this.id_protected[rrzi_3.id_throws[11]])[rrzi_3.id_case[4]] = id_class[8];
        }
        this.id_break(this.id_protected((byte[])this.id_protected[id_throws[12]]));
        Integer n5 = n;
        this.id_protected[rrzi_3.id_throws[13]] = n5;
    }

    static {
        rrzi_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (!(object instanceof rrzi_3)) {
            return id_case[23];
        }
        if (object instanceof rrQr_1) {
            return ((rrQr_1)object).equals(this);
        }
        return Arrays.equals((byte[])this.id_protected[id_throws[28]], (byte[])((rrzi_3)object).id_protected[id_throws[29]]);
    }

    public String toString() {
        return this.id_private() + ((Boolean)this.id_protected[id_throws[31]] != false ? id_break[0] : id_break[1]) + ", index: " + (Integer)this.id_protected[id_throws[32]];
    }

    public int hashCode() {
        return (Integer)this.id_protected[id_throws[30]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x23592F6291FD37BCL;
    }

    private void id_class() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_class[21]];
            objectArray[rrzi_3.id_case[28]] = id_case[29];
            objectArray[rrzi_3.id_class[22]] = id_case[30];
            objectArray[rrzi_3.id_class[23]] = id_case[31];
        }
    }

    private byte[] id_class(byte[] byArray, int n) {
        int n2;
        byte[] byArray2 = new byte[byArray.length - id_case[10]];
        for (n2 = id_case[11]; n2 < n; ++n2) {
            byArray2[n2] = byArray[n2];
        }
        int n3 = n2;
        byte by = id_case[12];
        while (n2 < byArray.length) {
            byte by2;
            if ((by2 = byArray[n2++]) == id_class[12] && by == id_class[13]) continue;
            byArray2[n3++] = by2;
            by = by2;
        }
        if (n3 > id_case[13] && byArray2[n3 - id_case[14]] == id_class[14]) {
            --n3;
        }
        return n3 == byArray2.length ? byArray2 : Arrays.copyOf(byArray2, n3);
    }

    public rrzi_3 id_class(byte[] byArray) {
        this.id_break(byArray);
        return this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE4F20999;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-115, -93, 82, -105, 83, -52, 12, 3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(byte[] byArray) {
        byte[] byArray2 = byArray;
        this.id_protected[rrzi_3.id_throws[16]] = byArray2;
        Integer n = Arrays.hashCode(byArray);
        this.id_protected[rrzi_3.id_throws[17]] = n;
    }

    private static void id_break() {
        id_break = new String[]{new String(" (dir)"), new String(" ")};
    }

    private static void id_throws() {
        short[] sArray = new short[33];
        sArray[0] = 3;
        sArray[1] = 3;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 3;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[13] = 3;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 1;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 3;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzi_3.id_byte();
        rrzi_3.id_break();
        rrzi_3.id_throws();
        rrzi_3.id_case();
        rrzi_3.id_implements();
    }

    public boolean id_catch() {
        return (Boolean)this.id_protected[id_throws[18]];
    }

    private static void id_case() {
        id_class = new byte[]{-1, -1, -1, -1, -1, 46, 47, 47, 47, 47, 47, 47, 47, 47, 47, -1, 47, 47, 46, 46, 2, 6, 2, 3, 2};
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{new ThreadLocal(), true};
        id_byte = objectArray;
    }

    private byte[] id_protected(byte[] byArray) {
        int n = byArray.length;
        if (n == 0) {
            return byArray;
        }
        byte by = id_case[5];
        for (int i = id_case[6]; i < n; ++i) {
            byte by2 = byArray[i];
            if (by2 == id_class[9] && by == id_class[10]) {
                return this.id_class(byArray, i - id_case[7]);
            }
            by = by2;
        }
        if (n > id_case[8] && by == id_class[11]) {
            return Arrays.copyOf(byArray, n - id_case[9]);
        }
        return byArray;
    }

    public boolean id_protected() {
        if (!((Boolean)id_byte[id_throws[19]]).booleanValue() && ((byte[])this.id_protected[id_throws[20]])[id_case[15]] != id_class[16]) {
            throw new AssertionError();
        }
        if (((byte[])this.id_protected[id_throws[21]]).length == id_case[16]) {
            return id_case[17];
        }
        for (int i = id_case[18]; i < ((byte[])this.id_protected[id_throws[22]]).length; ++i) {
            int n;
            int n2 = i;
            while (i < ((byte[])this.id_protected[id_throws[23]]).length && ((byte[])this.id_protected[id_throws[24]])[i] != id_class[17]) {
                ++i;
            }
            if (((byte[])this.id_protected[id_throws[25]])[n2] != id_class[18] || (n = i - n2) != id_case[19] && (((byte[])this.id_protected[id_throws[26]])[n2 + id_case[20]] != id_class[19] || n != id_class[20])) continue;
            return id_case[21];
        }
        return id_case[22];
    }

    public String id_private() {
        return new String((byte[])this.id_protected[id_throws[27]]);
    }
}

