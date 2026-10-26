/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SZ;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rryB;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryS
extends rryB {
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    @Override
    public rfl_3 id_byte() {
        this.id_new();
        return (rfl_3)this.id_class[id_protected[7]];
    }

    private static void id_int() {
        short[] sArray = new short[13];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[6] = 4;
        sArray[7] = 1;
        sArray[8] = 4;
        sArray[11] = 2;
        sArray[12] = 3;
        id_protected = sArray;
    }

    public rryS(SZ sZ, rfl_3 rfl_32) {
        this.id_new();
        SZ sZ2 = sZ;
        this.id_class[rryS.id_protected[0]] = sZ2;
        rfl_3 rfl_33 = rfl_32;
        this.id_class[rryS.id_protected[1]] = rfl_33;
        rjU_2 rjU_22 = ((rfl_3)this.id_class[id_protected[2]]).id_case();
        this.id_class[rryS.id_protected[3]] = rjU_22;
        rdn_3 rdn_32 = new rdn_3(rdy_3.OW);
        this.id_class[rryS.id_protected[4]] = rdn_32;
        String string = ((SZ)this.id_class[id_protected[5]]).id_break() + " \u0442\u0440\u0430\u043f\u043a\u0430";
        this.id_class[rryS.id_protected[6]] = string;
    }

    static {
        rryS.ntfClinit();
    }

    @Override
    public rjU_2 id_class() {
        this.id_new();
        return (rjU_2)this.id_class[id_protected[11]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{22, -59, 118, 43, -11, 56, 123, -76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE421D9C7C97802FAL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD95629D;
    }

    @Override
    public rdn_3 id_break() {
        this.id_new();
        return (rdn_3)this.id_class[id_protected[12]];
    }

    @Override
    public long id_throws() {
        this.id_new();
        return ((SZ)this.id_class[id_protected[9]]).id_byte();
    }

    private static /* synthetic */ void ntfClinit() {
        rryS.id_int();
        rryS.id_package();
    }

    @Override
    public String id_case() {
        this.id_new();
        return (String)this.id_class[id_protected[8]];
    }

    private void id_new() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
        }
    }

    private static void id_package() {
        id_byte = new byte[]{5};
    }

    public SZ id_protected() {
        this.id_new();
        return (SZ)this.id_class[id_protected[10]];
    }
}

