/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNA;
import celestial.rrNL;
import celestial.rrNW;
import celestial.rrNd_1;
import celestial.rrNn_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNF {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    public List<rrNA> id_byte() {
        return (List)this.id_class[id_protected[14]];
    }

    public rrNF(rrNW rrNW2, rrNd_1 rrNd_12) {
        ArrayList arrayList;
        this.id_protected();
        this.id_class[rrNF.id_protected[0]] = arrayList = new ArrayList();
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrNF.id_protected[1]] = rrNd_13;
        rrNL rrNL2 = (rrNL)((Object)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_protected[2]]);
        this.id_class[rrNF.id_protected[3]] = rrNL2;
        ((List)this.id_class[id_protected[4]]).add(new rrNn_1(rrNW2));
    }

    static {
        rrNF.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrNF rrNF2 = (rrNF)object;
        return Objects.equals((rrNd_1)this.id_class[id_protected[7]], (rrNd_1)rrNF2.id_class[id_protected[8]]) && (rrNL)((Object)this.id_class[id_protected[9]]) == (rrNL)((Object)rrNF2.id_class[id_protected[10]]) ? id_break[2] : id_break[3];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[rrNF.id_break[4]] = (rrNd_1)this.id_class[id_protected[11]];
        objectArray[rrNF.id_break[5]] = (rrNL)((Object)this.id_class[id_protected[12]]);
        return Objects.hash(objectArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA869F80;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{90, 1, -41, -104, 26, -2, -71, -119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrNL rrNL2) {
        rrNL rrNL3 = rrNL2;
        this.id_class[rrNF.id_protected[5]] = rrNL3;
        for (rrNA rrNA2 : (List)this.id_class[id_protected[6]]) {
            rrNA2.id_class(this);
        }
    }

    public rrNL id_class() {
        return (rrNL)((Object)this.id_class[id_protected[15]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB77494ED82CF0F7CL;
    }

    public rrNd_1 id_break() {
        return (rrNd_1)this.id_class[id_protected[13]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrNF.id_catch();
        rrNF.id_case();
        rrNF.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[16];
        sArray[0] = 1;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[12] = 2;
        sArray[14] = 1;
        sArray[15] = 2;
        id_protected = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }
}

