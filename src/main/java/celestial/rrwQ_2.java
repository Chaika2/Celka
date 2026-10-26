/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Y;
import celestial.cG_2;
import celestial.q_1;
import celestial.rrFK;
import celestial.rrfq_3;
import celestial.rrnM_2;
import celestial.rrwk_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwQ_2
extends rrwk_3 {
    private static short[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_byte;
    private static byte[] id_catch;
    private static String[] id_private;
    public Object[] id_protected;

    @Override
    public rrfq_3 id_byte() {
        return (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[11]]);
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, -45, 7, -48, 61, 123, 117, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrwQ_2(C_class c_class) {
        super(c_class);
        HashSet hashSet;
        this.id_private();
        this.id_protected[rrwQ_2.id_throws[0]] = hashSet = new HashSet();
    }

    static {
        rrwQ_2.ntfClinit();
    }

    @Override
    public void id_class(rrnM_2 rrnM_22) {
        this.id_private();
        if (!this.id_break()) {
            return;
        }
        cG_2 cG_22 = rrnM_22.id_class();
        UUID uUID = cG_22.ro();
        if (cG_22 == ((Ps_1)this.id_class[id_throws[1]]).id_catch()) {
            return;
        }
        if (!((List)id_byte[id_throws[2]]).contains(uUID)) {
            return;
        }
        boolean bl = ((Set)this.id_protected[id_throws[3]]).add(uUID);
        if (bl && ((Set)this.id_protected[id_throws[4]]).containsAll((List)id_byte[id_throws[5]])) {
            Boolean bl2 = id_case[0];
            this.id_protected[rrwQ_2.id_throws[6]] = bl2;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8E28F38145677671L;
    }

    @Override
    public void id_class(rrFK rrFK2) {
        super.id_class(rrFK2);
        this.id_protected();
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_private();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[7]])) {
            if (!this.id_break()) {
                return;
            }
            if (((Boolean)this.id_protected[id_throws[8]]).booleanValue()) {
                this.id_class(id_case[1]);
                this.id_protected();
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x685314F0;
    }

    private static void id_throws() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwQ_2.id_implements();
        rrwQ_2.id_finally();
        rrwQ_2.id_throws();
        rrwQ_2.id_case();
        rrwQ_2.id_catch();
    }

    private static void id_finally() {
        id_private = new String[]{new String("3b01930b-1b2c-2948-a912-07ff6e2346ee"), new String("2c4b7b7d-f822-2d7f-9ae9-929891fcac08")};
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{List.of((Object)UUID.fromString(id_private[0]), (Object)UUID.fromString(id_private[1]))};
        id_byte = objectArray;
    }

    private static void id_case() {
        id_catch = new byte[]{2};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_case = blArray;
    }

    private void id_protected() {
        this.id_private();
        ((Set)this.id_protected[id_throws[9]]).clear();
        Boolean bl = id_case[2];
        this.id_protected[rrwQ_2.id_throws[10]] = bl;
    }

    private void id_private() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_catch[0]];
            objectArray[rrwQ_2.id_case[4]] = id_case[5];
        }
    }
}

