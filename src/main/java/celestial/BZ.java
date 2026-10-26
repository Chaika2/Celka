/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PI;
import celestial.Pv_1;
import celestial.Y;
import celestial.q_1;
import celestial.rrFK;
import celestial.rrLh_1;
import celestial.rrQJ;
import celestial.rrZr_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrvu_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BZ
extends Pv_1 {
    private static byte[] id_protected;
    public static Object[] id_break;
    private static short[] id_throws;
    private static String[] id_case;
    public Object[] id_byte;
    private static boolean[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[2] = 4;
        sArray[6] = 1;
        sArray[7] = 4;
        sArray[11] = 5;
        id_throws = sArray;
    }

    public BZ(C_class c_class) {
        super(c_class);
        this.id_protected();
    }

    static {
        BZ.ntfClinit();
    }

    private static void id_class() {
        id_protected = new byte[]{2, 3, 4, 5};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9591CDC588DF8199L;
    }

    @Override
    public void id_class(rrLh_1 rrLh_12) {
        Matcher matcher;
        this.id_protected();
        if (rrLh_12.id_protected() != null || (rrfq_3)((Object)rrfp_3.id_class[id_throws[6]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[7]])) {
            return;
        }
        if (((Boolean)this.id_byte[id_throws[8]]).booleanValue() && (matcher = ((Pattern)id_break[id_throws[9]]).matcher(rrLh_12.id_class())).find()) {
            String string = matcher.group(id_catch[4]);
            String string2 = matcher.group(id_protected[0]);
            String string3 = matcher.group(id_protected[1]);
            String string4 = matcher.group(id_protected[2]);
            String string5 = matcher.group(id_protected[3]);
            ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[id_throws[10]]).id_class((rrZr_1)rrQJ.id_class[id_throws[11]], string4, string5, string3, string2, string);
            MinecraftAccessor.a_("\u0412\u044b \u0431\u044b\u043b\u0438 \u0437\u0430\u0431\u0430\u043d\u0435\u043d\u044b \u0437\u0430 " + string4, id_catch[5]);
            Boolean bl = id_catch[6];
            this.id_byte[BZ.id_throws[12]] = bl;
        }
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_protected();
        super.id_class(rrFK2);
        Boolean bl = id_catch[7];
        this.id_byte[BZ.id_throws[13]] = bl;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_protected();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[0]])) {
            if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[1]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[2]])) {
                return;
            }
            PI pI = ((C_class)this.id_class[id_throws[3]]).id_native().id_protected();
            boolean bl = pI != null && pI.id_class().id_break() ? id_catch[0] : id_catch[1];
            boolean bl2 = ((C_class)this.id_class[id_throws[4]]).id_synchronized().id_class();
            Boolean bl3 = bl || bl2 ? id_catch[2] : id_catch[3];
            this.id_byte[BZ.id_throws[5]] = bl3;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1EFDC891;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[9] = true;
        blArray[12] = true;
        id_catch = blArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, -47, 14, -121, 37, 14, -125, -37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{Pattern.compile(id_case[0])};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        BZ.id_break();
        BZ.id_case();
        BZ.id_byte();
        BZ.id_class();
        BZ.id_throws();
    }

    private static void id_case() {
        id_case = new String[]{new String("\u0412\u044b \u0431\u044b\u043b\u0438 \u043a\u0438\u043a\u043d\u0443\u0442\u044b \u0441 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 (.*?):[\\s\\S]*?\u0411\u0430\u043d \u0432\u044b\u0434\u0430\u043d: (.*)\\s+\u0411\u0430\u043d \u043e\u0442: (.*)\\s+\u0412\u0430\u0448 \u043d\u0438\u043a: .*\\s+\u041f\u043e \u043f\u0440\u0438\u0447\u0438\u043d\u0435: ([\\s\\S]*?)\\s+\u0420\u0430\u0437\u0431\u0430\u043d \u0447\u0435\u0440\u0435\u0437: (.*)")};
    }

    private void id_protected() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_catch[9]];
            objectArray[BZ.id_catch[10]] = id_catch[11];
        }
    }
}

