/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_catch;
import celestial.C_char;
import celestial.C_class;
import celestial.C_goto;
import celestial.MG;
import celestial.SD;
import celestial.SK;
import celestial.So_1;
import celestial.rt_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_byte
implements C_catch {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;

    @Override
    public C_char id_byte() {
        return (SK)SK.staticFields84fbf20de4d13027acc13a6866788039[id_byte[7]];
    }

    public C_byte() {
        List<C_class> list;
        this.id_finally();
        C_class c_class = new C_class();
        this.id_class[C_byte.id_byte[0]] = c_class;
        this.id_class[C_byte.id_byte[2]] = list = Collections.singletonList((C_class)this.id_class[id_byte[1]]);
        new SD((C_class)this.id_class[id_byte[3]]);
    }

    static {
        C_byte.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2EC1D17F54BD22FBL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -91, 43, -77, 114, 122, -2, 81}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4442F273;
    }

    @Override
    public rt_3 id_class() {
        return (MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[id_byte[8]];
    }

    @Override
    public C_case id_break() {
        return (C_class)this.id_class[id_byte[4]];
    }

    @Override
    public C_goto id_throws() {
        return (So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_byte[6]];
    }

    private static /* synthetic */ void ntfClinit() {
        C_byte.id_extends();
        C_byte.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_extends() {
        short[] sArray = new short[10];
        sArray[2] = 1;
        sArray[5] = 1;
        id_byte = sArray;
    }

    @Override
    public List<C_case> id_case() {
        return (List)this.id_class[id_byte[5]];
    }

    private static void id_implements() {
        id_break = new byte[]{2};
    }

    public C_class id_protected() {
        return (C_class)this.id_class[id_byte[9]];
    }
}

