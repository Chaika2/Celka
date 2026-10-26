package celestial;

import java.util.Arrays;
import org.apache.commons.lang3.mutable.MutableInt;

public abstract class rrsV_2<M extends rrsj_3<M>, S extends rrsR_2<M>> extends rrsw_3 implements rrsT_2 {
   private static final rpr_3[] id_throws = rpr_3.values();
   protected final rol_3 id_class;
   protected final rRo_1 id_break;
   protected final S id_byte;
   private boolean id_case;
   protected final rfw_3 id_protected = new rfw_3();
   private final long[] id_catch = new long[2];
   private final rRq_1[] id_private = new rRq_1[2];

   @Override
   protected int id_byte(long var1) {
      return var1 == Long.MAX_VALUE ? 0 : 15 - this.id_byte.id_implements(var1);
   }

   public rrsV_2(rol_3 var1, rRo_1 var2, S var3) {
      super(16, 256, 8192);
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = (S)var3;
      this.id_throws();
   }

   protected void id_class(long var1, roH_2 var3, boolean var4) {
      this.id_byte.id_class(var1, var3, var4);
   }

   public void id_class(rfj_3 var1, boolean var2) {
      long var3 = rjh_3.id_case(rjh_3.id_break(var1.id_break, 0, var1.id_byte));
      this.id_byte.id_break(var3, var2);
   }

   public boolean id_class() {
      return this.id_break() || this.id_byte.id_break() || this.id_byte.id_class();
   }

   @Override
   protected void id_class(long var1, int var3) {
      this.id_byte.id_break(var1, Math.min(15, 15 - var3));
   }

   public void id_class(rfH_2 var1, int var2) {
   }

   @Override
   public void id_class(rjh_3 var1, boolean var2) {
      this.id_byte.id_protected(var1.id_continue(), var2);
   }

   @Override
   public int id_class(rfH_2 var1) {
      return this.id_byte.id_protected(var1.id_package());
   }

   @Override
   public roH_2 id_class(rjh_3 var1) {
      return this.id_byte.id_private(var1.id_continue());
   }

   @Override
   protected boolean id_class(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   public static int id_class(rRq_1 var0, xc_3 var1, rfH_2 var2, xc_3 var3, rfH_2 var4, rpr_3 var5, int var6) {
      boolean var7 = var1.id_native() && var1.id_throws();
      boolean var8 = var3.id_native() && var3.id_throws();
      if (!var7 && !var8) {
         return var6;
      } else {
         rjC_2 var9 = var7 ? var1.id_byte(var0, var2) : rjw_3.id_class();
         rjC_2 var10 = var8 ? var3.id_byte(var0, var4) : rjw_3.id_class();
         return rjw_3.id_break(var9, var10, var5) ? 16 : var6;
      }
   }

   protected rjC_2 id_class(xc_3 var1, long var2, rpr_3 var4) {
      return var1.id_native() ? var1.id_class(this.id_class.id_break(), this.id_protected.id_case(var2), var4) : rjw_3.id_class();
   }

   protected xc_3 id_class(long var1, MutableInt var3) {
      if (var1 == Long.MAX_VALUE) {
         if (var3 != null) {
            var3.setValue(0);
         }

         return xu_3.id_class.id_continue();
      } else {
         int var4 = rjh_3.id_class(rfH_2.id_class(var1));
         int var5 = rjh_3.id_class(rfH_2.id_byte(var1));
         rRq_1 var6 = this.id_class(var4, var5);
         if (var6 == null) {
            if (var3 != null) {
               var3.setValue(16);
            }

            return xu_3.id_while.id_continue();
         } else {
            this.id_protected.id_case(var1);
            xc_3 var7 = var6.id_byte(this.id_protected);
            boolean var8 = var7.id_native() && var7.id_throws();
            if (var3 != null) {
               var3.setValue(var7.id_break(this.id_class.id_break(), this.id_protected));
            }

            return var8 ? var7 : xu_3.id_class.id_continue();
         }
      }
   }

   public int id_class(int var1, boolean var2, boolean var3) {
      if (!this.id_case) {
         if (this.id_byte.id_break()) {
            var1 = this.id_byte.id_class(var1);
            if (var1 == 0) {
               return var1;
            }
         }

         this.id_byte.id_class(this, var2, var3);
      }

      this.id_case = true;
      if (this.id_break()) {
         var1 = this.id_class(var1);
         this.id_throws();
         if (var1 == 0) {
            return var1;
         }
      }

      this.id_case = false;
      this.id_byte.id_case();
      return var1;
   }

   protected int id_class(roH_2 var1, long var2) {
      return 15 - var1.id_class(rjh_3.id_break(rfH_2.id_class(var2)), rjh_3.id_break(rfH_2.id_break(var2)), rjh_3.id_break(rfH_2.id_byte(var2)));
   }

   private rRq_1 id_class(int var1, int var2) {
      long var3 = rfj_3.id_class(var1, var2);

      for (int var5 = 0; var5 < 2; var5++) {
         if (var3 == this.id_catch[var5]) {
            return this.id_private[var5];
         }
      }

      rRq_1 var7 = this.id_class.id_throws(var1, var2);

      for (int var6 = 1; var6 > 0; var6--) {
         this.id_catch[var6] = this.id_catch[var6 - 1];
         this.id_private[var6] = this.id_private[var6 - 1];
      }

      this.id_catch[0] = var3;
      this.id_private[0] = var7;
      return var7;
   }

   @Override
   protected int id_class(long var1, long var3, int var5) {
      return 0;
   }

   public void id_break(rfj_3 var1, boolean var2) {
      long var3 = rjh_3.id_case(rjh_3.id_break(var1.id_break, 0, var1.id_byte));
      this.id_byte.id_byte(var3, var2);
   }

   @Override
   protected int id_break(long var1, long var3, int var5) {
      return 0;
   }

   public String id_break(long var1) {
      return this.id_byte.id_byte(var1) + "";
   }

   public void id_break(rfH_2 var1) {
      long var2 = var1.id_package();
      this.id_case(var2);

      for (rpr_3 var7 : id_throws) {
         this.id_case(rfH_2.id_class(var2, var7));
      }
   }

   private void id_throws() {
      Arrays.fill(this.id_catch, rfj_3.id_class);
      Arrays.fill(this.id_private, null);
   }

   @Override
   protected void id_case(long var1) {
      this.id_byte.id_throws();
      if (this.id_byte.id_catch(rjh_3.id_throws(var1))) {
         super.id_case(var1);
      }
   }
}
