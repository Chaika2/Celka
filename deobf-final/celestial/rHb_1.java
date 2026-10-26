package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class rHb_1 extends ryO_2 implements rpA_2 {
   private rgP_2 class_;
   private rxL_2 break_ = rxL_2.WHITE;
   private rcy_3 byte_;
   private boolean protected_;
   private List<Pair<rHE, rxL_2>> throws_;

   public static void byte_(rdn_3 var0) {
      rcd_3 var1 = var0.break_("BlockEntityTag");
      if (var1 != null && var1.byte_("Patterns", 9)) {
         rcy_3 var2 = var1.protected_("Patterns", 10);
         if (!var2.isEmpty()) {
            var2.byte_(var2.size() - 1);
            if (var2.isEmpty()) {
               var0.byte_("BlockEntityTag");
            }
         }
      }
   }

   public rHb_1() {
      super(ryW_2.super_);
   }

   public rHb_1(rxL_2 var1) {
      this();
      this.break_ = var1;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (this.byte_ != null) {
         var1.class_("Patterns", this.byte_);
      }

      if (this.class_ != null) {
         var1.class_("CustomName", rgB_2.class_(this.class_));
      }

      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      if (var2.byte_("CustomName", 8)) {
         this.class_ = rgB_2.class_(var2.native_("CustomName"));
      }

      if (this.interface_()) {
         this.break_ = ((JL)this.abstract_().break_()).break_();
      } else {
         this.break_ = null;
      }

      this.byte_ = var2.protected_("Patterns", 10);
      this.throws_ = null;
      this.protected_ = true;
   }

   public rdn_3 class_(xc_3 var1) {
      rdn_3 var2 = new rdn_3(xS_2.class_(this.class_(() -> var1)));
      if (this.byte_ != null && !this.byte_.isEmpty()) {
         var2.class_("BlockEntityTag").class_("Patterns", this.byte_.protected_());
      }

      if (this.class_ != null) {
         var2.class_(this.class_);
      }

      return var2;
   }

   public static List<Pair<rHE, rxL_2>> class_(rxL_2 var0, rcy_3 var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(Pair.of(rHE.BASE, var0));
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            rcd_3 var4 = var1.class_(var3);
            rHE var5 = rHE.class_(var4.native_("Pattern"));
            if (var5 != null) {
               int var6 = var4.private_("Color");
               var2.add(Pair.of(var5, rxL_2.class_(var6)));
            }
         }
      }

      return var2;
   }

   public void class_(rdn_3 var1, rxL_2 var2) {
      this.byte_ = class_(var1);
      this.break_ = var2;
      this.throws_ = null;
      this.protected_ = true;
      this.class_ = var1.this_() ? var1.continue_() : null;
   }

   public static rcy_3 class_(rdn_3 var0) {
      rcy_3 var1 = null;
      rcd_3 var2 = var0.break_("BlockEntityTag");
      if (var2 != null && var2.byte_("Patterns", 9)) {
         var1 = var2.protected_("Patterns", 10).protected_();
      }

      return var1;
   }

   public rxL_2 class_(Supplier<xc_3> var1) {
      if (this.break_ == null) {
         this.break_ = ((JL)((xc_3)var1.get()).break_()).break_();
      }

      return this.break_;
   }

   public void class_(rgP_2 var1) {
      this.class_ = var1;
   }

   @Override
   public rgP_2 g() {
      return (rgP_2)(this.class_ != null ? this.class_ : new rgn_3("block.minecraft.banner"));
   }

   public static int break_(rdn_3 var0) {
      rcd_3 var1 = var0.break_("BlockEntityTag");
      return var1 != null && var1.throws_("Patterns") ? var1.protected_("Patterns", 10).size() : 0;
   }

   public List<Pair<rHE, rxL_2>> throws_() {
      if (this.throws_ == null && this.protected_) {
         this.throws_ = class_(this.class_(this::abstract_), this.byte_);
      }

      return this.throws_;
   }

   @Override
   public rgP_2 rD() {
      return this.class_;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 6, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
