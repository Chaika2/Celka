/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwI_2 {
    public Object[] id_case;
    private static boolean[] id_class;
    private static short[] id_break;

    public rrwI_2() {
        ArrayList arrayList;
        this.id_catch();
        this.id_case[rrwI_2.id_break[0]] = arrayList = new ArrayList();
    }

    static {
        rrwI_2.ntfClinit();
    }

    public List<Setting<?>> b() {
        return (List)this.id_case[id_break[1]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8DE113F3;
    }

    public <T extends Setting<?>> T id_class(T t) {
        ((List)this.id_case[id_break[3]]).add(t);
        return t;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7C32A8193128700CL;
    }

    public void id_class(Setting<?> ... settingArray) {
        ((List)this.id_case[id_break[2]]).addAll(Arrays.asList(settingArray));
    }

    public <T extends Setting<?>> T id_throws(String string) {
        for (Setting setting : (List)this.id_case[id_break[4]]) {
            if (!setting.id_throws().equalsIgnoreCase(string.toLowerCase())) continue;
            return (T)setting;
        }
        return null;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwI_2.id_private();
        rrwI_2.id_volatile();
    }

    private void id_catch() {
        if (this.id_case == null) {
            Object[] objectArray = this.id_case = new Object[id_class[0]];
        }
    }

    public static String id_case(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{61, -39, -18, -114, -61, -87, 107, 97}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        id_class = new boolean[]{true};
    }

    private static void id_volatile() {
        id_break = new short[5];
    }

    public abstract String id_synchronized();
}

