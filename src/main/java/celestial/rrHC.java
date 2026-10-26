/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.cb_3;
import celestial.module.util.ChatHelper;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rrHH;
import celestial.rrIk_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHC
implements rrHH {
    private static boolean[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[3] = 57;
        id_protected = sArray;
    }

    public rrHC(ChatHelper chatHelper) {
        this.id_break();
        ChatHelper chatHelper2 = chatHelper;
        this.id_class[rrHC.id_protected[0]] = chatHelper2;
    }

    static {
        rrHC.ntfClinit();
    }

    @Override
    public rVi_1 id_class(Aw_1 aw_1) {
        String string = aw_1.id_class().getName();
        rgN_2 rgN_22 = new rgN_2(rgF_2.YELLOW + "Call");
        Object[] objectArray = new Object[id_break[0]];
        objectArray[rrHC.id_break[1]] = string;
        rgn_3 rgn_32 = new rgn_3(id_byte[0], objectArray);
        return rgv_3.id_class(rgN_22, new rgy_3(rgp_3.id_class, rgn_32), new rgl_3(() -> ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[3]]).id_case("/call " + string)));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF56849C560984E38L;
    }

    @Override
    public boolean id_class() {
        return ((rrIk_1)((ChatHelper)this.id_class[rrHC.id_protected[1]]).id_break[id_protected[2]]).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5FD446A3;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, -110, 0, -3, 49, 75, 94, 63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHC.id_throws();
        rrHC.id_protected();
        rrHC.id_byte();
    }

    private static void id_protected() {
        id_byte = new String[]{new String("chathelper.fastaction.call")};
    }
}

