/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.XRay;
import celestial.q_1;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.rrLu_1;
import celestial.rrqQ_2;
import celestial.rrqc_3;
import celestial.rrqk_3;
import celestial.rrqz_3;
import celestial.ruS_2;
import celestial.rvj_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqm_3
extends rrqk_3 {
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_int() {
        id_protected = new boolean[2];
    }

    public rrqm_3(XRay<?> xRay) {
        super(xRay);
    }

    static {
        rrqm_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvj_3) {
            rvj_3 rvj_32 = (rvj_3)ruS_22;
            xd_3 xd_32 = rvj_32.id_break().id_break();
            rfH_2 rfH_22 = rvj_32.id_byte();
            for (rrqz_3 rrqz_32 : ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_byte[3]]).id_break()) {
                if (rrqz_32.id_byte() != xd_32) continue;
                this.id_class(new rrqc_3(new rrqz_3(xd_32, ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_byte[4]]).id_class(xd_32)), rfH_22, rfH_22));
                break;
            }
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAE37AE80C95B9A3BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x50C16B50;
    }

    @Override
    public void id_class(q_1 q_12) {
        super.id_class(q_12);
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]])) {
            XRay xRay = (XRay)this.id_continue();
            if (!xRay.id_continue()) {
                return;
            }
            List<rja_3> list = this.id_extends();
            float f = ((Float)((XRay)this.id_continue()).id_new().id_byte()).floatValue();
            int n = id_protected[0];
            while ((float)n < f && !list.isEmpty()) {
                rja_3 rja_32 = list.remove(id_protected[1]);
                ((Aq_1)((cb_3)rrqm_3.id_import.id_class[rrqm_3.id_byte[1]]).id_break[id_byte[2]]).id_break(new rZb_1(rZM.STOP_DESTROY_BLOCK, new rfH_2(rja_32), rpr_3.UP));
                this.id_class(rja_32);
                this.id_class();
                ++n;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrqm_3.id_int();
        rrqm_3.id_new();
    }

    private static void id_new() {
        short[] sArray = new short[5];
        sArray[1] = 57;
        id_byte = sArray;
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{117, -53, -65, 69, -12, -54, 37, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

