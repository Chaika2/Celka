/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ok_1;
import celestial.rrjB_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjP_2
implements Hx_1 {
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    public static Object[] id_break;
    private static float[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[1] = Float.valueOf(0.0f);
            this.id_class[2] = false;
        }
    }

    private rrjP_2() {
        this.id_byte();
        Float f = Float.valueOf(id_throws[0]);
        this.id_class[rrjP_2.id_protected[0]] = f;
        Boolean bl = id_case[0];
        this.id_class[rrjP_2.id_protected[1]] = bl;
    }

    static {
        rrjP_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, 0, -19, 12, -44, -13, 30, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB7C87DDE301EB6FL;
    }

    public rrjP_2 id_class(Hx_1 hx_1, float f) {
        return this.id_class(hx_1, f, id_case[1]);
    }

    public rrjP_2 id_class(Hx_1 hx_1, float f, boolean bl) {
        Hx_1 hx_12 = hx_1;
        this.id_class[rrjP_2.id_protected[2]] = hx_12;
        Float f2 = Float.valueOf(f);
        this.id_class[rrjP_2.id_protected[3]] = f2;
        Boolean bl2 = bl;
        this.id_class[rrjP_2.id_protected[4]] = bl2;
        return this;
    }

    /*
     * Exception decompiling
     */
    private static HU id_class(HU var0) {
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
        return Integer.rotateLeft(n, 16) ^ 0x63B0ED81;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_case = blArray;
    }

    private static void id_throws() {
        id_byte = new byte[]{-1, 2, 3, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjP_2.id_break();
        rrjP_2.id_protected();
        rrjP_2.id_private();
        rrjP_2.id_case();
        rrjP_2.id_throws();
        rrjP_2.id_catch();
    }

    @Override
    public Ok_1 getBuffer(HU hU) {
        HU hU2 = rrjP_2.id_class(hU);
        Ok_1 ok_1 = ((Hx_1)this.id_class[id_protected[5]]).getBuffer(hU2);
        return (Boolean)this.id_class[id_protected[6]] != false ? new rrjB_2().id_class(ok_1, ((Float)this.id_class[id_protected[7]]).floatValue()) : ok_1;
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrjP_2()};
        id_break = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 2;
        sArray[7] = 1;
        id_protected = sArray;
    }

    private static void id_protected() {
        id_catch = new String[]{new String("entity_cutout"), new String("entity_solid"), new String("entity_cutout_no_cull"), new String("entity_cutout_no_cull_z_offset")};
    }

    private static void id_private() {
        float[] fArray = new float[2];
        fArray[0] = 1.0f;
        id_throws = fArray;
    }
}

