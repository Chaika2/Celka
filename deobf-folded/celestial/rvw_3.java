package celestial;

import java.io.IOException;

public class rvw_3 implements ruS_2<At_1> {
   private int id_class;
   private rfH_2 id_break;
   private int id_byte;
   private boolean id_protected;

   public int id_byte() {
      return this.id_class;
   }

   public rvw_3() {
   }

   public rvw_3(int var1, rfH_2 var2, int var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2.id_int();
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readInt();
      this.id_break = var1.id_byte();
      this.id_byte = var1.readInt();
      this.id_protected = var1.readBoolean();
   }

   public boolean id_break() {
      return this.id_protected;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeInt(this.id_class);
      var1.id_class(this.id_break);
      var1.writeInt(this.id_byte);
      var1.writeBoolean(this.id_protected);
   }

   public rfH_2 id_throws() {
      return this.id_break;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
