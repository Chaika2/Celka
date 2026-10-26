package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public abstract class riW_2 extends rrrn_1 {
   protected static final xc_3 class_ = xu_3.Em.continue_();
   protected static final xc_3 break_ = xu_3.EZ.continue_();
   protected static final xc_3 byte_ = xu_3.Ev.continue_();
   protected static final xc_3 protected_ = break_;
   protected static final xc_3 throws_ = xu_3.EH.continue_();
   protected static final xc_3 case_ = xu_3.try_.continue_();
   protected static final Set<xd_3> catch_ = ImmutableSet.builder().add(xu_3.PT).add(xu_3.Ei).add(xu_3.hP).add(case_.break_()).build();
   protected static final int private_ = break_(2, 0, 0);
   protected static final int implements_ = break_(2, 2, 0);
   protected static final int finally_ = break_(0, 1, 0);
   protected static final int extends_ = break_(4, 1, 0);
   protected riz_3 native_;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected riW_2(raF_2 var1, int var2, rpr_3 var3, riz_3 var4, int var5, int var6, int var7) {
      super(var1, var2);
      this.class_(var3);
      this.native_ = var4;
      int var8 = var4.class_;
      int var9 = var8 % 5;
      int var10 = var8 / 5 % 5;
      int var11 = var8 / 25;
      if (var3 != rpr_3.NORTH && var3 != rpr_3.SOUTH) {
         this.final_ = new rfi_3(0, 0, 0, var7 * 8 - 1, var6 * 4 - 1, var5 * 8 - 1);
      } else {
         this.final_ = new rfi_3(0, 0, 0, var5 * 8 - 1, var6 * 4 - 1, var7 * 8 - 1);
      }

      switch (var3) {
         case NORTH:
            this.final_.class_(var9 * 8, var11 * 4, -(var10 + var7) * 8 + 1);
            break;
         case SOUTH:
            this.final_.class_(var9 * 8, var11 * 4, var10 * 8);
            break;
         case WEST:
            this.final_.class_(-(var10 + var7) * 8 + 1, var11 * 4, var9 * 8);
            break;
         default:
            this.final_.class_(var10 * 8, var11 * 4, var9 * 8);
      }
   }

   public riW_2(raF_2 var1, rpr_3 var2, rfi_3 var3) {
      super(var1, 1);
      this.class_(var2);
      this.final_ = var3;
   }

   public riW_2(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public riW_2(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
   }

   protected boolean class_(rRI var1, rfi_3 var2, int var3, int var4, int var5) {
      int var6 = this.class_(var3, var5);
      int var7 = this.class_(var4);
      int var8 = this.break_(var3, var5);
      if (var2.break_(new rfH_2(var6, var7, var8))) {
         rEc_1 var9 = aI_2.continue_.class_(var1.byte_());
         var9.protected_(var9.SK());
         var9.class_((double)var6 + 0.5, (double)var7, (double)var8 + 0.5, 0.0F, 0.0F);
         var9.class_(var1, var1.throws_(var9.Bs()), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
         var1.class_(var9);
         return true;
      } else {
         return false;
      }
   }

   protected boolean class_(rfi_3 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.class_(var2, var3);
      int var7 = this.break_(var2, var3);
      int var8 = this.class_(var4, var5);
      int var9 = this.break_(var4, var5);
      return var1.class_(Math.min(var6, var8), Math.min(var7, var9), Math.max(var6, var8), Math.max(var7, var9));
   }

   protected void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, xc_3 var9) {
      for (int var10 = var4; var10 <= var7; var10++) {
         for (int var11 = var3; var11 <= var6; var11++) {
            for (int var12 = var5; var12 <= var8; var12++) {
               if (this.class_(var1, var11, var10, var12, var2) == case_) {
                  this.class_(var1, var9, var11, var10, var12, var2);
               }
            }
         }
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
   }

   protected void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var4; var9 <= var7; var9++) {
         for (int var10 = var3; var10 <= var6; var10++) {
            for (int var11 = var5; var11 <= var8; var11++) {
               xc_3 var12 = this.class_(var1, var10, var9, var11, var2);
               if (!catch_.contains(var12.break_())) {
                  if (this.class_(var9) >= var1.short_() && var12 != case_) {
                     this.class_(var1, xu_3.class_.continue_(), var10, var9, var11, var2);
                  } else {
                     this.class_(var1, case_, var10, var9, var11, var2);
                  }
               }
            }
         }
      }
   }

   protected void class_(rRI var1, rfi_3 var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.class_(var1, var2, var3 + 0, 0, var4 + 0, var3 + 2, 0, var4 + 8 - 1, class_, class_, false);
         this.class_(var1, var2, var3 + 5, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, class_, class_, false);
         this.class_(var1, var2, var3 + 3, 0, var4 + 0, var3 + 4, 0, var4 + 2, class_, class_, false);
         this.class_(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 8 - 1, class_, class_, false);
         this.class_(var1, var2, var3 + 3, 0, var4 + 2, var3 + 4, 0, var4 + 2, break_, break_, false);
         this.class_(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 5, break_, break_, false);
         this.class_(var1, var2, var3 + 2, 0, var4 + 3, var3 + 2, 0, var4 + 4, break_, break_, false);
         this.class_(var1, var2, var3 + 5, 0, var4 + 3, var3 + 5, 0, var4 + 4, break_, break_, false);
      } else {
         this.class_(var1, var2, var3 + 0, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, class_, class_, false);
      }
   }

   protected static final int break_(int var0, int var1, int var2) {
      return var1 * 25 + var2 * 5 + var0;
   }
}
