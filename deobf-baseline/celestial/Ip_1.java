package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public class Ip_1 extends jY_2<IC> implements AutoCloseable {
   private Map<rqO_2, IJ> id_class;
   private fp_3 id_break;
   private final lY_2 id_byte;
   private final fY_2 id_protected;
   private final yC_2 id_throws;
   private int id_case;
   private IJ id_catch;
   private Object2IntMap<xc_3> id_private;

   public lY_2 id_byte() {
      return this.id_byte;
   }

   public Ip_1(fY_2 var1, yC_2 var2, int var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_byte = new lY_2(this);
   }

   public boolean id_class(xc_3 var1, xc_3 var2) {
      if (var1 == var2) {
         return false;
      } else {
         int var3 = this.id_private.getInt(var1);
         if (var3 != -1) {
            int var4 = this.id_private.getInt(var2);
            if (var3 == var4) {
               rXE var5 = var1.id_volatile();
               rXE var6 = var2.id_volatile();
               return var5 != var6;
            }
         }

         return true;
      }
   }

   public fJ_2 id_class(rqO_2 var1) {
      return this.id_break.id_class(var1);
   }

   public void id_class(int var1) {
      this.id_case = var1;
   }

   public IJ id_class(II var1) {
      return this.id_class.getOrDefault(var1, this.id_catch);
   }

   protected IC id_class(rAL var1) {
      return new IC(var1, this.id_throws, this.id_case);
   }

   protected void id_class(IC var1, rAL var2) {
      if (this.id_break != null) {
         this.id_break.close();
      }

      this.id_break = var1.id_class(this.id_protected);
      this.id_class = var1.id_class();
      this.id_private = var1.id_break();
      this.id_catch = this.id_class.get(IC.id_native);
      this.id_byte.id_break();
   }

   @Override
   public void close() {
      if (this.id_break != null) {
         this.id_break.close();
      }
   }

   public IJ id_break() {
      return this.id_catch;
   }
}
