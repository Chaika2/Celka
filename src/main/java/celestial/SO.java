/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BT;
import celestial.Bn_1;
import celestial.Bp_1;
import celestial.Bq_1;
import celestial.Bt_1;
import celestial.Bw_1;
import celestial.C_class;
import celestial.Pv_1;
import celestial.SX;
import celestial.Sh_1;
import celestial.rFv_1;
import celestial.rja_3;
import celestial.rrLO;
import celestial.rrLu_1;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrje_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SO
extends Pv_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_break;

    private static void id_byte() {
        id_byte = new boolean[]{true};
    }

    private void id_byte(String string) {
        this.id_class();
        Bt_1 bt_1 = ((Bw_1)this.id_break[id_protected[13]]).id_class(string);
        if (bt_1 == null || !bt_1.id_case()) {
            return;
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[14]]).id_finally().id_class(Bp_1.id_class((Bq_1)((Object)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[id_protected[15]]), bt_1, (BT)((Object)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[id_protected[16]])));
    }

    public SO(C_class c_class) {
        super(c_class);
        this.id_class();
        SX sX = new SX();
        this.id_break[SO.id_protected[0]] = sX;
    }

    static {
        SO.ntfClinit();
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        Object object = rrLu_12.id_class();
        if (object instanceof rFv_1) {
            rFv_1 rFv_12 = (rFv_1)object;
            if ((rrfq_3)((Object)rrfp_3.id_class[id_protected[1]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[2]])) {
                return;
            }
            object = rFv_12.id_protected();
            if (object == null) {
                return;
            }
            String string = object.id_byte();
            switch (((int[])Sh_1.id_class[id_protected[3]])[rFv_12.id_byte().ordinal()]) {
                case 1: {
                    this.id_protected(string);
                    break;
                }
                case 2: {
                    this.id_byte(string);
                }
            }
        }
    }

    @Override
    public void id_class(rrLO rrLO2) {
        if (rrLO2.id_class() != null || (rrfq_3)((Object)rrfp_3.id_class[id_protected[4]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[5]])) {
            return;
        }
        this.id_protected(rrLO2.id_protected());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBB7A2380;
    }

    private void id_class() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x91EA9752905BA696L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{85, -62, -83, -92, -45, -74, -110, 6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[16] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SO.id_byte();
        SO.id_break();
    }

    private void id_protected(String string) {
        this.id_class();
        Bt_1 bt_1 = ((Bw_1)this.id_break[id_protected[6]]).id_class(string);
        if (bt_1 == null) {
            return;
        }
        rja_3 rja_32 = null;
        if (bt_1 instanceof Bn_1) {
            Bn_1 bn_1 = (Bn_1)bt_1;
            try {
                rja_32 = bn_1.id_break(string);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
            if (rja_32 == null) {
                return;
            }
            bn_1.id_class(rja_32);
        }
        bt_1.id_throws(string);
        if (rja_32 != null) {
            boolean bl = ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_protected[7]])).id_class(rja_32);
            bt_1.id_protected(((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_protected[8]])).id_class(bt_1.id_throws(), bl));
            if (((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_protected[9]])).id_protected(bt_1.id_throws()) && bl) {
                return;
            }
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[10]]).id_finally().id_class(Bp_1.id_class((Bq_1)((Object)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[id_protected[11]]), bt_1, (BT)((Object)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[id_protected[12]])));
    }
}

