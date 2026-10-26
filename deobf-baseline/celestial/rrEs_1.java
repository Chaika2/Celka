package celestial;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class rrEs_1 extends rrGc_1 {
   private final Map<Integer, rrEr_1> id_class = Maps.newHashMap();
   private final rrEm_1 id_break;
   private int id_byte;
   private int id_protected;

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      var1.id_break("NextAvailableID", this.id_byte);
      var1.id_break("Tick", this.id_protected);
      rcy_3 var2 = new rcy_3();

      for (rrEr_1 var4 : this.id_class.values()) {
         rcd_3 var5 = new rcd_3();
         var4.id_class(var5);
         var2.add(var5);
      }

      var1.id_class("Raids", var2);
      return var1;
   }

   public rrEs_1(rrEm_1 var1) {
      super(id_class(var1.id_default()));
      this.id_break = var1;
      this.id_byte = 1;
      this.id_byte();
   }

   private rrEr_1 id_class(rrEm_1 var1, rfH_2 var2) {
      rrEr_1 var3 = var1.id_interface(var2);
      return var3 != null ? var3 : new rrEr_1(this.id_break(), var1, var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_byte = var1.id_private("NextAvailableID");
      this.id_protected = var1.id_private("Tick");
      rcy_3 var2 = var1.id_protected("Raids", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rcd_3 var4 = var2.id_class(var3);
         rrEr_1 var5 = new rrEr_1(this.id_break, var4);
         this.id_class.put(var5.id_super(), var5);
      }
   }

   public rrEr_1 id_class(rfH_2 var1, int var2) {
      rrEr_1 var3 = null;
      double var4 = (double)var2;

      for (rrEr_1 var7 : this.id_class.values()) {
         double var8 = var7.id_continue().id_private(var1);
         if (var7.id_this() && var8 < var4) {
            var3 = var7;
            var4 = var8;
         }
      }

      return var3;
   }

   public static String id_class(rRJ var0) {
      return "raids" + var0.id_class();
   }

   public rrEr_1 id_class(int var1) {
      return this.id_class.get(var1);
   }

   public void id_class() {
      this.id_protected++;
      Iterator var1 = this.id_class.values().iterator();

      while (var1.hasNext()) {
         rrEr_1 var2 = (rrEr_1)var1.next();
         if (this.id_break.B().id_break(rRu_1.id_public)) {
            var2.id_native();
         }

         if (var2.id_protected()) {
            var1.remove();
            this.id_byte();
         } else {
            var2.id_volatile();
         }
      }

      if (this.id_protected % 200 == 0) {
         this.id_byte();
      }

      ruP_2.id_class(this.id_break, this.id_class.values());
   }

   public static boolean id_class(rEB var0, rrEr_1 var1) {
      return var0 != null && var1 != null && var1.id_catch() != null
         ? var0.BM() && var0.L() && var0.BI() <= 2400 && ((rYB)var0.id_throws[7]).id_default() == var1.id_catch().id_default()
         : false;
   }

   public rrEr_1 id_class(rhN_2 var1) {
      if (var1.id_native()) {
         return null;
      } else if (this.id_break.B().id_break(rRu_1.id_public)) {
         return null;
      } else {
         rRJ var2 = ((rYB)var1.id_throws[7]).id_default();
         if (!var2.id_finally()) {
            return null;
         } else {
            rfH_2 var3 = var1.Bs();
            List var4 = this.id_break.d().id_byte(rRP.id_break, var3, 64, rRr_1.IS_OCCUPIED).collect(Collectors.toList());
            int var5 = 0;
            rjU_2 var6 = rjU_2.id_class;

            for (rgU_2 var8 : var4) {
               rfH_2 var9 = var8.id_throws();
               var6 = var6.id_break((double)var9.b_(), (double)var9.c_(), (double)var9.d_());
               var5++;
            }

            rfH_2 var11;
            if (var5 > 0) {
               var6 = var6.id_class(1.0 / (double)var5);
               var11 = new rfH_2(var6);
            } else {
               var11 = var3;
            }

            rrEr_1 var12 = this.id_class(var1.id_continue(), var11);
            boolean var13 = false;
            if (!var12.id_private()) {
               if (!this.id_class.containsKey(var12.id_super())) {
                  this.id_class.put(var12.id_super(), var12);
               }

               var13 = true;
            } else if (var12.id_extends() < var12.id_finally()) {
               var13 = true;
            } else {
               var1.id_protected(rLD.id_char);
               var1.id_class.id_class(new rvQ_2(var1, (byte)43));
            }

            if (var13) {
               var12.id_class((rhd_3)var1);
               var1.id_class.id_class(new rvQ_2(var1, (byte)43));
               if (!var12.id_byte()) {
                  var1.id_break(rlB_2.H);
                  Oo_1.id_void.id_class(var1);
               }
            }

            this.id_byte();
            return var12;
         }
      }
   }

   private int id_break() {
      return ++this.id_byte;
   }
}
