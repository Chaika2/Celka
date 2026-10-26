/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ja_1;
import celestial.rI_2;
import celestial.rw_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ME
extends rI_2 {
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static int[] id_case;
    public Object[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{50, 107, -120, -82, -70, -61, 72, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public ME(rw_3 rw_32) {
        super(rw_32);
        this.id_private();
        int[][] nArray = ME.id_class(rw_32);
        this.id_byte[ME.id_protected[0]] = nArray;
    }

    static {
        ME.ntfClinit();
    }

    private static int[][] id_class(rw_3 rw_32) {
        int[][] nArray = new int[rw_32.id_break()][rw_32.id_byte()];
        int n = id_throws[2];
        for (int i = id_throws[3]; i < rw_32.id_break(); ++i) {
            for (int j = id_throws[4]; j < rw_32.id_byte(); ++j) {
                xc_3[] xc_3Array = rw_32.id_class(i, j);
                OptionalInt optionalInt = ME.id_class(xc_3Array, xc_32 -> !(xc_32.id_break() instanceof Ja_1) ? id_throws[6] : id_throws[7]);
                if (optionalInt.isPresent()) {
                    nArray[i][j] = optionalInt.getAsInt();
                    continue;
                }
                ++n;
                nArray[i][j] = id_case[0];
            }
        }
        if (n != 0) {
            System.out.println(n + " columns had no block despite being in a map art, letting them be whatever");
        }
        return nArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x957255C8E871385FL;
    }

    private static <T> OptionalInt id_class(T[] TArray, Predicate<? super T> predicate) {
        for (int i = TArray.length - id_throws[5]; i >= 0; --i) {
            if (!predicate.test(TArray[i])) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA6785E65;
    }

    @Override
    public boolean id_break(int n, int n2, int n3, xc_3 xc_32) {
        this.id_private();
        return n2 >= ((int[][])this.id_byte[id_protected[1]])[n][n3] ? id_throws[0] : id_throws[1];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        ME.id_throws();
        ME.id_catch();
        ME.id_case();
    }

    private static void id_catch() {
        id_protected = new short[2];
    }

    private static void id_case() {
        id_case = new int[]{Integer.MAX_VALUE};
    }

    private void id_private() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[8]];
        }
    }
}

