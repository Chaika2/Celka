/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PP;
import celestial.Pv_1;
import celestial.rdn_3;
import celestial.rrAM;
import celestial.rrLh_1;
import celestial.rrNW;
import celestial.rrNh_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pj_1
extends Pv_1
implements PP {
    private static String[] id_case;
    private static long[] id_catch;
    private static boolean[] id_private;
    public static Object[] id_break;
    private static short[] id_implements;
    private static byte[] id_finally;
    public Object[] id_throws;

    public rdn_3 id_byte(List<rdn_3> list) {
        for (rdn_3 rdn_32 : list) {
            String string = rdn_32.id_continue().id_byte();
            if (!string.equals(id_case[3])) continue;
            return rdn_32;
        }
        return null;
    }

    public boolean id_byte() {
        this.id_private();
        if ((Long)this.id_throws[id_implements[5]] == id_catch[6]) {
            return id_private[5];
        }
        return System.currentTimeMillis() - (Long)this.id_throws[id_implements[6]] > (Long)this.id_throws[id_implements[7]] ? id_private[6] : id_private[7];
    }

    public Pj_1(C_class c_class) {
        super(c_class);
        this.id_private();
        Long l = id_catch[0];
        this.id_throws[Pj_1.id_implements[0]] = l;
        Long l2 = id_catch[1];
        this.id_throws[Pj_1.id_implements[1]] = l2;
    }

    static {
        Pj_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC4CBD8B8;
    }

    @Override
    public void id_class(rrLh_1 rrLh_12) {
        if (rrLh_12.id_protected() != null) {
            return;
        }
        String string = rrLh_12.id_class();
        Matcher matcher = ((Pattern)id_break[id_implements[2]]).matcher(string);
        rrNW rrNW2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_implements[3]])).id_throws();
        boolean bl = id_private[0];
        if (matcher.find()) {
            try {
                String string2 = matcher.group(id_private[1]);
                long l = Long.parseLong(string2) * id_catch[2] + id_catch[3];
                this.id_class(l);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            bl = id_private[2];
        } else if (string.contains(id_case[0])) {
            this.id_class(id_catch[4]);
            bl = id_private[3];
        }
        if (bl) {
            rrNW2.id_protected(id_private[4]);
        }
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_private();
        super.id_class(rrAM2);
        Long l = id_catch[5];
        this.id_throws[Pj_1.id_implements[4]] = l;
    }

    public rdn_3 id_class(List<rdn_3> list) {
        for (rdn_3 rdn_32 : list) {
            String string = rdn_32.id_continue().id_byte();
            if (!string.equals(id_case[1])) continue;
            return rdn_32;
        }
        return null;
    }

    public long id_class() {
        this.id_private();
        return (Long)this.id_throws[id_implements[10]];
    }

    public void id_class(long l) {
        this.id_private();
        Long l2 = l;
        this.id_throws[Pj_1.id_implements[8]] = l2;
        Long l3 = System.currentTimeMillis();
        this.id_throws[Pj_1.id_implements[9]] = l3;
    }

    public long id_break() {
        this.id_private();
        return (Long)this.id_throws[id_implements[11]];
    }

    public rdn_3 id_break(List<rdn_3> list) {
        for (rdn_3 rdn_32 : list) {
            String string = rdn_32.id_continue().id_byte();
            if (!string.equals(id_case[2])) continue;
            return rdn_32;
        }
        return null;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-55, 82, -77, -58, -99, -70, 106, -107}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x47D0C8E18CD2008AL;
    }

    private static void id_throws() {
        id_finally = new byte[]{2, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        Pj_1.id_implements();
        Pj_1.id_case();
        Pj_1.id_catch();
        Pj_1.id_protected();
        Pj_1.id_throws();
        Pj_1.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{Pattern.compile(id_case[4], 0), Pattern.compile(id_case[5]), id_case[6]};
        id_break = objectArray;
    }

    private static void id_catch() {
        long[] lArray = new long[9];
        lArray[0] = 61000L;
        lArray[1] = -1L;
        lArray[2] = 1000L;
        lArray[3] = 1000L;
        lArray[4] = 61000L;
        lArray[5] = -1L;
        lArray[6] = -1L;
        id_catch = lArray;
    }

    private static void id_case() {
        id_case = new String[]{new String("\u041f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043f\u0435\u0440\u0435\u0432\u044b\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u044b"), new String("[\u2603] \u0425\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435"), new String("[\u27f2] \u041f\u0435\u0440\u0435\u0432\u044b\u0441\u0442\u0430\u0432\u0438\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"), new String("[\u27f2] \u0412\u0435\u0440\u043d\u0443\u0442\u044c\u0441\u044f"), new String("\u0425\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435"), new String("\u0412\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u043f\u0435\u0440\u0435\u0441\u0442\u0430\u0432\u043b\u044f\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0440\u0430\u0437 \u0432 \u043c\u0438\u043d\u0443\u0442\u0443! \u041f\u043e\u0434\u043e\u0436\u0434\u0438\u0442\u0435 (\\d+) \u0441\u0435\u043a."), new String("\u041f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043f\u0435\u0440\u0435\u0432\u044b\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u044b")};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        id_private = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[9] = 1;
        sArray[11] = 1;
        id_implements = sArray;
    }

    private void id_private() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_finally[0]];
            objectArray[Pj_1.id_private[10]] = id_catch[7];
            objectArray[Pj_1.id_private[11]] = id_catch[8];
        }
    }
}

