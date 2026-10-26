/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.ri_3;
import celestial.rrHE;
import celestial.rrQX;
import celestial.rrmQ_2;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmW_2
extends C_try {
    private static boolean[] id_break;
    private static String[] id_throws;
    private static short[] id_case;
    private static byte[] id_catch;

    public rrmW_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[rrmW_2.id_break[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        rrmW_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x51D72DED;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x805C4DEBA1361528L;
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
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{125, 10, -126, -95, -12, 112, -25, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_catch[4]];
            stringArray[rrmW_2.id_break[4]] = id_throws[7];
            stringArray[rrmW_2.id_break[5]] = id_throws[8];
            stringArray[rrmW_2.id_catch[5]] = id_throws[9];
            stringArray[rrmW_2.id_catch[6]] = id_throws[10];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        String string2 = c_static.id_extends();
        if (string2.equalsIgnoreCase(id_throws[11])) {
            if (c_static.id_case()) {
                return c_static.id_class((rrmQ_2)rrmQ_2.staticFieldsfc1bbf6223bd333fa50da06439bdcc78[id_case[0]]);
            }
        } else if ((string2.equalsIgnoreCase(id_throws[12]) || string2.equalsIgnoreCase(id_throws[13])) && c_static.id_case()) {
            return new v_1().id_break(((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[id_case[1]]).id_byte().stream().map(xd_32 -> ri_3.id_class(xd_32))).id_break().id_class(c_static.id_extends()).id_protected();
        }
        return Stream.empty();
    }

    private static void id_throws() {
        id_catch = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmW_2.id_protected();
        rrmW_2.id_finally();
        rrmW_2.id_extends();
        rrmW_2.id_throws();
    }

    private static void id_finally() {
        id_throws = new String[]{new String("nuker"), new String("add"), new String("remove"), new String("delete"), new String("clear"), new String("list"), new String("add, remove, clear, list"), new String("add"), new String("remove"), new String("clear"), new String("list"), new String("add"), new String("remove"), new String("delete"), new String("> %s%s add <\u0438\u043c\u044f> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0431\u043b\u043e\u043a \u0432 \u0441\u043f\u0438\u0441\u043e\u043a"), new String("> %s%s remove <\u0438\u043c\u044f> - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0431\u043b\u043e\u043a \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430"), new String("> %s%s clear - \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432"), new String("> %s%s list - \u043f\u0440\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s add diamond_ore")};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_break[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_case[3]];
        Object[] objectArray = new Object[id_catch[7]];
        objectArray[rrmW_2.id_break[7]] = string2;
        objectArray[rrmW_2.id_break[8]] = string;
        Object[] objectArray2 = new Object[id_catch[8]];
        objectArray2[rrmW_2.id_break[9]] = string2;
        objectArray2[rrmW_2.id_break[10]] = string;
        Object[] objectArray3 = new Object[id_catch[9]];
        objectArray3[rrmW_2.id_break[11]] = string2;
        objectArray3[rrmW_2.id_break[12]] = string;
        Object[] objectArray4 = new Object[id_catch[10]];
        objectArray4[rrmW_2.id_break[13]] = string2;
        objectArray4[rrmW_2.id_break[14]] = string;
        Object[] objectArray5 = new Object[id_catch[11]];
        objectArray5[rrmW_2.id_break[15]] = string2;
        objectArray5[rrmW_2.id_break[16]] = string;
        return List.of(id_throws[14].formatted(objectArray), id_throws[15].formatted(objectArray2), id_throws[16].formatted(objectArray3), id_throws[17].formatted(objectArray4), id_throws[18], id_throws[19].formatted(objectArray5));
    }

    private static void id_extends() {
        id_case = new short[4];
    }

    @Override
    public String id_implements() {
        return "\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0431\u043b\u043e\u043a\u043e\u0432 \u0432 \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[2]]).id_private().id_class().id_final() + "\"";
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[17];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        id_break = blArray;
    }
}

