/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrtN_2;
import celestial.rrtf_3;
import celestial.rrtm_3;
import celestial.rruv_1;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtt_3
extends rrtm_3 {
    public Object[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;

    public rrtt_3(rrtN_2 rrtN_22, rrtf_3<?> rrtf_32, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        rrtf_3<?> rrtf_33;
        this.id_public();
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrtt_3.id_protected[0]] = rrtN_23;
        this.id_byte[rrtt_3.id_protected[1]] = rrtf_33 = rrtf_32;
    }

    static {
        rrtt_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5081278923285C50L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA84CECA0;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{49, -73, -79, -117, 69, -18, -23, -118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtt_3.id_goto();
        rrtt_3.id_return();
    }

    @Override
    public Setting<?> id_finally() {
        this.id_public();
        return ((rrtf_3)this.id_byte[id_protected[2]]).id_break();
    }

    private static void id_goto() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        id_protected = sArray;
    }

    private static void id_return() {
        id_throws = new byte[]{2};
    }

    private void id_public() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[0]];
        }
    }

    @Override
    public rrtN_2 id_private() {
        this.id_public();
        return (rrtN_2)this.id_byte[id_protected[3]];
    }

    @Override
    public rruv_1 id_volatile() {
        return new rruv_1(this.id_package(), this.id_final(), this.id_new(), this.id_continue());
    }

    public rrtf_3<?> id_synchronized() {
        this.id_public();
        return (rrtf_3)this.id_byte[id_protected[4]];
    }
}

