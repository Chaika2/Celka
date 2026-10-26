package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class kD_2 extends dz_3 {
   public static final rCN id_final = rCT.id_catch;
   protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final rjC_2 id_this = xd_3.id_class(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean id_else;

   public kD_2(boolean var1, Jq_1 var2) {
      super(var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)));
      this.id_else = var1;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   private boolean id_class(rYB var1, rfH_2 var2, rpr_3 var3, boolean var4) {
      rfH_2 var5 = var2.id_break(var3);
      if (!var4 && var1.id_byte(var5).id_class(xu_3.rS)) {
         var1.id_class(var5, xu_3.id_class.id_continue(), 20);
      }

      ke_3 var6 = new ke_3(var1, var2, var3, var4);
      if (!var6.id_class()) {
         return false;
      } else {
         HashMap var7 = Maps.newHashMap();
         List var8 = var6.id_break();
         ArrayList var9 = Lists.newArrayList();

         for (int var10 = 0; var10 < var8.size(); var10++) {
            rfH_2 var11 = (rfH_2)var8.get(var10);
            xc_3 var12 = var1.id_byte(var11);
            var9.add(var12);
            var7.put(var11, var12);
         }

         List var19 = var6.id_byte();
         xc_3[] var20 = new xc_3[var8.size() + var19.size()];
         rpr_3 var21 = var4 ? var3 : var3.id_case();
         int var13 = 0;

         for (int var14 = var19.size() - 1; var14 >= 0; var14--) {
            rfH_2 var15 = (rfH_2)var19.get(var14);
            xc_3 var16 = var1.id_byte(var15);
            ryO_2 var17 = var16.id_break().id_protected() ? var1.id_class(var15) : null;
            id_class(var16, var1, var15, var17);
            var1.id_class(var15, xu_3.id_class.id_continue(), 18);
            var20[var13++] = var16;
         }

         for (int var23 = var8.size() - 1; var23 >= 0; var23--) {
            rfH_2 var26 = (rfH_2)var8.get(var23);
            xc_3 var33 = var1.id_byte(var26);
            var26 = var26.id_break(var21);
            var7.remove(var26);
            var1.id_class(var26, xu_3.rc.id_continue().id_class(id_volatile, var3), 68);
            var1.id_class(var26, ky_3.id_class((xc_3)var9.get(var23), var3, var4, false));
            var20[var13++] = var33;
         }

         if (var4) {
            rCg_1 var24 = this.id_else ? rCg_1.STICKY : rCg_1.DEFAULT;
            xc_3 var28 = xu_3.rS.id_continue().id_class(ka_3.id_volatile, var3).id_class(ka_3.id_final, var24);
            xc_3 var34 = xu_3.rc.id_continue().id_class(ky_3.id_volatile, var3).id_class(ky_3.id_final, this.id_else ? rCg_1.STICKY : rCg_1.DEFAULT);
            var7.remove(var5);
            var1.id_class(var5, var34, 68);
            var1.id_class(var5, ky_3.id_class(var28, var3, true, true));
         }

         xc_3 var25 = xu_3.id_class.id_continue();

         for (rfH_2 var35 : var7.keySet()) {
            var1.id_class(var35, var25, 82);
         }

         for (Entry var36 : var7.entrySet()) {
            rfH_2 var38 = (rfH_2)var36.getKey();
            xc_3 var18 = (xc_3)var36.getValue();
            var18.id_break(var1, var38, 2);
            var25.id_class(var1, var38, 2);
            var25.id_break(var1, var38, 2);
         }

         var13 = 0;

         for (int var31 = var19.size() - 1; var31 >= 0; var31--) {
            xc_3 var37 = var20[var13++];
            rfH_2 var39 = (rfH_2)var19.get(var31);
            var37.id_break(var1, var39, 2);
            var1.id_break(var39, var37.id_break());
         }

         for (int var32 = var8.size() - 1; var32 >= 0; var32--) {
            var1.id_break((rfH_2)var8.get(var32), var20[var13++].id_break());
         }

         if (var4) {
            var1.id_break(var5, xu_3.rS);
         }

         return true;
      }
   }

   public static boolean id_class(xc_3 var0, rYB var1, rfH_2 var2, rpr_3 var3, boolean var4, rpr_3 var5) {
      if (var2.c_() < 0 || var2.c_() > var1.id_try() - 1 || !var1.id_instanceof().id_class(var2)) {
         return false;
      } else if (var0.id_catch()) {
         return true;
      } else if (var0.id_class(xu_3.rg) || var0.id_class(xu_3.Jd) || var0.id_class(xu_3.Jk)) {
         return false;
      } else if (var3 == rpr_3.DOWN && var2.c_() == 0) {
         return false;
      } else if (var3 == rpr_3.UP && var2.c_() == var1.id_try() - 1) {
         return false;
      } else {
         if (!var0.id_class(xu_3.rB) && !var0.id_class(xu_3.D)) {
            if (var0.id_private(var1, var2) == -1.0F) {
               return false;
            }

            switch (var0.id_extends()) {
               case BLOCK:
                  return false;
               case DESTROY:
                  return var4;
               case PUSH_ONLY:
                  return var3 == var5;
            }
         } else if (var0.id_byte(id_final)) {
            return false;
         }

         return !var0.id_break().id_protected();
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      rpr_3 var6 = var1.id_byte(id_volatile);
      if (!var2.id_continue) {
         boolean var7 = this.id_class(var2, var3, var6);
         if (var7 && (var4 == 1 || var4 == 2)) {
            var2.id_class(var3, var1.id_class(id_final, Boolean.valueOf(true)), 2);
            return false;
         }

         if (!var7 && var4 == 0) {
            return false;
         }
      }

      if (var4 == 0) {
         if (!this.id_class(var2, var3, var6, true)) {
            return false;
         }

         var2.id_class(var3, var1.id_class(id_final, Boolean.valueOf(true)), 67);
         var2.id_class((rhd_3)null, var3, rqn_3.hN, rqL_2.BLOCKS, 0.5F, var2.id_int.nextFloat() * 0.25F + 0.6F);
      } else if (var4 == 1 || var4 == 2) {
         ryO_2 var14 = var2.id_class(var3.id_break(var6));
         if (var14 instanceof rHa_1) {
            ((rHa_1)var14).id_volatile();
         }

         xc_3 var8 = xu_3.rc.id_continue().id_class(ky_3.id_volatile, var6).id_class(ky_3.id_final, this.id_else ? rCg_1.STICKY : rCg_1.DEFAULT);
         var2.id_class(var3, var8, 20);
         var2.id_class(var3, ky_3.id_class(this.id_continue().id_class(id_volatile, rpr_3.id_class(var5 & 7)), var6, false, true));
         var2.id_class(var3, var8.id_break());
         var8.id_class(var2, var3, 2);
         if (this.id_else) {
            rfH_2 var9 = var3.id_break(var6.id_implements() * 2, var6.id_finally() * 2, var6.id_extends() * 2);
            xc_3 var10 = var2.id_byte(var9);
            boolean var11 = false;
            if (var10.id_class(xu_3.rc) && var2.id_class(var9) instanceof rHa_1 var13 && var13.id_private() == var6 && var13.id_catch()) {
               var13.id_volatile();
               var11 = true;
            }

            if (!var11) {
               if (var4 == 1
                  && !var10.id_catch()
                  && id_class(var10, var2, var9, var6.id_case(), false, var6)
                  && (var10.id_extends() == Qs_1.NORMAL || var10.id_class(xu_3.rB) || var10.id_class(xu_3.D))) {
                  this.id_class(var2, var3, var6, false);
               } else {
                  var2.id_class(var3.id_break(var6), false);
               }
            }
         } else {
            var2.id_class(var3.id_break(var6), false);
         }

         var2.id_class((rhd_3)null, var3, rqn_3.hQ, rqL_2.BLOCKS, 0.5F, var2.id_int.nextFloat() * 0.15F + 0.6F);
      }

      return true;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_protected().id_case()).id_class(id_final, Boolean.valueOf(false));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break()) && !var2.id_continue && var2.id_class(var3) == null) {
         this.id_class(var2, var3, var1);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue) {
         this.id_class(var2, var3, var1);
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (!var1.id_continue) {
         this.id_class(var1, var2, var3);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.id_byte(id_final)) {
         switch ((rpr_3)var1.id_byte(id_volatile)) {
            case DOWN:
               return id_this;
            case UP:
            default:
               return id_super;
            case NORTH:
               return id_continue;
            case SOUTH:
               return id_new;
            case WEST:
               return id_int;
            case EAST:
               return id_package;
         }
      } else {
         return rjw_3.id_break();
      }
   }

   private boolean id_class(rYB var1, rfH_2 var2, rpr_3 var3) {
      for (rpr_3 var7 : rpr_3.values()) {
         if (var7 != var3 && var1.id_break(var2.id_break(var7), var7)) {
            return true;
         }
      }

      if (var1.id_break(var2, rpr_3.DOWN)) {
         return true;
      } else {
         rfH_2 var9 = var2.id_final();

         for (rpr_3 var8 : rpr_3.values()) {
            if (var8 != rpr_3.DOWN && var1.id_break(var9.id_break(var8), var8)) {
               return true;
            }
         }

         return false;
      }
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.id_byte(id_volatile);
      boolean var5 = this.id_class(var1, var2, var4);
      if (var5 && !var3.id_byte(id_final)) {
         if (new ke_3(var1, var2, var4, true).id_class()) {
            var1.id_class(var2, this, 0, var4.id_byte());
         }
      } else if (!var5 && var3.id_byte(id_final)) {
         rfH_2 var6 = var2.id_class(var4, 2);
         xc_3 var7 = var1.id_byte(var6);
         byte var8 = 1;
         if (var7.id_class(xu_3.rc)
            && var7.id_byte(id_volatile) == var4
            && var1.id_class(var6) instanceof rHa_1 var10
            && var10.id_catch()
            && (var10.id_class(0.0F) < 0.5F || var1.r() == var10.id_final() || ((rrEm_1)var1).id_case())) {
            var8 = 2;
         }

         var1.id_class(var2, this, var8, var4.id_byte());
      }
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return var1.id_byte(id_final);
   }
}
