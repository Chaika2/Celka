package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rHO extends ryO_2 implements rHf_1, rJZ {
   public static final rLR[][] id_class = new rLR[][]{{rLD.id_class, rLD.id_byte}, {rLD.id_extends, rLD.id_private}, {rLD.id_throws}, {rLD.id_finally}};
   private static final Set<rLR> id_break = Arrays.stream(id_class).flatMap(Arrays::stream).collect(Collectors.toSet());
   List<rHX> id_byte = Lists.newArrayList();
   private List<rHX> id_protected = Lists.newArrayList();
   int id_throws;
   private int id_case = -1;
   rLR id_catch;
   rLR id_private;
   private rgP_2 id_implements;
   private rRK id_finally = rRK.id_class;
   private final rpF_2 id_final = new rHh_1(this);

   public rHO() {
      super(ryW_2.id_final);
   }

   public void id_class(rqA_2 var1) {
      this.id_extends.id_class((rhd_3)null, this.id_native, var1, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   static rLR id_class(int var0) {
      rLR var1 = rLR.id_class(var0);
      return id_break.contains(var1) ? var1 : null;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Primary", rLR.id_class(this.id_catch));
      var1.id_break("Secondary", rLR.id_class(this.id_private));
      var1.id_break("Levels", this.id_throws);
      if (this.id_implements != null) {
         var1.id_class("CustomName", rgB_2.id_class(this.id_implements));
      }

      this.id_finally.id_class(var1);
      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_catch = id_class(var2.id_private("Primary"));
      this.id_private = id_class(var2.id_private("Secondary"));
      if (var2.id_byte("CustomName", 8)) {
         this.id_implements = rgB_2.id_class(var2.id_native("CustomName"));
      }

      this.id_finally = rRK.id_break(var2);
   }

   private void id_class(int var1, int var2, int var3) {
      this.id_throws = 0;

      for (int var4 = 1; var4 <= 4; this.id_throws = var4++) {
         int var5 = var2 - var4;
         if (var5 < 0) {
            break;
         }

         boolean var6 = true;

         for (int var7 = var1 - var4; var7 <= var1 + var4 && var6; var7++) {
            for (int var8 = var3 - var4; var8 <= var3 + var4; var8++) {
               if (!this.id_extends.id_byte(new rfH_2(var7, var5, var8)).id_class(rls_3.m)) {
                  var6 = false;
                  break;
               }
            }
         }

         if (!var6) {
            break;
         }
      }
   }

   public void id_class(rgP_2 var1) {
      this.id_implements = var1;
   }

   @Override
   public void id_throws() {
      int var1 = this.id_native.b_();
      int var2 = this.id_native.c_();
      int var3 = this.id_native.d_();
      rfH_2 var4;
      if (this.id_case < var2) {
         var4 = this.id_native;
         this.id_protected = Lists.newArrayList();
         this.id_case = var4.c_() - 1;
      } else {
         var4 = new rfH_2(var1, this.id_case + 1, var3);
      }

      rHX var5 = this.id_protected.isEmpty() ? null : this.id_protected.get(this.id_protected.size() - 1);
      int var6 = this.id_extends.id_class(rKv_1.WORLD_SURFACE, var1, var3);

      for (int var7 = 0; var7 < 10 && var4.c_() <= var6; var7++) {
         xc_3 var8 = this.id_extends.id_byte(var4);
         xd_3 var9 = var8.id_break();
         if (var9 instanceof kO_2) {
            float[] var10 = ((kO_2)var9).id_break().id_protected();
            if (this.id_protected.size() <= 1) {
               var5 = new rHX(var10);
               this.id_protected.add(var5);
            } else if (var5 != null) {
               if (Arrays.equals(var10, var5.id_class)) {
                  var5.id_class();
               } else {
                  var5 = new rHX(new float[]{(var5.id_class[0] + var10[0]) / 2.0F, (var5.id_class[1] + var10[1]) / 2.0F, (var5.id_class[2] + var10[2]) / 2.0F});
                  this.id_protected.add(var5);
               }
            }
         } else {
            if (var5 == null || var8.id_break((rRq_1)this.id_extends, var4) >= 15 && var9 != xu_3.id_while) {
               this.id_protected.clear();
               this.id_case = var6;
               break;
            }

            var5.id_class();
         }

         var4 = var4.id_final();
         this.id_case++;
      }

      int var12 = this.id_throws;
      if (this.id_extends.r() % 80L == 0L) {
         if (!this.id_byte.isEmpty()) {
            this.id_class(var1, var2, var3);
         }

         if (this.id_throws > 0 && !this.id_byte.isEmpty()) {
            this.id_finally();
            this.id_class(rqn_3.A);
         }
      }

      if (this.id_case >= var6) {
         this.id_case = -1;
         boolean var13 = var12 > 0;
         this.id_byte = this.id_protected;
         if (!this.id_extends.id_continue) {
            boolean var14 = this.id_throws > 0;
            if (!var13 && var14) {
               this.id_class(rqn_3.L);

               for (rhN_2 var11 : this.id_extends
                  .id_class(
                     rhN_2.class, new rfl_3((double)var1, (double)var2, (double)var3, (double)var1, (double)(var2 - 4), (double)var3).id_byte(10.0, 5.0, 10.0)
                  )) {
                  Oo_1.id_native.id_class(var11, this);
               }
            } else if (var13 && !var14) {
               this.id_class(rqn_3.n);
            }
         }
      }
   }

   private void id_finally() {
      if (!this.id_extends.id_continue && this.id_catch != null) {
         double var1 = (double)(this.id_throws * 10 + 10);
         byte var3 = 0;
         if (this.id_throws >= 4 && this.id_catch == this.id_private) {
            var3 = 1;
         }

         int var4 = (9 + this.id_throws * 2) * 20;
         rfl_3 var5 = new rfl_3(this.id_native).id_class(var1).id_break(0.0, (double)this.id_extends.id_try(), 0.0);
         List var6 = this.id_extends.id_class(rhd_3.class, var5);

         for (rhd_3 var8 : var6) {
            var8.id_break(new rLY(this.id_catch, var4, var3, true, true));
         }

         if (this.id_throws >= 4 && this.id_catch != this.id_private && this.id_private != null) {
            for (rhd_3 var10 : var6) {
               var10.id_break(new rLY(this.id_private, var4, 0, true, true));
            }
         }
      }
   }

   public List<rHX> id_catch() {
      return (List<rHX>)(this.id_throws == 0 ? ImmutableList.of() : this.id_byte);
   }

   @Override
   public double id_implements() {
      return 256.0;
   }

   public int id_private() {
      return this.id_throws;
   }

   @Override
   public void aa_() {
      this.id_class(rqn_3.n);
      super.aa_();
   }

   @Override
   public rgP_2 L_() {
      return (rgP_2)(this.id_implements != null ? this.id_implements : new rgn_3("container.beacon"));
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 3, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return rHD.id_class(var3, this.id_finally, this.L_()) ? new rXT(var1, var2, this.id_final, rpq_3.id_class(this.id_extends, this.id_char())) : null;
   }
}
