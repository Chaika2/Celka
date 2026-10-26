/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.rrqM_2;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmF_2
extends C_try {
    private static String[] id_break;
    private static short[] id_throws;
    private static boolean[] id_case;
    private static byte[] id_catch;

    public rrmF_2(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[rrmF_2.id_case[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        rrmF_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A807DBDDC6414FDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x542E6988;
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
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -45, -86, 48, 3, 78, 93, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_catch[5]];
            stringArray[rrmF_2.id_case[4]] = id_break[8];
            stringArray[rrmF_2.id_case[5]] = id_break[9];
            stringArray[rrmF_2.id_catch[6]] = id_break[10];
            stringArray[rrmF_2.id_catch[7]] = id_break[11];
            stringArray[rrmF_2.id_catch[8]] = id_break[12];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        String string2 = c_static.id_extends();
        if ((string2.equalsIgnoreCase(id_break[13]) || string2.equalsIgnoreCase(id_break[14])) && c_static.id_case()) {
            return new v_1().id_break(((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_throws[0]]).id_byte().stream()).id_class(c_static.id_implements()).id_break().id_protected();
        }
        return Stream.empty();
    }

    private static void id_throws() {
        id_break = new String[]{new String("staff"), new String("add"), new String("remove"), new String("delete"), new String("clear"), new String("list"), new String("reload"), new String("add, remove, clear, list, reload"), new String("add"), new String("remove"), new String("clear"), new String("list"), new String("reload"), new String("remove"), new String("delete"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("> %s%s add <\u0438\u043c\u044f> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("> %s%s remove/delete <\u0438\u043c\u044f> - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("> %s%s clear - \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("> %s%s list - \u043f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("> %s%s reload - \u043e\u0431\u043d\u043e\u0432\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s add Smertnix")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmF_2.id_finally();
        rrmF_2.id_throws();
        rrmF_2.id_protected();
        rrmF_2.id_extends();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        id_case = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_case[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]];
        Object[] objectArray = new Object[id_catch[9]];
        objectArray[rrmF_2.id_case[7]] = string2;
        objectArray[rrmF_2.id_case[8]] = string;
        Object[] objectArray2 = new Object[id_catch[10]];
        objectArray2[rrmF_2.id_case[9]] = string2;
        objectArray2[rrmF_2.id_case[10]] = string;
        Object[] objectArray3 = new Object[id_catch[11]];
        objectArray3[rrmF_2.id_case[11]] = string2;
        objectArray3[rrmF_2.id_case[12]] = string;
        Object[] objectArray4 = new Object[id_catch[12]];
        objectArray4[rrmF_2.id_case[13]] = string2;
        objectArray4[rrmF_2.id_case[14]] = string;
        Object[] objectArray5 = new Object[id_catch[13]];
        objectArray5[rrmF_2.id_case[15]] = string2;
        objectArray5[rrmF_2.id_case[16]] = string;
        Object[] objectArray6 = new Object[id_catch[14]];
        objectArray6[rrmF_2.id_case[17]] = string2;
        objectArray6[rrmF_2.id_case[18]] = string;
        return List.of(id_break[16].formatted(objectArray), id_break[17].formatted(objectArray2), id_break[18].formatted(objectArray3), id_break[19].formatted(objectArray4), id_break[20].formatted(objectArray5), id_break[21], id_break[22].formatted(objectArray6));
    }

    private static void id_extends() {
        id_catch = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
    }

    @Override
    public String id_implements() {
        return id_break[15];
    }

    private static void id_protected() {
        id_throws = new short[2];
    }
}

