/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rrfu_3;
import celestial.rrjc_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmI_2
extends C_try {
    private static boolean[] id_break;
    private static byte[] id_throws;
    private static short[] id_case;
    private static double[] id_catch;
    private static float[] id_private;
    private static String[] id_implements;

    private static void id_int() {
        double[] dArray = new double[10];
        dArray[0] = -1.8f;
        dArray[1] = 2.0;
        dArray[2] = 255.0;
        dArray[3] = 0.5;
        dArray[7] = 0.5;
        dArray[9] = 2.0;
        id_catch = dArray;
    }

    public rrmI_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[rrmI_2.id_break[1]] = id_implements[0];
        super(c_case, stringArray);
    }

    static {
        rrmI_2.ntfClinit();
    }

    private void id_class(double d) {
        rrmI_2.id_protected();
        ((cb_3)rrmI_2.b_.id_class[id_case[1]]).id_int(((cb_3)rrmI_2.b_.id_class[id_case[2]]).rx(), d, ((cb_3)rrmI_2.b_.id_class[id_case[3]]).BO());
        rrmI_2.id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD535E6C28ABAB2DEL;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void id_class(String var1_1, C_static var2_2) throws x_1 {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4222ABCC;
    }

    private double id_class(rfH_2 rfH_22) {
        rfl_3 rfl_32 = rrjc_3.id_break(rfH_22);
        return rfl_32.id_throws - rfl_32.id_break;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{112, -63, -34, 56, 103, -81, -76, -23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private boolean id_break(double d) {
        rfl_3 rfl_32 = ((cb_3)rrmI_2.b_.id_class[id_case[6]]).rN();
        return ((gm_3)rrmI_2.b_.id_class[id_case[7]]).a_((cb_3)rrmI_2.b_.id_class[id_case[8]], rfl_32.id_protected(id_catch[4], d - ((cb_3)rrmI_2.b_.id_class[id_case[9]]).re(), id_catch[5])) && !((gm_3)rrmI_2.b_.id_class[id_case[10]]).a_((cb_3)rrmI_2.b_.id_class[id_case[11]], rfl_32.id_protected(id_catch[6], d - ((cb_3)rrmI_2.b_.id_class[id_case[12]]).re() - id_catch[7], id_catch[8])) ? id_break[13] : id_break[14];
    }

    private static void id_throws() {
        short[] sArray = new short[16];
        sArray[0] = 57;
        sArray[1] = 57;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 57;
        sArray[6] = 57;
        sArray[7] = 56;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[10] = 56;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[14] = 57;
        sArray[15] = 57;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmI_2.id_extends();
        rrmI_2.id_finally();
        rrmI_2.id_throws();
        rrmI_2.id_int();
        rrmI_2.id_native();
        rrmI_2.id_new();
    }

    private static void id_finally() {
        id_implements = new String[]{new String("vclip"), new String("up"), new String("down"), new String("bedrock"), new String("bd"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u0431\u043b\u043e\u043a \u043f\u043e\u0434 \u0432\u0430\u043c\u0438!"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u0431\u043b\u043e\u043a \u043d\u0430\u0434 \u0432\u0430\u043c\u0438!"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430 \u043f\u043e Y \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0435"), new String("> %s%s <\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435> - \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0441 \u043d\u0430 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0431\u043b\u043e\u043a\u043e\u0432"), new String("> %s%s up - \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0441 \u043d\u0430 \u0441\u0430\u043c\u044b\u0439 \u0432\u0435\u0440\u0445\u043d\u0438\u0439 \u0431\u043b\u043e\u043a \u043f\u0435\u0440\u0435\u0434 \u0432\u043e\u0437\u0434\u0443\u0445\u043e\u043c"), new String("> %s%s down - \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0441 \u043d\u0430 \u0441\u0430\u043c\u044b\u0439 \u043d\u0438\u0436\u043d\u0438\u0439 \u0431\u043b\u043e\u043a \u043f\u043e\u0434 \u0432\u043e\u0437\u0434\u0443\u0445\u043e\u043c"), new String("> %s%s bedrock - \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0441 \u043f\u043e\u0434 \u0431\u0435\u0434\u0440\u043e\u043a")};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_break[4]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[5]];
        Object[] objectArray = new Object[id_throws[3]];
        objectArray[rrmI_2.id_break[5]] = string2;
        objectArray[rrmI_2.id_break[6]] = string;
        Object[] objectArray2 = new Object[id_throws[4]];
        objectArray2[rrmI_2.id_break[7]] = string2;
        objectArray2[rrmI_2.id_break[8]] = string;
        Object[] objectArray3 = new Object[id_throws[5]];
        objectArray3[rrmI_2.id_break[9]] = string2;
        objectArray3[rrmI_2.id_break[10]] = string;
        Object[] objectArray4 = new Object[id_throws[6]];
        objectArray4[rrmI_2.id_break[11]] = string2;
        objectArray4[rrmI_2.id_break[12]] = string;
        return List.of(id_implements[8].formatted(objectArray), id_implements[9].formatted(objectArray2), id_implements[10].formatted(objectArray3), id_implements[11].formatted(objectArray4));
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[15];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        id_break = blArray;
    }

    private rfH_2 id_continue() {
        for (int i = (int)(((cb_3)rrmI_2.b_.id_class[id_case[13]]).re() - id_catch[9]); i > 0; --i) {
            rfH_2 rfH_22 = new rfH_2(((cb_3)rrmI_2.b_.id_class[id_case[14]]).rx(), (double)i, ((cb_3)rrmI_2.b_.id_class[id_case[15]]).BO());
            if (!this.id_break((double)i + this.id_class(rfH_22))) continue;
            return rfH_22;
        }
        return null;
    }

    @Override
    public String id_implements() {
        return id_implements[7];
    }

    private static void id_new() {
        id_throws = new byte[]{-1, 2, 3, 2, 2, 2, 2};
    }

    private void id_package() {
        float f = id_private[0];
        for (double d = ((cb_3)rrmI_2.b_.id_class[id_case[4]]).re() + id_catch[1]; d < id_catch[2]; d += id_catch[3]) {
            if (!this.id_break(d)) continue;
            f = (float)d;
            break;
        }
        if (f == id_private[1]) {
            rrfu_3.id_byte(id_implements[6]);
            return;
        }
        this.id_class(f);
    }

    public static void id_protected() {
    }

    private void id_final() {
        rfH_2 rfH_22 = this.id_continue();
        if (rfH_22 == null) {
            rrfu_3.id_byte(id_implements[5]);
            return;
        }
        this.id_class((float)((double)rfH_22.c_() + this.id_class(rfH_22)));
    }

    private void id_volatile() {
        this.id_class(id_catch[0]);
    }

    private static void id_native() {
        id_private = new float[2];
    }
}

