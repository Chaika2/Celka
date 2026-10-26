package celestial;

import java.util.List;
import java.util.Optional;

public class LN extends LQ implements cn_3, rrJO {
   private final VF case_;
   private boolean catch_;
   private boolean private_;

   @Override
   public void byte_(double var1, double var3) {
      if (this.catch_) {
         this.private_ = true;
      }

      super.byte_(var1, var3);
   }

   public LN(Qw_1 var1, int var2, int var3, int var4, int var5, VF var6) {
      super(var1, var2, var3, var4, var5, (double)((float)var6.break_(var6.class_(var1))));
      this.case_ = var6;
      this.catch_();
      this.catch_ = rrMu_1.class_(this.case_);
      this.private_ = false;
   }

   public static int class_(LZ var0) {
      return var0.extends_;
   }

   @Override
   protected void class_(double var1, double var3, double var5, double var7) {
      if (this.catch_) {
         this.private_ = true;
      }

      super.class_(var1, var3, var5, var7);
   }

   @Override
   public Optional<List<rpl_3>> class_() {
      return this.case_.break_();
   }

   public static int break_(LZ var0) {
      return var0.native_;
   }

   @Override
   protected void catch_() {
      if (this.private_) {
         double var1 = this.case_.byte_(this.throws_);
         rgP_2 var3 = rrMu_1.class_(this.case_, var1);
         if (var3 != null) {
            this.break_(var3);
         }
      } else {
         this.break_(this.case_.break_(this.class_));
      }
   }

   @Override
   public QF implements_() {
      return this.case_;
   }

   @Override
   public void protected_(double var1, double var3) {
      if (this.private_) {
         this.private_ = false;
         this.private_();
         this.catch_();
      }

      super.protected_(var1, var3);
   }

   @Override
   protected void private_() {
      if (!this.private_) {
         double var1 = this.case_.class_(this.class_);
         double var3 = this.case_.byte_(this.throws_);
         if (var3 != var1) {
            this.case_.class_(this.class_, this.case_.byte_(this.throws_));
            this.class_.break_();
         }
      }
   }
}
