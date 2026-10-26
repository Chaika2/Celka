/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.gm_3;
import celestial.rLD;
import celestial.rrLu_1;
import celestial.rrfR_2;
import celestial.rrfw_3;
import celestial.rrnh_3;
import celestial.ruS_2;
import celestial.rvQ_2;
import celestial.rvu_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfg_3
implements MinecraftAccessor {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[1] = false;
            this.id_class[2] = false;
            this.id_class[3] = false;
            this.id_class[4] = false;
            this.id_class[5] = false;
        }
    }

    public rrfg_3() {
        this.id_byte();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rrfg_3.id_break[0]] = rrfw_32;
    }

    static {
        rrfg_3.ntfClinit();
    }

    public boolean id_class(float f) {
        if (((Boolean)this.id_class[id_break[13]]).booleanValue()) {
            if (((rrfw_3)this.id_class[id_break[14]]).id_class(f)) {
                Boolean bl = id_byte[5];
                this.id_class[rrfg_3.id_break[15]] = bl;
                ((rrfw_3)this.id_class[id_break[16]]).id_class();
                return id_byte[6];
            }
        } else {
            ((rrfw_3)this.id_class[id_break[17]]).id_class();
        }
        return id_byte[7];
    }

    public void id_class(rrLu_1 rrLu_12) {
        boolean bl;
        if ((cb_3)rrfg_3.id_import.id_class[id_break[1]] == null) {
            return;
        }
        if (this.id_case()) {
            return;
        }
        if (rrLu_12.id_class() instanceof rvu_3) {
            Boolean bl2 = id_byte[0];
            this.id_class[rrfg_3.id_break[2]] = bl2;
        }
        boolean bl3 = bl = (Boolean)this.id_class[id_break[3]] != false || (Boolean)this.id_class[id_break[4]] != false || (Boolean)this.id_class[id_break[5]] != false || (Boolean)this.id_class[id_break[6]] != false ? id_byte[1] : id_byte[2];
        if (!bl) {
            rvQ_2 rvQ_22;
            ruS_2<?> ruS_22 = rrLu_12.id_class();
            if (ruS_22 instanceof rvQ_2 && (rvQ_22 = (rvQ_2)ruS_22).id_break() == id_protected[0] && rvQ_22.id_class((gm_3)rrfg_3.id_import.id_class[id_break[7]]) == (cb_3)rrfg_3.id_import.id_class[id_break[8]]) {
                Boolean bl4 = id_byte[3];
                this.id_class[rrfg_3.id_break[9]] = bl4;
            }
        } else if ((Integer)((cb_3)rrfg_3.id_import.id_class[rrfg_3.id_break[10]]).id_private[id_break[11]] > 0) {
            Boolean bl5 = id_byte[4];
            this.id_class[rrfg_3.id_break[12]] = bl5;
            this.id_protected();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1C2F021BBA31016FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{60, -68, -111, 31, 30, -25, 48, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x59C8FEF0;
    }

    public void id_class(rrnh_3 rrnh_32) {
        switch (((int[])rrfR_2.id_class[id_break[18]])[rrnh_32.id_class().ordinal()]) {
            case 1: {
                Boolean bl = id_byte[8];
                this.id_class[rrfg_3.id_break[19]] = bl;
                break;
            }
            case 2: {
                Boolean bl = id_byte[9];
                this.id_class[rrfg_3.id_break[20]] = bl;
                break;
            }
            case 3: {
                Boolean bl = id_byte[10];
                this.id_class[rrfg_3.id_break[21]] = bl;
            }
        }
        Boolean bl = id_byte[11];
        this.id_class[rrfg_3.id_break[22]] = bl;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_break[32]];
    }

    public void id_break() {
        Boolean bl = id_byte[12];
        this.id_class[rrfg_3.id_break[23]] = bl;
        this.id_protected();
        ((rrfw_3)this.id_class[id_break[24]]).id_class();
    }

    private static void id_throws() {
        id_protected = new byte[]{2, 6, 2, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        rrfg_3.id_private();
        rrfg_3.id_catch();
        rrfg_3.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[33];
        sArray[1] = 57;
        sArray[2] = 3;
        sArray[3] = 2;
        sArray[4] = 4;
        sArray[5] = 3;
        sArray[6] = 5;
        sArray[7] = 56;
        sArray[8] = 57;
        sArray[9] = 1;
        sArray[10] = 57;
        sArray[11] = 10;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[19] = 2;
        sArray[20] = 4;
        sArray[21] = 5;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[25] = 2;
        sArray[26] = 3;
        sArray[27] = 4;
        sArray[28] = 5;
        sArray[29] = 57;
        sArray[30] = 57;
        sArray[31] = 57;
        sArray[32] = 1;
        id_break = sArray;
    }

    private boolean id_case() {
        return ((cb_3)rrfg_3.id_import.id_class[id_break[29]]).id_break(rLD.id_super) || ((cb_3)rrfg_3.id_import.id_class[id_break[30]]).id_break(rLD.id_this) || ((cb_3)rrfg_3.id_import.id_class[id_break[31]]).id_break(rLD.id_catch) ? id_byte[17] : id_byte[18];
    }

    private void id_protected() {
        Boolean bl = id_byte[13];
        this.id_class[rrfg_3.id_break[25]] = bl;
        Boolean bl2 = id_byte[14];
        this.id_class[rrfg_3.id_break[26]] = bl2;
        Boolean bl3 = id_byte[15];
        this.id_class[rrfg_3.id_break[27]] = bl3;
        Boolean bl4 = id_byte[16];
        this.id_class[rrfg_3.id_break[28]] = bl4;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[25];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[17] = true;
        blArray[19] = true;
        id_byte = blArray;
    }
}

