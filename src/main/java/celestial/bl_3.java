/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.bH_2;
import celestial.rU_2;
import celestial.rY_2;
import celestial.rfl_3;
import celestial.rja_3;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bl_3
implements rY_2 {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static String[] id_protected;
    private static boolean[] id_throws;

    @Override
    public rY_2 id_byte(rpr_3 rpr_32, int n) {
        if (this.id_class(rpr_32)) {
            return new bl_3((rU_2)this.id_class[id_break[55]], ((rU_2)this.id_class[id_break[56]]).id_byte(rpr_32, n));
        }
        return new bl_3(((rU_2)this.id_class[id_break[57]]).id_byte(rpr_32, n), (rU_2)this.id_class[id_break[58]]);
    }

    @Override
    public rU_2 id_byte() {
        return (rU_2)this.id_class[id_break[32]];
    }

    public bl_3(rU_2 rU_22, rU_2 rU_23) {
        this.id_extends();
        rU_2 rU_24 = rU_22;
        this.id_class[bl_3.id_break[0]] = rU_24;
        rU_2 rU_25 = rU_23;
        this.id_class[bl_3.id_break[1]] = rU_25;
        rU_2 rU_26 = new rU_2(Math.min((Integer)rU_22.id_break[id_break[2]], (Integer)rU_23.id_break[id_break[3]]), Math.min((Integer)rU_22.id_break[id_break[4]], (Integer)rU_23.id_break[id_break[5]]), Math.min((Integer)rU_22.id_break[id_break[6]], (Integer)rU_23.id_break[id_break[7]]));
        this.id_class[bl_3.id_break[8]] = rU_26;
        rU_2 rU_27 = new rU_2(Math.max((Integer)rU_22.id_break[id_break[9]], (Integer)rU_23.id_break[id_break[10]]), Math.max((Integer)rU_22.id_break[id_break[11]], (Integer)rU_23.id_break[id_break[12]]), Math.max((Integer)rU_22.id_break[id_break[13]], (Integer)rU_23.id_break[id_break[14]]));
        this.id_class[bl_3.id_break[15]] = rU_27;
        rja_3 rja_32 = new rja_3((Integer)((rU_2)this.id_class[bl_3.id_break[16]]).id_break[id_break[17]] - (Integer)((rU_2)this.id_class[bl_3.id_break[18]]).id_break[id_break[19]] + id_throws[0], (Integer)((rU_2)this.id_class[bl_3.id_break[20]]).id_break[id_break[21]] - (Integer)((rU_2)this.id_class[bl_3.id_break[22]]).id_break[id_break[23]] + id_throws[1], (Integer)((rU_2)this.id_class[bl_3.id_break[24]]).id_break[id_break[25]] - (Integer)((rU_2)this.id_class[bl_3.id_break[26]]).id_break[id_break[27]] + id_throws[2]);
        this.id_class[bl_3.id_break[28]] = rja_32;
        rfl_3 rfl_32 = new rfl_3((rU_2)this.id_class[id_break[29]], ((rU_2)this.id_class[id_break[30]]).id_class(id_throws[3], id_throws[4], id_throws[5]));
        this.id_class[bl_3.id_break[31]] = rfl_32;
    }

    static {
        bl_3.ntfClinit();
    }

    public String toString() {
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[bl_3.id_throws[6]] = (rU_2)this.id_class[id_break[40]];
        objectArray[bl_3.id_throws[7]] = (rU_2)this.id_class[id_break[41]];
        return String.format(id_protected[0], objectArray);
    }

    public int hashCode() {
        return ((rU_2)this.id_class[id_break[38]]).hashCode() ^ ((rU_2)this.id_class[id_break[39]]).hashCode();
    }

    @Override
    public rY_2 id_class(double d) {
        return new bl_3(((rU_2)this.id_class[id_break[65]]).id_break(-d, -d, -d), ((rU_2)this.id_class[id_break[66]]).id_break(d, d, d));
    }

    @Override
    public rY_2 id_class(rpr_3 rpr_32, int n) {
        return new bl_3(((rU_2)this.id_class[id_break[63]]).id_byte(rpr_32, n), ((rU_2)this.id_class[id_break[64]]).id_byte(rpr_32, n));
    }

    private boolean id_class(rpr_3 rpr_32) {
        boolean bl = rpr_32.id_throws().id_class() < 0 ? id_throws[8] : id_throws[9];
        switch (((int[])bH_2.id_class[id_break[42]])[rpr_32.id_final().ordinal()]) {
            case 1: {
                return ((Integer)((rU_2)this.id_class[bl_3.id_break[43]]).id_break[id_break[44]] > (Integer)((rU_2)this.id_class[bl_3.id_break[45]]).id_break[id_break[46]] ? id_throws[10] : id_throws[11]) ^ bl;
            }
            case 2: {
                return ((Integer)((rU_2)this.id_class[bl_3.id_break[47]]).id_break[id_break[48]] > (Integer)((rU_2)this.id_class[bl_3.id_break[49]]).id_break[id_break[50]] ? id_throws[12] : id_throws[13]) ^ bl;
            }
            case 3: {
                return ((Integer)((rU_2)this.id_class[bl_3.id_break[51]]).id_break[id_break[52]] > (Integer)((rU_2)this.id_class[bl_3.id_break[53]]).id_break[id_break[54]] ? id_throws[14] : id_throws[15]) ^ bl;
            }
        }
        throw new IllegalStateException(id_protected[1]);
    }

    @Override
    public rU_2 id_class() {
        return (rU_2)this.id_class[id_break[34]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x24B4858EC8A1EC2CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x57BA5AFB;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-118, -51, -98, 38, 75, -31, -21, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rY_2 id_break(double d) {
        return this.id_class(-d);
    }

    @Override
    public rfl_3 id_break() {
        return (rfl_3)this.id_class[id_break[37]];
    }

    @Override
    public rY_2 id_break(rpr_3 rpr_32, int n) {
        if (this.id_class(rpr_32)) {
            return new bl_3(((rU_2)this.id_class[id_break[59]]).id_byte(rpr_32, n), (rU_2)this.id_class[id_break[60]]);
        }
        return new bl_3((rU_2)this.id_class[id_break[61]], ((rU_2)this.id_class[id_break[62]]).id_byte(rpr_32, n));
    }

    @Override
    public rja_3 id_throws() {
        return (rja_3)this.id_class[id_break[36]];
    }

    private static /* synthetic */ void ntfClinit() {
        bl_3.id_private();
        bl_3.id_catch();
        bl_3.id_implements();
        bl_3.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{2, 6};
    }

    private static void id_catch() {
        id_protected = new String[]{new String("Selection{pos1=%s,pos2=%s}"), new String("Bad Direction.Axis")};
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    @Override
    public rU_2 id_case() {
        return (rU_2)this.id_class[id_break[33]];
    }

    private static void id_implements() {
        short[] sArray = new short[67];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[18] = 2;
        sArray[20] = 3;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 1;
        sArray[24] = 3;
        sArray[25] = 2;
        sArray[26] = 2;
        sArray[27] = 2;
        sArray[28] = 4;
        sArray[29] = 2;
        sArray[30] = 3;
        sArray[31] = 5;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 3;
        sArray[36] = 4;
        sArray[37] = 5;
        sArray[39] = 1;
        sArray[41] = 1;
        sArray[43] = 1;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[50] = 1;
        sArray[51] = 1;
        sArray[52] = 2;
        sArray[54] = 2;
        sArray[56] = 1;
        sArray[58] = 1;
        sArray[60] = 1;
        sArray[62] = 1;
        sArray[64] = 1;
        sArray[66] = 1;
        id_break = sArray;
    }

    @Override
    public rU_2 id_protected() {
        return (rU_2)this.id_class[id_break[35]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        id_throws = blArray;
    }
}

