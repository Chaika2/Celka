/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQs_1;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.ReadOnlyFileSystemException;
import java.security.Key;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQE
implements Iterator<Path> {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[10];
        sArray[0] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    public rrQE(rrQs_1 rrQs_12) {
        this.id_protected();
        rrQs_1 rrQs_13 = rrQs_12;
        this.id_class[rrQE.id_byte[0]] = rrQs_13;
        Integer n = id_protected[0];
        this.id_class[rrQE.id_byte[1]] = n;
    }

    static {
        rrQE.ntfClinit();
    }

    @Override
    public void remove() {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public boolean hasNext() {
        return (Integer)this.id_class[id_byte[2]] < ((rrQs_1)this.id_class[id_byte[3]]).getNameCount() ? id_protected[1] : id_protected[2];
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAC329BEF;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{103, 91, 123, 0, -22, 100, 98, 30}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8E768F0F853591D7L;
    }

    public Path id_class() {
        if ((Integer)this.id_class[id_byte[4]] < ((rrQs_1)this.id_class[id_byte[5]]).getNameCount()) {
            rrQs_1 rrQs_12 = ((rrQs_1)this.id_class[id_byte[6]]).id_class((Integer)this.id_class[id_byte[7]]);
            rrQE rrQE2 = this;
            Integer n = (Integer)rrQE2.id_class[id_byte[8]] + id_protected[3];
            rrQE2.id_class[rrQE.id_byte[9]] = n;
            return rrQs_12;
        }
        throw new NoSuchElementException();
    }

    private static void id_break() {
        id_break = new byte[]{2};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQE.id_throws();
        rrQE.id_byte();
        rrQE.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrQE.id_protected[4]] = id_protected[5];
        }
    }
}

