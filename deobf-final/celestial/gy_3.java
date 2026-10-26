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
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("permissions.requires.player"));
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("permissions.requires.entity"));
   private final gV_2 byte_;
   private final rjU_2 protected_;
   private final rrEm_1 throws_;
   private final int case_;
   private final String catch_;
   private final rgP_2 private_;
   private final rnW_2 implements_;
   private final boolean finally_;
   private final an_3 extends_;
   private final ResultConsumer<gy_3> native_;
   private final Rm_1 volatile_;
   private final rjK_2 final_;

   public gy_3 byte_(int var1) {
      return var1 <= this.case_
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            this.final_,
            this.throws_,
            var1,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            this.native_,
            this.volatile_
         );
   }

   @Override
   public Collection<String> byte_() {
      return this.implements_.R().protected_();
   }

   public an_3 int_() throws CommandSyntaxException {
      if (this.extends_ == null) {
         throw break_.create();
      } else {
         return this.extends_;
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
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var4;
      this.finally_ = var10;
      this.extends_ = var9;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      this.native_ = var11;
      this.volatile_ = var12;
      this.final_ = var3;
   }

   public gy_3(gV_2 var1, rjU_2 var2, rjK_2 var3, rrEm_1 var4, int var5, String var6, rgP_2 var7, rnW_2 var8, an_3 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, false, (var0, var1x, var2x) -> {
      }, Rm_1.FEET);
   }

   public Rm_1 this_() {
      return this.volatile_;
   }

   public gy_3 class_(rjK_2 var1) {
      return this.final_.class_(var1)
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            var1,
            this.throws_,
            this.case_,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            this.native_,
            this.volatile_
         );
   }

   public gy_3 class_(an_3 var1) {
      return this.extends_ == var1
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            this.final_,
            this.throws_,
            this.case_,
            var1.g().getString(),
            var1.L_(),
            this.implements_,
            var1,
            this.finally_,
            this.native_,
            this.volatile_
         );
   }

   public gy_3 class_(rjU_2 var1) {
      return this.protected_.equals(var1)
         ? this
         : new gy_3(
            this.byte_,
            var1,
            this.final_,
            this.throws_,
            this.case_,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            this.native_,
            this.volatile_
         );
   }

   @Override
   public CompletableFuture<Suggestions> class_(CommandContext<gR_2> var1, SuggestionsBuilder var2) {
      return null;
   }

   @Override
   public boolean class_(int var1) {
      return this.case_ >= var1;
   }

   public void class_(rgP_2 var1) {
      if (this.byte_.l() && !this.finally_) {
         this.byte_.class_(new rgN_2("").class_(var1).class_(rgF_2.RED), rqR_2.break_);
      }
   }

   public void class_(rgP_2 var1, boolean var2) {
      if (this.byte_.C() && !this.finally_) {
         this.byte_.class_(var1, rqR_2.break_);
      }

      if (var2 && this.byte_.H() && !this.finally_) {
         this.break_(var1);
      }
   }

   public void class_(CommandContext<gy_3> var1, boolean var2, int var3) {
      if (this.native_ != null) {
         this.native_.onCommandComplete(var1, var2, var3);
      }
   }

   @Override
   public Collection<String> class_() {
      return Lists.newArrayList(this.implements_.private_());
   }

   public gy_3 class_(an_3 var1, Rm_1 var2) throws CommandSyntaxException {
      return this.break_(var2.class_(var1));
   }

   public gy_3 class_(rrEm_1 var1) {
      if (var1 == this.throws_) {
         return this;
      } else {
         double var2 = rRJ.class_(this.throws_.default_(), var1.default_());
         rjU_2 var4 = new rjU_2(this.protected_.break_ * var2, this.protected_.byte_, this.protected_.protected_ * var2);
         return new gy_3(
            this.byte_,
            var4,
            this.final_,
            var1,
            this.case_,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            this.native_,
            this.volatile_
         );
      }
   }

   public gy_3 class_(ResultConsumer<gy_3> var1, BinaryOperator<ResultConsumer<gy_3>> var2) {
      ResultConsumer var3 = var2.apply(this.native_, var1);
      return this.class_(var3);
   }

   public gy_3 class_(ResultConsumer<gy_3> var1) {
      return this.native_.equals(var1)
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            this.final_,
            this.throws_,
            this.case_,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            var1,
            this.volatile_
         );
   }

   public gy_3 class_(Rm_1 var1) {
      return var1 == this.volatile_
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            this.final_,
            this.throws_,
            this.case_,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            this.native_,
            var1
         );
   }

   public gy_3 break_(int var1) {
      return var1 == this.case_
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            this.final_,
            this.throws_,
            var1,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            this.finally_,
            this.native_,
            this.volatile_
         );
   }

   private void break_(rgP_2 var1) {
      rVi_1 var2 = new rgn_3("chat.type.admin", this.extends_(), var1).class_(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC});
      if (this.implements_.D().break_(rRu_1.final_)) {
         for (rhN_2 var4 : this.implements_.x().super_()) {
            if (var4 != this.byte_ && this.implements_.x().case_(var4.sv())) {
               var4.class_(var2, rqR_2.break_);
            }
         }
      }

      if (this.byte_ != this.implements_ && this.implements_.D().break_(rRu_1.extends_)) {
         this.implements_.class_(var2, rqR_2.break_);
      }
   }

   public gy_3 break_(rjU_2 var1) throws CommandSyntaxException {
      rjU_2 var2 = this.volatile_.class_(this);
      double var3 = var1.break_ - var2.break_;
      double var5 = var1.byte_ - var2.byte_;
      double var7 = var1.protected_ - var2.protected_;
      double var9 = (double)rfU_2.class_(var3 * var3 + var7 * var7);
      float var11 = rfU_2.catch_((float)(-(rfU_2.protected_(var5, var9) * 180.0F / (float)Math.PI)));
      float var12 = rfU_2.catch_((float)(rfU_2.protected_(var7, var3) * 180.0F / (float)Math.PI) - 90.0F);
      return this.class_(new rjK_2(var11, var12));
   }

   @Override
   public Stream<rqO_2> throws_() {
      return this.implements_.V().byte_();
   }

   public gy_3 finally_() {
      return this.finally_
         ? this
         : new gy_3(
            this.byte_,
            this.protected_,
            this.final_,
            this.throws_,
            this.case_,
            this.catch_,
            this.private_,
            this.implements_,
            this.extends_,
            true,
            this.native_,
            this.volatile_
         );
   }

   public rgP_2 extends_() {
      return this.private_;
   }

   public rjK_2 continue_() {
      return this.final_;
   }

   @Override
   public rVm_1 implements_() {
      return this.implements_.rS();
   }

   public rhN_2 new_() throws CommandSyntaxException {
      if (!(this.extends_ instanceof rhN_2)) {
         throw class_.create();
      } else {
         return (rhN_2)this.extends_;
      }
   }

   public an_3 package_() {
      return this.extends_;
   }

   public rnW_2 super_() {
      return this.implements_;
   }

   @Override
   public Collection<rqO_2> protected_() {
      return rVL.short_.protected_();
   }

   @Override
   public Set<rqM_2<rYB>> private_() {
      return this.implements_.long_();
   }

   public rrEm_1 final_() {
      return this.throws_;
   }

   public rjU_2 volatile_() {
      return this.protected_;
   }

   public String native_() {
      return this.catch_;
   }
}
