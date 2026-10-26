/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_else;
import celestial.C_this;
import celestial.rU_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_while
implements C_this {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static long[] id_protected;
    private static String[] id_throws;
    private static short[] id_case;

    @Override
    public String id_byte() {
        return (String)this.id_class[id_case[8]];
    }

    public C_while(String string, C_else c_else, rU_2 rU_22, long l) {
        this.id_catch();
        String string2 = string;
        this.id_class[C_while.id_case[0]] = string2;
        C_else c_else2 = c_else;
        this.id_class[C_while.id_case[1]] = c_else2;
        rU_2 rU_23 = rU_22;
        this.id_class[C_while.id_case[2]] = rU_23;
        Long l2 = l;
        this.id_class[C_while.id_case[3]] = l2;
    }

    public C_while(String string, C_else c_else, rU_2 rU_22) {
        this(string, c_else, rU_22, System.currentTimeMillis());
    }

    static {
        C_while.ntfClinit();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return id_byte[2];
        }
        if (!(object instanceof C_this)) {
            return id_byte[3];
        }
        C_this c_this = (C_this)object;
        return ((String)this.id_class[id_case[15]]).equals(c_this.id_byte()) && (C_else)((Object)this.id_class[id_case[16]]) == c_this.id_break() && ((rU_2)this.id_class[id_case[17]]).equals(c_this.id_class()) ? id_byte[4] : id_byte[5];
    }

    public String toString() {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[C_while.id_byte[0]] = (String)this.id_class[id_case[12]];
        objectArray[C_while.id_byte[1]] = rU_2.id_class((rfH_2)((rU_2)this.id_class[id_case[13]])).toString();
        objectArray[C_while.id_break[1]] = new Date((Long)this.id_class[id_case[14]]).toString();
        return String.format(id_throws[0], objectArray);
    }

    public int hashCode() {
        return ((String)this.id_class[id_case[4]]).hashCode() ^ ((C_else)((Object)this.id_class[id_case[5]])).hashCode() ^ ((rU_2)this.id_class[id_case[6]]).hashCode() ^ Long.hashCode((Long)this.id_class[id_case[7]]);
    }

    @Override
    public rU_2 id_class() {
        return (rU_2)this.id_class[id_case[11]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-53, 100, 34, 118, -11, 112, -10, -23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEFCC783BA90A2893L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x11E2BFB3;
    }

    @Override
    public C_else id_break() {
        return (C_else)((Object)this.id_class[id_case[9]]);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_while.id_throws();
        C_while.id_private();
        C_while.id_case();
        C_while.id_finally();
        C_while.id_implements();
    }

    private static void id_finally() {
        short[] sArray = new short[18];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[13] = 3;
        sArray[14] = 2;
        sArray[16] = 1;
        sArray[17] = 3;
        id_case = sArray;
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
            objectArray[C_while.id_break[3]] = id_protected[0];
        }
    }

    private static void id_case() {
        id_protected = new long[1];
    }

    private static void id_implements() {
        id_break = new byte[]{3, 2, 4, 2};
    }

    @Override
    public long id_protected() {
        return (Long)this.id_class[id_case[10]];
    }

    private static void id_private() {
        id_throws = new String[]{new String("%s %s %s")};
    }
}

