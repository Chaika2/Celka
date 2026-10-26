/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.rja_3;
import celestial.rql_3;
import celestial.rrjD_2;
import celestial.rrja_3;
import celestial.rrji_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrje_3
extends Enum<rrje_3> {
    private static String[] strings67a5399629443d9d93e54c2de6d74063;
    private static byte[] bytes67a5399629443d9d93e54c2de6d74063;
    public Object[] fields67a5399629443d9d93e54c2de6d74063;
    public static Object[] staticFields67a5399629443d9d93e54c2de6d74063;
    private static short[] shorts67a5399629443d9d93e54c2de6d74063;
    private static boolean[] booleans67a5399629443d9d93e54c2de6d74063;

    public Set<rrjD_2> id_byte() {
        return (Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[23]];
    }

    public rrjD_2 id_byte(String string) {
        return ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[21]]).stream().filter(rrjD_22 -> rrjD_22.id_byte().equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    private rrje_3() {
        ArrayList arrayList;
        HashSet hashSet;
        this.id_catch();
        this.fields67a5399629443d9d93e54c2de6d74063[rrje_3.shorts67a5399629443d9d93e54c2de6d74063[1]] = hashSet = new HashSet();
        this.fields67a5399629443d9d93e54c2de6d74063[rrje_3.shorts67a5399629443d9d93e54c2de6d74063[2]] = arrayList = new ArrayList();
        ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[3]]).add(new rrji_3());
    }

    static {
        rrje_3.ntfClinit();
    }

    public static rrje_3[] values() {
        return (rrje_3[])((rrje_3[])staticFields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[0]]).clone();
    }

    public static rrje_3 valueOf(String string) {
        return Enum.valueOf(rrje_3.class, string);
    }

    public void id_class(rrja_3 rrja_32) {
        ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[22]]).add(rrja_32);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x143E9090;
    }

    public boolean id_class(rrjD_2 rrjD_22, boolean bl) {
        if (this.id_protected(rrjD_22.id_byte())) {
            this.id_break(rrjD_22.id_byte(), booleans67a5399629443d9d93e54c2de6d74063[0]);
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[4]]).forEach(rrja_32 -> rrja_32.id_class(rrjD_22));
            bl = booleans67a5399629443d9d93e54c2de6d74063[1];
        }
        boolean bl2 = ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[5]]).add(rrjD_22);
        if (bl) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[6]]).forEach(rrja_32 -> rrja_32.id_break(rrjD_22, bl2));
        }
        return bl2;
    }

    public boolean id_class(rja_3 rja_32) {
        if (rja_32 == null) {
            return booleans67a5399629443d9d93e54c2de6d74063[5];
        }
        for (rrjD_2 rrjD_22 : (Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[19]]) {
            eX_2 eX_22 = rrjD_22.id_break();
            if (eX_22 == null) continue;
            int n = (int)eX_22.id_class();
            int n2 = (int)eX_22.id_break();
            int n3 = (int)eX_22.id_byte();
            if (n != rja_32.b_() || n2 != rja_32.c_() || n3 != rja_32.d_()) continue;
            return booleans67a5399629443d9d93e54c2de6d74063[6];
        }
        return booleans67a5399629443d9d93e54c2de6d74063[7];
    }

    public void id_class(Consumer<rrjD_2> consumer) {
        if (((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[14]]).isEmpty()) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[15]]).forEach(rrja_3::id_class);
            return;
        }
        ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[16]]).forEach(consumer);
    }

    public String id_class(String string) {
        return this.id_class(string, booleans67a5399629443d9d93e54c2de6d74063[8]);
    }

    public String id_class(String string, boolean bl) {
        String string2 = string;
        int n = booleans67a5399629443d9d93e54c2de6d74063[9];
        while (this.id_protected(string2) && !bl) {
            Object[] objectArray = new Object[booleans67a5399629443d9d93e54c2de6d74063[10]];
            objectArray[rrje_3.booleans67a5399629443d9d93e54c2de6d74063[11]] = ++n;
            string2 = String.format(string + " %d", objectArray);
        }
        return string2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x467B88156EC149FFL;
    }

    public void id_class() {
        if (((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[10]]).isEmpty()) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[11]]).forEach(rrja_3::id_class);
            return;
        }
        ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[12]]).clear();
        ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[13]]).forEach(rrja_3::id_super);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{80, -68, 4, 51, 74, 63, 36, -59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(String string, boolean bl) {
        rrjD_2 rrjD_23 = this.id_byte(string);
        if (rrjD_23 == null) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[7]]).forEach(rrja_32 -> rrja_32.b_(string));
            return;
        }
        if (bl) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[8]]).forEach(rrja_32 -> rrja_32.id_class(rrjD_23, this.id_protected(string)));
        }
        ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[9]]).removeIf(rrjD_22 -> rrjD_22.id_byte().equalsIgnoreCase(string));
    }

    public boolean id_break() {
        return ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[20]]).isEmpty();
    }

    private static void id_throws() {
        short[] sArray = new short[26];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[22] = 1;
        sArray[24] = 1;
        shorts67a5399629443d9d93e54c2de6d74063 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrje_3.id_implements();
        rrje_3.id_extends();
        rrje_3.id_throws();
        rrje_3.id_private();
        rrje_3.id_case();
    }

    private static /* synthetic */ rrje_3[] id_finally() {
        rrje_3[] rrje_3Array = new rrje_3[booleans67a5399629443d9d93e54c2de6d74063[12]];
        rrje_3Array[rrje_3.booleans67a5399629443d9d93e54c2de6d74063[13]] = (rrje_3)((Object)staticFields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[25]]);
        return rrje_3Array;
    }

    private void id_catch() {
        if (this.fields67a5399629443d9d93e54c2de6d74063 == null) {
            Object[] objectArray = this.fields67a5399629443d9d93e54c2de6d74063 = new Object[bytes67a5399629443d9d93e54c2de6d74063[0]];
        }
    }

    private static void id_extends() {
        strings67a5399629443d9d93e54c2de6d74063 = new String[]{new String("INSTANCE")};
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrje_3(), new rrje_3[]{(rrje_3)((Object)objectArray[0])}};
        staticFields67a5399629443d9d93e54c2de6d74063 = objectArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[17];
        blArray[3] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[16] = true;
        booleans67a5399629443d9d93e54c2de6d74063 = blArray;
    }

    public boolean id_protected(String string) {
        if (rql_3.id_break(string) || ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[17]]).isEmpty()) {
            return booleans67a5399629443d9d93e54c2de6d74063[2];
        }
        for (rrjD_2 rrjD_22 : (Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[18]]) {
            if (!rrjD_22.id_byte().equalsIgnoreCase(string)) continue;
            return booleans67a5399629443d9d93e54c2de6d74063[3];
        }
        return booleans67a5399629443d9d93e54c2de6d74063[4];
    }

    public List<rrja_3> id_protected() {
        return (List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[24]];
    }

    private static void id_private() {
        bytes67a5399629443d9d93e54c2de6d74063 = new byte[]{2, 2};
    }
}

