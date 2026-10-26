package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKf_1 implements rRI {
   private static final Logger id_class = LogManager.getLogger();
   private final List<roC_2> id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final rrEm_1 id_case;
   private final long id_catch;
   private final rrGs_1 id_private;
   private final Random id_implements;
   private final rRJ id_finally;
   private final rRV<xd_3> id_extends = new rYs_1<>(var1x -> this.id_volatile(var1x).id_int());
   private final rRV<rXs_1> id_native = new rYs_1<>(var1x -> this.id_volatile(var1x).id_new());
   private final rYA id_volatile;
   private final rfj_3 id_final;
   private final rfj_3 id_package;
   private final rrrA id_int;

   @Override
   public rYG id_byte(int var1, int var2, int var3) {
      return this.id_case.id_byte(var1, var2, var3);
   }

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      return this.id_protected(var1.b_() >> 4, var1.d_() >> 4).id_byte(var1);
   }

   @Deprecated
   @Override
   public rrEm_1 id_byte() {
      return this.id_case;
   }

   @Override
   public Random id_long() {
      return this.id_implements;
   }

   public rKf_1(rrEm_1 var1, List<roC_2> var2) {
      int var3 = rfU_2.id_byte(Math.sqrt((double)var2.size()));
      if (var3 * var3 != var2.size()) {
         throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("Cache size is not a square."));
      } else {
         rfj_3 var4 = ((roC_2)var2.get(var2.size() / 2)).id_private();
         this.id_break = var2;
         this.id_byte = var4.id_break;
         this.id_protected = var4.id_byte;
         this.id_throws = var3;
         this.id_case = var1;
         this.id_catch = var1.id_break();
         this.id_private = var1.id_public();
         this.id_implements = var1.id_long();
         this.id_finally = var1.id_default();
         this.id_volatile = new rYA(this, rYA.id_class(this.id_catch), var1.id_default().id_volatile());
         this.id_final = ((roC_2)var2.get(0)).id_private();
         this.id_package = ((roC_2)var2.get(var2.size() - 1)).id_private();
         this.id_int = var1.id_protected().id_class(this);
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, xc_3 var2, int var3, int var4) {
      roC_2 var5 = this.id_volatile(var1);
      xc_3 var6 = var5.id_class(var1, var2, false);
      if (var6 != null) {
         this.id_case.id_break(var1, var6, var2);
      }

      xd_3 var7 = var2.id_break();
      if (var7.id_protected()) {
         if (var5.id_goto().id_catch() == roZ_2.LEVELCHUNK) {
            var5.id_class(var1, ((kx_3)var7).id_class(this));
         } else {
            rcd_3 var8 = new rcd_3();
            var8.id_break("x", var1.b_());
            var8.id_break("y", var1.c_());
            var8.id_break("z", var1.d_());
            var8.id_class("id", "DUMMY");
            var5.id_class(var8);
         }
      } else if (var6 != null && var6.id_break().id_protected()) {
         var5.id_throws(var1);
      }

      if (var2.id_int(this, var1)) {
         this.id_new(var1);
      }

      return true;
   }

   @Override
   public boolean id_class(rfH_2 var1, Predicate<xc_3> var2) {
      return var2.test(this.id_byte(var1));
   }

   @Override
   public boolean id_class(rfH_2 var1, boolean var2) {
      return this.id_class(var1, xu_3.id_class.id_continue(), 3);
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      roC_2 var2 = this.id_volatile(var1);
      ryO_2 var3 = var2.id_class(var1);
      if (var3 != null) {
         return var3;
      } else {
         rcd_3 var4 = var2.id_case(var1);
         xc_3 var5 = var2.id_byte(var1);
         if (var4 != null) {
            if ("DUMMY".equals(var4.id_native("id"))) {
               xd_3 var6 = var5.id_break();
               if (!(var6 instanceof kx_3)) {
                  return null;
               }

               var3 = ((kx_3)var6).id_class(this.id_case);
            } else {
               var3 = ryO_2.id_break(var5, var4);
            }

            if (var3 != null) {
               var2.id_class(var1, var3);
               return var3;
            }
         }

         if (var5.id_break() instanceof kx_3) {
            id_class.warn("Tried to access a block entity before it was created. {}", var1);
         }

         return null;
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, boolean var2, an_3 var3, int var4) {
      xc_3 var5 = this.id_byte(var1);
      if (var5.id_catch()) {
         return false;
      } else {
         if (var2) {
            ryO_2 var6 = var5.id_break().id_protected() ? this.id_class(var1) : null;
            xd_3.id_class(var5, (rYB)this.id_case, var1, var6, var3, rdn_3.id_break);
         }

         return this.id_class(var1, xu_3.id_class.id_continue(), 3, var4);
      }
   }

   @Override
   public int id_class(rKv_1 var1, int var2, int var3) {
      return this.id_protected(var2 >> 4, var3 >> 4).id_class(var1, var2 & 15, var3 & 15) + 1;
   }

   @Override
   public void id_class(rhd_3 var1, rfH_2 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
   }

   @Override
   public void id_class(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public void id_class(rhd_3 var1, int var2, rfH_2 var3, int var4) {
   }

   @Override
   public rhd_3 id_class(double var1, double var3, double var5, double var7, Predicate<an_3> var9) {
      return null;
   }

   @Override
   public roC_2 id_class(int var1, int var2, roN_2 var3, boolean var4) {
      roC_2 var5;
      if (this.id_break(var1, var2)) {
         int var6 = var1 - this.id_final.id_break;
         int var7 = var2 - this.id_final.id_byte;
         var5 = this.id_break.get(var6 + var7 * this.id_throws);
         if (var5.id_goto().id_break(var3)) {
            return var5;
         }
      } else {
         var5 = null;
      }

      if (!var4) {
         return null;
      } else {
         id_class.error("Requested chunk : {} {}", var1, var2);
         id_class.error("Region bounds : {} {} | {} {}", this.id_final.id_break, this.id_final.id_byte, this.id_package.id_break, this.id_package.id_byte);
         if (var5 != null) {
            throw (RuntimeException)rqR_2.id_byte(
               new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", var3, var5.id_goto(), var1, var2))
            );
         } else {
            throw (RuntimeException)rqR_2.id_byte(new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", var1, var2)));
         }
      }
   }

   @Override
   public Stream<? extends rrrH<?>> id_class(rjh_3 var1, rrrZ<?> var2) {
      return this.id_int.id_class(var1, var2);
   }

   @Override
   public float id_class(rpr_3 var1, boolean var2) {
      return 1.0F;
   }

   @Override
   public <T extends an_3> List<T> id_class(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      return Collections.emptyList();
   }

   @Override
   public rrse_3 id_class() {
      return this.id_case.id_class();
   }

   @Override
   public rRJ id_default() {
      return this.id_finally;
   }

   @Override
   public int id_short() {
      return this.id_case.id_short();
   }

   @Override
   public int id_void() {
      return 0;
   }

   @Override
   public List<an_3> id_break(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3) {
      return Collections.emptyList();
   }

   @Override
   public long id_break() {
      return this.id_catch;
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      return this.id_volatile(var1).id_break(var1);
   }

   @Override
   public boolean id_break(int var1, int var2) {
      return var1 >= this.id_final.id_break && var1 <= this.id_package.id_break && var2 >= this.id_final.id_byte && var2 <= this.id_package.id_byte;
   }

   public int id_throws() {
      return this.id_protected;
   }

   @Override
   public rRh_1 id_throws(rfH_2 var1) {
      if (!this.id_break(var1.b_() >> 4, var1.d_() >> 4)) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new rRh_1(this.id_case.id_abstract(), this.id_case.P(), 0L, this.id_case.id_interface());
      }
   }

   @Override
   public rRV<xd_3> id_finally() {
      return this.id_extends;
   }

   @Override
   public rRV<rXs_1> id_extends() {
      return this.id_native;
   }

   @Override
   public roX_2 id_goto() {
      return this.id_case.id_else();
   }

   @Override
   public List<rhd_3> id_continue() {
      return Collections.emptyList();
   }

   @Override
   public boolean id_import() {
      return false;
   }

   @Override
   public roE_2 id_instanceof() {
      return this.id_case.id_instanceof();
   }

   @Override
   public rVm_1 id_new() {
      return this.id_case.id_new();
   }

   private void id_new(rfH_2 var1) {
      this.id_volatile(var1).id_extends(var1);
   }

   @Override
   public rYA id_static() {
      return this.id_volatile;
   }

   @Override
   public rrGs_1 id_public() {
      return this.id_private;
   }

   public int id_protected() {
      return this.id_byte;
   }

   @Override
   public roC_2 id_protected(int var1, int var2) {
      return this.id_class(var1, var2, roN_2.id_class);
   }

   @Override
   public boolean a_(an_3 var1) {
      int var2 = rfU_2.id_byte(var1.rx() / 16.0);
      int var3 = rfU_2.id_byte(var1.BO() / 16.0);
      this.id_protected(var2, var3).id_class(var1);
      return true;
   }
}
