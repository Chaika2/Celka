/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wp_1;
import celestial.rJY;
import celestial.rdb_3;
import celestial.rrNw_1;
import celestial.rrco_3;
import celestial.rrfI_2;
import celestial.rxJ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcK_2
extends rrfI_2<Boolean> {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcK_2(rrco_3 rrco_32, rrNw_1 rrNw_12) {
        this.id_case();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcK_2.id_break[0]] = rrNw_13;
    }

    static {
        rrcK_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x86198AA8;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x12129BEB6E7A544FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 73, -74, -103, -61, -93, -88, 55}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Boolean id_break() {
        rdb_3 rdb_32;
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_break[1]]).id_throws();
        rdb_3 rdb_33 = rdb_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_break[2]]).id_protected().id_break() : rJY2.id_class().id_break();
        if (rdb_32 instanceof rxJ_2) {
            rxJ_2 rxJ_22 = (rxJ_2)rdb_32;
            return rxJ_22.id_catch() instanceof Wp_1;
        }
        return id_byte[0];
    }

    private static void id_throws() {
        id_break = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcK_2.id_protected();
        rrcK_2.id_throws();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

