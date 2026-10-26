/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.h_1;
import celestial.rrjD_2;
import celestial.rrje_3;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmf_3
extends C_try {
    private static short[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static String[] id_catch;

    public rrmf_3(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[rrmf_3.id_throws[0]] = id_catch[0];
        stringArray[rrmf_3.id_throws[1]] = id_catch[1];
        stringArray[rrmf_3.id_case[1]] = id_catch[2];
        stringArray[rrmf_3.id_case[2]] = id_catch[3];
        super(c_case, stringArray);
    }

    static {
        rrmf_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3A5C788F9EE7DED7L;
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
        return Integer.rotateLeft(n, 16) ^ 0xEE029719;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{57, -88, -73, -2, -32, 46, -37, -119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            String[] stringArray = new String[id_case[7]];
            stringArray[rrmf_3.id_throws[4]] = id_catch[10];
            stringArray[rrmf_3.id_throws[5]] = id_catch[11];
            stringArray[rrmf_3.id_case[8]] = id_catch[12];
            stringArray[rrmf_3.id_case[9]] = id_catch[13];
            return new v_1().id_break(stringArray).id_class(c_static.id_extends()).id_protected();
        }
        String string2 = c_static.id_extends();
        if (string2.equalsIgnoreCase(id_catch[14]) && c_static.id_break(id_case[10])) {
            c_static.id_throws();
            return c_static.id_class((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[id_break[0]]);
        }
        if ((string2.equalsIgnoreCase(id_catch[15]) || string2.equalsIgnoreCase(id_catch[16])) && c_static.id_case()) {
            return new v_1().id_break(((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_break[1]])).id_byte().stream().map(rrjD_2::id_byte)).id_class(c_static.id_implements()).id_break().id_protected();
        }
        return Stream.empty();
    }

    private static void id_throws() {
        id_case = new byte[]{4, 2, 3, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmf_3.id_finally();
        rrmf_3.id_extends();
        rrmf_3.id_protected();
        rrmf_3.id_throws();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[21];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        id_throws = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_throws[6]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[2]];
        Object[] objectArray = new Object[id_case[11]];
        objectArray[rrmf_3.id_throws[7]] = string2;
        objectArray[rrmf_3.id_throws[8]] = string;
        Object[] objectArray2 = new Object[id_case[12]];
        objectArray2[rrmf_3.id_throws[9]] = string2;
        objectArray2[rrmf_3.id_throws[10]] = string;
        Object[] objectArray3 = new Object[id_case[13]];
        objectArray3[rrmf_3.id_throws[11]] = string2;
        objectArray3[rrmf_3.id_throws[12]] = string;
        Object[] objectArray4 = new Object[id_case[14]];
        objectArray4[rrmf_3.id_throws[13]] = string2;
        objectArray4[rrmf_3.id_throws[14]] = string;
        Object[] objectArray5 = new Object[id_case[15]];
        objectArray5[rrmf_3.id_throws[15]] = string2;
        objectArray5[rrmf_3.id_throws[16]] = string;
        Object[] objectArray6 = new Object[id_case[16]];
        objectArray6[rrmf_3.id_throws[17]] = string2;
        objectArray6[rrmf_3.id_throws[18]] = string;
        Object[] objectArray7 = new Object[id_case[17]];
        objectArray7[rrmf_3.id_throws[19]] = string2;
        objectArray7[rrmf_3.id_throws[20]] = string;
        return List.of(id_catch[18].formatted(objectArray), id_catch[19].formatted(objectArray2), id_catch[20].formatted(objectArray3), id_catch[21].formatted(objectArray4), id_catch[22].formatted(objectArray5), id_catch[23].formatted(objectArray6), id_catch[24], id_catch[25].formatted(objectArray7));
    }

    private static void id_extends() {
        id_catch = new String[]{new String("way"), new String("waypoint"), new String("waypoints"), new String("gps"), new String("add"), new String("remove"), new String("delete"), new String("clear"), new String("list"), new String("add, remove, clear, list"), new String("add"), new String("remove"), new String("clear"), new String("list"), new String("add"), new String("remove"), new String("delete"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043f\u0443\u0442\u0435\u0439"), new String("> %s%s add <\u0438\u043c\u044f> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442 \u043d\u0430 \u0432\u0430\u0448\u0443 \u043f\u043e\u0437\u0438\u0446\u0438\u044e"), new String("> %s%s add <\u0438\u043c\u044f> <x y z> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442 \u043d\u0430 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e"), new String("> %s%s add <x y z> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442 \u043d\u0430 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0431\u0435\u0437 \u0438\u043c\u0435\u043d\u0438"), new String("> %s%s remove <\u0438\u043c\u044f> - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442"), new String("> %s%s clear - \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0432\u0441\u0435 \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u044b"), new String("> %s%s list - \u043f\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u043e\u0432"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s add home 1000 70 -1000")};
    }

    @Override
    public String id_implements() {
        return id_catch[17];
    }

    private static void id_protected() {
        id_break = new short[3];
    }
}

