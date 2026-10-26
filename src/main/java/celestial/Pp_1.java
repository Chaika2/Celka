/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.cq_3;
import celestial.rVa_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rqy_3;
import celestial.rrAM;
import celestial.rrFK;
import celestial.rrLO;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pp_1
extends Pv_1 {
    private static String[] id_byte;
    private static short[] id_protected;
    private static long[] id_throws;
    public Object[] id_break;
    private static boolean[] id_case;
    private static byte[] id_catch;

    private static void id_byte() {
        id_catch = new byte[]{3, 2};
    }

    public Pp_1(C_class c_class) {
        super(c_class);
        this.id_catch();
        Long l = id_throws[0];
        this.id_break[Pp_1.id_protected[0]] = l;
    }

    static {
        Pp_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x57CC4582678F9D91L;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_protected();
    }

    @Override
    public void id_class(rrLO rrLO2) {
        this.id_catch();
        if (rrLO2.id_class() != null || (rrfq_3)((Object)rrfp_3.id_class[id_protected[1]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[2]]) && (rrfq_3)((Object)rrfp_3.id_class[id_protected[3]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[4]])) {
            return;
        }
        String string = rrLO2.id_protected().toLowerCase();
        if (string.contains(id_byte[0])) {
            Long l = rqR_2.id_break();
            this.id_break[Pp_1.id_protected[5]] = l;
        } else if (string.contains(id_byte[1])) {
            this.id_case();
            this.id_protected();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x811138AF;
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[8] = 1;
        sArray[9] = 19;
        id_protected = sArray;
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_protected();
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[2] = true;
        id_case = blArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, -65, 97, 85, 63, 76, 49, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new String[]{new String("[\u2694] \u0434\u0443\u044d\u043b\u044c \u043d\u0430\u0447\u0430\u043b\u0430\u0441\u044c"), new String("[\u2694] \u0434\u0443\u044d\u043b\u044c \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u0430"), new String("[\u2694]"), new String("#FF6600")};
    }

    private static /* synthetic */ void ntfClinit() {
        Pp_1.id_break();
        Pp_1.id_throws();
        Pp_1.id_private();
        Pp_1.id_class();
        Pp_1.id_byte();
    }

    private void id_catch() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[2]];
            objectArray[Pp_1.id_case[3]] = id_throws[4];
        }
    }

    private void id_case() {
        this.id_catch();
        if ((Long)this.id_break[id_protected[6]] != id_throws[1]) {
            long l = Math.max(id_throws[2], rqR_2.id_break() - (Long)this.id_break[id_protected[7]]);
            rqy_3[] rqy_3Array = new rqy_3[id_catch[0]];
            rqy_3Array[Pp_1.id_case[0]] = rqy_3.HOURS;
            rqy_3Array[Pp_1.id_case[1]] = rqy_3.MINUTES;
            rqy_3Array[Pp_1.id_catch[1]] = rqy_3.SECONDS;
            String string = rql_3.id_class(Duration.ofMillis(l), rqy_3Array);
            rVi_1 rVi_12 = rrfu_3.id_class().id_class(id_byte[2]).id_class(rVa_1.id_class(id_byte[3])).id_break().id_class(new rgN_2(" \u0414\u0443\u044d\u043b\u044c \u0434\u043b\u0438\u043b\u0430\u0441\u044c " + rgF_2.YELLOW + string));
            ((cq_3)((Ps_1)this.id_class[Pp_1.id_protected[8]]).id_throws().id_class[id_protected[9]]).id_throws().id_break(rVi_12);
        }
    }

    private void id_protected() {
        this.id_catch();
        Long l = id_throws[3];
        this.id_break[Pp_1.id_protected[10]] = l;
    }

    private static void id_private() {
        long[] lArray = new long[5];
        lArray[0] = -1L;
        lArray[1] = -1L;
        lArray[3] = -1L;
        id_throws = lArray;
    }
}

