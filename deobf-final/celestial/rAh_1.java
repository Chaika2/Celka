package celestial;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class rAh_1 implements AutoCloseable {
   private static final CompletableFuture<rqg_3> class_ = CompletableFuture.completedFuture(rqg_3.INSTANCE);
   private final rAv_1 break_ = new rAj_1(rAI.SERVER_DATA);
   private final gp_3 byte_;
   private final rWB protected_ = new rWB();
   private final rlu_3 throws_ = new rlu_3();
   private final rzZ_2 case_ = new rzZ_2();
   private final rzC_2 catch_ = new rzC_2(this.case_);
   private final Of_1 private_ = new Of_1(this.case_);
   private final rAQ implements_;

   public rzC_2 byte_() {
      return this.catch_;
   }

   public rAh_1(gq_3 var1, int var2) {
      this.byte_ = new gp_3(var1);
      this.implements_ = new rAQ(var2, this.byte_.class_());
      this.break_.class_(this.throws_);
      this.break_.class_(this.case_);
      this.break_.class_(this.protected_);
      this.break_.class_(this.catch_);
      this.break_.class_(this.implements_);
      this.break_.class_(this.private_);
   }

   public rAQ class_() {
      return this.implements_;
   }

   public static CompletableFuture<rAh_1> class_(List<rAC> var0, gq_3 var1, int var2, Executor var3, Executor var4) {
      rAh_1 var5 = new rAh_1(var1, var2);
      CompletableFuture var6 = var5.break_.class_(var3, var4, var0, class_);
      return var6.whenComplete((var1x, var2x) -> {
         if (var2x != null) {
            var5.close();
         }
      }).thenApply(var1x -> var5);
   }

   @Override
   public void close() {
      this.break_.close();
   }

   public rzZ_2 break_() {
      return this.case_;
   }

   public rWB throws_() {
      return this.protected_;
   }

   public Of_1 catch_() {
      return this.private_;
   }

   public gp_3 case_() {
      return this.byte_;
   }

   public void implements_() {
      this.throws_.break_().throws_();
   }

   public rlQ_2 protected_() {
      return this.throws_.break_();
   }

   public rAL private_() {
      return this.break_;
   }
}
