package celestial;

public class rrXH implements rrXf_1 {
   private rrXq_1 class_;
   private rrXt_1[] break_;
   private int byte_ = -1;

   public rrXH(rrXq_1 var1, rrXt_1[] var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return this.class_ + "()";
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float class_() {
      rrXt_1[] var1 = this.break_;
      switch (this.class_) {
         case SMOOTH:
            rrXt_1 var2 = var1[0];
            if (!(var2 instanceof rrXv_1)) {
               float var3 = class_(var1, 0);
               float var4 = var1.length > 1 ? class_(var1, 1) : 1.0F;
               float var5 = var1.length > 2 ? class_(var1, 2) : var4;
               if (this.byte_ < 0) {
                  this.byte_ = rrkT.class_();
               }

               return rrkT.class_(this.byte_, var3, var4, var5);
            }
         default:
            return this.class_.byte_(this.break_);
      }
   }

   private static float class_(rrXt_1[] var0, int var1) {
      rrXf_1 var2 = (rrXf_1)var0[var1];
      return var2.class_();
   }
}
