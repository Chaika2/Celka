package celestial;

import java.io.IOException;

public class rZq_1 implements ruS_2<rmH_2> {
   private int id_class;
   private an_3 id_break;
   private rZT id_byte;
   private rjU_2 id_protected;
   private rpm_3 id_throws;
   private boolean id_case;

   public an_3 id_byte() {
      return this.id_break;
   }

   public rZq_1(an_3 var1, rpm_3 var2, rjU_2 var3, boolean var4) {
      this.id_class = var1.V();
      this.id_break = var1;
      this.id_byte = rZT.INTERACT_AT;
      this.id_throws = var2;
      this.id_protected = var3;
      this.id_case = var4;
   }

   public rZq_1(an_3 var1, rpm_3 var2, boolean var3) {
      this.id_class = var1.V();
      this.id_break = var1;
      this.id_byte = rZT.INTERACT;
      this.id_throws = var2;
      this.id_case = var3;
   }

   public rZq_1() {
   }

   public rZq_1(an_3 var1, boolean var2) {
      this.id_class = var1.V();
      this.id_break = var1;
      this.id_byte = rZT.ATTACK;
      this.id_case = var2;
   }

   public an_3 id_class(rYB var1) {
      return var1.id_break(this.id_class);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_byte = var1.id_class(rZT.class);
      if (this.id_byte == rZT.INTERACT_AT) {
         this.id_protected = new rjU_2((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

      if (this.id_byte == rZT.INTERACT || this.id_byte == rZT.INTERACT_AT) {
         this.id_throws = var1.id_class(rpm_3.class);
      }

      this.id_case = var1.readBoolean();
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public rZT id_break() {
      return this.id_byte;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_byte);
      if (this.id_byte == rZT.INTERACT_AT) {
         var1.writeFloat((float)this.id_protected.id_break);
         var1.writeFloat((float)this.id_protected.id_byte);
         var1.writeFloat((float)this.id_protected.id_protected);
      }

      if (this.id_byte == rZT.INTERACT || this.id_byte == rZT.INTERACT_AT) {
         var1.id_class(this.id_throws);
      }

      var1.writeBoolean(this.id_case);
   }

   public rjU_2 id_throws() {
      return this.id_protected;
   }

   public boolean id_case() {
      return this.id_case;
   }

   public rpm_3 id_protected() {
      return this.id_throws;
   }
}
