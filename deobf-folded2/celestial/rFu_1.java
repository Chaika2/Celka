package celestial;

import java.io.IOException;

public class rFu_1 implements ruS_2<At_1> {
   private rFm_1 id_class;
   private rgP_2 id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;

   public rgP_2 id_byte() {
      return this.id_break;
   }

   public rFu_1(rFm_1 var1, rgP_2 var2, int var3, int var4, int var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public rFu_1(int var1, int var2, int var3) {
      this(rFm_1.TIMES, (rgP_2)null, var1, var2, var3);
   }

   public rFu_1() {
   }

   public rFu_1(rFm_1 var1, rgP_2 var2) {
      this(var1, var2, -1, -1, -1);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rFm_1.class);
      if (this.id_class == rFm_1.TITLE || this.id_class == rFm_1.SUBTITLE || this.id_class == rFm_1.ACTIONBAR) {
         this.id_break = var1.id_throws();
      }

      if (this.id_class == rFm_1.TIMES) {
         this.id_byte = var1.readInt();
         this.id_protected = var1.readInt();
         this.id_throws = var1.readInt();
      }
   }

   public rFm_1 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      if (this.id_class == rFm_1.TITLE || this.id_class == rFm_1.SUBTITLE || this.id_class == rFm_1.ACTIONBAR) {
         var1.id_class(this.id_break);
      }

      if (this.id_class == rFm_1.TIMES) {
         var1.writeInt(this.id_byte);
         var1.writeInt(this.id_protected);
         var1.writeInt(this.id_throws);
      }
   }

   public int id_throws() {
      return this.id_protected;
   }

   public int id_case() {
      return this.id_throws;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
