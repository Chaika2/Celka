/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNw_1;
import celestial.rrcR_2;
import celestial.rrfI_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcY_2
extends rrfI_2<Boolean> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcY_2(rrcR_2 rrcR_22, rrNw_1 rrNw_12) {
        this.id_protected();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcY_2.id_byte[0]] = rrNw_13;
    }

    static {
        rrcY_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6C7E9F8B0EE4D389L;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8C5BFB6;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, -22, 85, 38, -112, 40, -118, 73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Boolean id_break() {
        this.id_protected();
        String string = ((rrNw_1)this.id_class[id_byte[1]]).id_catch();
        if (string == null) {
            return id_break[0];
        }
        if (string.equals(MinecraftAccessor.id_import.id_while().id_byte())) {
            return id_break[1];
        }
        return id_break[2];
    }

    private static void id_throws() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcY_2.id_case();
        rrcY_2.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[3]];
        }
    }
}

