package celestial;

import java.util.Iterator;

public class rrds_1 implements Iterator<yQ_2> {
   private yO_2 class_;
   private rrdB break_;
   private rrGi_1 byte_ = new rrGi_1(0, 0, 0);

   public rrds_1(yO_2 var1, rfH_2 var2, rfH_2 var3, int var4, int var5) {
      this.class_ = var1;
      this.break_ = new rrdB(var2, var3, var4, var5);
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   @Override
   public boolean hasNext() {
      return this.break_.hasNext();
   }

   public yQ_2 class_() {
      rfH_2 var1 = this.break_.class_();
      this.byte_.class_(var1.b_() << 4, var1.c_() << 4, var1.d_() << 4);
      return this.class_.class_(this.byte_);
   }
}
