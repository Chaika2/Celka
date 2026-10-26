/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PP;
import celestial.Pv_1;
import celestial.Y;
import celestial.cq_3;
import celestial.gm_3;
import celestial.q_1;
import celestial.rnP_2;
import celestial.rrFK;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BX
extends Pv_1
implements PP {
    private static String[] id_case;
    private static short[] id_catch;
    private static boolean[] id_private;
    private static byte[] id_implements;
    public Object[] id_break;
    public static Object[] id_throws;

    public void id_byte() {
        this.id_private();
        String string = id_case[13];
        this.id_break[BX.id_catch[20]] = string;
        String string2 = id_case[14];
        this.id_break[BX.id_catch[21]] = string2;
        String string3 = id_case[15];
        this.id_break[BX.id_catch[22]] = string3;
        String string4 = id_case[16];
        this.id_break[BX.id_catch[23]] = string4;
    }

    public BX(C_class c_class) {
        super(c_class);
        this.id_private();
        String string = id_case[0];
        this.id_break[BX.id_catch[0]] = string;
        String string2 = id_case[1];
        this.id_break[BX.id_catch[1]] = string2;
        String string3 = id_case[2];
        this.id_break[BX.id_catch[2]] = string3;
        String string4 = id_case[3];
        this.id_break[BX.id_catch[3]] = string4;
    }

    static {
        BX.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x70CA5B8BA202AFBAL;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_private();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[4]])) {
            if ((rrfq_3)((Object)rrfp_3.id_class[id_catch[5]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[6]])) {
                return;
            }
            this.id_byte();
            try {
                String string;
                for (rnP_2 object : ((gm_3)BX.b_.id_class[id_catch[7]]).id_package().id_class()) {
                    string = object.id_protected().id_byte().trim().toLowerCase();
                    if (string.equals(id_case[4])) {
                        String string2 = id_case[5];
                        this.id_break[BX.id_catch[8]] = string2;
                        continue;
                    }
                    if (!((Pattern)id_throws[id_catch[9]]).matcher(string).find()) continue;
                    String string3 = string.substring(string.indexOf(id_case[6]) + id_private[0]).trim();
                    this.id_break[BX.id_catch[10]] = string3;
                }
                for (String string4 : ((cq_3)BX.b_.id_class[id_catch[11]]).id_new()) {
                    string = string4.toLowerCase();
                    if (((Pattern)id_throws[id_catch[12]]).matcher(string).find()) {
                        String string5 = string4.replaceAll(id_case[7], id_case[8]).trim();
                        this.id_break[BX.id_catch[13]] = string5;
                        continue;
                    }
                    if (((Pattern)id_throws[id_catch[14]]).matcher(string).find()) {
                        String string6 = string4.replaceAll(id_case[9], id_case[10]).trim();
                        this.id_break[BX.id_catch[15]] = string6;
                        continue;
                    }
                    if (((Pattern)id_throws[id_catch[16]]).matcher(string).find()) {
                        String string7 = string4.substring(string4.indexOf(id_case[11]) + id_private[1]).trim();
                        this.id_break[BX.id_catch[17]] = string7;
                        continue;
                    }
                    if (!((Pattern)id_throws[id_catch[18]]).matcher(string).find()) continue;
                    String string8 = string4.substring(string4.indexOf(id_case[12]) + id_private[2]).trim();
                    this.id_break[BX.id_catch[19]] = string8;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public String id_class() {
        this.id_private();
        return (String)this.id_break[id_catch[25]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1B754BD3;
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_byte();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-97, -9, 102, -12, 23, 69, 44, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_break() {
        this.id_private();
        return (String)this.id_break[id_catch[27]];
    }

    public String id_throws() {
        this.id_private();
        return (String)this.id_break[id_catch[24]];
    }

    private static /* synthetic */ void ntfClinit() {
        BX.id_implements();
        BX.id_finally();
        BX.id_case();
        BX.id_catch();
        BX.id_extends();
    }

    private static void id_finally() {
        id_case = new String[]{new String(""), new String(""), new String(""), new String(""), new String("\u0433\u0440\u0438\u0444 #mega"), new String("mega"), new String("#"), new String("[^0-9]"), new String(""), new String("[^0-9]"), new String(""), new String("-"), new String(":"), new String(""), new String(""), new String(""), new String(""), new String("\u0433\u0440\u0438\u0444 #\\d+"), new String("\u0441\u0435\u0440\u0432\u0435\u0440: \\W+"), new String("\u0431\u0430\u043b\u0430\u043d\u0441: \\$\\d+"), new String("\u0440\u0438\u043b\u043b\u0438\u043a\u043e\u0432: \\d+"), new String("\u043a\u043b\u0430\u043d: .+")};
    }

    private static void id_catch() {
        id_implements = new byte[]{2, 3, 4, 4, 5};
    }

    private static void id_extends() {
        Object[] objectArray = new Object[]{Pattern.compile(id_case[17], 0), Pattern.compile(id_case[18]), Pattern.compile(id_case[19]), Pattern.compile(id_case[20]), Pattern.compile(id_case[21])};
        id_throws = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[28];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[7] = 56;
        sArray[11] = 19;
        sArray[12] = 2;
        sArray[13] = 1;
        sArray[14] = 3;
        sArray[15] = 2;
        sArray[16] = 1;
        sArray[18] = 4;
        sArray[19] = 3;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 3;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 3;
        id_catch = sArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_private = blArray;
    }

    public String id_protected() {
        this.id_private();
        return (String)this.id_break[id_catch[26]];
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_implements[3]];
        }
    }
}

