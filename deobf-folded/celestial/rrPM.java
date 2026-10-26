package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPM extends rrPA {
   public static final Codec<rrPM> id_class = Codec.FLOAT.fieldOf("mossiness").xmap(rrPM::new, var0 -> var0.id_break).codec();
   private final float id_break;

   private xc_3 id_byte(Random var1) {
      return var1.nextFloat() < this.id_break ? xu_3.hf.id_continue() : null;
   }

   public rrPM(float var1) {
      this.id_break = var1;
   }

   private static xc_3 id_class(Random var0, xd_3 var1) {
      return var1.id_continue()
         .id_class(zG_2.id_volatile, rpb_3.HORIZONTAL.id_class(var0))
         .id_class(zG_2.id_final, rCj_1.values()[var0.nextInt(rCj_1.values().length)]);
   }

   private xc_3 id_class(Random var1, xc_3[] var2, xc_3[] var3) {
      return var1.nextFloat() < this.id_break ? id_class(var1, var3) : id_class(var1, var2);
   }

   private static xc_3 id_class(Random var0, xc_3[] var1) {
      return var1[var0.nextInt(var1.length)];
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_catch;
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      Random var7 = var6.id_break(var5.id_class);
      xc_3 var8 = var5.id_break;
      rfH_2 var9 = var5.id_class;
      xc_3 var10 = null;
      if (var8.id_class(xu_3.BL) || var8.id_class(xu_3.id_break) || var8.id_class(xu_3.BC)) {
         var10 = this.id_class(var7);
      } else if (var8.id_class(rls_3.id_interface)) {
         var10 = this.id_class(var7, var5.id_break);
      } else if (var8.id_class(rls_3.id_char)) {
         var10 = this.id_break(var7);
      } else if (var8.id_class(rls_3.id_abstract)) {
         var10 = this.id_byte(var7);
      } else if (var8.id_class(xu_3.rg)) {
         var10 = this.id_protected(var7);
      }

      return var10 != null ? new rrPp_1(var9, var10, var5.id_byte) : var5;
   }

   private xc_3 id_class(Random var1) {
      if (var1.nextFloat() >= 0.5F) {
         return null;
      } else {
         xc_3[] var2 = new xc_3[]{xu_3.Bn.id_continue(), id_class(var1, xu_3.Ba)};
         xc_3[] var3 = new xc_3[]{xu_3.BA.id_continue(), id_class(var1, xu_3.hX)};
         return this.id_class(var1, var2, var3);
      }
   }

   private xc_3 id_class(Random var1, xc_3 var2) {
      rpr_3 var3 = var2.id_byte(zG_2.id_volatile);
      rCj_1 var4 = var2.id_byte(zG_2.id_final);
      if (var1.nextFloat() >= 0.5F) {
         return null;
      } else {
         xc_3[] var5 = new xc_3[]{xu_3.GU.id_continue(), xu_3.bS.id_continue()};
         xc_3[] var6 = new xc_3[]{xu_3.hX.id_continue().id_class(zG_2.id_volatile, var3).id_class(zG_2.id_final, var4), xu_3.hF.id_continue()};
         return this.id_class(var1, var5, var6);
      }
   }

   private xc_3 id_break(Random var1) {
      return var1.nextFloat() < this.id_break ? xu_3.hF.id_continue() : null;
   }

   private xc_3 id_protected(Random var1) {
      return var1.nextFloat() < 0.15F ? xu_3.Jd.id_continue() : null;
   }
}
