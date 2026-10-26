/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvP
extends Enum<rrvP> {
    public static Object[] staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5;
    private static String[] stringsf01ecca4eb60322eb4dd34fd4e806aa5;
    public Object[] fieldsf01ecca4eb60322eb4dd34fd4e806aa5;
    private static byte[] bytesf01ecca4eb60322eb4dd34fd4e806aa5;
    private static short[] shortsf01ecca4eb60322eb4dd34fd4e806aa5;
    private static int[] integersf01ecca4eb60322eb4dd34fd4e806aa5;
    private static boolean[] booleansf01ecca4eb60322eb4dd34fd4e806aa5;

    public String id_byte() {
        return (String)this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[6]];
    }

    private rrvP(String string2, int n2, int n3) {
        this.id_protected();
        String string3 = string2;
        this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[rrvP.shortsf01ecca4eb60322eb4dd34fd4e806aa5[1]] = string3;
        Integer n4 = ColorHelper.id_break(n2, shortsf01ecca4eb60322eb4dd34fd4e806aa5[2]);
        this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[rrvP.shortsf01ecca4eb60322eb4dd34fd4e806aa5[3]] = n4;
        Integer n5 = ColorHelper.id_break(n3, shortsf01ecca4eb60322eb4dd34fd4e806aa5[4]);
        this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[rrvP.shortsf01ecca4eb60322eb4dd34fd4e806aa5[5]] = n5;
    }

    static {
        rrvP.ntfClinit();
    }

    public static rrvP[] values() {
        return (rrvP[])((rrvP[])staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[0]]).clone();
    }

    public static rrvP valueOf(String string) {
        return Enum.valueOf(rrvP.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF6AB64D7;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-41, 73, 5, -75, 63, -41, -4, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        return (Integer)this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[7]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3FB26513B430C007L;
    }

    public int id_break() {
        return (Integer)this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[8]];
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[1], 5518335, 65535), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[3], 0xFC00FF, 56286), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[5], 13148872, 12139407), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[7], 704444, 16528716), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[9], 39415, 15800082), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[11], 12793700, 1910385), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[13], 2899536, 16610412), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[15], 9323501, 15789195), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[17], 16736109, 16761713), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[19], 5518335, 10878667), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[21], 8609987, 3063697), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[23], 16729344, 16753920), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[25], 16048856, 12211056), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[27], 10025880, 25600), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[29], 16758465, 16716947), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[31], 4511656, 25666), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[33], 65535, 13107), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[35], 14011626, 4792186), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[37], 4282576, 0x151515), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[39], 16729344, 0x1E0E00), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[41], 11730971, 985103), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[43], 9175066, 16734003), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[45], 16752762, 16729344), new rrvP(stringsf01ecca4eb60322eb4dd34fd4e806aa5[47], 16765184, 0x202020), new rrvP[]{(rrvP)((Object)objectArray[0]), (rrvP)((Object)objectArray[1]), (rrvP)((Object)objectArray[2]), (rrvP)((Object)objectArray[3]), (rrvP)((Object)objectArray[4]), (rrvP)((Object)objectArray[5]), (rrvP)((Object)objectArray[6]), (rrvP)((Object)objectArray[7]), (rrvP)((Object)objectArray[8]), (rrvP)((Object)objectArray[9]), (rrvP)((Object)objectArray[10]), (rrvP)((Object)objectArray[11]), (rrvP)((Object)objectArray[12]), (rrvP)((Object)objectArray[13]), (rrvP)((Object)objectArray[14]), (rrvP)((Object)objectArray[15]), (rrvP)((Object)objectArray[16]), (rrvP)((Object)objectArray[17]), (rrvP)((Object)objectArray[18]), (rrvP)((Object)objectArray[19]), (rrvP)((Object)objectArray[20]), (rrvP)((Object)objectArray[21]), (rrvP)((Object)objectArray[22]), (rrvP)((Object)objectArray[23])}};
        staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvP.id_extends();
        rrvP.id_finally();
        rrvP.id_implements();
        rrvP.id_private();
        rrvP.id_case();
        rrvP.id_throws();
    }

    private static void id_finally() {
        stringsf01ecca4eb60322eb4dd34fd4e806aa5 = new String[]{new String("PURPLE_BLUE"), new String("\u0424\u0438\u043e\u043b\u0435\u0442\u043e\u0432\u043e-\u0433\u043e\u043b\u0443\u0431\u043e\u0439"), new String("CANDY"), new String("\u041a\u043e\u043d\u0444\u0435\u0442\u043d\u044b\u0439"), new String("LILAC"), new String("\u0421\u0438\u0440\u0435\u043d\u0435\u0432\u044b\u0439"), new String("MINT_RASPBERRY"), new String("\u041c\u044f\u0442\u043d\u043e-\u043c\u0430\u043b\u0438\u043d\u043e\u0432\u044b\u0439"), new String("SUPERMAN"), new String("\u0421\u0443\u043f\u0435\u0440\u043c\u0435\u043d"), new String("CELESTIAL"), new String("\u041a\u043e\u0441\u043c\u043e\u0441"), new String("GALAXY"), new String("\u0413\u0430\u043b\u0430\u043a\u0442\u0438\u043a\u0430"), new String("AMETHYST_YELLOW"), new String("\u0410\u043c\u0435\u0442\u0438\u0441\u0442\u043e-\u0436\u0451\u043b\u0442\u044b\u0439"), new String("SUNRISE"), new String("\u0412\u043e\u0441\u0445\u043e\u0434"), new String("LUNADA"), new String("\u041b\u0443\u043d\u0430\u0434\u0430"), new String("PURPLE_SEA"), new String("\u041f\u0443\u0440\u043f\u0443\u0440\u043d\u043e-\u043c\u043e\u0440\u0441\u043a\u043e\u0439"), new String("SUNSET"), new String("\u0421\u043e\u043b\u043d\u0435\u0447\u043d\u044b\u0439 \u0437\u0430\u043a\u0430\u0442"), new String("MOONLIGHT"), new String("\u041b\u0443\u043d\u043d\u044b\u0439 \u0441\u0432\u0435\u0442"), new String("MINT_CHOCOLATE"), new String("\u041c\u044f\u0442\u043d\u044b\u0439 \u0448\u043e\u043a\u043e\u043b\u0430\u0434"), new String("RASPBERRY_SMOOTHIE"), new String("\u041c\u0430\u043b\u0438\u043d\u043e\u0432\u044b\u0439 \u0441\u043c\u0443\u0437\u0438"), new String("EUCALYPTUS"), new String("\u042d\u0432\u043a\u0430\u043b\u0438\u043f\u0442\u043e\u0432\u044b\u0439"), new String("FROSTBITE"), new String("\u041e\u0431\u043c\u043e\u0440\u043e\u0436\u0435\u043d\u0438\u0435"), new String("FROZEN_BERRY"), new String("\u0425\u043e\u043b\u043e\u0434\u043d\u0430\u044f \u044f\u0433\u043e\u0434\u0430"), new String("STORMY_SEA"), new String("\u0413\u0440\u043e\u0437\u043e\u0432\u043e\u0435 \u043c\u043e\u0440\u0435"), new String("SUNSET_GLOW"), new String("\u0417\u0430\u043a\u0430\u0442\u043d\u043e\u0435 \u0441\u0438\u044f\u043d\u0438\u0435"), new String("CRIMSON_DAWN"), new String("\u0411\u0430\u0433\u0440\u044f\u043d\u044b\u0439 \u0440\u0430\u0441\u0441\u0432\u0435\u0442"), new String("CRIMSON_BEACH"), new String("\u041c\u0430\u043b\u0438\u043d\u043e\u0432\u044b\u0439 \u043f\u043b\u044f\u0436"), new String("CORAL"), new String("\u041a\u043e\u0440\u0430\u043b\u043b\u043e\u0432\u044b\u0439"), new String("GOLDEN_NIGHT"), new String("\u0417\u043e\u043b\u043e\u0442\u0430\u044f \u043d\u043e\u0447\u044c")};
    }

    private static /* synthetic */ rrvP[] id_catch() {
        rrvP[] rrvPArray = new rrvP[bytesf01ecca4eb60322eb4dd34fd4e806aa5[0]];
        rrvPArray[rrvP.booleansf01ecca4eb60322eb4dd34fd4e806aa5[0]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[9]]);
        rrvPArray[rrvP.booleansf01ecca4eb60322eb4dd34fd4e806aa5[1]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[10]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[1]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[11]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[2]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[12]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[3]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[13]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[4]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[14]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[5]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[15]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[6]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[16]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[7]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[17]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[8]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[18]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[9]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[19]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[10]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[20]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[11]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[21]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[12]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[22]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[13]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[23]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[14]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[24]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[15]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[25]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[16]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[26]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[17]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[27]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[18]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[28]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[19]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[29]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[20]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[30]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[21]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[31]]);
        rrvPArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[22]] = (rrvP)((Object)staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[shortsf01ecca4eb60322eb4dd34fd4e806aa5[32]]);
        return rrvPArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleansf01ecca4eb60322eb4dd34fd4e806aa5 = blArray;
    }

    private static void id_case() {
        integersf01ecca4eb60322eb4dd34fd4e806aa5 = new int[]{5518335, 65535, 0xFC00FF, 56286, 13148872, 12139407, 704444, 16528716, 39415, 15800082, 12793700, 1910385, 2899536, 16610412, 9323501, 15789195, 16736109, 16761713, 5518335, 10878667, 8609987, 3063697, 16729344, 16753920, 16048856, 12211056, 10025880, 16758465, 16716947, 4511656, 65535, 14011626, 4792186, 4282576, 0x151515, 16729344, 0x1E0E00, 11730971, 985103, 9175066, 16734003, 16752762, 16729344, 16765184, 0x202020};
    }

    private static void id_implements() {
        short[] sArray = new short[36];
        sArray[0] = 24;
        sArray[2] = 255;
        sArray[3] = 1;
        sArray[4] = 255;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 4;
        sArray[14] = 5;
        sArray[15] = 6;
        sArray[16] = 7;
        sArray[17] = 8;
        sArray[18] = 9;
        sArray[19] = 10;
        sArray[20] = 11;
        sArray[21] = 12;
        sArray[22] = 13;
        sArray[23] = 14;
        sArray[24] = 15;
        sArray[25] = 16;
        sArray[26] = 17;
        sArray[27] = 18;
        sArray[28] = 19;
        sArray[29] = 20;
        sArray[30] = 21;
        sArray[31] = 22;
        sArray[32] = 23;
        sArray[33] = 25600;
        sArray[34] = 25666;
        sArray[35] = 13107;
        shortsf01ecca4eb60322eb4dd34fd4e806aa5 = sArray;
    }

    private void id_protected() {
        if (this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5 == null) {
            Object[] objectArray = this.fieldsf01ecca4eb60322eb4dd34fd4e806aa5 = new Object[bytesf01ecca4eb60322eb4dd34fd4e806aa5[68]];
            objectArray[rrvP.booleansf01ecca4eb60322eb4dd34fd4e806aa5[6]] = booleansf01ecca4eb60322eb4dd34fd4e806aa5[7];
            objectArray[rrvP.bytesf01ecca4eb60322eb4dd34fd4e806aa5[69]] = booleansf01ecca4eb60322eb4dd34fd4e806aa5[8];
        }
    }

    private static void id_private() {
        bytesf01ecca4eb60322eb4dd34fd4e806aa5 = new byte[]{24, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24, 3, 2, 25};
    }
}

