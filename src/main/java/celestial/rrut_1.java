/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrut_1
extends C_try {
    private static byte[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;

    public rrut_1(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[rrut_1.id_throws[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        rrut_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x284E4A7002C77B28L;
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
        return Integer.rotateLeft(n, 16) ^ 0x1E6E610B;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_break[1]];
            stringArray[rrut_1.id_throws[4]] = id_catch[5];
            stringArray[rrut_1.id_throws[5]] = id_catch[6];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, 69, 117, 106, -87, 42, -6, 34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrut_1.id_throws();
        rrut_1.id_finally();
        rrut_1.id_extends();
        rrut_1.id_protected();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("autobuy"), new String("save"), new String("reload"), new String("save"), new String("reload"), new String("save"), new String("reload"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0440\u0430\u0431\u043e\u0442\u044b \u0441 \u0430\u0432\u0442\u043e. \u043f\u043e\u043a\u0443\u043f\u043a\u043e\u0439"), new String("> %s%s save - \u0441\u043e\u0445\u0440\u0430\u043d\u044f\u0435\u0442 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0443 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0430\u0432\u0442\u043e. \u043f\u043e\u043a\u0443\u043f\u043a\u0438"), new String("> %s%s reload - \u043f\u0435\u0440\u0435\u0437\u0430\u0433\u0440\u0443\u0436\u0430\u0435\u0442 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0443 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0434\u043b\u044f \u0430\u0432\u0442\u043e. \u043f\u043e\u043a\u0443\u043f\u043a\u0438")};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_throws[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[0]];
        Object[] objectArray = new Object[id_break[2]];
        objectArray[rrut_1.id_throws[7]] = string2;
        objectArray[rrut_1.id_throws[8]] = string;
        Object[] objectArray2 = new Object[id_break[3]];
        objectArray2[rrut_1.id_throws[9]] = string2;
        objectArray2[rrut_1.id_throws[10]] = string;
        return List.of(id_catch[8].formatted(objectArray), id_catch[9].formatted(objectArray2));
    }

    private static void id_extends() {
        id_case = new short[1];
    }

    @Override
    public String id_implements() {
        return id_catch[7];
    }

    private static void id_protected() {
        id_break = new byte[]{-1, 2, 2, 2};
    }
}

