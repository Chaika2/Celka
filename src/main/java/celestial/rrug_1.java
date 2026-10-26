/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.rrQX;
import celestial.rrqU_2;
import celestial.rrqY_2;
import celestial.rruD;
import celestial.rruY;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrug_1
extends C_try {
    private static boolean[] id_break;
    private static short[] id_throws;
    private static String[] id_case;
    private static byte[] id_catch;

    public rrug_1(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[rrug_1.id_break[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        rrug_1.ntfClinit();
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

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA2A0D29E47B5F6F2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA9777616;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -102, 96, 58, 93, -38, 14, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_catch[4]];
            stringArray[rrug_1.id_break[4]] = id_case[7];
            stringArray[rrug_1.id_break[5]] = id_case[8];
            stringArray[rrug_1.id_catch[5]] = id_case[9];
            stringArray[rrug_1.id_catch[6]] = id_case[10];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        String string2 = c_static.id_extends();
        if (string2.equalsIgnoreCase(id_case[11])) {
            if (c_static.id_case()) {
                return c_static.id_class((rruY)rruY.staticFieldsa8884e3b339234dd911c10ea97845ed5[id_throws[0]]);
            }
            if (c_static.id_case(id_catch[7])) {
                c_static.id_throws();
                if (c_static.id_case()) {
                    return c_static.id_class((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[id_throws[1]]);
                }
            }
        } else if ((string2.equalsIgnoreCase(id_case[12]) || string2.equalsIgnoreCase(id_case[13])) && c_static.id_case()) {
            return new v_1().id_break(((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_throws[2]]).id_byte().stream().map(rrqU_2::id_byte)).id_break().id_class(c_static.id_extends()).id_protected();
        }
        return Stream.empty();
    }

    private static void id_throws() {
        id_case = new String[]{new String("blockesp"), new String("add"), new String("remove"), new String("delete"), new String("clear"), new String("list"), new String("add, remove, clear, list"), new String("add"), new String("remove"), new String("clear"), new String("list"), new String("add"), new String("remove"), new String("delete"), new String("> %s%s add <\u0438\u043c\u044f> <\u0446\u0432\u0435\u0442> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0431\u043b\u043e\u043a \u0432 \u0441\u043f\u0438\u0441\u043e\u043a"), new String("> %s%s remove <\u0438\u043c\u044f> - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0431\u043b\u043e\u043a \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430"), new String("> %s%s clear - \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432"), new String("> %s%s list - \u043f\u0440\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s add diamond_ore cyan")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrug_1.id_protected();
        rrug_1.id_throws();
        rrug_1.id_extends();
        rrug_1.id_finally();
    }

    private static void id_finally() {
        id_catch = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_break[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_throws[4]];
        Object[] objectArray = new Object[id_catch[8]];
        objectArray[rrug_1.id_break[7]] = string2;
        objectArray[rrug_1.id_break[8]] = string;
        Object[] objectArray2 = new Object[id_catch[9]];
        objectArray2[rrug_1.id_break[9]] = string2;
        objectArray2[rrug_1.id_break[10]] = string;
        Object[] objectArray3 = new Object[id_catch[10]];
        objectArray3[rrug_1.id_break[11]] = string2;
        objectArray3[rrug_1.id_break[12]] = string;
        Object[] objectArray4 = new Object[id_catch[11]];
        objectArray4[rrug_1.id_break[13]] = string2;
        objectArray4[rrug_1.id_break[14]] = string;
        Object[] objectArray5 = new Object[id_catch[12]];
        objectArray5[rrug_1.id_break[15]] = string2;
        objectArray5[rrug_1.id_break[16]] = string;
        return List.of(id_case[14].formatted(objectArray), id_case[15].formatted(objectArray2), id_case[16].formatted(objectArray3), id_case[17].formatted(objectArray4), id_case[18], id_case[19].formatted(objectArray5));
    }

    private static void id_extends() {
        id_throws = new short[5];
    }

    @Override
    public String id_implements() {
        return "\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0445 \u0431\u043b\u043e\u043a\u043e\u0432 \u0432 \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[3]]).id_private().J().id_final() + "\"";
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

