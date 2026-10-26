/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ph_1;
import celestial.gm_3;
import celestial.rff_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rrTA;
import celestial.rrTV;
import celestial.rrTj_1;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTn_1
implements rrTA,
MinecraftAccessor {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    public rrTn_1(rjU_2 rjU_22) {
        this.id_case();
        rjU_2 rjU_23 = rjU_22;
        this.id_class[rrTn_1.id_byte[6]] = rjU_23;
    }

    static {
        rrTn_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[5];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[6];
        }
        rrTn_1 rrTn_12 = (rrTn_1)object;
        return Objects.equals((rjU_2)this.id_class[id_byte[3]], (rjU_2)rrTn_12.id_class[id_byte[4]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[7]];
        objectArray[rrTn_1.id_break[8]] = (rjU_2)this.id_class[id_byte[5]];
        return Objects.hash(objectArray);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{36, -76, -64, 96, 88, 25, -104, 32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E4DA8C793F558D7L;
    }

    @Override
    public boolean id_class(rjU_2 rjU_22, rrTj_1 rrTj_12, Predicate<xc_3> predicate) {
        rjG_2 rjG_22 = Ph_1.id_class(rjU_22, (rjU_2)this.id_class[id_byte[1]], rjS_2.OUTLINE, id_break[0]);
        if (rjG_22 instanceof rff_3) {
            rrTV rrTV2;
            rff_3 rff_32 = (rff_3)rjG_22;
            if (predicate != null && !predicate.test(((gm_3)rrTn_1.id_import.id_class[id_byte[2]]).id_byte(rff_32.id_class()))) {
                return id_break[1];
            }
            if (rrTj_12 instanceof rrTV && (rrTV2 = (rrTV)rrTj_12).id_class(rff_32.id_class())) {
                return id_break[2];
            }
        }
        return rjG_22 == null || rjG_22.id_byte() == rjM_2.MISS ? id_break[3] : id_break[4];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB1089536;
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[2] = 56;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTn_1.id_protected();
        rrTn_1.id_throws();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[9]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    @Override
    public rjU_2 rr() {
        return (rjU_2)this.id_class[id_byte[0]];
    }
}

