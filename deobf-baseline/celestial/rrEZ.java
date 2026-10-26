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
   private static final Logger id_class = LogManager.getLogger();
   private final rTh_1<Runnable> id_break;
   private final ObjectList<Pair<rrEv_1, Runnable>> id_byte = new ObjectArrayList();
   private final rrEx_1 id_protected;
   private final rTX<roL_2<Runnable>> id_throws;
   private volatile int id_case = 5;
   private final AtomicBoolean id_catch = new AtomicBoolean();

   private void id_byte() {
      int var1 = Math.min(this.id_byte.size(), this.id_case);
      ObjectListIterator var2 = this.id_byte.iterator();

      int var3;
      for (var3 = 0; var2.hasNext() && var3 < var1; var3++) {
         Pair var4 = (Pair)var2.next();
         if (var4.getFirst() == rrEv_1.PRE_UPDATE) {
            ((Runnable)var4.getSecond()).run();
         }
      }

      var2.back(var3);
      super.id_class(Integer.MAX_VALUE, true, true);

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
      this.id_protected = var2;
      this.id_throws = var5;
      this.id_break = var4;
   }

   @Override
   public void id_class(rfH_2 var1) {
      rfH_2 var2 = var1.id_int();
      this.id_class(var1.b_() >> 4, var1.d_() >> 4, rrEv_1.POST_UPDATE, rqR_2.id_class(() -> super.id_class(var2), () -> "checkBlock " + var2));
   }

   protected void id_class(rfj_3 var1) {
      this.id_class(var1.id_break, var1.id_byte, () -> 0, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> {
         super.id_break(var1, false);
         super.id_class(var1, false);

         for (int var2 = -1; var2 < 17; var2++) {
            super.id_class(rRo_1.BLOCK, rjh_3.id_class(var1, var2), (roH_2)null, true);
            super.id_class(rRo_1.SKY, rjh_3.id_class(var1, var2), (roH_2)null, true);
         }

         for (int var3 = 0; var3 < 16; var3++) {
            super.id_class(rjh_3.id_class(var1, var3), true);
         }
      }, () -> "updateChunkStatus " + var1 + " true"));
   }

   @Override
   public int id_class(int var1, boolean var2, boolean var3) {
      throw (UnsupportedOperationException)rqR_2.id_byte(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void id_class(rfH_2 var1, int var2) {
      throw (UnsupportedOperationException)rqR_2.id_byte(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void id_class(rfj_3 var1, boolean var2) {
      this.id_class(var1.id_break, var1.id_byte, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> super.id_class(var1, var2), () -> "enableLight " + var1 + " " + var2));
   }

   public CompletableFuture<roC_2> id_class(roC_2 var1, boolean var2) {
      rfj_3 var3 = var1.id_private();
      var1.id_protected(false);
      this.id_class(var3.id_break, var3.id_byte, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> {
         roQ_2[] var4 = var1.id_byte();

         for (int var5 = 0; var5 < 16; var5++) {
            roQ_2 var6 = var4[var5];
            if (!roQ_2.id_class(var6)) {
               super.id_class(rjh_3.id_class(var3, var5), false);
            }
         }

         super.id_class(var3, true);
         if (!var2) {
            var1.id_package().forEach(var2xx -> super.id_class(var2xx, var1.id_catch(var2xx)));
         }

         this.id_protected.id_protected(var3);
      }, () -> "lightChunk " + var3 + " " + var2));
      return CompletableFuture.supplyAsync(() -> {
         var1.id_protected(true);
         super.id_break(var3, false);
         return var1;
      }, var2x -> this.id_class(var3.id_break, var3.id_byte, rrEv_1.POST_UPDATE, var2x));
   }

   private void id_class(int var1, int var2, rrEv_1 var3, Runnable var4) {
      this.id_class(var1, var2, this.id_protected.id_byte(rfj_3.id_class(var1, var2)), var3, var4);
   }

   private void id_class(int var1, int var2, IntSupplier var3, rrEv_1 var4, Runnable var5) {
      this.id_throws.id_class(roF_2.id_class(() -> {
         this.id_byte.add(Pair.of(var4, var5));
         if (this.id_byte.size() >= this.id_case) {
            this.id_byte();
         }
      }, rfj_3.id_class(var1, var2), var3));
   }

   @Override
   public void id_class(rRo_1 var1, rjh_3 var2, roH_2 var3, boolean var4) {
      this.id_class(
         var2.id_break(),
         var2.id_protected(),
         () -> 0,
         rrEv_1.PRE_UPDATE,
         rqR_2.id_class(() -> super.id_class(var1, var2, var3, var4), () -> "queueData " + var2)
      );
   }

   public void id_class(int var1) {
      this.id_case = var1;
   }

   @Override
   public void id_class(rjh_3 var1, boolean var2) {
      this.id_class(
         var1.id_break(),
         var1.id_protected(),
         () -> 0,
         rrEv_1.PRE_UPDATE,
         rqR_2.id_class(() -> super.id_class(var1, var2), () -> "updateSectionStatus " + var1 + " " + var2)
      );
   }

   @Override
   public void close() {
   }

   @Override
   public void id_break(rfj_3 var1, boolean var2) {
      this.id_class(var1.id_break, var1.id_byte, () -> 0, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> super.id_break(var1, var2), () -> "retainData " + var1));
   }

   public void id_break() {
      if ((!this.id_byte.isEmpty() || super.id_class()) && this.id_catch.compareAndSet(false, true)) {
         this.id_break.id_class(() -> {
            this.id_byte();
            this.id_catch.set(false);
         });
      }
   }
}
