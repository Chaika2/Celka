package celestial;

public class rrXH implements rrXf_1 {
   private rrXq_1 id_class;
   private rrXt_1[] id_break;
   private int id_byte = -1;

   public rrXH(rrXq_1 var1, rrXt_1[] var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_class + "()";
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float id_class() {
      rrXt_1[] var1 = this.id_break;
      switch (this.id_class) {
         case SMOOTH:
            rrXt_1 var2 = var1[0];
            if (!(var2 instanceof rrXv_1)) {
               float var3 = id_class(var1, 0);
               float var4 = var1.length > 1 ? id_class(var1, 1) : 1.0F;
               float var5 = var1.length > 2 ? id_class(var1, 2) : var4;
               if (this.id_byte < 0) {
                  this.id_byte = rrkT.id_class();
               }

               return rrkT.id_class(this.id_byte, var3, var4, var5);
            }
         default:
            return this.id_class.id_byte(this.id_break);
      }
   }

   private static float id_class(rrXt_1[] var0, int var1) {
      rrXf_1 var2 = (rrXf_1)var0[var1];
      return var2.id_class();
   }
}
