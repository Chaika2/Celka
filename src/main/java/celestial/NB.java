/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.NA;
import celestial.NC;
import celestial.NP;
import celestial.Nq_1;
import celestial.Nz_1;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class NB {
    private final rAL id_class;
    private final Map<rqO_2, CompletableFuture<NP>> id_break = Maps.newHashMap();

    public NB(rAL rAL2) {
        this.id_class = rAL2;
    }

    public CompletableFuture<NP> id_class(rqO_2 rqO_23) {
        return this.id_break.computeIfAbsent(rqO_23, rqO_22 -> CompletableFuture.supplyAsync(() -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }, rqR_2.id_case()));
    }

    public CompletableFuture<Nz_1> id_class(rqO_2 rqO_22, boolean bl) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                rAF rAF2 = this.id_class.id_class(rqO_22);
                InputStream inputStream = rAF2.id_break();
                return bl ? new NC(NA::new, inputStream) : new NA(inputStream);
            }
            catch (IOException iOException) {
                throw new CompletionException(iOException);
            }
        }, rqR_2.id_case());
    }

    public void id_class() {
        this.id_break.values().forEach(completableFuture -> completableFuture.thenAccept(NP::id_break));
        this.id_break.clear();
    }

    public CompletableFuture<?> id_class(Collection<Nq_1> collection) {
        return CompletableFuture.allOf((CompletableFuture[])collection.stream().map(nq_1 -> this.id_class(nq_1.id_protected())).toArray(CompletableFuture[]::new));
    }
}

