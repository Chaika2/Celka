/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class L<V> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    public void id_byte(V v) {
        if (!this.id_class(v)) {
            return;
        }
        ((Deque)this.id_class[id_protected[7]]).remove(v);
        ((Set)this.id_class[id_protected[8]]).remove(v);
    }

    public Stream<V> id_byte() {
        return StreamSupport.stream(Spliterators.spliterator(this.id_class(), (long)((Deque)this.id_class[id_protected[12]]).size(), (int)id_protected[13]), id_break[2]);
    }

    public L() {
        Collection collection;
        HashSet hashSet;
        LinkedList linkedList;
        this.id_case();
        this.id_class[L.id_protected[0]] = linkedList = new LinkedList();
        this.id_class[L.id_protected[1]] = hashSet = new HashSet();
        this.id_class[L.id_protected[3]] = collection = Collections.unmodifiableCollection((Deque)this.id_class[id_protected[2]]);
    }

    static {
        L.ntfClinit();
    }

    public Iterator<V> id_class() {
        return ((Deque)this.id_class[id_protected[10]]).descendingIterator();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA9AFBD44B92F7035L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-52, -87, -42, -18, -23, -86, 38, -42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDC5E3584;
    }

    public boolean id_class(V v) {
        return ((Set)this.id_class[id_protected[4]]).contains(v);
    }

    public Iterator<V> id_break() {
        return ((Deque)this.id_class[id_protected[9]]).iterator();
    }

    public boolean id_break(V v) {
        if (!this.id_class(v)) {
            ((Deque)this.id_class[id_protected[5]]).addFirst(v);
            ((Set)this.id_class[id_protected[6]]).add(v);
            return id_break[0];
        }
        return id_break[1];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        L.id_throws();
        L.id_catch();
        L.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[13] = 16448;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public Stream<V> id_protected() {
        return ((Deque)this.id_class[id_protected[11]]).stream();
    }

    private static void id_private() {
        id_byte = new byte[]{3};
    }
}

