package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class rHS extends rHD implements rHf_1, rXF, rXZ, rXv_1 {
   private static final int[] id_protected = new int[]{0};
   private static final int[] id_throws = new int[]{2, 1};
   private static final int[] id_case = new int[]{1};
   protected rqs_3<rdn_3> id_class = rqs_3.id_class(3, rdn_3.id_break);
   int id_catch;
   int id_private;
   int id_implements;
   int id_finally;
   protected final rpF_2 id_break = new rHs_1(this);
   private final Object2IntOpenHashMap<rqO_2> id_final = new Object2IntOpenHashMap();
   protected final rkj_3<? extends rkv_3> id_byte;

   private void id_byte(rkw_3<?> var1) {
      if (var1 != null && this.id_break(var1)) {
         rdn_3 var2 = this.id_class.get(0);
         rdn_3 var3 = var1.id_byte();
         rdn_3 var4 = this.id_class.get(2);
         if (var4.id_class()) {
            this.id_class.set(2, var3.id_implements());
         } else if (var4.id_break() == var3.id_break()) {
            var4.id_case(1);
         }

         if (!this.id_extends.id_continue) {
            this.id_class(var1);
         }

         if (var2.id_break() == xu_3.c.id_case() && !this.id_class.get(1).id_class() && this.id_class.get(1).id_break() == rdy_3.hg) {
            this.id_class.set(1, new rdn_3(rdy_3.hR));
         }

         var2.id_catch(1);
      }
   }

   @Override
   public rkw_3<?> id_byte() {
      return null;
   }

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_extends.id_class(this.id_native) != this
         ? false
         : var1.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) <= 64.0;
   }

   protected rHS(ryW_2<?> var1, rkj_3<? extends rkv_3> var2) {
      super(var1);
      this.id_byte = var2;
   }

   @Override
   public void id_class(rWr_1 var1) {
      for (rdn_3 var3 : this.id_class) {
         var1.id_break(var3);
      }
   }

   private static void id_class(Map<rdb_3, Integer> var0, rlb_3<rdb_3> var1, int var2) {
      for (rdb_3 var4 : var1.id_class()) {
         if (!id_break(var4)) {
            var0.put(var4, var2);
         }
      }
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2, rpr_3 var3) {
      return this.a_(var1, var2);
   }

   @Override
   public int[] id_class(rpr_3 var1) {
      if (var1 == rpr_3.DOWN) {
         return id_throws;
      } else {
         return var1 == rpr_3.UP ? id_protected : id_case;
      }
   }

   @Override
   public void id_class(rkw_3<?> var1) {
      if (var1 != null) {
         rqO_2 var2 = var1.id_case();
         this.id_final.addTo(var2, 1);
      }
   }

   @Override
   public void id_class(rhd_3 var1) {
   }

   public List<rkw_3<?>> id_class(rYB var1, rjU_2 var2) {
      ArrayList var3 = Lists.newArrayList();
      ObjectIterator var4 = this.id_final.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var1.id_implements().id_class((rqO_2)var5.getKey()).ifPresent(var4x -> {
            var3.add(var4x);
            id_class(var1, var2, var5.getIntValue(), ((rkv_3)var4x).id_break());
         });
      }

      return var3;
   }

   private static void id_class(rYB var0, rjU_2 var1, int var2, float var3) {
      int var4 = rfU_2.id_protected((float)var2 * var3);
      float var5 = rfU_2.id_private((float)var2 * var3);
      if (var5 != 0.0F && Math.random() < (double)var5) {
         var4++;
      }

      while (var4 > 0) {
         int var6 = rsP_2.id_class(var4);
         var4 -= var6;
         var0.a_(new rsP_2(var0, var1.id_break, var1.id_byte, var1.id_protected, var6));
      }
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("BurnTime", (short)this.id_catch);
      var1.id_class("CookTime", (short)this.id_implements);
      var1.id_class("CookTimeTotal", (short)this.id_finally);
      rXC.id_class(var1, this.id_class);
      rcd_3 var2 = new rcd_3();
      this.id_final.forEach((var1x, var2x) -> var2.id_break(var1x.toString(), var2x));
      var1.id_class("RecipesUsed", var2);
      return var1;
   }

   private static void id_class(Map<rdb_3, Integer> var0, rpL_2 var1, int var2) {
      rdb_3 var3 = var1.id_case();
      if (id_break(var3)) {
         if (rqu_3.id_byte) {
            throw (IllegalStateException)rqR_2.id_byte(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item "
                     + var3.id_implements((rdn_3)null).getString()
                     + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         var0.put(var3, var2);
      }
   }

   protected int id_class(rdn_3 var1) {
      if (var1.id_class()) {
         return 0;
      } else {
         rdb_3 var2 = var1.id_break();
         return id_protected().getOrDefault(var2, 0);
      }
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      return rXC.id_class(this.id_class, var1, var2);
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      rXC.id_break(var2, this.id_class);
      this.id_catch = var2.id_catch("BurnTime");
      this.id_implements = var2.id_catch("CookTime");
      this.id_finally = var2.id_catch("CookTimeTotal");
      this.id_private = this.id_class(this.id_class.get(1));
      rcd_3 var3 = var2.id_int("RecipesUsed");

      for (String var5 : var3.id_protected()) {
         this.id_final.put(new rqO_2(var5), var3.id_private(var5));
      }
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      rdn_3 var3 = this.id_class.get(var1);
      boolean var4 = !var2.id_class() && var2.id_class(var3) && rdn_3.id_class(var2, var3);
      this.id_class.set(var1, var2);
      if (var2.id_char() > this.ab_()) {
         var2.id_throws(this.ab_());
      }

      if (var1 == 0 && !var4) {
         this.id_finally = this.id_case();
         this.id_implements = 0;
         this.id_break();
      }
   }

   private static boolean id_break(rdb_3 var0) {
      return rlc_3.id_transient.id_class(var0);
   }

   @Override
   public boolean id_break(int var1, rdn_3 var2, rpr_3 var3) {
      if (var3 == rpr_3.DOWN && var1 == 1) {
         rdb_3 var4 = var2.id_break();
         if (var4 != rdy_3.hR && var4 != rdy_3.hg) {
            return false;
         }
      }

      return true;
   }

   protected boolean id_break(rkw_3<?> var1) {
      if (!this.id_class.get(0).id_class() && var1 != null) {
         rdn_3 var2 = var1.id_byte();
         if (var2.id_class()) {
            return false;
         } else {
            rdn_3 var3 = this.id_class.get(2);
            if (var3.id_class()) {
               return true;
            } else if (!var3.id_class(var2)) {
               return false;
            } else {
               return var3.id_char() < this.ab_() && var3.id_char() < var3.id_byte() ? true : var3.id_char() < var2.id_byte();
            }
         }
      } else {
         return false;
      }
   }

   public static boolean id_break(rdn_3 var0) {
      return id_protected().containsKey(var0.id_break());
   }

   @Override
   public void id_throws() {
      boolean var1 = this.id_catch();
      boolean var2 = false;
      if (this.id_catch()) {
         this.id_catch--;
      }

      if (!this.id_extends.id_continue) {
         rdn_3 var3 = this.id_class.get(1);
         if (this.id_catch() || !var3.id_class() && !this.id_class.get(0).id_class()) {
            rkw_3 var4 = this.id_extends.id_implements().id_class(this.id_byte, this, this.id_extends).orElse(null);
            if (!this.id_catch() && this.id_break(var4)) {
               this.id_catch = this.id_class(var3);
               this.id_private = this.id_catch;
               if (this.id_catch()) {
                  var2 = true;
                  if (!var3.id_class()) {
                     rdb_3 var5 = var3.id_break();
                     var3.id_catch(1);
                     if (var3.id_class()) {
                        rdb_3 var6 = var5.id_package();
                        this.id_class.set(1, var6 == null ? rdn_3.id_break : new rdn_3(var6));
                     }
                  }
               }
            }

            if (this.id_catch() && this.id_break(var4)) {
               this.id_implements++;
               if (this.id_implements == this.id_finally) {
                  this.id_implements = 0;
                  this.id_finally = this.id_case();
                  this.id_byte(var4);
                  var2 = true;
               }
            } else {
               this.id_implements = 0;
            }
         } else if (!this.id_catch() && this.id_implements > 0) {
            this.id_implements = rfU_2.id_class(this.id_implements - 2, 0, this.id_finally);
         }

         if (var1 != this.id_catch()) {
            var2 = true;
            this.id_extends.id_class(this.id_native, this.id_extends.id_byte(this.id_native).id_class(JV.id_final, Boolean.valueOf(this.id_catch())), 3);
         }
      }

      if (var2) {
         this.id_break();
      }
   }

   private boolean id_catch() {
      return this.id_catch > 0;
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return this.id_class.get(var1);
   }

   protected int id_case() {
      return this.id_extends.id_implements().id_class(this.id_byte, this, this.id_extends).map(rkv_3::id_throws).orElse(200);
   }

   @Override
   public int id_else() {
      return this.id_class.size();
   }

   @Override
   public boolean id_return() {
      for (rdn_3 var2 : this.id_class) {
         if (!var2.id_class()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void id_public() {
      this.id_class.clear();
   }

   public void id_protected(rhd_3 var1) {
      List var2 = this.id_class((rYB)var1.id_throws[7], var1.Ps());
      var1.id_break(var2);
      this.id_final.clear();
   }

   public static Map<rdb_3, Integer> id_protected() {
      LinkedHashMap var0 = Maps.newLinkedHashMap();
      id_class(var0, rdy_3.hY, 20000);
      id_class(var0, xu_3.Ea, 16000);
      id_class(var0, rdy_3.JZ, 2400);
      id_class(var0, rdy_3.Oh, 1600);
      id_class(var0, rdy_3.OX, 1600);
      id_class(var0, rlc_3.id_new, 300);
      id_class(var0, rlc_3.id_byte, 300);
      id_class(var0, rlc_3.id_implements, 300);
      id_class(var0, rlc_3.id_finally, 150);
      id_class(var0, rlc_3.id_volatile, 300);
      id_class(var0, rlc_3.id_native, 300);
      id_class(var0, xu_3.PV, 300);
      id_class(var0, xu_3.bN, 300);
      id_class(var0, xu_3.bQ, 300);
      id_class(var0, xu_3.bc, 300);
      id_class(var0, xu_3.bm, 300);
      id_class(var0, xu_3.bu, 300);
      id_class(var0, xu_3.BU, 300);
      id_class(var0, xu_3.bd, 300);
      id_class(var0, xu_3.bx, 300);
      id_class(var0, xu_3.bk, 300);
      id_class(var0, xu_3.bz, 300);
      id_class(var0, xu_3.bW, 300);
      id_class(var0, xu_3.n, 300);
      id_class(var0, xu_3.rj, 300);
      id_class(var0, xu_3.Xs, 300);
      id_class(var0, xu_3.Pj, 300);
      id_class(var0, xu_3.re, 300);
      id_class(var0, xu_3.sZ, 300);
      id_class(var0, xu_3.PP, 300);
      id_class(var0, xu_3.sA, 300);
      id_class(var0, rlc_3.id_while, 300);
      id_class(var0, rdy_3.OM, 300);
      id_class(var0, rdy_3.Xd, 300);
      id_class(var0, xu_3.PJ, 300);
      id_class(var0, rlc_3.r, 200);
      id_class(var0, rdy_3.OQ, 200);
      id_class(var0, rdy_3.Oz, 200);
      id_class(var0, rdy_3.Ou, 200);
      id_class(var0, rdy_3.Oc, 200);
      id_class(var0, rdy_3.ON, 200);
      id_class(var0, rlc_3.id_private, 200);
      id_class(var0, rlc_3.id_double, 1200);
      id_class(var0, rlc_3.id_break, 100);
      id_class(var0, rlc_3.id_throws, 100);
      id_class(var0, rdy_3.OD, 100);
      id_class(var0, rlc_3.id_package, 100);
      id_class(var0, rdy_3.OU, 100);
      id_class(var0, rlc_3.id_catch, 67);
      id_class(var0, xu_3.Oh, 4001);
      id_class(var0, rdy_3.kU, 300);
      id_class(var0, xu_3.hs, 50);
      id_class(var0, xu_3.i, 100);
      id_class(var0, xu_3.hU, 400);
      id_class(var0, xu_3.he, 300);
      id_class(var0, xu_3.ha, 300);
      id_class(var0, xu_3.XP, 300);
      id_class(var0, xu_3.XB, 300);
      id_class(var0, xu_3.XE, 300);
      id_class(var0, xu_3.JG, 300);
      return var0;
   }

   @Override
   public rdn_3 id_native(int var1) {
      return rXC.id_class(this.id_class, var1);
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      if (var1 == 2) {
         return false;
      } else if (var1 != 1) {
         return true;
      } else {
         rdn_3 var3 = this.id_class.get(1);
         return id_break(var2) || var2.id_break() == rdy_3.hg && var3.id_break() != rdy_3.hg;
      }
   }
}
