/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.movement.GuiMove;
import celestial.rrTF;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrli_3
extends rrTF<GuiMove> {
    private static boolean[] id_class;

    public rrli_3(GuiMove guiMove) {
        super(guiMove);
    }

    static {
        rrli_3.id_class();
    }

    public boolean id_class(vm_3 vm_32) {
        return id_class[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x75E5E5144CE37B69L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, -11, -123, 1, -88, 102, -94, 14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x13B43E3E;
    }

    private static void id_class() {
        id_class = new boolean[1];
    }
}

