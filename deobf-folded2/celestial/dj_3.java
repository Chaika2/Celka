package celestial;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class dj_3 extends xd_3 implements kh_3 {
   public static final rCm_1 id_volatile = rCT.A;
   protected final rXB id_final;
   private final List<rXE> id_int;
   public static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

   protected dj_3(rXB var1, Jq_1 var2) {
      super(var2);
      this.id_final = var1;
      this.id_int = Lists.newArrayList();
      this.id_int.add(var1.id_class(false));

      for (int var3 = 1; var3 < 8; var3++) {
         this.id_int.add(var1.id_class(8 - var3, false));
      }

      this.id_int.add(var1.id_class(8, true));
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (this.id_class(var2, var3, var1)) {
         var2.id_extends().id_class(var3, var1.id_volatile().id_class(), this.id_final.id_class(var2));
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_volatile().id_break() || var3.id_volatile().id_break()) {
         var4.id_extends().id_class(var5, var1.id_volatile().id_class(), this.id_final.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (this.id_class(var2, var3, var1)) {
         var2.id_extends().id_class(var3, var1.id_volatile().id_class(), this.id_final.id_class(var2));
      }
   }

   @Override
   public List<rdn_3> id_class(xc_3 var1, rzP_2 var2) {
      return Collections.emptyList();
   }

   private boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      if (this.id_final.id_class(rlG_2.id_byte)) {
         boolean var4 = var1.id_byte(var2.id_break()).id_class(xu_3.Po);

         for (rpr_3 var8 : rpr_3.values()) {
            if (var8 != rpr_3.DOWN) {
               rfH_2 var9 = var2.id_break(var8);
               if (var1.id_break(var9).id_class(rlG_2.id_break)) {
                  xd_3 var10 = var1.id_break(var2).id_break() ? xu_3.rg : xu_3.id_volatile;
                  var1.id_break(var2, var10.id_continue());
                  this.id_class(var1, var2);
                  return false;
               }

               if (var4 && var1.id_byte(var9).id_class(xu_3.hP)) {
                  var1.id_break(var2, xu_3.PK.id_continue());
                  this.id_class(var1, var2);
                  return false;
               }
            }
         }
      }

      return true;
   }

   private void id_class(rRg_1 var1, rfH_2 var2) {
      var1.id_byte(1501, var2, 0);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.id_class();
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      var1.id_volatile().id_break(var2, var3, var4);
   }

   @Override
   public boolean id_class(xc_3 var1, xc_3 var2, rpr_3 var3) {
      return var2.id_volatile().id_class().id_class(this.id_final);
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.INVISIBLE;
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return !this.id_final.id_class(rlG_2.id_byte);
   }

   @Override
   public rXs_1 id_break(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      if (var3.id_byte(id_volatile) == 0) {
         var1.id_class(var2, xu_3.id_class.id_continue(), 11);
         return this.id_final;
      } else {
         return rXG.id_class;
      }
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var4.id_class(id_package, var3, true) && var1.id_byte(id_volatile) == 0 && var4.id_class(var2.id_break(var3.id_final()), this.id_final)
         ? id_package
         : rjw_3.id_class();
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      int var2 = var1.id_byte(id_volatile);
      return this.id_int.get(Math.min(var2, 8));
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_volatile().id_case();
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return false;
   }
}
