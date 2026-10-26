/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_import;
import celestial.C_interface;
import celestial.Ex_1;
import celestial.F;
import celestial.L;
import celestial.rqj_3;
import celestial.sG_2;
import celestial.sS_2;
import celestial.sz_3;
import celestial.v_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EJ
implements F {
    public Object[] id_class;
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;

    @Override
    public Stream<String> id_byte(String string) {
        rqj_3<String, List<C_import>> rqj_32 = EJ.id_class(string, id_byte[2]);
        String string2 = rqj_32.id_class();
        List<C_import> list = rqj_32.id_break();
        if (list.isEmpty()) {
            return new v_1().id_class(((C_class)this.id_class[id_protected[7]]).S()).id_class(string2).id_protected();
        }
        return this.id_class(rqj_32);
    }

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private Ex_1 id_byte(rqj_3<String, List<C_import>> rqj_32) {
        String string = rqj_32.id_class();
        sS_2 sS_22 = new sS_2(this, rqj_32.id_break());
        C_interface c_interface = this.id_break(string);
        return c_interface == null ? null : new Ex_1(c_interface, string, sS_22);
    }

    public EJ(C_class c_class) {
        L l;
        this.id_protected();
        this.id_class[EJ.id_protected[0]] = l = new L();
        C_class c_class2 = c_class;
        this.id_class[EJ.id_protected[1]] = c_class2;
        sz_3.id_class(c_class).forEach(((L)this.id_class[id_protected[2]])::id_break);
    }

    static {
        EJ.ntfClinit();
    }

    @Override
    public L<C_interface> id_class() {
        return (L)this.id_class[id_protected[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9BB16965DE4FF815L;
    }

    private static rqj_3<String, List<C_import>> id_class(String string, boolean bl) {
        String string2 = string.split(id_break[0], id_throws[0])[id_byte[3]];
        List<C_import> list = sG_2.id_class(string.substring(string2.length()), bl);
        return new rqj_3<String, List<C_import>>(string2, list);
    }

    @Override
    public Stream<String> id_class(rqj_3<String, List<C_import>> rqj_32) {
        Ex_1 ex_1 = this.id_byte(rqj_32);
        return ex_1 == null ? Stream.empty() : ex_1.id_protected();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x914017BA;
    }

    @Override
    public boolean id_class(String string) {
        return this.id_break(EJ.id_throws(string));
    }

    @Override
    public C_interface id_break(String string) {
        for (C_interface c_interface : (Collection)((L)this.id_class[EJ.id_protected[5]]).id_class[id_protected[6]]) {
            if (!c_interface.id_break().contains(string.toLowerCase(Locale.US))) continue;
            return c_interface;
        }
        return null;
    }

    @Override
    public C_case id_break() {
        return (C_class)this.id_class[id_protected[3]];
    }

    @Override
    public boolean id_break(rqj_3<String, List<C_import>> rqj_32) {
        Ex_1 ex_1 = this.id_byte(rqj_32);
        if (ex_1 != null) {
            ex_1.id_case();
        }
        return ex_1 != null ? id_byte[0] : id_byte[1];
    }

    public static rqj_3<String, List<C_import>> id_throws(String string) {
        return EJ.id_class(string, id_byte[4]);
    }

    private static void id_throws() {
        id_throws = new byte[]{2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        EJ.id_byte();
        EJ.id_case();
        EJ.id_catch();
        EJ.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        id_protected = sArray;
    }

    private static void id_case() {
        id_break = new String[]{new String("\\s")};
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-49, 42, 38, -83, 100, -78, 126, -13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[1]];
        }
    }
}

