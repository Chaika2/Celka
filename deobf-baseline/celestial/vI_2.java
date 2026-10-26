package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

class vI_2 extends LV<vj_3> {
   protected final List<rlr_3<xd_3>> id_class;
   protected final List<rlr_3<rdb_3>> id_throws;
   private final int[] id_return;
   protected int id_case;
   protected final List<rdb_3> id_catch;
   protected final Comparator<rdb_3> id_private;
   protected rlr_3<?> id_implements;
   protected int id_finally;

   public vI_2(vp_3 var1, QY var2) {
      super(var2, var1.id_package, var1.id_int, 32, var1.id_int - 64, 20);
      this.id_extends = var1;
      this.id_return = new int[]{3, 4, 1, 2, 5, 6};
      this.id_case = -1;
      this.id_private = new vf_3(this);
      this.id_class = Lists.newArrayList();
      this.id_class.add(rlB_2.id_class);
      this.id_throws = Lists.newArrayList(new rlr_3[]{rlB_2.id_protected, rlB_2.id_break, rlB_2.id_byte, rlB_2.id_throws, rlB_2.id_case});
      this.id_class(true, 20);
      Set var3 = Sets.newIdentityHashSet();

      for (rdb_3 var5 : rVL.id_for) {
         boolean var6 = false;

         for (rlr_3 var8 : this.id_throws) {
            if (var8.id_class(var5) && var1.id_finally.id_class(var8.id_break(var5)) > 0) {
               var6 = true;
            }
         }

         if (var6) {
            var3.add(var5);
         }
      }

      for (xd_3 var11 : rVL.id_strictfp) {
         boolean var12 = false;

         for (rlr_3 var14 : this.id_class) {
            if (var14.id_class(var11) && var1.id_finally.id_class(var14.id_break(var11)) > 0) {
               var12 = true;
            }
         }

         if (var12) {
            var3.add(var11.id_case());
         }
      }

      var3.remove(rdy_3.id_class);
      this.id_catch = Lists.newArrayList(var3);

      for (int var10 = 0; var10 < this.id_catch.size(); var10++) {
         this.id_break(new vj_3(this));
      }
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      if (var3 >= this.id_int && var3 <= this.id_new) {
         vj_3 var4 = this.id_protected((double)var2, (double)var3);
         int var5 = (this.id_final - this.F_()) / 2;
         if (var4 != null) {
            if (var2 < var5 + 40 || var2 > var5 + 40 + 20) {
               return;
            }

            rdb_3 var6 = this.id_catch.get(this.x_().indexOf(var4));
            this.id_class(var1, this.id_class(var6), var2, var3);
         } else {
            rgP_2 var10 = null;
            int var7 = var2 - var5;

            for (int var8 = 0; var8 < this.id_return.length; var8++) {
               int var9 = this.id_extends.id_break(var8);
               if (var7 >= var9 - 18 && var7 <= var9) {
                  var10 = this.id_private(var8).id_byte();
                  break;
               }
            }

            this.id_class(var1, var10, var2, var3);
         }
      }
   }

   protected void id_class(rlr_3<?> var1) {
      if (var1 != this.id_implements) {
         this.id_implements = var1;
         this.id_finally = -1;
      } else if (this.id_finally == -1) {
         this.id_finally = 1;
      } else {
         this.id_implements = null;
         this.id_finally = 0;
      }

      this.id_catch.sort(this.id_private);
   }

   @Override
   protected void id_class(int var1, int var2) {
      this.id_case = -1;

      for (int var3 = 0; var3 < this.id_return.length; var3++) {
         int var4 = var1 - this.id_extends.id_break(var3);
         if (var4 >= -36 && var4 <= 0) {
            this.id_case = var3;
            break;
         }
      }

      if (this.id_case >= 0) {
         this.id_class(this.id_private(this.id_case));
         this.id_native.c().id_class(Np_1.id_class(rqn_3.dw, 1.0F));
      }
   }

   protected void id_class(Ml_1 var1, rgP_2 var2, int var3, int var4) {
      if (var2 != null) {
         int var5 = var3 + 12;
         int var6 = var4 - 12;
         int var7 = this.id_extends.id_super.id_class(var2);
         this.id_class(var1, var5 - 3, var6 - 3, var5 + var7 + 3, var6 + 8 + 3, -1073741824, -1073741824);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 400.0F);
         this.id_extends.id_super.id_break(var1, var2, (float)var5, (float)var6, -1);
         RenderSystem.popMatrix();
      }
   }

   protected rgP_2 id_class(rdb_3 var1) {
      return var1.id_native();
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3, yb_3 var4) {
      if (!((Qi_1)this.id_native.id_class[22]).id_class()) {
         this.id_case = -1;
      }

      for (int var5 = 0; var5 < this.id_return.length; var5++) {
         this.id_extends.id_byte(var1, var2 + this.id_extends.id_break(var5) - 18, var3 + 1, 0, this.id_case == var5 ? 0 : 18);
      }

      if (this.id_implements != null) {
         int var7 = this.id_extends.id_break(this.id_break(this.id_implements)) - 36;
         int var6 = this.id_finally == 1 ? 2 : 1;
         this.id_extends.id_byte(var1, var2 + var7, var3 + 1, 18 * var6, 0);
      }

      for (int var8 = 0; var8 < this.id_return.length; var8++) {
         int var9 = this.id_case == var8 ? 1 : 0;
         this.id_extends.id_byte(var1, var2 + this.id_extends.id_break(var8) - 18 + var9, var3 + 1 + var9, 18 * this.id_return[var8], 18);
      }
   }

   @Override
   protected void id_class(Ml_1 var1) {
      this.id_extends.id_class(var1);
   }

   private int id_break(rlr_3<?> var1) {
      int var2 = this.id_class.indexOf(var1);
      if (var2 >= 0) {
         return var2;
      } else {
         int var3 = this.id_throws.indexOf(var1);
         return var3 >= 0 ? var3 + this.id_class.size() : -1;
      }
   }

   @Override
   protected int id_protected() {
      return this.id_final / 2 + 140;
   }

   private rlr_3<?> id_private(int var1) {
      return var1 < this.id_class.size() ? this.id_class.get(var1) : this.id_throws.get(var1 - this.id_class.size());
   }

   @Override
   public int F_() {
      return 375;
   }
}
