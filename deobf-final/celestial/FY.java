package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class FY extends Lf_1<Fo_1> {
   private final Fe_1 class_;
   private final QY throws_;
   private final List<Fo_1> case_ = Lists.newArrayList();
   private String catch_;

   public FY(Fe_1 var1, QY var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.class_ = var1;
      this.throws_ = var2;
      this.protected_(false);
      this.throws_(false);
   }

   public void class_(Aw_1 var1, Lr_1 var2) {
      UUID var3 = var1.class_().getId();

      for (Fo_1 var5 : this.case_) {
         if (var5.break_().equals(var3)) {
            var5.byte_(false);
            return;
         }
      }

      if ((var2 == Lr_1.ALL || this.throws_.volatile_().byte_(var3))
         && (Strings.isNullOrEmpty(this.catch_) || var1.class_().getName().toLowerCase(Locale.ROOT).contains(this.catch_))) {
         Fo_1 var6 = new Fo_1(this.throws_, this.class_, var1.class_().getId(), var1.class_().getName(), var1::case_);
         this.break_(var6);
         this.case_.add(var6);
      }
   }

   public void class_(UUID var1) {
      for (Fo_1 var3 : this.case_) {
         if (var3.break_().equals(var1)) {
            var3.byte_(true);
            return;
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      double var5 = this.throws_.else_().return_();
      RenderSystem.enableScissor(
         (int)((double)this.continue_() * var5),
         (int)((double)(this.package_ - this.new_) * var5),
         (int)((double)(this.protected_() + 6) * var5),
         (int)((double)(this.package_ - (this.package_ - this.new_) - this.int_ - 4) * var5)
      );
      super.class_(var1, var2, var3, var4);
      RenderSystem.disableScissor();
   }

   public void class_(Collection<UUID> var1, double var2) {
      this.case_.clear();

      for (UUID var5 : var1) {
         Aw_1 var6 = ((Aq_1)((cb_3)this.throws_.class_[57]).break_[0]).class_(var5);
         if (var6 != null) {
            this.case_.add(new Fo_1(this.throws_, this.class_, var6.class_().getId(), var6.class_().getName(), var6::case_));
         }
      }

      this.implements_();
      this.case_.sort((var0, var1x) -> var0.class_().compareToIgnoreCase(var1x.class_()));
      this.class_(this.case_);
      this.class_(var2);
   }

   public void class_(String var1) {
      this.catch_ = var1;
   }

   private void implements_() {
      if (this.catch_ != null) {
         this.case_.removeIf(var1 -> !var1.class_().toLowerCase(Locale.ROOT).contains(this.catch_));
         this.class_(this.case_);
      }
   }

   public boolean private_() {
      return this.case_.isEmpty();
   }
}
