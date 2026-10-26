/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Fc_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.AutoDuel;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rql_3;
import celestial.rrAl_1;
import celestial.rrFI;
import celestial.rrFY;
import celestial.rrFw_1;
import celestial.rrIv_1;
import celestial.rrTF;
import celestial.rrZW;
import celestial.rrfw_3;
import celestial.rrns_3;
import celestial.rrtR_2;
import celestial.rrte_3;
import celestial.setting.Setting;
import celestial.uR_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryA
extends rrTF<AutoDuel> {
    private static double[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static String[] id_protected;
    private static byte[] id_case;
    private static short[] id_catch;
    private static float[] id_private;

    private static void id_byte() {
        short[] sArray = new short[30];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[7] = 3;
        sArray[8] = 73;
        sArray[11] = 3000;
        sArray[13] = 1;
        sArray[14] = 57;
        sArray[15] = 3;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 55;
        sArray[19] = 57;
        sArray[20] = 4;
        sArray[21] = 2;
        sArray[23] = 57;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 3;
        sArray[28] = 3;
        id_catch = sArray;
    }

    public rryA(AutoDuel autoDuel) {
        super(autoDuel);
        ArrayList arrayList;
        this.id_private();
        rrIv_1 rrIv_12 = new rrIv_1(id_protected[0], id_protected[1], rrte_3.id_class((Pattern)rrtR_2.id_class[id_catch[0]])).id_class(id_private[0]);
        this.id_class[rryA.id_catch[1]] = rrIv_12;
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rryA.id_catch[2]] = rrfw_32;
        rrfw_3 rrfw_33 = new rrfw_3();
        this.id_class[rryA.id_catch[3]] = rrfw_33;
        this.id_class[rryA.id_catch[4]] = arrayList = new ArrayList();
        autoDuel.id_class((Setting)((rrIv_1)this.id_class[id_catch[5]]).id_class(() -> autoDuel.id_new() == this ? id_byte[14] : id_byte[15]));
    }

    static {
        rryA.ntfClinit();
    }

    private rdn_3 id_class(List<rdn_3> list) {
        this.id_private();
        String string = ((rrIv_1)this.id_class[id_catch[22]]).id_extends();
        for (rdn_3 rdn_32 : list) {
            if (rdn_32.id_class() || !rdn_32.id_continue().id_byte().equalsIgnoreCase(string)) continue;
            return rdn_32;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @EventTarget
    public void id_class(rrns_3 var1_1) {
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

    private List<String> id_class(boolean bl) {
        Predicate<String> predicate = string -> {
            this.id_private();
            if (((List)this.id_class[id_catch[28]]).contains(string)) {
                return id_byte[10];
            }
            if (string.equals(id_import.id_while().id_byte())) {
                return id_byte[11];
            }
            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_catch[29]]).id_break((String)string)) {
                return id_byte[12];
            }
            return id_byte[13];
        };
        return uR_2.id_class((Aq_1)((cb_3)rryA.id_import.id_class[rryA.id_catch[23]]).id_break[id_catch[24]], bl).stream().map(aw_1 -> rql_3.id_class(aw_1.id_class().getName())).filter(predicate).toList();
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_private();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[6]])) {
            List<String> list = this.id_class(id_byte[0]);
            if (list.isEmpty()) {
                ((List)this.id_class[id_catch[7]]).clear();
            }
            if (!list.isEmpty() && !((vm_3)rryA.id_import.id_class[id_catch[8]] instanceof Fc_1)) {
                String string = list.get(id_byte[1]);
                this.id_break(string);
            }
        }
    }

    @EventTarget
    public void id_class(rrFY rrFY2) {
        ((AutoDuel)this.id_continue()).id_byte(id_byte[8]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97067B1C;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{11, -125, -43, -16, 68, 68, -122, 103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrFw_1 rrFw_12) {
        if (rrFw_12.id_class() == (rrFI)((Object)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_catch[12]])) {
            ((AutoDuel)this.id_continue()).aw_();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x902C5E7BF51E6678L;
    }

    @EventTarget
    public void id_class(rrAl_1 rrAl_12) {
        if (rrAl_12.id_class() > id_private[1]) {
            ((AutoDuel)this.id_continue()).aw_();
        }
    }

    private static void id_class() {
        id_private = new float[]{80.0f, 10.0f};
    }

    private rdn_3 id_break(List<rdn_3> list) {
        for (rdn_3 rdn_32 : list) {
            if (rdn_32.id_class() || !rdn_32.id_continue().id_byte().equalsIgnoreCase(id_protected[4])) continue;
            return rdn_32;
        }
        return null;
    }

    private void id_break(int n) {
        this.id_private();
        if (((rrfw_3)this.id_class[id_catch[17]]).id_class(id_break[1])) {
            ((Ax_1)rryA.id_import.id_class[id_catch[18]]).id_break(((rJr_1)((cb_3)rryA.id_import.id_class[rryA.id_catch[19]]).id_implements[rryA.id_catch[20]]).id_case, n, id_case[2], rXa_1.CLONE, id_byte[9]);
            ((rrfw_3)this.id_class[id_catch[21]]).id_class();
        }
    }

    private static void id_break() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[13] = true;
        blArray[14] = true;
        id_byte = blArray;
    }

    private void id_break(String string) {
        this.id_private();
        if (((rrfw_3)this.id_class[id_catch[13]]).id_class(id_break[0])) {
            ((cb_3)rryA.id_import.id_class[id_catch[14]]).id_protected("/duel " + string);
            ((List)this.id_class[id_catch[15]]).add(string);
            ((rrfw_3)this.id_class[id_catch[16]]).id_class();
        }
    }

    private static void id_throws() {
        id_case = new byte[]{-1, 10, 2, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rryA.id_break();
        rryA.id_protected();
        rryA.id_byte();
        rryA.id_class();
        rryA.id_implements();
        rryA.id_throws();
    }

    private void id_case() {
        this.id_private();
        ((rrfw_3)this.id_class[id_catch[25]]).id_class();
        ((rrfw_3)this.id_class[id_catch[26]]).id_class();
        ((List)this.id_class[id_catch[27]]).clear();
    }

    private static void id_implements() {
        id_break = new double[]{200.0, 200.0};
    }

    private static void id_protected() {
        id_protected = new String[]{new String("\u0412\u044b\u0431\u043e\u0440 \u0440\u0435\u0436\u0438\u043c\u0430"), new String("\u0422\u043e\u0442\u0435\u043c\u044b"), new String("\u0412\u044b\u0431\u043e\u0440 \u043d\u0430\u0431\u043e\u0440\u0430 (1/1)"), new String("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u043e\u0435\u0434\u0438\u043d\u043a\u0430"), new String("\u041e\u0422\u041f\u0420\u0410\u0412\u0418\u0422\u042c \u0417\u0410\u041f\u0420\u041e\u0421")};
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
        }
    }

    @Override
    public boolean aK_() {
        this.id_case();
        return super.aK_();
    }
}

