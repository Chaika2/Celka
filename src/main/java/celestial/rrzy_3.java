/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQs_1;
import celestial.rrzf_3;
import celestial.rrzp_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.ClosedDirectoryStreamException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.security.Key;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzy_3
implements DirectoryStream<Path> {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static String[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        id_protected = new String[]{new String("Iterator has already been returned")};
    }

    public rrzy_3(rrQs_1 rrQs_12, DirectoryStream.Filter<? super Path> filter) throws IOException {
        DirectoryStream.Filter<? super Path> filter2;
        this.id_class();
        rrzf_3 rrzf_32 = rrQs_12.id_private();
        this.id_class[rrzy_3.id_throws[0]] = rrzf_32;
        rrQs_1 rrQs_13 = rrQs_12;
        this.id_class[rrzy_3.id_throws[1]] = rrQs_13;
        this.id_class[rrzy_3.id_throws[2]] = filter2 = filter;
        if (!((rrzf_3)this.id_class[id_throws[3]]).id_protected(rrQs_12.id_throws())) {
            throw new NotDirectoryException(rrQs_12.toString());
        }
    }

    static {
        rrzy_3.ntfClinit();
    }

    @Override
    public synchronized Iterator<Path> iterator() {
        if (((Boolean)this.id_class[id_throws[4]]).booleanValue()) {
            throw new ClosedDirectoryStreamException();
        }
        if ((Iterator)this.id_class[id_throws[5]] != null) {
            throw new IllegalStateException(id_protected[0]);
        }
        try {
            Iterator<Path> iterator;
            this.id_class[rrzy_3.id_throws[9]] = iterator = ((rrzf_3)this.id_class[id_throws[6]]).id_class((rrQs_1)this.id_class[id_throws[7]], (DirectoryStream.Filter)this.id_class[id_throws[8]]);
        }
        catch (IOException iOException) {
            throw new DirectoryIteratorException(iOException);
        }
        return new rrzp_3(this);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{101, -77, -12, 11, 96, -75, 74, 23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrzy_3.id_break[1]] = id_byte[1];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEC94918D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB96D6CB9E0E48FE2L;
    }

    @Override
    public synchronized void close() throws IOException {
        Boolean bl = id_byte[0];
        this.id_class[rrzy_3.id_throws[10]] = bl;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        id_break = new byte[]{5, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzy_3.id_break();
        rrzy_3.id_byte();
        rrzy_3.id_protected();
        rrzy_3.id_throws();
    }

    private static void id_protected() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 4;
        sArray[10] = 3;
        id_throws = sArray;
    }
}

