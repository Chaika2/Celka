package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class rKk_1 extends rKd_1 {
   public static final Codec<rKk_1> protected_ = rVn_1.class_(rVL.n).xmap(rKk_1::new, rKk_1::catch_).stable().codec();
   private static final List<xc_3> catch_ = StreamSupport.stream(rVL.strictfp_.spliterator(), false)
      .flatMap(var0 -> var0.new_().class_().stream())
      .collect(Collectors.toList());
   private static final int private_ = rfU_2.case_(rfU_2.byte_((float)catch_.size()));
   private static final int implements_ = rfU_2.case_((float)catch_.size() / (float)private_);
   protected static final xc_3 throws_ = xu_3.class_.continue_();
   protected static final xc_3 case_ = xu_3.Ec.continue_();
   private final rVL<rYG> finally_;

   public rKk_1(rVL<rYG> var1) {
      super(new ror_3(var1.byte_(rYl_1.break_)), new rrSq_1(false));
      this.finally_ = var1;
   }

   @Override
   public void class_(rRg_1 var1, rrrA var2, roC_2 var3) {
   }

   @Override
   public int class_(int var1, int var2, rKv_1 var3) {
      return 0;
   }

   @Override
   public rRq_1 class_(int var1, int var2) {
      return new rRE(new xc_3[0]);
   }

   @Override
   public void class_(rKf_1 var1, rrrA var2) {
      rfw_3 var3 = new rfw_3();
      int var4 = var1.protected_();
      int var5 = var1.throws_();

      for (int var6 = 0; var6 < 16; var6++) {
         for (int var7 = 0; var7 < 16; var7++) {
            int var8 = (var4 << 4) + var6;
            int var9 = (var5 << 4) + var7;
            var1.class_(var3.class_(var8, 60, var9), case_, 2);
            xc_3 var10 = break_(var8, var9);
            if (var10 != null) {
               var1.class_(var3.class_(var8, 70, var9), var10, 2);
            }
         }
      }
   }

   @Override
   public rKd_1 class_(long var1) {
      return this;
   }

   @Override
   public void class_(rKf_1 var1, roC_2 var2) {
   }

   @Override
   public void class_(long var1, rYA var3, roC_2 var4, rKu_1 var5) {
   }

   @Override
   protected Codec<? extends rKd_1> class_() {
      return protected_;
   }

   public static xc_3 break_(int var0, int var1) {
      xc_3 var2 = throws_;
      if (var0 > 0 && var1 > 0 && var0 % 2 != 0 && var1 % 2 != 0) {
         var0 /= 2;
         var1 /= 2;
         if (var0 <= private_ && var1 <= implements_) {
            int var3 = rfU_2.class_(var0 * private_ + var1);
            if (var3 < catch_.size()) {
               var2 = catch_.get(var3);
            }
         }
      }

      return var2;
   }

   public rVL<rYG> catch_() {
      return this.finally_;
   }
}
