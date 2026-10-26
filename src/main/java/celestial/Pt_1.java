/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PI;
import celestial.PP;
import celestial.Pf_1;
import celestial.Pv_1;
import celestial.Pw_1;
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

public class Pt_1
extends Pv_1
implements PP {
    private static long[] id_case;
    private static short[] id_catch;
    public static Object[] id_break;
    private static String[] id_private;
    private static byte[] id_implements;
    private static boolean[] id_finally;
    public Object[] id_throws;

    public long id_byte() {
        this.id_final();
        return (Long)this.id_throws[id_catch[18]];
    }

    public Pt_1(C_class c_class) {
        super(c_class);
        this.id_final();
    }

    static {
        Pt_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE9879E08;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9D3096E5D1B500L;
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_final();
        if (j_12.id_class() != (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_catch[0]]) || !this.id_catch()) {
            return;
        }
        this.id_class();
        try {
            PI object4;
            Object object2;
            rgP_2 rgP_22 = ((cq_3)Pt_1.b_.id_class[id_catch[1]]).id_implements().id_protected();
            if (rgP_22 != null && !rql_3.id_break((String)(object2 = rgP_22.id_byte())) && ((String)object2).contains(id_private[0]) && (object4 = this.id_break((String)object2)) != null) {
                PI pI = object4;
                this.id_throws[Pt_1.id_catch[2]] = pI;
            }
            for (String string : ((cq_3)Pt_1.b_.id_class[id_catch[3]]).id_new()) {
                Matcher matcher;
                if (string.contains(id_private[1])) {
                    matcher = ((Pattern)id_break[id_catch[4]]).matcher(string.replace(id_private[2], id_private[3]));
                    if (!matcher.find()) continue;
                    Long l = Long.parseLong(matcher.group(id_finally[0]));
                    this.id_throws[Pt_1.id_catch[5]] = l;
                    continue;
                }
                if (!string.contains(id_private[4]) || !(matcher = ((Pattern)id_break[id_catch[6]]).matcher(string.replace(id_private[5], id_private[6]))).find()) continue;
                Long l = Long.parseLong(matcher.group(id_finally[1]));
                this.id_throws[Pt_1.id_catch[7]] = l;
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

    public void id_class() {
        this.id_final();
        Object var5_1 = null;
        this.id_throws[Pt_1.id_catch[12]] = var5_1;
        Long l = id_case[0];
        this.id_throws[Pt_1.id_catch[13]] = l;
        Long l2 = id_case[1];
        this.id_throws[Pt_1.id_catch[14]] = l2;
    }

    public long id_break() {
        this.id_final();
        return (Long)this.id_throws[id_catch[19]];
    }

    public PI id_break(String string) {
        if (rql_3.id_break(string)) {
            return null;
        }
        for (Pf_1 pf_1 : ((EnumMap)id_break[id_catch[15]]).keySet()) {
            Matcher matcher = ((Pattern)((EnumMap)id_break[id_catch[16]]).get((Object)pf_1)).matcher(string);
            if (!matcher.find()) continue;
            String string2 = matcher.group(id_finally[4]);
            return new PI(pf_1, string2 != null ? string2 : id_private[7]);
        }
        return null;
    }

    private static void id_throws() {
        id_case = new long[4];
    }

    private static /* synthetic */ void ntfClinit() {
        Pt_1.id_implements();
        Pt_1.id_finally();
        Pt_1.id_throws();
        Pt_1.id_case();
        Pt_1.id_private();
        Pt_1.id_extends();
    }

    private static void id_finally() {
        id_private = new String[]{new String("\u0420\u0435\u0436\u0438\u043c:"), new String("\u041c\u043e\u043d\u0435\u0442"), new String(","), new String(""), new String("\u0422\u043e\u043a\u0435\u043d\u043e\u0432"), new String(","), new String(""), new String(""), new String("\\$ \u041c\u043e\u043d\u0435\u0442: (\\d+)"), new String("\u26c1 \u0422\u043e\u043a\u0435\u043d\u043e\u0432: (\\d+)")};
    }

    private boolean id_catch() {
        return (rrfq_3)((Object)rrfp_3.id_class[id_catch[8]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[9]]) || (rrfq_3)((Object)rrfp_3.id_class[id_catch[10]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[11]]) ? id_finally[2] : id_finally[3];
    }

    private static void id_extends() {
        Object[] objectArray = new Object[]{new Pw_1(Pf_1.class), Pattern.compile(id_private[8], 0), Pattern.compile(id_private[9])};
        id_break = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[20];
        sArray[1] = 19;
        sArray[3] = 19;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 4;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[18] = 1;
        sArray[19] = 2;
        id_catch = sArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_finally = blArray;
    }

    public PI id_protected() {
        this.id_final();
        return (PI)this.id_throws[id_catch[17]];
    }

    public static String id_private(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{85, 88, -54, -72, 51, -1, -43, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        id_implements = new byte[]{2, 3, 2, 3};
    }

    private void id_final() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_implements[1]];
            objectArray[Pt_1.id_finally[7]] = id_case[2];
            objectArray[Pt_1.id_implements[2]] = id_case[3];
        }
    }
}

