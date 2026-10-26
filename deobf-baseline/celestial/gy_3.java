package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class gy_3 implements gR_2 {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("permissions.requires.player"));
   public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("permissions.requires.entity"));
   private final gV_2 id_byte;
   private final rjU_2 id_protected;
   private final rrEm_1 id_throws;
   private final int id_case;
   private final String id_catch;
   private final rgP_2 id_private;
   private final rnW_2 id_implements;
   private final boolean id_finally;
   private final an_3 id_extends;
   private final ResultConsumer<gy_3> id_native;
   private final Rm_1 id_volatile;
   private final rjK_2 id_final;

   public gy_3 id_byte(int var1) {
      return var1 <= this.id_case
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            this.id_final,
            this.id_throws,
            var1,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            this.id_native,
            this.id_volatile
         );
   }

   @Override
   public Collection<String> id_byte() {
      return this.id_implements.R().id_protected();
   }

   public an_3 id_int() throws CommandSyntaxException {
      if (this.id_extends == null) {
         throw id_break.create();
      } else {
         return this.id_extends;
      }
   }

   protected gy_3(
      gV_2 var1,
      rjU_2 var2,
      rjK_2 var3,
      rrEm_1 var4,
      int var5,
      String var6,
      rgP_2 var7,
      rnW_2 var8,
      an_3 var9,
      boolean var10,
      ResultConsumer<gy_3> var11,
      Rm_1 var12
   ) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var4;
      this.id_finally = var10;
      this.id_extends = var9;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      this.id_native = var11;
      this.id_volatile = var12;
      this.id_final = var3;
   }

   public gy_3(gV_2 var1, rjU_2 var2, rjK_2 var3, rrEm_1 var4, int var5, String var6, rgP_2 var7, rnW_2 var8, an_3 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, false, (var0, var1x, var2x) -> {
      }, Rm_1.FEET);
   }

   public Rm_1 id_this() {
      return this.id_volatile;
   }

   public gy_3 id_class(rjK_2 var1) {
      return this.id_final.id_class(var1)
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            var1,
            this.id_throws,
            this.id_case,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            this.id_native,
            this.id_volatile
         );
   }

   public gy_3 id_class(an_3 var1) {
      return this.id_extends == var1
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            this.id_final,
            this.id_throws,
            this.id_case,
            var1.g().getString(),
            var1.L_(),
            this.id_implements,
            var1,
            this.id_finally,
            this.id_native,
            this.id_volatile
         );
   }

   public gy_3 id_class(rjU_2 var1) {
      return this.id_protected.equals(var1)
         ? this
         : new gy_3(
            this.id_byte,
            var1,
            this.id_final,
            this.id_throws,
            this.id_case,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            this.id_native,
            this.id_volatile
         );
   }

   @Override
   public CompletableFuture<Suggestions> id_class(CommandContext<gR_2> var1, SuggestionsBuilder var2) {
      return null;
   }

   @Override
   public boolean id_class(int var1) {
      return this.id_case >= var1;
   }

   public void id_class(rgP_2 var1) {
      if (this.id_byte.l() && !this.id_finally) {
         this.id_byte.id_class(new rgN_2("").id_class(var1).id_class(rgF_2.RED), rqR_2.id_break);
      }
   }

   public void id_class(rgP_2 var1, boolean var2) {
      if (this.id_byte.C() && !this.id_finally) {
         this.id_byte.id_class(var1, rqR_2.id_break);
      }

      if (var2 && this.id_byte.H() && !this.id_finally) {
         this.id_break(var1);
      }
   }

   public void id_class(CommandContext<gy_3> var1, boolean var2, int var3) {
      if (this.id_native != null) {
         this.id_native.onCommandComplete(var1, var2, var3);
      }
   }

   @Override
   public Collection<String> id_class() {
      return Lists.newArrayList(this.id_implements.id_private());
   }

   public gy_3 id_class(an_3 var1, Rm_1 var2) throws CommandSyntaxException {
      return this.id_break(var2.id_class(var1));
   }

   public gy_3 id_class(rrEm_1 var1) {
      if (var1 == this.id_throws) {
         return this;
      } else {
         double var2 = rRJ.id_class(this.id_throws.id_default(), var1.id_default());
         rjU_2 var4 = new rjU_2(this.id_protected.id_break * var2, this.id_protected.id_byte, this.id_protected.id_protected * var2);
         return new gy_3(
            this.id_byte,
            var4,
            this.id_final,
            var1,
            this.id_case,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            this.id_native,
            this.id_volatile
         );
      }
   }

   public gy_3 id_class(ResultConsumer<gy_3> var1, BinaryOperator<ResultConsumer<gy_3>> var2) {
      ResultConsumer var3 = var2.apply(this.id_native, var1);
      return this.id_class(var3);
   }

   public gy_3 id_class(ResultConsumer<gy_3> var1) {
      return this.id_native.equals(var1)
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            this.id_final,
            this.id_throws,
            this.id_case,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            var1,
            this.id_volatile
         );
   }

   public gy_3 id_class(Rm_1 var1) {
      return var1 == this.id_volatile
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            this.id_final,
            this.id_throws,
            this.id_case,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            this.id_native,
            var1
         );
   }

   public gy_3 id_break(int var1) {
      return var1 == this.id_case
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            this.id_final,
            this.id_throws,
            var1,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            this.id_finally,
            this.id_native,
            this.id_volatile
         );
   }

   private void id_break(rgP_2 var1) {
      rVi_1 var2 = new rgn_3("chat.type.admin", this.id_extends(), var1).id_class(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC});
      if (this.id_implements.D().id_break(rRu_1.id_final)) {
         for (rhN_2 var4 : this.id_implements.x().id_super()) {
            if (var4 != this.id_byte && this.id_implements.x().id_case(var4.sv())) {
               var4.id_class(var2, rqR_2.id_break);
            }
         }
      }

      if (this.id_byte != this.id_implements && this.id_implements.D().id_break(rRu_1.id_extends)) {
         this.id_implements.id_class(var2, rqR_2.id_break);
      }
   }

   public gy_3 id_break(rjU_2 var1) throws CommandSyntaxException {
      rjU_2 var2 = this.id_volatile.id_class(this);
      double var3 = var1.id_break - var2.id_break;
      double var5 = var1.id_byte - var2.id_byte;
      double var7 = var1.id_protected - var2.id_protected;
      double var9 = (double)rfU_2.id_class(var3 * var3 + var7 * var7);
      float var11 = rfU_2.id_catch((float)(-(rfU_2.id_protected(var5, var9) * 180.0F / (float)Math.PI)));
      float var12 = rfU_2.id_catch((float)(rfU_2.id_protected(var7, var3) * 180.0F / (float)Math.PI) - 90.0F);
      return this.id_class(new rjK_2(var11, var12));
   }

   @Override
   public Stream<rqO_2> id_throws() {
      return this.id_implements.V().id_byte();
   }

   public gy_3 id_finally() {
      return this.id_finally
         ? this
         : new gy_3(
            this.id_byte,
            this.id_protected,
            this.id_final,
            this.id_throws,
            this.id_case,
            this.id_catch,
            this.id_private,
            this.id_implements,
            this.id_extends,
            true,
            this.id_native,
            this.id_volatile
         );
   }

   public rgP_2 id_extends() {
      return this.id_private;
   }

   public rjK_2 id_continue() {
      return this.id_final;
   }

   @Override
   public rVm_1 id_implements() {
      return this.id_implements.rS();
   }

   public rhN_2 id_new() throws CommandSyntaxException {
      if (!(this.id_extends instanceof rhN_2)) {
         throw id_class.create();
      } else {
         return (rhN_2)this.id_extends;
      }
   }

   public an_3 id_package() {
      return this.id_extends;
   }

   public rnW_2 id_super() {
      return this.id_implements;
   }

   @Override
   public Collection<rqO_2> id_protected() {
      return rVL.id_short.id_protected();
   }

   @Override
   public Set<rqM_2<rYB>> id_private() {
      return this.id_implements.id_long();
   }

   public rrEm_1 id_final() {
      return this.id_throws;
   }

   public rjU_2 id_volatile() {
      return this.id_protected;
   }

   public String id_native() {
      return this.id_catch;
   }
}
