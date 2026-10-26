/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rrfb_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfG_2 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrfG_2(rrfb_3 rrfb_32) {
        this.id_byte();
        rrfb_3 rrfb_33 = rrfb_32;
        this.id_class[rrfG_2.id_byte[7]] = rrfb_33;
    }

    static {
        rrfG_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[2];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[3];
        }
        rrfG_2 rrfG_22 = (rrfG_2)object;
        return (rrfb_3)((Object)this.id_class[id_byte[3]]) == (rrfb_3)((Object)rrfG_22.id_class[id_byte[4]]) ? id_break[4] : id_break[5];
    }

    public int hashCode() {
        return Objects.hashCode((Object)((rrfb_3)((Object)this.id_class[id_byte[5]])));
    }

    public rrfb_3 id_class() {
        return (rrfb_3)((Object)this.id_class[id_byte[6]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x36A300FB874697CAL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 19, 1, -111, 61, -41, -107, 103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA6B8137B;
    }

    /*
     * Exception decompiling
     */
    public static rrfG_2 id_class(rdn_3 var0) {
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

    private static void id_break() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        id_byte = sArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfG_2.id_throws();
        rrfG_2.id_protected();
        rrfG_2.id_break();
        rrfG_2.id_case();
    }

    private static void id_case() {
        id_throws = new byte[]{-1, 2};
    }

    private static void id_protected() {
        id_protected = new String[]{new String("id"), new String("loots:summon:mystic/loot3"), new String("loots:summon:mystic/loot2"), new String("loots:summon:mystic/loot1")};
    }
}

