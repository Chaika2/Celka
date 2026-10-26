/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Om_1;
import celestial.PJ;
import celestial.PX;
import celestial.rZJ;
import celestial.rZM;
import celestial.rZO;
import celestial.rZX;
import celestial.rZb_1;
import celestial.rmD_2;
import celestial.rmI_2;
import celestial.rmT_2;
import celestial.rmU_2;
import celestial.rmf_3;
import celestial.rmt_3;
import celestial.rrAc_1;
import celestial.rrFa_1;
import celestial.rrFe_1;
import celestial.rrNV;
import celestial.rrNh_1;
import celestial.ruS_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLZ
extends Om_1
implements MinecraftAccessor {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;
    private static float[] id_throws;
    private static short[] id_case;

    public rrLZ() {
        this.id_protected();
    }

    static {
        rrLZ.ntfClinit();
    }

    public static rrLZ id_class(ruS_2<?> ruS_22) {
        ruS_2<?> ruS_23;
        ((rrLZ)rrLZ.id_break[rrLZ.id_case[0]]).id_class[rrLZ.id_case[1]] = ruS_23 = ruS_22;
        ((rrLZ)id_break[id_case[2]]).id_class(id_protected[0]);
        return (rrLZ)id_break[id_case[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDAAEC39B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-52, -91, 57, 110, -26, 120, -17, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public ruS_2<?> id_class() {
        this.id_protected();
        return (ruS_2)this.id_class[id_case[10]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE20CDE39F461B97FL;
    }

    public static void id_class(rrLZ rrLZ2, ruS_2<?> ruS_22) {
        if (ruS_22 instanceof rZO) {
            rZO rZO2 = (rZO)ruS_22;
            if (rZO2 instanceof rZJ || rZO2 instanceof rZX) {
                PX pX = (PX)PJ.id_class[id_case[4]];
                pX.id_class(rZO2.id_class(id_throws[0]));
                pX.id_byte(rZO2.id_break(id_throws[1]));
            }
        } else if (ruS_22 instanceof rmT_2) {
            ((Ax_1)rrLZ.id_import.id_class[rrLZ.id_case[5]]).id_byte = System.currentTimeMillis();
        } else if (ruS_22 instanceof rZb_1) {
            rZb_1 rZb_12 = (rZb_1)ruS_22;
            if (rZb_12.id_protected() == rZM.SWAP_ITEM_WITH_OFFHAND) {
                ((Ax_1)rrLZ.id_import.id_class[rrLZ.id_case[6]]).id_protected = System.currentTimeMillis();
            }
        } else if (ruS_22 instanceof rmD_2) {
            rmD_2 rmD_22 = (rmD_2)ruS_22;
            if (rmD_22.id_break() == rmU_2.START_FALL_FLYING) {
                ((Ax_1)rrLZ.id_import.id_class[rrLZ.id_case[7]]).id_case = System.currentTimeMillis();
            }
        } else if (ruS_22 instanceof rmI_2) {
            rrAc_1 rrAc_12;
            rmI_2 rmI_22 = (rmI_2)ruS_22;
            if (rmI_22.id_break() == rmf_3.PERFORM_RESPAWN && (rrAc_12 = rrAc_1.id_break()).id_byte()) {
                rrLZ2.id_class(id_protected[1]);
            }
        } else if (ruS_22 instanceof rmt_3) {
            rmt_3 rmt_32 = (rmt_3)ruS_22;
            rrNV rrNV2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_case[8]])).id_throws().id_switch();
            if (rrNV2 != null && rmt_32.id_byte() == id_byte[0]) {
                rrFe_1.id_class(rrNV2, (rrFa_1)((Object)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_case[9]]));
            }
        }
    }

    private static void id_break() {
        id_byte = new byte[]{49};
    }

    private static void id_throws() {
        short[] sArray = new short[11];
        sArray[5] = 55;
        sArray[6] = 55;
        sArray[7] = 55;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLZ.id_catch();
        rrLZ.id_throws();
        rrLZ.id_private();
        rrLZ.id_break();
        rrLZ.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrLZ()};
        id_break = objectArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[3]];
        }
    }

    private static void id_private() {
        id_throws = new float[2];
    }
}

