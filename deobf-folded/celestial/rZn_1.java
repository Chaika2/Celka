package celestial;

import java.io.IOException;

public class rZn_1 implements ruS_2<rmH_2> {
   private rfH_2 id_class;
   private String id_break;
   private boolean id_byte;
   private boolean id_protected;
   private boolean id_throws;
   private rHF id_case;

   public String id_byte() {
      return this.id_break;
   }

   public rZn_1() {
   }

   public rZn_1(rfH_2 var1, String var2, rHF var3, boolean var4, boolean var5, boolean var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var3;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = var1.id_throws(32767);
      this.id_case = var1.id_class(rHF.class);
      byte var2 = var1.readByte();
      this.id_byte = (var2 & 1) != 0;
      this.id_protected = (var2 & 2) != 0;
      this.id_throws = (var2 & 4) != 0;
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      var1.id_class(this.id_case);
      byte var2 = 0;
      if (this.id_byte) {
         var2 |= 1;
      }

      if (this.id_protected) {
         var2 |= 2;
      }

      if (this.id_throws) {
         var2 |= 4;
      }

      var1.writeByte(var2);
   }

   public boolean id_throws() {
      return this.id_protected;
   }

   public rHF id_catch() {
      return this.id_case;
   }

   public boolean id_case() {
      return this.id_throws;
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
