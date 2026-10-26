/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_for;
import celestial.C_import;
import celestial.C_static;
import celestial.C_switch;
import celestial.C_transient;
import celestial.F;
import celestial.Q;
import celestial.W;
import celestial.c_1;
import celestial.sG_2;
import celestial.ss_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sS_2
implements C_static {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static String[] id_throws;

    @Override
    public <E extends Enum<?>> E id_byte(Class<E> clazz) throws W, Q {
        return this.id_protected(clazz, id_protected[15]);
    }

    @Override
    public <T> T id_byte(C_double<T> c_double) {
        return this.id_package().id_protected(c_double);
    }

    @Override
    public <T> T id_byte(Class<T> clazz, T t) throws Q {
        try {
            T t2 = this.id_catch().id_byte(clazz);
            this.id_throws();
            return t2;
        }
        catch (W w) {
            return t;
        }
    }

    @Override
    public <E extends Enum<?>> E id_byte(Class<E> clazz, int n) throws Q {
        try {
            return this.id_protected(clazz, n);
        }
        catch (W w) {
            return null;
        }
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, 57, -76, -101, 48, -127, -35, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public LinkedList<C_import> id_byte() {
        return (LinkedList)this.id_class[id_byte[4]];
    }

    @Override
    public <T, O, D extends C_switch<T, O>> T id_byte(D d, O o) {
        return this.id_break(d, o, null);
    }

    @Override
    public C_import id_byte(int n) throws Q {
        this.id_private(n + id_protected[9]);
        return (C_import)((LinkedList)this.id_class[id_byte[9]]).get(n);
    }

    private static void id_int() {
        short[] sArray = new short[41];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 3;
        sArray[17] = 2;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 3;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 3;
        sArray[24] = 2;
        sArray[25] = 2;
        sArray[26] = 3;
        sArray[27] = 3;
        sArray[28] = 1;
        sArray[29] = 2;
        sArray[30] = 2;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[33] = 2;
        sArray[34] = 3;
        sArray[35] = 3;
        sArray[36] = 3;
        sArray[37] = 3;
        sArray[39] = 2;
        sArray[40] = 3;
        id_byte = sArray;
    }

    private sS_2(F f, Deque<C_import> deque, Deque<C_import> deque2) {
        LinkedList<C_import> linkedList;
        LinkedList<C_import> linkedList2;
        this.id_continue();
        F f2 = f;
        this.id_class[sS_2.id_byte[0]] = f2;
        ss_3 ss_32 = new ss_3(this);
        this.id_class[sS_2.id_byte[1]] = ss_32;
        this.id_class[sS_2.id_byte[2]] = linkedList2 = new LinkedList<C_import>(deque);
        this.id_class[sS_2.id_byte[3]] = linkedList = new LinkedList<C_import>(deque2);
    }

    public sS_2(F f, List<C_import> list) {
        this(f, new LinkedList<C_import>(list), new LinkedList<C_import>());
    }

    static {
        sS_2.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[23];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[14] = true;
        blArray[20] = true;
        blArray[21] = true;
        id_protected = blArray;
    }

    @Override
    public String id_class(String string, int n) throws Q {
        this.id_private(n + id_protected[14]);
        return ((LinkedList)this.id_class[id_byte[10]]).stream().skip(n).map(C_import::id_break).reduce((string2, string3) -> string2 + string + string3).orElse(id_throws[0]);
    }

    @Override
    public <T, O> T id_class(C_switch<T, O> c_switch) {
        return this.id_package().id_throws(c_switch, null);
    }

    @Override
    public <T, D extends C_double<T>> T id_class(D d, T t) {
        ArrayList arrayList = new ArrayList((LinkedList)this.id_class[id_byte[22]]);
        ArrayList arrayList2 = new ArrayList((Deque)this.id_class[id_byte[23]]);
        try {
            return this.id_break(d);
        }
        catch (Exception exception) {
            ((LinkedList)this.id_class[id_byte[24]]).clear();
            ((LinkedList)this.id_class[id_byte[25]]).addAll(arrayList);
            ((Deque)this.id_class[id_byte[26]]).clear();
            ((Deque)this.id_class[id_byte[27]]).addAll(arrayList2);
            return t;
        }
    }

    @Override
    public <E extends Enum<?>> E id_class(Class<E> clazz, E e) throws Q {
        try {
            this.id_byte(clazz);
            return this.id_implements(clazz);
        }
        catch (W w) {
            return e;
        }
    }

    @Override
    public String id_class() {
        return ((LinkedList)this.id_class[id_byte[29]]).size() > 0 ? ((C_import)((LinkedList)this.id_class[id_byte[30]]).getFirst()).id_byte() : id_throws[1];
    }

    @Override
    public <T, O, D extends C_switch<T, O>> T id_class(D d, O o, T t) {
        ArrayList arrayList = new ArrayList((LinkedList)this.id_class[id_byte[15]]);
        ArrayList arrayList2 = new ArrayList((Deque)this.id_class[id_byte[16]]);
        try {
            return this.id_break(d, o);
        }
        catch (Exception exception) {
            ((LinkedList)this.id_class[id_byte[17]]).clear();
            ((LinkedList)this.id_class[id_byte[18]]).addAll(arrayList);
            ((Deque)this.id_class[id_byte[19]]).clear();
            ((Deque)this.id_class[id_byte[20]]).addAll(arrayList2);
            return t;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x51FC798C665A3716L;
    }

    @Override
    public String[] id_class(String string) {
        return (String[])((LinkedList)this.id_class[id_byte[11]]).stream().map(C_import::id_break).flatMap(string2 -> Stream.of(string2.split(string))).toArray(String[]::new);
    }

    @Override
    public <T> T id_class(Class<T> clazz, int n) throws Q, W {
        return this.id_byte(n).id_byte(clazz);
    }

    @Override
    public <T> T id_class(Class<T> clazz, T t, int n) throws Q {
        try {
            return this.id_class(clazz, (T)n);
        }
        catch (W w) {
            return t;
        }
    }

    @Override
    public <T> T id_class(C_double<T> c_double) throws W, Q {
        return this.id_package().id_break(c_double);
    }

    @Override
    public <T extends C_transient> Stream<String> id_class(T t) {
        try {
            return t.id_class((C_for)this.id_class[id_byte[28]]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return Stream.empty();
        }
    }

    @Override
    public <T, D extends C_double<T>> T id_class(Class<D> clazz) {
        return this.id_package().id_class(clazz);
    }

    @Override
    public <T, O, D extends C_switch<T, O>> T id_class(D d, O o) throws W, Q {
        return this.id_package().id_break(d, o);
    }

    @Override
    public <T> T id_class(Class<T> clazz, T t) throws Q {
        return this.id_class(clazz, t, id_protected[18]);
    }

    @Override
    public void id_class(int n) throws c_1 {
        if (((LinkedList)this.id_class[id_byte[33]]).size() > n) {
            throw new c_1(n + ((Deque)this.id_class[id_byte[34]]).size());
        }
    }

    @Override
    public <T, O, D extends C_switch<T, O>> T id_break(D d, O o) throws W, Q {
        try {
            return d.id_class((C_for)this.id_class[id_byte[14]], o);
        }
        catch (Exception exception) {
            throw new W(this.id_final() ? this.id_catch() : this.id_private(), (Throwable)exception);
        }
    }

    @Override
    public <T, D extends C_double<T>> T id_break(Class<D> clazz, T t) {
        return this.id_package().id_break(clazz, t);
    }

    @Override
    public String id_break(String string) throws Q {
        return this.id_class(string, id_protected[13]);
    }

    @Override
    public String id_break() {
        return this.id_private().id_break();
    }

    @Override
    public <T> T id_break(Class<T> clazz, int n) throws Q {
        return this.id_class(clazz, null, n);
    }

    @Override
    public <T, O> T id_break(C_switch<T, O> c_switch) throws W, Q {
        return this.id_protected(c_switch, null);
    }

    @Override
    public <T, D extends C_double<T>> T id_break(D d) throws W, Q {
        try {
            return d.id_byte((C_for)this.id_class[id_byte[21]]);
        }
        catch (Exception exception) {
            throw new W(this.id_final() ? this.id_catch() : this.id_private(), (Throwable)exception);
        }
    }

    @Override
    public <T, O, D extends C_switch<T, O>> T id_break(D d, O o, T t) {
        return this.id_package().id_class(d, o, t);
    }

    @Override
    public <T> T id_break(Class<T> clazz) throws Q {
        return this.id_byte((C_switch)((Object)clazz), null);
    }

    @Override
    public boolean id_break(int n) {
        return ((LinkedList)this.id_class[id_byte[6]]).size() >= n ? id_protected[0] : id_protected[1];
    }

    @Override
    public <T, O, D extends C_switch<T, O>> T id_throws(D d, O o) {
        return this.id_class(d, o, null);
    }

    @Override
    public <T> T id_throws(Class<T> clazz) throws Q {
        return this.id_break(clazz, id_protected[19]);
    }

    @Override
    public C_import id_throws() throws Q {
        this.id_private(id_protected[20]);
        C_import c_import = (C_import)((LinkedList)this.id_class[id_byte[12]]).removeFirst();
        ((Deque)this.id_class[id_byte[13]]).add(c_import);
        return c_import;
    }

    @Override
    public String id_throws(int n) throws Q {
        return this.id_byte(n).id_break();
    }

    @Override
    public boolean id_throws(Class<?> clazz, int n) throws Q {
        return this.id_byte(n).id_class(clazz);
    }

    private static /* synthetic */ void ntfClinit() {
        sS_2.id_this();
        sS_2.id_super();
        sS_2.id_int();
        sS_2.id_new();
    }

    @Override
    public <E extends Enum<?>> E id_finally(Class<E> clazz) throws Q {
        return this.id_class((Class)clazz, (Object)null);
    }

    private static int id_finally(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x66FDCED2;
    }

    @Override
    public /* synthetic */ C_static id_finally() {
        return this.id_package();
    }

    @Override
    public boolean id_catch(int n) {
        return ((LinkedList)this.id_class[id_byte[7]]).size() <= n ? id_protected[3] : id_protected[4];
    }

    @Override
    public C_import id_catch() throws Q {
        return this.id_byte(id_protected[10]);
    }

    @Override
    public <T> T id_catch(Class<T> clazz) throws W, Q {
        return this.id_throws().id_byte(clazz);
    }

    @Override
    public String id_extends() throws Q {
        return this.id_throws().id_break();
    }

    @Override
    public boolean id_extends(Class<?> clazz) throws Q {
        return this.id_throws(clazz, id_protected[11]);
    }

    @Override
    public boolean id_case() {
        return this.id_case(id_protected[8]);
    }

    @Override
    public boolean id_case(int n) {
        return ((LinkedList)this.id_class[id_byte[8]]).size() == n ? id_protected[6] : id_protected[7];
    }

    @Override
    public <T, D extends C_double<T>> T id_case(Class<D> clazz) {
        return this.id_break(clazz, null);
    }

    private void id_continue() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    @Override
    public String id_implements() throws Q {
        return this.id_throws(id_protected[12]);
    }

    @Override
    public <E extends Enum<?>> E id_implements(Class<E> clazz) throws W, Q {
        return this.id_throws().id_break(clazz);
    }

    private static void id_new() {
        id_break = new byte[]{4};
    }

    public sS_2 id_package() {
        return new sS_2((F)this.id_class[id_byte[38]], (LinkedList)this.id_class[id_byte[39]], (Deque)this.id_class[id_byte[40]]);
    }

    private static void id_super() {
        id_throws = new String[]{new String(""), new String("")};
    }

    @Override
    public Deque<C_import> id_protected() {
        return (Deque)this.id_class[id_byte[5]];
    }

    @Override
    public <T, D extends C_double<T>> T id_protected(D d) {
        return this.id_class(d, (O)null);
    }

    @Override
    public <T> T id_protected(Class<T> clazz) throws W, Q {
        return this.id_class(clazz, id_protected[17]);
    }

    @Override
    public void id_protected(int n) throws x_1 {
        this.id_private(n);
        this.id_class(n);
    }

    @Override
    public <E extends Enum<?>> E id_protected(Class<E> clazz, int n) throws Q, W {
        return this.id_byte(n).id_break(clazz);
    }

    @Override
    public <T, O> T id_protected(C_switch<T, O> c_switch, O o) throws W, Q {
        return this.id_package().id_break(c_switch, o);
    }

    @Override
    public <E extends Enum<?>> E id_private(Class<E> clazz) throws Q {
        return (E)this.id_byte((C_switch)((Object)clazz), id_protected[16]);
    }

    @Override
    public C_import id_private() {
        return !((Deque)this.id_class[id_byte[36]]).isEmpty() ? (C_import)((Deque)this.id_class[id_byte[37]]).getLast() : sG_2.id_class();
    }

    @Override
    public void id_private(int n) throws Q {
        if (((LinkedList)this.id_class[id_byte[31]]).size() < n) {
            throw new Q(n + ((Deque)this.id_class[id_byte[32]]).size());
        }
    }

    @Override
    public boolean id_final() {
        return this.id_break(id_protected[2]);
    }

    @Override
    public boolean id_volatile() {
        return !((Deque)this.id_class[id_byte[35]]).isEmpty() ? id_protected[21] : id_protected[22];
    }

    @Override
    public boolean id_native() {
        return this.id_catch(id_protected[5]);
    }
}

