/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.MutablePair
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.MutablePair;

public class rrvl_1<L, R>
extends MutablePair<L, R> {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_break = new byte[]{4};
    }

    public rrvl_1(L l, R r) {
        super(l, r);
        Consumer<Object> consumer;
        Consumer<Object> consumer2;
        this.id_protected();
        this.id_class[rrvl_1.id_byte[0]] = consumer2 = object -> {};
        this.id_class[rrvl_1.id_byte[1]] = consumer = object -> {};
    }

    static {
        rrvl_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x93C58060126FE4F3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC14EFCF9;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, 100, -8, -29, 4, 64, 127, 28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(L l, boolean bl) {
        super.setLeft(l);
        if (bl && this.id_class[id_byte[2]] != l) {
            ((Consumer)this.id_class[id_byte[3]]).accept(l);
        }
        L l2 = l;
        this.id_class[rrvl_1.id_byte[4]] = l2;
    }

    public rrvl_1<L, R> id_class(Consumer<R> consumer) {
        Consumer<R> consumer2;
        this.id_class[rrvl_1.id_byte[9]] = consumer2 = consumer;
        return this;
    }

    private static void id_class() {
        id_protected = new boolean[]{true, true};
    }

    private static void id_break() {
        short[] sArray = new short[10];
        sArray[0] = 2;
        sArray[1] = 3;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        id_byte = sArray;
    }

    public rrvl_1<L, R> id_break(Consumer<L> consumer) {
        Consumer<L> consumer2;
        this.id_class[rrvl_1.id_byte[8]] = consumer2 = consumer;
        return this;
    }

    public void id_break(R r, boolean bl) {
        super.setRight(r);
        if (bl && this.id_class[id_byte[5]] != r) {
            ((Consumer)this.id_class[id_byte[6]]).accept(r);
        }
        R r2 = r;
        this.id_class[rrvl_1.id_byte[7]] = r2;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvl_1.id_class();
        rrvl_1.id_break();
        rrvl_1.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public void setLeft(L l) {
        this.id_class(l, id_protected[0]);
    }

    public void setRight(R r) {
        this.id_break(r, id_protected[1]);
    }
}

