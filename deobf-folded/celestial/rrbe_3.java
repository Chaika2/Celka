package celestial;

import java.util.Arrays;

public class rrbe_3 {
   private rqO_2 id_class;
   private float[] id_break;

   public rrbe_3(rqO_2 var1, float[] var2) {
      this.id_class = var1;
      this.id_break = (float[])var2.clone();
      Arrays.sort(this.id_break);
   }

   @Override
   public String toString() {
      return "location: " + this.id_class + ", values: [" + rrbb_3.id_class(this.id_break) + "]";
   }

   public Integer id_class(rdn_3 var1, gm_3 var2, iB_2 var3) {
      rdb_3 var4 = var1.id_break();
      rdE_2 var5 = rdv_3.id_class(var4, this.id_class);
      if (var5 == null) {
         return null;
      } else {
         float var6 = var5.call(var1, var2, var3);
         int var7 = Arrays.binarySearch(this.id_break, var6);
         return var7;
      }
   }

   public rqO_2 id_class() {
      return this.id_class;
   }

   public float[] id_break() {
      return this.id_break;
   }
}
