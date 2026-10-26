/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.rrQX;
import celestial.rryd_1;
import celestial.rryk_1;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrua_1
extends C_try {
    private static byte[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;

    public rrua_1(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[rrua_1.id_throws[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        rrua_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE344328F18DE2EF9L;
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
        return Integer.rotateLeft(n, 16) ^ 0x73E88056;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-80, -116, 120, 24, -29, 64, -43, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_throws[5]];
            stringArray[rrua_1.id_throws[6]] = id_catch[10];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        String string2 = c_static.id_extends();
        if (string2.equalsIgnoreCase(id_catch[11])) {
            if (c_static.id_native()) {
                String[] stringArray = new String[id_break[6]];
                stringArray[rrua_1.id_throws[7]] = id_catch[12];
                stringArray[rrua_1.id_throws[8]] = id_catch[13];
                stringArray[rrua_1.id_break[7]] = id_catch[14];
                stringArray[rrua_1.id_break[8]] = id_catch[15];
                stringArray[rrua_1.id_break[9]] = id_catch[16];
                return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
            }
            String string3 = c_static.id_extends();
            if ((string3.equalsIgnoreCase(id_catch[17]) || string3.equalsIgnoreCase(id_catch[18]) || string3.equalsIgnoreCase(id_catch[19])) && c_static.id_case()) {
                return new v_1().id_break(((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_case[0]]).id_break().stream().map(rryk_1::id_break)).id_class(c_static.id_implements()).id_break().id_protected();
            }
        }
        return Stream.empty();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrua_1.id_throws();
        rrua_1.id_extends();
        rrua_1.id_finally();
        rrua_1.id_protected();
    }

    private static void id_finally() {
        id_case = new short[3];
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_throws[9]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[2]];
        Object[] objectArray = new Object[id_break[10]];
        objectArray[rrua_1.id_throws[10]] = string2;
        objectArray[rrua_1.id_throws[11]] = string;
        Object[] objectArray2 = new Object[id_break[11]];
        objectArray2[rrua_1.id_throws[12]] = string2;
        objectArray2[rrua_1.id_throws[13]] = string;
        Object[] objectArray3 = new Object[id_break[12]];
        objectArray3[rrua_1.id_throws[14]] = string2;
        objectArray3[rrua_1.id_throws[15]] = string;
        Object[] objectArray4 = new Object[id_break[13]];
        objectArray4[rrua_1.id_throws[16]] = string2;
        objectArray4[rrua_1.id_throws[17]] = string;
        Object[] objectArray5 = new Object[id_break[14]];
        objectArray5[rrua_1.id_throws[18]] = string2;
        objectArray5[rrua_1.id_throws[19]] = string;
        Object[] objectArray6 = new Object[id_break[15]];
        objectArray6[rrua_1.id_throws[20]] = string2;
        objectArray6[rrua_1.id_throws[21]] = string;
        return List.of(id_catch[20].formatted(objectArray), id_catch[21].formatted(objectArray2), id_catch[22].formatted(objectArray3), id_catch[23].formatted(objectArray4), id_catch[24].formatted(objectArray5), id_catch[25], id_catch[26].formatted(objectArray6));
    }

    private static void id_extends() {
        id_catch = new String[]{new String("duel"), new String("blacklist"), new String("add"), new String("remove"), new String("delete"), new String("note"), new String("clear"), new String("list"), new String("add, remove, clear, list"), new String("blacklist"), new String("blacklist"), new String("blacklist"), new String("add"), new String("remove"), new String("note"), new String("clear"), new String("list"), new String("remove"), new String("delete"), new String("note"), new String("> %s%s blacklist add <\u0438\u043c\u044f> <\u0437\u0430\u043c\u0435\u0442\u043a\u0430> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0432 \u0447\u0451\u0440\u043d\u044b\u0439 \u0441\u043f\u0438\u0441\u043e\u043a"), new String("> %s%s blacklist remove/delete <\u0438\u043c\u044f> - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0438\u0437 \u0447\u0451\u0440\u043d\u043e\u0433\u043e \u0441\u043f\u0438\u0441\u043a\u0430"), new String("> %s%s blacklist note <\u0438\u043c\u044f> - \u043f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0437\u0430\u043c\u0435\u0442\u043a\u0443 \u0438\u0433\u0440\u043e\u043a\u0430 \u0432 \u0447\u0451\u0440\u043d\u043e\u043c \u0441\u043f\u0438\u0441\u043a\u0435"), new String("> %s%s blacklist clear - \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0447\u0451\u0440\u043d\u044b\u0439 \u0441\u043f\u0438\u0441\u043e\u043a"), new String("> %s%s blacklist list - \u043f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0447\u0451\u0440\u043d\u044b\u0439 \u0441\u043f\u0438\u0441\u043e\u043a"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s blacklist add Smertnix \u0421\u043b\u0438\u0448\u043a\u043e\u043c \u0441\u0438\u043b\u044c\u043d\u044b\u0439 ;(")};
    }

    @Override
    public String id_implements() {
        return "\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u0435\u0439 \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[1]]).id_private().id_implements().id_final() + "\"";
    }

    private static void id_protected() {
        id_break = new byte[]{-1, -1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
    }
}

