/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.LC;
import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgn_3;
import celestial.rrQX;
import celestial.rrvL;
import celestial.rrwJ_2;
import celestial.rrwN_2;
import celestial.rrwZ_2;
import celestial.rrwu_3;
import celestial.vG_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.StringUtils;

public class rrwv_3
extends vm_3 {
    private static int[] id_case;
    public static Object[] id_class;
    private static boolean[] id_catch;
    private static String[] id_private;
    private static short[] id_implements;
    public Object[] id_throws;
    private static byte[] id_finally;

    private static void id_char() {
        id_private = new String[]{new String(""), new String(":"), new String("ui.proxyserver.options.invalidIpPort"), new String(""), new String(""), new String("ui.proxyserver.options.proxyType"), new String("ui.proxyserver.options.auth"), new String("ui.proxyserver.options.ipPort"), new String("ui.proxyserver.auth.id"), new String("ui.proxyserver.auth.username"), new String("ui.proxyserver.auth.password"), new String("SOCKS4"), new String("Socks 4"), new String("Socks 5"), new String("ui.proxyserver.options.apply"), new String("ui.proxyserver.options.test"), new String("ui.proxyserver.options.proxyEnabled"), new String("ui.proxyserver.options.proxyEnabled"), new String("ui.proxyserver.options.cancel"), new String(""), new String("none"), new String("ui.proxyserver.err.specProxy"), new String("mc.funtime.su"), new String("Socks 4"), new String("Socks 5"), new String("ui.proxyserver.options.proxy")};
    }

    private void id_byte(int n, int n2, int n3) {
        this.id_finally();
        Integer n4 = this.id_package / id_finally[0] - n2 / id_finally[1];
        this.id_throws[rrwv_3.id_implements[8]] = n4;
        int[] nArray = new int[n];
        this.id_throws[rrwv_3.id_implements[9]] = nArray;
        int n5 = (this.id_int + n * n3) / id_finally[2];
        int n6 = n5 - n * n3;
        for (int i = id_catch[12]; i != n; ++i) {
            ((int[])this.id_throws[rrwv_3.id_implements[10]])[i] = n6 + n3 * i;
        }
    }

    private static boolean id_byte(String string) {
        String[] stringArray = string.split(id_private[1]);
        if (stringArray.length > id_catch[1]) {
            if (!StringUtils.isNumeric((CharSequence)stringArray[id_catch[2]])) {
                return id_catch[3];
            }
            try {
                int n = Integer.parseInt(stringArray[id_catch[4]]);
                return n >= 0 && n <= id_case[0] ? id_catch[5] : id_catch[6];
            }
            catch (NumberFormatException numberFormatException) {
                return id_catch[7];
            }
        }
        return id_catch[8];
    }

    private static void id_int() {
        short[] sArray = new short[105];
        sArray[2] = 6;
        sArray[3] = 9;
        sArray[4] = 5;
        sArray[5] = 1;
        sArray[6] = 6;
        sArray[7] = 1;
        sArray[8] = 8;
        sArray[9] = 7;
        sArray[10] = 7;
        sArray[11] = 6;
        sArray[12] = 9;
        sArray[14] = 4;
        sArray[15] = 1;
        sArray[16] = 4;
        sArray[17] = 150;
        sArray[18] = 7;
        sArray[19] = 7;
        sArray[20] = 150;
        sArray[21] = 7;
        sArray[22] = 1;
        sArray[24] = 150;
        sArray[25] = 7;
        sArray[26] = 2;
        sArray[27] = 150;
        sArray[28] = 7;
        sArray[29] = 150;
        sArray[30] = 7;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[33] = 6;
        sArray[34] = 6;
        sArray[35] = 9;
        sArray[37] = 7;
        sArray[38] = 9;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 3;
        sArray[42] = 23;
        sArray[43] = 160;
        sArray[44] = 1;
        sArray[46] = 8;
        sArray[47] = 7;
        sArray[49] = 8;
        sArray[50] = 7;
        sArray[51] = 1;
        sArray[52] = 1;
        sArray[53] = 1024;
        sArray[54] = 1;
        sArray[55] = 1;
        sArray[56] = 1;
        sArray[57] = 8;
        sArray[58] = 7;
        sArray[59] = 2;
        sArray[60] = 2;
        sArray[61] = 255;
        sArray[62] = 2;
        sArray[63] = 1;
        sArray[64] = 2;
        sArray[65] = 8;
        sArray[66] = 7;
        sArray[67] = 3;
        sArray[68] = 3;
        sArray[69] = 255;
        sArray[70] = 3;
        sArray[71] = 1;
        sArray[72] = 3;
        sArray[73] = 7;
        sArray[74] = 7;
        sArray[75] = 7;
        sArray[77] = 4;
        sArray[78] = 4;
        sArray[79] = 7;
        sArray[80] = 6;
        sArray[81] = 23;
        sArray[82] = 5;
        sArray[83] = 1;
        sArray[84] = 1;
        sArray[85] = 6;
        sArray[86] = 9;
        sArray[87] = 9;
        sArray[88] = 25565;
        sArray[90] = 1;
        sArray[91] = 2;
        sArray[92] = 3;
        sArray[94] = 1;
        sArray[95] = 2;
        sArray[96] = 3;
        sArray[97] = 1;
        sArray[98] = 4;
        sArray[100] = 1;
        id_implements = sArray;
    }

    public rrwv_3(vm_3 vm_32) {
        super(new rgN_2((String)id_class[id_implements[0]]));
        this.id_finally();
        Boolean bl = id_catch[0];
        this.id_throws[rrwv_3.id_implements[1]] = bl;
        String string = id_private[0];
        this.id_throws[rrwv_3.id_implements[2]] = string;
        rrwJ_2 rrwJ_22 = new rrwJ_2();
        this.id_throws[rrwv_3.id_implements[3]] = rrwJ_22;
        vm_3 vm_33 = vm_32;
        this.id_throws[rrwv_3.id_implements[4]] = vm_33;
    }

    static {
        rrwv_3.ntfClinit();
    }

    private boolean id_interface() {
        this.id_finally();
        if (!rrwv_3.id_byte(((Lu_1)this.id_throws[id_implements[5]]).id_private())) {
            String string = rgF_2.RED + new rgn_3(id_private[2]).getString();
            this.id_throws[rrwv_3.id_implements[6]] = string;
            ((Lu_1)this.id_throws[id_implements[7]]).id_byte(id_catch[9]);
            return id_catch[10];
        }
        return id_catch[11];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, -95, 81, -99, 44, 58, 4, -5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_finally();
        this.id_class(ml_1);
        if (((LC)this.id_throws[id_implements[14]]).id_private() && !rrwv_3.id_byte(((Lu_1)this.id_throws[id_implements[15]]).id_private())) {
            ((LC)this.id_throws[id_implements[16]]).id_catch();
        }
        rrwv_3.id_break(ml_1, this.id_super, new rgn_3(id_private[5]).getString(), this.id_package / id_finally[3] - id_implements[17], ((int[])this.id_throws[id_implements[18]])[id_catch[14]] + id_finally[4], id_case[1]);
        rrwv_3.id_class(ml_1, this.id_super, new rgn_3(id_private[6]).getString(), this.id_package / id_finally[5], ((int[])this.id_throws[id_implements[19]])[id_finally[6]] + id_finally[7], (int)rgF_2.WHITE.id_protected());
        rrwv_3.id_break(ml_1, this.id_super, new rgn_3(id_private[7]).getString(), this.id_package / id_finally[8] - id_implements[20], ((int[])this.id_throws[id_implements[21]])[id_finally[9]] + id_finally[10], id_case[2]);
        ((Lu_1)this.id_throws[id_implements[22]]).id_class(ml_1, n, n2, f);
        if (((Boolean)this.id_throws[id_implements[23]]).booleanValue()) {
            rrwv_3.id_break(ml_1, this.id_super, new rgn_3(id_private[8]).getString(), this.id_package / id_finally[11] - id_implements[24], ((int[])this.id_throws[id_implements[25]])[id_finally[12]] + id_finally[13], id_case[3]);
            ((Lu_1)this.id_throws[id_implements[26]]).id_class(ml_1, n, n2, f);
        } else {
            rrwv_3.id_break(ml_1, this.id_super, new rgn_3(id_private[9]).getString(), this.id_package / id_finally[14] - id_implements[27], ((int[])this.id_throws[id_implements[28]])[id_finally[15]] + id_finally[16], id_case[4]);
            rrwv_3.id_break(ml_1, this.id_super, new rgn_3(id_private[10]).getString(), this.id_package / id_finally[17] - id_implements[29], ((int[])this.id_throws[id_implements[30]])[id_finally[18]] + id_finally[19], id_case[5]);
            ((Lu_1)this.id_throws[id_implements[31]]).id_class(ml_1, n, n2, f);
            ((Lu_1)this.id_throws[id_implements[32]]).id_class(ml_1, n, n2, f);
        }
        rrwv_3.id_class(ml_1, this.id_super, !((String)this.id_throws[id_implements[33]]).isEmpty() ? (String)this.id_throws[id_implements[34]] : (String)((rrwJ_2)this.id_throws[rrwv_3.id_implements[35]]).id_class[id_implements[36]], this.id_package / id_finally[20], ((int[])this.id_throws[id_implements[37]])[id_finally[21]] + id_finally[22], id_case[6]);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_finally();
        super.id_class(n, n2, n3);
        String string = id_private[3];
        this.id_throws[rrwv_3.id_implements[11]] = string;
        String string2 = id_private[4];
        ((rrwJ_2)this.id_throws[rrwv_3.id_implements[12]]).id_class[rrwv_3.id_implements[13]] = string2;
        return id_catch[13];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB244A9715A287559L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9CD82BF2;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwv_3.id_package();
        rrwv_3.id_char();
        rrwv_3.id_int();
        rrwv_3.id_native();
        rrwv_3.id_final();
        rrwv_3.id_abstract();
    }

    private void id_finally() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_finally[58]];
            objectArray[rrwv_3.id_catch[21]] = id_catch[22];
            objectArray[rrwv_3.id_finally[59]] = id_catch[23];
        }
    }

    private static void id_package() {
        boolean[] blArray = new boolean[25];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[24] = true;
        id_catch = blArray;
    }

    @Override
    public void id_private() {
        this.id_finally();
        super.id_private();
        ((rrwJ_2)this.id_throws[id_implements[38]]).id_class();
        ((Lu_1)this.id_throws[id_implements[39]]).id_catch();
        ((Lu_1)this.id_throws[id_implements[40]]).id_catch();
        ((Lu_1)this.id_throws[id_implements[41]]).id_catch();
    }

    private static void id_abstract() {
        Object[] objectArray = new Object[]{new String("Proxy")};
        id_class = objectArray;
    }

    private static void id_final() {
        id_case = new int[]{65535, 0xA0A0A0, 0xA0A0A0, 0xA0A0A0, 0xA0A0A0, 0xA0A0A0, 0xA0A0A0};
    }

    @Override
    public void id_volatile() {
        this.id_finally();
        super.id_volatile();
        String string = id_private[19];
        this.id_throws[rrwv_3.id_implements[80]] = string;
        ((Qj_1)this.id_volatile.id_class[id_implements[81]]).id_class(id_catch[17]);
    }

    private static void id_native() {
        id_finally = new byte[]{2, 2, 2, 2, 5, 2, 3, 8, 2, 2, 5, 2, 4, 5, 2, 4, 5, 2, 5, 5, 2, 6, 5, 10, 26, 20, 2, 20, 4, 20, 5, 20, 2, 2, 3, 2, 8, 2, 3, 20, 2, 3, 8, 2, 3, 20, 2, 15, 2, 7, 20, 2, 3, 2, 8, 2, 3, 20, 10, 8};
    }

    @Override
    public void v_() {
        this.id_finally();
        super.v_();
        ((Qj_1)this.id_volatile.id_class[id_implements[42]]).id_class(id_catch[15]);
        short s = id_implements[43];
        this.id_byte(id_finally[23], s, id_finally[24]);
        Boolean bl = ((rrwu_3)rrwZ_2.id_class[rrwv_3.id_implements[44]]).id_protected.equals(id_private[11]);
        this.id_throws[rrwv_3.id_implements[45]] = bl;
        LF lF2 = new LF((Integer)this.id_throws[id_implements[46]], ((int[])this.id_throws[id_implements[47]])[id_catch[16]], s, id_finally[25], new rgN_2((Boolean)this.id_throws[id_implements[48]] != false ? id_private[12] : id_private[13]), lF -> {
            this.id_finally();
            Boolean bl = (Boolean)this.id_throws[id_implements[102]] == false ? id_catch[18] : id_catch[19];
            this.id_throws[rrwv_3.id_implements[103]] = bl;
            lF.id_break(new rgN_2((Boolean)this.id_throws[id_implements[104]] != false ? id_private[23] : id_private[24]));
        });
        this.id_class(lF2);
        Lu_1 lu_1 = new Lu_1(this.id_super, (Integer)this.id_throws[id_implements[49]], ((int[])this.id_throws[id_implements[50]])[id_finally[26]], s, id_finally[27], rgN_2.id_byte);
        this.id_throws[rrwv_3.id_implements[51]] = lu_1;
        ((Lu_1)this.id_throws[id_implements[52]]).id_implements(id_implements[53]);
        ((Lu_1)this.id_throws[id_implements[54]]).id_class(((rrwu_3)rrwZ_2.id_class[rrwv_3.id_implements[55]]).id_break);
        this.id_class((Lu_1)this.id_throws[id_implements[56]]);
        Lu_1 lu_12 = new Lu_1(this.id_super, (Integer)this.id_throws[id_implements[57]], ((int[])this.id_throws[id_implements[58]])[id_finally[28]], s, id_finally[29], rgN_2.id_byte);
        this.id_throws[rrwv_3.id_implements[59]] = lu_12;
        ((Lu_1)this.id_throws[id_implements[60]]).id_implements(id_implements[61]);
        ((Lu_1)this.id_throws[id_implements[62]]).id_class(((rrwu_3)rrwZ_2.id_class[rrwv_3.id_implements[63]]).id_byte);
        this.id_class((Lu_1)this.id_throws[id_implements[64]]);
        Lu_1 lu_13 = new Lu_1(this.id_super, (Integer)this.id_throws[id_implements[65]], ((int[])this.id_throws[id_implements[66]])[id_finally[30]], s, id_finally[31], rgN_2.id_byte);
        this.id_throws[rrwv_3.id_implements[67]] = lu_13;
        ((Lu_1)this.id_throws[id_implements[68]]).id_implements(id_implements[69]);
        ((Lu_1)this.id_throws[id_implements[70]]).id_class(((rrwu_3)rrwZ_2.id_class[rrwv_3.id_implements[71]]).id_class);
        this.id_class((Lu_1)this.id_throws[id_implements[72]]);
        int n = this.id_package / id_finally[32] - s / id_finally[33] * id_finally[34] / id_finally[35];
        LF lF3 = new LF(n, ((int[])this.id_throws[id_implements[73]])[id_finally[36]], s / id_finally[37] - id_finally[38], id_finally[39], new rgn_3(id_private[14]), lF -> {
            this.id_finally();
            if (this.id_interface()) {
                rrwu_3 rrwu_32 = new rrwu_3((Boolean)this.id_throws[id_implements[93]], ((Lu_1)this.id_throws[id_implements[94]]).id_private(), ((Lu_1)this.id_throws[id_implements[95]]).id_private(), ((Lu_1)this.id_throws[id_implements[96]]).id_private());
                rrwZ_2.id_class[rrwv_3.id_implements[97]] = rrwu_32;
                Boolean bl = ((LC)this.id_throws[id_implements[98]]).id_private();
                rrwZ_2.id_class[rrwv_3.id_implements[99]] = bl;
                rrwN_2.id_class((rrwu_3)rrwZ_2.id_class[id_implements[100]]);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[101]]).id_protected().id_class();
                id_import.id_break(new vG_2(new rrvL()));
            }
        });
        this.id_class(lF3);
        LF lF4 = new LF(n + s / id_finally[40] + id_finally[41], ((int[])this.id_throws[id_implements[74]])[id_finally[42]], s / id_finally[43] - id_finally[44], id_finally[45], new rgn_3(id_private[15]), lF -> {
            this.id_finally();
            if (((Lu_1)this.id_throws[id_implements[83]]).id_private().isEmpty() || ((Lu_1)this.id_throws[id_implements[84]]).id_private().equalsIgnoreCase(id_private[20])) {
                String string = rgF_2.RED + new rgn_3(id_private[21]).getString();
                this.id_throws[rrwv_3.id_implements[85]] = string;
                return;
            }
            if (this.id_interface()) {
                rrwJ_2 rrwJ_22 = new rrwJ_2();
                this.id_throws[rrwv_3.id_implements[86]] = rrwJ_22;
                ((rrwJ_2)this.id_throws[id_implements[87]]).id_class(id_private[22], id_implements[88], new rrwu_3((Boolean)this.id_throws[id_implements[89]], ((Lu_1)this.id_throws[id_implements[90]]).id_private(), ((Lu_1)this.id_throws[id_implements[91]]).id_private(), ((Lu_1)this.id_throws[id_implements[92]]).id_private()));
            }
        });
        this.id_class(lF4);
        LC lC = new LC(this.id_package / id_finally[46] - (id_finally[47] + this.id_super.id_class(new rgn_3(id_private[16]))) / id_finally[48], ((int[])this.id_throws[id_implements[75]])[id_finally[49]], s, id_finally[50], new rgn_3(id_private[17]), (Boolean)rrwZ_2.id_class[id_implements[76]]);
        this.id_throws[rrwv_3.id_implements[77]] = lC;
        this.id_class((LC)this.id_throws[id_implements[78]]);
        LF lF5 = new LF(n + (s / id_finally[51] + id_finally[52]) * id_finally[53], ((int[])this.id_throws[id_implements[79]])[id_finally[54]], s / id_finally[55] - id_finally[56], id_finally[57], new rgn_3(id_private[18]), lF -> {
            this.id_finally();
            id_import.id_break((vm_3)this.id_throws[id_implements[82]]);
        });
        this.id_class(lF5);
    }
}

