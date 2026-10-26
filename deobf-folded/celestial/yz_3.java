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
   private static final Logger id_byte = LogManager.getLogger();
   private final PriorityQueue<yN_2> id_protected = Queues.newPriorityQueue();
   private final Queue<Hv_1> id_throws;
   private final Queue<Runnable> id_case = Queues.newConcurrentLinkedQueue();
   private volatile int id_catch;
   private volatile int id_private;
   final Hv_1 id_implements;
   private final rTh_1<Runnable> id_finally;
   private final Executor id_extends;
   rYB id_native;
   final yX_2 id_volatile;
   private rjU_2 id_final = rjU_2.id_class;
   private final int id_package;
   private final List<Hv_1> id_int = new ArrayList<>();
   public static final HU[] id_class = HU.id_public().toArray(new HU[0]);
   static final boolean id_new = rrxr_3.rb.id_byte();
   static final boolean id_continue = rrxr_3.Pt.id_byte();
   static final boolean id_super = rrxr_3.Pt.id_byte();
   static final boolean id_this = rrxr_3.rj.id_byte();
   public static int id_break;

   public boolean id_byte() {
      boolean var1;
      Runnable var2;
      for (var1 = false; (var2 = this.id_case.poll()) != null; var1 = true) {
         var2.run();
      }

      return var1;
   }

   public boolean id_byte(yQ_2 var1) {
      if (this.id_throws.isEmpty()) {
         return false;
      } else {
         var1.id_class(this);
         return true;
      }
   }

   public yz_3(rYB var1, yX_2 var2, Executor var3, boolean var4, Hv_1 var5) {
      this(var1, var2, var3, var4, var5, -1);
   }

   public yz_3(rYB var1, yX_2 var2, Executor var3, boolean var4, Hv_1 var5, int var6) {
      this.id_native = var1;
      this.id_volatile = var2;
      int var7 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (HU.id_public().stream().mapToInt(HU::id_goto).sum() * 4) - 1);
      int var8 = Runtime.getRuntime().availableProcessors();
      int var9 = var4 ? var8 : Math.min(var8, 4);
      int var10 = Math.max(1, Math.min(var9, var7));
      if (var6 > 0) {
         var10 = var6;
      }

      this.id_implements = var5;
      ArrayList var11 = Lists.newArrayListWithExpectedSize(var10);

      try {
         for (int var12 = 0; var12 < var10; var12++) {
            var11.add(new Hv_1());
         }
      } catch (OutOfMemoryError var15) {
         id_byte.warn("Allocated only {}/{} buffers", var11.size(), var10);
         int var13 = Math.min(var11.size() * 2 / 3, var11.size() - 1);

         for (int var14 = 0; var14 < var13; var14++) {
            var11.remove(var11.size() - 1);
         }

         System.gc();
      }

      this.id_throws = Queues.newConcurrentLinkedQueue(var11);
      this.id_private = this.id_throws.size();
      this.id_package = this.id_private;
      this.id_extends = var3;
      this.id_finally = rTh_1.id_class(var3, "Chunk Renderer");
      this.id_finally.id_class(this::id_implements);
   }

   public void id_class(yN_2 var1) {
      this.id_finally.id_class(() -> {
         this.id_protected.offer(var1);
         this.id_catch = this.id_protected.size();
         this.id_implements();
      });
   }

   public CompletableFuture<Void> id_class(lD_2 var1, jm_3 var2) {
      return CompletableFuture.runAsync(() -> {
      }, this.id_case::add).thenCompose(var3 -> this.id_break(var1, var2));
   }

   public void id_class(rYB var1) {
      this.id_native = var1;
   }

   public void id_class(rjU_2 var1) {
      this.id_final = var1;
   }

   public String id_class() {
      return String.format("pC: %03d, pU: %02d, aB: %02d", this.id_catch, this.id_case.size(), this.id_private);
   }

   public void id_class(yQ_2 var1) {
      var1.id_extends();
   }

   public boolean id_break(yQ_2 var1) {
      this.id_class(var1);
      return true;
   }

   private CompletableFuture<Void> id_break(lD_2 var1, jm_3 var2) {
      return var2.id_break(var1);
   }

   public rjU_2 id_break() {
      return this.id_final;
   }

   public boolean id_throws() {
      return this.id_catch == 0 && this.id_case.isEmpty();
   }

   private void id_finally() {
      while (!this.id_protected.isEmpty()) {
         yN_2 var1 = this.id_protected.poll();
         if (var1 != null) {
            var1.id_class();
         }
      }

      this.id_catch = 0;
   }

   public void id_catch() {
      long var1 = System.currentTimeMillis();
      if (this.id_int.size() <= 0) {
         while (this.id_int.size() != this.id_package) {
            this.id_byte();
            Hv_1 var3 = this.id_throws.poll();
            if (var3 != null) {
               this.id_int.add(var3);
            }

            if (System.currentTimeMillis() > var1 + 1000L) {
               break;
            }
         }
      }
   }

   public void id_case() {
      this.id_finally();
      this.id_finally.close();
      this.id_throws.clear();
   }

   private void id_implements() {
      if (!this.id_throws.isEmpty()) {
         yN_2 var1 = this.id_protected.poll();
         if (var1 != null) {
            Hv_1 var2 = this.id_throws.poll();
            if (var2 == null) {
               this.id_protected.add(var1);
               return;
            }

            this.id_catch = this.id_protected.size();
            this.id_private = this.id_throws.size();
            CompletableFuture.runAsync(() -> {
            }, this.id_extends).thenCompose(var2x -> var1.id_class(var2)).whenComplete((var2x, var3) -> {
               if (var3 != null) {
                  KY var4 = KY.id_class(var3, "Batching chunks");
                  QY.id_instanceof().id_break(QY.id_instanceof().id_class(var4));
               } else {
                  this.id_finally.id_class(() -> {
                     if (var2x == ym_3.SUCCESSFUL) {
                        var2.id_class();
                     } else {
                        var2.id_break();
                     }

                     this.id_throws.add(var2);
                     this.id_private = this.id_throws.size();
                     this.id_implements();
                  });
               }
            });
         }
      }
   }

   public boolean id_protected(yQ_2 var1) {
      return !this.id_throws.isEmpty() && var1.id_class(rrxA_2.id_protected, this);
   }

   public void id_protected() {
      this.id_finally();
   }

   public void id_private() {
      this.id_throws.addAll(this.id_int);
      this.id_int.clear();
   }
}
