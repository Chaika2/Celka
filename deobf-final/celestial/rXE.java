package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Random;

public final class rXE extends rCn_1<rXs_1, rXE> {
   public static final Codec<rXE> class_ = class_(rVL.default_, rXs_1::private_).stable();

   public boolean byte_() {
      return this.class_().break_();
   }

   public rjU_2 byte_(rRq_1 var1, rfH_2 var2) {
      return this.class_().class_(var1, var2, this);
   }

   public rXE(rXs_1 var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<rXE> var3) {
      super(var1, var2, var3);
   }

   public void class_(rYB var1, rfH_2 var2) {
      this.class_().class_(var1, var2, this);
   }

   public void class_(rYB var1, rfH_2 var2, Random var3) {
      this.class_().class_(var1, var2, this, var3);
   }

   public rXs_1 class_() {
      return this.byte_;
   }

   public boolean class_(rlb_3<rXs_1> var1) {
      return this.class_().class_(var1);
   }

   public boolean class_(rRq_1 var1, rfH_2 var2, rXs_1 var3, rpr_3 var4) {
      return this.class_().class_(this, var1, var2, var3, var4);
   }

   public float class_(rRq_1 var1, rfH_2 var2) {
      return this.class_().class_(this, var1, var2);
   }

   public boolean break_(rRq_1 var1, rfH_2 var2) {
      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            rfH_2 var5 = var2.break_(var3, 0, var4);
            rXE var6 = var1.break_(var5);
            if (!var6.class_().class_(this.class_()) && !var1.byte_(var5).implements_(var1, var5)) {
               return true;
            }
         }
      }

      return false;
   }

   public void break_(rYB var1, rfH_2 var2, Random var3) {
      this.class_().break_(var1, var2, this, var3);
   }

   public boolean break_() {
      return this.class_().byte_(this);
   }

   public int throws_() {
      return this.class_().protected_(this);
   }

   public xc_3 catch_() {
      return this.class_().break_(this);
   }

   public boolean case_() {
      return this.class_().finally_();
   }

   public float implements_() {
      return this.class_().byte_();
   }

   public rjC_2 protected_(rRq_1 var1, rfH_2 var2) {
      return this.class_().break_(this, var1, var2);
   }

   public float protected_() {
      return this.class_().class_(this);
   }

   public rLx_1 private_() {
      return this.class_().implements_();
   }
}
