package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKf_1 implements rRI {
   private static final Logger class_ = LogManager.getLogger();
   private final List<roC_2> break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final rrEm_1 case_;
   private final long catch_;
   private final rrGs_1 private_;
   private final Random implements_;
   private final rRJ finally_;
   private final rRV<xd_3> extends_ = new rYs_1<>(var1x -> this.volatile_(var1x).int_());
   private final rRV<rXs_1> native_ = new rYs_1<>(var1x -> this.volatile_(var1x).new_());
   private final rYA volatile_;
   private final rfj_3 final_;
   private final rfj_3 package_;
   private final rrrA int_;

   @Override
   public rYG byte_(int var1, int var2, int var3) {
      return this.case_.byte_(var1, var2, var3);
   }

   @Override
   public xc_3 byte_(rfH_2 var1) {
      return this.protected_(var1.b_() >> 4, var1.d_() >> 4).byte_(var1);
   }

   @Deprecated
   @Override
   public rrEm_1 byte_() {
      return this.case_;
   }

   @Override
   public Random long_() {
      return this.implements_;
   }

   public rKf_1(rrEm_1 var1, List<roC_2> var2) {
      int var3 = rfU_2.byte_(Math.sqrt((double)var2.size()));
      if (var3 * var3 != var2.size()) {
         throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("Cache size is not a square."));
      } else {
         rfj_3 var4 = ((roC_2)var2.get(var2.size() / 2)).private_();
         this.break_ = var2;
         this.byte_ = var4.break_;
         this.protected_ = var4.byte_;
         this.throws_ = var3;
         this.case_ = var1;
         this.catch_ = var1.break_();
         this.private_ = var1.public_();
         this.implements_ = var1.long_();
         this.finally_ = var1.default_();
         this.volatile_ = new rYA(this, rYA.class_(this.catch_), var1.default_().volatile_());
         this.final_ = ((roC_2)var2.get(0)).private_();
         this.package_ = ((roC_2)var2.get(var2.size() - 1)).private_();
         this.int_ = var1.protected_().class_(this);
      }
   }

   @Override
   public boolean class_(rfH_2 var1, xc_3 var2, int var3, int var4) {
      roC_2 var5 = this.volatile_(var1);
      xc_3 var6 = var5.class_(var1, var2, false);
      if (var6 != null) {
         this.case_.break_(var1, var6, var2);
      }

      xd_3 var7 = var2.break_();
      if (var7.protected_()) {
         if (var5.goto_().catch_() == roZ_2.LEVELCHUNK) {
            var5.class_(var1, ((kx_3)var7).class_(this));
         } else {
            rcd_3 var8 = new rcd_3();
            var8.break_("x", var1.b_());
            var8.break_("y", var1.c_());
            var8.break_("z", var1.d_());
            var8.class_("id", "DUMMY");
            var5.class_(var8);
         }
      } else if (var6 != null && var6.break_().protected_()) {
         var5.throws_(var1);
      }

      if (var2.int_(this, var1)) {
         this.new_(var1);
      }

      return true;
   }

   @Override
   public boolean class_(rfH_2 var1, Predicate<xc_3> var2) {
      return var2.test(this.byte_(var1));
   }

   @Override
   public boolean class_(rfH_2 var1, boolean var2) {
      return this.class_(var1, xu_3.class_.continue_(), 3);
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      roC_2 var2 = this.volatile_(var1);
      ryO_2 var3 = var2.class_(var1);
      if (var3 != null) {
         return var3;
      } else {
         rcd_3 var4 = var2.case_(var1);
         xc_3 var5 = var2.byte_(var1);
         if (var4 != null) {
            if ("DUMMY".equals(var4.native_("id"))) {
               xd_3 var6 = var5.break_();
               if (!(var6 instanceof kx_3)) {
                  return null;
               }

               var3 = ((kx_3)var6).class_(this.case_);
            } else {
               var3 = ryO_2.break_(var5, var4);
            }

            if (var3 != null) {
               var2.class_(var1, var3);
               return var3;
            }
         }

         if (var5.break_() instanceof kx_3) {
            class_.warn("Tried to access a block entity before it was created. {}", var1);
         }

         return null;
      }
   }

   @Override
   public boolean class_(rfH_2 var1, boolean var2, an_3 var3, int var4) {
      xc_3 var5 = this.byte_(var1);
      if (var5.catch_()) {
         return false;
      } else {
         if (var2) {
            ryO_2 var6 = var5.break_().protected_() ? this.class_(var1) : null;
            xd_3.class_(var5, (rYB)this.case_, var1, var6, var3, rdn_3.break_);
         }

         return this.class_(var1, xu_3.class_.continue_(), 3, var4);
      }
   }

   @Override
   public int class_(rKv_1 var1, int var2, int var3) {
      return this.protected_(var2 >> 4, var3 >> 4).class_(var1, var2 & 15, var3 & 15) + 1;
   }

   @Override
   public void class_(rhd_3 var1, rfH_2 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
   }

   @Override
   public void class_(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public void class_(rhd_3 var1, int var2, rfH_2 var3, int var4) {
   }

   @Override
   public rhd_3 class_(double var1, double var3, double var5, double var7, Predicate<an_3> var9) {
      return null;
   }

   @Override
   public roC_2 class_(int var1, int var2, roN_2 var3, boolean var4) {
      roC_2 var5;
      if (this.break_(var1, var2)) {
         int var6 = var1 - this.final_.break_;
         int var7 = var2 - this.final_.byte_;
         var5 = this.break_.get(var6 + var7 * this.throws_);
         if (var5.goto_().break_(var3)) {
            return var5;
         }
      } else {
         var5 = null;
      }

      if (!var4) {
         return null;
      } else {
         class_.error("Requested chunk : {} {}", var1, var2);
         class_.error("Region bounds : {} {} | {} {}", this.final_.break_, this.final_.byte_, this.package_.break_, this.package_.byte_);
         if (var5 != null) {
            throw (RuntimeException)rqR_2.byte_(
               new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", var3, var5.goto_(), var1, var2))
            );
         } else {
            throw (RuntimeException)rqR_2.byte_(new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", var1, var2)));
         }
      }
   }

   @Override
   public Stream<? extends rrrH<?>> class_(rjh_3 var1, rrrZ<?> var2) {
      return this.int_.class_(var1, var2);
   }

   @Override
   public float class_(rpr_3 var1, boolean var2) {
      return 1.0F;
   }

   @Override
   public <T extends an_3> List<T> class_(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      return Collections.emptyList();
   }

   @Override
   public rrse_3 class_() {
      return this.case_.class_();
   }

   @Override
   public rRJ default_() {
      return this.finally_;
   }

   @Override
   public int short_() {
      return this.case_.short_();
   }

   @Override
   public int void_() {
      return 0;
   }

   @Override
   public List<an_3> break_(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3) {
      return Collections.emptyList();
   }

   @Override
   public long break_() {
      return this.catch_;
   }

   @Override
   public rXE break_(rfH_2 var1) {
      return this.volatile_(var1).break_(var1);
   }

   @Override
   public boolean break_(int var1, int var2) {
      return var1 >= this.final_.break_ && var1 <= this.package_.break_ && var2 >= this.final_.byte_ && var2 <= this.package_.byte_;
   }

   public int throws_() {
      return this.protected_;
   }

   @Override
   public rRh_1 throws_(rfH_2 var1) {
      if (!this.break_(var1.b_() >> 4, var1.d_() >> 4)) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new rRh_1(this.case_.abstract_(), this.case_.P(), 0L, this.case_.interface_());
      }
   }

   @Override
   public rRV<xd_3> finally_() {
      return this.extends_;
   }

   @Override
   public rRV<rXs_1> extends_() {
      return this.native_;
   }

   @Override
   public roX_2 goto_() {
      return this.case_.else_();
   }

   @Override
   public List<rhd_3> continue_() {
      return Collections.emptyList();
   }

   @Override
   public boolean import_() {
      return false;
   }

   @Override
   public roE_2 instanceof_() {
      return this.case_.instanceof_();
   }

   @Override
   public rVm_1 new_() {
      return this.case_.new_();
   }

   private void new_(rfH_2 var1) {
      this.volatile_(var1).extends_(var1);
   }

   @Override
   public rYA static_() {
      return this.volatile_;
   }

   @Override
   public rrGs_1 public_() {
      return this.private_;
   }

   public int protected_() {
      return this.byte_;
   }

   @Override
   public roC_2 protected_(int var1, int var2) {
      return this.class_(var1, var2, roN_2.class_);
   }

   @Override
   public boolean a_(an_3 var1) {
      int var2 = rfU_2.byte_(var1.rx() / 16.0);
      int var3 = rfU_2.byte_(var1.BO() / 16.0);
      this.protected_(var2, var3).class_(var1);
      return true;
   }
}
