package celestial;

import java.io.IOException;
import java.util.List;

public class rFT implements ruS_2<At_1> {
   private int class_;
   private List<rdn_3> break_;

   public List<rdn_3> byte_() {
      return this.break_;
   }

   public rFT() {
   }

   public rFT(int var1, rqs_3<rdn_3> var2) {
      this.class_ = var1;
      this.break_ = rqs_3.class_(var2.size(), rdn_3.break_);

      for (int var3 = 0; var3 < this.break_.size(); var3++) {
         this.break_.set(var3, ((rdn_3)var2.get(var3)).implements_());
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readUnsignedByte();
      short var2 = var1.readShort();
      this.break_ = rqs_3.class_(var2, rdn_3.break_);

      for (int var3 = 0; var3 < var2; var3++) {
         this.break_.set(var3, var1.extends_());
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.writeShort(this.break_.size());

      for (rdn_3 var3 : this.break_) {
         var1.class_(var3);
      }
   }

   public int break_() {
      return this.class_;
   }
}
