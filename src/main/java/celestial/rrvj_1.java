/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qw_1;
import celestial.rrNM;
import celestial.rrQK;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrwE_2;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrvj_1
extends rrtN_2 {
    private static long[] id_byte;
    private static float[] id_protected;
    private static byte[] id_native;
    private static boolean[] id_volatile;
    public static Object[] id_class;
    private static String[] id_final;
    public Object[] id_break;
    private static short[] id_package;

    @Override
    public String id_byte() {
        return this.id_catch();
    }

    public rrvj_1(String string, Supplier<Float> supplier, Supplier<Float> supplier2) {
        super(supplier, supplier2, new rrNM((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_package[0]]), id_protected[0]));
        this.id_throw();
        AnimValue animValue = new AnimValue(id_protected[1], id_volatile[0]);
        this.id_break[rrvj_1.id_package[1]] = animValue;
        float f = this.id_import();
        String string2 = string;
        this.id_break[rrvj_1.id_package[2]] = string2;
        this.id_class((rrwE_2)((Object)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[id_package[3]]), f, f);
    }

    static {
        rrvj_1.ntfClinit();
    }

    private static void B() {
        long[] lArray = new long[15];
        lArray[1] = 700L;
        lArray[6] = 50L;
        lArray[10] = 700L;
        lArray[13] = 700L;
        lArray[14] = 50L;
        id_byte = lArray;
    }

    private static void S() {
        short[] sArray = new short[46];
        sArray[0] = 3;
        sArray[1] = 3;
        sArray[4] = 2;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[10] = 5;
        sArray[11] = 6;
        sArray[12] = 4;
        sArray[13] = 5;
        sArray[14] = 6;
        sArray[15] = 7;
        sArray[16] = 4;
        sArray[17] = 5;
        sArray[18] = 6;
        sArray[19] = 7;
        sArray[20] = 3;
        sArray[21] = 4;
        sArray[22] = 5;
        sArray[23] = 3;
        sArray[24] = 6;
        sArray[25] = 7;
        sArray[26] = 7;
        sArray[27] = 6;
        sArray[28] = 6;
        sArray[29] = 7;
        sArray[30] = 3;
        sArray[31] = 6;
        sArray[32] = 5;
        sArray[33] = 3;
        sArray[34] = 5;
        sArray[35] = 4;
        sArray[36] = 5;
        sArray[37] = 6;
        sArray[38] = 20;
        sArray[40] = 1;
        sArray[41] = 1;
        sArray[42] = 2;
        sArray[43] = 2;
        sArray[44] = 3;
        sArray[45] = 4;
        id_package = sArray;
    }

    public void id_this() {
        String string;
        this.id_throw();
        if (((Boolean)this.id_break[id_package[4]]).booleanValue()) {
            this.id_class((rrwE_2)((Object)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[id_package[5]]), this.id_default(), this.id_abstract());
            Boolean bl = id_volatile[1];
            this.id_break[rrvj_1.id_package[6]] = bl;
        } else {
            float f = this.id_default() + this.id_implements() / id_protected[2];
            float f2 = this.id_abstract() + this.ao_() / id_protected[3];
            this.id_class(rrwE_2.id_class(f, f2, id_const.id_volatile(), id_const.id_final()));
            Boolean bl = id_volatile[2];
            this.id_break[rrvj_1.id_package[7]] = bl;
        }
        String string2 = string = (Boolean)this.id_break[id_package[8]] != false ? id_final[0] : id_final[1];
        if (((AnimValue)this.id_break[id_package[9]]).id_byte() > id_protected[4]) {
            String string3 = string;
            this.id_break[rrvj_1.id_package[10]] = string3;
            Long l = id_byte[0];
            this.id_break[rrvj_1.id_package[11]] = l;
        } else {
            String string4 = string;
            this.id_break[rrvj_1.id_package[12]] = string4;
            Object var12_9 = null;
            this.id_break[rrvj_1.id_package[13]] = var12_9;
            Long l = id_byte[1];
            this.id_break[rrvj_1.id_package[14]] = l;
            Long l2 = System.currentTimeMillis();
            this.id_break[rrvj_1.id_package[15]] = l2;
        }
    }

    private static void s() {
        id_final = new String[]{new String("\u0426\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043e"), new String("\u0426\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u043e")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, 29, 106, -58, -119, -91, 107, 115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x467BDA85;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x11FF8EE8B1C40E4BL;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2) {
        return this.id_transient().id_break(n, n2);
    }

    public void id_class(boolean bl) {
        this.id_throw();
        Boolean bl2 = bl;
        this.id_break[rrvj_1.id_package[43]] = bl2;
    }

    public boolean id_class() {
        return id_volatile[6];
    }

    public void id_break(boolean bl) {
        this.id_throw();
        Boolean bl2 = bl;
        this.id_break[rrvj_1.id_package[41]] = bl2;
    }

    public String id_break() {
        this.id_throw();
        return (String)this.id_break[id_package[45]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrvj_1.G();
        rrvj_1.s();
        rrvj_1.B();
        rrvj_1.S();
        rrvj_1.id_try();
        rrvj_1.E();
        rrvj_1.id_while();
    }

    @Override
    public String id_catch() {
        this.id_throw();
        return (String)this.id_break[id_package[39]];
    }

    private static void G() {
        boolean[] blArray = new boolean[16];
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[15] = true;
        id_volatile = blArray;
    }

    public boolean id_continue() {
        this.id_throw();
        return (Boolean)this.id_break[id_package[42]];
    }

    public void id_else() {
        this.id_throw();
        if ((String)this.id_break[id_package[21]] == null && (String)this.id_break[id_package[22]] == null && ((AnimValue)this.id_break[id_package[23]]).id_byte() == id_protected[5]) {
            return;
        }
        long l = System.currentTimeMillis();
        if ((Long)this.id_break[id_package[24]] > id_byte[4]) {
            long l2 = (Long)this.id_break[id_package[25]] > id_byte[5] ? Math.min(l - (Long)this.id_break[id_package[26]], id_byte[6]) : id_byte[7];
            Long l3 = Math.max(id_byte[8], (Long)this.id_break[id_package[27]] - l2);
            this.id_break[rrvj_1.id_package[28]] = l3;
        }
        Long l4 = l;
        this.id_break[rrvj_1.id_package[29]] = l4;
        ((AnimValue)this.id_break[id_package[30]]).id_class((Long)this.id_break[id_package[31]] > id_byte[9] ? id_volatile[4] : id_volatile[5]);
        if ((String)this.id_break[id_package[32]] != null && ((AnimValue)this.id_break[id_package[33]]).id_byte() < id_protected[6]) {
            String string = (String)this.id_break[id_package[34]];
            this.id_break[rrvj_1.id_package[35]] = string;
            Object var12_6 = null;
            this.id_break[rrvj_1.id_package[36]] = var12_6;
            Long l5 = id_byte[10];
            this.id_break[rrvj_1.id_package[37]] = l5;
        }
    }

    @Override
    public boolean id_new() {
        return id_volatile[10];
    }

    public abstract boolean id_package();

    public AnimValue id_return() {
        this.id_throw();
        return (AnimValue)this.id_break[id_package[44]];
    }

    public boolean id_super() {
        this.id_throw();
        return (Boolean)this.id_break[id_package[40]];
    }

    private void id_throw() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_native[0]];
            objectArray[rrvj_1.id_volatile[11]] = id_volatile[12];
            objectArray[rrvj_1.id_native[1]] = id_volatile[13];
            objectArray[rrvj_1.id_native[2]] = id_byte[11];
            objectArray[rrvj_1.id_native[3]] = id_byte[12];
        }
    }

    private static void id_try() {
        float[] fArray = new float[7];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 2.0f;
        fArray[3] = 2.0f;
        fArray[4] = 0.05f;
        fArray[6] = 0.01f;
        id_protected = fArray;
    }

    private static void id_while() {
        Object[] objectArray = new Object[]{700L, 50L};
        id_class = objectArray;
    }

    private static void E() {
        id_native = new byte[]{8, 2, 6, 7, 2};
    }

    @Override
    public void ar_() {
        this.id_throw();
        super.ar_();
        Object var5_1 = null;
        this.id_break[rrvj_1.id_package[16]] = var5_1;
        Object var6_2 = null;
        this.id_break[rrvj_1.id_package[17]] = var6_2;
        Long l = id_byte[2];
        this.id_break[rrvj_1.id_package[18]] = l;
        Long l2 = id_byte[3];
        this.id_break[rrvj_1.id_package[19]] = l2;
        ((AnimValue)this.id_break[id_package[20]]).id_class(id_volatile[3]);
    }

    @Override
    public void as_() {
        this.id_float().id_class(this.id_package());
    }

    @Override
    public boolean aq_() {
        if (((Qw_1)rrvj_1.id_import.id_class[rrvj_1.id_package[38]]).R && !this.id_class()) {
            return id_volatile[7];
        }
        return this.id_package() || this.id_float().id_case() ? id_volatile[8] : id_volatile[9];
    }
}

