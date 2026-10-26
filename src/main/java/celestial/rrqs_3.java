/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.gm_3;
import celestial.rRl_1;
import celestial.rhd_3;
import celestial.rrFV;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrqP_2;
import celestial.rrqS_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqs_3
implements MinecraftAccessor {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    public rrqS_2 id_byte() {
        return (rrqS_2)((Object)this.id_class[id_protected[17]]);
    }

    public rrqs_3(rrqP_2 rrqP_22) {
        this.id_catch();
        rrqP_2 rrqP_23 = rrqP_22;
        this.id_class[rrqs_3.id_protected[0]] = rrqP_23;
        rrqS_2 rrqS_22 = (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[1]]);
        this.id_class[rrqs_3.id_protected[2]] = rrqS_22;
    }

    static {
        rrqs_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9CB0C725;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-78, 51, 7, -124, -30, -123, 11, -11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBFAF3218C3F39059L;
    }

    public rrqS_2 id_class() {
        String string = ((rrqP_2)this.id_class[id_protected[8]]).id_class().id_class().getName();
        Aw_1 aw_1 = rrfp_3.id_class(string);
        rhd_3 rhd_32 = ((gm_3)rrqs_3.id_import.id_class[id_protected[9]]).id_break(string);
        if (this.id_class((rrqP_2)this.id_class[id_protected[10]])) {
            return (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[11]]);
        }
        if (aw_1 == null) {
            return (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[12]]);
        }
        if (aw_1.id_break() == rRl_1.SPECTATOR) {
            return (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[13]]);
        }
        if (rhd_32 != null && !rhd_32.sc()) {
            return (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[14]]);
        }
        return (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_protected[15]]);
    }

    public boolean id_class(rrqP_2 rrqP_22) {
        return rrqP_22.id_class().id_implements() == null ? id_byte[0] : id_byte[1];
    }

    public rrqP_2 id_break() {
        return (rrqP_2)this.id_class[id_protected[16]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqs_3.id_throws();
        rrqs_3.id_private();
        rrqs_3.id_case();
    }

    private void id_catch() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    public void id_protected() {
        rrqS_2 rrqS_22 = this.id_class();
        if (rrqS_22 != (rrqS_2)((Object)this.id_class[id_protected[3]])) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]]).id_finally().id_class(rrFV.id_class((rrqP_2)this.id_class[id_protected[5]], (rrqS_2)((Object)this.id_class[id_protected[6]]), rrqS_22));
            rrqS_2 rrqS_23 = rrqS_22;
            this.id_class[rrqs_3.id_protected[7]] = rrqS_23;
        }
    }

    private static void id_private() {
        short[] sArray = new short[18];
        sArray[1] = 5;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 56;
        sArray[11] = 4;
        sArray[12] = 1;
        sArray[13] = 3;
        sArray[14] = 2;
        sArray[17] = 1;
        id_protected = sArray;
    }
}

