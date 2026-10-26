package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class kD_2 extends dz_3 {
   public static final rCN final_ = rCT.catch_;
   protected static final rjC_2 package_ = xd_3.class_(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final rjC_2 int_ = xd_3.class_(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 new_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final rjC_2 continue_ = xd_3.class_(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 super_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final rjC_2 this_ = xd_3.class_(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean else_;

   public kD_2(boolean var1, Jq_1 var2) {
      super(var2);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)));
      this.else_ = var1;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   private boolean class_(rYB var1, rfH_2 var2, rpr_3 var3, boolean var4) {
      rfH_2 var5 = var2.break_(var3);
      if (!var4 && var1.byte_(var5).class_(xu_3.rS)) {
         var1.class_(var5, xu_3.class_.continue_(), 20);
      }

      ke_3 var6 = new ke_3(var1, var2, var3, var4);
      if (!var6.class_()) {
         return false;
      } else {
         HashMap var7 = Maps.newHashMap();
         List var8 = var6.break_();
         ArrayList var9 = Lists.newArrayList();

         for (int var10 = 0; var10 < var8.size(); var10++) {
            rfH_2 var11 = (rfH_2)var8.get(var10);
            xc_3 var12 = var1.byte_(var11);
            var9.add(var12);
            var7.put(var11, var12);
         }

         List var19 = var6.byte_();
         xc_3[] var20 = new xc_3[var8.size() + var19.size()];
         rpr_3 var21 = var4 ? var3 : var3.case_();
         int var13 = 0;

         for (int var14 = var19.size() - 1; var14 >= 0; var14--) {
            rfH_2 var15 = (rfH_2)var19.get(var14);
            xc_3 var16 = var1.byte_(var15);
            ryO_2 var17 = var16.break_().protected_() ? var1.class_(var15) : null;
            class_(var16, var1, var15, var17);
            var1.class_(var15, xu_3.class_.continue_(), 18);
            var20[var13++] = var16;
         }

         for (int var23 = var8.size() - 1; var23 >= 0; var23--) {
            rfH_2 var26 = (rfH_2)var8.get(var23);
            xc_3 var33 = var1.byte_(var26);
            var26 = var26.break_(var21);
            var7.remove(var26);
            var1.class_(var26, xu_3.rc.continue_().class_(volatile_, var3), 68);
            var1.class_(var26, ky_3.class_((xc_3)var9.get(var23), var3, var4, false));
            var20[var13++] = var33;
         }

         if (var4) {
            rCg_1 var24 = this.else_ ? rCg_1.STICKY : rCg_1.DEFAULT;
            xc_3 var28 = xu_3.rS.continue_().class_(ka_3.volatile_, var3).class_(ka_3.final_, var24);
            xc_3 var34 = xu_3.rc.continue_().class_(ky_3.volatile_, var3).class_(ky_3.final_, this.else_ ? rCg_1.STICKY : rCg_1.DEFAULT);
            var7.remove(var5);
            var1.class_(var5, var34, 68);
            var1.class_(var5, ky_3.class_(var28, var3, true, true));
         }

         xc_3 var25 = xu_3.class_.continue_();

         for (rfH_2 var35 : var7.keySet()) {
            var1.class_(var35, var25, 82);
         }

         for (Entry var36 : var7.entrySet()) {
            rfH_2 var38 = (rfH_2)var36.getKey();
            xc_3 var18 = (xc_3)var36.getValue();
            var18.break_(var1, var38, 2);
            var25.class_(var1, var38, 2);
            var25.break_(var1, var38, 2);
         }

         var13 = 0;

         for (int var31 = var19.size() - 1; var31 >= 0; var31--) {
            xc_3 var37 = var20[var13++];
            rfH_2 var39 = (rfH_2)var19.get(var31);
            var37.break_(var1, var39, 2);
            var1.break_(var39, var37.break_());
         }

         for (int var32 = var8.size() - 1; var32 >= 0; var32--) {
            var1.break_((rfH_2)var8.get(var32), var20[var13++].break_());
         }

         if (var4) {
            var1.break_(var5, xu_3.rS);
         }

         return true;
      }
   }

   public static boolean class_(xc_3 var0, rYB var1, rfH_2 var2, rpr_3 var3, boolean var4, rpr_3 var5) {
      if (var2.c_() < 0 || var2.c_() > var1.try_() - 1 || !var1.instanceof_().class_(var2)) {
         return false;
      } else if (var0.catch_()) {
         return true;
      } else if (var0.class_(xu_3.rg) || var0.class_(xu_3.Jd) || var0.class_(xu_3.Jk)) {
         return false;
      } else if (var3 == rpr_3.DOWN && var2.c_() == 0) {
         return false;
      } else if (var3 == rpr_3.UP && var2.c_() == var1.try_() - 1) {
         return false;
      } else {
         if (!var0.class_(xu_3.rB) && !var0.class_(xu_3.D)) {
            if (var0.private_(var1, var2) == -1.0F) {
               return false;
            }

            switch (var0.extends_()) {
               case BLOCK:
                  return false;
               case DESTROY:
                  return var4;
               case PUSH_ONLY:
                  return var3 == var5;
            }
         } else if (var0.byte_(final_)) {
            return false;
         }

         return !var0.break_().protected_();
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      rpr_3 var6 = var1.byte_(volatile_);
      if (!var2.continue_) {
         boolean var7 = this.class_(var2, var3, var6);
         if (var7 && (var4 == 1 || var4 == 2)) {
            var2.class_(var3, var1.class_(final_, Boolean.valueOf(true)), 2);
            return false;
         }

         if (!var7 && var4 == 0) {
            return false;
         }
      }

      if (var4 == 0) {
         if (!this.class_(var2, var3, var6, true)) {
            return false;
         }

         var2.class_(var3, var1.class_(final_, Boolean.valueOf(true)), 67);
         var2.class_((rhd_3)null, var3, rqn_3.hN, rqL_2.BLOCKS, 0.5F, var2.int_.nextFloat() * 0.25F + 0.6F);
      } else if (var4 == 1 || var4 == 2) {
         ryO_2 var14 = var2.class_(var3.break_(var6));
         if (var14 instanceof rHa_1) {
            ((rHa_1)var14).volatile_();
         }

         xc_3 var8 = xu_3.rc.continue_().class_(ky_3.volatile_, var6).class_(ky_3.final_, this.else_ ? rCg_1.STICKY : rCg_1.DEFAULT);
         var2.class_(var3, var8, 20);
         var2.class_(var3, ky_3.class_(this.continue_().class_(volatile_, rpr_3.class_(var5 & 7)), var6, false, true));
         var2.class_(var3, var8.break_());
         var8.class_(var2, var3, 2);
         if (this.else_) {
            rfH_2 var9 = var3.break_(var6.implements_() * 2, var6.finally_() * 2, var6.extends_() * 2);
            xc_3 var10 = var2.byte_(var9);
            boolean var11 = false;
            if (var10.class_(xu_3.rc) && var2.class_(var9) instanceof rHa_1 var13 && var13.private_() == var6 && var13.catch_()) {
               var13.volatile_();
               var11 = true;
            }

            if (!var11) {
               if (var4 == 1
                  && !var10.catch_()
                  && class_(var10, var2, var9, var6.case_(), false, var6)
                  && (var10.extends_() == Qs_1.NORMAL || var10.class_(xu_3.rB) || var10.class_(xu_3.D))) {
                  this.class_(var2, var3, var6, false);
               } else {
                  var2.class_(var3.break_(var6), false);
               }
            }
         } else {
            var2.class_(var3.break_(var6), false);
         }

         var2.class_((rhd_3)null, var3, rqn_3.hQ, rqL_2.BLOCKS, 0.5F, var2.int_.nextFloat() * 0.15F + 0.6F);
      }

      return true;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.protected_().case_()).class_(final_, Boolean.valueOf(false));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_()) && !var2.continue_ && var2.class_(var3) == null) {
         this.class_(var2, var3, var1);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.continue_) {
         this.class_(var2, var3, var1);
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (!var1.continue_) {
         this.class_(var1, var2, var3);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.byte_(final_)) {
         switch ((rpr_3)var1.byte_(volatile_)) {
            case DOWN:
               return this_;
            case UP:
            default:
               return super_;
            case NORTH:
               return continue_;
            case SOUTH:
               return new_;
            case WEST:
               return int_;
            case EAST:
               return package_;
         }
      } else {
         return rjw_3.break_();
      }
   }

   private boolean class_(rYB var1, rfH_2 var2, rpr_3 var3) {
      for (rpr_3 var7 : rpr_3.values()) {
         if (var7 != var3 && var1.break_(var2.break_(var7), var7)) {
            return true;
         }
      }

      if (var1.break_(var2, rpr_3.DOWN)) {
         return true;
      } else {
         rfH_2 var9 = var2.final_();

         for (rpr_3 var8 : rpr_3.values()) {
            if (var8 != rpr_3.DOWN && var1.break_(var9.break_(var8), var8)) {
               return true;
            }
         }

         return false;
      }
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      rpr_3 var4 = var3.byte_(volatile_);
      boolean var5 = this.class_(var1, var2, var4);
      if (var5 && !var3.byte_(final_)) {
         if (new ke_3(var1, var2, var4, true).class_()) {
            var1.class_(var2, this, 0, var4.byte_());
         }
      } else if (!var5 && var3.byte_(final_)) {
         rfH_2 var6 = var2.class_(var4, 2);
         xc_3 var7 = var1.byte_(var6);
         byte var8 = 1;
         if (var7.class_(xu_3.rc)
            && var7.byte_(volatile_) == var4
            && var1.class_(var6) instanceof rHa_1 var10
            && var10.catch_()
            && (var10.class_(0.0F) < 0.5F || var1.r() == var10.final_() || ((rrEm_1)var1).case_())) {
            var8 = 2;
         }

         var1.class_(var2, this, var8, var4.byte_());
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      return var1.byte_(final_);
   }
}
