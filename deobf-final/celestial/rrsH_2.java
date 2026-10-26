package celestial;

import org.apache.commons.lang3.mutable.MutableInt;

public final class rrsH_2 extends rrsV_2<rrsp_3, rrsy_3> {
   private static final rpr_3[] throws_ = rpr_3.values();
   private final rfw_3 case_ = new rfw_3();

   public rrsH_2(rol_3 var1) {
      super(var1, rRo_1.BLOCK, new rrsy_3(var1));
   }

   @Override
   public void class_(rfH_2 var1, int var2) {
      this.byte_.throws_();
      this.class_(Long.MAX_VALUE, var1.package_(), 15 - var2, true);
   }

   @Override
   protected void class_(long var1, int var3, boolean var4) {
      long var5 = rjh_3.throws_(var1);

      for (rpr_3 var10 : throws_) {
         long var11 = rfH_2.class_(var1, var10);
         long var13 = rjh_3.throws_(var11);
         if (var5 == var13 || this.byte_.catch_(var13)) {
            this.break_(var1, var11, var3, var4);
         }
      }
   }

   @Override
   protected int class_(long var1, long var3, int var5) {
      int var6 = var5;
      if (Long.MAX_VALUE != var3) {
         int var7 = this.break_(Long.MAX_VALUE, var1, 0);
         if (var5 > var7) {
            var6 = var7;
         }

         if (var6 == 0) {
            return var6;
         }
      }

      long var20 = rjh_3.throws_(var1);
      roH_2 var9 = this.byte_.class_(var20, true);

      for (rpr_3 var13 : throws_) {
         long var14 = rfH_2.class_(var1, var13);
         if (var14 != var3) {
            long var16 = rjh_3.throws_(var14);
            roH_2 var18;
            if (var20 == var16) {
               var18 = var9;
            } else {
               var18 = this.byte_.class_(var16, true);
            }

            if (var18 != null) {
               int var19 = this.break_(var14, var1, this.class_(var18, var14));
               if (var6 > var19) {
                  var6 = var19;
               }

               if (var6 == 0) {
                  return var6;
               }
            }
         }
      }

      return var6;
   }

   @Override
   protected int break_(long var1, long var3, int var5) {
      if (var3 == Long.MAX_VALUE) {
         return 15;
      } else if (var1 == Long.MAX_VALUE) {
         return var5 + 15 - this.protected_(var3);
      } else if (var5 >= 15) {
         return var5;
      } else {
         int var6 = Integer.signum(rfH_2.class_(var3) - rfH_2.class_(var1));
         int var7 = Integer.signum(rfH_2.break_(var3) - rfH_2.break_(var1));
         int var8 = Integer.signum(rfH_2.byte_(var3) - rfH_2.byte_(var1));
         rpr_3 var9 = rpr_3.class_(var6, var7, var8);
         if (var9 == null) {
            return 15;
         } else {
            MutableInt var10 = new MutableInt();
            xc_3 var11 = this.class_(var3, var10);
            if (var10.getValue() >= 15) {
               return 15;
            } else {
               xc_3 var12 = this.class_(var1, (MutableInt)null);
               rjC_2 var13 = this.class_(var12, var1, var9);
               rjC_2 var14 = this.class_(var11, var3, var9.case_());
               return rjw_3.break_(var13, var14) ? 15 : var5 + Math.max(1, var10.getValue());
            }
         }
      }
   }

   private int protected_(long var1) {
      int var3 = rfH_2.class_(var1);
      int var4 = rfH_2.break_(var1);
      int var5 = rfH_2.byte_(var1);
      rRq_1 var6 = this.class_.throws_(var3 >> 4, var5 >> 4);
      return var6 != null ? var6.catch_(this.case_.class_(var3, var4, var5)) : 0;
   }
}
