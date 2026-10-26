/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.module.combat.AttackAura;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnU_2
extends Record
implements Comparator<iB_2> {
    public AttackAura id_class;
    private static short[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_throws = blArray;
    }

    public rrnU_2(AttackAura attackAura) {
        this.id_class = attackAura;
    }

    static {
        rrnU_2.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{rrnU_2.class, "attackAuraModule", "id_class"}, this, object);
    }

    @Override
    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{rrnU_2.class, "attackAuraModule", "id_class"}, this);
    }

    @Override
    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{rrnU_2.class, "attackAuraModule", "id_class"}, this);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((iB_2)object, (iB_2)object2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9D3A963246F51AACL;
    }

    public AttackAura id_class() {
        return this.id_class;
    }

    /*
     * Exception decompiling
     */
    public int id_class(iB_2 var1_1, iB_2 var2_2) {
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
        return Integer.rotateLeft(n, 16) ^ 0x3660E274;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, -31, -90, 89, 23, -92, 121, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new byte[]{-1, 2};
    }

    private static void id_throws() {
        id_byte = new String[]{new String("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435"), new String("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f"), new String("\u041f\u043e\u043b\u0435 \u0437\u0440\u0435\u043d\u0438\u044f")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnU_2.id_byte();
        rrnU_2.id_throws();
        rrnU_2.id_protected();
        rrnU_2.id_break();
    }

    private static void id_protected() {
        id_break = new short[]{57, 57, 57, 57, 57, 57, 57, 15, 57, 15, 57, 57};
    }
}

