/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.C_interface;
import celestial.PP;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class N
extends x_1 {
    public Object[] id_class;
    private static String[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    public N(String string) {
        Object[] objectArray = new Object[id_protected[0]];
        objectArray[N.id_protected[1]] = string;
        super(String.format(id_break[0], objectArray));
        this.id_protected();
        String string2 = string;
        this.id_class[N.id_byte[0]] = string2;
    }

    static {
        N.ntfClinit();
    }

    @Override
    public void id_class(C_interface c_interface, List<C_import> list) {
        PP.a_.id_case(this.getMessage());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4F58C46AA4BB04CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, -128, -86, -73, -100, 14, -97, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new short[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F0693A9;
    }

    private static void id_break() {
        id_break = new String[]{new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430: %s")};
    }

    private static /* synthetic */ void ntfClinit() {
        N.id_byte();
        N.id_break();
        N.id_class();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }
}

