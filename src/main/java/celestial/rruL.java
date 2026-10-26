/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrtu_3;
import celestial.rruF;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruL {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new short[8];
    }

    public rruL() {
        ArrayList arrayList;
        this.id_throws();
        this.id_class[rruL.id_byte[0]] = arrayList = new ArrayList();
    }

    static {
        rruL.ntfClinit();
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        for (int i = ((List)this.id_class[id_byte[4]]).size() - id_break[0]; i >= 0; --i) {
            rruF rruF2 = (rruF)((List)this.id_class[id_byte[5]]).get(i);
            if (!rruF2.id_protected().id_break(n, n2) || !rruF2.id_class(rrtu_32, n, n2, n3, bl)) continue;
            return id_break[1];
        }
        return id_break[2];
    }

    public List<rruF> id_class() {
        return (List)this.id_class[id_byte[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{100, 122, 26, -73, -7, 126, 110, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD8ED59D9;
    }

    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl, boolean bl2) {
        if (bl2) {
            return;
        }
        for (rruF rruF2 : (List)this.id_class[id_byte[3]]) {
            rruF2.id_class(ml_1, rrtu_32, n, n2, bl);
        }
    }

    public void id_class(rruF ... rruFArray) {
        ((List)this.id_class[id_byte[1]]).addAll(Arrays.asList(rruFArray));
    }

    public void id_class(float f) {
        for (rruF rruF2 : (List)this.id_class[id_byte[7]]) {
            if (!rruF2.id_break()) continue;
            rruF2.id_case().id_byte(f);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x28432208EEF8426EL;
    }

    public void id_break(float f) {
        for (rruF rruF2 : (List)this.id_class[id_byte[6]]) {
            if (!rruF2.id_break()) continue;
            rruF2.id_case().id_break(f);
        }
    }

    public void id_break() {
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[3]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruL.id_protected();
        rruL.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        id_break = blArray;
    }
}

