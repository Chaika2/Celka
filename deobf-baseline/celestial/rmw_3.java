package celestial;

import java.io.IOException;

public class rmw_3 implements ruS_2<rmH_2> {
   private String id_class;
   private int id_break;
   private rhJ_2 id_byte;
   private boolean id_protected;
   private int id_throws;
   private rpZ_2 id_case;

   public boolean id_byte() {
      return this.id_protected;
   }

   public rmw_3() {
   }

   public rmw_3(String var1, int var2, rhJ_2 var3, boolean var4, int var5, rpZ_2 var6) {
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
      this.id_class = var1.id_throws(16);
      this.id_break = var1.readByte();
      this.id_byte = var1.id_class(rhJ_2.class);
      this.id_protected = var1.readBoolean();
      this.id_throws = var1.readUnsignedByte();
      this.id_case = var1.id_class(rpZ_2.class);
   }

   public rhJ_2 id_break() {
      return this.id_byte;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeByte(this.id_break);
      var1.id_class(this.id_byte);
      var1.writeBoolean(this.id_protected);
      var1.writeByte(this.id_throws);
      var1.id_class(this.id_case);
   }

   public rpZ_2 id_throws() {
      return this.id_case;
   }

   public int id_protected() {
      return this.id_throws;
   }
}
