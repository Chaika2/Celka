/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.re_3;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ra_3 {
    private static boolean[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        id_break = blArray;
    }

    public ra_3(String ... stringArray) {
        re_3[] re_3Array;
        this.id_throws();
        this.id_class[ra_3.id_protected[3]] = re_3Array = (re_3[])Stream.of(stringArray).map(re_3::new).toArray(re_3[]::new);
    }

    public ra_3(re_3 ... re_3Array) {
        re_3[] re_3Array2;
        this.id_throws();
        this.id_class[ra_3.id_protected[0]] = re_3Array2 = re_3Array;
    }

    public ra_3(xd_3 ... xd_3Array) {
        re_3[] re_3Array;
        this.id_throws();
        this.id_class[ra_3.id_protected[1]] = re_3Array = (re_3[])Stream.of(xd_3Array).map(re_3::new).toArray(re_3[]::new);
    }

    public ra_3(List<xd_3> list) {
        re_3[] re_3Array;
        this.id_throws();
        this.id_class[ra_3.id_protected[2]] = re_3Array = (re_3[])list.stream().map(re_3::new).toArray(re_3[]::new);
    }

    static {
        ra_3.ntfClinit();
    }

    public String toString() {
        Object[] objectArray = new Object[id_break[9]];
        objectArray[ra_3.id_break[10]] = Arrays.toString((re_3[])this.id_class[id_protected[8]]);
        return String.format(id_byte[0], objectArray);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-41, -124, 86, -43, -5, -17, 3, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(rdn_3 rdn_32) {
        re_3[] re_3Array = (re_3[])this.id_class[id_protected[6]];
        int n = re_3Array.length;
        for (int i = id_break[6]; i < n; ++i) {
            re_3 re_32 = re_3Array[i];
            if (!re_32.id_class(rdn_32)) continue;
            return id_break[7];
        }
        return id_break[8];
    }

    public boolean id_class(xd_3 xd_32) {
        re_3[] re_3Array = (re_3[])this.id_class[id_protected[4]];
        int n = re_3Array.length;
        for (int i = id_break[0]; i < n; ++i) {
            re_3 re_32 = re_3Array[i];
            if (re_32.id_break() != xd_32) continue;
            return id_break[1];
        }
        return id_break[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE2E5896A5212D62L;
    }

    public boolean id_class(xc_3 xc_32) {
        re_3[] re_3Array = (re_3[])this.id_class[id_protected[5]];
        int n = re_3Array.length;
        for (int i = id_break[3]; i < n; ++i) {
            re_3 re_32 = re_3Array[i];
            if (!re_32.id_class(xc_32)) continue;
            return id_break[4];
        }
        return id_break[5];
    }

    public List<re_3> id_class() {
        return Arrays.asList((re_3[])this.id_class[id_protected[7]]);
    }

    private static void id_break() {
        id_protected = new short[9];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[11]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        ra_3.id_byte();
        ra_3.id_protected();
        ra_3.id_break();
    }

    private static void id_protected() {
        id_byte = new String[]{new String("BlockOptionalMetaLookup{%s}")};
    }

    private static int id_protected(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB091628E;
    }
}

