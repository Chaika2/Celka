package celestial;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEZ extends rrse_3 implements AutoCloseable {
   private static final Logger class_ = LogManager.getLogger();
   private final rTh_1<Runnable> break_;
   private final ObjectList<Pair<rrEv_1, Runnable>> byte_ = new ObjectArrayList();
   private final rrEx_1 protected_;
   private final rTX<roL_2<Runnable>> throws_;
   private volatile int case_ = 5;
   private final AtomicBoolean catch_ = new AtomicBoolean();

   private void byte_() {
      int var1 = Math.min(this.byte_.size(), this.case_);
      ObjectListIterator var2 = this.byte_.iterator();

      int var3;
      for (var3 = 0; var2.hasNext() && var3 < var1; var3++) {
         Pair var4 = (Pair)var2.next();
         if (var4.getFirst() == rrEv_1.PRE_UPDATE) {
            ((Runnable)var4.getSecond()).run();
         }
      }

      var2.back(var3);
      super.class_(Integer.MAX_VALUE, true, true);

      for (int var6 = 0; var2.hasNext() && var6 < var1; var6++) {
         Pair var5 = (Pair)var2.next();
         if (var5.getFirst() == rrEv_1.POST_UPDATE) {
            ((Runnable)var5.getSecond()).run();
         }

         var2.remove();
      }
   }

   public rrEZ(rol_3 var1, rrEx_1 var2, boolean var3, rTh_1<Runnable> var4, rTX<roL_2<Runnable>> var5) {
      super(var1, true, var3);
      this.protected_ = var2;
      this.throws_ = var5;
      this.break_ = var4;
   }

   @Override
   public void class_(rfH_2 var1) {
      rfH_2 var2 = var1.int_();
      this.class_(var1.b_() >> 4, var1.d_() >> 4, rrEv_1.POST_UPDATE, rqR_2.class_(() -> super.class_(var2), () -> "checkBlock " + var2));
   }

   protected void class_(rfj_3 var1) {
      this.class_(var1.break_, var1.byte_, () -> 0, rrEv_1.PRE_UPDATE, rqR_2.class_(() -> {
         super.break_(var1, false);
         super.class_(var1, false);

         for (int var2 = -1; var2 < 17; var2++) {
            super.class_(rRo_1.BLOCK, rjh_3.class_(var1, var2), (roH_2)null, true);
            super.class_(rRo_1.SKY, rjh_3.class_(var1, var2), (roH_2)null, true);
         }

         for (int var3 = 0; var3 < 16; var3++) {
            super.class_(rjh_3.class_(var1, var3), true);
         }
      }, () -> "updateChunkStatus " + var1 + " true"));
   }

   @Override
   public int class_(int var1, boolean var2, boolean var3) {
      throw (UnsupportedOperationException)rqR_2.byte_(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void class_(rfH_2 var1, int var2) {
      throw (UnsupportedOperationException)rqR_2.byte_(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void class_(rfj_3 var1, boolean var2) {
      this.class_(var1.break_, var1.byte_, rrEv_1.PRE_UPDATE, rqR_2.class_(() -> super.class_(var1, var2), () -> "enableLight " + var1 + " " + var2));
   }

   public CompletableFuture<roC_2> class_(roC_2 var1, boolean var2) {
      rfj_3 var3 = var1.private_();
      var1.protected_(false);
      this.class_(var3.break_, var3.byte_, rrEv_1.PRE_UPDATE, rqR_2.class_(() -> {
         roQ_2[] var4 = var1.byte_();

         for (int var5 = 0; var5 < 16; var5++) {
            roQ_2 var6 = var4[var5];
            if (!roQ_2.class_(var6)) {
               super.class_(rjh_3.class_(var3, var5), false);
            }
         }

         super.class_(var3, true);
         if (!var2) {
            var1.package_().forEach(var2xx -> super.class_(var2xx, var1.catch_(var2xx)));
         }

         this.protected_.protected_(var3);
      }, () -> "lightChunk " + var3 + " " + var2));
      return CompletableFuture.supplyAsync(() -> {
         var1.protected_(true);
         super.break_(var3, false);
         return var1;
      }, var2x -> this.class_(var3.break_, var3.byte_, rrEv_1.POST_UPDATE, var2x));
   }

   private void class_(int var1, int var2, rrEv_1 var3, Runnable var4) {
      this.class_(var1, var2, this.protected_.byte_(rfj_3.class_(var1, var2)), var3, var4);
   }

   private void class_(int var1, int var2, IntSupplier var3, rrEv_1 var4, Runnable var5) {
      this.throws_.class_(roF_2.class_(() -> {
         this.byte_.add(Pair.of(var4, var5));
         if (this.byte_.size() >= this.case_) {
            this.byte_();
         }
      }, rfj_3.class_(var1, var2), var3));
   }

   @Override
   public void class_(rRo_1 var1, rjh_3 var2, roH_2 var3, boolean var4) {
      this.class_(
         var2.break_(), var2.protected_(), () -> 0, rrEv_1.PRE_UPDATE, rqR_2.class_(() -> super.class_(var1, var2, var3, var4), () -> "queueData " + var2)
      );
   }

   public void class_(int var1) {
      this.case_ = var1;
   }

   @Override
   public void class_(rjh_3 var1, boolean var2) {
      this.class_(
         var1.break_(),
         var1.protected_(),
         () -> 0,
         rrEv_1.PRE_UPDATE,
         rqR_2.class_(() -> super.class_(var1, var2), () -> "updateSectionStatus " + var1 + " " + var2)
      );
   }

   @Override
   public void close() {
   }

   @Override
   public void break_(rfj_3 var1, boolean var2) {
      this.class_(var1.break_, var1.byte_, () -> 0, rrEv_1.PRE_UPDATE, rqR_2.class_(() -> super.break_(var1, var2), () -> "retainData " + var1));
   }

   public void break_() {
      if ((!this.byte_.isEmpty() || super.class_()) && this.catch_.compareAndSet(false, true)) {
         this.break_.class_(() -> {
            this.byte_();
            this.catch_.set(false);
         });
      }
   }
}
