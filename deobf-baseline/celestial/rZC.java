package celestial;

import java.io.IOException;

public class rZC implements ruS_2<rmH_2> {
   private rfH_2 id_class;
   private rqO_2 id_break;
   private rqO_2 id_byte;
   private rqO_2 id_protected;
   private String id_throws;
   private rHV id_case;

   public rqO_2 id_byte() {
      return this.id_break;
   }

   public rZC() {
   }

   public rZC(rfH_2 var1, rqO_2 var2, rqO_2 var3, rqO_2 var4, String var5, rHV var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = var1.id_volatile();
      this.id_byte = var1.id_volatile();
      this.id_protected = var1.id_volatile();
      this.id_throws = var1.id_throws(32767);
      this.id_case = rHV.id_class(var1.id_throws(32767)).orElse(rHV.ALIGNED);
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      var1.id_class(this.id_byte);
      var1.id_class(this.id_protected);
      var1.id_class(this.id_throws);
      var1.id_class(this.id_case.id_class());
   }

   public rqO_2 id_throws() {
      return this.id_protected;
   }

   public rHV id_catch() {
      return this.id_case;
   }

   public String id_case() {
      return this.id_throws;
   }

   public rqO_2 id_protected() {
      return this.id_byte;
   }
}
