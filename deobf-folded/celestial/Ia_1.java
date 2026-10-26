package celestial;

import java.util.List;
import java.util.Random;

public class Ia_1 implements IJ {
   private final int id_class;
   private final List<fr_3> id_break;
   private final IJ id_byte;

   @Override
   public boolean id_byte() {
      return this.id_byte.id_byte();
   }

   public Ia_1(List<fr_3> var1) {
      this.id_break = var1;
      this.id_class = rTE.id_class(var1);
      this.id_byte = ((fr_3)var1.get(0)).id_class;
   }

   @Override
   public List<wK_2> id_class(xc_3 var1, rpr_3 var2, Random var3) {
      return rTE.id_class(this.id_break, Math.abs((int)var3.nextLong()) % this.id_class).id_class.id_class(var1, var2, var3);
   }

   @Override
   public boolean id_class() {
      return this.id_byte.id_class();
   }

   @Override
   public boolean id_break() {
      return this.id_byte.id_break();
   }

   @Override
   public fj_3 id_throws() {
      return this.id_byte.id_throws();
   }

   @Override
   public IF id_catch() {
      return this.id_byte.id_catch();
   }

   @Override
   public Ik_1 id_case() {
      return this.id_byte.id_case();
   }

   @Override
   public boolean id_protected() {
      return this.id_byte.id_protected();
   }
}
