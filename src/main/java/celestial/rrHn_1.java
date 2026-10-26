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

public class rrHn_1
implements rrHH {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrHn_1(ChatHelper chatHelper) {
        this.id_byte();
        ChatHelper chatHelper2 = chatHelper;
        this.id_class[rrHn_1.id_byte[0]] = chatHelper2;
    }

    static {
        rrHn_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x209D897B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF1BD0D30C2137E95L;
    }

    @Override
    public boolean id_class() {
        return ((rrIk_1)((ChatHelper)this.id_class[rrHn_1.id_byte[1]]).id_break[id_byte[2]]).id_class();
    }

    @Override
    public rVi_1 id_class(Aw_1 aw_1) {
        String string = aw_1.id_class().getName();
        rgN_2 rgN_22 = new rgN_2(rgF_2.YELLOW + "Ah");
        Object[] objectArray = new Object[id_break[0]];
        objectArray[rrHn_1.id_break[1]] = string;
        rgn_3 rgn_32 = new rgn_3(id_protected[0], objectArray);
        return rgv_3.id_class(rgN_22, new rgy_3(rgp_3.id_class, rgn_32), new rgl_3(() -> ((cb_3)MinecraftAccessor.id_import.id_class[id_byte[3]]).id_case("/ah " + string)));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-15, 15, -26, -117, -67, 117, 92, 21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new String[]{new String("chathelper.fastaction.ahsearch")};
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[2] = 2;
        sArray[3] = 57;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHn_1.id_protected();
        rrHn_1.id_break();
        rrHn_1.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }
}

