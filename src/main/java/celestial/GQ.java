/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.GW;
import celestial.rq_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GQ
implements rq_3 {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    @Override
    public int id_byte() {
        return ((rq_3)this.id_class[id_byte[13]]).id_byte();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public GQ(GW gW, rq_3 rq_32, int n, int n2) {
        this.id_catch();
        GW gW2 = gW;
        this.id_class[GQ.id_byte[0]] = gW2;
        rq_3 rq_33 = rq_32;
        this.id_class[GQ.id_byte[1]] = rq_33;
        Integer n3 = n;
        this.id_class[GQ.id_byte[2]] = n3;
        Integer n4 = n2;
        this.id_class[GQ.id_byte[3]] = n4;
    }

    static {
        GQ.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x312CE986;
    }

    @Override
    public boolean id_class(int n, int n2, int n3, xc_3 xc_32) {
        return rq_3.super.id_class(n, n2, n3, xc_32) && n2 >= (Integer)this.id_class[id_byte[7]] && n2 <= (Integer)this.id_class[id_byte[8]] && ((rq_3)this.id_class[id_byte[9]]).id_class(n, n2, n3, xc_32) ? id_protected[0] : id_protected[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-97, 70, 106, 91, -36, 15, 104, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        return ((rq_3)this.id_class[id_byte[4]]).id_class(n, n2, n3, xc_32, (List)((GW)this.id_class[GQ.id_byte[5]]).id_break[id_byte[6]]);
    }

    @Override
    public int id_class() {
        return ((rq_3)this.id_class[id_byte[12]]).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE403B6E83CB7E324L;
    }

    @Override
    public int id_break() {
        return ((rq_3)this.id_class[id_byte[11]]).id_break();
    }

    private static void id_throws() {
        short[] sArray = new short[14];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 3;
        sArray[6] = 10;
        sArray[7] = 1;
        sArray[8] = 2;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        GQ.id_case();
        GQ.id_throws();
        GQ.id_private();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[GQ.id_protected[2]] = id_protected[3];
            objectArray[GQ.id_break[1]] = id_protected[4];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    @Override
    public void id_protected() {
        ((rq_3)this.id_class[id_byte[10]]).id_protected();
    }

    private static void id_private() {
        id_break = new byte[]{4, 2};
    }
}

