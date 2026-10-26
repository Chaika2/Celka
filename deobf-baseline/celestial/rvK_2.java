package celestial;

import java.io.IOException;

public class rvK_2 implements ruS_2<At_1> {
   private double id_class;
   private double id_break;
   private double id_byte;
   private int id_protected;
   private Rm_1 id_throws;
   private Rm_1 id_case;
   private boolean id_catch;

   public rvK_2(Rm_1 var1, an_3 var2, Rm_1 var3) {
      this.id_throws = var1;
      this.id_protected = var2.V();
      this.id_case = var3;
      rjU_2 var4 = var3.id_class(var2);
      this.id_class = var4.id_break;
      this.id_break = var4.id_byte;
      this.id_byte = var4.id_protected;
      this.id_catch = true;
   }

   public rvK_2(Rm_1 var1, double var2, double var4, double var6) {
      this.id_throws = var1;
      this.id_class = var2;
      this.id_break = var4;
      this.id_byte = var6;
   }

   public rvK_2() {
   }

   public rjU_2 id_class(rYB var1) {
      if (this.id_catch) {
         an_3 var2 = var1.id_break(this.id_protected);
         return var2 == null ? new rjU_2(this.id_class, this.id_break, this.id_byte) : this.id_case.id_class(var2);
      } else {
         return new rjU_2(this.id_class, this.id_break, this.id_byte);
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_throws = var1.id_class(Rm_1.class);
      this.id_class = var1.readDouble();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      if (var1.readBoolean()) {
         this.id_catch = true;
         this.id_protected = var1.id_case();
         this.id_case = var1.id_class(Rm_1.class);
      }
   }

   public Rm_1 id_break() {
      return this.id_throws;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_throws);
      var1.writeDouble(this.id_class);
      var1.writeDouble(this.id_break);
      var1.writeDouble(this.id_byte);
      var1.writeBoolean(this.id_catch);
      if (this.id_catch) {
         var1.id_protected(this.id_protected);
         var1.id_class(this.id_case);
      }
   }
}
