/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Eh_1;
import celestial.Ps_1;
import celestial.rO_2;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EO
extends C_try {
    private static byte[] id_break;
    private static short[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;

    public EO(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[EO.id_case[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        EO.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_break[0]);
        if (c_static.id_case(id_break[1])) {
            boolean bl = id_case[2];
            int n = Integer.parseInt(c_static.id_byte().get(id_case[3]).id_break());
            int n2 = Integer.parseInt(c_static.id_byte().get(id_case[4]).id_break());
            int n3 = Integer.parseInt(c_static.id_byte().get(id_break[2]).id_break());
            if (n2 < id_case[5] || n < id_break[3] || n3 < id_case[6] || n > id_throws[0]) {
                this.id_case(id_catch[1]);
                bl = id_case[7];
            }
            if (bl) {
                rfH_2 rfH_22;
                --n;
                rpr_3 rpr_32 = ((Ps_1)this.id_class[id_throws[1]]).id_catch().Pg();
                int n4 = --n2 % id_break[4] == 0 ? id_case[8] : id_case[9];
                rfH_2 rfH_23 = switch (((int[])Eh_1.id_class[id_throws[2]])[rpr_32.ordinal()]) {
                    case 1 -> {
                        rfH_22 = new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[3]]).id_volatile().id_break[id_throws[4]], (Integer)((Ps_1)this.id_class[EO.id_throws[5]]).id_volatile().id_break[id_throws[6]], (Integer)((Ps_1)this.id_class[EO.id_throws[7]]).id_volatile().id_break[id_throws[8]] - n2 / id_break[5]);
                        yield new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[9]]).id_volatile().id_break[id_throws[10]] + n3, (Integer)((Ps_1)this.id_class[EO.id_throws[11]]).id_volatile().id_break[id_throws[12]] + n, (Integer)((Ps_1)this.id_class[EO.id_throws[13]]).id_volatile().id_break[id_throws[14]] + n2 / id_break[6] + n4);
                    }
                    case 2 -> {
                        rfH_22 = new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[15]]).id_volatile().id_break[id_throws[16]], (Integer)((Ps_1)this.id_class[EO.id_throws[17]]).id_volatile().id_break[id_throws[18]], (Integer)((Ps_1)this.id_class[EO.id_throws[19]]).id_volatile().id_break[id_throws[20]] + n2 / id_break[7] + n4);
                        yield new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[21]]).id_volatile().id_break[id_throws[22]] - n3, (Integer)((Ps_1)this.id_class[EO.id_throws[23]]).id_volatile().id_break[id_throws[24]] + n, (Integer)((Ps_1)this.id_class[EO.id_throws[25]]).id_volatile().id_break[id_throws[26]] - n2 / id_break[8]);
                    }
                    case 3 -> {
                        rfH_22 = new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[27]]).id_volatile().id_break[id_throws[28]] - n2 / id_break[9], (Integer)((Ps_1)this.id_class[EO.id_throws[29]]).id_volatile().id_break[id_throws[30]], (Integer)((Ps_1)this.id_class[EO.id_throws[31]]).id_volatile().id_break[id_throws[32]]);
                        yield new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[33]]).id_volatile().id_break[id_throws[34]] + n2 / id_break[10] + n4, (Integer)((Ps_1)this.id_class[EO.id_throws[35]]).id_volatile().id_break[id_throws[36]] + n, (Integer)((Ps_1)this.id_class[EO.id_throws[37]]).id_volatile().id_break[id_throws[38]] - n3);
                    }
                    case 4 -> {
                        rfH_22 = new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[39]]).id_volatile().id_break[id_throws[40]] + n2 / id_break[11] + n4, (Integer)((Ps_1)this.id_class[EO.id_throws[41]]).id_volatile().id_break[id_throws[42]], (Integer)((Ps_1)this.id_class[EO.id_throws[43]]).id_volatile().id_break[id_throws[44]]);
                        yield new rfH_2((Integer)((Ps_1)this.id_class[EO.id_throws[45]]).id_volatile().id_break[id_throws[46]] - n2 / id_break[12], (Integer)((Ps_1)this.id_class[EO.id_throws[47]]).id_volatile().id_break[id_throws[48]] + n, (Integer)((Ps_1)this.id_class[EO.id_throws[49]]).id_volatile().id_break[id_throws[50]] + n3);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + rpr_32);
                };
                Object[] objectArray = new Object[id_break[13]];
                objectArray[EO.id_case[10]] = n + id_case[11];
                objectArray[EO.id_case[12]] = n2 + id_case[13];
                objectArray[EO.id_break[14]] = n3;
                this.id_case(String.format(id_catch[2], objectArray));
                ((C_case)this.id_class[id_throws[51]]).r().id_class(rfH_22, rfH_23);
            }
        } else {
            rO_2 rO_22 = new rO_2(((Ps_1)this.id_class[id_throws[52]]).id_volatile(), ((Ps_1)this.id_class[id_throws[53]]).id_catch().Pg());
            ((C_case)this.id_class[id_throws[54]]).id_import().id_break(rO_22);
            Object[] objectArray = new Object[id_case[14]];
            objectArray[EO.id_case[15]] = rO_22;
            this.id_case(String.format(id_catch[3], objectArray));
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEAA78344;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3514E0C2BE153186L;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-46, 23, -79, -53, -40, -76, -42, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EO.id_throws();
        EO.id_protected();
        EO.id_extends();
        EO.id_finally();
    }

    private static void id_finally() {
        id_break = new byte[]{3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 5, 2, 3, 4};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_break[15]];
        stringArray[EO.id_case[16]] = id_catch[5];
        stringArray[EO.id_case[17]] = id_catch[6];
        stringArray[EO.id_break[16]] = id_catch[7];
        stringArray[EO.id_break[17]] = id_catch[8];
        stringArray[EO.id_break[18]] = id_catch[9];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        short[] sArray = new short[55];
        sArray[0] = 255;
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[31] = 1;
        sArray[32] = 2;
        sArray[33] = 1;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[39] = 1;
        sArray[41] = 1;
        sArray[42] = 1;
        sArray[43] = 1;
        sArray[44] = 2;
        sArray[45] = 1;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[50] = 2;
        sArray[52] = 1;
        sArray[53] = 1;
        id_throws = sArray;
    }

    @Override
    public boolean id_case() {
        return id_case[18];
    }

    @Override
    public String id_implements() {
        return id_catch[4];
    }

    private static void id_protected() {
        id_catch = new String[]{new String("tunnel"), new String("\u0428\u0438\u0440\u0438\u043d\u0430 \u0438 \u0433\u043b\u0443\u0431\u0438\u043d\u0430 \u0434\u043e\u043b\u0436\u043d\u044b \u0431\u044b\u0442\u044c \u043d\u0435 \u043c\u0435\u043d\u0435\u0435 1 \u0431\u043b\u043e\u043a\u0430; \u0432\u044b\u0441\u043e\u0442\u0430 \u0434\u043e\u043b\u0436\u043d\u0430 \u0431\u044b\u0442\u044c \u043d\u0435 \u043c\u0435\u043d\u0435\u0435 2 \u0431\u043b\u043e\u043a\u043e\u0432 \u0438 \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u043f\u0440\u0435\u0432\u044b\u0448\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u0435\u043b\u0430 \u0441\u0442\u0440\u043e\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u0430."), new String("\u0421\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u0442\u0443\u043d\u043d\u0435\u043b\u044f \u0432\u044b\u0441\u043e\u0442\u043e\u0439 %s \u0431\u043b\u043e\u043a\u0430(\u043e\u0432), \u0448\u0438\u0440\u0438\u043d\u043e\u0439 %s \u0431\u043b\u043e\u043a\u0430(\u043e\u0432) \u0438 \u0433\u043b\u0443\u0431\u0438\u043d\u043e\u0439 %s \u0431\u043b\u043e\u043a\u0430(\u043e\u0432)"), new String("Goal: %s"), new String("\u041a\u043e\u043f\u0430\u0435\u0442 \u0442\u0443\u043d\u043d\u0435\u043b\u044c \u0432 \u0432\u0430\u0448\u0435\u043c \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0438."), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"tunnel\" \u043a\u043e\u043f\u0430\u0435\u0442 \u0442\u0443\u043d\u043d\u0435\u043b\u044c \u0432 \u0432\u0430\u0448\u0435\u043c \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0438"), new String(""), new String("Usage:"), new String("> tunnel - \u0411\u0435\u0437 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u043e\u0432, \u043a\u043e\u043f\u0430\u0435\u043c\u0441\u044f \u0432 \u0440\u0430\u0434\u0438\u0443\u0441\u0435 1\u04452."), new String("> tunnel <height> <width> <depth> - \u0422\u0443\u043d\u043d\u0435\u043b\u0438 \u0437\u0430\u0434\u0430\u043d\u043d\u043e\u0439 \u0432\u0430\u043c\u0438 \u0432\u044b\u0441\u043e\u0442\u044b, \u0448\u0438\u0440\u0438\u043d\u044b \u0438 \u0433\u043b\u0443\u0431\u0438\u043d\u044b.")};
    }
}

