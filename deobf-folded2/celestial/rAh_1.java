package celestial;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class rAh_1 implements AutoCloseable {
   private static final CompletableFuture<rqg_3> id_class = CompletableFuture.completedFuture(rqg_3.INSTANCE);
   private final rAv_1 id_break = new rAj_1(rAI.SERVER_DATA);
   private final gp_3 id_byte;
   private final rWB id_protected = new rWB();
   private final rlu_3 id_throws = new rlu_3();
   private final rzZ_2 id_case = new rzZ_2();
   private final rzC_2 id_catch = new rzC_2(this.id_case);
   private final Of_1 id_private = new Of_1(this.id_case);
   private final rAQ id_implements;

   public rzC_2 id_byte() {
      return this.id_catch;
   }

   public rAh_1(gq_3 var1, int var2) {
      this.id_byte = new gp_3(var1);
      this.id_implements = new rAQ(var2, this.id_byte.id_class());
      this.id_break.id_class(this.id_throws);
      this.id_break.id_class(this.id_case);
      this.id_break.id_class(this.id_protected);
      this.id_break.id_class(this.id_catch);
      this.id_break.id_class(this.id_implements);
      this.id_break.id_class(this.id_private);
   }

   public rAQ id_class() {
      return this.id_implements;
   }

   public static CompletableFuture<rAh_1> id_class(List<rAC> var0, gq_3 var1, int var2, Executor var3, Executor var4) {
      rAh_1 var5 = new rAh_1(var1, var2);
      CompletableFuture var6 = var5.id_break.id_class(var3, var4, var0, id_class);
      return var6.whenComplete((var1x, var2x) -> {
         if (var2x != null) {
            var5.close();
         }
      }).thenApply(var1x -> var5);
   }

   @Override
   public void close() {
      this.id_break.close();
   }

   public rzZ_2 id_break() {
      return this.id_case;
   }

   public rWB id_throws() {
      return this.id_protected;
   }

   public Of_1 id_catch() {
      return this.id_private;
   }

   public gp_3 id_case() {
      return this.id_byte;
   }

   public void id_implements() {
      this.id_throws.id_break().id_throws();
   }

   public rlQ_2 id_protected() {
      return this.id_throws.id_break();
   }

   public rAL id_private() {
      return this.id_break;
   }
}
