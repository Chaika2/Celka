package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPM extends rrPA {
   public static final Codec<rrPM> class_ = Codec.FLOAT.fieldOf("mossiness").xmap(rrPM::new, var0 -> var0.break_).codec();
   private final float break_;

   private xc_3 byte_(Random var1) {
      return var1.nextFloat() < this.break_ ? xu_3.hf.continue_() : null;
   }

   public rrPM(float var1) {
      this.break_ = var1;
   }

   private static xc_3 class_(Random var0, xd_3 var1) {
      return var1.continue_().class_(zG_2.volatile_, rpb_3.HORIZONTAL.class_(var0)).class_(zG_2.final_, rCj_1.values()[var0.nextInt(rCj_1.values().length)]);
   }

   private xc_3 class_(Random var1, xc_3[] var2, xc_3[] var3) {
      return var1.nextFloat() < this.break_ ? class_(var1, var3) : class_(var1, var2);
   }

   private static xc_3 class_(Random var0, xc_3[] var1) {
      return var1[var0.nextInt(var1.length)];
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.catch_;
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      Random var7 = var6.break_(var5.class_);
      xc_3 var8 = var5.break_;
      rfH_2 var9 = var5.class_;
      xc_3 var10 = null;
      if (var8.class_(xu_3.BL) || var8.class_(xu_3.break_) || var8.class_(xu_3.BC)) {
         var10 = this.class_(var7);
      } else if (var8.class_(rls_3.interface_)) {
         var10 = this.class_(var7, var5.break_);
      } else if (var8.class_(rls_3.char_)) {
         var10 = this.break_(var7);
      } else if (var8.class_(rls_3.abstract_)) {
         var10 = this.byte_(var7);
      } else if (var8.class_(xu_3.rg)) {
         var10 = this.protected_(var7);
      }

      return var10 != null ? new rrPp_1(var9, var10, var5.byte_) : var5;
   }

   private xc_3 class_(Random var1) {
      if (var1.nextFloat() >= 0.5F) {
         return null;
      } else {
         xc_3[] var2 = new xc_3[]{xu_3.Bn.continue_(), class_(var1, xu_3.Ba)};
         xc_3[] var3 = new xc_3[]{xu_3.BA.continue_(), class_(var1, xu_3.hX)};
         return this.class_(var1, var2, var3);
      }
   }

   private xc_3 class_(Random var1, xc_3 var2) {
      rpr_3 var3 = var2.byte_(zG_2.volatile_);
      rCj_1 var4 = var2.byte_(zG_2.final_);
      if (var1.nextFloat() >= 0.5F) {
         return null;
      } else {
         xc_3[] var5 = new xc_3[]{xu_3.GU.continue_(), xu_3.bS.continue_()};
         xc_3[] var6 = new xc_3[]{xu_3.hX.continue_().class_(zG_2.volatile_, var3).class_(zG_2.final_, var4), xu_3.hF.continue_()};
         return this.class_(var1, var5, var6);
      }
   }

   private xc_3 break_(Random var1) {
      return var1.nextFloat() < this.break_ ? xu_3.hF.continue_() : null;
   }

   private xc_3 protected_(Random var1) {
      return var1.nextFloat() < 0.15F ? xu_3.Jd.continue_() : null;
   }
}
