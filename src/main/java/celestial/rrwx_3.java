/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Af_1;
import celestial.rLB;
import celestial.rLG;
import celestial.rLb_1;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rrwJ_2;
import celestial.rud_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwx_3
implements Af_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new byte[]{2, 4};
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrwx_3(rrwJ_2 rrwJ_22, rud_3 rud_32, String string) {
        this.id_protected();
        rrwJ_2 rrwJ_23 = rrwJ_22;
        this.id_class[rrwx_3.id_throws[0]] = rrwJ_23;
        rud_3 rud_33 = rud_32;
        this.id_class[rrwx_3.id_throws[1]] = rud_33;
        String string2 = string;
        this.id_class[rrwx_3.id_throws[2]] = string2;
    }

    static {
        rrwx_3.ntfClinit();
    }

    @Override
    public void id_class(rLG rLG2) {
        Boolean bl = id_byte[0];
        this.id_class[rrwx_3.id_throws[8]] = bl;
        Object var9_3 = null;
        ((rrwJ_2)this.id_class[rrwx_3.id_throws[9]]).id_class[rrwx_3.id_throws[10]] = var9_3;
        long l = rqR_2.id_break() - (Long)((rrwJ_2)this.id_class[rrwx_3.id_throws[11]]).id_class[id_throws[12]];
        Object[] objectArray = new Object[id_byte[1]];
        objectArray[rrwx_3.id_byte[2]] = l;
        String string = new rgn_3(id_protected[0], objectArray).getString();
        ((rrwJ_2)this.id_class[rrwx_3.id_throws[13]]).id_class[rrwx_3.id_throws[14]] = string;
        ((rud_3)((Object)this.id_class[id_throws[15]])).id_class(new rgn_3(id_protected[1]));
    }

    @Override
    public rud_3 id_class() {
        return (rud_3)((Object)this.id_class[id_throws[22]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x11C50346A0EFEDFAL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{126, -59, -21, 28, 38, 25, 76, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        Object var7_3 = null;
        ((rrwJ_2)this.id_class[rrwx_3.id_throws[16]]).id_class[rrwx_3.id_throws[17]] = var7_3;
        if (!((Boolean)this.id_class[id_throws[18]]).booleanValue()) {
            Object[] objectArray = new Object[id_break[0]];
            objectArray[rrwx_3.id_byte[3]] = (String)this.id_class[id_throws[20]];
            objectArray[rrwx_3.id_byte[4]] = rgP_23.getString();
            String string = rgF_2.RED + new rgn_3(id_protected[2], objectArray).getString();
            ((rrwJ_2)this.id_class[rrwx_3.id_throws[19]]).id_class[rrwx_3.id_throws[21]] = string;
        }
    }

    @Override
    public void id_class(rLb_1 rLb_12) {
        Long l = rqR_2.id_break();
        ((rrwJ_2)this.id_class[rrwx_3.id_throws[3]]).id_class[rrwx_3.id_throws[4]] = l;
        ((rud_3)((Object)this.id_class[id_throws[5]])).id_class(new rLB((Long)((rrwJ_2)this.id_class[rrwx_3.id_throws[6]]).id_class[id_throws[7]]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3FBB768C;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[23];
        sArray[0] = 3;
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 1;
        sArray[9] = 3;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 1;
        sArray[13] = 3;
        sArray[15] = 1;
        sArray[16] = 3;
        sArray[17] = 2;
        sArray[19] = 3;
        sArray[20] = 2;
        sArray[22] = 1;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwx_3.id_break();
        rrwx_3.id_case();
        rrwx_3.id_throws();
        rrwx_3.id_byte();
    }

    private static void id_case() {
        id_protected = new String[]{new String("ui.proxyserver.ping.showPing"), new String("multiplayer.status.finished"), new String("ui.proxyserver.err.cantPingReason")};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
            objectArray[rrwx_3.id_byte[5]] = id_byte[6];
        }
    }
}

