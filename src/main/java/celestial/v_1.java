/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_extends;
import celestial.C_throws;
import celestial.F;
import celestial.Pd_1;
import celestial.rqO_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class v_1 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    public v_1 id_byte() {
        return this.id_break(((List)C_throws.id_break().Pj[id_byte[16]]).stream().filter(c_extends -> !Pd_1.id_throws(c_extends) ? id_break[0] : id_break[1]).map(C_extends::id_protected).sorted(String.CASE_INSENSITIVE_ORDER));
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-44, -22, -84, -91, -85, -39, 27, 56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public v_1(List<String> list) {
        Stream stream;
        this.id_implements();
        this.id_class[v_1.id_byte[1]] = stream = list.stream();
    }

    public v_1() {
        Stream stream;
        this.id_implements();
        this.id_class[v_1.id_byte[2]] = stream = Stream.empty();
    }

    public v_1(String[] stringArray) {
        Stream<String> stream;
        this.id_implements();
        this.id_class[v_1.id_byte[0]] = stream = Stream.of(stringArray);
    }

    static {
        v_1.ntfClinit();
    }

    public v_1 id_class(Stream<String> stream) {
        Stream<String> stream2;
        this.id_class[v_1.id_byte[6]] = stream2 = Stream.concat(stream, (Stream)this.id_class[id_byte[5]]);
        return this;
    }

    public v_1 id_class(Predicate<String> predicate) {
        Stream<String> stream;
        this.id_class[v_1.id_byte[10]] = stream = ((Stream)this.id_class[id_byte[9]]).filter(predicate);
        return this;
    }

    public v_1 id_class(Class<? extends Enum<?>> clazz) {
        return this.id_class(Stream.of(clazz.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
    }

    public v_1 id_class(String ... stringArray) {
        return this.id_class(Stream.of(stringArray));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC7E92B65EBAA0961L;
    }

    public v_1 id_class(Function<String, String> function) {
        Stream<String> stream;
        this.id_class[v_1.id_byte[8]] = stream = ((Stream)this.id_class[id_byte[7]]).map(function);
        return this;
    }

    public v_1 id_class(F f) {
        return this.id_break(f.id_class().id_byte().flatMap(c_interface -> c_interface.id_break().stream()).distinct());
    }

    public v_1 id_class(String string) {
        return this.id_class((String string2) -> string2.toLowerCase(Locale.US).startsWith(string.toLowerCase(Locale.US)));
    }

    public String[] id_class() {
        return (String[])((Stream)this.id_class[id_byte[14]]).toArray(String[]::new);
    }

    public v_1 id_class(Comparator<String> comparator) {
        Stream<String> stream;
        this.id_class[v_1.id_byte[12]] = stream = ((Stream)this.id_class[id_byte[11]]).sorted(comparator);
        return this;
    }

    public v_1 id_break(String ... stringArray) {
        return this.id_break(Stream.of(stringArray));
    }

    public v_1 id_break(String string) {
        rqO_2 rqO_22 = rqO_2.id_break(string);
        if (rqO_22 == null) {
            Stream stream;
            this.id_class[v_1.id_byte[13]] = stream = Stream.empty();
            return this;
        }
        return this.id_class(rqO_22.toString());
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD3794ED;
    }

    public v_1 id_break() {
        return this.id_class(String.CASE_INSENSITIVE_ORDER);
    }

    public v_1 id_break(Class<? extends Enum<?>> clazz) {
        return this.id_break(Stream.of(clazz.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
    }

    public v_1 id_break(Stream<String> stream) {
        Stream<String> stream2;
        this.id_class[v_1.id_byte[4]] = stream2 = Stream.concat((Stream)this.id_class[id_byte[3]], stream);
        return this;
    }

    public v_1 id_throws() {
        return this.id_break(C_throws.id_break().id_class(Boolean.class).stream().map(C_extends::id_protected).sorted(String.CASE_INSENSITIVE_ORDER));
    }

    private static /* synthetic */ void ntfClinit() {
        v_1.id_private();
        v_1.id_catch();
    }

    private static void id_catch() {
        short[] sArray = new short[17];
        sArray[16] = 1;
        id_byte = sArray;
    }

    public v_1 id_case() {
        return this.id_break(Pd_1.id_class(C_throws.id_break()).stream().map(C_extends::id_protected).sorted(String.CASE_INSENSITIVE_ORDER));
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
        }
    }

    public Stream<String> id_protected() {
        return (Stream)this.id_class[id_byte[15]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }
}

