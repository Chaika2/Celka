package celestial;

public class uO_2 extends ff_3 {
   private final rqO_2 id_class;
   private final HU id_break;
   private final HU id_byte;
   private final boolean id_protected;
   private final uh_3 id_throws;

   public uO_2(rqO_2 var1, boolean var2) {
      this.id_class = var1;
      this.id_protected = var2;
      this.id_throws = new uh_3(0, 0, 256, 256);
      fo_3.id_class(var2 ? fu_3.RGBA : fu_3.INTENSITY, this.id_new(), 256, 256);
      this.id_break = HU.id_int(var1);
      this.id_byte = HU.id_new(var1);
   }

   public ud_3 id_class(uJ_2 var1) {
      if (var1.id_protected() != this.id_protected) {
         return null;
      } else {
         uh_3 var2 = this.id_throws.id_class(var1);
         if (var2 != null) {
            this.id_super();
            var1.id_class(var2.id_class, var2.id_break);
            float var3 = 256.0F;
            float var4 = 256.0F;
            float var5 = 0.01F;
            return new ud_3(
               this.id_break,
               this.id_byte,
               ((float)var2.id_class + 0.01F) / 256.0F,
               ((float)var2.id_class - 0.01F + (float)var1.id_class()) / 256.0F,
               ((float)var2.id_break + 0.01F) / 256.0F,
               ((float)var2.id_break - 0.01F + (float)var1.id_break()) / 256.0F,
               var1.id_private(),
               var1.id_implements(),
               var1.id_finally(),
               var1.id_extends()
            );
         } else {
            return null;
         }
      }
   }

   public rqO_2 id_class() {
      return this.id_class;
   }

   @Override
   public void close() {
      this.id_continue();
   }

   @Override
   public void a_(rAL var1) {
   }
}
