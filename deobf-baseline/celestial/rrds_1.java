package celestial;

import java.util.Iterator;

public class rrds_1 implements Iterator<yQ_2> {
   private yO_2 id_class;
   private rrdB id_break;
   private rrGi_1 id_byte = new rrGi_1(0, 0, 0);

   public rrds_1(yO_2 var1, rfH_2 var2, rfH_2 var3, int var4, int var5) {
      this.id_class = var1;
      this.id_break = new rrdB(var2, var3, var4, var5);
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   @Override
   public boolean hasNext() {
      return this.id_break.hasNext();
   }

   public yQ_2 id_class() {
      rfH_2 var1 = this.id_break.id_class();
      this.id_byte.id_class(var1.b_() << 4, var1.c_() << 4, var1.d_() << 4);
      return this.id_class.id_class(this.id_byte);
   }
}
