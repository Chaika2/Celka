/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.rrQX;
import celestial.rrTv_1;
import celestial.rrth_3;
import celestial.rrtk_3;
import celestial.rrtz_3;
import celestial.setting.KeyBind;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTL
implements rrTv_1 {
    private static String[] id_class;
    private static short[] id_break;

    static {
        rrTL.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{76, -119, 116, -34, 88, -29, 111, 72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new String[]{new String("\u0432\u043a\u043b\u044e\u0447\u0435\u043d"), new String("\u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d"), new String("None"), new String("\u0440\u0430\u0437\u0431\u0438\u043d\u0436\u0435\u043d"), new String("Modules")};
    }

    @Override
    public void id_class(Module module, KeyBind keyBind) {
        String string = keyBind.id_break();
        Object object = string.equals(id_class[2]) ? id_class[3] : "\u0437\u0430\u0431\u0438\u043d\u0436\u0435\u043d \u043d\u0430 '" + string + "'";
        this.id_class(module, (String)object, (rrtz_3)((Object)rrtz_3.staticFieldsb85642e435023a9b997fb27aa0167b70[id_break[2]]));
    }

    public void id_class(Module module, String string, rrtz_3 rrtz_32) {
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[3]]).id_private().Y().id_new()) {
            return;
        }
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[4]]).id_class(new rrtk_3(id_class[4], module.id_extends() + " " + string, (int)id_break[5], rrtz_32));
    }

    @Override
    public void id_class(Module module) {
        this.id_class(module, id_class[0], (rrtz_3)((Object)rrtz_3.staticFieldsb85642e435023a9b997fb27aa0167b70[id_break[0]]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD395BA07;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1129FEB2490BB16BL;
    }

    @Override
    public void id_break(Module module) {
        this.id_class(module, id_class[1], (rrtz_3)((Object)rrtz_3.staticFieldsb85642e435023a9b997fb27aa0167b70[id_break[1]]));
    }

    private static void id_break() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[5] = 1500;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTL.id_class();
        rrTL.id_break();
    }
}

