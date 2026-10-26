/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQX;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTF<T>
implements MinecraftAccessor {
    private static short[] id_class;
    public Object[] id_throws;
    private static boolean[] id_break;

    public rrTF(T t) {
        this.id_package();
        T t2 = t;
        this.id_throws[rrTF.id_class[3]] = t2;
    }

    static {
        rrTF.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCCB6817C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1019E26C92AA4FDCL;
    }

    public static String id_throws(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{28, -17, 37, -115, -115, 77, 69, -121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrTF.id_private();
        rrTF.id_final();
    }

    public T id_continue() {
        return (T)this.id_throws[id_class[2]];
    }

    private void id_package() {
        if (this.id_throws == null) {
            this.id_throws = new Object[1];
        }
    }

    public void id_super() {
    }

    private static void id_private() {
        id_break = new boolean[]{true, true, true};
    }

    private static void id_final() {
        id_class = new short[4];
    }

    public boolean aI_() {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[0]]).id_finally().id_break(this);
        return id_break[0];
    }

    public boolean aK_() {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[1]]).id_finally().id_byte(this);
        return id_break[1];
    }
}

