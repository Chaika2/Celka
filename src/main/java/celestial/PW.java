/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PN;
import celestial.PQ;
import celestial.Pk_1;
import celestial.Pz_1;
import celestial.rVL;
import celestial.rdb_3;
import celestial.ri_3;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.xd_3;
import java.awt.Color;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public sealed class PW
extends Enum<PW>
implements Pk_1
permits Pz_1, PQ {
    public Object[] fieldsc5fedc8899313727b7f3a8d711e7af0d;
    public static Object[] staticFieldsc5fedc8899313727b7f3a8d711e7af0d;
    private static short[] shortsc5fedc8899313727b7f3a8d711e7af0d;
    private static String[] stringsc5fedc8899313727b7f3a8d711e7af0d;
    private static byte[] bytesc5fedc8899313727b7f3a8d711e7af0d;
    private static boolean[] booleansc5fedc8899313727b7f3a8d711e7af0d;

    private static void id_byte() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[11] = true;
        booleansc5fedc8899313727b7f3a8d711e7af0d = blArray;
    }

    public PW() {
        this.id_protected();
        Object var7_3 = null;
        this.fieldsc5fedc8899313727b7f3a8d711e7af0d[PW.shortsc5fedc8899313727b7f3a8d711e7af0d[1]] = var7_3;
        Object var8_4 = null;
        this.fieldsc5fedc8899313727b7f3a8d711e7af0d[PW.shortsc5fedc8899313727b7f3a8d711e7af0d[2]] = var8_4;
        Object var9_5 = null;
        this.fieldsc5fedc8899313727b7f3a8d711e7af0d[PW.shortsc5fedc8899313727b7f3a8d711e7af0d[3]] = var9_5;
    }

    private <T> PW(Class<T> clazz, Function<String, T> function, Function<T, String> function2) {
        Function<Object, String> function3;
        Function<String, Object> function4;
        Class<T> clazz2;
        this.id_protected();
        this.fieldsc5fedc8899313727b7f3a8d711e7af0d[PW.shortsc5fedc8899313727b7f3a8d711e7af0d[4]] = clazz2 = clazz;
        this.fieldsc5fedc8899313727b7f3a8d711e7af0d[PW.shortsc5fedc8899313727b7f3a8d711e7af0d[5]] = function4 = function::apply;
        this.fieldsc5fedc8899313727b7f3a8d711e7af0d[PW.shortsc5fedc8899313727b7f3a8d711e7af0d[6]] = function3 = object -> (String)function2.apply(object);
    }

    private <T> PW(Class<T> clazz, Function<String, T> function) {
        this(clazz, function, Object::toString);
    }

    static {
        PW.ntfClinit();
    }

    public static PW[] values() {
        return (PW[])((PW[])staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[0]]).clone();
    }

    public static PW valueOf(String string) {
        return Enum.valueOf(PW.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6F5BCAE7C1C99FD2L;
    }

    public String id_class(PN pN, Object object) {
        return (String)((Function)this.fieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[8]]).apply(object);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x665E8A46;
    }

    private static void id_class() {
        short[] sArray = new short[23];
        sArray[0] = 13;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[15] = 5;
        sArray[16] = 6;
        sArray[17] = 7;
        sArray[18] = 8;
        sArray[19] = 9;
        sArray[20] = 10;
        sArray[21] = 11;
        sArray[22] = 12;
        shortsc5fedc8899313727b7f3a8d711e7af0d = sArray;
    }

    public Object id_class(PN pN, String string) {
        Object r = ((Function)this.fieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[7]]).apply(string);
        Objects.requireNonNull(r);
        return r;
    }

    @Override
    public boolean id_class(Type type) {
        return type instanceof Class && ((Class)this.fieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[9]]).isAssignableFrom((Class)type) ? booleansc5fedc8899313727b7f3a8d711e7af0d[0] : booleansc5fedc8899313727b7f3a8d711e7af0d[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{9, -118, 38, -16, 47, -104, -20, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new PW(Double.class, Double::parseDouble), new PW(Boolean.class, Boolean::parseBoolean), new PW(Integer.class, Integer::parseInt), new PW(Float.class, Float::parseFloat), new PW(Long.class, Long::parseLong), new PW(String.class, String::new), new PW(rpr_3.class, rpr_3::id_class), new PW(Color.class, string -> new Color(Integer.parseInt(string.split(stringsc5fedc8899313727b7f3a8d711e7af0d[3])[booleansc5fedc8899313727b7f3a8d711e7af0d[4]]), Integer.parseInt(string.split(stringsc5fedc8899313727b7f3a8d711e7af0d[4])[booleansc5fedc8899313727b7f3a8d711e7af0d[5]]), Integer.parseInt(string.split(stringsc5fedc8899313727b7f3a8d711e7af0d[5])[bytesc5fedc8899313727b7f3a8d711e7af0d[1]])), color -> color.getRed() + "," + color.getGreen() + "," + color.getBlue()), new PW(rja_3.class, string -> new rja_3(Integer.parseInt(string.split(stringsc5fedc8899313727b7f3a8d711e7af0d[0])[booleansc5fedc8899313727b7f3a8d711e7af0d[2]]), Integer.parseInt(string.split(stringsc5fedc8899313727b7f3a8d711e7af0d[1])[booleansc5fedc8899313727b7f3a8d711e7af0d[3]]), Integer.parseInt(string.split(stringsc5fedc8899313727b7f3a8d711e7af0d[2])[bytesc5fedc8899313727b7f3a8d711e7af0d[0]])), rja_32 -> rja_32.b_() + "," + rja_32.c_() + "," + rja_32.d_()), new PW(xd_3.class, string -> ri_3.id_break(string.trim()), ri_3::id_class), new PW(rdb_3.class, string -> rVL.id_for.id_class(new rqO_2(string.trim())), rdb_32 -> rVL.id_for.id_break((rdb_3)rdb_32).toString()), new Pz_1(), new PQ(), new PW[]{(PW)objectArray[0], (PW)objectArray[1], (PW)objectArray[2], (PW)objectArray[3], (PW)objectArray[4], (PW)objectArray[5], (PW)objectArray[6], (PW)objectArray[7], (PW)objectArray[8], (PW)objectArray[9], (PW)objectArray[10]}};
        staticFieldsc5fedc8899313727b7f3a8d711e7af0d = objectArray;
    }

    public static PW id_break(Type type) {
        return Stream.of(PW.values()).filter(pW -> pW.id_class(type)).findFirst().orElse(null);
    }

    private static void id_throws() {
        bytesc5fedc8899313727b7f3a8d711e7af0d = new byte[]{2, 2, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 3, 14};
    }

    private static /* synthetic */ void ntfClinit() {
        PW.id_byte();
        PW.id_catch();
        PW.id_class();
        PW.id_throws();
        PW.id_break();
    }

    private static void id_catch() {
        stringsc5fedc8899313727b7f3a8d711e7af0d = new String[]{new String(","), new String(","), new String(","), new String(","), new String(","), new String(","), new String("DOUBLE"), new String("BOOLEAN"), new String("INTEGER"), new String("FLOAT"), new String("LONG"), new String("STRING"), new String("DIRECTION"), new String("COLOR"), new String("VEC3I"), new String("BLOCK"), new String("ITEM"), new String("LIST"), new String("MAPPING")};
    }

    private static /* synthetic */ PW[] id_case() {
        PW[] pWArray = new PW[bytesc5fedc8899313727b7f3a8d711e7af0d[2]];
        pWArray[PW.booleansc5fedc8899313727b7f3a8d711e7af0d[6]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[10]];
        pWArray[PW.booleansc5fedc8899313727b7f3a8d711e7af0d[7]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[11]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[3]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[12]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[4]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[13]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[5]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[14]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[6]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[15]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[7]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[16]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[8]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[17]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[9]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[18]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[10]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[19]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[11]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[20]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[12]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[21]];
        pWArray[PW.bytesc5fedc8899313727b7f3a8d711e7af0d[13]] = (PW)staticFieldsc5fedc8899313727b7f3a8d711e7af0d[shortsc5fedc8899313727b7f3a8d711e7af0d[22]];
        return pWArray;
    }

    private void id_protected() {
        if (this.fieldsc5fedc8899313727b7f3a8d711e7af0d == null) {
            Object[] objectArray = this.fieldsc5fedc8899313727b7f3a8d711e7af0d = new Object[bytesc5fedc8899313727b7f3a8d711e7af0d[37]];
        }
    }
}

