/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PK;
import celestial.PP;
import celestial.PR;
import celestial.PY;
import celestial.Po_1;
import celestial.Pv_1;
import celestial.V;
import celestial.cq_3;
import celestial.j_1;
import celestial.rgP_2;
import celestial.rql_3;
import celestial.rrFK;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pg_1
extends Pv_1
implements PP {
    private static byte[] id_case;
    private static boolean[] id_catch;
    public Object[] id_break;
    public static Object[] id_throws;
    private static short[] id_private;
    private static String[] id_implements;

    private static void id_byte() {
        id_implements = new String[]{new String("")};
    }

    public Pg_1(C_class c_class) {
        super(c_class);
        this.id_throws();
    }

    static {
        Pg_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3052BFB7;
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_throws();
        if (j_12.id_class() != (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_private[0]]) || (rrfq_3)((Object)rrfp_3.id_class[id_private[1]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_private[2]])) {
            return;
        }
        this.id_class();
        try {
            Po_1 po_1;
            String string;
            rgP_2 rgP_22 = ((cq_3)Pg_1.b_.id_class[id_private[3]]).id_implements().id_protected();
            if (rgP_22 != null && !rql_3.id_break(string = rgP_22.id_byte()) && (po_1 = Pg_1.id_private(string)) != null) {
                Po_1 po_12 = po_1;
                this.id_break[Pg_1.id_private[4]] = po_12;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4F0E74B9C46A5266L;
    }

    public void id_class() {
        this.id_throws();
        Object var5_1 = null;
        this.id_break[Pg_1.id_private[5]] = var5_1;
    }

    public Po_1 id_break() {
        this.id_throws();
        return (Po_1)this.id_break[id_private[8]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{112, -85, 12, -71, 84, 84, -84, 115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[3]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Pg_1.id_case();
        Pg_1.id_byte();
        Pg_1.id_protected();
        Pg_1.id_catch();
        Pg_1.id_private();
    }

    private static void id_catch() {
        id_case = new byte[]{2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_catch = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[2] = 6;
        sArray[3] = 19;
        id_private = sArray;
    }

    public static Po_1 id_private(String string) {
        if (rql_3.id_break(string)) {
            return null;
        }
        for (PK pK : ((EnumMap)id_throws[id_private[6]]).keySet()) {
            Matcher matcher = ((Pattern)((EnumMap)id_throws[id_private[7]]).get((Object)pK)).matcher(string);
            if (!matcher.find()) continue;
            String string2 = matcher.group(id_catch[0]);
            return new Po_1(pK, string2 != null ? string2 : id_implements[0]);
        }
        return null;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new PR(PK.class), new PY()};
        id_throws = objectArray;
    }
}

