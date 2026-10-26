/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.q_1;
import celestial.rrLu_1;
import celestial.rrfw_3;
import celestial.ruS_2;
import celestial.rvS_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrID
implements MinecraftAccessor {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;
    private static double[] id_throws;

    public boolean id_byte() {
        return (Boolean)this.id_class[id_break[23]];
    }

    public void id_byte(Runnable runnable) {
        runnable.run();
        Boolean bl = id_byte[0];
        this.id_class[rrID.id_break[1]] = bl;
    }

    public rrID() {
        this.id_finally();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rrID.id_break[0]] = rrfw_32;
    }

    static {
        rrID.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4B6EB72;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, -86, 84, 80, 49, -3, 4, -2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5F2D2E41A2E75D53L;
    }

    public void id_class(Runnable runnable) {
        Runnable runnable2 = runnable;
        this.id_class[rrID.id_break[27]] = runnable2;
    }

    public void id_class(rrLu_1 rrLu_12) {
        rvS_2 rvS_22;
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvS_2 && (rvS_22 = (rvS_2)ruS_22).id_protected() && (Runnable)this.id_class[id_break[2]] != null && ((Boolean)this.id_class[id_break[3]]).booleanValue()) {
            Boolean bl = id_byte[1];
            this.id_class[rrID.id_break[4]] = bl;
        }
    }

    public void id_class(q_1 q_12) {
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[5]])) {
            if ((Runnable)this.id_class[id_break[6]] != null && ((Boolean)this.id_class[id_break[7]]).booleanValue()) {
                ((Runnable)this.id_class[id_break[8]]).run();
                Boolean bl = id_byte[2];
                this.id_class[rrID.id_break[9]] = bl;
                Object var7_3 = null;
                this.id_class[rrID.id_break[10]] = var7_3;
                Boolean bl2 = id_byte[3];
                this.id_class[rrID.id_break[11]] = bl2;
                Boolean bl3 = id_byte[4];
                this.id_class[rrID.id_break[12]] = bl3;
                ((rrfw_3)this.id_class[id_break[13]]).id_class();
            }
            if ((Runnable)this.id_class[id_break[14]] != null && ((Boolean)this.id_class[id_break[15]]).booleanValue() && ((rrfw_3)this.id_class[id_break[16]]).id_class(id_throws[0])) {
                ((Runnable)this.id_class[id_break[17]]).run();
                Object var10_6 = null;
                this.id_class[rrID.id_break[18]] = var10_6;
                Boolean bl = id_byte[5];
                this.id_class[rrID.id_break[19]] = bl;
                ((rrfw_3)this.id_class[id_break[20]]).id_class();
            }
        }
    }

    public Runnable id_class() {
        return (Runnable)this.id_class[id_break[21]];
    }

    public void id_break(Runnable runnable) {
        Runnable runnable2 = runnable;
        this.id_class[rrID.id_break[28]] = runnable2;
    }

    public Runnable id_break() {
        return (Runnable)this.id_class[id_break[22]];
    }

    public boolean id_throws() {
        return (Boolean)this.id_class[id_break[24]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrID.id_private();
        rrID.id_implements();
        rrID.id_catch();
        rrID.id_extends();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[2] = false;
            this.id_class[3] = false;
            this.id_class[4] = false;
        }
    }

    private static void id_catch() {
        id_throws = new double[]{100.0};
    }

    private static void id_extends() {
        id_protected = new byte[]{6, 2, 3, 4};
    }

    public rrfw_3 id_case() {
        return (rrfw_3)this.id_class[id_break[26]];
    }

    private static void id_implements() {
        short[] sArray = new short[29];
        sArray[0] = 5;
        sArray[1] = 2;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[7] = 2;
        sArray[9] = 2;
        sArray[11] = 3;
        sArray[12] = 4;
        sArray[13] = 5;
        sArray[14] = 1;
        sArray[15] = 4;
        sArray[16] = 5;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 4;
        sArray[20] = 5;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 4;
        sArray[26] = 5;
        sArray[28] = 1;
        id_break = sArray;
    }

    public boolean id_protected() {
        return (Boolean)this.id_class[id_break[25]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[1] = true;
        blArray[4] = true;
        id_byte = blArray;
    }
}

