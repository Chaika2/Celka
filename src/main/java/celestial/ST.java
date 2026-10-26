/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_throws;
import celestial.Fc_1;
import celestial.Fu_1;
import celestial.SC;
import celestial.SF;
import celestial.SL;
import celestial.Sv_1;
import celestial.Y;
import celestial.cb_3;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rZd_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rme_3;
import celestial.rpm_3;
import celestial.rql_3;
import celestial.rqs_3;
import celestial.rrAM;
import celestial.rrAl_1;
import celestial.rrLO;
import celestial.rrfY_2;
import celestial.rrfw_3;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ST
extends Sv_1 {
    private static String[] id_protected;
    private static short[] id_throws;
    private static float[] id_case;
    public static Object[] id_break;
    private static long[] id_catch;
    private static double[] id_private;
    public Object[] id_byte;
    private static byte[] id_implements;
    private static boolean[] id_finally;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{34, -70, 112, 120, -20, -107, -89, -122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_private();
    }

    private boolean id_int() {
        String string = this.id_final();
        return string != null && string.contains(id_protected[4]) ? id_finally[13] : id_finally[14];
    }

    public ST(SL sL) {
        super(sL);
        this.id_volatile();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_byte[ST.id_throws[0]] = rrfw_32;
        rrfw_3 rrfw_33 = new rrfw_3();
        this.id_byte[ST.id_throws[1]] = rrfw_33;
    }

    static {
        ST.ntfClinit();
    }

    private static void id_this() {
        id_catch = new long[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2C414F1;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_volatile();
        super.id_class(rrAM2);
        this.id_case().id_class();
        ((rrfw_3)this.id_byte[id_throws[7]]).id_class();
    }

    private rdn_3 id_class(rqs_3<rdn_3> rqs_32) {
        for (rdn_3 rdn_32 : rqs_32) {
            String string = rdn_32.id_continue().id_byte().toLowerCase();
            if (!string.contains(id_protected[6])) continue;
            return rdn_32;
        }
        return null;
    }

    @Override
    public void id_class(rrLO rrLO2) {
        super.id_class(rrLO2);
        String string = rrLO2.id_protected();
        if (Arrays.stream((String[])id_break[id_throws[8]]).anyMatch(string2 -> string.toLowerCase().contains(string2.toLowerCase()))) {
            this.id_private();
        }
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_volatile();
        super.id_class(q_12);
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[2]])) {
            Object object;
            long l;
            SC sC = this.id_case().id_catch();
            if (sC == null) {
                return;
            }
            if (sC instanceof SF && (l = ((SF)(object = (SF)sC)).id_class()) > id_catch[0] && !((rrfw_3)this.id_byte[id_throws[3]]).id_class(l)) {
                return;
            }
            if (!this.id_implements()) {
                return;
            }
            Object object2 = (vm_3)ST.id_import.id_class[id_throws[4]];
            if (object2 instanceof Fc_1) {
                rdn_3 rdn_32;
                object = (Fc_1)object2;
                object2 = this.id_final();
                rqs_3<rdn_3> rqs_32 = ((rXe_1)((Fu_1)object).G_()).id_extends();
                rdn_3 rdn_33 = this.id_class(sC, rqs_32);
                if (object2 == null) {
                    return;
                }
                String string = sC.id_byte();
                if ((string.equalsIgnoreCase(id_protected[0]) || string.equalsIgnoreCase(id_protected[1])) && (rdn_32 = this.id_class(rqs_32)) != null) {
                    this.id_class(rqs_32.indexOf(rdn_32), id_finally[2]);
                    return;
                }
                if (((String)object2).contains(id_protected[2]) && (rdn_32 = this.id_break(rqs_32)) != null) {
                    this.id_class(rqs_32.indexOf(rdn_32), id_finally[3]);
                    return;
                }
                if (rdn_33 != null) {
                    this.id_class(rqs_32.indexOf(rdn_33), id_finally[4]);
                } else if (((String)object2).contains(id_protected[3])) {
                    this.id_private();
                }
            }
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x74319BC3C826276EL;
    }

    @Override
    public void id_class(rrAl_1 rrAl_12) {
        this.id_volatile();
        super.id_class(rrAl_12);
        if (rrAl_12.id_class() > id_case[0] && ((Boolean)this.id_byte[id_throws[5]]).booleanValue()) {
            this.id_private();
            Boolean bl = id_finally[5];
            this.id_byte[ST.id_throws[6]] = bl;
        }
    }

    private rdn_3 id_class(SC sC, List<rdn_3> list) {
        try {
            int n = Integer.parseInt(sC.id_byte());
            for (rdn_3 rdn_32 : list) {
                if (rdn_32.id_class() || !rdn_32.id_continue().id_byte().contains("#" + n)) continue;
                return rdn_32;
            }
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return null;
    }

    private void id_class(int n, boolean bl) {
        this.id_volatile();
        if (((rrfw_3)this.id_byte[id_throws[24]]).id_class(id_private[0])) {
            ((Ax_1)ST.id_import.id_class[id_throws[25]]).id_class(((rJr_1)((cb_3)ST.id_import.id_class[ST.id_throws[26]]).id_implements[ST.id_throws[27]]).id_case, n, id_finally[11], rXa_1.PICKUP);
            if (bl) {
                Boolean bl2 = id_finally[12];
                this.id_byte[ST.id_throws[28]] = bl2;
            }
            ((rrfw_3)this.id_byte[id_throws[29]]).id_class();
        }
    }

    @Override
    public boolean id_break(String string) {
        return !rql_3.id_break(string) ? id_finally[0] : id_finally[1];
    }

    private rdn_3 id_break(rqs_3<rdn_3> rqs_32) {
        for (rdn_3 rdn_32 : rqs_32) {
            String string = rdn_32.id_continue().id_byte().toLowerCase();
            if (!string.contains(id_protected[5])) continue;
            return rdn_32;
        }
        return null;
    }

    @Override
    public String id_throws() {
        return C_throws.id_byte().id_final().id_throws();
    }

    private static /* synthetic */ void ntfClinit() {
        ST.id_super();
        ST.id_native();
        ST.id_this();
        ST.id_continue();
        ST.id_finally();
        ST.id_extends();
        ST.id_new();
        ST.id_package();
    }

    private static void id_finally() {
        id_case = new float[]{10.0f};
    }

    private static void id_extends() {
        id_private = new double[]{200.0};
    }

    private static void id_continue() {
        short[] sArray = new short[33];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 73;
        sArray[5] = 2;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[9] = 2;
        sArray[10] = 73;
        sArray[11] = 73;
        sArray[12] = 2;
        sArray[13] = 57;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 57;
        sArray[17] = 41;
        sArray[18] = 57;
        sArray[20] = 57;
        sArray[21] = 1;
        sArray[22] = 57;
        sArray[25] = 55;
        sArray[26] = 57;
        sArray[27] = 4;
        sArray[28] = 2;
        sArray[30] = 73;
        sArray[32] = 2;
        id_throws = sArray;
    }

    private boolean id_implements() {
        int n;
        this.id_volatile();
        if (this.id_int()) {
            Boolean bl = id_finally[6];
            this.id_byte[ST.id_throws[9]] = bl;
            return id_finally[7];
        }
        if ((vm_3)ST.id_import.id_class[id_throws[10]] != null && ((vm_3)ST.id_import.id_class[id_throws[11]]).id_throw() > id_implements[0]) {
            Boolean bl = id_finally[8];
            this.id_byte[ST.id_throws[12]] = bl;
        }
        if ((n = rrfY_2.id_break(rdy_3.Xx)) == id_implements[1]) {
            return id_finally[9];
        }
        if (n >= 0) {
            ((rhz_3)((cb_3)ST.id_import.id_class[ST.id_throws[13]]).id_implements[ST.id_throws[14]]).id_protected = n;
        } else if (!((Boolean)this.id_byte[id_throws[15]]).booleanValue() && (Integer)((cb_3)ST.id_import.id_class[ST.id_throws[16]]).id_throws[id_throws[17]] % id_implements[2] == 0) {
            ((Aq_1)((cb_3)ST.id_import.id_class[ST.id_throws[18]]).id_break[id_throws[19]]).id_break(new rme_3(((rhz_3)((cb_3)ST.id_import.id_class[ST.id_throws[20]]).id_implements[ST.id_throws[21]]).id_protected));
            ((Aq_1)((cb_3)ST.id_import.id_class[ST.id_throws[22]]).id_break[id_throws[23]]).id_break(new rZd_1(n == id_implements[3] ? rpm_3.MAIN_HAND : rpm_3.OFF_HAND));
        }
        return id_finally[10];
    }

    private static void id_new() {
        id_implements = new byte[]{2, -1, 5, -2, 3, 2, 3, 2};
    }

    private static void id_package() {
        Object[] objectArray = new Object[1];
        String[] stringArray = new String[]{id_protected[7], id_protected[8], id_protected[9]};
        objectArray[0] = stringArray;
        id_break = objectArray;
    }

    private static void id_super() {
        boolean[] blArray = new boolean[21];
        blArray[0] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[17] = true;
        blArray[20] = true;
        id_finally = blArray;
    }

    private void id_private() {
        this.id_volatile();
        ((rrfw_3)this.id_byte[id_throws[31]]).id_class();
        Boolean bl = id_finally[15];
        this.id_byte[ST.id_throws[32]] = bl;
    }

    private String id_final() {
        String string;
        vm_3 vm_32 = (vm_3)ST.id_import.id_class[id_throws[30]];
        if (vm_32 instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)vm_32;
            string = fc_1.id_new().id_byte().toLowerCase();
        } else {
            string = null;
        }
        return string;
    }

    private void id_volatile() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_implements[6]];
            objectArray[ST.id_implements[7]] = id_finally[19];
        }
    }

    private static void id_native() {
        id_protected = new String[]{new String("mega"), new String("\u043c\u0435\u0433\u0430"), new String("\u0432\u044b\u0431\u043e\u0440 \u0441\u0435\u0440\u0432\u0435\u0440\u0430"), new String("\u0432\u044b\u0431\u043e\u0440 \u043c\u0438\u0440\u0430 \u0433\u0440\u0438\u0444\u0430"), new String("\u0432\u044b\u0431\u043e\u0440"), new String("\u0433\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u043e\u0435 \u0432\u044b\u0436\u0438\u0432\u0430\u043d\u0438\u0435"), new String("\u043c\u0435\u0433\u0430 \u0433\u0440\u0438\u0444"), new String("\u041a \u0441\u043e\u0436\u0430\u043b\u0435\u043d\u0438\u044e \u0441\u0435\u0440\u0432\u0435\u0440 \u043f\u0435\u0440\u0435\u043f\u043e\u043b\u043d\u0435\u043d."), new String("\u041d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440 \u0437\u0430\u0445\u043e\u0434\u0438\u0442 \u0431\u043e\u043b\u044c\u0448\u043e\u0439 \u043f\u043e\u0442\u043e\u043a \u0438\u0433\u0440\u043e\u043a\u043e\u0432."), new String("\u0412\u044b \u0443\u0436\u0435 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0430\u0435\u0442\u0435\u0441\u044c \u043a \u0441\u0435\u0440\u0432\u0435\u0440\u0443!")};
    }
}

