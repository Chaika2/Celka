/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzy_3;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.Key;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzp_3
implements Iterator<Path> {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[9];
        sArray[2] = 3;
        sArray[4] = 4;
        sArray[6] = 3;
        sArray[8] = 4;
        id_break = sArray;
    }

    public rrzp_3(rrzy_3 rrzy_32) {
        this.id_protected();
        rrzy_3 rrzy_33 = rrzy_32;
        this.id_class[rrzp_3.id_break[0]] = rrzy_33;
    }

    static {
        rrzp_3.ntfClinit();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        if (((Boolean)((rrzy_3)this.id_class[rrzp_3.id_break[1]]).id_class[id_break[2]]).booleanValue()) {
            return id_byte[0];
        }
        return ((Iterator)((rrzy_3)this.id_class[rrzp_3.id_break[3]]).id_class[id_break[4]]).hasNext();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE65D267C1221D8BL;
    }

    public synchronized Path id_class() {
        if (((Boolean)((rrzy_3)this.id_class[rrzp_3.id_break[5]]).id_class[id_break[6]]).booleanValue()) {
            throw new NoSuchElementException();
        }
        return (Path)((Iterator)((rrzy_3)this.id_class[rrzp_3.id_break[7]]).id_class[id_break[8]]).next();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-18, -30, 106, 13, 25, -89, -77, 97}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDC78C2D;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzp_3.id_break();
        rrzp_3.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }
}

