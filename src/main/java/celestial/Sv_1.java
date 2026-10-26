/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SC;
import celestial.SL;
import celestial.Y;
import celestial.q_1;
import celestial.rrAM;
import celestial.rrAl_1;
import celestial.rrFK;
import celestial.rrLG;
import celestial.rrLO;
import celestial.rrQX;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Sv_1
implements MinecraftAccessor {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private boolean id_byte(String string) {
        if (string != null && (String)this.id_class[id_byte[14]] != null) {
            return !((String)this.id_class[id_byte[15]]).equalsIgnoreCase(string.toLowerCase()) ? id_protected[2] : id_protected[3];
        }
        return !Objects.equals(string, (String)this.id_class[id_byte[16]]) ? id_protected[4] : id_protected[5];
    }

    public void id_byte() {
        ((SL)this.id_class[id_byte[9]]).id_break();
        Object var5_1 = null;
        this.id_class[Sv_1.id_byte[10]] = var5_1;
        Object var6_2 = null;
        this.id_class[Sv_1.id_byte[11]] = var6_2;
        Boolean bl = id_protected[1];
        this.id_class[Sv_1.id_byte[12]] = bl;
    }

    public Sv_1(SL sL) {
        this.id_extends();
        SL sL2 = sL;
        this.id_class[Sv_1.id_byte[0]] = sL2;
    }

    static {
        Sv_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85827028;
    }

    public void id_class(SC sC) {
        String string = this.id_throws();
        this.id_class[Sv_1.id_byte[13]] = string;
    }

    public void id_class(rrLO rrLO2) {
    }

    public void id_class(rrFK rrFK2) {
        this.id_byte();
    }

    public void id_class(rrAM rrAM2) {
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFCE607F4F872B691L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, -37, -105, 63, -123, 123, 102, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_byte[20]];
    }

    public void id_class(q_1 q_12) {
        SC sC;
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[1]]) && (sC = this.id_case().id_catch()) != null) {
            String string = this.id_throws();
            this.id_class[Sv_1.id_byte[2]] = string;
            if (this.id_byte((String)this.id_class[id_byte[3]])) {
                Boolean bl = id_protected[0];
                this.id_class[Sv_1.id_byte[4]] = bl;
            }
            if (((Boolean)this.id_class[id_byte[5]]).booleanValue() && this.id_break((String)this.id_class[id_byte[6]])) {
                this.id_catch();
            }
        }
    }

    public void id_class(rrAl_1 rrAl_12) {
    }

    public abstract boolean id_break(String var1);

    public String id_break() {
        return (String)this.id_class[id_byte[18]];
    }

    public abstract String id_throws();

    private static /* synthetic */ void ntfClinit() {
        Sv_1.id_finally();
        Sv_1.id_implements();
        Sv_1.id_private();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    public void id_catch() {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrLG.id_class(((SL)this.id_class[id_byte[8]]).id_catch()));
        this.id_byte();
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[Sv_1.id_break[1]] = id_protected[6];
        }
    }

    public SL id_case() {
        return (SL)this.id_class[id_byte[17]];
    }

    private static void id_implements() {
        short[] sArray = new short[21];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[10] = 2;
        sArray[11] = 1;
        sArray[12] = 3;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[16] = 2;
        sArray[18] = 1;
        sArray[19] = 2;
        sArray[20] = 3;
        id_byte = sArray;
    }

    public String id_protected() {
        return (String)this.id_class[id_byte[19]];
    }

    private static void id_private() {
        id_break = new byte[]{4, 3};
    }
}

