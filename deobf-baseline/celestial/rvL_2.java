package celestial;

import java.io.IOException;

public class rvL_2 implements ruS_2<At_1> {
   private int id_class;
   private rdf_3 id_break;
   private int id_byte;
   private int id_protected;
   private boolean id_throws;
   private boolean id_case;

   public rdf_3 id_byte() {
      return this.id_break;
   }

   public rvL_2() {
   }

   public rvL_2(int var1, rdf_3 var2, int var3, int var4, boolean var5, boolean var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = rdf_3.id_break(var1);
      this.id_byte = var1.id_case();
      this.id_protected = var1.id_case();
      this.id_throws = var1.readBoolean();
      this.id_case = var1.readBoolean();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      this.id_break.id_class(var1);
      var1.id_protected(this.id_byte);
      var1.id_protected(this.id_protected);
      var1.writeBoolean(this.id_throws);
      var1.writeBoolean(this.id_case);
   }

   public int id_throws() {
      return this.id_protected;
   }

   public boolean id_catch() {
      return this.id_case;
   }

   public boolean id_case() {
      return this.id_throws;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
