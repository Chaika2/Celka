package celestial;

import java.util.Optional;

public class Hc_1 implements Hx_1 {
   private final Hd_1 id_class;
   private final Hd_1 id_break = Hx_1.id_class(new lD_2(256));
   private int id_byte = 255;
   private int id_protected = 255;
   private int id_throws = 255;
   private int id_case = 255;

   public Hc_1(Hd_1 var1) {
      this.id_class = var1;
   }

   public void id_class(int var1, int var2, int var3, int var4) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
   }

   public void id_break() {
      this.id_break.id_break();
   }

   @Override
   public Ok_1 getBuffer(HU var1) {
      if (var1.id_throw()) {
         Ok_1 var6 = this.id_break.getBuffer(var1);
         return new Hu_1(var6, this.id_byte, this.id_protected, this.id_throws, this.id_case);
      } else {
         Ok_1 var2 = this.id_class.getBuffer(var1);
         Optional var3 = var1.id_instanceof();
         if (var3.isPresent()) {
            Ok_1 var4 = this.id_break.getBuffer((HU)var3.get());
            Hu_1 var5 = new Hu_1(var4, this.id_byte, this.id_protected, this.id_throws, this.id_case);
            return OQ.id_class(var5, var2);
         } else {
            return var2;
         }
      }
   }
}
