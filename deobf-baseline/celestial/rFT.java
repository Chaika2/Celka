package celestial;

import java.io.IOException;
import java.util.List;

public class rFT implements ruS_2<At_1> {
   private int id_class;
   private List<rdn_3> id_break;

   public List<rdn_3> id_byte() {
      return this.id_break;
   }

   public rFT() {
   }

   public rFT(int var1, rqs_3<rdn_3> var2) {
      this.id_class = var1;
      this.id_break = rqs_3.id_class(var2.size(), rdn_3.id_break);

      for (int var3 = 0; var3 < this.id_break.size(); var3++) {
         this.id_break.set(var3, ((rdn_3)var2.get(var3)).id_implements());
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readUnsignedByte();
      short var2 = var1.readShort();
      this.id_break = rqs_3.id_class(var2, rdn_3.id_break);

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_break.set(var3, var1.id_extends());
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeShort(this.id_break.size());

      for (rdn_3 var3 : this.id_break) {
         var1.id_class(var3);
      }
   }

   public int id_break() {
      return this.id_class;
   }
}
