package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public class Ip_1 extends jY_2<IC> implements AutoCloseable {
   private Map<rqO_2, IJ> class_;
   private fp_3 break_;
   private final lY_2 byte_;
   private final fY_2 protected_;
   private final yC_2 throws_;
   private int case_;
   private IJ catch_;
   private Object2IntMap<xc_3> private_;

   public lY_2 byte_() {
      return this.byte_;
   }

   public Ip_1(fY_2 var1, yC_2 var2, int var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.byte_ = new lY_2(this);
   }

   public boolean class_(xc_3 var1, xc_3 var2) {
      if (var1 == var2) {
         return false;
      } else {
         int var3 = this.private_.getInt(var1);
         if (var3 != -1) {
            int var4 = this.private_.getInt(var2);
            if (var3 == var4) {
               rXE var5 = var1.volatile_();
               rXE var6 = var2.volatile_();
               return var5 != var6;
            }
         }

         return true;
      }
   }

   public fJ_2 class_(rqO_2 var1) {
      return this.break_.class_(var1);
   }

   public void class_(int var1) {
      this.case_ = var1;
   }

   public IJ class_(II var1) {
      return this.class_.getOrDefault(var1, this.catch_);
   }

   protected IC class_(rAL var1) {
      return new IC(var1, this.throws_, this.case_);
   }

   protected void class_(IC var1, rAL var2) {
      if (this.break_ != null) {
         this.break_.close();
      }

      this.break_ = var1.class_(this.protected_);
      this.class_ = var1.class_();
      this.private_ = var1.break_();
      this.catch_ = this.class_.get(IC.native_);
      this.byte_.break_();
   }

   @Override
   public void close() {
      if (this.break_ != null) {
         this.break_.close();
      }
   }

   public IJ break_() {
      return this.catch_;
   }
}
