/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GL
implements rP_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static int[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    public GL(rP_2 rP_22, rP_2 rP_23) {
        this.id_throws();
        rP_2 rP_24 = rP_22;
        this.id_class[GL.id_break[0]] = rP_24;
        rP_2 rP_25 = rP_23;
        this.id_class[GL.id_break[1]] = rP_25;
    }

    static {
        GL.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[2];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[3];
        }
        GL gL = (GL)object;
        return Objects.equals((rP_2)this.id_class[id_break[5]], (rP_2)gL.id_class[id_break[6]]) && Objects.equals((rP_2)this.id_class[id_break[7]], (rP_2)gL.id_class[id_break[8]]) ? id_byte[4] : id_byte[5];
    }

    public String toString() {
        return "JankyComposite Primary: " + (rP_2)this.id_class[id_break[11]] + " Fallback: " + (rP_2)this.id_class[id_break[12]];
    }

    public int hashCode() {
        int n = id_protected[0];
        n = n * id_protected[1] + ((rP_2)this.id_class[id_break[9]]).hashCode();
        n = n * id_protected[2] + ((rP_2)this.id_class[id_break[10]]).hashCode();
        return n;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9151FE15;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        return ((rP_2)this.id_class[id_break[4]]).id_class(n, n2, n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{51, -89, 11, 24, -18, -83, -81, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x85B04BB158B8785L;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return ((rP_2)this.id_class[id_break[2]]).id_break(n, n2, n3) || ((rP_2)this.id_class[id_break[3]]).id_break(n, n2, n3) ? id_byte[0] : id_byte[1];
    }

    private static void id_break() {
        short[] sArray = new short[13];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[12] = 1;
        id_break = sArray;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        GL.id_byte();
        GL.id_break();
        GL.id_case();
        GL.id_protected();
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private static void id_protected() {
        id_protected = new int[]{-1701079641, 1196141026, -80327868};
    }
}

