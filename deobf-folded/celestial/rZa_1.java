package celestial;

import java.io.IOException;

public class rZa_1 implements ruS_2<At_1> {
   public rvr_3 id_class;
   public int id_break;
   public int id_byte;
   public int id_protected;
   public rgP_2 id_throws;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rZa_1(ryR_2 var1, rvr_3 var2, rgP_2 var3) {
      this.id_class = var2;
      iB_2 var4 = var1.id_byte();
      switch (var2) {
         case END_COMBAT:
            this.id_protected = var1.id_protected();
            this.id_byte = var4 == null ? -1 : var4.V();
            break;
         case ENTITY_DIED:
            this.id_break = var1.id_case().V();
            this.id_byte = var4 == null ? -1 : var4.V();
            this.id_throws = var3;
      }
   }

   public rZa_1(ryR_2 var1, rvr_3 var2) {
      this(var1, var2, rgN_2.id_byte);
   }

   public rZa_1() {
   }

   @Override
   public boolean id_class() {
      return this.id_class == rvr_3.ENTITY_DIED;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rvr_3.class);
      if (this.id_class == rvr_3.END_COMBAT) {
         this.id_protected = var1.id_case();
         this.id_byte = var1.readInt();
      } else if (this.id_class == rvr_3.ENTITY_DIED) {
         this.id_break = var1.id_case();
         this.id_byte = var1.readInt();
         this.id_throws = var1.id_throws();
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      if (this.id_class == rvr_3.END_COMBAT) {
         var1.id_protected(this.id_protected);
         var1.writeInt(this.id_byte);
      } else if (this.id_class == rvr_3.ENTITY_DIED) {
         var1.id_protected(this.id_break);
         var1.writeInt(this.id_byte);
         var1.id_class(this.id_throws);
      }
   }
}
