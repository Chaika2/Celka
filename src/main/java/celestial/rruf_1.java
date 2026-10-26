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

public class rruf_1
extends C_try {
    private static String[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;

    public rruf_1(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[rruf_1.id_throws[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        rruf_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6758A4796B24F5DBL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5553423B;
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

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{22, -98, 28, -42, -117, -81, 102, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_case[1]];
            stringArray[rruf_1.id_throws[4]] = id_break[4];
            stringArray[rruf_1.id_throws[5]] = id_break[5];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        return Stream.empty();
    }

    private static void id_throws() {
        id_catch = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rruf_1.id_finally();
        rruf_1.id_extends();
        rruf_1.id_throws();
        rruf_1.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_throws = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_throws[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_catch[0]];
        Object[] objectArray = new Object[id_case[2]];
        objectArray[rruf_1.id_throws[7]] = string2;
        objectArray[rruf_1.id_throws[8]] = string;
        Object[] objectArray2 = new Object[id_case[3]];
        objectArray2[rruf_1.id_throws[9]] = string2;
        objectArray2[rruf_1.id_throws[10]] = string;
        return List.of(id_break[7].formatted(objectArray), id_break[8].formatted(objectArray2));
    }

    private static void id_extends() {
        id_break = new String[]{new String("bind"), new String("resetall"), new String("list"), new String("resetall, list"), new String("resetall"), new String("list"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0431\u0438\u043d\u0434\u043e\u0432"), new String("> %s%s resetall - \u0441\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u0435\u0442 \u0432\u0441\u0435 \u0431\u0438\u043d\u0434\u044b \u043d\u0430 \u0434\u0435\u0444\u043e\u043b\u0442\u043d\u044b\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f"), new String("> %s%s list - \u043f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0431\u0438\u043d\u0434\u043e\u0432")};
    }

    @Override
    public String id_implements() {
        return id_break[6];
    }

    private static void id_protected() {
        id_case = new byte[]{-1, 2, 2, 2};
    }
}

