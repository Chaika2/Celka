/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.rrvZ;
import celestial.rrvm_1;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmX_2
extends C_try {
    private static boolean[] id_break;
    private static byte[] id_throws;
    private static String[] id_case;
    private static short[] id_catch;

    public rrmX_2(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[rrmX_2.id_break[0]] = id_case[0];
        stringArray[rrmX_2.id_break[1]] = id_case[1];
        super(c_case, stringArray);
    }

    static {
        rrmX_2.ntfClinit();
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
        return Integer.rotateLeft(n, 16) ^ 0xAB758AF9;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD0C159623428C907L;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_throws[5]];
            stringArray[rrmX_2.id_break[4]] = id_case[8];
            stringArray[rrmX_2.id_break[5]] = id_case[9];
            stringArray[rrmX_2.id_throws[6]] = id_case[10];
            stringArray[rrmX_2.id_throws[7]] = id_case[11];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        String string2 = c_static.id_extends();
        if (string2.equalsIgnoreCase(id_case[12]) || string2.equalsIgnoreCase(id_case[13])) {
            return new v_1().id_break(((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_catch[0]]).id_byte().stream().map(rrvm_1::id_byte)).id_class(c_static.id_implements()).id_break().id_protected();
        }
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{114, 17, -120, 101, 108, -8, 108, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmX_2.id_finally();
        rrmX_2.id_protected();
        rrmX_2.id_extends();
        rrmX_2.id_throws();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[19];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        id_break = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_break[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_catch[1]];
        Object[] objectArray = new Object[id_throws[8]];
        objectArray[rrmX_2.id_break[7]] = string2;
        objectArray[rrmX_2.id_break[8]] = string;
        Object[] objectArray2 = new Object[id_throws[9]];
        objectArray2[rrmX_2.id_break[9]] = string2;
        objectArray2[rrmX_2.id_break[10]] = string;
        Object[] objectArray3 = new Object[id_throws[10]];
        objectArray3[rrmX_2.id_break[11]] = string2;
        objectArray3[rrmX_2.id_break[12]] = string;
        Object[] objectArray4 = new Object[id_throws[11]];
        objectArray4[rrmX_2.id_break[13]] = string2;
        objectArray4[rrmX_2.id_break[14]] = string;
        Object[] objectArray5 = new Object[id_throws[12]];
        objectArray5[rrmX_2.id_break[15]] = string2;
        objectArray5[rrmX_2.id_break[16]] = string;
        Object[] objectArray6 = new Object[id_throws[13]];
        objectArray6[rrmX_2.id_break[17]] = string2;
        objectArray6[rrmX_2.id_break[18]] = string;
        return List.of(id_case[15].formatted(objectArray), id_case[16].formatted(objectArray2), id_case[17].formatted(objectArray3), id_case[18].formatted(objectArray4), id_case[19], id_case[20].formatted(objectArray5), id_case[21], id_case[22].formatted(objectArray6));
    }

    private static void id_extends() {
        id_catch = new short[2];
    }

    @Override
    public String id_implements() {
        return id_case[14];
    }

    private static void id_protected() {
        id_case = new String[]{new String("macro"), new String("macros"), new String("add"), new String("remove"), new String("delete"), new String("clear"), new String("list"), new String("add, remove, clear, list"), new String("add"), new String("remove"), new String("clear"), new String("list"), new String("remove"), new String("delete"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432"), new String("> %s%s add <\u0438\u043c\u044f> <\u043a\u043e\u043c\u0430\u043d\u0434\u0430> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441"), new String("> %s%s remove/delete <\u0438\u043c\u044f> - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441"), new String("> %s%s clear - \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432"), new String("> %s%s list - \u043f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s test /home home"), new String(""), new String("\u041f\u043e\u0441\u043b\u0435 \u0432\u0432\u043e\u0434\u0430 \u043a\u043e\u043c\u0430\u043d\u0434\u044b %s%s add, \u0432\u0430\u043c \u043d\u0443\u0436\u043d\u043e \u0431\u0443\u0434\u0435\u0442 \u043d\u0430\u0436\u0430\u0442\u044c \u043a\u043b\u0430\u0432\u0438\u0448\u0443, \u043d\u0430 \u043a\u043e\u0442\u043e\u0440\u0443\u044e \u0432\u044b \u0445\u043e\u0442\u0438\u0442\u0435 \u043f\u0440\u0438\u0432\u044f\u0437\u0430\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441")};
    }
}

