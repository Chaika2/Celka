package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public abstract class riW_2 extends rrrn_1 {
   protected static final xc_3 id_class = xu_3.Em.id_continue();
   protected static final xc_3 id_break = xu_3.EZ.id_continue();
   protected static final xc_3 id_byte = xu_3.Ev.id_continue();
   protected static final xc_3 id_protected = id_break;
   protected static final xc_3 id_throws = xu_3.EH.id_continue();
   protected static final xc_3 id_case = xu_3.id_try.id_continue();
   protected static final Set<xd_3> id_catch = ImmutableSet.builder().add(xu_3.PT).add(xu_3.Ei).add(xu_3.hP).add(id_case.id_break()).build();
   protected static final int id_private = id_break(2, 0, 0);
   protected static final int id_implements = id_break(2, 2, 0);
   protected static final int id_finally = id_break(0, 1, 0);
   protected static final int id_extends = id_break(4, 1, 0);
   protected riz_3 id_native;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected riW_2(raF_2 var1, int var2, rpr_3 var3, riz_3 var4, int var5, int var6, int var7) {
      super(var1, var2);
      this.id_class(var3);
      this.id_native = var4;
      int var8 = var4.id_class;
      int var9 = var8 % 5;
      int var10 = var8 / 5 % 5;
      int var11 = var8 / 25;
      if (var3 != rpr_3.NORTH && var3 != rpr_3.SOUTH) {
         this.id_final = new rfi_3(0, 0, 0, var7 * 8 - 1, var6 * 4 - 1, var5 * 8 - 1);
      } else {
         this.id_final = new rfi_3(0, 0, 0, var5 * 8 - 1, var6 * 4 - 1, var7 * 8 - 1);
      }

      switch (var3) {
         case NORTH:
            this.id_final.id_class(var9 * 8, var11 * 4, -(var10 + var7) * 8 + 1);
            break;
         case SOUTH:
            this.id_final.id_class(var9 * 8, var11 * 4, var10 * 8);
            break;
         case WEST:
            this.id_final.id_class(-(var10 + var7) * 8 + 1, var11 * 4, var9 * 8);
            break;
         default:
            this.id_final.id_class(var10 * 8, var11 * 4, var9 * 8);
      }
   }

   public riW_2(raF_2 var1, rpr_3 var2, rfi_3 var3) {
      super(var1, 1);
      this.id_class(var2);
      this.id_final = var3;
   }

   public riW_2(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public riW_2(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
   }

   protected boolean id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5) {
      int var6 = this.id_class(var3, var5);
      int var7 = this.id_class(var4);
      int var8 = this.id_break(var3, var5);
      if (var2.id_break(new rfH_2(var6, var7, var8))) {
         rEc_1 var9 = aI_2.id_continue.id_class(var1.id_byte());
         var9.id_protected(var9.SK());
         var9.id_class((double)var6 + 0.5, (double)var7, (double)var8 + 0.5, 0.0F, 0.0F);
         var9.id_class(var1, var1.id_throws(var9.Bs()), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
         var1.id_class(var9);
         return true;
      } else {
         return false;
      }
   }

   protected boolean id_class(rfi_3 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.id_class(var2, var3);
      int var7 = this.id_break(var2, var3);
      int var8 = this.id_class(var4, var5);
      int var9 = this.id_break(var4, var5);
      return var1.id_class(Math.min(var6, var8), Math.min(var7, var9), Math.max(var6, var8), Math.max(var7, var9));
   }

   protected void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, xc_3 var9) {
      for (int var10 = var4; var10 <= var7; var10++) {
         for (int var11 = var3; var11 <= var6; var11++) {
            for (int var12 = var5; var12 <= var8; var12++) {
               if (this.id_class(var1, var11, var10, var12, var2) == id_case) {
                  this.id_class(var1, var9, var11, var10, var12, var2);
               }
            }
         }
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
   }

   protected void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var4; var9 <= var7; var9++) {
         for (int var10 = var3; var10 <= var6; var10++) {
            for (int var11 = var5; var11 <= var8; var11++) {
               xc_3 var12 = this.id_class(var1, var10, var9, var11, var2);
               if (!id_catch.contains(var12.id_break())) {
                  if (this.id_class(var9) >= var1.id_short() && var12 != id_case) {
                     this.id_class(var1, xu_3.id_class.id_continue(), var10, var9, var11, var2);
                  } else {
                     this.id_class(var1, id_case, var10, var9, var11, var2);
                  }
               }
            }
         }
      }
   }

   protected void id_class(rRI var1, rfi_3 var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.id_class(var1, var2, var3 + 0, 0, var4 + 0, var3 + 2, 0, var4 + 8 - 1, id_class, id_class, false);
         this.id_class(var1, var2, var3 + 5, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, id_class, id_class, false);
         this.id_class(var1, var2, var3 + 3, 0, var4 + 0, var3 + 4, 0, var4 + 2, id_class, id_class, false);
         this.id_class(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 8 - 1, id_class, id_class, false);
         this.id_class(var1, var2, var3 + 3, 0, var4 + 2, var3 + 4, 0, var4 + 2, id_break, id_break, false);
         this.id_class(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 5, id_break, id_break, false);
         this.id_class(var1, var2, var3 + 2, 0, var4 + 3, var3 + 2, 0, var4 + 4, id_break, id_break, false);
         this.id_class(var1, var2, var3 + 5, 0, var4 + 3, var3 + 5, 0, var4 + 4, id_break, id_break, false);
      } else {
         this.id_class(var1, var2, var3 + 0, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, id_class, id_class, false);
      }
   }

   protected static final int id_break(int var0, int var1, int var2) {
      return var1 * 25 + var2 * 5 + var0;
   }
}
