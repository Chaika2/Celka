package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yz_3 {
   private static final Logger byte_ = LogManager.getLogger();
   private final PriorityQueue<yN_2> protected_ = Queues.newPriorityQueue();
   private final Queue<Hv_1> throws_;
   private final Queue<Runnable> case_ = Queues.newConcurrentLinkedQueue();
   private volatile int catch_;
   private volatile int private_;
   final Hv_1 implements_;
   private final rTh_1<Runnable> finally_;
   private final Executor extends_;
   rYB native_;
   final yX_2 volatile_;
   private rjU_2 final_ = rjU_2.class_;
   private final int package_;
   private final List<Hv_1> int_ = new ArrayList<>();
   public static final HU[] class_ = HU.public_().toArray(new HU[0]);
   static final boolean new_ = rrxr_3.rb.byte_();
   static final boolean continue_ = rrxr_3.Pt.byte_();
   static final boolean super_ = rrxr_3.Pt.byte_();
   static final boolean this_ = rrxr_3.rj.byte_();
   public static int break_;

   public boolean byte_() {
      boolean var1;
      Runnable var2;
      for (var1 = false; (var2 = this.case_.poll()) != null; var1 = true) {
         var2.run();
      }

      return var1;
   }

   public boolean byte_(yQ_2 var1) {
      if (this.throws_.isEmpty()) {
         return false;
      } else {
         var1.class_(this);
         return true;
      }
   }

   public yz_3(rYB var1, yX_2 var2, Executor var3, boolean var4, Hv_1 var5) {
      this(var1, var2, var3, var4, var5, -1);
   }

   public yz_3(rYB var1, yX_2 var2, Executor var3, boolean var4, Hv_1 var5, int var6) {
      this.native_ = var1;
      this.volatile_ = var2;
      int var7 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (HU.public_().stream().mapToInt(HU::goto_).sum() * 4) - 1);
      int var8 = Runtime.getRuntime().availableProcessors();
      int var9 = var4 ? var8 : Math.min(var8, 4);
      int var10 = Math.max(1, Math.min(var9, var7));
      if (var6 > 0) {
         var10 = var6;
      }

      this.implements_ = var5;
      ArrayList var11 = Lists.newArrayListWithExpectedSize(var10);

      try {
         for (int var12 = 0; var12 < var10; var12++) {
            var11.add(new Hv_1());
         }
      } catch (OutOfMemoryError var15) {
         byte_.warn("Allocated only {}/{} buffers", var11.size(), var10);
         int var13 = Math.min(var11.size() * 2 / 3, var11.size() - 1);

         for (int var14 = 0; var14 < var13; var14++) {
            var11.remove(var11.size() - 1);
         }

         System.gc();
      }

      this.throws_ = Queues.newConcurrentLinkedQueue(var11);
      this.private_ = this.throws_.size();
      this.package_ = this.private_;
      this.extends_ = var3;
      this.finally_ = rTh_1.class_(var3, "Chunk Renderer");
      this.finally_.class_(this::implements_);
   }

   public void class_(yN_2 var1) {
      this.finally_.class_(() -> {
         this.protected_.offer(var1);
         this.catch_ = this.protected_.size();
         this.implements_();
      });
   }

   public CompletableFuture<Void> class_(lD_2 var1, jm_3 var2) {
      return CompletableFuture.runAsync(() -> {
      }, this.case_::add).thenCompose(var3 -> this.break_(var1, var2));
   }

   public void class_(rYB var1) {
      this.native_ = var1;
   }

   public void class_(rjU_2 var1) {
      this.final_ = var1;
   }

   public String class_() {
      return String.format("pC: %03d, pU: %02d, aB: %02d", this.catch_, this.case_.size(), this.private_);
   }

   public void class_(yQ_2 var1) {
      var1.extends_();
   }

   public boolean break_(yQ_2 var1) {
      this.class_(var1);
      return true;
   }

   private CompletableFuture<Void> break_(lD_2 var1, jm_3 var2) {
      return var2.break_(var1);
   }

   public rjU_2 break_() {
      return this.final_;
   }

   public boolean throws_() {
      return this.catch_ == 0 && this.case_.isEmpty();
   }

   private void finally_() {
      while (!this.protected_.isEmpty()) {
         yN_2 var1 = this.protected_.poll();
         if (var1 != null) {
            var1.class_();
         }
      }

      this.catch_ = 0;
   }

   public void catch_() {
      long var1 = System.currentTimeMillis();
      if (this.int_.size() <= 0) {
         while (this.int_.size() != this.package_) {
            this.byte_();
            Hv_1 var3 = this.throws_.poll();
            if (var3 != null) {
               this.int_.add(var3);
            }

            if (System.currentTimeMillis() > var1 + 1000L) {
               break;
            }
         }
      }
   }

   public void case_() {
      this.finally_();
      this.finally_.close();
      this.throws_.clear();
   }

   private void implements_() {
      if (!this.throws_.isEmpty()) {
         yN_2 var1 = this.protected_.poll();
         if (var1 != null) {
            Hv_1 var2 = this.throws_.poll();
            if (var2 == null) {
               this.protected_.add(var1);
               return;
            }

            this.catch_ = this.protected_.size();
            this.private_ = this.throws_.size();
            CompletableFuture.runAsync(() -> {
            }, this.extends_).thenCompose(var2x -> var1.class_(var2)).whenComplete((var2x, var3) -> {
               if (var3 != null) {
                  KY var4 = KY.class_(var3, "Batching chunks");
                  QY.instanceof_().break_(QY.instanceof_().class_(var4));
               } else {
                  this.finally_.class_(() -> {
                     if (var2x == ym_3.SUCCESSFUL) {
                        var2.class_();
                     } else {
                        var2.break_();
                     }

                     this.throws_.add(var2);
                     this.private_ = this.throws_.size();
                     this.implements_();
                  });
               }
            });
         }
      }
   }

   public boolean protected_(yQ_2 var1) {
      return !this.throws_.isEmpty() && var1.class_(rrxA_2.protected_, this);
   }

   public void protected_() {
      this.finally_();
   }

   public void private_() {
      this.throws_.addAll(this.int_);
      this.int_.clear();
   }
}
