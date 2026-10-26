/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_return;
import celestial.C_throws;
import celestial.Ms_1;
import celestial.PE;
import celestial.PP;
import celestial.PX;
import celestial.Ph_1;
import celestial.Ps_1;
import celestial.QY;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rYB;
import celestial.rjG_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MS
implements PP,
Ps_1 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_throws;

    @Override
    public rjG_2 id_byte() {
        return Ph_1.id_class(this.id_catch(), this.id_protected(), this.id_native().id_case());
    }

    private static void id_int() {
        short[] sArray = new short[5];
        sArray[1] = 57;
        sArray[3] = 56;
        id_throws = sArray;
    }

    public MS(C_class c_class) {
        this.id_continue();
        C_class c_class2 = c_class;
        this.id_class[MS.id_throws[0]] = c_class2;
    }

    static {
        MS.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x12674403;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA602BE16003FD707L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, -1, 72, 88, -99, -110, 43, -93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public QY id_throws() {
        return b_;
    }

    private static /* synthetic */ void ntfClinit() {
        MS.id_new();
        MS.id_int();
    }

    @Override
    public cb_3 id_catch() {
        return (cb_3)MS.b_.id_class[id_throws[1]];
    }

    @Override
    public rYB id_case() {
        return (gm_3)MS.b_.id_class[id_throws[3]];
    }

    private void id_continue() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_new() {
        id_break = new boolean[]{true};
    }

    @Override
    public C_return id_package() {
        return C_throws.id_class().id_break().id_implements().id_class();
    }

    @Override
    public PX id_protected() {
        return ((C_class)this.id_class[id_throws[4]]).id_private().id_protected().orElseGet(() -> Ps_1.super.id_protected());
    }

    @Override
    public PE id_native() {
        return (Ms_1)Ms_1.staticFields347bd646f08b343d83dca157cd270e07[id_throws[2]];
    }
}

