package celestial;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class yQ_2 implements rrGC {
   public final AtomicReference<yZ_2> id_class;
   private yc_3 id_case;
   private yu_3 id_catch;
   private final Set<ryO_2> id_private;
   private final rrxJ_2<jm_3> id_implements;
   public rfl_3 id_break;
   private int id_finally;
   private boolean id_extends;
   final rfw_3 id_native;
   private final rfw_3[] id_volatile;
   private boolean id_final;
   private final boolean id_package;
   private final boolean id_int;
   private boolean id_new;
   private final boolean id_continue;
   public int id_byte;
   public int id_protected;
   int id_super;
   int id_this;
   int id_else;
   private final yQ_2[] id_synchronized;
   private boolean id_return;
   roJ_2 id_public;
   private final yQ_2[] id_goto;
   private final yQ_2[] id_while;
   private boolean id_try;
   private final yx_3 id_instanceof;

   public yZ_2 id_byte() {
      return this.id_class.get();
   }

   private roJ_2 id_byte(rfH_2 var1) {
      roJ_2 var2 = this.id_public;
      if (rrWM.id_break(var2)) {
         return var2;
      } else {
         var2 = this.id_throws.id_native.id_this(var1);
         this.id_public = var2;
         return var2;
      }
   }

   private void id_int() {
      this.id_implements();
      this.id_class.set(yZ_2.id_class);
      this.id_extends = true;
   }

   public yQ_2(yz_3 var1) {
      this.id_throws = var1;
      this.id_class = new AtomicReference<>(yZ_2.id_class);
      this.id_private = Sets.newHashSet();
      this.id_implements = new rrxJ_2<>(var0 -> new jm_3(ju_3.id_private));
      this.id_finally = -1;
      this.id_extends = true;
      this.id_native = new rfw_3(-1, -1, -1);
      this.id_volatile = rqR_2.id_class(new rfw_3[6], var0 -> {
         for (int var1x = 0; var1x < var0.length; var1x++) {
            var0[var1x] = new rfw_3();
         }
      });
      this.id_package = rrbb_3.id_package();
      this.id_int = !rrxr_3.id_class.id_byte();
      this.id_new = false;
      this.id_continue = rrbb_3.ry();
      this.id_synchronized = new yQ_2[6];
      this.id_return = false;
      this.id_goto = new yQ_2[rpr_3.VALUES.length];
      this.id_while = new yQ_2[rpr_3.VALUES.length];
      this.id_try = false;
      this.id_instanceof = new yx_3(this, null, 0);
   }

   @Override
   public String toString() {
      return "pos: " + this.id_throws() + ", frameIndex: " + this.id_finally;
   }

   public boolean id_class(HU var1, yz_3 var2) {
      yZ_2 var3 = this.id_byte();
      if (this.id_catch != null) {
         this.id_catch.id_class();
      }

      if (!var3.id_byte.contains(var1)) {
         return false;
      } else {
         if (yz_3.id_new) {
            this.id_catch = new yu_3(this, new rfj_3(this.id_throws()), this.id_break(), var3);
         } else {
            this.id_catch = new yu_3(this, this.id_break(), var3);
         }

         var2.id_class(this.id_catch);
         return true;
      }
   }

   @Override
   public yW_2 id_class(rYB var1, rfH_2 var2, rfH_2 var3, int var4) {
      return yW_2.id_class(var1, var2, var3, var4, false);
   }

   void id_class(Hv_1 var1, yZ_2 var2) {
      this.id_class(rrxA_2.id_byte, var1, var2);
      this.id_class(rrxA_2.id_break, var1, var2);
      this.id_class(rrxA_2.id_protected, var1, var2);
   }

   public rfH_2 id_class(rpr_3 var1) {
      return this.id_volatile[var1.ordinal()];
   }

   HU[] id_class(xc_3 var1, HU[] var2) {
      if (yz_3.id_continue) {
         return yz_3.id_class;
      } else {
         var2[0] = yS_2.id_class(var1);
         return var2;
      }
   }

   public yQ_2 id_class(yO_2 var1, rpr_3 var2) {
      if (!this.id_return) {
         for (int var3 = 0; var3 < rpr_3.VALUES.length; var3++) {
            rpr_3 var4 = rpr_3.VALUES[var3];
            rfH_2 var5 = this.id_class(var4);
            this.id_synchronized[var3] = var1.id_class(var5);
         }

         this.id_return = true;
      }

      return this.id_synchronized[var2.ordinal()];
   }

   private void id_class(HU var1, Hv_1 var2, yZ_2 var3) {
      lD_2 var4 = var2.id_class(var1);
      if (var4.id_final()) {
         var3.id_protected(var1);
         if (var4.id_int() > 0) {
            var3.id_throws(var1);
         }
      }
   }

   void id_class(Set<ryO_2> var1) {
      HashSet var2 = Sets.newHashSet(var1);
      HashSet var3 = Sets.newHashSet(this.id_private);
      var2.removeAll(this.id_private);
      var3.removeAll(var1);
      this.id_private.clear();
      this.id_private.addAll(var1);
      this.id_throws.id_volatile.id_class(var3, var2);
   }

   public void id_class(yz_3 var1) {
      yN_2 var2 = this.id_finally();
      var1.id_class(var2);
   }

   HU id_class(rRq_1 var1, xc_3 var2, rfH_2 var3, HU var4) {
      if (rrbW_2.id_break()) {
         HU var5 = rrbW_2.id_class(var1, var2, var3);
         if (var5 != null) {
            return var5;
         }
      }

      if (!this.id_int) {
         return var4;
      } else {
         if (this.id_package) {
            if (var4 == rrxA_2.id_byte) {
               xd_3 var6 = var2.id_break();
               if (var6 instanceof Wu_1) {
                  return var4;
               }

               if (var6 instanceof xL_2) {
                  return var4;
               }

               return rrxA_2.id_break;
            }
         } else if (var4 == rrxA_2.id_break) {
            return rrxA_2.id_byte;
         }

         return var4;
      }
   }

   HU[] id_class(rXE var1, HU[] var2) {
      if (yz_3.id_super) {
         return yz_3.id_class;
      } else {
         var2[0] = yS_2.id_class(var1);
         return var2;
      }
   }

   public void id_class(int var1, int var2, int var3) {
      if (var1 != this.id_native.b_() || var2 != this.id_native.c_() || var3 != this.id_native.d_()) {
         this.id_int();
         this.id_native.id_class(var1, var2, var3);
         if (this.id_continue) {
            byte var4 = 8;
            this.id_byte = var1 >> var4 << var4;
            this.id_protected = var3 >> var4 << var4;
            this.id_super = var1 - this.id_byte;
            this.id_this = var2;
            this.id_else = var3 - this.id_protected;
         }

         this.id_break = new rfl_3((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));

         for (rpr_3 var7 : rpr_3.VALUES) {
            this.id_volatile[var7.ordinal()].id_class(this.id_native).id_byte(var7, 16);
         }

         this.id_return = false;
         this.id_try = false;

         for (int var9 = 0; var9 < this.id_goto.length; var9++) {
            yQ_2 var10 = this.id_goto[var9];
            if (var10 != null) {
               var10.id_try = false;
            }
         }

         this.id_public = null;
      }
   }

   public jm_3 id_class(HU var1) {
      return this.id_implements.id_class(var1);
   }

   public boolean id_class(int var1) {
      if (this.id_finally == var1) {
         return false;
      } else {
         this.id_finally = var1;
         return true;
      }
   }

   public boolean id_class() {
      return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_() && this.id_break() > 576.0
         ? this.id_class(this.id_volatile[rpr_3.WEST.ordinal()])
            && this.id_class(this.id_volatile[rpr_3.NORTH.ordinal()])
            && this.id_class(this.id_volatile[rpr_3.EAST.ordinal()])
            && this.id_class(this.id_volatile[rpr_3.SOUTH.ordinal()])
         : true;
   }

   private boolean id_class(rfH_2 var1) {
      return this.id_throws.id_native.id_class(var1.b_() >> 4, var1.d_() >> 4, roN_2.id_volatile, false) != null;
   }

   public void id_class(boolean var1) {
      boolean var2 = this.id_extends;
      this.id_extends = true;
      this.id_final = var1 | (var2 && this.id_final);
      if (this.id_new()) {
         this.id_new = true;
      }
   }

   public void id_class(rpr_3 var1, yQ_2 var2) {
      this.id_goto[var1.ordinal()] = var2;
      this.id_while[var1.ordinal()] = var2;
   }

   void id_class(lD_2 var1) {
      var1.id_class(7, ju_3.id_private);
   }

   rrJI id_break(rfH_2 var1) {
      rfH_2 var2 = var1.id_break(-1, -1, -1);
      rfH_2 var3 = var1.id_break(16, 16, 16);
      yW_2 var4 = this.id_class(this.id_throws.id_native, var2, var3, 1);
      return new rrJI(var4, var2, var3, 1);
   }

   public yQ_2 id_break(rpr_3 var1) {
      if (!this.id_try) {
         this.id_continue();
      }

      return this.id_while[var1.ordinal()];
   }

   protected double id_break() {
      ly_3 var1 = ((Hh_1)QY.id_instanceof().id_class[16]).id_finally();
      double var2 = this.id_break.id_class + 8.0 - var1.id_break().id_break;
      double var4 = this.id_break.id_break + 8.0 - var1.id_break().id_byte;
      double var6 = this.id_break.id_byte + 8.0 - var1.id_break().id_protected;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public rfH_2 id_throws() {
      return this.id_native;
   }

   public yN_2 id_finally() {
      this.id_implements();
      Object var1 = null;
      if (yz_3.id_new) {
         this.id_case = new yc_3(this, new rfj_3(this.id_throws()), this.id_break(), (yW_2)var1);
      } else {
         this.id_case = new yc_3(this, this.id_break(), (yW_2)var1);
      }

      return this.id_case;
   }

   public boolean id_catch() {
      return this.id_extends;
   }

   public void id_extends() {
      yN_2 var1 = this.id_finally();
      var1.id_class(this.id_throws.id_implements);
   }

   public void id_case() {
      this.id_extends = false;
      this.id_final = false;
      this.id_new = false;
   }

   private void id_continue() {
      int var1 = this.id_throws().b_();
      int var2 = this.id_throws().d_();
      int var3 = rpr_3.NORTH.ordinal();
      int var4 = rpr_3.SOUTH.ordinal();
      int var5 = rpr_3.WEST.ordinal();
      int var6 = rpr_3.EAST.ordinal();
      this.id_while[var3] = this.id_goto[var3].id_throws().d_() == var2 - 16 ? this.id_goto[var3] : null;
      this.id_while[var4] = this.id_goto[var4].id_throws().d_() == var2 + 16 ? this.id_goto[var4] : null;
      this.id_while[var5] = this.id_goto[var5].id_throws().b_() == var1 - 16 ? this.id_goto[var5] : null;
      this.id_while[var6] = this.id_goto[var6].id_throws().b_() == var1 + 16 ? this.id_goto[var6] : null;
      this.id_try = true;
   }

   protected void id_implements() {
      if (this.id_case != null) {
         this.id_case.id_class();
         this.id_case = null;
      }

      if (this.id_catch != null) {
         this.id_catch.id_class();
         this.id_catch = null;
      }
   }

   private boolean id_new() {
      return this.id_throws.id_native instanceof gm_3 var1 ? var1.id_volatile() : false;
   }

   public yx_3 id_package() {
      return this.id_instanceof;
   }

   public void id_protected() {
      this.id_int();
      this.id_implements.id_class().forEach(jm_3::close);
   }

   boolean id_protected(rfH_2 var1) {
      int var2 = var1.c_();
      int var3 = var2 + 15;
      return this.id_byte(var1).id_class(var2, var3);
   }

   public boolean id_private() {
      return this.id_extends && this.id_final;
   }

   public boolean id_final() {
      return this.id_protected(this.id_native);
   }

   public roJ_2 id_volatile() {
      return this.id_byte(this.id_native);
   }

   public boolean id_native() {
      return this.id_new;
   }
}
