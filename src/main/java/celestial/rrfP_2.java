/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.rhz_3;
import celestial.rrLu_1;
import celestial.ruS_2;
import celestial.rvm_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfP_2 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[13];
        sArray[0] = 1;
        sArray[1] = 57;
        sArray[2] = 57;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 57;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        id_protected = sArray;
    }

    public rrfP_2() {
        this.id_protected();
        Integer n = id_break[0];
        this.id_class[rrfP_2.id_protected[0]] = n;
    }

    static {
        rrfP_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x59CEDC1A4062DA45L;
    }

    public void id_class(boolean bl) {
        if (((Boolean)this.id_class[id_protected[5]]).booleanValue() && (Integer)this.id_class[id_protected[6]] != id_break[1]) {
            ((rhz_3)((cb_3)MinecraftAccessor.id_import.id_class[rrfP_2.id_protected[7]]).id_implements[rrfP_2.id_protected[8]]).id_protected = (Integer)this.id_class[id_protected[9]];
            if (bl) {
                Boolean bl2 = id_byte[1];
                this.id_class[rrfP_2.id_protected[10]] = bl2;
                Integer n = id_break[2];
                this.id_class[rrfP_2.id_protected[11]] = n;
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-11, -110, -121, 45, 50, 52, -37, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrfP_2.id_protected[12]] = n2;
    }

    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvm_3) {
            rvm_3 rvm_32 = (rvm_3)ruS_22;
            if ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[1]] == null) {
                return;
            }
            if (rvm_32.id_break() != ((rhz_3)((cb_3)MinecraftAccessor.id_import.id_class[rrfP_2.id_protected[2]]).id_implements[rrfP_2.id_protected[3]]).id_protected) {
                Boolean bl = id_byte[0];
                this.id_class[rrfP_2.id_protected[4]] = bl;
            }
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB3CAF80;
    }

    private static void id_break() {
        id_break = new byte[]{-1, -1, -1, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrfP_2.id_class();
        rrfP_2.id_byte();
        rrfP_2.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[0] = false;
            this.id_class[1] = 0;
        }
    }
}

