package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Wu_1 extends xd_3 {
   public static final rCu_1<rCY> id_volatile = rCT.S;
   public static final rCu_1<rCY> id_final = rCT.B;
   public static final rCu_1<rCY> id_package = rCT.s;
   public static final rCu_1<rCY> id_int = rCT.E;
   public static final rCm_1 id_new = rCT.H;
   public static final Map<rpr_3, rCu_1<rCY>> id_continue = Maps.newEnumMap(
      ImmutableMap.of(rpr_3.NORTH, id_volatile, rpr_3.EAST, id_final, rpr_3.SOUTH, id_package, rpr_3.WEST, id_int)
   );
   private static final rjC_2 id_super = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<rpr_3, rjC_2> id_this = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.id_class(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         rpr_3.SOUTH,
         xd_3.id_class(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         rpr_3.EAST,
         xd_3.id_class(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         rpr_3.WEST,
         xd_3.id_class(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<rpr_3, rjC_2> id_else = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         rjw_3.id_class(id_this.get(rpr_3.NORTH), xd_3.id_class(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         rpr_3.SOUTH,
         rjw_3.id_class(id_this.get(rpr_3.SOUTH), xd_3.id_class(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         rpr_3.EAST,
         rjw_3.id_class(id_this.get(rpr_3.EAST), xd_3.id_class(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         rpr_3.WEST,
         rjw_3.id_class(id_this.get(rpr_3.WEST), xd_3.id_class(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private final Map<xc_3, rjC_2> id_synchronized = Maps.newHashMap();
   private static final rje_3[] id_return = new rje_3[16];
   private final xc_3 id_public;
   private boolean id_goto = true;

   @Override
   public boolean id_byte(xc_3 var1) {
      return this.id_goto;
   }

   public static int id_byte(int var0) {
      rje_3 var1 = id_return[var0];
      return rfU_2.id_throws(var1.id_class(), var1.id_break(), var1.id_byte());
   }

   public Wu_1(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, rCY.NONE)
            .id_class(id_final, rCY.NONE)
            .id_class(id_package, rCY.NONE)
            .id_class(id_int, rCY.NONE)
            .id_class(id_new, Integer.valueOf(0))
      );
      this.id_public = this.id_continue()
         .id_class(id_volatile, rCY.SIDE)
         .id_class(id_final, rCY.SIDE)
         .id_class(id_package, rCY.SIDE)
         .id_class(id_int, rCY.SIDE);
      UnmodifiableIterator var2 = this.id_new().id_class().iterator();

      while (var2.hasNext()) {
         xc_3 var3 = (xc_3)var2.next();
         if (var3.id_byte(id_new) == 0) {
            this.id_synchronized.put(var3, this.id_implements(var3));
         }
      }
   }

   static {
      for (int var0 = 0; var0 <= 15; var0++) {
         float var1 = (float)var0 / 15.0F;
         float var2 = var1 * 0.6F + (var1 > 0.0F ? 0.4F : 0.3F);
         float var3 = rfU_2.id_class(var1 * var1 * 0.7F - 0.5F, 0.0F, 1.0F);
         float var4 = rfU_2.id_class(var1 * var1 * 0.6F - 0.7F, 0.0F, 1.0F);
         id_return[var0] = new rje_3(var2, var3, var4);
      }
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      if (this.id_goto && var4 != rpr_3.DOWN) {
         int var5 = var1.id_byte(id_new);
         if (var5 == 0) {
            return 0;
         } else {
            return var4 != rpr_3.UP && !this.id_class(var2, var1, var3).id_byte(id_continue.get(var4.id_case())).id_break() ? 0 : var5;
         }
      } else {
         return 0;
      }
   }

   protected static boolean id_class(xc_3 var0, rpr_3 var1) {
      if (var0.id_class(xu_3.ra)) {
         return true;
      } else if (var0.id_class(xu_3.BS)) {
         rpr_3 var2 = var0.id_byte(WZ.p);
         return var2 == var1 || var2.id_case() == var1;
      } else {
         return var0.id_class(xu_3.bK) ? var1 == var0.id_byte(kR_2.id_volatile) : var0.id_implements() && var1 != null;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_synchronized.get(var1.id_class(id_new, Integer.valueOf(0)));
   }

   private void id_class(rYB var1, Random var2, rfH_2 var3, rje_3 var4, rpr_3 var5, rpr_3 var6, float var7, float var8) {
      float var9 = var8 - var7;
      if (!(var2.nextFloat() >= 0.2F * var9)) {
         float var10 = 0.4375F;
         float var11 = var7 + var9 * var2.nextFloat();
         double var12 = 0.5 + (double)(0.4375F * (float)var5.id_implements()) + (double)(var11 * (float)var6.id_implements());
         double var14 = 0.5 + (double)(0.4375F * (float)var5.id_finally()) + (double)(var11 * (float)var6.id_finally());
         double var16 = 0.5 + (double)(0.4375F * (float)var5.id_extends()) + (double)(var11 * (float)var6.id_extends());
         var1.id_class(
            new rLc_1(var4.id_class(), var4.id_break(), var4.id_byte(), 1.0F),
            (double)var3.b_() + var12,
            (double)var3.c_() + var14,
            (double)var3.d_() + var16,
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue) {
         if (var1.id_class((rRR)var2, var3)) {
            this.id_class(var2, var3, var1);
         } else {
            id_protected(var1, var2, var3);
            var2.id_class(var3, false);
         }
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break()) && !var2.id_continue) {
         this.id_class(var2, var3, var1);

         for (rpr_3 var7 : rpb_3.VERTICAL) {
            var2.id_break(var3.id_break(var7), this);
         }

         this.id_protected(var2, var3);
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_class(var1.id_int(), this.id_public, var1.id_class());
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4) {
      for (rpr_3 var6 : rpb_3.HORIZONTAL) {
         rfH_2 var7 = var2.id_break(var6);
         if (var3.id_byte(id_continue.get(var6)).id_break() != var4.id_byte(id_continue.get(var6)).id_break() && var1.id_byte(var7).id_catch(var1, var7)) {
            var1.id_class(var7, var4.id_break(), var6.id_case());
         }
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!((rhx_3)var4.id_implements[18]).id_throws) {
         return ryZ_2.PASS;
      } else {
         if (id_volatile(var1) || id_final(var1)) {
            xc_3 var7 = id_volatile(var1) ? this.id_continue() : this.id_public;
            var7 = var7.id_class(id_new, var1.id_byte(id_new));
            var7 = this.id_class(var2, var7, var3);
            if (var7 != var1) {
               var2.id_class(var3, var7, 3);
               this.id_class(var2, var3, var1, var7);
               return ryZ_2.SUCCESS;
            }
         }

         return ryZ_2.PASS;
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package, id_int, id_new);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.id_class(id_volatile, var1.id_byte(id_package)).id_class(id_package, var1.id_byte(id_volatile));
         case FRONT_BACK:
            return var1.id_class(id_final, var1.id_byte(id_int)).id_class(id_int, var1.id_byte(id_final));
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.id_class(id_volatile, var1.id_byte(id_package))
               .id_class(id_final, var1.id_byte(id_int))
               .id_class(id_package, var1.id_byte(id_volatile))
               .id_class(id_int, var1.id_byte(id_final));
         case COUNTERCLOCKWISE_90:
            return var1.id_class(id_volatile, var1.id_byte(id_final))
               .id_class(id_final, var1.id_byte(id_package))
               .id_class(id_package, var1.id_byte(id_int))
               .id_class(id_int, var1.id_byte(id_volatile));
         case CLOCKWISE_90:
            return var1.id_class(id_volatile, var1.id_byte(id_int))
               .id_class(id_final, var1.id_byte(id_volatile))
               .id_class(id_package, var1.id_byte(id_final))
               .id_class(id_int, var1.id_byte(id_package));
         default:
            return var1;
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      int var5 = var1.id_byte(id_new);
      if (var5 != 0) {
         for (rpr_3 var7 : rpb_3.HORIZONTAL) {
            rCY var8 = var1.id_byte(id_continue.get(var7));
            switch (var8) {
               case UP:
                  this.id_class(var2, var4, var3, id_return[var5], var7, rpr_3.UP, -0.5F, 0.5F);
               case SIDE:
                  this.id_class(var2, var4, var3, id_return[var5], rpr_3.DOWN, var7, 0.0F, 0.5F);
                  break;
               case NONE:
               default:
                  this.id_class(var2, var4, var3, id_return[var5], rpr_3.DOWN, var7, 0.0F, 0.3F);
            }
         }
      }
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.id_class(var1, var2);
      if (var3.id_byte(id_new) != var4) {
         if (var1.id_byte(var2) == var3) {
            var1.id_class(var2, var3.id_class(id_new, Integer.valueOf(var4)), 2);
         }

         HashSet var5 = Sets.newHashSet();
         var5.add(var2);

         for (rpr_3 var9 : rpr_3.values()) {
            var5.add(var2.id_break(var9));
         }

         for (rfH_2 var11 : var5) {
            var1.id_break(var11, this);
         }
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.DOWN) {
         return var1;
      } else if (var2 == rpr_3.UP) {
         return this.id_class(var4, var1, var5);
      } else {
         rCY var7 = this.id_class(var4, var5, var2);
         return var7.id_break() == var1.id_byte(id_continue.get(var2)).id_break() && !id_volatile(var1)
            ? var1.id_class(id_continue.get(var2), var7)
            : this.id_class(var4, this.id_public.id_class(id_new, var1.id_byte(id_new)).id_class(id_continue.get(var2), var7), var5);
      }
   }

   @Override
   public void id_class(xc_3 var1, rRg_1 var2, rfH_2 var3, int var4, int var5) {
      rfw_3 var6 = new rfw_3();

      for (rpr_3 var8 : rpb_3.HORIZONTAL) {
         rCY var9 = var1.id_byte(id_continue.get(var8));
         if (var9 != rCY.NONE && !var2.id_byte(var6.id_class(var3, var8)).id_class(this)) {
            var6.id_class(rpr_3.DOWN);
            xc_3 var10 = var2.id_byte(var6);
            if (!var10.id_class(xu_3.bK)) {
               rfH_2 var11 = var6.id_break(var8.id_case());
               xc_3 var12 = var10.id_class(var8.id_case(), var2.id_byte(var11), var2, var6, var11);
               id_class(var10, var12, var2, var6, var4, var5);
            }

            var6.id_class(var3, var8).id_class(rpr_3.UP);
            xc_3 var14 = var2.id_byte(var6);
            if (!var14.id_class(xu_3.bK)) {
               rfH_2 var15 = var6.id_break(var8.id_case());
               xc_3 var13 = var14.id_class(var8.id_case(), var2.id_byte(var15), var2, var6, var15);
               id_class(var14, var13, var2, var6, var4, var5);
            }
         }
      }
   }

   private rCY id_class(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.id_class(var1, var2, var3, !var1.id_byte(var2.id_final()).id_catch(var1, var2));
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      xc_3 var5 = var2.id_byte(var4);
      return this.id_break(var2, var4, var5);
   }

   private rCY id_class(rRq_1 var1, rfH_2 var2, rpr_3 var3, boolean var4) {
      rfH_2 var5 = var2.id_break(var3);
      xc_3 var6 = var1.id_byte(var5);
      if (var4) {
         boolean var7 = this.id_break(var1, var5, var6);
         if (var7 && id_private(var1.id_byte(var5.id_final()))) {
            if (var6.id_protected(var1, var5, var3.id_case())) {
               return rCY.UP;
            }

            return rCY.SIDE;
         }
      }

      return id_class(var6, var3) || !var6.id_catch(var1, var5) && id_private(var1.id_byte(var5.id_break())) ? rCY.SIDE : rCY.NONE;
   }

   private xc_3 id_class(rRq_1 var1, xc_3 var2, rfH_2 var3) {
      boolean var4 = id_final(var2);
      var2 = this.id_break(var1, this.id_continue().id_class(id_new, var2.id_byte(id_new)), var3);
      if (var4 && id_final(var2)) {
         return var2;
      } else {
         boolean var5 = var2.id_byte(id_volatile).id_break();
         boolean var6 = var2.id_byte(id_package).id_break();
         boolean var7 = var2.id_byte(id_final).id_break();
         boolean var8 = var2.id_byte(id_int).id_break();
         boolean var9 = !var5 && !var6;
         boolean var10 = !var7 && !var8;
         if (!var8 && var9) {
            var2 = var2.id_class(id_int, rCY.SIDE);
         }

         if (!var7 && var9) {
            var2 = var2.id_class(id_final, rCY.SIDE);
         }

         if (!var5 && var10) {
            var2 = var2.id_class(id_volatile, rCY.SIDE);
         }

         if (!var6 && var10) {
            var2 = var2.id_class(id_package, rCY.SIDE);
         }

         return var2;
      }
   }

   private int id_class(rYB var1, rfH_2 var2) {
      this.id_goto = false;
      int var3 = var1.id_goto(var2);
      this.id_goto = true;
      int var4 = 0;
      if (var3 < 15) {
         for (rpr_3 var6 : rpb_3.HORIZONTAL) {
            rfH_2 var7 = var2.id_break(var6);
            xc_3 var8 = var1.id_byte(var7);
            var4 = Math.max(var4, this.id_package(var8));
            rfH_2 var9 = var2.id_final();
            if (var8.id_catch(var1, var7) && !var1.id_byte(var9).id_catch(var1, var9)) {
               var4 = Math.max(var4, this.id_package(var1.id_byte(var7.id_final())));
            } else if (!var8.id_catch(var1, var7)) {
               var4 = Math.max(var4, this.id_package(var1.id_byte(var7.id_break())));
            }
         }
      }

      return Math.max(var3, var4 - 1);
   }

   private xc_3 id_break(rRq_1 var1, xc_3 var2, rfH_2 var3) {
      boolean var4 = !var1.id_byte(var3.id_final()).id_catch(var1, var3);

      for (rpr_3 var6 : rpb_3.HORIZONTAL) {
         if (!var2.id_byte(id_continue.get(var6)).id_break()) {
            rCY var7 = this.id_class(var1, var3, var6, var4);
            var2 = var2.id_class(id_continue.get(var6), var7);
         }
      }

      return var2;
   }

   private void id_break(rYB var1, rfH_2 var2) {
      if (var1.id_byte(var2).id_class(this)) {
         var1.id_break(var2, this);

         for (rpr_3 var6 : rpr_3.values()) {
            var1.id_break(var2.id_break(var6), this);
         }
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         super.id_break(var1, var2, var3, var4, var5);
         if (!var2.id_continue) {
            for (rpr_3 var9 : rpr_3.values()) {
               var2.id_break(var3.id_break(var9), this);
            }

            this.id_class(var2, var3, var1);
            this.id_protected(var2, var3);
         }
      }
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return !this.id_goto ? 0 : var1.id_break(var2, var3, var4);
   }

   private boolean id_break(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return var3.id_protected(var1, var2, rpr_3.UP) || var3.id_class(xu_3.sl);
   }

   private rjC_2 id_implements(xc_3 var1) {
      rjC_2 var2 = id_super;

      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         rCY var5 = var1.id_byte(id_continue.get(var4));
         if (var5 == rCY.SIDE) {
            var2 = rjw_3.id_class(var2, id_this.get(var4));
         } else if (var5 == rCY.UP) {
            var2 = rjw_3.id_class(var2, id_else.get(var4));
         }
      }

      return var2;
   }

   private int id_package(xc_3 var1) {
      return var1.id_class(this) ? var1.id_byte(id_new) : 0;
   }

   private void id_protected(rYB var1, rfH_2 var2) {
      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         this.id_break(var1, var2.id_break(var4));
      }

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rfH_2 var5 = var2.id_break(var7);
         if (var1.id_byte(var5).id_catch(var1, var5)) {
            this.id_break(var1, var5.id_final());
         } else {
            this.id_break(var1, var5.id_break());
         }
      }
   }

   protected static boolean id_private(xc_3 var0) {
      return id_class(var0, (rpr_3)null);
   }

   private static boolean id_final(xc_3 var0) {
      return !var0.id_byte(id_volatile).id_break()
         && !var0.id_byte(id_package).id_break()
         && !var0.id_byte(id_final).id_break()
         && !var0.id_byte(id_int).id_break();
   }

   private static boolean id_volatile(xc_3 var0) {
      return var0.id_byte(id_volatile).id_break()
         && var0.id_byte(id_package).id_break()
         && var0.id_byte(id_final).id_break()
         && var0.id_byte(id_int).id_break();
   }
}
