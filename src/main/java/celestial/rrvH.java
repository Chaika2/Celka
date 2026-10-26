/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvH<T>
extends LinkedList<T> {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
            objectArray[rrvH.id_byte[3]] = id_byte[4];
        }
    }

    public rrvH(int n) {
        this.id_byte();
        Integer n2 = n;
        this.id_class[rrvH.id_break[0]] = n2;
    }

    static {
        rrvH.ntfClinit();
    }

    @Override
    public boolean add(T t) {
        if (this.size() >= (Integer)this.id_class[id_break[1]]) {
            this.removeFirst();
        }
        return super.add(t);
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 4, 88, 92, 120, 21, -96, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrvH.id_break[4]] = n2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x89711C619930DF9DL;
    }

    public boolean id_break() {
        return this.size() >= (Integer)this.id_class[id_break[2]] ? id_byte[0] : id_byte[1];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x44EC490D;
    }

    private static void id_throws() {
        id_break = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrvH.id_protected();
        rrvH.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }
}

