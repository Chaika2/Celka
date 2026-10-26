package celestial;

import java.io.IOException;

public class rZY implements ruS_2<At_1> {
   public static final rZo_1 class_ = new rZo_1(0);
   public static final rZo_1 break_ = new rZo_1(1);
   public static final rZo_1 byte_ = new rZo_1(2);
   public static final rZo_1 protected_ = new rZo_1(3);
   public static final rZo_1 throws_ = new rZo_1(4);
   public static final rZo_1 case_ = new rZo_1(5);
   public static final rZo_1 catch_ = new rZo_1(6);
   public static final rZo_1 private_ = new rZo_1(7);
   public static final rZo_1 implements_ = new rZo_1(8);
   public static final rZo_1 finally_ = new rZo_1(9);
   public static final rZo_1 extends_ = new rZo_1(10);
   public static final rZo_1 native_ = new rZo_1(11);
   private rZo_1 volatile_;
   private float final_;

   public float byte_() {
      return this.final_;
   }

   public rZY() {
   }

   public rZY(rZo_1 var1, float var2) {
      this.volatile_ = var1;
      this.final_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.volatile_ = (rZo_1)rZo_1.class_.get(var1.readUnsignedByte());
      this.final_ = var1.readFloat();
   }

   public rZo_1 break_() {
      return this.volatile_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.volatile_.break_);
      var1.writeFloat(this.final_);
   }
}
